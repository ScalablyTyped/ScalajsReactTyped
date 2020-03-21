package typingsJapgolly.activexOutlook.Outlook

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Outlook.SelectNamesDialog")
@js.native
class SelectNamesDialog protected () extends js.Object {
  var AllowMultipleSelection: Boolean = js.native
  val Application: typingsJapgolly.activexOutlook.Outlook.Application = js.native
  var BccLabel: String = js.native
  var Caption: String = js.native
  var CcLabel: String = js.native
  val Class: OlObjectClass = js.native
  var ForceResolution: Boolean = js.native
  var InitialAddressList: AddressList = js.native
  var NumberOfRecipientSelectors: OlRecipientSelectors = js.native
  @JSName("Outlook.SelectNamesDialog_typekey")
  var OutlookDotSelectNamesDialog_typekey: SelectNamesDialog = js.native
  val Parent: js.Any = js.native
  var Recipients: typingsJapgolly.activexOutlook.Outlook.Recipients = js.native
  val Session: NameSpace = js.native
  var ShowOnlyInitialAddressList: Boolean = js.native
  var ToLabel: String = js.native
  def Display(): Boolean = js.native
  def SetDefaultDisplayMode(defaultMode: OlDefaultSelectNamesDisplayMode): Unit = js.native
}

