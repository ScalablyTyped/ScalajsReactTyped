package typingsJapgolly.jsreportCore.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TempDirectoryResult extends StObject {
  
  var directoryPath: String
}
object TempDirectoryResult {
  
  inline def apply(directoryPath: String): TempDirectoryResult = {
    val __obj = js.Dynamic.literal(directoryPath = directoryPath.asInstanceOf[js.Any])
    __obj.asInstanceOf[TempDirectoryResult]
  }
  
  extension [Self <: TempDirectoryResult](x: Self) {
    
    inline def setDirectoryPath(value: String): Self = StObject.set(x, "directoryPath", value.asInstanceOf[js.Any])
  }
}
