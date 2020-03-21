package typingsJapgolly.activexWord.Word

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Word.Pane")
@js.native
class Pane protected () extends js.Object {
  val Application: typingsJapgolly.activexWord.Word.Application = js.native
  var BrowseToWindow: Boolean = js.native
  val BrowseWidth: Double = js.native
  val Creator: Double = js.native
  var DisplayRulers: Boolean = js.native
  var DisplayVerticalRuler: Boolean = js.native
  val Document: typingsJapgolly.activexWord.Word.Document = js.native
  val Frameset: typingsJapgolly.activexWord.Word.Frameset = js.native
  var HorizontalPercentScrolled: Double = js.native
  val Index: Double = js.native
  var MinimumFontSize: Double = js.native
  val Next: Pane = js.native
  val Pages: typingsJapgolly.activexWord.Word.Pages = js.native
  val Parent: js.Any = js.native
  val Previous: Pane = js.native
  val Selection: typingsJapgolly.activexWord.Word.Selection = js.native
  var VerticalPercentScrolled: Double = js.native
  val View: typingsJapgolly.activexWord.Word.View = js.native
  @JSName("Word.Pane_typekey")
  var WordDotPane_typekey: Pane = js.native
  val Zooms: typingsJapgolly.activexWord.Word.Zooms = js.native
  def Activate(): Unit = js.native
  def AutoScroll(Velocity: Double): Unit = js.native
  def Close(): Unit = js.native
  def LargeScroll(): Unit = js.native
  def LargeScroll(Down: js.Any): Unit = js.native
  def LargeScroll(Down: js.Any, Up: js.Any): Unit = js.native
  def LargeScroll(Down: js.Any, Up: js.Any, ToRight: js.Any): Unit = js.native
  def LargeScroll(Down: js.Any, Up: js.Any, ToRight: js.Any, ToLeft: js.Any): Unit = js.native
  def NewFrameset(): Unit = js.native
  def PageScroll(): Unit = js.native
  def PageScroll(Down: js.Any): Unit = js.native
  def PageScroll(Down: js.Any, Up: js.Any): Unit = js.native
  def SmallScroll(): Unit = js.native
  def SmallScroll(Down: js.Any): Unit = js.native
  def SmallScroll(Down: js.Any, Up: js.Any): Unit = js.native
  def SmallScroll(Down: js.Any, Up: js.Any, ToRight: js.Any): Unit = js.native
  def SmallScroll(Down: js.Any, Up: js.Any, ToRight: js.Any, ToLeft: js.Any): Unit = js.native
  def TOCInFrameset(): Unit = js.native
}

