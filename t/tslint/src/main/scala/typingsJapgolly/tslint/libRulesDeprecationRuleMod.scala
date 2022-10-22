package typingsJapgolly.tslint

import typingsJapgolly.tslint.libLanguageRuleRuleMod.IOptions
import typingsJapgolly.tslint.libLanguageRuleRuleMod.IRuleMetadata
import typingsJapgolly.tslint.mod.Rules.TypedRule
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libRulesDeprecationRuleMod {
  
  @JSImport("tslint/lib/rules/deprecationRule", "Rule")
  @js.native
  open class Rule protected () extends TypedRule {
    def this(options: IOptions) = this()
  }
  /* static members */
  object Rule {
    
    @JSImport("tslint/lib/rules/deprecationRule", "Rule")
    @js.native
    val ^ : js.Any = js.native
    
    inline def FAILURE_STRING(name: String, message: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("FAILURE_STRING")(name.asInstanceOf[js.Any], message.asInstanceOf[js.Any])).asInstanceOf[String]
    
    @JSImport("tslint/lib/rules/deprecationRule", "Rule.metadata")
    @js.native
    def metadata: IRuleMetadata = js.native
    inline def metadata_=(x: IRuleMetadata): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("metadata")(x.asInstanceOf[js.Any])
  }
}
