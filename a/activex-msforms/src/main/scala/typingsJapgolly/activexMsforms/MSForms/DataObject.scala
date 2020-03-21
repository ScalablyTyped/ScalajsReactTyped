package typingsJapgolly.activexMsforms.MSForms

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("MSForms.DataObject")
@js.native
class DataObject protected () extends js.Object {
  @JSName("MSForms.DataObject_typekey")
  var MSFormsDotDataObject_typekey: DataObject = js.native
  def Clear(): Unit = js.native
  def GetFormat(Format: js.Any): Boolean = js.native
  def GetFromClipboard(): Unit = js.native
  def GetText(): String = js.native
  def GetText(Format: js.Any): String = js.native
  def PutInClipboard(): Unit = js.native
  def SetText(Text: String): Unit = js.native
  def SetText(Text: String, Format: js.Any): Unit = js.native
  def StartDrag(): fmDropEffect = js.native
  def StartDrag(OKEffect: js.Any): fmDropEffect = js.native
}

