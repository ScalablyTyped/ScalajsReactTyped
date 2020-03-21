package typingsJapgolly.cesium.mod

import typingsJapgolly.cesium.AnonMaterial
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("cesium", "CylinderGraphics")
@js.native
class CylinderGraphics () extends js.Object {
  def this(options: AnonMaterial) = this()
  var bottomRadius: Property = js.native
  var definitionChanged: Event[js.Array[_]] = js.native
  var fill: Property = js.native
  var length: Property = js.native
  var material: MaterialProperty = js.native
  var numberOfVerticalLines: Property = js.native
  var outline: Property = js.native
  var outlineColor: Property = js.native
  var outlineWidth: Property = js.native
  var show: Property = js.native
  var slices: Property = js.native
  var topRadius: Property = js.native
  def clone(result: CylinderGraphics): CylinderGraphics = js.native
  def merge(source: CylinderGraphics): CylinderGraphics = js.native
}

