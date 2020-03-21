package typingsJapgolly.reactFilepond.mod

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FilePondHookProps extends js.Object {
  var beforeRemoveFile: js.UndefOr[js.Function1[/* file */ File, Boolean]] = js.undefined
}

object FilePondHookProps {
  @scala.inline
  def apply(beforeRemoveFile: /* file */ File => CallbackTo[Boolean] = null): FilePondHookProps = {
    val __obj = js.Dynamic.literal()
    if (beforeRemoveFile != null) __obj.updateDynamic("beforeRemoveFile")(js.Any.fromFunction1((t0: /* file */ typingsJapgolly.reactFilepond.mod.File) => beforeRemoveFile(t0).runNow()))
    __obj.asInstanceOf[FilePondHookProps]
  }
}

