package typingsJapgolly.activexOutlook.global.Outlook

import typingsJapgolly.activexOutlook.Outlook.OlObjectClass
import typingsJapgolly.std.VarDate
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("Outlook.TimeZones")
@js.native
/* private */ open class TimeZones ()
  extends StObject
     with typingsJapgolly.activexOutlook.Outlook.TimeZones {
  
  /* CompleteClass */
  override val Application: typingsJapgolly.activexOutlook.Outlook.Application = js.native
  
  /* CompleteClass */
  override val Class: OlObjectClass = js.native
  
  /* CompleteClass */
  override def ConvertTime(
    SourceDateTime: VarDate,
    SourceTimeZone: typingsJapgolly.activexOutlook.Outlook.TimeZone,
    DestinationTimeZone: typingsJapgolly.activexOutlook.Outlook.TimeZone
  ): VarDate = js.native
  
  /* CompleteClass */
  override val Count: Double = js.native
  
  /* CompleteClass */
  override val CurrentTimeZone: typingsJapgolly.activexOutlook.Outlook.TimeZone = js.native
  
  /* CompleteClass */
  override def Item(Index: Any): typingsJapgolly.activexOutlook.Outlook.TimeZone = js.native
  
  /* private */ /* CompleteClass */
  @JSName("Outlook.TimeZones_typekey")
  var OutlookDotTimeZones_typekey: typingsJapgolly.activexOutlook.Outlook.TimeZones = js.native
  
  /* CompleteClass */
  override val Parent: Any = js.native
  
  /* CompleteClass */
  override val Session: typingsJapgolly.activexOutlook.Outlook.NameSpace = js.native
}
