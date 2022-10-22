package typingsJapgolly.tslint

import typingsJapgolly.tslint.libLanguageRuleRuleMod.IOptions
import typingsJapgolly.tslint.libLanguageRuleRuleMod.IRuleMetadata
import typingsJapgolly.tslint.mod.Rules.AbstractRule
import typingsJapgolly.typescript.mod.Identifier
import typingsJapgolly.typescript.mod.NamedImports
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libRulesNoDefaultImportRuleMod {
  
  @JSImport("tslint/lib/rules/noDefaultImportRule", "Rule")
  @js.native
  open class Rule protected () extends AbstractRule {
    def this(options: IOptions) = this()
    
    /* private */ var getRuleOptions: Any = js.native
    
    /* private */ var isFromModulesConfigOption: Any = js.native
  }
  /* static members */
  object Rule {
    
    @JSImport("tslint/lib/rules/noDefaultImportRule", "Rule")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("tslint/lib/rules/noDefaultImportRule", "Rule.FAILURE_STRING")
    @js.native
    def FAILURE_STRING: String = js.native
    inline def FAILURE_STRING_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("FAILURE_STRING")(x.asInstanceOf[js.Any])
    
    inline def getNamedDefaultImport(namedBindings: NamedImports): Identifier | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("getNamedDefaultImport")(namedBindings.asInstanceOf[js.Any]).asInstanceOf[Identifier | Null]
    
    @JSImport("tslint/lib/rules/noDefaultImportRule", "Rule.metadata")
    @js.native
    def metadata: IRuleMetadata = js.native
    inline def metadata_=(x: IRuleMetadata): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("metadata")(x.asInstanceOf[js.Any])
  }
}
