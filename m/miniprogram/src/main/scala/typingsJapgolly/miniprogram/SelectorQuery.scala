package typingsJapgolly.miniprogram

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SelectorQuery extends StObject {
  
  /**
    * Put the location of the current selected node into the query
    * result. It is similar to the `getBoundingClientRect` of `DOM`,
    * the returned value includes width, height, left, top, bottom,
    * right. If current node is window object, only width and height will be returned.
    *
    * [Docs Link](https://miniprogram.alipay.com/docs/miniprogram/mpdev/api_ui_selector-query_query_selectorquery-boundingclientrect)
    */
  def boundingClientRect(): SelectorQuery
  
  /**
    * Put the query result into callback function. The query result
    * is an array according to the query sequence, the object in the
    *  array is the result of each query. If the selected node is
    * the list of node, the query result of the single query is also an array.
    *
    * [Docs Link](https://miniprogram.alipay.com/docs/miniprogram/mpdev/api_ui_selector-query_query_selectorquery-exec)
    */
  def exec(callback: SelectorQueryExecCallback): Unit
  
  /**
    * Put the scroll information of current selected node into the
    * query result, the returned value includes scrollTop, scrollLeft.
    *
    * [Docs Link](https://miniprogram.alipay.com/docs/miniprogram/mpdev/api_ui_selector-query_query_selectorquery-scrolloffset)
    */
  def scrollOffset(): SelectorQuery
  
  /**
    * Select the first node that matches the selector, the selector
    * can support ID selector and class selector.
    *
    * [Docs Link](https://miniprogram.alipay.com/docs/miniprogram/mpdev/api_ui_selector-query_query_selectorquery-select)
    */
  def select(value: String): SelectorQuery
  
  /**
    * Select all the nodes that match the selector, the selector can
    *  support ID selector and class selector.
    *
    * [Docs Link](https://miniprogram.alipay.com/docs/miniprogram/mpdev/api_ui_selector-query_query_selectorquery-selectall)
    */
  def selectAll(value: String): SelectorQuery
  
  /**
    * The object of select window.
    *
    * [Docs Link](https://miniprogram.alipay.com/docs/miniprogram/mpdev/api_ui_selector-query_query_selectorquery-selectviewport)
    */
  def selectViewport(): SelectorQuery
}
object SelectorQuery {
  
  inline def apply(
    boundingClientRect: CallbackTo[SelectorQuery],
    exec: SelectorQueryExecCallback => Callback,
    scrollOffset: CallbackTo[SelectorQuery],
    select: String => SelectorQuery,
    selectAll: String => SelectorQuery,
    selectViewport: CallbackTo[SelectorQuery]
  ): SelectorQuery = {
    val __obj = js.Dynamic.literal(boundingClientRect = boundingClientRect.toJsFn, exec = js.Any.fromFunction1((t0: SelectorQueryExecCallback) => exec(t0).runNow()), scrollOffset = scrollOffset.toJsFn, select = js.Any.fromFunction1(select), selectAll = js.Any.fromFunction1(selectAll), selectViewport = selectViewport.toJsFn)
    __obj.asInstanceOf[SelectorQuery]
  }
  
  extension [Self <: SelectorQuery](x: Self) {
    
    inline def setBoundingClientRect(value: CallbackTo[SelectorQuery]): Self = StObject.set(x, "boundingClientRect", value.toJsFn)
    
    inline def setExec(value: SelectorQueryExecCallback => Callback): Self = StObject.set(x, "exec", js.Any.fromFunction1((t0: SelectorQueryExecCallback) => value(t0).runNow()))
    
    inline def setScrollOffset(value: CallbackTo[SelectorQuery]): Self = StObject.set(x, "scrollOffset", value.toJsFn)
    
    inline def setSelect(value: String => SelectorQuery): Self = StObject.set(x, "select", js.Any.fromFunction1(value))
    
    inline def setSelectAll(value: String => SelectorQuery): Self = StObject.set(x, "selectAll", js.Any.fromFunction1(value))
    
    inline def setSelectViewport(value: CallbackTo[SelectorQuery]): Self = StObject.set(x, "selectViewport", value.toJsFn)
  }
}
