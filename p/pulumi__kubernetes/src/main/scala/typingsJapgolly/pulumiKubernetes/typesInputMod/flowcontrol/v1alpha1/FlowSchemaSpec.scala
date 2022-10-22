package typingsJapgolly.pulumiKubernetes.typesInputMod.flowcontrol.v1alpha1

import typingsJapgolly.pulumiPulumi.outputMod.Input
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * FlowSchemaSpec describes how the FlowSchema's specification looks like.
  */
trait FlowSchemaSpec extends StObject {
  
  /**
    * `distinguisherMethod` defines how to compute the flow distinguisher for requests that match this schema. `nil` specifies that the distinguisher is disabled and thus will always be the empty string.
    */
  var distinguisherMethod: js.UndefOr[Input[FlowDistinguisherMethod]] = js.undefined
  
  /**
    * `matchingPrecedence` is used to choose among the FlowSchemas that match a given request. The chosen FlowSchema is among those with the numerically lowest (which we take to be logically highest) MatchingPrecedence.  Each MatchingPrecedence value must be non-negative. Note that if the precedence is not specified or zero, it will be set to 1000 as default.
    */
  var matchingPrecedence: js.UndefOr[Input[Double]] = js.undefined
  
  /**
    * `priorityLevelConfiguration` should reference a PriorityLevelConfiguration in the cluster. If the reference cannot be resolved, the FlowSchema will be ignored and marked as invalid in its status. Required.
    */
  var priorityLevelConfiguration: Input[PriorityLevelConfigurationReference]
  
  /**
    * `rules` describes which requests will match this flow schema. This FlowSchema matches a request if and only if at least one member of rules matches the request. if it is an empty slice, there will be no requests matching the FlowSchema.
    */
  var rules: js.UndefOr[Input[js.Array[Input[PolicyRulesWithSubjects]]]] = js.undefined
}
object FlowSchemaSpec {
  
  inline def apply(priorityLevelConfiguration: Input[PriorityLevelConfigurationReference]): FlowSchemaSpec = {
    val __obj = js.Dynamic.literal(priorityLevelConfiguration = priorityLevelConfiguration.asInstanceOf[js.Any])
    __obj.asInstanceOf[FlowSchemaSpec]
  }
  
  extension [Self <: FlowSchemaSpec](x: Self) {
    
    inline def setDistinguisherMethod(value: Input[FlowDistinguisherMethod]): Self = StObject.set(x, "distinguisherMethod", value.asInstanceOf[js.Any])
    
    inline def setDistinguisherMethodUndefined: Self = StObject.set(x, "distinguisherMethod", js.undefined)
    
    inline def setMatchingPrecedence(value: Input[Double]): Self = StObject.set(x, "matchingPrecedence", value.asInstanceOf[js.Any])
    
    inline def setMatchingPrecedenceUndefined: Self = StObject.set(x, "matchingPrecedence", js.undefined)
    
    inline def setPriorityLevelConfiguration(value: Input[PriorityLevelConfigurationReference]): Self = StObject.set(x, "priorityLevelConfiguration", value.asInstanceOf[js.Any])
    
    inline def setRules(value: Input[js.Array[Input[PolicyRulesWithSubjects]]]): Self = StObject.set(x, "rules", value.asInstanceOf[js.Any])
    
    inline def setRulesUndefined: Self = StObject.set(x, "rules", js.undefined)
    
    inline def setRulesVarargs(value: Input[PolicyRulesWithSubjects]*): Self = StObject.set(x, "rules", js.Array(value*))
  }
}
