package typingsJapgolly.uirouterAngularjs.mod

import typingsJapgolly.uirouterCore.urlInterfaceMod.UrlRuleHandlerFn
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@uirouter/angularjs", "UrlRouterProvider")
@js.native
class UrlRouterProvider protected ()
  extends typingsJapgolly.uirouterAngularjs.urlRouterProviderMod.UrlRouterProvider {
  /** @hidden */
  def this(/** @hidden */ router: typingsJapgolly.uirouterCore.mod.UIRouter) = this()
}

/* static members */
@JSImport("@uirouter/angularjs", "UrlRouterProvider")
@js.native
object UrlRouterProvider extends js.Object {
  def injectableHandler(router: typingsJapgolly.uirouterCore.mod.UIRouter, handler: js.Any): UrlRuleHandlerFn = js.native
}

