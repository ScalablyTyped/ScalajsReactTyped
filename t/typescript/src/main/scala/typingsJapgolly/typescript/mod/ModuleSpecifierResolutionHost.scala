package typingsJapgolly.typescript.mod

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ModuleSpecifierResolutionHost extends GetEffectiveTypeRootsHost {
  var fileExists: js.UndefOr[js.Function1[/* path */ java.lang.String, Boolean]] = js.undefined
  var readFile: js.UndefOr[js.Function1[/* path */ java.lang.String, js.UndefOr[java.lang.String]]] = js.undefined
  var useCaseSensitiveFileNames: js.UndefOr[js.Function0[Boolean]] = js.undefined
}

object ModuleSpecifierResolutionHost {
  @scala.inline
  def apply(
    directoryExists: /* directoryName */ java.lang.String => CallbackTo[Boolean] = null,
    fileExists: /* path */ java.lang.String => CallbackTo[Boolean] = null,
    getCurrentDirectory: js.UndefOr[CallbackTo[java.lang.String]] = js.undefined,
    readFile: /* path */ java.lang.String => CallbackTo[js.UndefOr[java.lang.String]] = null,
    useCaseSensitiveFileNames: js.UndefOr[CallbackTo[Boolean]] = js.undefined
  ): ModuleSpecifierResolutionHost = {
    val __obj = js.Dynamic.literal()
    if (directoryExists != null) __obj.updateDynamic("directoryExists")(js.Any.fromFunction1((t0: /* directoryName */ java.lang.String) => directoryExists(t0).runNow()))
    if (fileExists != null) __obj.updateDynamic("fileExists")(js.Any.fromFunction1((t0: /* path */ java.lang.String) => fileExists(t0).runNow()))
    getCurrentDirectory.foreach(p => __obj.updateDynamic("getCurrentDirectory")(p.toJsFn))
    if (readFile != null) __obj.updateDynamic("readFile")(js.Any.fromFunction1((t0: /* path */ java.lang.String) => readFile(t0).runNow()))
    useCaseSensitiveFileNames.foreach(p => __obj.updateDynamic("useCaseSensitiveFileNames")(p.toJsFn))
    __obj.asInstanceOf[ModuleSpecifierResolutionHost]
  }
}

