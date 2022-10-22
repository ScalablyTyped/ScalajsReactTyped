package typingsJapgolly.awsSdk.clientsWellarchitectedMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpgradeLensReviewInput extends StObject {
  
  var ClientRequestToken: js.UndefOr[typingsJapgolly.awsSdk.clientsWellarchitectedMod.ClientRequestToken] = js.undefined
  
  var LensAlias: typingsJapgolly.awsSdk.clientsWellarchitectedMod.LensAlias
  
  var MilestoneName: typingsJapgolly.awsSdk.clientsWellarchitectedMod.MilestoneName
  
  var WorkloadId: typingsJapgolly.awsSdk.clientsWellarchitectedMod.WorkloadId
}
object UpgradeLensReviewInput {
  
  inline def apply(LensAlias: LensAlias, MilestoneName: MilestoneName, WorkloadId: WorkloadId): UpgradeLensReviewInput = {
    val __obj = js.Dynamic.literal(LensAlias = LensAlias.asInstanceOf[js.Any], MilestoneName = MilestoneName.asInstanceOf[js.Any], WorkloadId = WorkloadId.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpgradeLensReviewInput]
  }
  
  extension [Self <: UpgradeLensReviewInput](x: Self) {
    
    inline def setClientRequestToken(value: ClientRequestToken): Self = StObject.set(x, "ClientRequestToken", value.asInstanceOf[js.Any])
    
    inline def setClientRequestTokenUndefined: Self = StObject.set(x, "ClientRequestToken", js.undefined)
    
    inline def setLensAlias(value: LensAlias): Self = StObject.set(x, "LensAlias", value.asInstanceOf[js.Any])
    
    inline def setMilestoneName(value: MilestoneName): Self = StObject.set(x, "MilestoneName", value.asInstanceOf[js.Any])
    
    inline def setWorkloadId(value: WorkloadId): Self = StObject.set(x, "WorkloadId", value.asInstanceOf[js.Any])
  }
}
