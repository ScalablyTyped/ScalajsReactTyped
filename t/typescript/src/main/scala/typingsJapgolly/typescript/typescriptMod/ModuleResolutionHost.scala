package typingsJapgolly.typescript.typescriptMod

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ModuleResolutionHost extends js.Object {
  var directoryExists: js.UndefOr[js.Function1[/* directoryName */ String, Boolean]] = js.undefined
  var getCurrentDirectory: js.UndefOr[js.Function0[String]] = js.undefined
  var getDirectories: js.UndefOr[js.Function1[/* path */ String, js.Array[String]]] = js.undefined
  /**
    * Resolve a symbolic link.
    * @see https://nodejs.org/api/fs.html#fs_fs_realpathsync_path_options
    */
  var realpath: js.UndefOr[js.Function1[/* path */ String, String]] = js.undefined
  var trace: js.UndefOr[js.Function1[/* s */ String, Unit]] = js.undefined
  def fileExists(fileName: String): Boolean
  def readFile(fileName: String): js.UndefOr[String]
}

object ModuleResolutionHost {
  @scala.inline
  def apply(
    fileExists: String => CallbackTo[Boolean],
    readFile: String => CallbackTo[js.UndefOr[String]],
    directoryExists: /* directoryName */ String => CallbackTo[Boolean] = null,
    getCurrentDirectory: js.UndefOr[CallbackTo[String]] = js.undefined,
    getDirectories: /* path */ String => CallbackTo[js.Array[String]] = null,
    realpath: /* path */ String => CallbackTo[String] = null,
    trace: /* s */ String => Callback = null
  ): ModuleResolutionHost = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("fileExists")(js.Any.fromFunction1((t0: java.lang.String) => fileExists(t0).runNow()))
    __obj.updateDynamic("readFile")(js.Any.fromFunction1((t0: java.lang.String) => readFile(t0).runNow()))
    if (directoryExists != null) __obj.updateDynamic("directoryExists")(js.Any.fromFunction1((t0: /* directoryName */ java.lang.String) => directoryExists(t0).runNow()))
    getCurrentDirectory.foreach(p => __obj.updateDynamic("getCurrentDirectory")(p.toJsFn))
    if (getDirectories != null) __obj.updateDynamic("getDirectories")(js.Any.fromFunction1((t0: /* path */ java.lang.String) => getDirectories(t0).runNow()))
    if (realpath != null) __obj.updateDynamic("realpath")(js.Any.fromFunction1((t0: /* path */ java.lang.String) => realpath(t0).runNow()))
    if (trace != null) __obj.updateDynamic("trace")(js.Any.fromFunction1((t0: /* s */ java.lang.String) => trace(t0).runNow()))
    __obj.asInstanceOf[ModuleResolutionHost]
  }
}

