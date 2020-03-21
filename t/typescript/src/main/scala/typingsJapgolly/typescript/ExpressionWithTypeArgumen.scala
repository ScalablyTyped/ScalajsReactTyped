package typingsJapgolly.typescript

import typingsJapgolly.typescript.mod.Decorator
import typingsJapgolly.typescript.mod.HeritageClause
import typingsJapgolly.typescript.mod.Identifier
import typingsJapgolly.typescript.mod.JSDocAugmentsTag
import typingsJapgolly.typescript.mod.LeftHandSideExpression
import typingsJapgolly.typescript.mod.ModifiersArray
import typingsJapgolly.typescript.mod.Node
import typingsJapgolly.typescript.mod.NodeArray
import typingsJapgolly.typescript.mod.NodeFlags
import typingsJapgolly.typescript.mod.PropertyAccessEntityNameExpression
import typingsJapgolly.typescript.mod.SourceFile
import typingsJapgolly.typescript.mod.SourceFileLike
import typingsJapgolly.typescript.mod.SyntaxKind.ExpressionWithTypeArguments
import typingsJapgolly.typescript.mod.TypeNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined typescript.typescript.ExpressionWithTypeArguments & {  expression  :typescript.typescript.Identifier | typescript.typescript.PropertyAccessEntityNameExpression} */
@js.native
trait ExpressionWithTypeArgumen extends js.Object {
  var _typeNodeBrand: js.Any = js.native
  var decorators: js.UndefOr[NodeArray[Decorator]] = js.native
  var end: Double = js.native
  var expression: LeftHandSideExpression with (Identifier | PropertyAccessEntityNameExpression) = js.native
  var flags: NodeFlags = js.native
  var kind: ExpressionWithTypeArguments = js.native
  var modifiers: js.UndefOr[ModifiersArray] = js.native
  var parent: HeritageClause | JSDocAugmentsTag = js.native
  var pos: Double = js.native
  var typeArguments: js.UndefOr[NodeArray[TypeNode]] = js.native
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
  def getStart(sourceFile: SourceFile): Double = js.native
  def getStart(sourceFile: SourceFile, includeJsDocComment: Boolean): Double = js.native
  def getText(): String = js.native
  def getText(sourceFile: SourceFile): String = js.native
  def getWidth(): Double = js.native
  def getWidth(sourceFile: SourceFileLike): Double = js.native
}

