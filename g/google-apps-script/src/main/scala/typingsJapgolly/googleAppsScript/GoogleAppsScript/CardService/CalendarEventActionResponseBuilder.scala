package typingsJapgolly.googleAppsScript.GoogleAppsScript.CardService

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.googleAppsScript.GoogleAppsScript.ConferenceData.ConferenceData
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A builder for CalendarEventActionResponse objects.
  */
trait CalendarEventActionResponseBuilder extends StObject {
  
  def addAttachments(attachments: js.Array[Attachment]): CalendarEventActionResponseBuilder
  
  def addAttendees(emails: js.Array[String]): CalendarEventActionResponseBuilder
  
  def build(): CalendarEventActionResponse
  
  def setConferenceData(conferenceData: ConferenceData): CalendarEventActionResponseBuilder
}
object CalendarEventActionResponseBuilder {
  
  inline def apply(
    addAttachments: js.Array[Attachment] => CalendarEventActionResponseBuilder,
    addAttendees: js.Array[String] => CalendarEventActionResponseBuilder,
    build: CallbackTo[CalendarEventActionResponse],
    setConferenceData: ConferenceData => CalendarEventActionResponseBuilder
  ): CalendarEventActionResponseBuilder = {
    val __obj = js.Dynamic.literal(addAttachments = js.Any.fromFunction1(addAttachments), addAttendees = js.Any.fromFunction1(addAttendees), build = build.toJsFn, setConferenceData = js.Any.fromFunction1(setConferenceData))
    __obj.asInstanceOf[CalendarEventActionResponseBuilder]
  }
  
  extension [Self <: CalendarEventActionResponseBuilder](x: Self) {
    
    inline def setAddAttachments(value: js.Array[Attachment] => CalendarEventActionResponseBuilder): Self = StObject.set(x, "addAttachments", js.Any.fromFunction1(value))
    
    inline def setAddAttendees(value: js.Array[String] => CalendarEventActionResponseBuilder): Self = StObject.set(x, "addAttendees", js.Any.fromFunction1(value))
    
    inline def setBuild(value: CallbackTo[CalendarEventActionResponse]): Self = StObject.set(x, "build", value.toJsFn)
    
    inline def setSetConferenceData(value: ConferenceData => CalendarEventActionResponseBuilder): Self = StObject.set(x, "setConferenceData", js.Any.fromFunction1(value))
  }
}
