package typingsJapgolly.awsSdk.clientsGamesparksMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StartStageDeploymentRequest extends StObject {
  
  /**
    *  A client-defined token. With an active client token in the request, this action is idempotent. 
    */
  var ClientToken: js.UndefOr[typingsJapgolly.awsSdk.clientsGamesparksMod.ClientToken] = js.undefined
  
  /**
    * The name of the game.
    */
  var GameName: typingsJapgolly.awsSdk.clientsGamesparksMod.GameName
  
  /**
    * The identifier of the snapshot to deploy.
    */
  var SnapshotId: typingsJapgolly.awsSdk.clientsGamesparksMod.SnapshotId
  
  /**
    * The name of the stage to deploy the snapshot onto.
    */
  var StageName: typingsJapgolly.awsSdk.clientsGamesparksMod.StageName
}
object StartStageDeploymentRequest {
  
  inline def apply(GameName: GameName, SnapshotId: SnapshotId, StageName: StageName): StartStageDeploymentRequest = {
    val __obj = js.Dynamic.literal(GameName = GameName.asInstanceOf[js.Any], SnapshotId = SnapshotId.asInstanceOf[js.Any], StageName = StageName.asInstanceOf[js.Any])
    __obj.asInstanceOf[StartStageDeploymentRequest]
  }
  
  extension [Self <: StartStageDeploymentRequest](x: Self) {
    
    inline def setClientToken(value: ClientToken): Self = StObject.set(x, "ClientToken", value.asInstanceOf[js.Any])
    
    inline def setClientTokenUndefined: Self = StObject.set(x, "ClientToken", js.undefined)
    
    inline def setGameName(value: GameName): Self = StObject.set(x, "GameName", value.asInstanceOf[js.Any])
    
    inline def setSnapshotId(value: SnapshotId): Self = StObject.set(x, "SnapshotId", value.asInstanceOf[js.Any])
    
    inline def setStageName(value: StageName): Self = StObject.set(x, "StageName", value.asInstanceOf[js.Any])
  }
}
