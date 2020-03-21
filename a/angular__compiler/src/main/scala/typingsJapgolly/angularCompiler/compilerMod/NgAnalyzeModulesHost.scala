package typingsJapgolly.angularCompiler.compilerMod

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NgAnalyzeModulesHost extends js.Object {
  def isSourceFile(filePath: String): Boolean
}

object NgAnalyzeModulesHost {
  @scala.inline
  def apply(isSourceFile: String => CallbackTo[Boolean]): NgAnalyzeModulesHost = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("isSourceFile")(js.Any.fromFunction1((t0: java.lang.String) => isSourceFile(t0).runNow()))
    __obj.asInstanceOf[NgAnalyzeModulesHost]
  }
}

