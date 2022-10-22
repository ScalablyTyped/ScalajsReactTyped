package typingsJapgolly.maximMazurokGapiClientPoly.gapi.client.poly

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ObjParseError extends StObject {
  
  /** The type of problem found (required). */
  var code: js.UndefOr[String] = js.undefined
  
  /** The ending character index at which the problem was found. */
  var endIndex: js.UndefOr[Double] = js.undefined
  
  /** The file path in which the problem was found. */
  var filePath: js.UndefOr[String] = js.undefined
  
  /** The text of the line. Note that this may be truncated if the line was very long. This may not include the error if it occurs after line truncation. */
  var line: js.UndefOr[String] = js.undefined
  
  /** Line number at which the problem was found. */
  var lineNumber: js.UndefOr[Double] = js.undefined
  
  /** The starting character index at which the problem was found. */
  var startIndex: js.UndefOr[Double] = js.undefined
}
object ObjParseError {
  
  inline def apply(): ObjParseError = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ObjParseError]
  }
  
  extension [Self <: ObjParseError](x: Self) {
    
    inline def setCode(value: String): Self = StObject.set(x, "code", value.asInstanceOf[js.Any])
    
    inline def setCodeUndefined: Self = StObject.set(x, "code", js.undefined)
    
    inline def setEndIndex(value: Double): Self = StObject.set(x, "endIndex", value.asInstanceOf[js.Any])
    
    inline def setEndIndexUndefined: Self = StObject.set(x, "endIndex", js.undefined)
    
    inline def setFilePath(value: String): Self = StObject.set(x, "filePath", value.asInstanceOf[js.Any])
    
    inline def setFilePathUndefined: Self = StObject.set(x, "filePath", js.undefined)
    
    inline def setLine(value: String): Self = StObject.set(x, "line", value.asInstanceOf[js.Any])
    
    inline def setLineNumber(value: Double): Self = StObject.set(x, "lineNumber", value.asInstanceOf[js.Any])
    
    inline def setLineNumberUndefined: Self = StObject.set(x, "lineNumber", js.undefined)
    
    inline def setLineUndefined: Self = StObject.set(x, "line", js.undefined)
    
    inline def setStartIndex(value: Double): Self = StObject.set(x, "startIndex", value.asInstanceOf[js.Any])
    
    inline def setStartIndexUndefined: Self = StObject.set(x, "startIndex", js.undefined)
  }
}
