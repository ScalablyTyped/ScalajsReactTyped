package typingsJapgolly.less.Less_

import japgolly.scalajs.react.Callback
import typingsJapgolly.less.LessStatic
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Plugin extends js.Object {
  def install(less: LessStatic, pluginManager: PluginManager): Unit
}

object Plugin {
  @scala.inline
  def apply(install: (LessStatic, PluginManager) => Callback): Plugin = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("install")(js.Any.fromFunction2((t0: typingsJapgolly.less.LessStatic, t1: typingsJapgolly.less.Less_.PluginManager) => install(t0, t1).runNow()))
    __obj.asInstanceOf[Plugin]
  }
}

