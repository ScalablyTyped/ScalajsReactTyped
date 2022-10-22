package typingsJapgolly.microsoftAjax

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ObjectConstructor extends StObject {
  
  /**
    * Formats a number by using the invariant culture.
    */
  def getType(instance: Any): Type
  
  /**
    * Returns a string that identifies the run-time type name of an object.
    */
  def getTypeName(instance: Any): java.lang.String
}
object ObjectConstructor {
  
  inline def apply(getType: Any => Type, getTypeName: Any => java.lang.String): ObjectConstructor = {
    val __obj = js.Dynamic.literal(getType = js.Any.fromFunction1(getType), getTypeName = js.Any.fromFunction1(getTypeName))
    __obj.asInstanceOf[ObjectConstructor]
  }
  
  extension [Self <: ObjectConstructor](x: Self) {
    
    inline def setGetType(value: Any => Type): Self = StObject.set(x, "getType", js.Any.fromFunction1(value))
    
    inline def setGetTypeName(value: Any => java.lang.String): Self = StObject.set(x, "getTypeName", js.Any.fromFunction1(value))
  }
}
