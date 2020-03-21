package typingsJapgolly.nextReduxWrapper.mod

import typingsJapgolly.redux.mod.AnyAction
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait InitStoreOptions extends js.Object {
  var ctx: js.UndefOr[NextJSContext[_, AnyAction]] = js.undefined
  var initialState: js.UndefOr[js.Any] = js.undefined
}

object InitStoreOptions {
  @scala.inline
  def apply(ctx: NextJSContext[_, AnyAction] = null, initialState: js.Any = null): InitStoreOptions = {
    val __obj = js.Dynamic.literal()
    if (ctx != null) __obj.updateDynamic("ctx")(ctx.asInstanceOf[js.Any])
    if (initialState != null) __obj.updateDynamic("initialState")(initialState.asInstanceOf[js.Any])
    __obj.asInstanceOf[InitStoreOptions]
  }
}

