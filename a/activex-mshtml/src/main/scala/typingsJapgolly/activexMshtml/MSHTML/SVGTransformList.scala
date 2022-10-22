package typingsJapgolly.activexMshtml.MSHTML

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SVGTransformList extends StObject {
  
  /* private */ @JSName("MSHTML.SVGTransformList_typekey")
  var MSHTMLDotSVGTransformList_typekey: SVGTransformList
  
  def appendItem(newItem: SVGTransform): SVGTransform
  
  def clear(): Unit
  
  def consolidate(): SVGTransform
  
  def createSVGTransformFromMatrix(newItem: SVGMatrix): SVGTransform
  
  def getItem(index: Double): SVGTransform
  
  def initialize(newItem: SVGTransform): SVGTransform
  
  def insertItemBefore(newItem: SVGTransform, index: Double): SVGTransform
  
  var numberOfItems: Double
  
  def removeItem(index: Double): SVGTransform
  
  def replaceItem(newItem: SVGTransform, index: Double): SVGTransform
}
object SVGTransformList {
  
  inline def apply(
    MSHTMLDotSVGTransformList_typekey: SVGTransformList,
    appendItem: SVGTransform => SVGTransform,
    clear: Callback,
    consolidate: CallbackTo[SVGTransform],
    createSVGTransformFromMatrix: SVGMatrix => SVGTransform,
    getItem: Double => SVGTransform,
    initialize: SVGTransform => SVGTransform,
    insertItemBefore: (SVGTransform, Double) => SVGTransform,
    numberOfItems: Double,
    removeItem: Double => SVGTransform,
    replaceItem: (SVGTransform, Double) => SVGTransform
  ): SVGTransformList = {
    val __obj = js.Dynamic.literal(appendItem = js.Any.fromFunction1(appendItem), clear = clear.toJsFn, consolidate = consolidate.toJsFn, createSVGTransformFromMatrix = js.Any.fromFunction1(createSVGTransformFromMatrix), getItem = js.Any.fromFunction1(getItem), initialize = js.Any.fromFunction1(initialize), insertItemBefore = js.Any.fromFunction2(insertItemBefore), numberOfItems = numberOfItems.asInstanceOf[js.Any], removeItem = js.Any.fromFunction1(removeItem), replaceItem = js.Any.fromFunction2(replaceItem))
    __obj.updateDynamic("MSHTML.SVGTransformList_typekey")(MSHTMLDotSVGTransformList_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[SVGTransformList]
  }
  
  extension [Self <: SVGTransformList](x: Self) {
    
    inline def setAppendItem(value: SVGTransform => SVGTransform): Self = StObject.set(x, "appendItem", js.Any.fromFunction1(value))
    
    inline def setClear(value: Callback): Self = StObject.set(x, "clear", value.toJsFn)
    
    inline def setConsolidate(value: CallbackTo[SVGTransform]): Self = StObject.set(x, "consolidate", value.toJsFn)
    
    inline def setCreateSVGTransformFromMatrix(value: SVGMatrix => SVGTransform): Self = StObject.set(x, "createSVGTransformFromMatrix", js.Any.fromFunction1(value))
    
    inline def setGetItem(value: Double => SVGTransform): Self = StObject.set(x, "getItem", js.Any.fromFunction1(value))
    
    inline def setInitialize(value: SVGTransform => SVGTransform): Self = StObject.set(x, "initialize", js.Any.fromFunction1(value))
    
    inline def setInsertItemBefore(value: (SVGTransform, Double) => SVGTransform): Self = StObject.set(x, "insertItemBefore", js.Any.fromFunction2(value))
    
    inline def setMSHTMLDotSVGTransformList_typekey(value: SVGTransformList): Self = StObject.set(x, "MSHTML.SVGTransformList_typekey", value.asInstanceOf[js.Any])
    
    inline def setNumberOfItems(value: Double): Self = StObject.set(x, "numberOfItems", value.asInstanceOf[js.Any])
    
    inline def setRemoveItem(value: Double => SVGTransform): Self = StObject.set(x, "removeItem", js.Any.fromFunction1(value))
    
    inline def setReplaceItem(value: (SVGTransform, Double) => SVGTransform): Self = StObject.set(x, "replaceItem", js.Any.fromFunction2(value))
  }
}
