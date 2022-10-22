package typingsJapgolly.fhir.r5Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PlanDefinitionActionOutput
  extends StObject
     with BackboneElement {
  
  var _relatedData: js.UndefOr[Element] = js.undefined
  
  var _title: js.UndefOr[Element] = js.undefined
  
  /**
    * The relatedData element allows indicating that the output of child action is also the output of a parent action. It also allows the input of one action to be identified as the output of a different action
    */
  var relatedData: js.UndefOr[String] = js.undefined
  
  /**
    * Defines the data that results as output from the action.
    */
  var requirement: js.UndefOr[DataRequirement] = js.undefined
  
  /**
    * A human-readable label for the data requirement used to label data flows in BPMN or similar diagrams. Also provides a human readable label when rendering the data requirement that conveys its purpose to human readers.
    */
  var title: js.UndefOr[String] = js.undefined
}
object PlanDefinitionActionOutput {
  
  inline def apply(): PlanDefinitionActionOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PlanDefinitionActionOutput]
  }
  
  extension [Self <: PlanDefinitionActionOutput](x: Self) {
    
    inline def setRelatedData(value: String): Self = StObject.set(x, "relatedData", value.asInstanceOf[js.Any])
    
    inline def setRelatedDataUndefined: Self = StObject.set(x, "relatedData", js.undefined)
    
    inline def setRequirement(value: DataRequirement): Self = StObject.set(x, "requirement", value.asInstanceOf[js.Any])
    
    inline def setRequirementUndefined: Self = StObject.set(x, "requirement", js.undefined)
    
    inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    inline def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
    
    inline def set_relatedData(value: Element): Self = StObject.set(x, "_relatedData", value.asInstanceOf[js.Any])
    
    inline def set_relatedDataUndefined: Self = StObject.set(x, "_relatedData", js.undefined)
    
    inline def set_title(value: Element): Self = StObject.set(x, "_title", value.asInstanceOf[js.Any])
    
    inline def set_titleUndefined: Self = StObject.set(x, "_title", js.undefined)
  }
}
