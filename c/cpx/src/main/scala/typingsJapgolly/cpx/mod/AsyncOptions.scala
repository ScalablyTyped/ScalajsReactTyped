package typingsJapgolly.cpx.mod

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.node.streamMod.Transform
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AsyncOptions extends SyncOptions {
  /** Function that creates a `stream.Transform` object to transform each copying file. */
  var transform: js.UndefOr[js.Function1[/* filepath */ String, js.Array[Transform]]] = js.undefined
}

object AsyncOptions {
  @scala.inline
  def apply(
    clean: js.UndefOr[Boolean] = js.undefined,
    dereference: js.UndefOr[Boolean] = js.undefined,
    includeEmptyDirs: js.UndefOr[Boolean] = js.undefined,
    preserve: js.UndefOr[Boolean] = js.undefined,
    transform: /* filepath */ String => CallbackTo[js.Array[Transform]] = null,
    update: js.UndefOr[Boolean] = js.undefined
  ): AsyncOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(clean)) __obj.updateDynamic("clean")(clean.asInstanceOf[js.Any])
    if (!js.isUndefined(dereference)) __obj.updateDynamic("dereference")(dereference.asInstanceOf[js.Any])
    if (!js.isUndefined(includeEmptyDirs)) __obj.updateDynamic("includeEmptyDirs")(includeEmptyDirs.asInstanceOf[js.Any])
    if (!js.isUndefined(preserve)) __obj.updateDynamic("preserve")(preserve.asInstanceOf[js.Any])
    if (transform != null) __obj.updateDynamic("transform")(js.Any.fromFunction1((t0: /* filepath */ java.lang.String) => transform(t0).runNow()))
    if (!js.isUndefined(update)) __obj.updateDynamic("update")(update.asInstanceOf[js.Any])
    __obj.asInstanceOf[AsyncOptions]
  }
}

