package typingsJapgolly.typescriptServices.TypeScript

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ISyntaxList
  extends StObject
     with ISyntaxElement {
  
  def insertChildrenInto(array: js.Array[ISyntaxElement], index: Double): Unit
  
  def toArray(): js.Array[ISyntaxNodeOrToken]
}
object ISyntaxList {
  
  inline def apply(
    childAt: Double => ISyntaxElement,
    childCount: CallbackTo[Double],
    collectTextElements: js.Array[String] => Callback,
    firstToken: CallbackTo[ISyntaxToken],
    fullText: CallbackTo[String],
    fullWidth: CallbackTo[Double],
    insertChildrenInto: (js.Array[ISyntaxElement], Double) => Callback,
    isIncrementallyUnusable: CallbackTo[Boolean],
    isList: CallbackTo[Boolean],
    isNode: CallbackTo[Boolean],
    isSeparatedList: CallbackTo[Boolean],
    isToken: CallbackTo[Boolean],
    isTypeScriptSpecific: CallbackTo[Boolean],
    kind: CallbackTo[SyntaxKind],
    lastToken: CallbackTo[ISyntaxToken],
    leadingTrivia: CallbackTo[ISyntaxTriviaList],
    leadingTriviaWidth: CallbackTo[Double],
    toArray: CallbackTo[js.Array[ISyntaxNodeOrToken]],
    trailingTrivia: CallbackTo[ISyntaxTriviaList],
    trailingTriviaWidth: CallbackTo[Double],
    width: CallbackTo[Double]
  ): ISyntaxList = {
    val __obj = js.Dynamic.literal(childAt = js.Any.fromFunction1(childAt), childCount = childCount.toJsFn, collectTextElements = js.Any.fromFunction1((t0: js.Array[String]) => collectTextElements(t0).runNow()), firstToken = firstToken.toJsFn, fullText = fullText.toJsFn, fullWidth = fullWidth.toJsFn, insertChildrenInto = js.Any.fromFunction2((t0: js.Array[ISyntaxElement], t1: Double) => (insertChildrenInto(t0, t1)).runNow()), isIncrementallyUnusable = isIncrementallyUnusable.toJsFn, isList = isList.toJsFn, isNode = isNode.toJsFn, isSeparatedList = isSeparatedList.toJsFn, isToken = isToken.toJsFn, isTypeScriptSpecific = isTypeScriptSpecific.toJsFn, kind = kind.toJsFn, lastToken = lastToken.toJsFn, leadingTrivia = leadingTrivia.toJsFn, leadingTriviaWidth = leadingTriviaWidth.toJsFn, toArray = toArray.toJsFn, trailingTrivia = trailingTrivia.toJsFn, trailingTriviaWidth = trailingTriviaWidth.toJsFn, width = width.toJsFn)
    __obj.asInstanceOf[ISyntaxList]
  }
  
  extension [Self <: ISyntaxList](x: Self) {
    
    inline def setInsertChildrenInto(value: (js.Array[ISyntaxElement], Double) => Callback): Self = StObject.set(x, "insertChildrenInto", js.Any.fromFunction2((t0: js.Array[ISyntaxElement], t1: Double) => (value(t0, t1)).runNow()))
    
    inline def setToArray(value: CallbackTo[js.Array[ISyntaxNodeOrToken]]): Self = StObject.set(x, "toArray", value.toJsFn)
  }
}
