package typingsJapgolly.kendoUi.kendo.drawing

import typingsJapgolly.kendoUi.kendo.Class
import typingsJapgolly.kendoUi.kendo.geometry.Point
import typingsJapgolly.kendoUi.kendo.geometry.Transformation
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("kendo.drawing.Element")
@js.native
class Element () extends Class {
  def this(options: ElementOptions) = this()
  var options: ElementOptions = js.native
  var parent: Group = js.native
  def bbox(): typingsJapgolly.kendoUi.kendo.geometry.Rect = js.native
  def clip(): Path = js.native
  def clip(clip: Path): Unit = js.native
  def clippedBBox(): typingsJapgolly.kendoUi.kendo.geometry.Rect = js.native
  def containsPoint(point: Point): Boolean = js.native
  def opacity(): Double = js.native
  def opacity(opacity: Double): Unit = js.native
  def transform(): Transformation = js.native
  def transform(transform: Transformation): Unit = js.native
  def visible(): Boolean = js.native
  def visible(visible: Boolean): Unit = js.native
}

