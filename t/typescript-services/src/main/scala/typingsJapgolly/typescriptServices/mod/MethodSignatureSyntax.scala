package typingsJapgolly.typescriptServices.mod

import typingsJapgolly.typescriptServices.TypeScript.ISyntaxElement
import typingsJapgolly.typescriptServices.TypeScript.ISyntaxNodeOrToken
import typingsJapgolly.typescriptServices.TypeScript.ISyntaxToken
import typingsJapgolly.typescriptServices.TypeScript.ISyntaxTriviaList
import typingsJapgolly.typescriptServices.TypeScript.ISyntaxVisitor
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("typescript-services", "MethodSignatureSyntax")
@js.native
open class MethodSignatureSyntax protected ()
  extends StObject
     with typingsJapgolly.typescriptServices.TypeScript.MethodSignatureSyntax {
  def this(
    propertyName: ISyntaxToken,
    questionToken: ISyntaxToken,
    callSignature: typingsJapgolly.typescriptServices.TypeScript.CallSignatureSyntax,
    parsedInStrictMode: Boolean
  ) = this()
  
  /* CompleteClass */
  override def accept(visitor: ISyntaxVisitor): Any = js.native
  
  /* CompleteClass */
  override def childAt(index: Double): ISyntaxElement = js.native
  
  /* CompleteClass */
  override def childCount(): Double = js.native
  
  /* CompleteClass */
  override def collectTextElements(elements: js.Array[String]): Unit = js.native
  
  /* CompleteClass */
  override def firstToken(): ISyntaxToken = js.native
  
  /* CompleteClass */
  override def fullText(): String = js.native
  
  /* CompleteClass */
  override def fullWidth(): Double = js.native
  
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
object MethodSignatureSyntax {
  
  @JSImport("typescript-services", "MethodSignatureSyntax")
  @js.native
  val ^ : js.Any = js.native
  
  /* static member */
  inline def create(
    propertyName: ISyntaxToken,
    callSignature: typingsJapgolly.typescriptServices.TypeScript.CallSignatureSyntax
  ): typingsJapgolly.typescriptServices.TypeScript.MethodSignatureSyntax = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(propertyName.asInstanceOf[js.Any], callSignature.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.typescriptServices.TypeScript.MethodSignatureSyntax]
  
  /* static member */
  inline def create1(propertyName: ISyntaxToken): typingsJapgolly.typescriptServices.TypeScript.MethodSignatureSyntax = ^.asInstanceOf[js.Dynamic].applyDynamic("create1")(propertyName.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.typescriptServices.TypeScript.MethodSignatureSyntax]
}
