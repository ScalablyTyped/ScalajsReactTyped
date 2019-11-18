package typingsJapgolly.std

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NavigatorPlugins extends js.Object {
  val mimeTypes: MimeTypeArray
  val plugins: PluginArray
  def javaEnabled(): scala.Boolean
}

object NavigatorPlugins {
  @scala.inline
  def apply(javaEnabled: CallbackTo[scala.Boolean], mimeTypes: MimeTypeArray, plugins: PluginArray): NavigatorPlugins = {
    val __obj = js.Dynamic.literal(mimeTypes = mimeTypes.asInstanceOf[js.Any], plugins = plugins.asInstanceOf[js.Any])
    __obj.updateDynamic("javaEnabled")(javaEnabled.toJsFn)
    __obj.asInstanceOf[NavigatorPlugins]
  }
}

