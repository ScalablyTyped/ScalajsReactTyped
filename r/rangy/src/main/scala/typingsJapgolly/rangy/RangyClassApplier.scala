package typingsJapgolly.rangy

import typingsJapgolly.std.Document_
import typingsJapgolly.std.HTMLIFrameElement
import typingsJapgolly.std.Window_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RangyClassApplier extends RangyClassApplierOptions {
  var className: String = js.native
  var cssClass: String = js.native
  def applyToRange(range: RangyRange): Unit = js.native
  def applyToSelection(): Unit = js.native
  def applyToSelection(win: Window_): Unit = js.native
  def detach(): Unit = js.native
  def detach(doc: Document_): Unit = js.native
  def detach(doc: HTMLIFrameElement): Unit = js.native
  def detach(doc: Window_): Unit = js.native
  def isAppliedToRange(range: RangyRange): Boolean = js.native
  def isAppliedToSelection(): Boolean = js.native
  def isAppliedToSelection(win: Window_): Boolean = js.native
  def toggleRange(range: RangyRange): Unit = js.native
  def toggleSelection(): Unit = js.native
  def toggleSelection(win: Window_): Unit = js.native
  def undoToRange(range: RangyRange): Unit = js.native
  def undoToSelection(): Unit = js.native
  def undoToSelection(win: Window_): Unit = js.native
}

