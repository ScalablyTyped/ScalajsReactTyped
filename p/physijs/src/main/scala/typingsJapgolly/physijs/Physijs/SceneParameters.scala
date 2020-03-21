package typingsJapgolly.physijs.Physijs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SceneParameters extends js.Object {
  var ammo: js.UndefOr[String] = js.undefined
  var fixedTimeStep: js.UndefOr[Double] = js.undefined
  var rateLimit: js.UndefOr[Boolean] = js.undefined
}

object SceneParameters {
  @scala.inline
  def apply(
    ammo: String = null,
    fixedTimeStep: Int | Double = null,
    rateLimit: js.UndefOr[Boolean] = js.undefined
  ): SceneParameters = {
    val __obj = js.Dynamic.literal()
    if (ammo != null) __obj.updateDynamic("ammo")(ammo.asInstanceOf[js.Any])
    if (fixedTimeStep != null) __obj.updateDynamic("fixedTimeStep")(fixedTimeStep.asInstanceOf[js.Any])
    if (!js.isUndefined(rateLimit)) __obj.updateDynamic("rateLimit")(rateLimit.asInstanceOf[js.Any])
    __obj.asInstanceOf[SceneParameters]
  }
}

