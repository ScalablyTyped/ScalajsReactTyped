package typingsJapgolly.typescriptServices.TypeScript

import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PositionedElement extends StObject {
  
  /* private */ var _element: Any
  
  /* private */ var _fullStart: Any
  
  /* private */ var _parent: Any
  
  def childAt(index: Double): PositionedElement
  
  def childCount(): Double
  
  def childEnd(child: ISyntaxElement): Double
  
  def childEndAt(index: Double): Double
  
  def childIndex(child: ISyntaxElement): Double
  
  def childStart(child: ISyntaxElement): Double
  
  def childStartAt(index: Double): Double
  
  def containingNode(): PositionedNode
  
  def element(): ISyntaxElement
  
  def end(): Double
  
  def fullEnd(): Double
  
  def fullStart(): Double
  
  def fullWidth(): Double
  
  def getPositionedChild(child: ISyntaxElement): PositionedElement
  
  def kind(): SyntaxKind
  
  def parent(): PositionedElement
  
  def parentElement(): ISyntaxElement
  
  def root(): PositionedNode
  
  def start(): Double
}
object PositionedElement {
  
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
    parent: CallbackTo[PositionedElement],
    parentElement: CallbackTo[ISyntaxElement],
    root: CallbackTo[PositionedNode],
    start: CallbackTo[Double]
  ): PositionedElement = {
    val __obj = js.Dynamic.literal(_element = _element.asInstanceOf[js.Any], _fullStart = _fullStart.asInstanceOf[js.Any], _parent = _parent.asInstanceOf[js.Any], childAt = js.Any.fromFunction1(childAt), childCount = childCount.toJsFn, childEnd = js.Any.fromFunction1(childEnd), childEndAt = js.Any.fromFunction1(childEndAt), childIndex = js.Any.fromFunction1(childIndex), childStart = js.Any.fromFunction1(childStart), childStartAt = js.Any.fromFunction1(childStartAt), containingNode = containingNode.toJsFn, element = element.toJsFn, end = end.toJsFn, fullEnd = fullEnd.toJsFn, fullStart = fullStart.toJsFn, fullWidth = fullWidth.toJsFn, getPositionedChild = js.Any.fromFunction1(getPositionedChild), kind = kind.toJsFn, parent = parent.toJsFn, parentElement = parentElement.toJsFn, root = root.toJsFn, start = start.toJsFn)
    __obj.asInstanceOf[PositionedElement]
  }
  
  extension [Self <: PositionedElement](x: Self) {
    
    inline def setChildAt(value: Double => PositionedElement): Self = StObject.set(x, "childAt", js.Any.fromFunction1(value))
    
    inline def setChildCount(value: CallbackTo[Double]): Self = StObject.set(x, "childCount", value.toJsFn)
    
    inline def setChildEnd(value: ISyntaxElement => Double): Self = StObject.set(x, "childEnd", js.Any.fromFunction1(value))
    
    inline def setChildEndAt(value: Double => Double): Self = StObject.set(x, "childEndAt", js.Any.fromFunction1(value))
    
    inline def setChildIndex(value: ISyntaxElement => Double): Self = StObject.set(x, "childIndex", js.Any.fromFunction1(value))
    
    inline def setChildStart(value: ISyntaxElement => Double): Self = StObject.set(x, "childStart", js.Any.fromFunction1(value))
    
    inline def setChildStartAt(value: Double => Double): Self = StObject.set(x, "childStartAt", js.Any.fromFunction1(value))
    
    inline def setContainingNode(value: CallbackTo[PositionedNode]): Self = StObject.set(x, "containingNode", value.toJsFn)
    
    inline def setElement(value: CallbackTo[ISyntaxElement]): Self = StObject.set(x, "element", value.toJsFn)
    
    inline def setEnd(value: CallbackTo[Double]): Self = StObject.set(x, "end", value.toJsFn)
    
    inline def setFullEnd(value: CallbackTo[Double]): Self = StObject.set(x, "fullEnd", value.toJsFn)
    
    inline def setFullStart(value: CallbackTo[Double]): Self = StObject.set(x, "fullStart", value.toJsFn)
    
    inline def setFullWidth(value: CallbackTo[Double]): Self = StObject.set(x, "fullWidth", value.toJsFn)
    
    inline def setGetPositionedChild(value: ISyntaxElement => PositionedElement): Self = StObject.set(x, "getPositionedChild", js.Any.fromFunction1(value))
    
    inline def setKind(value: CallbackTo[SyntaxKind]): Self = StObject.set(x, "kind", value.toJsFn)
    
    inline def setParent(value: CallbackTo[PositionedElement]): Self = StObject.set(x, "parent", value.toJsFn)
    
    inline def setParentElement(value: CallbackTo[ISyntaxElement]): Self = StObject.set(x, "parentElement", value.toJsFn)
    
    inline def setRoot(value: CallbackTo[PositionedNode]): Self = StObject.set(x, "root", value.toJsFn)
    
    inline def setStart(value: CallbackTo[Double]): Self = StObject.set(x, "start", value.toJsFn)
    
    inline def set_element(value: Any): Self = StObject.set(x, "_element", value.asInstanceOf[js.Any])
    
    inline def set_fullStart(value: Any): Self = StObject.set(x, "_fullStart", value.asInstanceOf[js.Any])
    
    inline def set_parent(value: Any): Self = StObject.set(x, "_parent", value.asInstanceOf[js.Any])
  }
}
