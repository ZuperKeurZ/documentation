public class OrderEdit extends StandardEditor<Order> {

    @Inject
    InstanceContainer <Order> orderDc;
    @Inject
    protected EntitySnapshotService entitySnapshotService;
...
    @Subscribe
    public void onAfterCommitChanges(AfterCommitChangesEvent event) {
         entitySnapshotService.createSnapshot(orderDc.getItem(), orderDc.getView());
    }
}
