package typingsJapgolly.activexOutlook.Outlook

import typingsJapgolly.activexStdole.stdole.OLE_COLOR
import typingsJapgolly.activexStdole.stdole.StdFont
import typingsJapgolly.activexStdole.stdole.StdPicture
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Outlook.OlkListBox")
@js.native
class OlkListBox protected () extends js.Object {
  var BackColor: OLE_COLOR = js.native
  var BorderStyle: OlBorderStyle = js.native
  var Enabled: Boolean = js.native
  val Font: StdFont = js.native
  var ForeColor: OLE_COLOR = js.native
  val ListCount: Double = js.native
  var ListIndex: Double = js.native
  var Locked: Boolean = js.native
  var MatchEntry: OlMatchEntry = js.native
  var MouseIcon: StdPicture = js.native
  var MousePointer: OlMousePointer = js.native
  var MultiSelect: OlMultiSelect = js.native
  @JSName("Outlook.OlkListBox_typekey")
  var OutlookDotOlkListBox_typekey: OlkListBox = js.native
  var Text: String = js.native
  var TextAlign: OlTextAlign = js.native
  var TopIndex: Double = js.native
  var Value: js.Any = js.native
  def AddItem(ItemText: String): Unit = js.native
  def AddItem(ItemText: String, Index: js.Any): Unit = js.native
  def Clear(): Unit = js.native
  def Copy(): Unit = js.native
  def GetItem(Index: Double): String = js.native
  def GetSelected(Index: Double): Boolean = js.native
  def RemoveItem(Index: Double): Unit = js.native
  def SetItem(Index: Double, Item: String): Unit = js.native
  def SetSelected(Index: Double, Selected: Boolean): Unit = js.native
}

