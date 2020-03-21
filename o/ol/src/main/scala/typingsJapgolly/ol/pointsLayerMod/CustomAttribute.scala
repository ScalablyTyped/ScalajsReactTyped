package typingsJapgolly.ol.pointsLayerMod

import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CustomAttribute extends js.Object {
  var name: String
  def callback(
    p0: typingsJapgolly.ol.olFeatureMod.default[typingsJapgolly.ol.geometryMod.default],
    p1: StringDictionary[js.Any]
  ): Double
}

object CustomAttribute {
  @scala.inline
  def apply(
    callback: (typingsJapgolly.ol.olFeatureMod.default[typingsJapgolly.ol.geometryMod.default], StringDictionary[js.Any]) => CallbackTo[Double],
    name: String
  ): CustomAttribute = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.updateDynamic("callback")(js.Any.fromFunction2((t0: typingsJapgolly.ol.olFeatureMod.default[typingsJapgolly.ol.geometryMod.default], t1: org.scalablytyped.runtime.StringDictionary[js.Any]) => callback(t0, t1).runNow()))
    __obj.asInstanceOf[CustomAttribute]
  }
}

