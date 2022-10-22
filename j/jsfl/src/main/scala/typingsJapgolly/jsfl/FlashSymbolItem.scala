package typingsJapgolly.jsfl

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FlashSymbolItem extends StObject {
  
  def convertToCompiledClip(): Unit
  
  def exportSWC(outputURI: String): Unit
  
  def exportSWF(outputURI: String): Unit
  
  var scalingGrid: Boolean
  
  var scalingGridRect: FlashRectangle
  
  var sourceAutoUpdate: Boolean
  
  var sourceFilePath: String
  
  var sourceLibraryName: String
  
  var symbolType: String
  
  var timeline: FlashTimeline
}
object FlashSymbolItem {
  
  inline def apply(
    convertToCompiledClip: Callback,
    exportSWC: String => Callback,
    exportSWF: String => Callback,
    scalingGrid: Boolean,
    scalingGridRect: FlashRectangle,
    sourceAutoUpdate: Boolean,
    sourceFilePath: String,
    sourceLibraryName: String,
    symbolType: String,
    timeline: FlashTimeline
  ): FlashSymbolItem = {
    val __obj = js.Dynamic.literal(convertToCompiledClip = convertToCompiledClip.toJsFn, exportSWC = js.Any.fromFunction1((t0: String) => exportSWC(t0).runNow()), exportSWF = js.Any.fromFunction1((t0: String) => exportSWF(t0).runNow()), scalingGrid = scalingGrid.asInstanceOf[js.Any], scalingGridRect = scalingGridRect.asInstanceOf[js.Any], sourceAutoUpdate = sourceAutoUpdate.asInstanceOf[js.Any], sourceFilePath = sourceFilePath.asInstanceOf[js.Any], sourceLibraryName = sourceLibraryName.asInstanceOf[js.Any], symbolType = symbolType.asInstanceOf[js.Any], timeline = timeline.asInstanceOf[js.Any])
    __obj.asInstanceOf[FlashSymbolItem]
  }
  
  extension [Self <: FlashSymbolItem](x: Self) {
    
    inline def setConvertToCompiledClip(value: Callback): Self = StObject.set(x, "convertToCompiledClip", value.toJsFn)
    
    inline def setExportSWC(value: String => Callback): Self = StObject.set(x, "exportSWC", js.Any.fromFunction1((t0: String) => value(t0).runNow()))
    
    inline def setExportSWF(value: String => Callback): Self = StObject.set(x, "exportSWF", js.Any.fromFunction1((t0: String) => value(t0).runNow()))
    
    inline def setScalingGrid(value: Boolean): Self = StObject.set(x, "scalingGrid", value.asInstanceOf[js.Any])
    
    inline def setScalingGridRect(value: FlashRectangle): Self = StObject.set(x, "scalingGridRect", value.asInstanceOf[js.Any])
    
    inline def setSourceAutoUpdate(value: Boolean): Self = StObject.set(x, "sourceAutoUpdate", value.asInstanceOf[js.Any])
    
    inline def setSourceFilePath(value: String): Self = StObject.set(x, "sourceFilePath", value.asInstanceOf[js.Any])
    
    inline def setSourceLibraryName(value: String): Self = StObject.set(x, "sourceLibraryName", value.asInstanceOf[js.Any])
    
    inline def setSymbolType(value: String): Self = StObject.set(x, "symbolType", value.asInstanceOf[js.Any])
    
    inline def setTimeline(value: FlashTimeline): Self = StObject.set(x, "timeline", value.asInstanceOf[js.Any])
  }
}
