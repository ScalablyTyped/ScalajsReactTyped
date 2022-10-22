package typingsJapgolly.activexOutlook.global.Outlook

import typingsJapgolly.activexOutlook.Outlook.OlActionCopyLike
import typingsJapgolly.activexOutlook.Outlook.OlActionReplyStyle
import typingsJapgolly.activexOutlook.Outlook.OlActionResponseStyle
import typingsJapgolly.activexOutlook.Outlook.OlActionShowOn
import typingsJapgolly.activexOutlook.Outlook.OlObjectClass
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("Outlook.Action")
@js.native
/* private */ open class Action ()
  extends StObject
     with typingsJapgolly.activexOutlook.Outlook.Action {
  
  /* CompleteClass */
  override val Application: typingsJapgolly.activexOutlook.Outlook.Application = js.native
  
  /* CompleteClass */
  override val Class: OlObjectClass = js.native
  
  /* CompleteClass */
  var CopyLike: OlActionCopyLike = js.native
  
  /* CompleteClass */
  override def Delete(): Unit = js.native
  
  /* CompleteClass */
  var Enabled: Boolean = js.native
  
  /* CompleteClass */
  override def Execute(): Any = js.native
  
  /* CompleteClass */
  var MessageClass: String = js.native
  
  /* CompleteClass */
  var Name: String = js.native
  
  /* private */ /* CompleteClass */
  @JSName("Outlook.Action_typekey")
  var OutlookDotAction_typekey: typingsJapgolly.activexOutlook.Outlook.Action = js.native
  
  /* CompleteClass */
  override val Parent: Any = js.native
  
  /* CompleteClass */
  var Prefix: String = js.native
  
  /* CompleteClass */
  var ReplyStyle: OlActionReplyStyle = js.native
  
  /* CompleteClass */
  var ResponseStyle: OlActionResponseStyle = js.native
  
  /* CompleteClass */
  override val Session: typingsJapgolly.activexOutlook.Outlook.NameSpace = js.native
  
  /* CompleteClass */
  var ShowOn: OlActionShowOn = js.native
}
