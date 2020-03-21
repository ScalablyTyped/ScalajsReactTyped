package typingsJapgolly.pulumiAws.outputMod.ecs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ServiceCapacityProviderStrategy extends js.Object {
  var base: js.UndefOr[Double] = js.native
  var capacityProvider: String = js.native
  var weight: js.UndefOr[Double] = js.native
}

object ServiceCapacityProviderStrategy {
  @scala.inline
  def apply(capacityProvider: String, base: Int | Double = null, weight: Int | Double = null): ServiceCapacityProviderStrategy = {
    val __obj = js.Dynamic.literal(capacityProvider = capacityProvider.asInstanceOf[js.Any])
    if (base != null) __obj.updateDynamic("base")(base.asInstanceOf[js.Any])
    if (weight != null) __obj.updateDynamic("weight")(weight.asInstanceOf[js.Any])
    __obj.asInstanceOf[ServiceCapacityProviderStrategy]
  }
}

