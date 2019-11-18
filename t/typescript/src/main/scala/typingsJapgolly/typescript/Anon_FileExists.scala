package typingsJapgolly.typescript

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_FileExists extends js.Object {
  def fileExists(fileName: String): Boolean
  def getExecutingFilePath(): String
  def readFile(fileName: String): js.UndefOr[String]
  def resolvePath(path: String): String
}

object Anon_FileExists {
  @scala.inline
  def apply(
    fileExists: String => CallbackTo[Boolean],
    getExecutingFilePath: CallbackTo[String],
    readFile: String => CallbackTo[js.UndefOr[String]],
    resolvePath: String => CallbackTo[String]
  ): Anon_FileExists = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("fileExists")(js.Any.fromFunction1((t0: java.lang.String) => fileExists(t0).runNow()))
    __obj.updateDynamic("getExecutingFilePath")(getExecutingFilePath.toJsFn)
    __obj.updateDynamic("readFile")(js.Any.fromFunction1((t0: java.lang.String) => readFile(t0).runNow()))
    __obj.updateDynamic("resolvePath")(js.Any.fromFunction1((t0: java.lang.String) => resolvePath(t0).runNow()))
    __obj.asInstanceOf[Anon_FileExists]
  }
}

