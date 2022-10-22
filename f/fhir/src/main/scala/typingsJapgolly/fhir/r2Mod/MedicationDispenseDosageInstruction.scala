package typingsJapgolly.fhir.r2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MedicationDispenseDosageInstruction
  extends StObject
     with BackboneElement {
  
  var _asNeededBoolean: js.UndefOr[Element] = js.undefined
  
  var _text: js.UndefOr[Element] = js.undefined
  
  /**
    * Additional instructions such as "Swallow with plenty of water" which may or may not be coded.
    */
  var additionalInstructions: js.UndefOr[CodeableConcept] = js.undefined
  
  /**
    * Indicates whether the Medication is only taken when needed within a specific dosing schedule (Boolean option), or it indicates the precondition for taking the Medication (CodeableConcept).    Specifically if 'boolean' datatype is selected, then the following logic applies:  If set to True, this indicates that the medication is only taken when needed, within the specified schedule.
    */
  var asNeededBoolean: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Indicates whether the Medication is only taken when needed within a specific dosing schedule (Boolean option), or it indicates the precondition for taking the Medication (CodeableConcept).    Specifically if 'boolean' datatype is selected, then the following logic applies:  If set to True, this indicates that the medication is only taken when needed, within the specified schedule.
    */
  var asNeededCodeableConcept: js.UndefOr[CodeableConcept] = js.undefined
  
  /**
    * The amount of therapeutic or other substance given at one administration event.
    */
  var doseQuantity: js.UndefOr[Quantity] = js.undefined
  
  /**
    * The amount of therapeutic or other substance given at one administration event.
    */
  var doseRange: js.UndefOr[Range] = js.undefined
  
  /**
    * The maximum total quantity of a therapeutic substance that may be administered to a subject over the period of time,  e.g. 1000mg in 24 hours.
    */
  var maxDosePerPeriod: js.UndefOr[Ratio] = js.undefined
  
  /**
    * A coded value indicating the method by which the medication is intended to be or was introduced into or on the body.
    */
  var method: js.UndefOr[CodeableConcept] = js.undefined
  
  /**
    * Identifies the speed with which the medication was or will be introduced into the patient. Typically the rate for an infusion e.g. 100 ml per 1 hour or 100 ml/hr.  May also be expressed as a rate per unit of time e.g. 500 ml per 2 hours.   Currently we do not specify a default of '1' in the denominator, but this is being discussed. Other examples: 200 mcg/min or 200 mcg/1 minute; 1 liter/8 hours.
    */
  var rateRange: js.UndefOr[Range] = js.undefined
  
  /**
    * Identifies the speed with which the medication was or will be introduced into the patient. Typically the rate for an infusion e.g. 100 ml per 1 hour or 100 ml/hr.  May also be expressed as a rate per unit of time e.g. 500 ml per 2 hours.   Currently we do not specify a default of '1' in the denominator, but this is being discussed. Other examples: 200 mcg/min or 200 mcg/1 minute; 1 liter/8 hours.
    */
  var rateRatio: js.UndefOr[Ratio] = js.undefined
  
  /**
    * A code specifying the route or physiological path of administration of a therapeutic agent into or onto a subject.
    */
  var route: js.UndefOr[CodeableConcept] = js.undefined
  
  /**
    * A coded specification of the anatomic site where the medication first enters the body.
    */
  var siteCodeableConcept: js.UndefOr[CodeableConcept] = js.undefined
  
  /**
    * A coded specification of the anatomic site where the medication first enters the body.
    */
  var siteReference: js.UndefOr[Reference] = js.undefined
  
  /**
    * Free text dosage instructions can be used for cases where the instructions are too complex to code. When coded instructions are present, the free text instructions may still be present for display to humans taking or administering the medication.
    */
  var text: js.UndefOr[String] = js.undefined
  
  /**
    * The timing schedule for giving the medication to the patient.  The Schedule data type allows many different expressions.  For example, "Every  8 hours"; "Three times a day"; "1/2 an hour before breakfast for 10 days from 23-Dec 2011:";  "15 Oct 2013, 17 Oct 2013 and 1 Nov 2013".
    */
  var timing: js.UndefOr[Timing] = js.undefined
}
object MedicationDispenseDosageInstruction {
  
  inline def apply(): MedicationDispenseDosageInstruction = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MedicationDispenseDosageInstruction]
  }
  
  extension [Self <: MedicationDispenseDosageInstruction](x: Self) {
    
    inline def setAdditionalInstructions(value: CodeableConcept): Self = StObject.set(x, "additionalInstructions", value.asInstanceOf[js.Any])
    
    inline def setAdditionalInstructionsUndefined: Self = StObject.set(x, "additionalInstructions", js.undefined)
    
    inline def setAsNeededBoolean(value: Boolean): Self = StObject.set(x, "asNeededBoolean", value.asInstanceOf[js.Any])
    
    inline def setAsNeededBooleanUndefined: Self = StObject.set(x, "asNeededBoolean", js.undefined)
    
    inline def setAsNeededCodeableConcept(value: CodeableConcept): Self = StObject.set(x, "asNeededCodeableConcept", value.asInstanceOf[js.Any])
    
    inline def setAsNeededCodeableConceptUndefined: Self = StObject.set(x, "asNeededCodeableConcept", js.undefined)
    
    inline def setDoseQuantity(value: Quantity): Self = StObject.set(x, "doseQuantity", value.asInstanceOf[js.Any])
    
    inline def setDoseQuantityUndefined: Self = StObject.set(x, "doseQuantity", js.undefined)
    
    inline def setDoseRange(value: Range): Self = StObject.set(x, "doseRange", value.asInstanceOf[js.Any])
    
    inline def setDoseRangeUndefined: Self = StObject.set(x, "doseRange", js.undefined)
    
    inline def setMaxDosePerPeriod(value: Ratio): Self = StObject.set(x, "maxDosePerPeriod", value.asInstanceOf[js.Any])
    
    inline def setMaxDosePerPeriodUndefined: Self = StObject.set(x, "maxDosePerPeriod", js.undefined)
    
    inline def setMethod(value: CodeableConcept): Self = StObject.set(x, "method", value.asInstanceOf[js.Any])
    
    inline def setMethodUndefined: Self = StObject.set(x, "method", js.undefined)
    
    inline def setRateRange(value: Range): Self = StObject.set(x, "rateRange", value.asInstanceOf[js.Any])
    
    inline def setRateRangeUndefined: Self = StObject.set(x, "rateRange", js.undefined)
    
    inline def setRateRatio(value: Ratio): Self = StObject.set(x, "rateRatio", value.asInstanceOf[js.Any])
    
    inline def setRateRatioUndefined: Self = StObject.set(x, "rateRatio", js.undefined)
    
    inline def setRoute(value: CodeableConcept): Self = StObject.set(x, "route", value.asInstanceOf[js.Any])
    
    inline def setRouteUndefined: Self = StObject.set(x, "route", js.undefined)
    
    inline def setSiteCodeableConcept(value: CodeableConcept): Self = StObject.set(x, "siteCodeableConcept", value.asInstanceOf[js.Any])
    
    inline def setSiteCodeableConceptUndefined: Self = StObject.set(x, "siteCodeableConcept", js.undefined)
    
    inline def setSiteReference(value: Reference): Self = StObject.set(x, "siteReference", value.asInstanceOf[js.Any])
    
    inline def setSiteReferenceUndefined: Self = StObject.set(x, "siteReference", js.undefined)
    
    inline def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
    
    inline def setTextUndefined: Self = StObject.set(x, "text", js.undefined)
    
    inline def setTiming(value: Timing): Self = StObject.set(x, "timing", value.asInstanceOf[js.Any])
    
    inline def setTimingUndefined: Self = StObject.set(x, "timing", js.undefined)
    
    inline def set_asNeededBoolean(value: Element): Self = StObject.set(x, "_asNeededBoolean", value.asInstanceOf[js.Any])
    
    inline def set_asNeededBooleanUndefined: Self = StObject.set(x, "_asNeededBoolean", js.undefined)
    
    inline def set_text(value: Element): Self = StObject.set(x, "_text", value.asInstanceOf[js.Any])
    
    inline def set_textUndefined: Self = StObject.set(x, "_text", js.undefined)
  }
}
