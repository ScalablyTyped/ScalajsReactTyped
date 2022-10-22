package typingsJapgolly.dialogflow.protosProtosMod.google.cloud.dialogflow.v2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Properties of a SearchAgentsResponse. */
trait ISearchAgentsResponse extends StObject {
  
  /** SearchAgentsResponse agents */
  var agents: js.UndefOr[js.Array[IAgent] | Null] = js.undefined
  
  /** SearchAgentsResponse nextPageToken */
  var nextPageToken: js.UndefOr[String | Null] = js.undefined
}
object ISearchAgentsResponse {
  
  inline def apply(): ISearchAgentsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ISearchAgentsResponse]
  }
  
  extension [Self <: ISearchAgentsResponse](x: Self) {
    
    inline def setAgents(value: js.Array[IAgent]): Self = StObject.set(x, "agents", value.asInstanceOf[js.Any])
    
    inline def setAgentsNull: Self = StObject.set(x, "agents", null)
    
    inline def setAgentsUndefined: Self = StObject.set(x, "agents", js.undefined)
    
    inline def setAgentsVarargs(value: IAgent*): Self = StObject.set(x, "agents", js.Array(value*))
    
    inline def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
    
    inline def setNextPageTokenNull: Self = StObject.set(x, "nextPageToken", null)
    
    inline def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
  }
}
