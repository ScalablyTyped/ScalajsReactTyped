package typingsJapgolly.tslint

import typingsJapgolly.tslint.libLanguageRuleRuleMod.IOptions
import typingsJapgolly.tslint.libLanguageRuleRuleMod.IRuleMetadata
import typingsJapgolly.tslint.mod.Rules.AbstractRule
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libRulesNoUnnecessaryInitializerRuleMod {
  
  @JSImport("tslint/lib/rules/noUnnecessaryInitializerRule", "Rule")
  @js.native
  open class Rule protected () extends AbstractRule {
    def this(options: IOptions) = this()
  }
  /* static members */
  object Rule {
    
    @JSImport("tslint/lib/rules/noUnnecessaryInitializerRule", "Rule")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("tslint/lib/rules/noUnnecessaryInitializerRule", "Rule.FAILURE_STRING")
    @js.native
    def FAILURE_STRING: String = js.native
    inline def FAILURE_STRING_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("FAILURE_STRING")(x.asInstanceOf[js.Any])
    
    @JSImport("tslint/lib/rules/noUnnecessaryInitializerRule", "Rule.FAILURE_STRING_PARAMETER")
    @js.native
    def FAILURE_STRING_PARAMETER: String = js.native
    inline def FAILURE_STRING_PARAMETER_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("FAILURE_STRING_PARAMETER")(x.asInstanceOf[js.Any])
    
    @JSImport("tslint/lib/rules/noUnnecessaryInitializerRule", "Rule.metadata")
    @js.native
    def metadata: IRuleMetadata = js.native
    inline def metadata_=(x: IRuleMetadata): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("metadata")(x.asInstanceOf[js.Any])
  }
}
