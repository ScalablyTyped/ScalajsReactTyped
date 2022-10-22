package typingsJapgolly.activexMshtml.MSHTML

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IHTMLSelection extends StObject {
  
  /* private */ @JSName("MSHTML.IHTMLSelection_typekey")
  var MSHTMLDotIHTMLSelection_typekey: IHTMLSelection
  
  def addRange(range: Any): Unit
  
  val anchorNode: IHTMLDOMNode
  
  val anchorOffset: Double
  
  def collapse(parentNode: Any, offfset: Double): Unit
  
  def collapseToEnd(): Unit
  
  def collapseToStart(): Unit
  
  def deleteFromDocument(): Unit
  
  val focusNode: IHTMLDOMNode
  
  val focusOffset: Double
  
  def getRangeAt(index: Double): IHTMLDOMRange
  
  val isCollapsed: Boolean
  
  val rangeCount: Double
  
  def removeAllRanges(): Unit
  
  def removeRange(range: Any): Unit
  
  def selectAllChildren(parentNode: Any): Unit
}
object IHTMLSelection {
  
  inline def apply(
    MSHTMLDotIHTMLSelection_typekey: IHTMLSelection,
    addRange: Any => Callback,
    anchorNode: IHTMLDOMNode,
    anchorOffset: Double,
    collapse: (Any, Double) => Callback,
    collapseToEnd: Callback,
    collapseToStart: Callback,
    deleteFromDocument: Callback,
    focusNode: IHTMLDOMNode,
    focusOffset: Double,
    getRangeAt: Double => IHTMLDOMRange,
    isCollapsed: Boolean,
    rangeCount: Double,
    removeAllRanges: Callback,
    removeRange: Any => Callback,
    selectAllChildren: Any => Callback
  ): IHTMLSelection = {
    val __obj = js.Dynamic.literal(addRange = js.Any.fromFunction1((t0: Any) => addRange(t0).runNow()), anchorNode = anchorNode.asInstanceOf[js.Any], anchorOffset = anchorOffset.asInstanceOf[js.Any], collapse = js.Any.fromFunction2((t0: Any, t1: Double) => (collapse(t0, t1)).runNow()), collapseToEnd = collapseToEnd.toJsFn, collapseToStart = collapseToStart.toJsFn, deleteFromDocument = deleteFromDocument.toJsFn, focusNode = focusNode.asInstanceOf[js.Any], focusOffset = focusOffset.asInstanceOf[js.Any], getRangeAt = js.Any.fromFunction1(getRangeAt), isCollapsed = isCollapsed.asInstanceOf[js.Any], rangeCount = rangeCount.asInstanceOf[js.Any], removeAllRanges = removeAllRanges.toJsFn, removeRange = js.Any.fromFunction1((t0: Any) => removeRange(t0).runNow()), selectAllChildren = js.Any.fromFunction1((t0: Any) => selectAllChildren(t0).runNow()))
    __obj.updateDynamic("MSHTML.IHTMLSelection_typekey")(MSHTMLDotIHTMLSelection_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[IHTMLSelection]
  }
  
  extension [Self <: IHTMLSelection](x: Self) {
    
    inline def setAddRange(value: Any => Callback): Self = StObject.set(x, "addRange", js.Any.fromFunction1((t0: Any) => value(t0).runNow()))
    
    inline def setAnchorNode(value: IHTMLDOMNode): Self = StObject.set(x, "anchorNode", value.asInstanceOf[js.Any])
    
    inline def setAnchorOffset(value: Double): Self = StObject.set(x, "anchorOffset", value.asInstanceOf[js.Any])
    
    inline def setCollapse(value: (Any, Double) => Callback): Self = StObject.set(x, "collapse", js.Any.fromFunction2((t0: Any, t1: Double) => (value(t0, t1)).runNow()))
    
    inline def setCollapseToEnd(value: Callback): Self = StObject.set(x, "collapseToEnd", value.toJsFn)
    
    inline def setCollapseToStart(value: Callback): Self = StObject.set(x, "collapseToStart", value.toJsFn)
    
    inline def setDeleteFromDocument(value: Callback): Self = StObject.set(x, "deleteFromDocument", value.toJsFn)
    
    inline def setFocusNode(value: IHTMLDOMNode): Self = StObject.set(x, "focusNode", value.asInstanceOf[js.Any])
    
    inline def setFocusOffset(value: Double): Self = StObject.set(x, "focusOffset", value.asInstanceOf[js.Any])
    
    inline def setGetRangeAt(value: Double => IHTMLDOMRange): Self = StObject.set(x, "getRangeAt", js.Any.fromFunction1(value))
    
    inline def setIsCollapsed(value: Boolean): Self = StObject.set(x, "isCollapsed", value.asInstanceOf[js.Any])
    
    inline def setMSHTMLDotIHTMLSelection_typekey(value: IHTMLSelection): Self = StObject.set(x, "MSHTML.IHTMLSelection_typekey", value.asInstanceOf[js.Any])
    
    inline def setRangeCount(value: Double): Self = StObject.set(x, "rangeCount", value.asInstanceOf[js.Any])
    
    inline def setRemoveAllRanges(value: Callback): Self = StObject.set(x, "removeAllRanges", value.toJsFn)
    
    inline def setRemoveRange(value: Any => Callback): Self = StObject.set(x, "removeRange", js.Any.fromFunction1((t0: Any) => value(t0).runNow()))
    
    inline def setSelectAllChildren(value: Any => Callback): Self = StObject.set(x, "selectAllChildren", js.Any.fromFunction1((t0: Any) => value(t0).runNow()))
  }
}
