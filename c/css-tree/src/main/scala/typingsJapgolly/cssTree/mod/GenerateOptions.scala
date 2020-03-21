package typingsJapgolly.cssTree.mod

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GenerateOptions extends js.Object {
  var decorator: js.UndefOr[js.Function1[/* handlers */ GenerateHandlers, GenerateHandlers]] = js.undefined
  var sourceMap: js.UndefOr[Boolean] = js.undefined
}

object GenerateOptions {
  @scala.inline
  def apply(
    decorator: /* handlers */ GenerateHandlers => CallbackTo[GenerateHandlers] = null,
    sourceMap: js.UndefOr[Boolean] = js.undefined
  ): GenerateOptions = {
    val __obj = js.Dynamic.literal()
    if (decorator != null) __obj.updateDynamic("decorator")(js.Any.fromFunction1((t0: /* handlers */ typingsJapgolly.cssTree.mod.GenerateHandlers) => decorator(t0).runNow()))
    if (!js.isUndefined(sourceMap)) __obj.updateDynamic("sourceMap")(sourceMap.asInstanceOf[js.Any])
    __obj.asInstanceOf[GenerateOptions]
  }
}

