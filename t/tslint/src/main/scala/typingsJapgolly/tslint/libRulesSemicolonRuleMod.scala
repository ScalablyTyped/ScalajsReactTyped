package typingsJapgolly.tslint

import typingsJapgolly.tslint.libLanguageRuleRuleMod.IOptions
import typingsJapgolly.tslint.libLanguageRuleRuleMod.IRuleMetadata
import typingsJapgolly.tslint.mod.Rules.AbstractRule
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libRulesSemicolonRuleMod {
  
  @JSImport("tslint/lib/rules/semicolonRule", "Rule")
  @js.native
  open class Rule protected () extends AbstractRule {
    def this(options: IOptions) = this()
  }
  /* static members */
  object Rule {
    
    @JSImport("tslint/lib/rules/semicolonRule", "Rule")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("tslint/lib/rules/semicolonRule", "Rule.FAILURE_STRING_COMMA")
    @js.native
    def FAILURE_STRING_COMMA: String = js.native
    inline def FAILURE_STRING_COMMA_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("FAILURE_STRING_COMMA")(x.asInstanceOf[js.Any])
    
    @JSImport("tslint/lib/rules/semicolonRule", "Rule.FAILURE_STRING_MISSING")
    @js.native
    def FAILURE_STRING_MISSING: String = js.native
    inline def FAILURE_STRING_MISSING_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("FAILURE_STRING_MISSING")(x.asInstanceOf[js.Any])
    
    @JSImport("tslint/lib/rules/semicolonRule", "Rule.FAILURE_STRING_UNNECESSARY")
    @js.native
    def FAILURE_STRING_UNNECESSARY: String = js.native
    inline def FAILURE_STRING_UNNECESSARY_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("FAILURE_STRING_UNNECESSARY")(x.asInstanceOf[js.Any])
    
    @JSImport("tslint/lib/rules/semicolonRule", "Rule.metadata")
    @js.native
    def metadata: IRuleMetadata = js.native
    inline def metadata_=(x: IRuleMetadata): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("metadata")(x.asInstanceOf[js.Any])
  }
}
