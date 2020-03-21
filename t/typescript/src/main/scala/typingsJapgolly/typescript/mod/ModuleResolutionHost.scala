package typingsJapgolly.typescript.mod

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ModuleResolutionHost extends js.Object {
  var directoryExists: js.UndefOr[js.Function1[/* directoryName */ java.lang.String, Boolean]] = js.undefined
  var getCurrentDirectory: js.UndefOr[js.Function0[java.lang.String]] = js.undefined
  var getDirectories: js.UndefOr[js.Function1[/* path */ java.lang.String, js.Array[java.lang.String]]] = js.undefined
  /**
    * Resolve a symbolic link.
    * @see https://nodejs.org/api/fs.html#fs_fs_realpathsync_path_options
    */
  var realpath: js.UndefOr[js.Function1[/* path */ java.lang.String, java.lang.String]] = js.undefined
  var trace: js.UndefOr[js.Function1[/* s */ java.lang.String, Unit]] = js.undefined
  def fileExists(fileName: java.lang.String): Boolean
  def readFile(fileName: java.lang.String): js.UndefOr[java.lang.String]
}

object ModuleResolutionHost {
  @scala.inline
  def apply(
    fileExists: java.lang.String => CallbackTo[Boolean],
    readFile: java.lang.String => CallbackTo[js.UndefOr[java.lang.String]],
    directoryExists: /* directoryName */ java.lang.String => CallbackTo[Boolean] = null,
    getCurrentDirectory: js.UndefOr[CallbackTo[java.lang.String]] = js.undefined,
    getDirectories: /* path */ java.lang.String => CallbackTo[js.Array[java.lang.String]] = null,
    realpath: /* path */ java.lang.String => CallbackTo[java.lang.String] = null,
    trace: /* s */ java.lang.String => Callback = null
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

