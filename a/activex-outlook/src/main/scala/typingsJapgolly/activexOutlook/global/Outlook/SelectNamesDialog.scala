package typingsJapgolly.activexOutlook.global.Outlook

import typingsJapgolly.activexOutlook.Outlook.OlDefaultSelectNamesDisplayMode
import typingsJapgolly.activexOutlook.Outlook.OlObjectClass
import typingsJapgolly.activexOutlook.Outlook.OlRecipientSelectors
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("Outlook.SelectNamesDialog")
@js.native
/* private */ open class SelectNamesDialog ()
  extends StObject
     with typingsJapgolly.activexOutlook.Outlook.SelectNamesDialog {
  
  /* CompleteClass */
  var AllowMultipleSelection: Boolean = js.native
  
  /* CompleteClass */
  override val Application: typingsJapgolly.activexOutlook.Outlook.Application = js.native
  
  /* CompleteClass */
  var BccLabel: String = js.native
  
  /* CompleteClass */
  var Caption: String = js.native
  
  /* CompleteClass */
  var CcLabel: String = js.native
  
  /* CompleteClass */
  override val Class: OlObjectClass = js.native
  
  /* CompleteClass */
  override def Display(): Boolean = js.native
  
  /* CompleteClass */
  var ForceResolution: Boolean = js.native
  
  /* CompleteClass */
  var InitialAddressList: typingsJapgolly.activexOutlook.Outlook.AddressList = js.native
  
  /* CompleteClass */
  var NumberOfRecipientSelectors: OlRecipientSelectors = js.native
  
  /* private */ /* CompleteClass */
  @JSName("Outlook.SelectNamesDialog_typekey")
  var OutlookDotSelectNamesDialog_typekey: typingsJapgolly.activexOutlook.Outlook.SelectNamesDialog = js.native
  
  /* CompleteClass */
  override val Parent: Any = js.native
  
  /* CompleteClass */
  var Recipients: typingsJapgolly.activexOutlook.Outlook.Recipients = js.native
  
  /* CompleteClass */
  override val Session: typingsJapgolly.activexOutlook.Outlook.NameSpace = js.native
  
  /* CompleteClass */
  override def SetDefaultDisplayMode(defaultMode: OlDefaultSelectNamesDisplayMode): Unit = js.native
  
  /* CompleteClass */
  var ShowOnlyInitialAddressList: Boolean = js.native
  
  /* CompleteClass */
  var ToLabel: String = js.native
}
