package typingsJapgolly.typescriptServices.TypeScript

import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PositionedSeparatedList
  extends StObject
     with PositionedElement {
  
  def list(): ISeparatedSyntaxList
}
object PositionedSeparatedList {
  
  inline def apply(
    _element: Any,
    _fullStart: Any,
    _parent: Any,
    childAt: Double => PositionedElement,
    childCount: CallbackTo[Double],
    childEnd: ISyntaxElement => Double,
    childEndAt: Double => Double,
    childIndex: ISyntaxElement => Double,
    childStart: ISyntaxElement => Double,
    childStartAt: Double => Double,
    containingNode: CallbackTo[PositionedNode],
    element: CallbackTo[ISyntaxElement],
    end: CallbackTo[Double],
    fullEnd: CallbackTo[Double],
    fullStart: CallbackTo[Double],
    fullWidth: CallbackTo[Double],
    getPositionedChild: ISyntaxElement => PositionedElement,
    kind: CallbackTo[SyntaxKind],
    list: CallbackTo[ISeparatedSyntaxList],
    parent: CallbackTo[PositionedElement],
    parentElement: CallbackTo[ISyntaxElement],
    root: CallbackTo[PositionedNode],
    start: CallbackTo[Double]
  ): PositionedSeparatedList = {
    val __obj = js.Dynamic.literal(_element = _element.asInstanceOf[js.Any], _fullStart = _fullStart.asInstanceOf[js.Any], _parent = _parent.asInstanceOf[js.Any], childAt = js.Any.fromFunction1(childAt), childCount = childCount.toJsFn, childEnd = js.Any.fromFunction1(childEnd), childEndAt = js.Any.fromFunction1(childEndAt), childIndex = js.Any.fromFunction1(childIndex), childStart = js.Any.fromFunction1(childStart), childStartAt = js.Any.fromFunction1(childStartAt), containingNode = containingNode.toJsFn, element = element.toJsFn, end = end.toJsFn, fullEnd = fullEnd.toJsFn, fullStart = fullStart.toJsFn, fullWidth = fullWidth.toJsFn, getPositionedChild = js.Any.fromFunction1(getPositionedChild), kind = kind.toJsFn, list = list.toJsFn, parent = parent.toJsFn, parentElement = parentElement.toJsFn, root = root.toJsFn, start = start.toJsFn)
    __obj.asInstanceOf[PositionedSeparatedList]
  }
  
  extension [Self <: PositionedSeparatedList](x: Self) {
    
    inline def setList(value: CallbackTo[ISeparatedSyntaxList]): Self = StObject.set(x, "list", value.toJsFn)
  }
}
