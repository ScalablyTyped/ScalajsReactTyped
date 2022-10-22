package typingsJapgolly.typescriptServices.TypeScript

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ClassDeclaration
  extends StObject
     with AST {
  
  var classElements: ISyntaxList2
  
  var closeBraceToken: ASTSpan
  
  var heritageClauses: ISyntaxList2
  
  var identifier: Identifier
  
  var modifiers: js.Array[PullElementFlags]
  
  def structuralEquals(ast: ClassDeclaration, includingPosition: Boolean): Boolean
  
  var typeParameterList: TypeParameterList
}
object ClassDeclaration {
  
  inline def apply(
    _astID: Any,
    _end: Double,
    _postComments: Any,
    _preComments: Any,
    _start: Double,
    _trailingTriviaWidth: Double,
    classElements: ISyntaxList2,
    closeBraceToken: ASTSpan,
    end: CallbackTo[Double],
    fileName: CallbackTo[String],
    heritageClauses: ISyntaxList2,
    identifier: Identifier,
    isExpression: CallbackTo[Boolean],
    kind: CallbackTo[SyntaxKind],
    modifiers: js.Array[PullElementFlags],
    parent: AST,
    postComments: CallbackTo[js.Array[Comment]],
    preComments: CallbackTo[js.Array[Comment]],
    setPostComments: js.Array[Comment] => Callback,
    setPreComments: js.Array[Comment] => Callback,
    start: CallbackTo[Double],
    structuralEquals: (ClassDeclaration, Boolean) => Boolean,
    syntaxID: CallbackTo[Double],
    trailingTriviaWidth: CallbackTo[Double],
    typeParameterList: TypeParameterList,
    width: CallbackTo[Double]
  ): ClassDeclaration = {
    val __obj = js.Dynamic.literal(_astID = _astID.asInstanceOf[js.Any], _end = _end.asInstanceOf[js.Any], _postComments = _postComments.asInstanceOf[js.Any], _preComments = _preComments.asInstanceOf[js.Any], _start = _start.asInstanceOf[js.Any], _trailingTriviaWidth = _trailingTriviaWidth.asInstanceOf[js.Any], classElements = classElements.asInstanceOf[js.Any], closeBraceToken = closeBraceToken.asInstanceOf[js.Any], end = end.toJsFn, fileName = fileName.toJsFn, heritageClauses = heritageClauses.asInstanceOf[js.Any], identifier = identifier.asInstanceOf[js.Any], isExpression = isExpression.toJsFn, kind = kind.toJsFn, modifiers = modifiers.asInstanceOf[js.Any], parent = parent.asInstanceOf[js.Any], postComments = postComments.toJsFn, preComments = preComments.toJsFn, setPostComments = js.Any.fromFunction1((t0: js.Array[Comment]) => setPostComments(t0).runNow()), setPreComments = js.Any.fromFunction1((t0: js.Array[Comment]) => setPreComments(t0).runNow()), start = start.toJsFn, structuralEquals = js.Any.fromFunction2(structuralEquals), syntaxID = syntaxID.toJsFn, trailingTriviaWidth = trailingTriviaWidth.toJsFn, typeParameterList = typeParameterList.asInstanceOf[js.Any], width = width.toJsFn)
    __obj.asInstanceOf[ClassDeclaration]
  }
  
  extension [Self <: ClassDeclaration](x: Self) {
    
    inline def setClassElements(value: ISyntaxList2): Self = StObject.set(x, "classElements", value.asInstanceOf[js.Any])
    
    inline def setCloseBraceToken(value: ASTSpan): Self = StObject.set(x, "closeBraceToken", value.asInstanceOf[js.Any])
    
    inline def setHeritageClauses(value: ISyntaxList2): Self = StObject.set(x, "heritageClauses", value.asInstanceOf[js.Any])
    
    inline def setIdentifier(value: Identifier): Self = StObject.set(x, "identifier", value.asInstanceOf[js.Any])
    
    inline def setModifiers(value: js.Array[PullElementFlags]): Self = StObject.set(x, "modifiers", value.asInstanceOf[js.Any])
    
    inline def setModifiersVarargs(value: PullElementFlags*): Self = StObject.set(x, "modifiers", js.Array(value*))
    
    inline def setStructuralEquals(value: (ClassDeclaration, Boolean) => Boolean): Self = StObject.set(x, "structuralEquals", js.Any.fromFunction2(value))
    
    inline def setTypeParameterList(value: TypeParameterList): Self = StObject.set(x, "typeParameterList", value.asInstanceOf[js.Any])
  }
}
