package typingsJapgolly.uirouterCore.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@uirouter/core", "UrlRuleFactory")
@js.native
open class UrlRuleFactory protected ()
  extends typingsJapgolly.uirouterCore.libUrlMod.UrlRuleFactory {
  def this(router: typingsJapgolly.uirouterCore.libRouterMod.UIRouter) = this()
}
/* static members */
object UrlRuleFactory {
  
  @JSImport("@uirouter/core", "UrlRuleFactory")
  @js.native
  val ^ : js.Any = js.native
  
  inline def isUrlRule(obj: Any): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isUrlRule")(obj.asInstanceOf[js.Any]).asInstanceOf[Boolean]
}
