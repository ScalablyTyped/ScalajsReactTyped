package typingsJapgolly.fluentBundle

import typingsJapgolly.fluentBundle.esmAstMod.ComplexPattern
import typingsJapgolly.fluentBundle.esmScopeMod.Scope
import typingsJapgolly.fluentBundle.esmTypesMod.FluentValue
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esmResolverMod {
  
  @JSImport("@fluent/bundle/esm/resolver", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def resolveComplexPattern(scope: Scope, ptn: ComplexPattern): FluentValue = (^.asInstanceOf[js.Dynamic].applyDynamic("resolveComplexPattern")(scope.asInstanceOf[js.Any], ptn.asInstanceOf[js.Any])).asInstanceOf[FluentValue]
}
