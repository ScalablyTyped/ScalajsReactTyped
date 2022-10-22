package typingsJapgolly.tslint

import typingsJapgolly.tslint.libLanguageRuleRuleMod.IOptions
import typingsJapgolly.tslint.libLanguageRuleRuleMod.IRuleMetadata
import typingsJapgolly.tslint.mod.Rules.TypedRule
import typingsJapgolly.tslint.tslintStrings.`null`
import typingsJapgolly.tslint.tslintStrings.undefined
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libRulesStrictTypePredicatesRuleMod {
  
  @JSImport("tslint/lib/rules/strictTypePredicatesRule", "Rule")
  @js.native
  open class Rule protected () extends TypedRule {
    def this(options: IOptions) = this()
  }
  /* static members */
  object Rule {
    
    @JSImport("tslint/lib/rules/strictTypePredicatesRule", "Rule")
    @js.native
    val ^ : js.Any = js.native
    
    inline def FAILURE_STRICT_PREFER_STRICT_EQUALS(value: `null` | undefined, isPositive: Boolean): String = (^.asInstanceOf[js.Dynamic].applyDynamic("FAILURE_STRICT_PREFER_STRICT_EQUALS")(value.asInstanceOf[js.Any], isPositive.asInstanceOf[js.Any])).asInstanceOf[String]
    
    inline def FAILURE_STRING(value: Boolean): String = ^.asInstanceOf[js.Dynamic].applyDynamic("FAILURE_STRING")(value.asInstanceOf[js.Any]).asInstanceOf[String]
    
    @JSImport("tslint/lib/rules/strictTypePredicatesRule", "Rule.FAILURE_STRING_BAD_TYPEOF")
    @js.native
    def FAILURE_STRING_BAD_TYPEOF: String = js.native
    inline def FAILURE_STRING_BAD_TYPEOF_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("FAILURE_STRING_BAD_TYPEOF")(x.asInstanceOf[js.Any])
    
    @JSImport("tslint/lib/rules/strictTypePredicatesRule", "Rule.metadata")
    @js.native
    def metadata: IRuleMetadata = js.native
    inline def metadata_=(x: IRuleMetadata): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("metadata")(x.asInstanceOf[js.Any])
  }
}
