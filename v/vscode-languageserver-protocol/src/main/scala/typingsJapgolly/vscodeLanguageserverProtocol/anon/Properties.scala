package typingsJapgolly.vscodeLanguageserverProtocol.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Properties extends StObject {
  
  /**
    * The properties that a client can resolve lazily.
    */
  var properties: js.Array[String]
}
object Properties {
  
  inline def apply(properties: js.Array[String]): Properties = {
    val __obj = js.Dynamic.literal(properties = properties.asInstanceOf[js.Any])
    __obj.asInstanceOf[Properties]
  }
  
  extension [Self <: Properties](x: Self) {
    
    inline def setProperties(value: js.Array[String]): Self = StObject.set(x, "properties", value.asInstanceOf[js.Any])
    
    inline def setPropertiesVarargs(value: String*): Self = StObject.set(x, "properties", js.Array(value*))
  }
}
