package typingsJapgolly.qlik.mod

import typingsJapgolly.qlik.qlikStrings.A
import typingsJapgolly.qlik.qlikStrings.CSV_C
import typingsJapgolly.qlik.qlikStrings.CSV_T
import typingsJapgolly.qlik.qlikStrings.OOXML
import typingsJapgolly.qlik.qlikStrings.P
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ExportDataOptions extends StObject {
  
  var download: Boolean
  
  var filename: js.UndefOr[String] = js.undefined
  
  var format: OOXML | CSV_C | CSV_T
  
  var state: A | P
}
object ExportDataOptions {
  
  inline def apply(download: Boolean, format: OOXML | CSV_C | CSV_T, state: A | P): ExportDataOptions = {
    val __obj = js.Dynamic.literal(download = download.asInstanceOf[js.Any], format = format.asInstanceOf[js.Any], state = state.asInstanceOf[js.Any])
    __obj.asInstanceOf[ExportDataOptions]
  }
  
  extension [Self <: ExportDataOptions](x: Self) {
    
    inline def setDownload(value: Boolean): Self = StObject.set(x, "download", value.asInstanceOf[js.Any])
    
    inline def setFilename(value: String): Self = StObject.set(x, "filename", value.asInstanceOf[js.Any])
    
    inline def setFilenameUndefined: Self = StObject.set(x, "filename", js.undefined)
    
    inline def setFormat(value: OOXML | CSV_C | CSV_T): Self = StObject.set(x, "format", value.asInstanceOf[js.Any])
    
    inline def setState(value: A | P): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
  }
}
