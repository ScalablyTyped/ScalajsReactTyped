package typingsJapgolly.angularLocalforage.mod.localForage

import japgolly.scalajs.react.Callback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ILocalForageProvider extends js.Object {
  def config(config: LocalForageConfig): Unit
  def setNotify(onItemSet: Boolean, onItemRemove: Boolean): Unit
}

object ILocalForageProvider {
  @scala.inline
  def apply(config: LocalForageConfig => Callback, setNotify: (Boolean, Boolean) => Callback): ILocalForageProvider = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("config")(js.Any.fromFunction1((t0: typingsJapgolly.angularLocalforage.mod.localForage.LocalForageConfig) => config(t0).runNow()))
    __obj.updateDynamic("setNotify")(js.Any.fromFunction2((t0: scala.Boolean, t1: scala.Boolean) => setNotify(t0, t1).runNow()))
    __obj.asInstanceOf[ILocalForageProvider]
  }
}

