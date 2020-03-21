package typingsJapgolly.rangy

import org.scalajs.dom.raw.Range
import org.scalajs.dom.raw.Selection
import typingsJapgolly.std.Document_
import typingsJapgolly.std.HTMLIFrameElement
import typingsJapgolly.std.Window_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RangyStatic extends js.Object {
  var initialized: Boolean = js.native
  var supported: Boolean = js.native
  def addInitListener(listener: js.Function1[/* rangy */ this.type, Unit]): js.Any = js.native
  def createClassApplier(theClass: String): RangyClassApplier = js.native
  def createClassApplier(theClass: String, options: RangyClassApplierOptions): RangyClassApplier = js.native
  def createClassApplier(theClass: String, options: RangyClassApplierOptions, tagNames: String): RangyClassApplier = js.native
  def createClassApplier(theClass: String, options: RangyClassApplierOptions, tagNames: js.Array[String]): RangyClassApplier = js.native
  def createMissingNativeApi(): js.Any = js.native
  def createNativeRange(): Range = js.native
  def createNativeRange(doc: Document_): Range = js.native
  def createNativeRange(doc: HTMLIFrameElement): Range = js.native
  def createNativeRange(doc: Window_): Range = js.native
  def createRange(): RangyRange = js.native
  def createRange(doc: Document_): RangyRange = js.native
  def createRange(doc: HTMLIFrameElement): RangyRange = js.native
  def createRange(doc: Window_): RangyRange = js.native
  def createRangyRange(): RangyRange = js.native
  def createRangyRange(doc: Document_): RangyRange = js.native
  def createRangyRange(doc: HTMLIFrameElement): RangyRange = js.native
  def createRangyRange(doc: Window_): RangyRange = js.native
  def getNativeSelection(): Selection = js.native
  def getNativeSelection(win: Window_): Selection = js.native
  def getSelection(): RangySelection = js.native
  def getSelection(doc: Document_): RangySelection = js.native
  def getSelection(doc: HTMLIFrameElement): RangySelection = js.native
  def getSelection(doc: Window_): RangySelection = js.native
  def shim(): js.Any = js.native
}

