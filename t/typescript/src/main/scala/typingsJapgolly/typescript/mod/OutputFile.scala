package typingsJapgolly.typescript.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OutputFile extends StObject {
  
  var name: java.lang.String
  
  var text: java.lang.String
  
  var writeByteOrderMark: Boolean
}
object OutputFile {
  
  inline def apply(name: java.lang.String, text: java.lang.String, writeByteOrderMark: Boolean): OutputFile = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any], writeByteOrderMark = writeByteOrderMark.asInstanceOf[js.Any])
    __obj.asInstanceOf[OutputFile]
  }
  
  extension [Self <: OutputFile](x: Self) {
    
    inline def setName(value: java.lang.String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setText(value: java.lang.String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
    
    inline def setWriteByteOrderMark(value: Boolean): Self = StObject.set(x, "writeByteOrderMark", value.asInstanceOf[js.Any])
  }
}
