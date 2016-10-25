@Inject
private Calendar calendar;

public void generateEvent(String caption, String description, Date start, Date end, boolean isAllDay, String stylename) {
    ListCalendarEventProvider listCalendarEventProvider = new ListCalendarEventProvider();
    calendar.setEventProvider(listCalendarEventProvider);
    SimpleCalendarEvent calendarEvent = new SimpleCalendarEvent();
    calendarEvent.setCaption(caption);
    calendarEvent.setDescription(description);
    calendarEvent.setStart(start);
    calendarEvent.setEnd(end);
    calendarEvent.setAllDay(isAllDay);
    calendarEvent.setStyleName(stylename);
    listCalendarEventProvider.addEvent(calendarEvent);
}