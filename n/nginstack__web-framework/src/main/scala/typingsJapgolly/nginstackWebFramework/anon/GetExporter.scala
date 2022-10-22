package typingsJapgolly.nginstackWebFramework.anon

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.nginstackWebFramework.libDsvReportVisualizationMod.DataExporter
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetExporter extends StObject {
  
  var formats: js.Array[ProcessKey]
  
  def getExporter(): DataExporter
  
  def getRawDataExporter(): DataExporter
  
  var title: String
}
object GetExporter {
  
  inline def apply(
    formats: js.Array[ProcessKey],
    getExporter: CallbackTo[DataExporter],
    getRawDataExporter: CallbackTo[DataExporter],
    title: String
  ): GetExporter = {
    val __obj = js.Dynamic.literal(formats = formats.asInstanceOf[js.Any], getExporter = getExporter.toJsFn, getRawDataExporter = getRawDataExporter.toJsFn, title = title.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetExporter]
  }
  
  extension [Self <: GetExporter](x: Self) {
    
    inline def setFormats(value: js.Array[ProcessKey]): Self = StObject.set(x, "formats", value.asInstanceOf[js.Any])
    
    inline def setFormatsVarargs(value: ProcessKey*): Self = StObject.set(x, "formats", js.Array(value*))
    
    inline def setGetExporter(value: CallbackTo[DataExporter]): Self = StObject.set(x, "getExporter", value.toJsFn)
    
    inline def setGetRawDataExporter(value: CallbackTo[DataExporter]): Self = StObject.set(x, "getRawDataExporter", value.toJsFn)
    
    inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
  }
}
