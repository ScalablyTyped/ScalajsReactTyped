package typingsJapgolly.tslint

import typingsJapgolly.tslint.libLanguageRuleRuleMod.IOptions
import typingsJapgolly.tslint.libLanguageRuleRuleMod.IRuleMetadata
import typingsJapgolly.tslint.mod.Rules.AbstractRule
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libRulesOrderedImportsRuleMod {
  
  @JSImport("tslint/lib/rules/orderedImportsRule", "Rule")
  @js.native
  open class Rule protected () extends AbstractRule {
    def this(options: IOptions) = this()
  }
  /* static members */
  object Rule {
    
    @JSImport("tslint/lib/rules/orderedImportsRule", "Rule")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("tslint/lib/rules/orderedImportsRule", "Rule.IMPORT_SOURCES_NOT_GROUPED_PREFIX")
    @js.native
    def IMPORT_SOURCES_NOT_GROUPED_PREFIX: String = js.native
    inline def IMPORT_SOURCES_NOT_GROUPED_PREFIX_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("IMPORT_SOURCES_NOT_GROUPED_PREFIX")(x.asInstanceOf[js.Any])
    
    @JSImport("tslint/lib/rules/orderedImportsRule", "Rule.IMPORT_SOURCES_UNORDERED")
    @js.native
    def IMPORT_SOURCES_UNORDERED: String = js.native
    inline def IMPORT_SOURCES_UNORDERED_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("IMPORT_SOURCES_UNORDERED")(x.asInstanceOf[js.Any])
    
    @JSImport("tslint/lib/rules/orderedImportsRule", "Rule.NAMED_IMPORTS_UNORDERED")
    @js.native
    def NAMED_IMPORTS_UNORDERED: String = js.native
    inline def NAMED_IMPORTS_UNORDERED_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("NAMED_IMPORTS_UNORDERED")(x.asInstanceOf[js.Any])
    
    @JSImport("tslint/lib/rules/orderedImportsRule", "Rule.metadata")
    @js.native
    def metadata: IRuleMetadata = js.native
    inline def metadata_=(x: IRuleMetadata): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("metadata")(x.asInstanceOf[js.Any])
  }
}
