package typingsJapgolly.overlayscrollbars.mod

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ExtensionInfo extends js.Object {
  var defaultOptions: js.UndefOr[js.Object] = js.undefined
  var name: String
  def extensionFactory(defaultOptions: js.Object, compatibility: Compatibility, framework: js.Any): Extension
}

object ExtensionInfo {
  @scala.inline
  def apply(
    extensionFactory: (js.Object, Compatibility, js.Any) => CallbackTo[Extension],
    name: String,
    defaultOptions: js.Object = null
  ): ExtensionInfo = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.updateDynamic("extensionFactory")(js.Any.fromFunction3((t0: js.Object, t1: typingsJapgolly.overlayscrollbars.mod.Compatibility, t2: js.Any) => extensionFactory(t0, t1, t2).runNow()))
    if (defaultOptions != null) __obj.updateDynamic("defaultOptions")(defaultOptions.asInstanceOf[js.Any])
    __obj.asInstanceOf[ExtensionInfo]
  }
}

