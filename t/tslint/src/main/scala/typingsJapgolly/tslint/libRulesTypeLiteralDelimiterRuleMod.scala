package typingsJapgolly.tslint

import typingsJapgolly.tslint.libLanguageRuleRuleMod.IOptions
import typingsJapgolly.tslint.libLanguageRuleRuleMod.IRuleMetadata
import typingsJapgolly.tslint.mod.Rules.AbstractRule
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libRulesTypeLiteralDelimiterRuleMod {
  
  @JSImport("tslint/lib/rules/typeLiteralDelimiterRule", "Rule")
  @js.native
  open class Rule protected () extends AbstractRule {
    def this(options: IOptions) = this()
    
    /* private */ var getRuleOptions: Any = js.native
  }
  /* static members */
  object Rule {
    
    @JSImport("tslint/lib/rules/typeLiteralDelimiterRule", "Rule")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("tslint/lib/rules/typeLiteralDelimiterRule", "Rule.FAILURE_STRING_COMMA")
    @js.native
    def FAILURE_STRING_COMMA: String = js.native
    inline def FAILURE_STRING_COMMA_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("FAILURE_STRING_COMMA")(x.asInstanceOf[js.Any])
    
    @JSImport("tslint/lib/rules/typeLiteralDelimiterRule", "Rule.FAILURE_STRING_MISSING")
    @js.native
    def FAILURE_STRING_MISSING: String = js.native
    inline def FAILURE_STRING_MISSING_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("FAILURE_STRING_MISSING")(x.asInstanceOf[js.Any])
    
    @JSImport("tslint/lib/rules/typeLiteralDelimiterRule", "Rule.FAILURE_STRING_TRAILING")
    @js.native
    def FAILURE_STRING_TRAILING: String = js.native
    inline def FAILURE_STRING_TRAILING_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("FAILURE_STRING_TRAILING")(x.asInstanceOf[js.Any])
    
    @JSImport("tslint/lib/rules/typeLiteralDelimiterRule", "Rule.metadata")
    @js.native
    def metadata: IRuleMetadata = js.native
    inline def metadata_=(x: IRuleMetadata): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("metadata")(x.asInstanceOf[js.Any])
  }
}
