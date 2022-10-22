package typingsJapgolly.tslint

import typingsJapgolly.tslint.libLanguageRuleRuleMod.IOptions
import typingsJapgolly.tslint.libLanguageRuleRuleMod.IRuleMetadata
import typingsJapgolly.tslint.mod.Rules.AbstractRule
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libRulesLinebreakStyleRuleMod {
  
  @JSImport("tslint/lib/rules/linebreakStyleRule", "Rule")
  @js.native
  open class Rule protected () extends AbstractRule {
    def this(options: IOptions) = this()
  }
  /* static members */
  object Rule {
    
    @JSImport("tslint/lib/rules/linebreakStyleRule", "Rule")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("tslint/lib/rules/linebreakStyleRule", "Rule.FAILURE_CRLF")
    @js.native
    def FAILURE_CRLF: String = js.native
    inline def FAILURE_CRLF_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("FAILURE_CRLF")(x.asInstanceOf[js.Any])
    
    @JSImport("tslint/lib/rules/linebreakStyleRule", "Rule.FAILURE_LF")
    @js.native
    def FAILURE_LF: String = js.native
    inline def FAILURE_LF_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("FAILURE_LF")(x.asInstanceOf[js.Any])
    
    @JSImport("tslint/lib/rules/linebreakStyleRule", "Rule.metadata")
    @js.native
    def metadata: IRuleMetadata = js.native
    inline def metadata_=(x: IRuleMetadata): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("metadata")(x.asInstanceOf[js.Any])
  }
}
