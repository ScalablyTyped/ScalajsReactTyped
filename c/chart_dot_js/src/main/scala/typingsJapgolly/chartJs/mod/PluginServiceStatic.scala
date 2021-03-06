package typingsJapgolly.chartJs.mod

import japgolly.scalajs.react.Callback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PluginServiceStatic extends js.Object {
  def register(plugin: PluginServiceGlobalRegistration with PluginServiceRegistrationOptions): Unit
  def unregister(plugin: PluginServiceGlobalRegistration with PluginServiceRegistrationOptions): Unit
}

object PluginServiceStatic {
  @scala.inline
  def apply(
    register: PluginServiceGlobalRegistration with PluginServiceRegistrationOptions => Callback,
    unregister: PluginServiceGlobalRegistration with PluginServiceRegistrationOptions => Callback
  ): PluginServiceStatic = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("register")(js.Any.fromFunction1((t0: typingsJapgolly.chartJs.mod.PluginServiceGlobalRegistration with typingsJapgolly.chartJs.mod.PluginServiceRegistrationOptions) => register(t0).runNow()))
    __obj.updateDynamic("unregister")(js.Any.fromFunction1((t0: typingsJapgolly.chartJs.mod.PluginServiceGlobalRegistration with typingsJapgolly.chartJs.mod.PluginServiceRegistrationOptions) => unregister(t0).runNow()))
    __obj.asInstanceOf[PluginServiceStatic]
  }
}

