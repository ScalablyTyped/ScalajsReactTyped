package typingsJapgolly.uirouterAngularjs.mod

import typingsJapgolly.uirouterCore.libCommonCommonMod.IInjectable
import typingsJapgolly.uirouterCore.libUrlInterfaceMod.UrlRuleHandlerFn
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@uirouter/angularjs", "UrlRouterProvider")
@js.native
open class UrlRouterProvider protected ()
  extends typingsJapgolly.uirouterAngularjs.libUrlRouterProviderMod.UrlRouterProvider {
  /** @hidden */
  def this(/** @hidden */ router: typingsJapgolly.uirouterCore.mod.UIRouter) = this()
}
/* static members */
object UrlRouterProvider {
  
  @JSImport("@uirouter/angularjs", "UrlRouterProvider")
  @js.native
  val ^ : js.Any = js.native
  
  inline def injectableHandler(router: typingsJapgolly.uirouterCore.mod.UIRouter, handler: IInjectable): UrlRuleHandlerFn = (^.asInstanceOf[js.Dynamic].applyDynamic("injectableHandler")(router.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[UrlRuleHandlerFn]
}
