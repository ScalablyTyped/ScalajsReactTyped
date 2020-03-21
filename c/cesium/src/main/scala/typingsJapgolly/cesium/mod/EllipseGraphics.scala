package typingsJapgolly.cesium.mod

import typingsJapgolly.cesium.AnonOutline
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("cesium", "EllipseGraphics")
@js.native
class EllipseGraphics () extends js.Object {
  def this(options: AnonOutline) = this()
  var definitionChanged: Event[js.Array[_]] = js.native
  var extrudedHeight: Property = js.native
  var fill: Boolean = js.native
  var granularity: Property = js.native
  var height: Property = js.native
  var material: MaterialProperty | Color = js.native
  var numberOfVerticalLines: Property = js.native
  var outline: Boolean = js.native
  var outlineColor: Color = js.native
  var outlineWidth: Double = js.native
  var rotation: Property = js.native
  var semiMajorAxis: Property = js.native
  var semiMinorAxis: Property = js.native
  var show: Property = js.native
  var stRotation: Property = js.native
  def clone(result: EllipseGraphics): EllipseGraphics = js.native
  def merge(source: EllipseGraphics): EllipseGraphics = js.native
}

