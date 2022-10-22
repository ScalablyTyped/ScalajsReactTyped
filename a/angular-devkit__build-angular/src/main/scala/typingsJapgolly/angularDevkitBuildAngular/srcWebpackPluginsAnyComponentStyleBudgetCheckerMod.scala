package typingsJapgolly.angularDevkitBuildAngular

import typingsJapgolly.angularDevkitBuildAngular.srcBuildersBrowserSchemaMod.Budget
import typingsJapgolly.webpack.mod.Compiler
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcWebpackPluginsAnyComponentStyleBudgetCheckerMod {
  
  @JSImport("@angular-devkit/build-angular/src/webpack/plugins/any-component-style-budget-checker", "AnyComponentStyleBudgetChecker")
  @js.native
  open class AnyComponentStyleBudgetChecker protected () extends StObject {
    def this(budgets: js.Array[Budget]) = this()
    
    @JSName("apply")
    def apply(compiler: Compiler): Unit = js.native
    
    /* private */ val budgets: Any = js.native
  }
}
