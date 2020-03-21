package typingsJapgolly.typescript.mod

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ScriptReferenceHost extends js.Object {
  def getCompilerOptions(): CompilerOptions
  def getCurrentDirectory(): java.lang.String
  def getSourceFile(fileName: java.lang.String): js.UndefOr[SourceFile]
  def getSourceFileByPath(path: Path): js.UndefOr[SourceFile]
}

object ScriptReferenceHost {
  @scala.inline
  def apply(
    getCompilerOptions: CallbackTo[CompilerOptions],
    getCurrentDirectory: CallbackTo[java.lang.String],
    getSourceFile: java.lang.String => CallbackTo[js.UndefOr[SourceFile]],
    getSourceFileByPath: Path => CallbackTo[js.UndefOr[SourceFile]]
  ): ScriptReferenceHost = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("getCompilerOptions")(getCompilerOptions.toJsFn)
    __obj.updateDynamic("getCurrentDirectory")(getCurrentDirectory.toJsFn)
    __obj.updateDynamic("getSourceFile")(js.Any.fromFunction1((t0: java.lang.String) => getSourceFile(t0).runNow()))
    __obj.updateDynamic("getSourceFileByPath")(js.Any.fromFunction1((t0: typingsJapgolly.typescript.mod.Path) => getSourceFileByPath(t0).runNow()))
    __obj.asInstanceOf[ScriptReferenceHost]
  }
}

