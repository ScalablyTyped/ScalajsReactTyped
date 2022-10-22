package typingsJapgolly.jqueryAjaxfile

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Elements in the array returned by serializeArray()
  */
trait JQuerySerializeArrayElement extends StObject {
  
  var name: String
  
  var value: String
}
object JQuerySerializeArrayElement {
  
  inline def apply(name: String, value: String): JQuerySerializeArrayElement = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[JQuerySerializeArrayElement]
  }
  
  extension [Self <: JQuerySerializeArrayElement](x: Self) {
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
