package typingsJapgolly.typescript.typescriptMod

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReadBuildProgramHost extends js.Object {
  def getCurrentDirectory(): String
  def readFile(fileName: String): js.UndefOr[String]
  def useCaseSensitiveFileNames(): Boolean
}

object ReadBuildProgramHost {
  @scala.inline
  def apply(
    getCurrentDirectory: CallbackTo[String],
    readFile: String => CallbackTo[js.UndefOr[String]],
    useCaseSensitiveFileNames: CallbackTo[Boolean]
  ): ReadBuildProgramHost = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("getCurrentDirectory")(getCurrentDirectory.toJsFn)
    __obj.updateDynamic("readFile")(js.Any.fromFunction1((t0: java.lang.String) => readFile(t0).runNow()))
    __obj.updateDynamic("useCaseSensitiveFileNames")(useCaseSensitiveFileNames.toJsFn)
    __obj.asInstanceOf[ReadBuildProgramHost]
  }
}

