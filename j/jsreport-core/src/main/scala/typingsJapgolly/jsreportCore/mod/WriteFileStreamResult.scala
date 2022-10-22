package typingsJapgolly.jsreportCore.mod

import typingsJapgolly.node.fsMod.WriteStream
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait WriteFileStreamResult extends StObject {
  
  var filename: String
  
  var pathToFile: String
  
  var stream: WriteStream
}
object WriteFileStreamResult {
  
  inline def apply(filename: String, pathToFile: String, stream: WriteStream): WriteFileStreamResult = {
    val __obj = js.Dynamic.literal(filename = filename.asInstanceOf[js.Any], pathToFile = pathToFile.asInstanceOf[js.Any], stream = stream.asInstanceOf[js.Any])
    __obj.asInstanceOf[WriteFileStreamResult]
  }
  
  extension [Self <: WriteFileStreamResult](x: Self) {
    
    inline def setFilename(value: String): Self = StObject.set(x, "filename", value.asInstanceOf[js.Any])
    
    inline def setPathToFile(value: String): Self = StObject.set(x, "pathToFile", value.asInstanceOf[js.Any])
    
    inline def setStream(value: WriteStream): Self = StObject.set(x, "stream", value.asInstanceOf[js.Any])
  }
}
