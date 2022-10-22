package typingsJapgolly.wepy.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CharSet extends StObject {
  
  var charSet: String
  
  var path: String
  
  var result: String
  
  var scanType: String
}
object CharSet {
  
  inline def apply(charSet: String, path: String, result: String, scanType: String): CharSet = {
    val __obj = js.Dynamic.literal(charSet = charSet.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any], result = result.asInstanceOf[js.Any], scanType = scanType.asInstanceOf[js.Any])
    __obj.asInstanceOf[CharSet]
  }
  
  extension [Self <: CharSet](x: Self) {
    
    inline def setCharSet(value: String): Self = StObject.set(x, "charSet", value.asInstanceOf[js.Any])
    
    inline def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    
    inline def setResult(value: String): Self = StObject.set(x, "result", value.asInstanceOf[js.Any])
    
    inline def setScanType(value: String): Self = StObject.set(x, "scanType", value.asInstanceOf[js.Any])
  }
}
