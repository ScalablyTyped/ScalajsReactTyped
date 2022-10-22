package typingsJapgolly.fhir.r5Mod

import typingsJapgolly.fhir.fhirStrings.`after-end`
import typingsJapgolly.fhir.fhirStrings.`after-start`
import typingsJapgolly.fhir.fhirStrings.`before-end`
import typingsJapgolly.fhir.fhirStrings.`before-start`
import typingsJapgolly.fhir.fhirStrings.`concurrent-with-end`
import typingsJapgolly.fhir.fhirStrings.`concurrent-with-start`
import typingsJapgolly.fhir.fhirStrings.after
import typingsJapgolly.fhir.fhirStrings.before
import typingsJapgolly.fhir.fhirStrings.concurrent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PlanDefinitionActionRelatedAction
  extends StObject
     with BackboneElement {
  
  var _relationship: js.UndefOr[Element] = js.undefined
  
  var _targetId: js.UndefOr[Element] = js.undefined
  
  /**
    * A duration or range of durations to apply to the relationship. For example, 30-60 minutes before.
    */
  var offsetDuration: js.UndefOr[Duration] = js.undefined
  
  /**
    * A duration or range of durations to apply to the relationship. For example, 30-60 minutes before.
    */
  var offsetRange: js.UndefOr[Range] = js.undefined
  
  /**
    * The relationship of this action to the related action.
    */
  var relationship: `before-start` | before | `before-end` | `concurrent-with-start` | concurrent | `concurrent-with-end` | `after-start` | after | `after-end`
  
  /**
    * The element id of the target related action.
    */
  var targetId: String
}
object PlanDefinitionActionRelatedAction {
  
  inline def apply(
    relationship: `before-start` | before | `before-end` | `concurrent-with-start` | concurrent | `concurrent-with-end` | `after-start` | after | `after-end`,
    targetId: String
  ): PlanDefinitionActionRelatedAction = {
    val __obj = js.Dynamic.literal(relationship = relationship.asInstanceOf[js.Any], targetId = targetId.asInstanceOf[js.Any])
    __obj.asInstanceOf[PlanDefinitionActionRelatedAction]
  }
  
  extension [Self <: PlanDefinitionActionRelatedAction](x: Self) {
    
    inline def setOffsetDuration(value: Duration): Self = StObject.set(x, "offsetDuration", value.asInstanceOf[js.Any])
    
    inline def setOffsetDurationUndefined: Self = StObject.set(x, "offsetDuration", js.undefined)
    
    inline def setOffsetRange(value: Range): Self = StObject.set(x, "offsetRange", value.asInstanceOf[js.Any])
    
    inline def setOffsetRangeUndefined: Self = StObject.set(x, "offsetRange", js.undefined)
    
    inline def setRelationship(
      value: `before-start` | before | `before-end` | `concurrent-with-start` | concurrent | `concurrent-with-end` | `after-start` | after | `after-end`
    ): Self = StObject.set(x, "relationship", value.asInstanceOf[js.Any])
    
    inline def setTargetId(value: String): Self = StObject.set(x, "targetId", value.asInstanceOf[js.Any])
    
    inline def set_relationship(value: Element): Self = StObject.set(x, "_relationship", value.asInstanceOf[js.Any])
    
    inline def set_relationshipUndefined: Self = StObject.set(x, "_relationship", js.undefined)
    
    inline def set_targetId(value: Element): Self = StObject.set(x, "_targetId", value.asInstanceOf[js.Any])
    
    inline def set_targetIdUndefined: Self = StObject.set(x, "_targetId", js.undefined)
  }
}
