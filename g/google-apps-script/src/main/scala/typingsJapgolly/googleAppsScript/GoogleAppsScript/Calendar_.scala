package typingsJapgolly.googleAppsScript.GoogleAppsScript

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.googleAppsScript.GoogleAppsScript.Calendar.Collection.AclCollection
import typingsJapgolly.googleAppsScript.GoogleAppsScript.Calendar.Collection.CalendarListCollection
import typingsJapgolly.googleAppsScript.GoogleAppsScript.Calendar.Collection.CalendarsCollection
import typingsJapgolly.googleAppsScript.GoogleAppsScript.Calendar.Collection.ChannelsCollection
import typingsJapgolly.googleAppsScript.GoogleAppsScript.Calendar.Collection.ColorsCollection
import typingsJapgolly.googleAppsScript.GoogleAppsScript.Calendar.Collection.EventsCollection
import typingsJapgolly.googleAppsScript.GoogleAppsScript.Calendar.Collection.FreebusyCollection
import typingsJapgolly.googleAppsScript.GoogleAppsScript.Calendar.Collection.SettingsCollection
import typingsJapgolly.googleAppsScript.GoogleAppsScript.Calendar.Schema.AclRule
import typingsJapgolly.googleAppsScript.GoogleAppsScript.Calendar.Schema.AclRuleScope
import typingsJapgolly.googleAppsScript.GoogleAppsScript.Calendar.Schema.CalendarListEntry
import typingsJapgolly.googleAppsScript.GoogleAppsScript.Calendar.Schema.CalendarListEntryNotificationSettings
import typingsJapgolly.googleAppsScript.GoogleAppsScript.Calendar.Schema.CalendarNotification
import typingsJapgolly.googleAppsScript.GoogleAppsScript.Calendar.Schema.Channel
import typingsJapgolly.googleAppsScript.GoogleAppsScript.Calendar.Schema.ConferenceData
import typingsJapgolly.googleAppsScript.GoogleAppsScript.Calendar.Schema.ConferenceParameters
import typingsJapgolly.googleAppsScript.GoogleAppsScript.Calendar.Schema.ConferenceParametersAddOnParameters
import typingsJapgolly.googleAppsScript.GoogleAppsScript.Calendar.Schema.ConferenceProperties
import typingsJapgolly.googleAppsScript.GoogleAppsScript.Calendar.Schema.ConferenceRequestStatus
import typingsJapgolly.googleAppsScript.GoogleAppsScript.Calendar.Schema.ConferenceSolution
import typingsJapgolly.googleAppsScript.GoogleAppsScript.Calendar.Schema.ConferenceSolutionKey
import typingsJapgolly.googleAppsScript.GoogleAppsScript.Calendar.Schema.CreateConferenceRequest
import typingsJapgolly.googleAppsScript.GoogleAppsScript.Calendar.Schema.EntryPoint
import typingsJapgolly.googleAppsScript.GoogleAppsScript.Calendar.Schema.Event
import typingsJapgolly.googleAppsScript.GoogleAppsScript.Calendar.Schema.EventAttachment
import typingsJapgolly.googleAppsScript.GoogleAppsScript.Calendar.Schema.EventAttendee
import typingsJapgolly.googleAppsScript.GoogleAppsScript.Calendar.Schema.EventCreator
import typingsJapgolly.googleAppsScript.GoogleAppsScript.Calendar.Schema.EventDateTime
import typingsJapgolly.googleAppsScript.GoogleAppsScript.Calendar.Schema.EventExtendedProperties
import typingsJapgolly.googleAppsScript.GoogleAppsScript.Calendar.Schema.EventGadget
import typingsJapgolly.googleAppsScript.GoogleAppsScript.Calendar.Schema.EventOrganizer
import typingsJapgolly.googleAppsScript.GoogleAppsScript.Calendar.Schema.EventReminder
import typingsJapgolly.googleAppsScript.GoogleAppsScript.Calendar.Schema.EventReminders
import typingsJapgolly.googleAppsScript.GoogleAppsScript.Calendar.Schema.EventSource
import typingsJapgolly.googleAppsScript.GoogleAppsScript.Calendar.Schema.FreeBusyRequest
import typingsJapgolly.googleAppsScript.GoogleAppsScript.Calendar.Schema.FreeBusyRequestItem
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Calendar_ extends js.Object {
  var Acl: js.UndefOr[AclCollection] = js.undefined
  var CalendarList: js.UndefOr[CalendarListCollection] = js.undefined
  var Calendars: js.UndefOr[CalendarsCollection] = js.undefined
  var Channels: js.UndefOr[ChannelsCollection] = js.undefined
  var Colors: js.UndefOr[ColorsCollection] = js.undefined
  var Events: js.UndefOr[EventsCollection] = js.undefined
  var Freebusy: js.UndefOr[FreebusyCollection] = js.undefined
  var Settings: js.UndefOr[SettingsCollection] = js.undefined
  // Create a new instance of AclRule
  def newAclRule(): AclRule
  // Create a new instance of AclRuleScope
  def newAclRuleScope(): AclRuleScope
  // Create a new instance of Calendar
  def newCalendar(): typingsJapgolly.googleAppsScript.GoogleAppsScript.Calendar.Schema.Calendar
  // Create a new instance of CalendarListEntry
  def newCalendarListEntry(): CalendarListEntry
  // Create a new instance of CalendarListEntryNotificationSettings
  def newCalendarListEntryNotificationSettings(): CalendarListEntryNotificationSettings
  // Create a new instance of CalendarNotification
  def newCalendarNotification(): CalendarNotification
  // Create a new instance of Channel
  def newChannel(): Channel
  // Create a new instance of ConferenceData
  def newConferenceData(): ConferenceData
  // Create a new instance of ConferenceParameters
  def newConferenceParameters(): ConferenceParameters
  // Create a new instance of ConferenceParametersAddOnParameters
  def newConferenceParametersAddOnParameters(): ConferenceParametersAddOnParameters
  // Create a new instance of ConferenceProperties
  def newConferenceProperties(): ConferenceProperties
  // Create a new instance of ConferenceRequestStatus
  def newConferenceRequestStatus(): ConferenceRequestStatus
  // Create a new instance of ConferenceSolution
  def newConferenceSolution(): ConferenceSolution
  // Create a new instance of ConferenceSolutionKey
  def newConferenceSolutionKey(): ConferenceSolutionKey
  // Create a new instance of CreateConferenceRequest
  def newCreateConferenceRequest(): CreateConferenceRequest
  // Create a new instance of EntryPoint
  def newEntryPoint(): EntryPoint
  // Create a new instance of Event
  def newEvent(): Event
  // Create a new instance of EventAttachment
  def newEventAttachment(): EventAttachment
  // Create a new instance of EventAttendee
  def newEventAttendee(): EventAttendee
  // Create a new instance of EventCreator
  def newEventCreator(): EventCreator
  // Create a new instance of EventDateTime
  def newEventDateTime(): EventDateTime
  // Create a new instance of EventExtendedProperties
  def newEventExtendedProperties(): EventExtendedProperties
  // Create a new instance of EventGadget
  def newEventGadget(): EventGadget
  // Create a new instance of EventOrganizer
  def newEventOrganizer(): EventOrganizer
  // Create a new instance of EventReminder
  def newEventReminder(): EventReminder
  // Create a new instance of EventReminders
  def newEventReminders(): EventReminders
  // Create a new instance of EventSource
  def newEventSource(): EventSource
  // Create a new instance of FreeBusyRequest
  def newFreeBusyRequest(): FreeBusyRequest
  // Create a new instance of FreeBusyRequestItem
  def newFreeBusyRequestItem(): FreeBusyRequestItem
}

object Calendar_ {
  @scala.inline
  def apply(
    newAclRule: CallbackTo[AclRule],
    newAclRuleScope: CallbackTo[AclRuleScope],
    newCalendar: CallbackTo[typingsJapgolly.googleAppsScript.GoogleAppsScript.Calendar.Schema.Calendar],
    newCalendarListEntry: CallbackTo[CalendarListEntry],
    newCalendarListEntryNotificationSettings: CallbackTo[CalendarListEntryNotificationSettings],
    newCalendarNotification: CallbackTo[CalendarNotification],
    newChannel: CallbackTo[Channel],
    newConferenceData: CallbackTo[ConferenceData],
    newConferenceParameters: CallbackTo[ConferenceParameters],
    newConferenceParametersAddOnParameters: CallbackTo[ConferenceParametersAddOnParameters],
    newConferenceProperties: CallbackTo[ConferenceProperties],
    newConferenceRequestStatus: CallbackTo[ConferenceRequestStatus],
    newConferenceSolution: CallbackTo[ConferenceSolution],
    newConferenceSolutionKey: CallbackTo[ConferenceSolutionKey],
    newCreateConferenceRequest: CallbackTo[CreateConferenceRequest],
    newEntryPoint: CallbackTo[EntryPoint],
    newEvent: CallbackTo[Event],
    newEventAttachment: CallbackTo[EventAttachment],
    newEventAttendee: CallbackTo[EventAttendee],
    newEventCreator: CallbackTo[EventCreator],
    newEventDateTime: CallbackTo[EventDateTime],
    newEventExtendedProperties: CallbackTo[EventExtendedProperties],
    newEventGadget: CallbackTo[EventGadget],
    newEventOrganizer: CallbackTo[EventOrganizer],
    newEventReminder: CallbackTo[EventReminder],
    newEventReminders: CallbackTo[EventReminders],
    newEventSource: CallbackTo[EventSource],
    newFreeBusyRequest: CallbackTo[FreeBusyRequest],
    newFreeBusyRequestItem: CallbackTo[FreeBusyRequestItem],
    Acl: AclCollection = null,
    CalendarList: CalendarListCollection = null,
    Calendars: CalendarsCollection = null,
    Channels: ChannelsCollection = null,
    Colors: ColorsCollection = null,
    Events: EventsCollection = null,
    Freebusy: FreebusyCollection = null,
    Settings: SettingsCollection = null
  ): Calendar_ = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("newAclRule")(newAclRule.toJsFn)
    __obj.updateDynamic("newAclRuleScope")(newAclRuleScope.toJsFn)
    __obj.updateDynamic("newCalendar")(newCalendar.toJsFn)
    __obj.updateDynamic("newCalendarListEntry")(newCalendarListEntry.toJsFn)
    __obj.updateDynamic("newCalendarListEntryNotificationSettings")(newCalendarListEntryNotificationSettings.toJsFn)
    __obj.updateDynamic("newCalendarNotification")(newCalendarNotification.toJsFn)
    __obj.updateDynamic("newChannel")(newChannel.toJsFn)
    __obj.updateDynamic("newConferenceData")(newConferenceData.toJsFn)
    __obj.updateDynamic("newConferenceParameters")(newConferenceParameters.toJsFn)
    __obj.updateDynamic("newConferenceParametersAddOnParameters")(newConferenceParametersAddOnParameters.toJsFn)
    __obj.updateDynamic("newConferenceProperties")(newConferenceProperties.toJsFn)
    __obj.updateDynamic("newConferenceRequestStatus")(newConferenceRequestStatus.toJsFn)
    __obj.updateDynamic("newConferenceSolution")(newConferenceSolution.toJsFn)
    __obj.updateDynamic("newConferenceSolutionKey")(newConferenceSolutionKey.toJsFn)
    __obj.updateDynamic("newCreateConferenceRequest")(newCreateConferenceRequest.toJsFn)
    __obj.updateDynamic("newEntryPoint")(newEntryPoint.toJsFn)
    __obj.updateDynamic("newEvent")(newEvent.toJsFn)
    __obj.updateDynamic("newEventAttachment")(newEventAttachment.toJsFn)
    __obj.updateDynamic("newEventAttendee")(newEventAttendee.toJsFn)
    __obj.updateDynamic("newEventCreator")(newEventCreator.toJsFn)
    __obj.updateDynamic("newEventDateTime")(newEventDateTime.toJsFn)
    __obj.updateDynamic("newEventExtendedProperties")(newEventExtendedProperties.toJsFn)
    __obj.updateDynamic("newEventGadget")(newEventGadget.toJsFn)
    __obj.updateDynamic("newEventOrganizer")(newEventOrganizer.toJsFn)
    __obj.updateDynamic("newEventReminder")(newEventReminder.toJsFn)
    __obj.updateDynamic("newEventReminders")(newEventReminders.toJsFn)
    __obj.updateDynamic("newEventSource")(newEventSource.toJsFn)
    __obj.updateDynamic("newFreeBusyRequest")(newFreeBusyRequest.toJsFn)
    __obj.updateDynamic("newFreeBusyRequestItem")(newFreeBusyRequestItem.toJsFn)
    if (Acl != null) __obj.updateDynamic("Acl")(Acl.asInstanceOf[js.Any])
    if (CalendarList != null) __obj.updateDynamic("CalendarList")(CalendarList.asInstanceOf[js.Any])
    if (Calendars != null) __obj.updateDynamic("Calendars")(Calendars.asInstanceOf[js.Any])
    if (Channels != null) __obj.updateDynamic("Channels")(Channels.asInstanceOf[js.Any])
    if (Colors != null) __obj.updateDynamic("Colors")(Colors.asInstanceOf[js.Any])
    if (Events != null) __obj.updateDynamic("Events")(Events.asInstanceOf[js.Any])
    if (Freebusy != null) __obj.updateDynamic("Freebusy")(Freebusy.asInstanceOf[js.Any])
    if (Settings != null) __obj.updateDynamic("Settings")(Settings.asInstanceOf[js.Any])
    __obj.asInstanceOf[Calendar_]
  }
}

