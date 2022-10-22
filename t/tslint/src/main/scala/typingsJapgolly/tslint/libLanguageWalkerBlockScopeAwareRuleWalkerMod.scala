package typingsJapgolly.tslint

import typingsJapgolly.tslint.libLanguageRuleRuleMod.IOptions
import typingsJapgolly.tslint.libLanguageWalkerScopeAwareRuleWalkerMod.ScopeAwareRuleWalker
import typingsJapgolly.typescript.mod.Node
import typingsJapgolly.typescript.mod.SourceFile
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libLanguageWalkerBlockScopeAwareRuleWalkerMod {
  
  /* note: abstract class */ @JSImport("tslint/lib/language/walker/blockScopeAwareRuleWalker", "BlockScopeAwareRuleWalker")
  @js.native
  open class BlockScopeAwareRuleWalker[T, U] protected () extends ScopeAwareRuleWalker[T] {
    def this(sourceFile: SourceFile, options: IOptions) = this()
    
    /* private */ val blockScopeStack: Any = js.native
    
    def createBlockScope(node: Node): U = js.native
    
    def findBlockScope(predicate: js.Function1[/* scope */ U, Boolean]): js.UndefOr[U] = js.native
    
    def getAllBlockScopes(): js.Array[U] = js.native
    
    def getCurrentBlockDepth(): Double = js.native
    
    def getCurrentBlockScope(): U = js.native
    
    /* private */ var isBlockScopeBoundary: Any = js.native
    
    def onBlockScopeEnd(): Unit = js.native
    
    def onBlockScopeStart(): Unit = js.native
  }
}
