package typingsJapgolly.builderUtil.fsMod

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.fsExtra.mod.Stats
import typingsJapgolly.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CopyDirOptions extends js.Object {
  var filter: js.UndefOr[Filter | Null] = js.undefined
  var isUseHardLink: js.UndefOr[(js.Function1[/* file */ String, Boolean]) | Null] = js.undefined
  var transformer: js.UndefOr[FileTransformer | Null] = js.undefined
}

object CopyDirOptions {
  @scala.inline
  def apply(
    filter: (/* file */ String, /* stat */ Stats) => CallbackTo[Boolean] = null,
    isUseHardLink: /* file */ String => CallbackTo[Boolean] = null,
    transformer: /* file */ String => CallbackTo[
      (js.Promise[Null | String | Buffer | CopyFileTransformer]) | Null | String | Buffer | CopyFileTransformer
    ] = null
  ): CopyDirOptions = {
    val __obj = js.Dynamic.literal()
    if (filter != null) __obj.updateDynamic("filter")(js.Any.fromFunction2((t0: /* file */ java.lang.String, t1: /* stat */ typingsJapgolly.fsExtra.mod.Stats) => filter(t0, t1).runNow()))
    if (isUseHardLink != null) __obj.updateDynamic("isUseHardLink")(js.Any.fromFunction1((t0: /* file */ java.lang.String) => isUseHardLink(t0).runNow()))
    if (transformer != null) __obj.updateDynamic("transformer")(js.Any.fromFunction1((t0: /* file */ java.lang.String) => transformer(t0).runNow()))
    __obj.asInstanceOf[CopyDirOptions]
  }
}

