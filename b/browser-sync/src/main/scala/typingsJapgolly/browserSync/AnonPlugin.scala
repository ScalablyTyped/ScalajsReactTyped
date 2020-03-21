package typingsJapgolly.browserSync

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.browserSync.mod.BrowserSyncInstance
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonPlugin extends js.Object {
  @JSName("plugin:name")
  var pluginColonname: js.UndefOr[String] = js.undefined
  def plugin(opts: js.Object, bs: BrowserSyncInstance): js.Any
}

object AnonPlugin {
  @scala.inline
  def apply(plugin: (js.Object, BrowserSyncInstance) => CallbackTo[js.Any], pluginColonname: String = null): AnonPlugin = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("plugin")(js.Any.fromFunction2((t0: js.Object, t1: typingsJapgolly.browserSync.mod.BrowserSyncInstance) => plugin(t0, t1).runNow()))
    if (pluginColonname != null) __obj.updateDynamic("plugin:name")(pluginColonname.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonPlugin]
  }
}

