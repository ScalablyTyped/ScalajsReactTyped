package typingsJapgolly.tslint

import typingsJapgolly.tslint.ruleMod.IOptions
import typingsJapgolly.tslint.scopeAwareRuleWalkerMod.ScopeAwareRuleWalker
import typingsJapgolly.typescript.mod.Node
import typingsJapgolly.typescript.mod.SourceFile
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("tslint/lib/language/walker/blockScopeAwareRuleWalker", JSImport.Namespace)
@js.native
object blockScopeAwareRuleWalkerMod extends js.Object {
  @js.native
  abstract class BlockScopeAwareRuleWalker[T, U] protected () extends ScopeAwareRuleWalker[T] {
    def this(sourceFile: SourceFile, options: IOptions) = this()
    val blockScopeStack: js.Any = js.native
    var isBlockScopeBoundary: js.Any = js.native
    def createBlockScope(node: Node): U = js.native
    def findBlockScope(predicate: js.Function1[/* scope */ U, Boolean]): js.UndefOr[U] = js.native
    def getAllBlockScopes(): js.Array[U] = js.native
    def getCurrentBlockDepth(): Double = js.native
    def getCurrentBlockScope(): U = js.native
    def onBlockScopeEnd(): Unit = js.native
    def onBlockScopeStart(): Unit = js.native
  }
  
}

