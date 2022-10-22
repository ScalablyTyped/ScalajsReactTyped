package typingsJapgolly.tslint

import typingsJapgolly.tslint.libLanguageRuleRuleMod.IOptions
import typingsJapgolly.typescript.mod.Program
import typingsJapgolly.typescript.mod.SourceFile
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libLanguageWalkerMod {
  
  /* note: abstract class */ @JSImport("tslint/lib/language/walker", "AbstractWalker")
  @js.native
  open class AbstractWalker[T] protected ()
    extends typingsJapgolly.tslint.libLanguageWalkerWalkerMod.AbstractWalker[T] {
    def this(sourceFile: SourceFile, ruleName: String, options: T) = this()
  }
  
  /* note: abstract class */ @JSImport("tslint/lib/language/walker", "BlockScopeAwareRuleWalker")
  @js.native
  open class BlockScopeAwareRuleWalker[T, U] protected ()
    extends typingsJapgolly.tslint.libLanguageWalkerBlockScopeAwareRuleWalkerMod.BlockScopeAwareRuleWalker[T, U] {
    def this(sourceFile: SourceFile, options: IOptions) = this()
  }
  
  @JSImport("tslint/lib/language/walker", "ProgramAwareRuleWalker")
  @js.native
  open class ProgramAwareRuleWalker protected ()
    extends typingsJapgolly.tslint.libLanguageWalkerProgramAwareRuleWalkerMod.ProgramAwareRuleWalker {
    def this(sourceFile: SourceFile, options: IOptions, program: Program) = this()
  }
  
  @JSImport("tslint/lib/language/walker", "RuleWalker")
  @js.native
  open class RuleWalker protected ()
    extends typingsJapgolly.tslint.libLanguageWalkerRuleWalkerMod.RuleWalker {
    def this(sourceFile: SourceFile, options: IOptions) = this()
  }
  
  /* note: abstract class */ @JSImport("tslint/lib/language/walker", "ScopeAwareRuleWalker")
  @js.native
  open class ScopeAwareRuleWalker[T] protected ()
    extends typingsJapgolly.tslint.libLanguageWalkerScopeAwareRuleWalkerMod.ScopeAwareRuleWalker[T] {
    def this(sourceFile: SourceFile, options: IOptions) = this()
  }
  
  @JSImport("tslint/lib/language/walker", "SyntaxWalker")
  @js.native
  open class SyntaxWalker ()
    extends typingsJapgolly.tslint.libLanguageWalkerSyntaxWalkerMod.SyntaxWalker
  
  @JSImport("tslint/lib/language/walker", "WalkContext")
  @js.native
  open class WalkContext[T] protected ()
    extends typingsJapgolly.tslint.libLanguageWalkerWalkContextMod.WalkContext[T] {
    def this(sourceFile: SourceFile, ruleName: String, options: T) = this()
  }
}
