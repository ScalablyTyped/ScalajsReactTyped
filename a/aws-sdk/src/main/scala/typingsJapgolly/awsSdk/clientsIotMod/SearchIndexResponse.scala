package typingsJapgolly.awsSdk.clientsIotMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SearchIndexResponse extends StObject {
  
  /**
    * The token used to get the next set of results, or null if there are no additional results.
    */
  var nextToken: js.UndefOr[NextToken] = js.undefined
  
  /**
    * The thing groups that match the search query.
    */
  var thingGroups: js.UndefOr[ThingGroupDocumentList] = js.undefined
  
  /**
    * The things that match the search query.
    */
  var things: js.UndefOr[ThingDocumentList] = js.undefined
}
object SearchIndexResponse {
  
  inline def apply(): SearchIndexResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SearchIndexResponse]
  }
  
  extension [Self <: SearchIndexResponse](x: Self) {
    
    inline def setNextToken(value: NextToken): Self = StObject.set(x, "nextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "nextToken", js.undefined)
    
    inline def setThingGroups(value: ThingGroupDocumentList): Self = StObject.set(x, "thingGroups", value.asInstanceOf[js.Any])
    
    inline def setThingGroupsUndefined: Self = StObject.set(x, "thingGroups", js.undefined)
    
    inline def setThingGroupsVarargs(value: ThingGroupDocument*): Self = StObject.set(x, "thingGroups", js.Array(value*))
    
    inline def setThings(value: ThingDocumentList): Self = StObject.set(x, "things", value.asInstanceOf[js.Any])
    
    inline def setThingsUndefined: Self = StObject.set(x, "things", js.undefined)
    
    inline def setThingsVarargs(value: ThingDocument*): Self = StObject.set(x, "things", js.Array(value*))
  }
}
