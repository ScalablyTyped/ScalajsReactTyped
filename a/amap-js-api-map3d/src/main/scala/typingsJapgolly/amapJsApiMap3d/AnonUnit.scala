package typingsJapgolly.amapJsApiMap3d

import typingsJapgolly.amapJsApi.AMap.Pixel
import typingsJapgolly.amapJsApiMap3d.amapJsApiMap3dStrings.px
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonUnit extends js.Object {
  var path: js.Array[Pixel | (js.Tuple2[Double, Double])]
  var unit: px
}

object AnonUnit {
  @scala.inline
  def apply(path: js.Array[Pixel | (js.Tuple2[Double, Double])], unit: px): AnonUnit = {
    val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any], unit = unit.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonUnit]
  }
}

