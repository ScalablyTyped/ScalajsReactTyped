package typingsJapgolly.awsSdk.clientsGuarddutyMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetRemainingFreeTrialDaysRequest extends StObject {
  
  /**
    * A list of account identifiers of the GuardDuty member account.
    */
  var AccountIds: js.UndefOr[typingsJapgolly.awsSdk.clientsGuarddutyMod.AccountIds] = js.undefined
  
  /**
    * The unique ID of the detector of the GuardDuty member account.
    */
  var DetectorId: typingsJapgolly.awsSdk.clientsGuarddutyMod.DetectorId
}
object GetRemainingFreeTrialDaysRequest {
  
  inline def apply(DetectorId: DetectorId): GetRemainingFreeTrialDaysRequest = {
    val __obj = js.Dynamic.literal(DetectorId = DetectorId.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetRemainingFreeTrialDaysRequest]
  }
  
  extension [Self <: GetRemainingFreeTrialDaysRequest](x: Self) {
    
    inline def setAccountIds(value: AccountIds): Self = StObject.set(x, "AccountIds", value.asInstanceOf[js.Any])
    
    inline def setAccountIdsUndefined: Self = StObject.set(x, "AccountIds", js.undefined)
    
    inline def setAccountIdsVarargs(value: AccountId*): Self = StObject.set(x, "AccountIds", js.Array(value*))
    
    inline def setDetectorId(value: DetectorId): Self = StObject.set(x, "DetectorId", value.asInstanceOf[js.Any])
  }
}
