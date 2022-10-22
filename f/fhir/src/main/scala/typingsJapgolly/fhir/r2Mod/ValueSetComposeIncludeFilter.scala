package typingsJapgolly.fhir.r2Mod

import typingsJapgolly.fhir.fhirStrings.Equalssign
import typingsJapgolly.fhir.fhirStrings.`is-a`
import typingsJapgolly.fhir.fhirStrings.`is-not-a`
import typingsJapgolly.fhir.fhirStrings.`not-in`
import typingsJapgolly.fhir.fhirStrings.in
import typingsJapgolly.fhir.fhirStrings.regex
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ValueSetComposeIncludeFilter
  extends StObject
     with BackboneElement {
  
  var _op: js.UndefOr[Element] = js.undefined
  
  var _property: js.UndefOr[Element] = js.undefined
  
  var _value: js.UndefOr[Element] = js.undefined
  
  /**
    * The kind of operation to perform as a part of the filter criteria.
    */
  var op: Equalssign | `is-a` | `is-not-a` | regex | in | `not-in`
  
  /**
    * A code that identifies a property defined in the code system.
    */
  var property: String
  
  /**
    * The match value may be either a code defined by the system, or a string value, which is a regex match on the literal string of the property value.
    */
  var value: String
}
object ValueSetComposeIncludeFilter {
  
  inline def apply(op: Equalssign | `is-a` | `is-not-a` | regex | in | `not-in`, property: String, value: String): ValueSetComposeIncludeFilter = {
    val __obj = js.Dynamic.literal(op = op.asInstanceOf[js.Any], property = property.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[ValueSetComposeIncludeFilter]
  }
  
  extension [Self <: ValueSetComposeIncludeFilter](x: Self) {
    
    inline def setOp(value: Equalssign | `is-a` | `is-not-a` | regex | in | `not-in`): Self = StObject.set(x, "op", value.asInstanceOf[js.Any])
    
    inline def setProperty(value: String): Self = StObject.set(x, "property", value.asInstanceOf[js.Any])
    
    inline def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    inline def set_op(value: Element): Self = StObject.set(x, "_op", value.asInstanceOf[js.Any])
    
    inline def set_opUndefined: Self = StObject.set(x, "_op", js.undefined)
    
    inline def set_property(value: Element): Self = StObject.set(x, "_property", value.asInstanceOf[js.Any])
    
    inline def set_propertyUndefined: Self = StObject.set(x, "_property", js.undefined)
    
    inline def set_value(value: Element): Self = StObject.set(x, "_value", value.asInstanceOf[js.Any])
    
    inline def set_valueUndefined: Self = StObject.set(x, "_value", js.undefined)
  }
}
