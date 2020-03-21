package typingsJapgolly.uirouterCore

import japgolly.scalajs.react.Callback
import typingsJapgolly.uirouterCore.coreservicesMod.LocationConfig
import typingsJapgolly.uirouterCore.coreservicesMod.LocationServices
import typingsJapgolly.uirouterCore.routerMod.UIRouter
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonConfiguration extends js.Object {
  var configuration: LocationConfig
  var name: String
  var service: LocationServices
  def dispose(router: UIRouter): Unit
}

object AnonConfiguration {
  @scala.inline
  def apply(
    configuration: LocationConfig,
    dispose: UIRouter => Callback,
    name: String,
    service: LocationServices
  ): AnonConfiguration = {
    val __obj = js.Dynamic.literal(configuration = configuration.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], service = service.asInstanceOf[js.Any])
    __obj.updateDynamic("dispose")(js.Any.fromFunction1((t0: typingsJapgolly.uirouterCore.routerMod.UIRouter) => dispose(t0).runNow()))
    __obj.asInstanceOf[AnonConfiguration]
  }
}

