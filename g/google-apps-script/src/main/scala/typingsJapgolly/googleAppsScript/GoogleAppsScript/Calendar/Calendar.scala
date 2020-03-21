package typingsJapgolly.googleAppsScript.GoogleAppsScript.Calendar

import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.googleAppsScript.GoogleAppsScript.Base.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Represents a calendar that the user owns or is subscribed to.
  */
@js.native
trait Calendar extends js.Object {
  def createAllDayEvent(title: String, date: Date): CalendarEvent = js.native
  def createAllDayEvent(title: String, date: Date, options: StringDictionary[js.Any]): CalendarEvent = js.native
  def createAllDayEvent(title: String, startDate: Date, endDate: Date): CalendarEvent = js.native
  def createAllDayEvent(title: String, startDate: Date, endDate: Date, options: StringDictionary[js.Any]): CalendarEvent = js.native
  def createAllDayEventSeries(title: String, startDate: Date, recurrence: EventRecurrence): CalendarEventSeries = js.native
  def createAllDayEventSeries(title: String, startDate: Date, recurrence: EventRecurrence, options: StringDictionary[js.Any]): CalendarEventSeries = js.native
  def createEvent(title: String, startTime: Date, endTime: Date): CalendarEvent = js.native
  def createEvent(title: String, startTime: Date, endTime: Date, options: StringDictionary[js.Any]): CalendarEvent = js.native
  def createEventFromDescription(description: String): CalendarEvent = js.native
  def createEventSeries(title: String, startTime: Date, endTime: Date, recurrence: EventRecurrence): CalendarEventSeries = js.native
  def createEventSeries(
    title: String,
    startTime: Date,
    endTime: Date,
    recurrence: EventRecurrence,
    options: StringDictionary[js.Any]
  ): CalendarEventSeries = js.native
  def deleteCalendar(): Unit = js.native
  def getColor(): String = js.native
  def getDescription(): String = js.native
  def getEventById(iCalId: String): CalendarEvent = js.native
  def getEventSeriesById(iCalId: String): CalendarEventSeries = js.native
  def getEvents(startTime: Date, endTime: Date): js.Array[CalendarEvent] = js.native
  def getEvents(startTime: Date, endTime: Date, options: StringDictionary[js.Any]): js.Array[CalendarEvent] = js.native
  def getEventsForDay(date: Date): js.Array[CalendarEvent] = js.native
  def getEventsForDay(date: Date, options: StringDictionary[js.Any]): js.Array[CalendarEvent] = js.native
  def getId(): String = js.native
  def getName(): String = js.native
  def getTimeZone(): String = js.native
  def isHidden(): Boolean = js.native
  def isMyPrimaryCalendar(): Boolean = js.native
  def isOwnedByMe(): Boolean = js.native
  def isSelected(): Boolean = js.native
  def setColor(color: String): typingsJapgolly.googleAppsScript.GoogleAppsScript.Calendar.Calendar = js.native
  def setDescription(description: String): typingsJapgolly.googleAppsScript.GoogleAppsScript.Calendar.Calendar = js.native
  def setHidden(hidden: Boolean): typingsJapgolly.googleAppsScript.GoogleAppsScript.Calendar.Calendar = js.native
  def setName(name: String): typingsJapgolly.googleAppsScript.GoogleAppsScript.Calendar.Calendar = js.native
  def setSelected(selected: Boolean): typingsJapgolly.googleAppsScript.GoogleAppsScript.Calendar.Calendar = js.native
  def setTimeZone(timeZone: String): typingsJapgolly.googleAppsScript.GoogleAppsScript.Calendar.Calendar = js.native
  def unsubscribeFromCalendar(): Unit = js.native
}

