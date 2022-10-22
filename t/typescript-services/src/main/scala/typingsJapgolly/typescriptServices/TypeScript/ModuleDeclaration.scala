package typingsJapgolly.typescriptServices.TypeScript

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ModuleDeclaration
  extends StObject
     with AST {
  
  var endingToken: ASTSpan
  
  var modifiers: js.Array[PullElementFlags]
  
  var moduleElements: ISyntaxList2
  
  var name: AST
  
  var stringLiteral: StringLiteral
  
  def structuralEquals(ast: ModuleDeclaration, includingPosition: Boolean): Boolean
}
object ModuleDeclaration {
  
  inline def apply(
    _astID: Any,
    _end: Double,
    _postComments: Any,
    _preComments: Any,
    _start: Double,
    _trailingTriviaWidth: Double,
    end: CallbackTo[Double],
    endingToken: ASTSpan,
    fileName: CallbackTo[String],
    isExpression: CallbackTo[Boolean],
    kind: CallbackTo[SyntaxKind],
    modifiers: js.Array[PullElementFlags],
    moduleElements: ISyntaxList2,
    name: AST,
    parent: AST,
    postComments: CallbackTo[js.Array[Comment]],
    preComments: CallbackTo[js.Array[Comment]],
    setPostComments: js.Array[Comment] => Callback,
    setPreComments: js.Array[Comment] => Callback,
    start: CallbackTo[Double],
    stringLiteral: StringLiteral,
    structuralEquals: (ModuleDeclaration, Boolean) => Boolean,
    syntaxID: CallbackTo[Double],
    trailingTriviaWidth: CallbackTo[Double],
    width: CallbackTo[Double]
  ): ModuleDeclaration = {
    val __obj = js.Dynamic.literal(_astID = _astID.asInstanceOf[js.Any], _end = _end.asInstanceOf[js.Any], _postComments = _postComments.asInstanceOf[js.Any], _preComments = _preComments.asInstanceOf[js.Any], _start = _start.asInstanceOf[js.Any], _trailingTriviaWidth = _trailingTriviaWidth.asInstanceOf[js.Any], end = end.toJsFn, endingToken = endingToken.asInstanceOf[js.Any], fileName = fileName.toJsFn, isExpression = isExpression.toJsFn, kind = kind.toJsFn, modifiers = modifiers.asInstanceOf[js.Any], moduleElements = moduleElements.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], parent = parent.asInstanceOf[js.Any], postComments = postComments.toJsFn, preComments = preComments.toJsFn, setPostComments = js.Any.fromFunction1((t0: js.Array[Comment]) => setPostComments(t0).runNow()), setPreComments = js.Any.fromFunction1((t0: js.Array[Comment]) => setPreComments(t0).runNow()), start = start.toJsFn, stringLiteral = stringLiteral.asInstanceOf[js.Any], structuralEquals = js.Any.fromFunction2(structuralEquals), syntaxID = syntaxID.toJsFn, trailingTriviaWidth = trailingTriviaWidth.toJsFn, width = width.toJsFn)
    __obj.asInstanceOf[ModuleDeclaration]
  }
  
  extension [Self <: ModuleDeclaration](x: Self) {
    
    inline def setEndingToken(value: ASTSpan): Self = StObject.set(x, "endingToken", value.asInstanceOf[js.Any])
    
    inline def setModifiers(value: js.Array[PullElementFlags]): Self = StObject.set(x, "modifiers", value.asInstanceOf[js.Any])
    
    inline def setModifiersVarargs(value: PullElementFlags*): Self = StObject.set(x, "modifiers", js.Array(value*))
    
    inline def setModuleElements(value: ISyntaxList2): Self = StObject.set(x, "moduleElements", value.asInstanceOf[js.Any])
    
    inline def setName(value: AST): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setStringLiteral(value: StringLiteral): Self = StObject.set(x, "stringLiteral", value.asInstanceOf[js.Any])
    
    inline def setStructuralEquals(value: (ModuleDeclaration, Boolean) => Boolean): Self = StObject.set(x, "structuralEquals", js.Any.fromFunction2(value))
  }
}
