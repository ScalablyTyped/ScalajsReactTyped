package typingsJapgolly.typescriptServices.TypeScript

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IReferenceResolverHost extends js.Object {
  def directoryExists(path: String): Boolean
  def fileExists(path: String): Boolean
  def getParentDirectory(path: String): String
  def getScriptSnapshot(fileName: String): IScriptSnapshot
  def resolveRelativePath(path: String, directory: String): String
}

object IReferenceResolverHost {
  @scala.inline
  def apply(
    directoryExists: String => CallbackTo[Boolean],
    fileExists: String => CallbackTo[Boolean],
    getParentDirectory: String => CallbackTo[String],
    getScriptSnapshot: String => CallbackTo[IScriptSnapshot],
    resolveRelativePath: (String, String) => CallbackTo[String]
  ): IReferenceResolverHost = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("directoryExists")(js.Any.fromFunction1((t0: java.lang.String) => directoryExists(t0).runNow()))
    __obj.updateDynamic("fileExists")(js.Any.fromFunction1((t0: java.lang.String) => fileExists(t0).runNow()))
    __obj.updateDynamic("getParentDirectory")(js.Any.fromFunction1((t0: java.lang.String) => getParentDirectory(t0).runNow()))
    __obj.updateDynamic("getScriptSnapshot")(js.Any.fromFunction1((t0: java.lang.String) => getScriptSnapshot(t0).runNow()))
    __obj.updateDynamic("resolveRelativePath")(js.Any.fromFunction2((t0: java.lang.String, t1: java.lang.String) => resolveRelativePath(t0, t1).runNow()))
    __obj.asInstanceOf[IReferenceResolverHost]
  }
}

