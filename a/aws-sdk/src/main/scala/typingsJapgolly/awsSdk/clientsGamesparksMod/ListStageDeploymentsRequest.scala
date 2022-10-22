package typingsJapgolly.awsSdk.clientsGamesparksMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListStageDeploymentsRequest extends StObject {
  
  /**
    * The name of the game.
    */
  var GameName: typingsJapgolly.awsSdk.clientsGamesparksMod.GameName
  
  /**
    * The maximum number of results to return.  Use this parameter with NextToken to get results as a set of sequential pages. 
    */
  var MaxResults: js.UndefOr[typingsJapgolly.awsSdk.clientsGamesparksMod.MaxResults] = js.undefined
  
  /**
    * The token that indicates the start of the next sequential page of results.  Use the token that is returned with a previous call to this operation. To start at the beginning of the result set, do not specify a value. 
    */
  var NextToken: js.UndefOr[typingsJapgolly.awsSdk.clientsGamesparksMod.NextToken] = js.undefined
  
  /**
    * The name of the stage.
    */
  var StageName: typingsJapgolly.awsSdk.clientsGamesparksMod.StageName
}
object ListStageDeploymentsRequest {
  
  inline def apply(GameName: GameName, StageName: StageName): ListStageDeploymentsRequest = {
    val __obj = js.Dynamic.literal(GameName = GameName.asInstanceOf[js.Any], StageName = StageName.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListStageDeploymentsRequest]
  }
  
  extension [Self <: ListStageDeploymentsRequest](x: Self) {
    
    inline def setGameName(value: GameName): Self = StObject.set(x, "GameName", value.asInstanceOf[js.Any])
    
    inline def setMaxResults(value: MaxResults): Self = StObject.set(x, "MaxResults", value.asInstanceOf[js.Any])
    
    inline def setMaxResultsUndefined: Self = StObject.set(x, "MaxResults", js.undefined)
    
    inline def setNextToken(value: NextToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
    
    inline def setStageName(value: StageName): Self = StObject.set(x, "StageName", value.asInstanceOf[js.Any])
  }
}
