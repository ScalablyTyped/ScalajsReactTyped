package typingsJapgolly.tslint

import typingsJapgolly.tslint.libLanguageRuleRuleMod.IOptions
import typingsJapgolly.tslint.libLanguageRuleRuleMod.IRuleMetadata
import typingsJapgolly.tslint.mod.Rules.OptionallyTypedRule
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libRulesObjectLiteralSortKeysRuleMod {
  
  @JSImport("tslint/lib/rules/objectLiteralSortKeysRule", "Rule")
  @js.native
  open class Rule protected () extends OptionallyTypedRule {
    def this(options: IOptions) = this()
  }
  /* static members */
  object Rule {
    
    @JSImport("tslint/lib/rules/objectLiteralSortKeysRule", "Rule")
    @js.native
    val ^ : js.Any = js.native
    
    inline def FAILURE_STRING_ALPHABETICAL(name: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("FAILURE_STRING_ALPHABETICAL")(name.asInstanceOf[js.Any]).asInstanceOf[String]
    
    inline def FAILURE_STRING_SHORTHAND_FIRST(name: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("FAILURE_STRING_SHORTHAND_FIRST")(name.asInstanceOf[js.Any]).asInstanceOf[String]
    
    inline def FAILURE_STRING_USE_DECLARATION_ORDER(propName: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("FAILURE_STRING_USE_DECLARATION_ORDER")(propName.asInstanceOf[js.Any]).asInstanceOf[String]
    inline def FAILURE_STRING_USE_DECLARATION_ORDER(propName: String, typeName: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("FAILURE_STRING_USE_DECLARATION_ORDER")(propName.asInstanceOf[js.Any], typeName.asInstanceOf[js.Any])).asInstanceOf[String]
    
    @JSImport("tslint/lib/rules/objectLiteralSortKeysRule", "Rule.metadata")
    @js.native
    def metadata: IRuleMetadata = js.native
    inline def metadata_=(x: IRuleMetadata): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("metadata")(x.asInstanceOf[js.Any])
  }
}
