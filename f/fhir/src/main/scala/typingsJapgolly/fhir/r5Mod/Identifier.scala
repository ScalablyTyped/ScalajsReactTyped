package typingsJapgolly.fhir.r5Mod

import typingsJapgolly.fhir.fhirStrings.official
import typingsJapgolly.fhir.fhirStrings.old
import typingsJapgolly.fhir.fhirStrings.secondary
import typingsJapgolly.fhir.fhirStrings.temp
import typingsJapgolly.fhir.fhirStrings.usual
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Identifier
  extends StObject
     with Element {
  
  var _system: js.UndefOr[Element] = js.undefined
  
  var _use: js.UndefOr[Element] = js.undefined
  
  var _value: js.UndefOr[Element] = js.undefined
  
  /**
    * The Identifier.assigner may omit the .reference element and only contain a .display element reflecting the name or other textual information about the assigning organization.
    */
  var assigner: js.UndefOr[Reference] = js.undefined
  
  /**
    * Time period during which identifier is/was valid for use.
    */
  var period: js.UndefOr[Period] = js.undefined
  
  /**
    * Identifier.system is always case sensitive.
    */
  var system: js.UndefOr[String] = js.undefined
  
  /**
    * This element deals only with general categories of identifiers.  It SHOULD not be used for codes that correspond 1..1 with the Identifier.system. Some identifiers may fall into multiple categories due to common usage.   Where the system is known, a type is unnecessary because the type is always part of the system definition. However systems often need to handle identifiers where the system is not known. There is not a 1:1 relationship between type and system, since many different systems have the same type.
    */
  var `type`: js.UndefOr[CodeableConcept] = js.undefined
  
  /**
    * Applications can assume that an identifier is permanent unless it explicitly says that it is temporary.
    */
  var use: js.UndefOr[usual | official | temp | secondary | old] = js.undefined
  
  /**
    * If the value is a full URI, then the system SHALL be urn:ietf:rfc:3986.  The value's primary purpose is computational mapping.  As a result, it may be normalized for comparison purposes (e.g. removing non-significant whitespace, dashes, etc.)  A value formatted for human display can be conveyed using the [Rendered Value extension](extension-rendered-value.html). Identifier.value is to be treated as case sensitive unless knowledge of the Identifier.system allows the processer to be confident that non-case-sensitive processing is safe.
    */
  var value: js.UndefOr[String] = js.undefined
}
object Identifier {
  
  inline def apply(): Identifier = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Identifier]
  }
  
  extension [Self <: Identifier](x: Self) {
    
    inline def setAssigner(value: Reference): Self = StObject.set(x, "assigner", value.asInstanceOf[js.Any])
    
    inline def setAssignerUndefined: Self = StObject.set(x, "assigner", js.undefined)
    
    inline def setPeriod(value: Period): Self = StObject.set(x, "period", value.asInstanceOf[js.Any])
    
    inline def setPeriodUndefined: Self = StObject.set(x, "period", js.undefined)
    
    inline def setSystem(value: String): Self = StObject.set(x, "system", value.asInstanceOf[js.Any])
    
    inline def setSystemUndefined: Self = StObject.set(x, "system", js.undefined)
    
    inline def setType(value: CodeableConcept): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    
    inline def setUse(value: usual | official | temp | secondary | old): Self = StObject.set(x, "use", value.asInstanceOf[js.Any])
    
    inline def setUseUndefined: Self = StObject.set(x, "use", js.undefined)
    
    inline def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
    
    inline def set_system(value: Element): Self = StObject.set(x, "_system", value.asInstanceOf[js.Any])
    
    inline def set_systemUndefined: Self = StObject.set(x, "_system", js.undefined)
    
    inline def set_use(value: Element): Self = StObject.set(x, "_use", value.asInstanceOf[js.Any])
    
    inline def set_useUndefined: Self = StObject.set(x, "_use", js.undefined)
    
    inline def set_value(value: Element): Self = StObject.set(x, "_value", value.asInstanceOf[js.Any])
    
    inline def set_valueUndefined: Self = StObject.set(x, "_value", js.undefined)
  }
}
