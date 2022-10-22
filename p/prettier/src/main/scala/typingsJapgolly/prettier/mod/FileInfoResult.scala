package typingsJapgolly.prettier.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FileInfoResult extends StObject {
  
  var ignored: Boolean
  
  var inferredParser: String | Null
}
object FileInfoResult {
  
  inline def apply(ignored: Boolean): FileInfoResult = {
    val __obj = js.Dynamic.literal(ignored = ignored.asInstanceOf[js.Any], inferredParser = null)
    __obj.asInstanceOf[FileInfoResult]
  }
  
  extension [Self <: FileInfoResult](x: Self) {
    
    inline def setIgnored(value: Boolean): Self = StObject.set(x, "ignored", value.asInstanceOf[js.Any])
    
    inline def setInferredParser(value: String): Self = StObject.set(x, "inferredParser", value.asInstanceOf[js.Any])
    
    inline def setInferredParserNull: Self = StObject.set(x, "inferredParser", null)
  }
}
