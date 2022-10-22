package typingsJapgolly.fhir.r3Mod

import typingsJapgolly.fhir.fhirStrings.both
import typingsJapgolly.fhir.fhirStrings.home
import typingsJapgolly.fhir.fhirStrings.old
import typingsJapgolly.fhir.fhirStrings.physical
import typingsJapgolly.fhir.fhirStrings.postal
import typingsJapgolly.fhir.fhirStrings.temp
import typingsJapgolly.fhir.fhirStrings.work
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Address
  extends StObject
     with Element {
  
  var _city: js.UndefOr[Element] = js.undefined
  
  var _country: js.UndefOr[Element] = js.undefined
  
  var _district: js.UndefOr[Element] = js.undefined
  
  var _line: js.UndefOr[js.Array[Element]] = js.undefined
  
  var _postalCode: js.UndefOr[Element] = js.undefined
  
  var _state: js.UndefOr[Element] = js.undefined
  
  var _text: js.UndefOr[Element] = js.undefined
  
  var _type: js.UndefOr[Element] = js.undefined
  
  var _use: js.UndefOr[Element] = js.undefined
  
  /**
    * The name of the city, town, village or other community or delivery center.
    */
  var city: js.UndefOr[String] = js.undefined
  
  /**
    * ISO 3166 3 letter codes can be used in place of a full country name.
    */
  var country: js.UndefOr[String] = js.undefined
  
  /**
    * District is sometimes known as county, but in some regions 'county' is used in place of city (municipality), so county name should be conveyed in city instead.
    */
  var district: js.UndefOr[String] = js.undefined
  
  /**
    * This component contains the house number, apartment number, street name, street direction,  P.O. Box number, delivery hints, and similar address information.
    */
  var line: js.UndefOr[js.Array[String]] = js.undefined
  
  /**
    * Time period when address was/is in use.
    */
  var period: js.UndefOr[Period] = js.undefined
  
  /**
    * A postal code designating a region defined by the postal service.
    */
  var postalCode: js.UndefOr[String] = js.undefined
  
  /**
    * Sub-unit of a country with limited sovereignty in a federally organized country. A code may be used if codes are in common use (i.e. US 2 letter state codes).
    */
  var state: js.UndefOr[String] = js.undefined
  
  /**
    * Can provide both a text representation and parts.
    */
  var text: js.UndefOr[String] = js.undefined
  
  /**
    * Distinguishes between physical addresses (those you can visit) and mailing addresses (e.g. PO Boxes and care-of addresses). Most addresses are both.
    */
  var `type`: js.UndefOr[postal | physical | both] = js.undefined
  
  /**
    * This is labeled as "Is Modifier" because applications should not mistake a temporary or old address etc.for a current/permanent one. Applications can assume that an address is current unless it explicitly says that it is temporary or old.
    */
  var use: js.UndefOr[home | work | temp | old] = js.undefined
}
object Address {
  
  inline def apply(): Address = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Address]
  }
  
  extension [Self <: Address](x: Self) {
    
    inline def setCity(value: String): Self = StObject.set(x, "city", value.asInstanceOf[js.Any])
    
    inline def setCityUndefined: Self = StObject.set(x, "city", js.undefined)
    
    inline def setCountry(value: String): Self = StObject.set(x, "country", value.asInstanceOf[js.Any])
    
    inline def setCountryUndefined: Self = StObject.set(x, "country", js.undefined)
    
    inline def setDistrict(value: String): Self = StObject.set(x, "district", value.asInstanceOf[js.Any])
    
    inline def setDistrictUndefined: Self = StObject.set(x, "district", js.undefined)
    
    inline def setLine(value: js.Array[String]): Self = StObject.set(x, "line", value.asInstanceOf[js.Any])
    
    inline def setLineUndefined: Self = StObject.set(x, "line", js.undefined)
    
    inline def setLineVarargs(value: String*): Self = StObject.set(x, "line", js.Array(value*))
    
    inline def setPeriod(value: Period): Self = StObject.set(x, "period", value.asInstanceOf[js.Any])
    
    inline def setPeriodUndefined: Self = StObject.set(x, "period", js.undefined)
    
    inline def setPostalCode(value: String): Self = StObject.set(x, "postalCode", value.asInstanceOf[js.Any])
    
    inline def setPostalCodeUndefined: Self = StObject.set(x, "postalCode", js.undefined)
    
    inline def setState(value: String): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
    
    inline def setStateUndefined: Self = StObject.set(x, "state", js.undefined)
    
    inline def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
    
    inline def setTextUndefined: Self = StObject.set(x, "text", js.undefined)
    
    inline def setType(value: postal | physical | both): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    
    inline def setUse(value: home | work | temp | old): Self = StObject.set(x, "use", value.asInstanceOf[js.Any])
    
    inline def setUseUndefined: Self = StObject.set(x, "use", js.undefined)
    
    inline def set_city(value: Element): Self = StObject.set(x, "_city", value.asInstanceOf[js.Any])
    
    inline def set_cityUndefined: Self = StObject.set(x, "_city", js.undefined)
    
    inline def set_country(value: Element): Self = StObject.set(x, "_country", value.asInstanceOf[js.Any])
    
    inline def set_countryUndefined: Self = StObject.set(x, "_country", js.undefined)
    
    inline def set_district(value: Element): Self = StObject.set(x, "_district", value.asInstanceOf[js.Any])
    
    inline def set_districtUndefined: Self = StObject.set(x, "_district", js.undefined)
    
    inline def set_line(value: js.Array[Element]): Self = StObject.set(x, "_line", value.asInstanceOf[js.Any])
    
    inline def set_lineUndefined: Self = StObject.set(x, "_line", js.undefined)
    
    inline def set_lineVarargs(value: Element*): Self = StObject.set(x, "_line", js.Array(value*))
    
    inline def set_postalCode(value: Element): Self = StObject.set(x, "_postalCode", value.asInstanceOf[js.Any])
    
    inline def set_postalCodeUndefined: Self = StObject.set(x, "_postalCode", js.undefined)
    
    inline def set_state(value: Element): Self = StObject.set(x, "_state", value.asInstanceOf[js.Any])
    
    inline def set_stateUndefined: Self = StObject.set(x, "_state", js.undefined)
    
    inline def set_text(value: Element): Self = StObject.set(x, "_text", value.asInstanceOf[js.Any])
    
    inline def set_textUndefined: Self = StObject.set(x, "_text", js.undefined)
    
    inline def set_type(value: Element): Self = StObject.set(x, "_type", value.asInstanceOf[js.Any])
    
    inline def set_typeUndefined: Self = StObject.set(x, "_type", js.undefined)
    
    inline def set_use(value: Element): Self = StObject.set(x, "_use", value.asInstanceOf[js.Any])
    
    inline def set_useUndefined: Self = StObject.set(x, "_use", js.undefined)
  }
}
