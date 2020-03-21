package typingsJapgolly.fsExtra.mod

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CopyOptions extends js.Object {
  var dereference: js.UndefOr[Boolean] = js.undefined
  var errorOnExist: js.UndefOr[Boolean] = js.undefined
  var filter: js.UndefOr[CopyFilterSync | CopyFilterAsync] = js.undefined
  var overwrite: js.UndefOr[Boolean] = js.undefined
  var preserveTimestamps: js.UndefOr[Boolean] = js.undefined
  var recursive: js.UndefOr[Boolean] = js.undefined
}

object CopyOptions {
  @scala.inline
  def apply(
    dereference: js.UndefOr[Boolean] = js.undefined,
    errorOnExist: js.UndefOr[Boolean] = js.undefined,
    filter: (/* src */ String, /* dest */ String) => CallbackTo[Boolean | js.Promise[Boolean]] = null,
    overwrite: js.UndefOr[Boolean] = js.undefined,
    preserveTimestamps: js.UndefOr[Boolean] = js.undefined,
    recursive: js.UndefOr[Boolean] = js.undefined
  ): CopyOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(dereference)) __obj.updateDynamic("dereference")(dereference.asInstanceOf[js.Any])
    if (!js.isUndefined(errorOnExist)) __obj.updateDynamic("errorOnExist")(errorOnExist.asInstanceOf[js.Any])
    if (filter != null) __obj.updateDynamic("filter")(js.Any.fromFunction2((t0: /* src */ java.lang.String, t1: /* dest */ java.lang.String) => filter(t0, t1).runNow()))
    if (!js.isUndefined(overwrite)) __obj.updateDynamic("overwrite")(overwrite.asInstanceOf[js.Any])
    if (!js.isUndefined(preserveTimestamps)) __obj.updateDynamic("preserveTimestamps")(preserveTimestamps.asInstanceOf[js.Any])
    if (!js.isUndefined(recursive)) __obj.updateDynamic("recursive")(recursive.asInstanceOf[js.Any])
    __obj.asInstanceOf[CopyOptions]
  }
}

