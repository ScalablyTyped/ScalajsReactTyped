package typingsJapgolly.activexLibreoffice.com_.sun.star.configuration.backend

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * This structure contains all the information related to a property
  * @see XLayerContentDescriber
  */
trait PropertyInfo extends StObject {
  
  /** The full name of the Property for eg. org.openoffice.Inet/Settings/ooInetHTTPProxyName */
  var Name: String
  
  /** Is the property protected, if true the property can not be over written in later layer. */
  var Protected: Boolean
  
  /** The type of the Property */
  var Type: String
  
  /** The value of the property */
  var Value: Any
}
object PropertyInfo {
  
  inline def apply(Name: String, Protected: Boolean, Type: String, Value: Any): PropertyInfo = {
    val __obj = js.Dynamic.literal(Name = Name.asInstanceOf[js.Any], Protected = Protected.asInstanceOf[js.Any], Type = Type.asInstanceOf[js.Any], Value = Value.asInstanceOf[js.Any])
    __obj.asInstanceOf[PropertyInfo]
  }
  
  extension [Self <: PropertyInfo](x: Self) {
    
    inline def setName(value: String): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    inline def setProtected(value: Boolean): Self = StObject.set(x, "Protected", value.asInstanceOf[js.Any])
    
    inline def setType(value: String): Self = StObject.set(x, "Type", value.asInstanceOf[js.Any])
    
    inline def setValue(value: Any): Self = StObject.set(x, "Value", value.asInstanceOf[js.Any])
  }
}
