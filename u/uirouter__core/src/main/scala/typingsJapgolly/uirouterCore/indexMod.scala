package typingsJapgolly.uirouterCore

import typingsJapgolly.uirouterCore.coreservicesMod.InjectorLike
import typingsJapgolly.uirouterCore.coreservicesMod.LocationServices
import typingsJapgolly.uirouterCore.coreservicesMod.QLike
import typingsJapgolly.uirouterCore.routerMod.UIRouter
import typingsJapgolly.uirouterCore.vanillaInterfaceMod.LocationPlugin
import typingsJapgolly.uirouterCore.vanillaInterfaceMod.ServicesPlugin
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@uirouter/core/lib/vanilla/index", JSImport.Namespace)
@js.native
object indexMod extends js.Object {
  @js.native
  abstract class BaseLocationServices protected ()
    extends typingsJapgolly.uirouterCore.baseLocationServiceMod.BaseLocationServices {
    def this(router: UIRouter, fireAfterUpdate: Boolean) = this()
  }
  
  @js.native
  class BrowserLocationConfig ()
    extends typingsJapgolly.uirouterCore.browserLocationConfigMod.BrowserLocationConfig {
    def this(router: js.Any) = this()
    def this(router: js.Any, _isHtml5: Boolean) = this()
  }
  
  @js.native
  class HashLocationService protected ()
    extends typingsJapgolly.uirouterCore.hashLocationServiceMod.HashLocationService {
    def this(router: UIRouter) = this()
  }
  
  @js.native
  class MemoryLocationConfig ()
    extends typingsJapgolly.uirouterCore.memoryLocationConfigMod.MemoryLocationConfig
  
  @js.native
  class MemoryLocationService protected ()
    extends typingsJapgolly.uirouterCore.memoryLocationServiceMod.MemoryLocationService {
    def this(router: UIRouter) = this()
  }
  
  @js.native
  class PushStateLocationService protected ()
    extends typingsJapgolly.uirouterCore.pushStateLocationServiceMod.PushStateLocationService {
    def this(router: UIRouter) = this()
  }
  
  @JSName("$injector")
  val injector: InjectorLike = js.native
  @JSName("$q")
  val q: QLike = js.native
  def buildUrl(loc: LocationServices): String = js.native
  def getParams(queryString: String): js.Any = js.native
  def hashLocationPlugin(router: UIRouter): LocationPlugin = js.native
  def keyValsToObjectR(accum: js.Any, hasKeyVal: js.Tuple2[_, _]): js.Any = js.native
  def locationPluginFactory(
    name: String,
    isHtml5: Boolean,
    serviceClass: AnonInstantiable,
    configurationClass: AnonInstantiableLocationConfig
  ): js.Function1[/* uiRouter */ UIRouter, AnonConfiguration] = js.native
  def memoryLocationPlugin(router: UIRouter): LocationPlugin = js.native
  def parseUrl(url: String): AnonHash = js.native
  def pushStateLocationPlugin(router: UIRouter): LocationPlugin = js.native
  def servicesPlugin(router: UIRouter): ServicesPlugin = js.native
}

