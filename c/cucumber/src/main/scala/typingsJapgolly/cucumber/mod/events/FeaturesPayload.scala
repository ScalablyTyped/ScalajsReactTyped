package typingsJapgolly.cucumber.mod.events

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FeaturesPayload extends EventPayload {
  def getFeatures(): js.Array[_]
}

object FeaturesPayload {
  @scala.inline
  def apply(getFeatures: CallbackTo[js.Array[js.Any]]): FeaturesPayload = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("getFeatures")(getFeatures.toJsFn)
    __obj.asInstanceOf[FeaturesPayload]
  }
}

