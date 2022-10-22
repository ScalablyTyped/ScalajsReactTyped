package typingsJapgolly.activexLibreoffice.com_.sun.star.inspection

import typingsJapgolly.activexLibreoffice.`type`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * handles string representations of property values.
  * @see
  */
trait XStringRepresentation extends StObject {
  
  /**
    * converts a into a string.
    * @param PropertyValue The to-be-converted property value.
    * @returns The converted string representation of the property value.
    * @see XPropertyHandler.convertToControlValue()
    */
  def convertToControlValue(PropertyValue: Any): String
  
  /**
    * converts a string into an any with the type defined by the target type.
    * @param ControlValue The to-be-converted control value.
    * @param ControlValueType The target type of the conversion.
    * @see XPropertyHandler.convertToPropertyValue()
    */
  def convertToPropertyValue(ControlValue: String, ControlValueType: `type`): Any
}
object XStringRepresentation {
  
  inline def apply(convertToControlValue: Any => String, convertToPropertyValue: (String, `type`) => Any): XStringRepresentation = {
    val __obj = js.Dynamic.literal(convertToControlValue = js.Any.fromFunction1(convertToControlValue), convertToPropertyValue = js.Any.fromFunction2(convertToPropertyValue))
    __obj.asInstanceOf[XStringRepresentation]
  }
  
  extension [Self <: XStringRepresentation](x: Self) {
    
    inline def setConvertToControlValue(value: Any => String): Self = StObject.set(x, "convertToControlValue", js.Any.fromFunction1(value))
    
    inline def setConvertToPropertyValue(value: (String, `type`) => Any): Self = StObject.set(x, "convertToPropertyValue", js.Any.fromFunction2(value))
  }
}
