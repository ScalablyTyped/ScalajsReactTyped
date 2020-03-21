package typingsJapgolly.tslint

import typingsJapgolly.tslint.ruleMod.IOptions
import typingsJapgolly.typescript.mod.Program
import typingsJapgolly.typescript.mod.SourceFile
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("tslint/lib/language/walker", JSImport.Namespace)
@js.native
object walkerMod extends js.Object {
  @js.native
  abstract class AbstractWalker[T] ()
    extends typingsJapgolly.tslint.walkerWalkerMod.AbstractWalker[T]
  
  @js.native
  abstract class BlockScopeAwareRuleWalker[T, U] protected ()
    extends typingsJapgolly.tslint.blockScopeAwareRuleWalkerMod.BlockScopeAwareRuleWalker[T, U] {
    def this(sourceFile: SourceFile, options: IOptions) = this()
  }
  
  @js.native
  class ProgramAwareRuleWalker protected ()
    extends typingsJapgolly.tslint.programAwareRuleWalkerMod.ProgramAwareRuleWalker {
    def this(sourceFile: SourceFile, options: IOptions, program: Program) = this()
  }
  
  @js.native
  class RuleWalker protected ()
    extends typingsJapgolly.tslint.ruleWalkerMod.RuleWalker {
    def this(sourceFile: SourceFile, options: IOptions) = this()
  }
  
  @js.native
  abstract class ScopeAwareRuleWalker[T] protected ()
    extends typingsJapgolly.tslint.scopeAwareRuleWalkerMod.ScopeAwareRuleWalker[T] {
    def this(sourceFile: SourceFile, options: IOptions) = this()
  }
  
  @js.native
  class SyntaxWalker ()
    extends typingsJapgolly.tslint.syntaxWalkerMod.SyntaxWalker
  
  @js.native
  class WalkContext[T] protected ()
    extends typingsJapgolly.tslint.walkContextMod.WalkContext[T] {
    def this(sourceFile: SourceFile, ruleName: String, options: T) = this()
  }
  
}

