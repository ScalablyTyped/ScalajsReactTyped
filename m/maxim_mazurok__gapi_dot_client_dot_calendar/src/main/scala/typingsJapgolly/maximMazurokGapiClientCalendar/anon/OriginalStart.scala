package typingsJapgolly.maximMazurokGapiClientCalendar.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OriginalStart extends StObject {
  
  /** Data format for the response. */
  var alt: js.UndefOr[String] = js.undefined
  
  /**
    * Deprecated and ignored. A value will always be returned in the email field for the organizer, creator and attendees, even if no real email address is available (i.e. a
    * generated, non-working value will be provided).
    */
  var alwaysIncludeEmail: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Calendar identifier. To retrieve calendar IDs call the calendarList.list method. If you want to access the primary calendar of the currently logged in user, use the "primary"
    * keyword.
    */
  var calendarId: String
  
  /** Recurring event identifier. */
  var eventId: String
  
  /** Selector specifying which fields to include in a partial response. */
  var fields: js.UndefOr[String] = js.undefined
  
  /** API key. Your API key identifies your project and provides you with API access, quota, and reports. Required unless you provide an OAuth 2.0 token. */
  var key: js.UndefOr[String] = js.undefined
  
  /** The maximum number of attendees to include in the response. If there are more than the specified number of attendees, only the participant is returned. Optional. */
  var maxAttendees: js.UndefOr[Double] = js.undefined
  
  /** Maximum number of events returned on one result page. By default the value is 250 events. The page size can never be larger than 2500 events. Optional. */
  var maxResults: js.UndefOr[Double] = js.undefined
  
  /** OAuth 2.0 token for the current user. */
  var oauth_token: js.UndefOr[String] = js.undefined
  
  /** The original start time of the instance in the result. Optional. */
  var originalStart: js.UndefOr[String] = js.undefined
  
  /** Token specifying which result page to return. Optional. */
  var pageToken: js.UndefOr[String] = js.undefined
  
  /** Returns response with indentations and line breaks. */
  var prettyPrint: js.UndefOr[Boolean] = js.undefined
  
  /** An opaque string that represents a user for quota purposes. Must not exceed 40 characters. */
  var quotaUser: js.UndefOr[String] = js.undefined
  
  /**
    * Whether to include deleted events (with status equals "cancelled") in the result. Cancelled instances of recurring events will still be included if singleEvents is False.
    * Optional. The default is False.
    */
  var showDeleted: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Upper bound (exclusive) for an event's start time to filter by. Optional. The default is not to filter by start time. Must be an RFC3339 timestamp with mandatory time zone
    * offset.
    */
  var timeMax: js.UndefOr[String] = js.undefined
  
  /** Lower bound (inclusive) for an event's end time to filter by. Optional. The default is not to filter by end time. Must be an RFC3339 timestamp with mandatory time zone offset. */
  var timeMin: js.UndefOr[String] = js.undefined
  
  /** Time zone used in the response. Optional. The default is the time zone of the calendar. */
  var timeZone: js.UndefOr[String] = js.undefined
  
  /** Deprecated. Please use quotaUser instead. */
  var userIp: js.UndefOr[String] = js.undefined
}
object OriginalStart {
  
  inline def apply(calendarId: String, eventId: String): OriginalStart = {
    val __obj = js.Dynamic.literal(calendarId = calendarId.asInstanceOf[js.Any], eventId = eventId.asInstanceOf[js.Any])
    __obj.asInstanceOf[OriginalStart]
  }
  
  extension [Self <: OriginalStart](x: Self) {
    
    inline def setAlt(value: String): Self = StObject.set(x, "alt", value.asInstanceOf[js.Any])
    
    inline def setAltUndefined: Self = StObject.set(x, "alt", js.undefined)
    
    inline def setAlwaysIncludeEmail(value: Boolean): Self = StObject.set(x, "alwaysIncludeEmail", value.asInstanceOf[js.Any])
    
    inline def setAlwaysIncludeEmailUndefined: Self = StObject.set(x, "alwaysIncludeEmail", js.undefined)
    
    inline def setCalendarId(value: String): Self = StObject.set(x, "calendarId", value.asInstanceOf[js.Any])
    
    inline def setEventId(value: String): Self = StObject.set(x, "eventId", value.asInstanceOf[js.Any])
    
    inline def setFields(value: String): Self = StObject.set(x, "fields", value.asInstanceOf[js.Any])
    
    inline def setFieldsUndefined: Self = StObject.set(x, "fields", js.undefined)
    
    inline def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
    
    inline def setKeyUndefined: Self = StObject.set(x, "key", js.undefined)
    
    inline def setMaxAttendees(value: Double): Self = StObject.set(x, "maxAttendees", value.asInstanceOf[js.Any])
    
    inline def setMaxAttendeesUndefined: Self = StObject.set(x, "maxAttendees", js.undefined)
    
    inline def setMaxResults(value: Double): Self = StObject.set(x, "maxResults", value.asInstanceOf[js.Any])
    
    inline def setMaxResultsUndefined: Self = StObject.set(x, "maxResults", js.undefined)
    
    inline def setOauth_token(value: String): Self = StObject.set(x, "oauth_token", value.asInstanceOf[js.Any])
    
    inline def setOauth_tokenUndefined: Self = StObject.set(x, "oauth_token", js.undefined)
    
    inline def setOriginalStart(value: String): Self = StObject.set(x, "originalStart", value.asInstanceOf[js.Any])
    
    inline def setOriginalStartUndefined: Self = StObject.set(x, "originalStart", js.undefined)
    
    inline def setPageToken(value: String): Self = StObject.set(x, "pageToken", value.asInstanceOf[js.Any])
    
    inline def setPageTokenUndefined: Self = StObject.set(x, "pageToken", js.undefined)
    
    inline def setPrettyPrint(value: Boolean): Self = StObject.set(x, "prettyPrint", value.asInstanceOf[js.Any])
    
    inline def setPrettyPrintUndefined: Self = StObject.set(x, "prettyPrint", js.undefined)
    
    inline def setQuotaUser(value: String): Self = StObject.set(x, "quotaUser", value.asInstanceOf[js.Any])
    
    inline def setQuotaUserUndefined: Self = StObject.set(x, "quotaUser", js.undefined)
    
    inline def setShowDeleted(value: Boolean): Self = StObject.set(x, "showDeleted", value.asInstanceOf[js.Any])
    
    inline def setShowDeletedUndefined: Self = StObject.set(x, "showDeleted", js.undefined)
    
    inline def setTimeMax(value: String): Self = StObject.set(x, "timeMax", value.asInstanceOf[js.Any])
    
    inline def setTimeMaxUndefined: Self = StObject.set(x, "timeMax", js.undefined)
    
    inline def setTimeMin(value: String): Self = StObject.set(x, "timeMin", value.asInstanceOf[js.Any])
    
    inline def setTimeMinUndefined: Self = StObject.set(x, "timeMin", js.undefined)
    
    inline def setTimeZone(value: String): Self = StObject.set(x, "timeZone", value.asInstanceOf[js.Any])
    
    inline def setTimeZoneUndefined: Self = StObject.set(x, "timeZone", js.undefined)
    
    inline def setUserIp(value: String): Self = StObject.set(x, "userIp", value.asInstanceOf[js.Any])
    
    inline def setUserIpUndefined: Self = StObject.set(x, "userIp", js.undefined)
  }
}
