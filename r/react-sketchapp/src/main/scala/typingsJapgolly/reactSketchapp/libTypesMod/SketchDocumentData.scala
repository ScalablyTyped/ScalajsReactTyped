package typingsJapgolly.reactSketchapp.libTypesMod

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SketchDocumentData extends StObject {
  
  def addBlankPage(): SketchPage
  
  def assets(): SketchAssetCollection
  
  def currentPage(): SketchPage
  
  def delegate(): SketchDocument
  
  def layerStyles(): Unit
  
  def layerSymbols(): Unit
  
  def layerTextStyles(): SketchSharedStyleContainer
  
  def pages(): MSArray[SketchPage]
  
  def removePageAtIndex(index: Double): Unit
  
  def setCurrentPage(page: SketchPage): Unit
  
  def symbolMap(): StringDictionary[SketchLayer]
  
  def symbolsPageOrCreateIfNecessary(): SketchPage
}
object SketchDocumentData {
  
  inline def apply(
    addBlankPage: CallbackTo[SketchPage],
    assets: CallbackTo[SketchAssetCollection],
    currentPage: CallbackTo[SketchPage],
    delegate: CallbackTo[SketchDocument],
    layerStyles: Callback,
    layerSymbols: Callback,
    layerTextStyles: CallbackTo[SketchSharedStyleContainer],
    pages: CallbackTo[MSArray[SketchPage]],
    removePageAtIndex: Double => Callback,
    setCurrentPage: SketchPage => Callback,
    symbolMap: CallbackTo[StringDictionary[SketchLayer]],
    symbolsPageOrCreateIfNecessary: CallbackTo[SketchPage]
  ): SketchDocumentData = {
    val __obj = js.Dynamic.literal(addBlankPage = addBlankPage.toJsFn, assets = assets.toJsFn, currentPage = currentPage.toJsFn, delegate = delegate.toJsFn, layerStyles = layerStyles.toJsFn, layerSymbols = layerSymbols.toJsFn, layerTextStyles = layerTextStyles.toJsFn, pages = pages.toJsFn, removePageAtIndex = js.Any.fromFunction1((t0: Double) => removePageAtIndex(t0).runNow()), setCurrentPage = js.Any.fromFunction1((t0: SketchPage) => setCurrentPage(t0).runNow()), symbolMap = symbolMap.toJsFn, symbolsPageOrCreateIfNecessary = symbolsPageOrCreateIfNecessary.toJsFn)
    __obj.asInstanceOf[SketchDocumentData]
  }
  
  extension [Self <: SketchDocumentData](x: Self) {
    
    inline def setAddBlankPage(value: CallbackTo[SketchPage]): Self = StObject.set(x, "addBlankPage", value.toJsFn)
    
    inline def setAssets(value: CallbackTo[SketchAssetCollection]): Self = StObject.set(x, "assets", value.toJsFn)
    
    inline def setCurrentPage(value: CallbackTo[SketchPage]): Self = StObject.set(x, "currentPage", value.toJsFn)
    
    inline def setDelegate(value: CallbackTo[SketchDocument]): Self = StObject.set(x, "delegate", value.toJsFn)
    
    inline def setLayerStyles(value: Callback): Self = StObject.set(x, "layerStyles", value.toJsFn)
    
    inline def setLayerSymbols(value: Callback): Self = StObject.set(x, "layerSymbols", value.toJsFn)
    
    inline def setLayerTextStyles(value: CallbackTo[SketchSharedStyleContainer]): Self = StObject.set(x, "layerTextStyles", value.toJsFn)
    
    inline def setPages(value: CallbackTo[MSArray[SketchPage]]): Self = StObject.set(x, "pages", value.toJsFn)
    
    inline def setRemovePageAtIndex(value: Double => Callback): Self = StObject.set(x, "removePageAtIndex", js.Any.fromFunction1((t0: Double) => value(t0).runNow()))
    
    inline def setSetCurrentPage(value: SketchPage => Callback): Self = StObject.set(x, "setCurrentPage", js.Any.fromFunction1((t0: SketchPage) => value(t0).runNow()))
    
    inline def setSymbolMap(value: CallbackTo[StringDictionary[SketchLayer]]): Self = StObject.set(x, "symbolMap", value.toJsFn)
    
    inline def setSymbolsPageOrCreateIfNecessary(value: CallbackTo[SketchPage]): Self = StObject.set(x, "symbolsPageOrCreateIfNecessary", value.toJsFn)
  }
}
