package typingsJapgolly.fhir.r3Mod

import typingsJapgolly.fhir.fhirStrings.Greaterthansign
import typingsJapgolly.fhir.fhirStrings.GreaterthansignEqualssign
import typingsJapgolly.fhir.fhirStrings.Lessthansign
import typingsJapgolly.fhir.fhirStrings.LessthansignEqualssign
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Quantity
  extends StObject
     with Element {
  
  var _code: js.UndefOr[Element] = js.undefined
  
  var _comparator: js.UndefOr[Element] = js.undefined
  
  var _system: js.UndefOr[Element] = js.undefined
  
  var _unit: js.UndefOr[Element] = js.undefined
  
  /**
    * The preferred system is UCUM, but SNOMED CT can also be used (for customary units) or ISO 4217 for currency.  The context of use may additionally require a code from a particular system.
    */
  var code: js.UndefOr[String] = js.undefined
  
  /**
    * This is labeled as "Is Modifier" because the comparator modifies the interpretation of the value significantly. If there is no comparator, then there is no modification of the value.
    */
  var comparator: js.UndefOr[
    Lessthansign | LessthansignEqualssign | GreaterthansignEqualssign | Greaterthansign
  ] = js.undefined
  
  /**
    * The identification of the system that provides the coded form of the unit.
    */
  var system: js.UndefOr[String] = js.undefined
  
  /**
    * A human-readable form of the unit.
    */
  var unit: js.UndefOr[String] = js.undefined
  
  /**
    * The implicit precision in the value should always be honored. Monetary values have their own rules for handling precision (refer to standard accounting text books).
    */
  var value: js.UndefOr[Double] = js.undefined
}
object Quantity {
  
  inline def apply(): Quantity = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Quantity]
  }
  
  extension [Self <: Quantity](x: Self) {
    
    inline def setCode(value: String): Self = StObject.set(x, "code", value.asInstanceOf[js.Any])
    
    inline def setCodeUndefined: Self = StObject.set(x, "code", js.undefined)
    
    inline def setComparator(value: Lessthansign | LessthansignEqualssign | GreaterthansignEqualssign | Greaterthansign): Self = StObject.set(x, "comparator", value.asInstanceOf[js.Any])
    
    inline def setComparatorUndefined: Self = StObject.set(x, "comparator", js.undefined)
    
    inline def setSystem(value: String): Self = StObject.set(x, "system", value.asInstanceOf[js.Any])
    
    inline def setSystemUndefined: Self = StObject.set(x, "system", js.undefined)
    
    inline def setUnit(value: String): Self = StObject.set(x, "unit", value.asInstanceOf[js.Any])
    
    inline def setUnitUndefined: Self = StObject.set(x, "unit", js.undefined)
    
    inline def setValue(value: Double): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
    
    inline def set_code(value: Element): Self = StObject.set(x, "_code", value.asInstanceOf[js.Any])
    
    inline def set_codeUndefined: Self = StObject.set(x, "_code", js.undefined)
    
    inline def set_comparator(value: Element): Self = StObject.set(x, "_comparator", value.asInstanceOf[js.Any])
    
    inline def set_comparatorUndefined: Self = StObject.set(x, "_comparator", js.undefined)
    
    inline def set_system(value: Element): Self = StObject.set(x, "_system", value.asInstanceOf[js.Any])
    
    inline def set_systemUndefined: Self = StObject.set(x, "_system", js.undefined)
    
    inline def set_unit(value: Element): Self = StObject.set(x, "_unit", value.asInstanceOf[js.Any])
    
    inline def set_unitUndefined: Self = StObject.set(x, "_unit", js.undefined)
  }
}
