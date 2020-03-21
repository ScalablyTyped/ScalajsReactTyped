package typingsJapgolly.angularRouter

import typingsJapgolly.angularCore.mod.ComponentRef
import typingsJapgolly.angularCore.mod.InjectionToken
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonProvide extends js.Object {
  var deps: js.UndefOr[scala.Nothing] = js.undefined
  var multi: Boolean
  var provide: InjectionToken[js.Array[js.Function1[/* compRef */ ComponentRef[_], Unit]]]
  var useExisting: InjectionToken[js.Function1[/* compRef */ ComponentRef[_], Unit]]
  var useFactory: js.UndefOr[scala.Nothing] = js.undefined
}

object AnonProvide {
  @scala.inline
  def apply(
    multi: Boolean,
    provide: InjectionToken[js.Array[js.Function1[/* compRef */ ComponentRef[_], Unit]]],
    useExisting: InjectionToken[js.Function1[/* compRef */ ComponentRef[_], Unit]],
    deps: js.UndefOr[scala.Nothing] = js.undefined,
    useFactory: js.UndefOr[scala.Nothing] = js.undefined
  ): AnonProvide = {
    val __obj = js.Dynamic.literal(multi = multi.asInstanceOf[js.Any], provide = provide.asInstanceOf[js.Any], useExisting = useExisting.asInstanceOf[js.Any])
    if (!js.isUndefined(deps)) __obj.updateDynamic("deps")(deps.asInstanceOf[js.Any])
    if (!js.isUndefined(useFactory)) __obj.updateDynamic("useFactory")(useFactory.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonProvide]
  }
}

