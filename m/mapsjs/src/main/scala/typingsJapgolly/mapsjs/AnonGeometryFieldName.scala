package typingsJapgolly.mapsjs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonGeometryFieldName extends js.Object {
  var bleedRatio: js.UndefOr[Double] = js.undefined
  var geometryFieldName: String
  var valueFieldNames: js.Array[String]
}

object AnonGeometryFieldName {
  @scala.inline
  def apply(geometryFieldName: String, valueFieldNames: js.Array[String], bleedRatio: Int | Double = null): AnonGeometryFieldName = {
    val __obj = js.Dynamic.literal(geometryFieldName = geometryFieldName.asInstanceOf[js.Any], valueFieldNames = valueFieldNames.asInstanceOf[js.Any])
    if (bleedRatio != null) __obj.updateDynamic("bleedRatio")(bleedRatio.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonGeometryFieldName]
  }
}

