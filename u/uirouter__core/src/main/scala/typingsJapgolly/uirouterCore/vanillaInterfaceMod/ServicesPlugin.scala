package typingsJapgolly.uirouterCore.vanillaInterfaceMod

import typingsJapgolly.uirouterCore.coreservicesMod.InjectorLike
import typingsJapgolly.uirouterCore.coreservicesMod.QLike
import typingsJapgolly.uirouterCore.interfaceMod.UIRouterPlugin
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ServicesPlugin extends UIRouterPlugin {
  @JSName("$injector")
  var $injector: InjectorLike = js.native
  @JSName("$q")
  var $q: QLike = js.native
}

