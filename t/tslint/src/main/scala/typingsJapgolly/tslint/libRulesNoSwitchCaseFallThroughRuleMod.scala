package typingsJapgolly.tslint

import typingsJapgolly.tslint.libLanguageRuleRuleMod.IOptions
import typingsJapgolly.tslint.libLanguageRuleRuleMod.IRuleMetadata
import typingsJapgolly.tslint.mod.AbstractWalker
import typingsJapgolly.tslint.mod.Rules.AbstractRule
import typingsJapgolly.typescript.mod.SourceFile
import typingsJapgolly.typescript.mod.SyntaxKind
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libRulesNoSwitchCaseFallThroughRuleMod {
  
  @JSImport("tslint/lib/rules/noSwitchCaseFallThroughRule", "NoSwitchCaseFallThroughWalker")
  @js.native
  open class NoSwitchCaseFallThroughWalker protected () extends AbstractWalker[Unit] {
    def this(sourceFile: SourceFile, ruleName: String, options: Unit) = this()
    
    /* private */ var isFallThroughAllowed: Any = js.native
    
    /* private */ var visitSwitchStatement: Any = js.native
  }
  
  @JSImport("tslint/lib/rules/noSwitchCaseFallThroughRule", "Rule")
  @js.native
  open class Rule protected () extends AbstractRule {
    def this(options: IOptions) = this()
  }
  /* static members */
  object Rule {
    
    @JSImport("tslint/lib/rules/noSwitchCaseFallThroughRule", "Rule")
    @js.native
    val ^ : js.Any = js.native
    
    inline def FAILURE_STRING(keyword: SyntaxKind): String = ^.asInstanceOf[js.Dynamic].applyDynamic("FAILURE_STRING")(keyword.asInstanceOf[js.Any]).asInstanceOf[String]
    
    @JSImport("tslint/lib/rules/noSwitchCaseFallThroughRule", "Rule.metadata")
    @js.native
    def metadata: IRuleMetadata = js.native
    inline def metadata_=(x: IRuleMetadata): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("metadata")(x.asInstanceOf[js.Any])
  }
}
