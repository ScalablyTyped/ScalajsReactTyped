package typingsJapgolly.typescript.typescriptMod

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetEffectiveTypeRootsHost extends js.Object {
  var directoryExists: js.UndefOr[js.Function1[/* directoryName */ String, Boolean]] = js.undefined
  var getCurrentDirectory: js.UndefOr[js.Function0[String]] = js.undefined
}

object GetEffectiveTypeRootsHost {
  @scala.inline
  def apply(
    directoryExists: /* directoryName */ String => CallbackTo[Boolean] = null,
    getCurrentDirectory: js.UndefOr[CallbackTo[String]] = js.undefined
  ): GetEffectiveTypeRootsHost = {
    val __obj = js.Dynamic.literal()
    if (directoryExists != null) __obj.updateDynamic("directoryExists")(js.Any.fromFunction1((t0: /* directoryName */ java.lang.String) => directoryExists(t0).runNow()))
    getCurrentDirectory.foreach(p => __obj.updateDynamic("getCurrentDirectory")(p.toJsFn))
    __obj.asInstanceOf[GetEffectiveTypeRootsHost]
  }
}

