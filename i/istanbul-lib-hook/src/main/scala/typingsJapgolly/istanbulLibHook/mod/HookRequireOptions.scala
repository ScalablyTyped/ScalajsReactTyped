package typingsJapgolly.istanbulLibHook.mod

import japgolly.scalajs.react.Callback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait HookRequireOptions extends Options {
  var extensions: js.Array[String]
  def postLoadHook(filename: String): Unit
}

object HookRequireOptions {
  @scala.inline
  def apply(extensions: js.Array[String], postLoadHook: String => Callback, verbose: Boolean): HookRequireOptions = {
    val __obj = js.Dynamic.literal(extensions = extensions.asInstanceOf[js.Any], verbose = verbose.asInstanceOf[js.Any])
    __obj.updateDynamic("postLoadHook")(js.Any.fromFunction1((t0: java.lang.String) => postLoadHook(t0).runNow()))
    __obj.asInstanceOf[HookRequireOptions]
  }
}

