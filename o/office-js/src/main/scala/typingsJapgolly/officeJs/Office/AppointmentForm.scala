package typingsJapgolly.officeJs.Office

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The `AppointmentForm` object is used to access the currently selected appointment.
  *
  * @remarks
  * 
  * **{@link https://docs.microsoft.com/office/dev/add-ins/outlook/understanding-outlook-add-in-permissions | Minimum permission level}**: `Restricted`
  * 
  * **{@link https://docs.microsoft.com/office/dev/add-ins/outlook/outlook-add-ins-overview#extension-points | Applicable Outlook mode}**: Compose or Read
  */
trait AppointmentForm extends js.Object {
  /**
    * Gets an object that provides methods for manipulating the body of an item.
    *
    * [Api set: Mailbox 1.1]
    *
    * @remarks
    *
    * **{@link https://docs.microsoft.com/office/dev/add-ins/outlook/understanding-outlook-add-in-permissions | Minimum permission level}**: `ReadItem`
    * 
    * **{@link https://docs.microsoft.com/office/dev/add-ins/outlook/outlook-add-ins-overview#extension-points | Applicable Outlook mode}**: Compose or Read
    */
  var body: Body | String
  /**
    * Gets or sets the date and time that the appointment is to end.
    *
    * The `end` property is expressed as a Coordinated Universal Time (UTC) date and time value. You can use the `convertToLocalClientTime` method to 
    * convert the `end` property value to the client's local date and time.
    *
    * *Read mode*
    *
    * The `end` property returns a `Date` object.
    *
    * *Compose mode*
    *
    * The `end` property returns a `Time` object.
    *
    * When you use the `Time.setAsync` method to set the end time, you should use the `convertToUtcClientTime` method to convert the local time on 
    * the client to UTC for the server.
    *
    * @remarks
    *
    * **{@link https://docs.microsoft.com/office/dev/add-ins/outlook/understanding-outlook-add-in-permissions | Minimum permission level}**: `ReadItem`
    * 
    * **{@link https://docs.microsoft.com/office/dev/add-ins/outlook/outlook-add-ins-overview#extension-points | Applicable Outlook mode}**: Compose or Read
    */
  var end: Time | js.Date
  /**
    * Gets or sets the location of an appointment.
    *
    * *Read mode*
    *
    * The `location` property returns a string that contains the location of the appointment.
    *
    * *Compose mode*
    *
    * The `location` property returns a `Location` object that provides methods that are used to get and set the location of the appointment.
    *
    * @remarks
    *
    * **{@link https://docs.microsoft.com/office/dev/add-ins/outlook/understanding-outlook-add-in-permissions | Minimum permission level}**: `ReadItem`
    * 
    * **{@link https://docs.microsoft.com/office/dev/add-ins/outlook/outlook-add-ins-overview#extension-points | Applicable Outlook mode}**: Compose or Read
    */
  var location: Location | String
  /**
    * Provides access to the optional attendees of an event. The type of object and level of access depends on the mode of the current item.
    *
    * *Read mode*
    *
    * The `optionalAttendees` property returns an array that contains an `EmailAddressDetails` object for each optional attendee to the meeting.
    * By default, the collection is limited to a maximum of 100 members. However, on Windows and Mac, you can get 500 members maximum.
    *
    * *Compose mode*
    *
    * The `optionalAttendees` property returns a `Recipients` object that provides methods to get or update the optional attendees for a meeting.
    * By default, the collection is limited to a maximum of 100 members. However, on Windows and Mac, the following limits apply.
    * 
    * - Get 500 members maximum.
    *
    * - Set a maximum of 100 members per call, up to 500 members total.
    *
    * @remarks
    *
    * **{@link https://docs.microsoft.com/office/dev/add-ins/outlook/understanding-outlook-add-in-permissions | Minimum permission level}**: `ReadItem`
    * 
    * **{@link https://docs.microsoft.com/office/dev/add-ins/outlook/outlook-add-ins-overview#extension-points | Applicable Outlook mode}**: Compose or Read
    */
  var optionalAttendees: js.Array[EmailAddressDetails | Recipients]
  /**
    * Provides access to the required attendees of an event. The type of object and level of access depends on the mode of the current item.
    *
    * *Read mode*
    *
    * The `requiredAttendees` property returns an array that contains an `EmailAddressDetails` object for each required attendee to the meeting.
    * By default, the collection is limited to a maximum of 100 members. However, on Windows and Mac, you can get 500 members maximum.
    *
    * *Compose mode*
    *
    * The `requiredAttendees` property returns a `Recipients` object that provides methods to get or update the required attendees for a meeting.
    * By default, the collection is limited to a maximum of 100 members. However, on Windows and Mac, the following limits apply.
    *
    * - Get 500 members maximum.
    *
    * - Set a maximum of 100 members per call, up to 500 members total.
    *
    * @remarks
    *
    * **{@link https://docs.microsoft.com/office/dev/add-ins/outlook/understanding-outlook-add-in-permissions | Minimum permission level}**: `ReadItem`
    * 
    * **{@link https://docs.microsoft.com/office/dev/add-ins/outlook/outlook-add-ins-overview#extension-points | Applicable Outlook mode}**: Compose or Read
    */
  var requiredAttendees: js.Array[EmailAddressDetails | Recipients]
  /**
    * Provides access to the resources of an event. Returns an array of strings containing the resources required for the appointment.
    *
    * @remarks
    *
    * **{@link https://docs.microsoft.com/office/dev/add-ins/outlook/understanding-outlook-add-in-permissions | Minimum permission level}**: `ReadItem`
    * 
    * **{@link https://docs.microsoft.com/office/dev/add-ins/outlook/outlook-add-ins-overview#extension-points | Applicable Outlook mode}**: Compose or Read
    */
  var resources: js.Array[String]
  /**
    * Gets or sets the date and time that the appointment is to begin.
    *
    * The `start` property is expressed as a Coordinated Universal Time (UTC) date and time value. You can use the `convertToLocalClientTime` method 
    * to convert the value to the client's local date and time.
    *
    * *Read mode*
    *
    * The `start` property returns a `Date` object.
    *
    * *Compose mode*
    *
    * The `start` property returns a `Time` object.
    *
    * When you use the `Time.setAsync` method to set the start time, you should use the `convertToUtcClientTime` method to convert the local time on 
    * the client to UTC for the server.
    *
    * @remarks
    *
    * **{@link https://docs.microsoft.com/office/dev/add-ins/outlook/understanding-outlook-add-in-permissions | Minimum permission level}**: `ReadItem`
    * 
    * **{@link https://docs.microsoft.com/office/dev/add-ins/outlook/outlook-add-ins-overview#extension-points | Applicable Outlook mode}**: Compose or Read
    */
  var start: Time | js.Date
  /**
    * Gets or sets the description that appears in the subject field of an item.
    *
    * The `subject` property gets or sets the entire subject of the item, as sent by the email server.
    *
    * *Read mode*
    *
    * The `subject` property returns a string. Use the `normalizedSubject` property to get the subject minus any leading prefixes such as RE: and FW:.
    *
    * *Compose mode*
    *
    * The `subject` property returns a `Subject` object that provides methods to get and set the subject.
    *
    * @remarks
    *
    * **{@link https://docs.microsoft.com/office/dev/add-ins/outlook/understanding-outlook-add-in-permissions | Minimum permission level}**: `ReadItem`
    * 
    * **{@link https://docs.microsoft.com/office/dev/add-ins/outlook/outlook-add-ins-overview#extension-points | Applicable Outlook mode}**: Compose or Read
    */
  var subject: Subject | String
}

object AppointmentForm {
  @scala.inline
  def apply(
    body: Body | String,
    end: Time | js.Date,
    location: Location | String,
    optionalAttendees: js.Array[EmailAddressDetails | Recipients],
    requiredAttendees: js.Array[EmailAddressDetails | Recipients],
    resources: js.Array[String],
    start: Time | js.Date,
    subject: Subject | String
  ): AppointmentForm = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], end = end.asInstanceOf[js.Any], location = location.asInstanceOf[js.Any], optionalAttendees = optionalAttendees.asInstanceOf[js.Any], requiredAttendees = requiredAttendees.asInstanceOf[js.Any], resources = resources.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any], subject = subject.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AppointmentForm]
  }
}

