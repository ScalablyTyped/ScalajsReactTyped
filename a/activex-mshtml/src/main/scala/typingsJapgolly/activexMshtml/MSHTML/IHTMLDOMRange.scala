package typingsJapgolly.activexMshtml.MSHTML

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IHTMLDOMRange extends StObject {
  
  def Detach(): Unit
  
  /* private */ @JSName("MSHTML.IHTMLDOMRange_typekey")
  var MSHTMLDotIHTMLDOMRange_typekey: IHTMLDOMRange
  
  def cloneContents(): Any
  
  def cloneRange(): IHTMLDOMRange
  
  def collapse(toStart: Boolean): Unit
  
  val collapsed: Boolean
  
  val commonAncestorContainer: IHTMLDOMNode
  
  def compareBoundaryPoints(how: Double, sourceRange: Any): Double
  
  def deleteContents(): Unit
  
  val endContainer: IHTMLDOMNode
  
  val endOffset: Double
  
  def extractContents(): Any
  
  def getBoundingClientRect(): IHTMLRect
  
  def getClientRects(): IHTMLRectCollection
  
  def insertNode(newNode: Any): Unit
  
  def selectNode(refNode: Any): Unit
  
  def selectNodeContents(refNode: Any): Unit
  
  def setEnd(refNode: Any, offset: Double): Unit
  
  def setEndAfter(refNode: Any): Unit
  
  def setEndBefore(refNode: Any): Unit
  
  def setStart(refNode: Any, offset: Double): Unit
  
  def setStartAfter(refNode: Any): Unit
  
  def setStartBefore(refNode: Any): Unit
  
  val startContainer: IHTMLDOMNode
  
  val startOffset: Double
  
  def surroundContents(newParent: Any): Unit
}
object IHTMLDOMRange {
  
  inline def apply(
    Detach: Callback,
    MSHTMLDotIHTMLDOMRange_typekey: IHTMLDOMRange,
    cloneContents: CallbackTo[Any],
    cloneRange: CallbackTo[IHTMLDOMRange],
    collapse: Boolean => Callback,
    collapsed: Boolean,
    commonAncestorContainer: IHTMLDOMNode,
    compareBoundaryPoints: (Double, Any) => Double,
    deleteContents: Callback,
    endContainer: IHTMLDOMNode,
    endOffset: Double,
    extractContents: CallbackTo[Any],
    getBoundingClientRect: CallbackTo[IHTMLRect],
    getClientRects: CallbackTo[IHTMLRectCollection],
    insertNode: Any => Callback,
    selectNode: Any => Callback,
    selectNodeContents: Any => Callback,
    setEnd: (Any, Double) => Callback,
    setEndAfter: Any => Callback,
    setEndBefore: Any => Callback,
    setStart: (Any, Double) => Callback,
    setStartAfter: Any => Callback,
    setStartBefore: Any => Callback,
    startContainer: IHTMLDOMNode,
    startOffset: Double,
    surroundContents: Any => Callback
  ): IHTMLDOMRange = {
    val __obj = js.Dynamic.literal(Detach = Detach.toJsFn, cloneContents = cloneContents.toJsFn, cloneRange = cloneRange.toJsFn, collapse = js.Any.fromFunction1((t0: Boolean) => collapse(t0).runNow()), collapsed = collapsed.asInstanceOf[js.Any], commonAncestorContainer = commonAncestorContainer.asInstanceOf[js.Any], compareBoundaryPoints = js.Any.fromFunction2(compareBoundaryPoints), deleteContents = deleteContents.toJsFn, endContainer = endContainer.asInstanceOf[js.Any], endOffset = endOffset.asInstanceOf[js.Any], extractContents = extractContents.toJsFn, getBoundingClientRect = getBoundingClientRect.toJsFn, getClientRects = getClientRects.toJsFn, insertNode = js.Any.fromFunction1((t0: Any) => insertNode(t0).runNow()), selectNode = js.Any.fromFunction1((t0: Any) => selectNode(t0).runNow()), selectNodeContents = js.Any.fromFunction1((t0: Any) => selectNodeContents(t0).runNow()), setEnd = js.Any.fromFunction2((t0: Any, t1: Double) => (setEnd(t0, t1)).runNow()), setEndAfter = js.Any.fromFunction1((t0: Any) => setEndAfter(t0).runNow()), setEndBefore = js.Any.fromFunction1((t0: Any) => setEndBefore(t0).runNow()), setStart = js.Any.fromFunction2((t0: Any, t1: Double) => (setStart(t0, t1)).runNow()), setStartAfter = js.Any.fromFunction1((t0: Any) => setStartAfter(t0).runNow()), setStartBefore = js.Any.fromFunction1((t0: Any) => setStartBefore(t0).runNow()), startContainer = startContainer.asInstanceOf[js.Any], startOffset = startOffset.asInstanceOf[js.Any], surroundContents = js.Any.fromFunction1((t0: Any) => surroundContents(t0).runNow()))
    __obj.updateDynamic("MSHTML.IHTMLDOMRange_typekey")(MSHTMLDotIHTMLDOMRange_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[IHTMLDOMRange]
  }
  
  extension [Self <: IHTMLDOMRange](x: Self) {
    
    inline def setCloneContents(value: CallbackTo[Any]): Self = StObject.set(x, "cloneContents", value.toJsFn)
    
    inline def setCloneRange(value: CallbackTo[IHTMLDOMRange]): Self = StObject.set(x, "cloneRange", value.toJsFn)
    
    inline def setCollapse(value: Boolean => Callback): Self = StObject.set(x, "collapse", js.Any.fromFunction1((t0: Boolean) => value(t0).runNow()))
    
    inline def setCollapsed(value: Boolean): Self = StObject.set(x, "collapsed", value.asInstanceOf[js.Any])
    
    inline def setCommonAncestorContainer(value: IHTMLDOMNode): Self = StObject.set(x, "commonAncestorContainer", value.asInstanceOf[js.Any])
    
    inline def setCompareBoundaryPoints(value: (Double, Any) => Double): Self = StObject.set(x, "compareBoundaryPoints", js.Any.fromFunction2(value))
    
    inline def setDeleteContents(value: Callback): Self = StObject.set(x, "deleteContents", value.toJsFn)
    
    inline def setDetach(value: Callback): Self = StObject.set(x, "Detach", value.toJsFn)
    
    inline def setEndContainer(value: IHTMLDOMNode): Self = StObject.set(x, "endContainer", value.asInstanceOf[js.Any])
    
    inline def setEndOffset(value: Double): Self = StObject.set(x, "endOffset", value.asInstanceOf[js.Any])
    
    inline def setExtractContents(value: CallbackTo[Any]): Self = StObject.set(x, "extractContents", value.toJsFn)
    
    inline def setGetBoundingClientRect(value: CallbackTo[IHTMLRect]): Self = StObject.set(x, "getBoundingClientRect", value.toJsFn)
    
    inline def setGetClientRects(value: CallbackTo[IHTMLRectCollection]): Self = StObject.set(x, "getClientRects", value.toJsFn)
    
    inline def setInsertNode(value: Any => Callback): Self = StObject.set(x, "insertNode", js.Any.fromFunction1((t0: Any) => value(t0).runNow()))
    
    inline def setMSHTMLDotIHTMLDOMRange_typekey(value: IHTMLDOMRange): Self = StObject.set(x, "MSHTML.IHTMLDOMRange_typekey", value.asInstanceOf[js.Any])
    
    inline def setSelectNode(value: Any => Callback): Self = StObject.set(x, "selectNode", js.Any.fromFunction1((t0: Any) => value(t0).runNow()))
    
    inline def setSelectNodeContents(value: Any => Callback): Self = StObject.set(x, "selectNodeContents", js.Any.fromFunction1((t0: Any) => value(t0).runNow()))
    
    inline def setSetEnd(value: (Any, Double) => Callback): Self = StObject.set(x, "setEnd", js.Any.fromFunction2((t0: Any, t1: Double) => (value(t0, t1)).runNow()))
    
    inline def setSetEndAfter(value: Any => Callback): Self = StObject.set(x, "setEndAfter", js.Any.fromFunction1((t0: Any) => value(t0).runNow()))
    
    inline def setSetEndBefore(value: Any => Callback): Self = StObject.set(x, "setEndBefore", js.Any.fromFunction1((t0: Any) => value(t0).runNow()))
    
    inline def setSetStart(value: (Any, Double) => Callback): Self = StObject.set(x, "setStart", js.Any.fromFunction2((t0: Any, t1: Double) => (value(t0, t1)).runNow()))
    
    inline def setSetStartAfter(value: Any => Callback): Self = StObject.set(x, "setStartAfter", js.Any.fromFunction1((t0: Any) => value(t0).runNow()))
    
    inline def setSetStartBefore(value: Any => Callback): Self = StObject.set(x, "setStartBefore", js.Any.fromFunction1((t0: Any) => value(t0).runNow()))
    
    inline def setStartContainer(value: IHTMLDOMNode): Self = StObject.set(x, "startContainer", value.asInstanceOf[js.Any])
    
    inline def setStartOffset(value: Double): Self = StObject.set(x, "startOffset", value.asInstanceOf[js.Any])
    
    inline def setSurroundContents(value: Any => Callback): Self = StObject.set(x, "surroundContents", js.Any.fromFunction1((t0: Any) => value(t0).runNow()))
  }
}
