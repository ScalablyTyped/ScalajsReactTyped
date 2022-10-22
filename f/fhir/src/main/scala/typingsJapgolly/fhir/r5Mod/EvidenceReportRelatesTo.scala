package typingsJapgolly.fhir.r5Mod

import typingsJapgolly.fhir.fhirStrings.amendedWith
import typingsJapgolly.fhir.fhirStrings.amends
import typingsJapgolly.fhir.fhirStrings.appendedWith
import typingsJapgolly.fhir.fhirStrings.appends
import typingsJapgolly.fhir.fhirStrings.replacedWith
import typingsJapgolly.fhir.fhirStrings.replaces
import typingsJapgolly.fhir.fhirStrings.transformedWith
import typingsJapgolly.fhir.fhirStrings.transforms
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EvidenceReportRelatesTo
  extends StObject
     with BackboneElement {
  
  var _code: js.UndefOr[Element] = js.undefined
  
  /**
    * If this document appends another document, then the document cannot be fully understood without also accessing the referenced document.
    */
  var code: replaces | amends | appends | transforms | replacedWith | amendedWith | appendedWith | transformedWith
  
  /**
    * The target composition/document of this relationship.
    */
  var target: EvidenceReportRelatesToTarget
}
object EvidenceReportRelatesTo {
  
  inline def apply(
    code: replaces | amends | appends | transforms | replacedWith | amendedWith | appendedWith | transformedWith,
    target: EvidenceReportRelatesToTarget
  ): EvidenceReportRelatesTo = {
    val __obj = js.Dynamic.literal(code = code.asInstanceOf[js.Any], target = target.asInstanceOf[js.Any])
    __obj.asInstanceOf[EvidenceReportRelatesTo]
  }
  
  extension [Self <: EvidenceReportRelatesTo](x: Self) {
    
    inline def setCode(
      value: replaces | amends | appends | transforms | replacedWith | amendedWith | appendedWith | transformedWith
    ): Self = StObject.set(x, "code", value.asInstanceOf[js.Any])
    
    inline def setTarget(value: EvidenceReportRelatesToTarget): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
    
    inline def set_code(value: Element): Self = StObject.set(x, "_code", value.asInstanceOf[js.Any])
    
    inline def set_codeUndefined: Self = StObject.set(x, "_code", js.undefined)
  }
}
