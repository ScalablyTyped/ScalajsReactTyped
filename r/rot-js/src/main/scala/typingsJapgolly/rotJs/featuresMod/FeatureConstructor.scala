package typingsJapgolly.rotJs.featuresMod

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FeatureConstructor extends js.Object {
  def createRandomAt(x: Double, y: Double, dx: Double, dy: Double, options: FeatureOptions): Feature
}

object FeatureConstructor {
  @scala.inline
  def apply(createRandomAt: (Double, Double, Double, Double, FeatureOptions) => CallbackTo[Feature]): FeatureConstructor = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("createRandomAt")(js.Any.fromFunction5((t0: scala.Double, t1: scala.Double, t2: scala.Double, t3: scala.Double, t4: typingsJapgolly.rotJs.featuresMod.FeatureOptions) => createRandomAt(t0, t1, t2, t3, t4).runNow()))
    __obj.asInstanceOf[FeatureConstructor]
  }
}

