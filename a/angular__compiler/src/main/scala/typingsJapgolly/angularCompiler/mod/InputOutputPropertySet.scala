package typingsJapgolly.angularCompiler.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait InputOutputPropertySet extends StObject {
  
  def hasBindingPropertyName(propertyName: String): Boolean
}
object InputOutputPropertySet {
  
  inline def apply(hasBindingPropertyName: String => Boolean): InputOutputPropertySet = {
    val __obj = js.Dynamic.literal(hasBindingPropertyName = js.Any.fromFunction1(hasBindingPropertyName))
    __obj.asInstanceOf[InputOutputPropertySet]
  }
  
  extension [Self <: InputOutputPropertySet](x: Self) {
    
    inline def setHasBindingPropertyName(value: String => Boolean): Self = StObject.set(x, "hasBindingPropertyName", js.Any.fromFunction1(value))
  }
}
