package typingsJapgolly.angularUiRouter.mod.core

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("angular-ui-router", "core.UrlRuleFactory")
@js.native
open class UrlRuleFactory protected ()
  extends typingsJapgolly.uirouterCore.mod.UrlRuleFactory {
  def this(router: typingsJapgolly.uirouterCore.libRouterMod.UIRouter) = this()
}
/* static members */
object UrlRuleFactory {
  
  @JSImport("angular-ui-router", "core.UrlRuleFactory")
  @js.native
  val ^ : js.Any = js.native
  
  inline def isUrlRule(obj: Any): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isUrlRule")(obj.asInstanceOf[js.Any]).asInstanceOf[Boolean]
}
