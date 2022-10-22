package typingsJapgolly.typescript.anon

import typingsJapgolly.typescript.mod.Identifier
import typingsJapgolly.typescript.mod.Modifier
import typingsJapgolly.typescript.mod.ModuleBlock
import typingsJapgolly.typescript.mod.ModuleReference
import typingsJapgolly.typescript.mod.Node
import typingsJapgolly.typescript.mod.NodeArray
import typingsJapgolly.typescript.mod.NodeFlags
import typingsJapgolly.typescript.mod.SourceFile
import typingsJapgolly.typescript.mod.SourceFileLike
import typingsJapgolly.typescript.mod.SyntaxKind.ImportEqualsDeclaration
import typingsJapgolly.typescript.mod.TypeOnlyAliasDeclaration
import typingsJapgolly.typescript.typescriptBooleans.`true`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined typescript.typescript.ImportEqualsDeclaration & { readonly isTypeOnly :true} */
@js.native
trait ImportEqualsDeclarationre
  extends StObject
     with TypeOnlyAliasDeclaration {
  
  var _declarationBrand: Any = js.native
  
  var _statementBrand: Any = js.native
  
  /**
    * @deprecated `decorators` has been removed from `Node` and merged with `modifiers` on the `Node` subtypes that support them.
    * Use `ts.canHaveDecorators()` to test whether a `Node` can have decorators.
    * Use `ts.getDecorators()` to get the decorators of a `Node`.
    *
    * For example:
    * ```ts
    * const decorators = ts.canHaveDecorators(node) ? ts.getDecorators(node) : undefined;
    * ```
    */
  val decorators: Unit = js.native
  
  val end: Double = js.native
  
  val flags: NodeFlags = js.native
  
  def forEachChild[T](cbNode: js.Function1[/* node */ Node, js.UndefOr[T]]): js.UndefOr[T] = js.native
  def forEachChild[T](
    cbNode: js.Function1[/* node */ Node, js.UndefOr[T]],
    cbNodeArray: js.Function1[/* nodes */ NodeArray[Node], js.UndefOr[T]]
  ): js.UndefOr[T] = js.native
  
  def getChildAt(index: Double): Node = js.native
  def getChildAt(index: Double, sourceFile: SourceFile): Node = js.native
  
  def getChildCount(): Double = js.native
  def getChildCount(sourceFile: SourceFile): Double = js.native
  
  def getChildren(): js.Array[Node] = js.native
  def getChildren(sourceFile: SourceFile): js.Array[Node] = js.native
  
  def getEnd(): Double = js.native
  
  def getFirstToken(): js.UndefOr[Node] = js.native
  def getFirstToken(sourceFile: SourceFile): js.UndefOr[Node] = js.native
  
  def getFullStart(): Double = js.native
  
  def getFullText(): String = js.native
  def getFullText(sourceFile: SourceFile): String = js.native
  
  def getFullWidth(): Double = js.native
  
  def getLastToken(): js.UndefOr[Node] = js.native
  def getLastToken(sourceFile: SourceFile): js.UndefOr[Node] = js.native
  
  def getLeadingTriviaWidth(): Double = js.native
  def getLeadingTriviaWidth(sourceFile: SourceFile): Double = js.native
  
  def getSourceFile(): SourceFile = js.native
  
  def getStart(): Double = js.native
  def getStart(sourceFile: Unit, includeJsDocComment: Boolean): Double = js.native
  def getStart(sourceFile: SourceFile): Double = js.native
  def getStart(sourceFile: SourceFile, includeJsDocComment: Boolean): Double = js.native
  
  def getText(): String = js.native
  def getText(sourceFile: SourceFile): String = js.native
  
  def getWidth(): Double = js.native
  def getWidth(sourceFile: SourceFileLike): Double = js.native
  
  val isTypeOnly: Boolean & `true` = js.native
  
  val kind: ImportEqualsDeclaration = js.native
  
  val modifiers: js.UndefOr[NodeArray[Modifier]] = js.native
  
  val moduleReference: ModuleReference = js.native
  
  val name: Identifier = js.native
  
  val parent: SourceFile | ModuleBlock = js.native
  
  val pos: Double = js.native
}
