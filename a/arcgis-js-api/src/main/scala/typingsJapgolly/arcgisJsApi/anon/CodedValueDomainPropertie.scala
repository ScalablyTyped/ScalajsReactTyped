package typingsJapgolly.arcgisJsApi.anon

import typingsJapgolly.arcgisJsApi.arcgisJsApiStrings.`coded-value`
import typingsJapgolly.arcgisJsApi.arcgisJsApiStrings.inherited
import typingsJapgolly.arcgisJsApi.arcgisJsApiStrings.range
import typingsJapgolly.arcgisJsApi.esri.CodedValue
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined arcgis-js-api.__esri.CodedValueDomainProperties & {  type :'coded-value'} */
trait CodedValueDomainPropertie extends StObject {
  
  /**
    * An array of the coded values in the domain.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-CodedValueDomain.html#codedValues)
    */
  var codedValues: js.UndefOr[js.Array[CodedValue]] = js.undefined
  
  /**
    * The domain name.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-Domain.html#name)
    */
  var name: js.UndefOr[String] = js.undefined
  
  /**
    * The domain type.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-Domain.html#type)
    */
  var `type`: (js.UndefOr[range | `coded-value` | inherited]) & `coded-value`
}
object CodedValueDomainPropertie {
  
  inline def apply(`type`: (js.UndefOr[range | `coded-value` | inherited]) & `coded-value`): CodedValueDomainPropertie = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[CodedValueDomainPropertie]
  }
  
  extension [Self <: CodedValueDomainPropertie](x: Self) {
    
    inline def setCodedValues(value: js.Array[CodedValue]): Self = StObject.set(x, "codedValues", value.asInstanceOf[js.Any])
    
    inline def setCodedValuesUndefined: Self = StObject.set(x, "codedValues", js.undefined)
    
    inline def setCodedValuesVarargs(value: CodedValue*): Self = StObject.set(x, "codedValues", js.Array(value*))
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setType(value: (js.UndefOr[range | `coded-value` | inherited]) & `coded-value`): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
