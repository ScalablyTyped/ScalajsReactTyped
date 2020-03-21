package typingsJapgolly.mobxReactLite.useObserverMod

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IUseObserverOptions extends js.Object {
  var useForceUpdate: js.UndefOr[ForceUpdateHook] = js.undefined
}

object IUseObserverOptions {
  @scala.inline
  def apply(useForceUpdate: js.UndefOr[CallbackTo[js.Function0[Unit]]] = js.undefined): IUseObserverOptions = {
    val __obj = js.Dynamic.literal()
    useForceUpdate.foreach(p => __obj.updateDynamic("useForceUpdate")(p.toJsFn))
    __obj.asInstanceOf[IUseObserverOptions]
  }
}

