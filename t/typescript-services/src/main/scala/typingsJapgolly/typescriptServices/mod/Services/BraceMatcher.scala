package typingsJapgolly.typescriptServices.mod.Services

import typingsJapgolly.typescriptServices.TypeScript.SyntaxTree
import typingsJapgolly.typescriptServices.TypeScript.TextSpan
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("typescript-services", "Services.BraceMatcher")
@js.native
open class BraceMatcher ()
  extends StObject
     with typingsJapgolly.typescriptServices.TypeScript.Services.BraceMatcher
object BraceMatcher {
  
  @JSImport("typescript-services", "Services.BraceMatcher")
  @js.native
  val ^ : js.Any = js.native
  
  /* static member */
  inline def getMatchSpans(syntaxTree: SyntaxTree, position: Double): js.Array[TextSpan] = (^.asInstanceOf[js.Dynamic].applyDynamic("getMatchSpans")(syntaxTree.asInstanceOf[js.Any], position.asInstanceOf[js.Any])).asInstanceOf[js.Array[TextSpan]]
  
  /* static member */
  inline def getMatchingCloseBrace(currentToken: Any, position: Any, result: Any): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("getMatchingCloseBrace")(currentToken.asInstanceOf[js.Any], position.asInstanceOf[js.Any], result.asInstanceOf[js.Any])).asInstanceOf[Any]
  
  /* static member */
  inline def getMatchingCloseBraceTokenKind(positionedElement: Any): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("getMatchingCloseBraceTokenKind")(positionedElement.asInstanceOf[js.Any]).asInstanceOf[Any]
  
  /* static member */
  inline def getMatchingOpenBrace(currentToken: Any, position: Any, result: Any): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("getMatchingOpenBrace")(currentToken.asInstanceOf[js.Any], position.asInstanceOf[js.Any], result.asInstanceOf[js.Any])).asInstanceOf[Any]
  
  /* static member */
  inline def getMatchingOpenBraceTokenKind(positionedElement: Any): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("getMatchingOpenBraceTokenKind")(positionedElement.asInstanceOf[js.Any]).asInstanceOf[Any]
}
