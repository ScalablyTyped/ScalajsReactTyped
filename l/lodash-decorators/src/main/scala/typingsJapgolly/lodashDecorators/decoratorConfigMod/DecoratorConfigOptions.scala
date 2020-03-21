package typingsJapgolly.lodashDecorators.decoratorConfigMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DecoratorConfigOptions extends js.Object {
  var bound: js.UndefOr[Boolean] = js.undefined
  var getter: js.UndefOr[Boolean] = js.undefined
  var method: js.UndefOr[Boolean] = js.undefined
  var optionalParams: js.UndefOr[Boolean] = js.undefined
  var property: js.UndefOr[Boolean] = js.undefined
  var setter: js.UndefOr[Boolean] = js.undefined
}

object DecoratorConfigOptions {
  @scala.inline
  def apply(
    bound: js.UndefOr[Boolean] = js.undefined,
    getter: js.UndefOr[Boolean] = js.undefined,
    method: js.UndefOr[Boolean] = js.undefined,
    optionalParams: js.UndefOr[Boolean] = js.undefined,
    property: js.UndefOr[Boolean] = js.undefined,
    setter: js.UndefOr[Boolean] = js.undefined
  ): DecoratorConfigOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(bound)) __obj.updateDynamic("bound")(bound.asInstanceOf[js.Any])
    if (!js.isUndefined(getter)) __obj.updateDynamic("getter")(getter.asInstanceOf[js.Any])
    if (!js.isUndefined(method)) __obj.updateDynamic("method")(method.asInstanceOf[js.Any])
    if (!js.isUndefined(optionalParams)) __obj.updateDynamic("optionalParams")(optionalParams.asInstanceOf[js.Any])
    if (!js.isUndefined(property)) __obj.updateDynamic("property")(property.asInstanceOf[js.Any])
    if (!js.isUndefined(setter)) __obj.updateDynamic("setter")(setter.asInstanceOf[js.Any])
    __obj.asInstanceOf[DecoratorConfigOptions]
  }
}

