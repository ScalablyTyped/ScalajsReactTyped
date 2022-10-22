package typingsJapgolly.activexOffice.global.Office

import typingsJapgolly.activexOffice.Office.CommandBars
import typingsJapgolly.activexOutlook.Outlook.MailItem
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("Office.MsoEnvelope")
@js.native
/* private */ open class MsoEnvelope ()
  extends StObject
     with typingsJapgolly.activexOffice.Office.MsoEnvelope {
  
  /* CompleteClass */
  override def CommandBars(Index: String): typingsJapgolly.activexOffice.Office.CommandBar = js.native
  /* CompleteClass */
  override def CommandBars(Index: Double): typingsJapgolly.activexOffice.Office.CommandBar = js.native
  /* CompleteClass */
  @JSName("CommandBars")
  override val CommandBars_Original: CommandBars = js.native
  
  /* CompleteClass */
  var Introduction: String = js.native
  
  /* CompleteClass */
  override val Item: MailItem = js.native
  
  /* private */ /* CompleteClass */
  @JSName("Office.MsoEnvelope_typekey")
  var OfficeDotMsoEnvelope_typekey: typingsJapgolly.activexOffice.Office.MsoEnvelope = js.native
  
  /* CompleteClass */
  override val Parent: Any = js.native
}
