package typingsJapgolly.sketchapp

import typingsJapgolly.sketchapp.sketchappStrings.documentData
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SketchMSDocument extends StObject {
  
  var _class: documentData
  
  var assets: SketchMSDocumentAssets
  
  var colorSpace: Double
  
  var currentPageIndex: Double
  
  var do_objectID: String
  
  var foreignSymbols: js.Array[SketchMSImmutableForeignSymbol]
  
  var foreignTextStyles: js.Array[Any]
  
  var layerStyles: SketchMSSharedStyleContainer
  
  var layerSymbols: SketchMSSymbolContainers
  
  var layerTextStyles: SketchMSSharedTextStyleContainer
  
  var pages: js.Array[SketchMSPageReference]
}
object SketchMSDocument {
  
  inline def apply(
    assets: SketchMSDocumentAssets,
    colorSpace: Double,
    currentPageIndex: Double,
    do_objectID: String,
    foreignSymbols: js.Array[SketchMSImmutableForeignSymbol],
    foreignTextStyles: js.Array[Any],
    layerStyles: SketchMSSharedStyleContainer,
    layerSymbols: SketchMSSymbolContainers,
    layerTextStyles: SketchMSSharedTextStyleContainer,
    pages: js.Array[SketchMSPageReference]
  ): SketchMSDocument = {
    val __obj = js.Dynamic.literal(_class = "documentData", assets = assets.asInstanceOf[js.Any], colorSpace = colorSpace.asInstanceOf[js.Any], currentPageIndex = currentPageIndex.asInstanceOf[js.Any], do_objectID = do_objectID.asInstanceOf[js.Any], foreignSymbols = foreignSymbols.asInstanceOf[js.Any], foreignTextStyles = foreignTextStyles.asInstanceOf[js.Any], layerStyles = layerStyles.asInstanceOf[js.Any], layerSymbols = layerSymbols.asInstanceOf[js.Any], layerTextStyles = layerTextStyles.asInstanceOf[js.Any], pages = pages.asInstanceOf[js.Any])
    __obj.asInstanceOf[SketchMSDocument]
  }
  
  extension [Self <: SketchMSDocument](x: Self) {
    
    inline def setAssets(value: SketchMSDocumentAssets): Self = StObject.set(x, "assets", value.asInstanceOf[js.Any])
    
    inline def setColorSpace(value: Double): Self = StObject.set(x, "colorSpace", value.asInstanceOf[js.Any])
    
    inline def setCurrentPageIndex(value: Double): Self = StObject.set(x, "currentPageIndex", value.asInstanceOf[js.Any])
    
    inline def setDo_objectID(value: String): Self = StObject.set(x, "do_objectID", value.asInstanceOf[js.Any])
    
    inline def setForeignSymbols(value: js.Array[SketchMSImmutableForeignSymbol]): Self = StObject.set(x, "foreignSymbols", value.asInstanceOf[js.Any])
    
    inline def setForeignSymbolsVarargs(value: SketchMSImmutableForeignSymbol*): Self = StObject.set(x, "foreignSymbols", js.Array(value*))
    
    inline def setForeignTextStyles(value: js.Array[Any]): Self = StObject.set(x, "foreignTextStyles", value.asInstanceOf[js.Any])
    
    inline def setForeignTextStylesVarargs(value: Any*): Self = StObject.set(x, "foreignTextStyles", js.Array(value*))
    
    inline def setLayerStyles(value: SketchMSSharedStyleContainer): Self = StObject.set(x, "layerStyles", value.asInstanceOf[js.Any])
    
    inline def setLayerSymbols(value: SketchMSSymbolContainers): Self = StObject.set(x, "layerSymbols", value.asInstanceOf[js.Any])
    
    inline def setLayerTextStyles(value: SketchMSSharedTextStyleContainer): Self = StObject.set(x, "layerTextStyles", value.asInstanceOf[js.Any])
    
    inline def setPages(value: js.Array[SketchMSPageReference]): Self = StObject.set(x, "pages", value.asInstanceOf[js.Any])
    
    inline def setPagesVarargs(value: SketchMSPageReference*): Self = StObject.set(x, "pages", js.Array(value*))
    
    inline def set_class(value: documentData): Self = StObject.set(x, "_class", value.asInstanceOf[js.Any])
  }
}
