package typingsJapgolly.wegameApi.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TempFilePath extends StObject {
  
  var tempFilePath: String
}
object TempFilePath {
  
  inline def apply(tempFilePath: String): TempFilePath = {
    val __obj = js.Dynamic.literal(tempFilePath = tempFilePath.asInstanceOf[js.Any])
    __obj.asInstanceOf[TempFilePath]
  }
  
  extension [Self <: TempFilePath](x: Self) {
    
    inline def setTempFilePath(value: String): Self = StObject.set(x, "tempFilePath", value.asInstanceOf[js.Any])
  }
}
