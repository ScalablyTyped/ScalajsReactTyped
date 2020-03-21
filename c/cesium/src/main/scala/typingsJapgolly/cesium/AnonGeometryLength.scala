package typingsJapgolly.cesium

import typingsJapgolly.cesium.mod.Geometry
import typingsJapgolly.cesium.mod.Matrix4
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonGeometryLength extends js.Object {
  var geometry: Geometry
  var length: js.UndefOr[Double] = js.undefined
  var modelMatrix: js.UndefOr[Matrix4] = js.undefined
}

object AnonGeometryLength {
  @scala.inline
  def apply(geometry: Geometry, length: Int | Double = null, modelMatrix: Matrix4 = null): AnonGeometryLength = {
    val __obj = js.Dynamic.literal(geometry = geometry.asInstanceOf[js.Any])
    if (length != null) __obj.updateDynamic("length")(length.asInstanceOf[js.Any])
    if (modelMatrix != null) __obj.updateDynamic("modelMatrix")(modelMatrix.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonGeometryLength]
  }
}

