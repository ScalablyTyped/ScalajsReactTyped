package typingsJapgolly.fhir.r4Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ExplanationOfBenefitItemDetailSubDetail
  extends StObject
     with BackboneElement {
  
  /**
    * The adjudication results.
    */
  var adjudication: js.UndefOr[js.Array[ExplanationOfBenefitItemAdjudication]] = js.undefined
  
  /**
    * Examples include Medical Care, Periodontics, Renal Dialysis, Vision Coverage.
    */
  var category: js.UndefOr[CodeableConcept] = js.undefined
  
  /**
    * To show a 10% senior's discount, the value entered is: 0.90 (1.00 - 0.10).
    */
  var factor: js.UndefOr[Double] = js.undefined
  
  /**
    * For example, in Oral whether the treatment is cosmetic or associated with TMJ, or for Medical whether the treatment was outside the clinic or outside of office hours.
    */
  var modifier: js.UndefOr[js.Array[CodeableConcept]] = js.undefined
  
  /**
    * For example, the formula: quantity * unitPrice * factor  = net. Quantity and factor are assumed to be 1 if not supplied.
    */
  var net: js.UndefOr[Money] = js.undefined
  
  /**
    * The numbers associated with notes below which apply to the adjudication of this item.
    */
  var noteNumber: js.UndefOr[js.Array[Double]] = js.undefined
  
  /**
    * If this is an actual service or product line, i.e. not a Group, then use code to indicate the Professional Service or Product supplied (e.g. CTP, HCPCS, USCLS, ICD10, NCPDP, DIN, RxNorm, ACHI, CCI). If a grouping item then use a group code to indicate the type of thing being grouped e.g. 'glasses' or 'compound'.
    */
  var productOrService: CodeableConcept
  
  /**
    * For example: Neonatal program, child dental program or drug users recovery program.
    */
  var programCode: js.UndefOr[js.Array[CodeableConcept]] = js.undefined
  
  /**
    * The number of repetitions of a service or product.
    */
  var quantity: js.UndefOr[Quantity] = js.undefined
  
  /**
    * The type of revenue or cost center providing the product and/or service.
    */
  var revenue: js.UndefOr[CodeableConcept] = js.undefined
  
  /**
    * A claim detail line. Either a simple (a product or service) or a 'group' of sub-details which are simple items.
    */
  var sequence: Double
  
  /**
    * Unique Device Identifiers associated with this line item.
    */
  var udi: js.UndefOr[js.Array[Reference]] = js.undefined
  
  /**
    * If the item is not a group then this is the fee for the product or service, otherwise this is the total of the fees for the details of the group.
    */
  var unitPrice: js.UndefOr[Money] = js.undefined
}
object ExplanationOfBenefitItemDetailSubDetail {
  
  inline def apply(productOrService: CodeableConcept, sequence: Double): ExplanationOfBenefitItemDetailSubDetail = {
    val __obj = js.Dynamic.literal(productOrService = productOrService.asInstanceOf[js.Any], sequence = sequence.asInstanceOf[js.Any])
    __obj.asInstanceOf[ExplanationOfBenefitItemDetailSubDetail]
  }
  
  extension [Self <: ExplanationOfBenefitItemDetailSubDetail](x: Self) {
    
    inline def setAdjudication(value: js.Array[ExplanationOfBenefitItemAdjudication]): Self = StObject.set(x, "adjudication", value.asInstanceOf[js.Any])
    
    inline def setAdjudicationUndefined: Self = StObject.set(x, "adjudication", js.undefined)
    
    inline def setAdjudicationVarargs(value: ExplanationOfBenefitItemAdjudication*): Self = StObject.set(x, "adjudication", js.Array(value*))
    
    inline def setCategory(value: CodeableConcept): Self = StObject.set(x, "category", value.asInstanceOf[js.Any])
    
    inline def setCategoryUndefined: Self = StObject.set(x, "category", js.undefined)
    
    inline def setFactor(value: Double): Self = StObject.set(x, "factor", value.asInstanceOf[js.Any])
    
    inline def setFactorUndefined: Self = StObject.set(x, "factor", js.undefined)
    
    inline def setModifier(value: js.Array[CodeableConcept]): Self = StObject.set(x, "modifier", value.asInstanceOf[js.Any])
    
    inline def setModifierUndefined: Self = StObject.set(x, "modifier", js.undefined)
    
    inline def setModifierVarargs(value: CodeableConcept*): Self = StObject.set(x, "modifier", js.Array(value*))
    
    inline def setNet(value: Money): Self = StObject.set(x, "net", value.asInstanceOf[js.Any])
    
    inline def setNetUndefined: Self = StObject.set(x, "net", js.undefined)
    
    inline def setNoteNumber(value: js.Array[Double]): Self = StObject.set(x, "noteNumber", value.asInstanceOf[js.Any])
    
    inline def setNoteNumberUndefined: Self = StObject.set(x, "noteNumber", js.undefined)
    
    inline def setNoteNumberVarargs(value: Double*): Self = StObject.set(x, "noteNumber", js.Array(value*))
    
    inline def setProductOrService(value: CodeableConcept): Self = StObject.set(x, "productOrService", value.asInstanceOf[js.Any])
    
    inline def setProgramCode(value: js.Array[CodeableConcept]): Self = StObject.set(x, "programCode", value.asInstanceOf[js.Any])
    
    inline def setProgramCodeUndefined: Self = StObject.set(x, "programCode", js.undefined)
    
    inline def setProgramCodeVarargs(value: CodeableConcept*): Self = StObject.set(x, "programCode", js.Array(value*))
    
    inline def setQuantity(value: Quantity): Self = StObject.set(x, "quantity", value.asInstanceOf[js.Any])
    
    inline def setQuantityUndefined: Self = StObject.set(x, "quantity", js.undefined)
    
    inline def setRevenue(value: CodeableConcept): Self = StObject.set(x, "revenue", value.asInstanceOf[js.Any])
    
    inline def setRevenueUndefined: Self = StObject.set(x, "revenue", js.undefined)
    
    inline def setSequence(value: Double): Self = StObject.set(x, "sequence", value.asInstanceOf[js.Any])
    
    inline def setUdi(value: js.Array[Reference]): Self = StObject.set(x, "udi", value.asInstanceOf[js.Any])
    
    inline def setUdiUndefined: Self = StObject.set(x, "udi", js.undefined)
    
    inline def setUdiVarargs(value: Reference*): Self = StObject.set(x, "udi", js.Array(value*))
    
    inline def setUnitPrice(value: Money): Self = StObject.set(x, "unitPrice", value.asInstanceOf[js.Any])
    
    inline def setUnitPriceUndefined: Self = StObject.set(x, "unitPrice", js.undefined)
  }
}
