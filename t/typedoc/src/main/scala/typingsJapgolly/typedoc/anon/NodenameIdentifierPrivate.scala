package typingsJapgolly.typedoc.anon

import typingsJapgolly.typescript.mod.ComputedPropertyName
import typingsJapgolly.typescript.mod.Identifier
import typingsJapgolly.typescript.mod.ModifierLike
import typingsJapgolly.typescript.mod.Node
import typingsJapgolly.typescript.mod.NodeArray
import typingsJapgolly.typescript.mod.NodeFlags
import typingsJapgolly.typescript.mod.PrivateIdentifier
import typingsJapgolly.typescript.mod.SourceFile
import typingsJapgolly.typescript.mod.SourceFileLike
import typingsJapgolly.typescript.mod.SyntaxKind
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined typescript.typescript.Node & {  name :typescript.typescript.Identifier | typescript.typescript.PrivateIdentifier | typescript.typescript.ComputedPropertyName} */
@js.native
trait NodenameIdentifierPrivate extends StObject {
  
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
  
  def forEachChild[T](cbNode: js.Function1[/* node */ this.type, js.UndefOr[T]]): js.UndefOr[T] = js.native
  def forEachChild[T](
    cbNode: js.Function1[/* node */ this.type, js.UndefOr[T]],
    cbNodeArray: js.Function1[/* nodes */ NodeArray[this.type], js.UndefOr[T]]
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
  
  val kind: SyntaxKind = js.native
  
  /**
    * @deprecated `modifiers` has been removed from `Node` and moved to the `Node` subtypes that support them.
    * Use `ts.canHaveModifiers()` to test whether a `Node` can have modifiers.
    * Use `ts.getModifiers()` to get the modifiers of a `Node`.
    *
    * For example:
    * ```ts
    * const modifiers = ts.canHaveModifiers(node) ? ts.getModifiers(node) : undefined;
    * ```
    */
  val modifiers: js.UndefOr[NodeArray[ModifierLike]] = js.native
  
  var name: Identifier | PrivateIdentifier | ComputedPropertyName = js.native
  
  val parent: Node = js.native
  
  val pos: Double = js.native
}
