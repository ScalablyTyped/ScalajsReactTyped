package typingsJapgolly.cesium.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("cesium", "StyleExpression")
@js.native
class StyleExpression () extends js.Object {
  def evaluate(feature: Cesium3DTileFeature): Boolean | Double | String | js.RegExp | Cartesian2 | Cartesian3 | Cartesian4 | Color = js.native
  def evaluate(feature: Cesium3DTileFeature, result: js.Any): Boolean | Double | String | js.RegExp | Cartesian2 | Cartesian3 | Cartesian4 | Color = js.native
  def evaluateColor(feature: Cesium3DTileFeature): Color = js.native
  def evaluateColor(feature: Cesium3DTileFeature, result: Color): Color = js.native
}

