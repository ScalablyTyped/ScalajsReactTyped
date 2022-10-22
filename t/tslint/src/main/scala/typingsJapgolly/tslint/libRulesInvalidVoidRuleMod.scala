package typingsJapgolly.tslint

import typingsJapgolly.tslint.libLanguageRuleRuleMod.IOptions
import typingsJapgolly.tslint.libLanguageRuleRuleMod.IRuleMetadata
import typingsJapgolly.tslint.mod.Rules.AbstractRule
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libRulesInvalidVoidRuleMod {
  
  @JSImport("tslint/lib/rules/invalidVoidRule", "Rule")
  @js.native
  open class Rule protected () extends AbstractRule {
    def this(options: IOptions) = this()
    
    /* private */ var getAllowGenerics: Any = js.native
  }
  /* static members */
  object Rule {
    
    @JSImport("tslint/lib/rules/invalidVoidRule", "Rule")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("tslint/lib/rules/invalidVoidRule", "Rule.FAILURE_STRING_ALLOW_GENERICS")
    @js.native
    def FAILURE_STRING_ALLOW_GENERICS: String = js.native
    inline def FAILURE_STRING_ALLOW_GENERICS_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("FAILURE_STRING_ALLOW_GENERICS")(x.asInstanceOf[js.Any])
    
    @JSImport("tslint/lib/rules/invalidVoidRule", "Rule.FAILURE_STRING_NO_GENERICS")
    @js.native
    def FAILURE_STRING_NO_GENERICS: String = js.native
    inline def FAILURE_STRING_NO_GENERICS_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("FAILURE_STRING_NO_GENERICS")(x.asInstanceOf[js.Any])
    
    inline def FAILURE_WRONG_GENERIC(genericName: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("FAILURE_WRONG_GENERIC")(genericName.asInstanceOf[js.Any]).asInstanceOf[String]
    
    @JSImport("tslint/lib/rules/invalidVoidRule", "Rule.metadata")
    @js.native
    def metadata: IRuleMetadata = js.native
    inline def metadata_=(x: IRuleMetadata): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("metadata")(x.asInstanceOf[js.Any])
  }
}
