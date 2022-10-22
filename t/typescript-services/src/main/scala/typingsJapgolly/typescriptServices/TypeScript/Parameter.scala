package typingsJapgolly.typescriptServices.TypeScript

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Parameter
  extends StObject
     with AST {
  
  var dotDotDotToken: ASTSpan
  
  var equalsValueClause: EqualsValueClause
  
  var identifier: Identifier
  
  var modifiers: js.Array[PullElementFlags]
  
  var questionToken: ASTSpan
  
  var typeAnnotation: TypeAnnotation
}
object Parameter {
  
  inline def apply(
    _astID: Any,
    _end: Double,
    _postComments: Any,
    _preComments: Any,
    _start: Double,
    _trailingTriviaWidth: Double,
    dotDotDotToken: ASTSpan,
    end: CallbackTo[Double],
    equalsValueClause: EqualsValueClause,
    fileName: CallbackTo[String],
    identifier: Identifier,
    isExpression: CallbackTo[Boolean],
    kind: CallbackTo[SyntaxKind],
    modifiers: js.Array[PullElementFlags],
    parent: AST,
    postComments: CallbackTo[js.Array[Comment]],
    preComments: CallbackTo[js.Array[Comment]],
    questionToken: ASTSpan,
    setPostComments: js.Array[Comment] => Callback,
    setPreComments: js.Array[Comment] => Callback,
    start: CallbackTo[Double],
    structuralEquals: (AST, Boolean) => Boolean,
    syntaxID: CallbackTo[Double],
    trailingTriviaWidth: CallbackTo[Double],
    typeAnnotation: TypeAnnotation,
    width: CallbackTo[Double]
  ): Parameter = {
    val __obj = js.Dynamic.literal(_astID = _astID.asInstanceOf[js.Any], _end = _end.asInstanceOf[js.Any], _postComments = _postComments.asInstanceOf[js.Any], _preComments = _preComments.asInstanceOf[js.Any], _start = _start.asInstanceOf[js.Any], _trailingTriviaWidth = _trailingTriviaWidth.asInstanceOf[js.Any], dotDotDotToken = dotDotDotToken.asInstanceOf[js.Any], end = end.toJsFn, equalsValueClause = equalsValueClause.asInstanceOf[js.Any], fileName = fileName.toJsFn, identifier = identifier.asInstanceOf[js.Any], isExpression = isExpression.toJsFn, kind = kind.toJsFn, modifiers = modifiers.asInstanceOf[js.Any], parent = parent.asInstanceOf[js.Any], postComments = postComments.toJsFn, preComments = preComments.toJsFn, questionToken = questionToken.asInstanceOf[js.Any], setPostComments = js.Any.fromFunction1((t0: js.Array[Comment]) => setPostComments(t0).runNow()), setPreComments = js.Any.fromFunction1((t0: js.Array[Comment]) => setPreComments(t0).runNow()), start = start.toJsFn, structuralEquals = js.Any.fromFunction2(structuralEquals), syntaxID = syntaxID.toJsFn, trailingTriviaWidth = trailingTriviaWidth.toJsFn, typeAnnotation = typeAnnotation.asInstanceOf[js.Any], width = width.toJsFn)
    __obj.asInstanceOf[Parameter]
  }
  
  extension [Self <: Parameter](x: Self) {
    
    inline def setDotDotDotToken(value: ASTSpan): Self = StObject.set(x, "dotDotDotToken", value.asInstanceOf[js.Any])
    
    inline def setEqualsValueClause(value: EqualsValueClause): Self = StObject.set(x, "equalsValueClause", value.asInstanceOf[js.Any])
    
    inline def setIdentifier(value: Identifier): Self = StObject.set(x, "identifier", value.asInstanceOf[js.Any])
    
    inline def setModifiers(value: js.Array[PullElementFlags]): Self = StObject.set(x, "modifiers", value.asInstanceOf[js.Any])
    
    inline def setModifiersVarargs(value: PullElementFlags*): Self = StObject.set(x, "modifiers", js.Array(value*))
    
    inline def setQuestionToken(value: ASTSpan): Self = StObject.set(x, "questionToken", value.asInstanceOf[js.Any])
    
    inline def setTypeAnnotation(value: TypeAnnotation): Self = StObject.set(x, "typeAnnotation", value.asInstanceOf[js.Any])
  }
}
