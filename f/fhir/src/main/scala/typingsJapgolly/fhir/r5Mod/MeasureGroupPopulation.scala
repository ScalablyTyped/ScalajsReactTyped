package typingsJapgolly.fhir.r5Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MeasureGroupPopulation
  extends StObject
     with BackboneElement {
  
  var _description: js.UndefOr[Element] = js.undefined
  
  var _inputPopulationId: js.UndefOr[Element] = js.undefined
  
  /**
    * Specifies which method should be used to aggregate measure observation values. For most scoring types, this is implied by scoring (e.g. a proportion measure counts members of the populations). For continuous variables, however, this information must be specified to ensure correct calculation.
    */
  var aggregateMethod: js.UndefOr[CodeableConcept] = js.undefined
  
  /**
    * The type of population criteria.
    */
  var code: js.UndefOr[CodeableConcept] = js.undefined
  
  /**
    * In the case of a continuous-variable or ratio measure, this may be the name of a function that calculates the value of the individual observation for each patient or event in the population. For these types of measures, individual observations are reported as observation resources included in the evaluatedResources bundle for each patient. See the MeasureReport resource or the Quality Reporting topic for more information.
    */
  var criteria: Expression
  
  /**
    * The human readable description of this population criteria.
    */
  var description: js.UndefOr[String] = js.undefined
  
  /**
    * The id of a population element in this measure that provides the input for this population criteria. In most cases, the scoring structure of the measure implies specific relationships (e.g. the Numerator uses the Denominator as the source in a proportion scoring). In some cases, however, multiple possible choices exist and must be resolved explicitly. For example in a ratio measure with multiple initial populations, the denominator must specify which population should be used as the starting point.
    */
  var inputPopulationId: js.UndefOr[String] = js.undefined
}
object MeasureGroupPopulation {
  
  inline def apply(criteria: Expression): MeasureGroupPopulation = {
    val __obj = js.Dynamic.literal(criteria = criteria.asInstanceOf[js.Any])
    __obj.asInstanceOf[MeasureGroupPopulation]
  }
  
  extension [Self <: MeasureGroupPopulation](x: Self) {
    
    inline def setAggregateMethod(value: CodeableConcept): Self = StObject.set(x, "aggregateMethod", value.asInstanceOf[js.Any])
    
    inline def setAggregateMethodUndefined: Self = StObject.set(x, "aggregateMethod", js.undefined)
    
    inline def setCode(value: CodeableConcept): Self = StObject.set(x, "code", value.asInstanceOf[js.Any])
    
    inline def setCodeUndefined: Self = StObject.set(x, "code", js.undefined)
    
    inline def setCriteria(value: Expression): Self = StObject.set(x, "criteria", value.asInstanceOf[js.Any])
    
    inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    inline def setInputPopulationId(value: String): Self = StObject.set(x, "inputPopulationId", value.asInstanceOf[js.Any])
    
    inline def setInputPopulationIdUndefined: Self = StObject.set(x, "inputPopulationId", js.undefined)
    
    inline def set_description(value: Element): Self = StObject.set(x, "_description", value.asInstanceOf[js.Any])
    
    inline def set_descriptionUndefined: Self = StObject.set(x, "_description", js.undefined)
    
    inline def set_inputPopulationId(value: Element): Self = StObject.set(x, "_inputPopulationId", value.asInstanceOf[js.Any])
    
    inline def set_inputPopulationIdUndefined: Self = StObject.set(x, "_inputPopulationId", js.undefined)
  }
}
