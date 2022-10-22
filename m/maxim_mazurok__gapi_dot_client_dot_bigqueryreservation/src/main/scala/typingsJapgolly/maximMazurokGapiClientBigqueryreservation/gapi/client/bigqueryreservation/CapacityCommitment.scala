package typingsJapgolly.maximMazurokGapiClientBigqueryreservation.gapi.client.bigqueryreservation

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CapacityCommitment extends StObject {
  
  /** Output only. The end of the current commitment period. It is applicable only for ACTIVE capacity commitments. */
  var commitmentEndTime: js.UndefOr[String] = js.undefined
  
  /** Output only. The start of the current commitment period. It is applicable only for ACTIVE capacity commitments. */
  var commitmentStartTime: js.UndefOr[String] = js.undefined
  
  /** Output only. For FAILED commitment plan, provides the reason of failure. */
  var failureStatus: js.UndefOr[Status] = js.undefined
  
  /**
    * Applicable only for commitments located within one of the BigQuery multi-regions (US or EU). If set to true, this commitment is placed in the organization's secondary region which
    * is designated for disaster recovery purposes. If false, this commitment is placed in the organization's default region.
    */
  var multiRegionAuxiliary: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Output only. The resource name of the capacity commitment, e.g., `projects/myproject/locations/US/capacityCommitments/123` The commitment_id must only contain lower case
    * alphanumeric characters or dashes. It must start with a letter and must not end with a dash. Its maximum length is 64 characters.
    */
  var name: js.UndefOr[String] = js.undefined
  
  /** Capacity commitment commitment plan. */
  var plan: js.UndefOr[String] = js.undefined
  
  /**
    * The plan this capacity commitment is converted to after commitment_end_time passes. Once the plan is changed, committed period is extended according to commitment plan. Only
    * applicable for ANNUAL and TRIAL commitments.
    */
  var renewalPlan: js.UndefOr[String] = js.undefined
  
  /** Number of slots in this commitment. */
  var slotCount: js.UndefOr[String] = js.undefined
  
  /** Output only. State of the commitment. */
  var state: js.UndefOr[String] = js.undefined
}
object CapacityCommitment {
  
  inline def apply(): CapacityCommitment = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CapacityCommitment]
  }
  
  extension [Self <: CapacityCommitment](x: Self) {
    
    inline def setCommitmentEndTime(value: String): Self = StObject.set(x, "commitmentEndTime", value.asInstanceOf[js.Any])
    
    inline def setCommitmentEndTimeUndefined: Self = StObject.set(x, "commitmentEndTime", js.undefined)
    
    inline def setCommitmentStartTime(value: String): Self = StObject.set(x, "commitmentStartTime", value.asInstanceOf[js.Any])
    
    inline def setCommitmentStartTimeUndefined: Self = StObject.set(x, "commitmentStartTime", js.undefined)
    
    inline def setFailureStatus(value: Status): Self = StObject.set(x, "failureStatus", value.asInstanceOf[js.Any])
    
    inline def setFailureStatusUndefined: Self = StObject.set(x, "failureStatus", js.undefined)
    
    inline def setMultiRegionAuxiliary(value: Boolean): Self = StObject.set(x, "multiRegionAuxiliary", value.asInstanceOf[js.Any])
    
    inline def setMultiRegionAuxiliaryUndefined: Self = StObject.set(x, "multiRegionAuxiliary", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setPlan(value: String): Self = StObject.set(x, "plan", value.asInstanceOf[js.Any])
    
    inline def setPlanUndefined: Self = StObject.set(x, "plan", js.undefined)
    
    inline def setRenewalPlan(value: String): Self = StObject.set(x, "renewalPlan", value.asInstanceOf[js.Any])
    
    inline def setRenewalPlanUndefined: Self = StObject.set(x, "renewalPlan", js.undefined)
    
    inline def setSlotCount(value: String): Self = StObject.set(x, "slotCount", value.asInstanceOf[js.Any])
    
    inline def setSlotCountUndefined: Self = StObject.set(x, "slotCount", js.undefined)
    
    inline def setState(value: String): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
    
    inline def setStateUndefined: Self = StObject.set(x, "state", js.undefined)
  }
}
