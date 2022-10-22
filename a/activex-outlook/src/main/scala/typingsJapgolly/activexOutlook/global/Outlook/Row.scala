package typingsJapgolly.activexOutlook.global.Outlook

import typingsJapgolly.activexOutlook.Outlook.OlObjectClass
import typingsJapgolly.std.VarDate
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("Outlook.Row")
@js.native
/* private */ open class Row ()
  extends StObject
     with typingsJapgolly.activexOutlook.Outlook.Row {
  
  /* CompleteClass */
  override val Application: typingsJapgolly.activexOutlook.Outlook.Application = js.native
  
  /* CompleteClass */
  override def BinaryToString(Index: Any): String = js.native
  
  /* CompleteClass */
  override val Class: OlObjectClass = js.native
  
  /* CompleteClass */
  override def GetValues(): Any = js.native
  
  /* CompleteClass */
  override def Item(Index: Any): Any = js.native
  
  /* CompleteClass */
  override def LocalTimeToUTC(Index: Any): VarDate = js.native
  
  /* private */ /* CompleteClass */
  @JSName("Outlook.Row_typekey")
  var OutlookDotRow_typekey: typingsJapgolly.activexOutlook.Outlook.Row = js.native
  
  /* CompleteClass */
  override val Parent: Any = js.native
  
  /* CompleteClass */
  override val Session: typingsJapgolly.activexOutlook.Outlook.NameSpace = js.native
  
  /* CompleteClass */
  override def UTCToLocalTime(Index: Any): VarDate = js.native
}
