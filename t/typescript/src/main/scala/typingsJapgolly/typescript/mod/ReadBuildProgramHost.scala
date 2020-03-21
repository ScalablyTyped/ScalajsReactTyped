package typingsJapgolly.typescript.mod

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReadBuildProgramHost extends js.Object {
  def getCurrentDirectory(): java.lang.String
  def readFile(fileName: java.lang.String): js.UndefOr[java.lang.String]
  def useCaseSensitiveFileNames(): Boolean
}

object ReadBuildProgramHost {
  @scala.inline
  def apply(
    getCurrentDirectory: CallbackTo[java.lang.String],
    readFile: java.lang.String => CallbackTo[js.UndefOr[java.lang.String]],
    useCaseSensitiveFileNames: CallbackTo[Boolean]
  ): ReadBuildProgramHost = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("getCurrentDirectory")(getCurrentDirectory.toJsFn)
    __obj.updateDynamic("readFile")(js.Any.fromFunction1((t0: java.lang.String) => readFile(t0).runNow()))
    __obj.updateDynamic("useCaseSensitiveFileNames")(useCaseSensitiveFileNames.toJsFn)
    __obj.asInstanceOf[ReadBuildProgramHost]
  }
}

