package typingsJapgolly.log4js.mod

import typingsJapgolly.log4js.log4jsStrings.multiFile
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MultiFileAppender extends StObject {
  
  // the base part of the generated log filename
  var base: String
  
  // the suffix for the generated log filename.
  var `extension`: String
  
  // the value to use to split files (see below).
  var property: String
  
  var `type`: multiFile
}
object MultiFileAppender {
  
  inline def apply(base: String, `extension`: String, property: String): MultiFileAppender = {
    val __obj = js.Dynamic.literal(base = base.asInstanceOf[js.Any], property = property.asInstanceOf[js.Any])
    __obj.updateDynamic("extension")(`extension`.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("multiFile")
    __obj.asInstanceOf[MultiFileAppender]
  }
  
  extension [Self <: MultiFileAppender](x: Self) {
    
    inline def setBase(value: String): Self = StObject.set(x, "base", value.asInstanceOf[js.Any])
    
    inline def setExtension(value: String): Self = StObject.set(x, "extension", value.asInstanceOf[js.Any])
    
    inline def setProperty(value: String): Self = StObject.set(x, "property", value.asInstanceOf[js.Any])
    
    inline def setType(value: multiFile): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
