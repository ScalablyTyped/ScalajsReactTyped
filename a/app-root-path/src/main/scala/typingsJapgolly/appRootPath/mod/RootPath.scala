package typingsJapgolly.appRootPath.mod

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RootPath extends js.Object {
  /**
    * Application root directory absolute path
    * @type {string}
    */
  var path: String
  /**
    * Resolve module by relative addressing from root
    * @param {string} pathToModule
    * @returns {*}
    */
  def require(pathToModule: String): js.Any
  /**
    * Resolves relative path from root to absolute path
    * @param {string} pathToModule
    * @returns {string}
    */
  def resolve(pathToModule: String): String
  /**
    * Explicitly set root path
    * @param {string} explicitlySetPath
    */
  def setPath(explicitlySetPath: String): Unit
}

object RootPath {
  @scala.inline
  def apply(
    path: String,
    require: String => CallbackTo[js.Any],
    resolve: String => CallbackTo[String],
    setPath: String => Callback
  ): RootPath = {
    val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any])
    __obj.updateDynamic("require")(js.Any.fromFunction1((t0: java.lang.String) => require(t0).runNow()))
    __obj.updateDynamic("resolve")(js.Any.fromFunction1((t0: java.lang.String) => resolve(t0).runNow()))
    __obj.updateDynamic("setPath")(js.Any.fromFunction1((t0: java.lang.String) => setPath(t0).runNow()))
    __obj.asInstanceOf[RootPath]
  }
}

