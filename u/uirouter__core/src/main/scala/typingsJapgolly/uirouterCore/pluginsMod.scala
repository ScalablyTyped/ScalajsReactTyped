package typingsJapgolly.uirouterCore

import typingsJapgolly.uirouterCore.routerMod.UIRouter
import typingsJapgolly.uirouterCore.vanillaInterfaceMod.LocationPlugin
import typingsJapgolly.uirouterCore.vanillaInterfaceMod.ServicesPlugin
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@uirouter/core/lib/vanilla/plugins", JSImport.Namespace)
@js.native
object pluginsMod extends js.Object {
  def hashLocationPlugin(router: UIRouter): LocationPlugin = js.native
  def memoryLocationPlugin(router: UIRouter): LocationPlugin = js.native
  def pushStateLocationPlugin(router: UIRouter): LocationPlugin = js.native
  def servicesPlugin(router: UIRouter): ServicesPlugin = js.native
}

