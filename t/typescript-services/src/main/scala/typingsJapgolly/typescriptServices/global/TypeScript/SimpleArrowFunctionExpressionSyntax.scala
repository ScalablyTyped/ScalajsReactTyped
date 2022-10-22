package typingsJapgolly.typescriptServices.global.TypeScript

import typingsJapgolly.typescriptServices.TypeScript.IExpressionSyntax
import typingsJapgolly.typescriptServices.TypeScript.ISyntaxElement
import typingsJapgolly.typescriptServices.TypeScript.ISyntaxNodeOrToken
import typingsJapgolly.typescriptServices.TypeScript.ISyntaxToken
import typingsJapgolly.typescriptServices.TypeScript.ISyntaxTriviaList
import typingsJapgolly.typescriptServices.TypeScript.ISyntaxVisitor
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("TypeScript.SimpleArrowFunctionExpressionSyntax")
@js.native
open class SimpleArrowFunctionExpressionSyntax protected ()
  extends StObject
     with typingsJapgolly.typescriptServices.TypeScript.SimpleArrowFunctionExpressionSyntax {
  def this(
    identifier: ISyntaxToken,
    equalsGreaterThanToken: ISyntaxToken,
    block: typingsJapgolly.typescriptServices.TypeScript.BlockSyntax,
    expression: IExpressionSyntax,
    parsedInStrictMode: Boolean
  ) = this()
  
  /* CompleteClass */
  override def accept(visitor: ISyntaxVisitor): Any = js.native
  
  /* CompleteClass */
  var block: typingsJapgolly.typescriptServices.TypeScript.BlockSyntax = js.native
  
  /* CompleteClass */
  override def childAt(index: Double): ISyntaxElement = js.native
  
  /* CompleteClass */
  override def childCount(): Double = js.native
  
  /* CompleteClass */
  override def collectTextElements(elements: js.Array[String]): Unit = js.native
  
  /* CompleteClass */
  var equalsGreaterThanToken: ISyntaxToken = js.native
  
  /* CompleteClass */
  var expression: IExpressionSyntax = js.native
  
  /* CompleteClass */
  override def firstToken(): ISyntaxToken = js.native
  
  /* CompleteClass */
  override def fullText(): String = js.native
  
  /* CompleteClass */
  override def fullWidth(): Double = js.native
  
  /* CompleteClass */
  override def isArrowFunctionExpression(): Boolean = js.native
  
  /* InferMemberOverrides */
  override def isExpression(): Boolean = js.native
  
  /* CompleteClass */
  override def isIncrementallyUnusable(): Boolean = js.native
  
  /* CompleteClass */
  override def isList(): Boolean = js.native
  
  /* CompleteClass */
  override def isNode(): Boolean = js.native
  
  /* CompleteClass */
  override def isSeparatedList(): Boolean = js.native
  
  /* CompleteClass */
  override def isToken(): Boolean = js.native
  
  /* CompleteClass */
  override def isTypeScriptSpecific(): Boolean = js.native
  
  /* CompleteClass */
  override def isUnaryExpression(): Boolean = js.native
  
  /* CompleteClass */
  override def kind(): typingsJapgolly.typescriptServices.TypeScript.SyntaxKind = js.native
  
  /* CompleteClass */
  override def lastToken(): ISyntaxToken = js.native
  
  /* CompleteClass */
  override def leadingTrivia(): ISyntaxTriviaList = js.native
  
  /* CompleteClass */
  override def leadingTriviaWidth(): Double = js.native
  
  /* CompleteClass */
  override def trailingTrivia(): ISyntaxTriviaList = js.native
  
  /* CompleteClass */
  override def trailingTriviaWidth(): Double = js.native
  
  /* CompleteClass */
  override def width(): Double = js.native
  
  /* CompleteClass */
  override def withLeadingTrivia(leadingTrivia: ISyntaxTriviaList): ISyntaxNodeOrToken = js.native
  
  /* CompleteClass */
  override def withTrailingTrivia(trailingTrivia: ISyntaxTriviaList): ISyntaxNodeOrToken = js.native
}
object SimpleArrowFunctionExpressionSyntax {
  
  @JSGlobal("TypeScript.SimpleArrowFunctionExpressionSyntax")
  @js.native
  val ^ : js.Any = js.native
  
  /* static member */
  inline def create(identifier: ISyntaxToken, equalsGreaterThanToken: ISyntaxToken): typingsJapgolly.typescriptServices.TypeScript.SimpleArrowFunctionExpressionSyntax = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(identifier.asInstanceOf[js.Any], equalsGreaterThanToken.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.typescriptServices.TypeScript.SimpleArrowFunctionExpressionSyntax]
  
  /* static member */
  inline def create1(identifier: ISyntaxToken): typingsJapgolly.typescriptServices.TypeScript.SimpleArrowFunctionExpressionSyntax = ^.asInstanceOf[js.Dynamic].applyDynamic("create1")(identifier.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.typescriptServices.TypeScript.SimpleArrowFunctionExpressionSyntax]
}
