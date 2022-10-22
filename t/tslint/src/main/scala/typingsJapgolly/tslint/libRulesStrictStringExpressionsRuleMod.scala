package typingsJapgolly.tslint

import typingsJapgolly.tslint.libLanguageRuleRuleMod.IOptions
import typingsJapgolly.tslint.libLanguageRuleRuleMod.IRuleMetadata
import typingsJapgolly.tslint.mod.Rules.TypedRule
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libRulesStrictStringExpressionsRuleMod {
  
  @JSImport("tslint/lib/rules/strictStringExpressionsRule", "Rule")
  @js.native
  open class Rule protected () extends TypedRule {
    def this(options: IOptions) = this()
    
    /* private */ var getRuleOptions: Any = js.native
  }
  /* static members */
  object Rule {
    
    @JSImport("tslint/lib/rules/strictStringExpressionsRule", "Rule")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("tslint/lib/rules/strictStringExpressionsRule", "Rule.CONVERSION_REQUIRED")
    @js.native
    def CONVERSION_REQUIRED: String = js.native
    inline def CONVERSION_REQUIRED_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("CONVERSION_REQUIRED")(x.asInstanceOf[js.Any])
    
    @JSImport("tslint/lib/rules/strictStringExpressionsRule", "Rule.metadata")
    @js.native
    def metadata: IRuleMetadata = js.native
    inline def metadata_=(x: IRuleMetadata): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("metadata")(x.asInstanceOf[js.Any])
  }
}
