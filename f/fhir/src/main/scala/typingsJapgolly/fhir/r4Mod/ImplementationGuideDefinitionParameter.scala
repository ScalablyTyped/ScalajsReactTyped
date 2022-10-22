package typingsJapgolly.fhir.r4Mod

import typingsJapgolly.fhir.fhirStrings.`expansion-parameter`
import typingsJapgolly.fhir.fhirStrings.`generate-json`
import typingsJapgolly.fhir.fhirStrings.`generate-turtle`
import typingsJapgolly.fhir.fhirStrings.`generate-xml`
import typingsJapgolly.fhir.fhirStrings.`html-template`
import typingsJapgolly.fhir.fhirStrings.`path-pages`
import typingsJapgolly.fhir.fhirStrings.`path-resource`
import typingsJapgolly.fhir.fhirStrings.`path-tx-cache`
import typingsJapgolly.fhir.fhirStrings.`rule-broken-links`
import typingsJapgolly.fhir.fhirStrings.apply
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ImplementationGuideDefinitionParameter
  extends StObject
     with BackboneElement {
  
  var _code: js.UndefOr[Element] = js.undefined
  
  var _value: js.UndefOr[Element] = js.undefined
  
  /**
    * apply | path-resource | path-pages | path-tx-cache | expansion-parameter | rule-broken-links | generate-xml | generate-json | generate-turtle | html-template.
    */
  var code: apply | `path-resource` | `path-pages` | `path-tx-cache` | `expansion-parameter` | `rule-broken-links` | `generate-xml` | `generate-json` | `generate-turtle` | `html-template`
  
  /**
    * Value for named type.
    */
  var value: String
}
object ImplementationGuideDefinitionParameter {
  
  inline def apply(
    code: apply | `path-resource` | `path-pages` | `path-tx-cache` | `expansion-parameter` | `rule-broken-links` | `generate-xml` | `generate-json` | `generate-turtle` | `html-template`,
    value: String
  ): ImplementationGuideDefinitionParameter = {
    val __obj = js.Dynamic.literal(code = code.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[ImplementationGuideDefinitionParameter]
  }
  
  extension [Self <: ImplementationGuideDefinitionParameter](x: Self) {
    
    inline def setCode(
      value: apply | `path-resource` | `path-pages` | `path-tx-cache` | `expansion-parameter` | `rule-broken-links` | `generate-xml` | `generate-json` | `generate-turtle` | `html-template`
    ): Self = StObject.set(x, "code", value.asInstanceOf[js.Any])
    
    inline def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    inline def set_code(value: Element): Self = StObject.set(x, "_code", value.asInstanceOf[js.Any])
    
    inline def set_codeUndefined: Self = StObject.set(x, "_code", js.undefined)
    
    inline def set_value(value: Element): Self = StObject.set(x, "_value", value.asInstanceOf[js.Any])
    
    inline def set_valueUndefined: Self = StObject.set(x, "_value", js.undefined)
  }
}
