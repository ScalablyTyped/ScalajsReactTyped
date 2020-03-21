package typingsJapgolly.uirouterCore.vanillaInterfaceMod

import typingsJapgolly.uirouterCore.coreservicesMod.LocationConfig
import typingsJapgolly.uirouterCore.coreservicesMod.LocationServices
import typingsJapgolly.uirouterCore.interfaceMod.UIRouterPlugin
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LocationPlugin extends UIRouterPlugin {
  var configuration: LocationConfig = js.native
  var service: LocationServices = js.native
}

