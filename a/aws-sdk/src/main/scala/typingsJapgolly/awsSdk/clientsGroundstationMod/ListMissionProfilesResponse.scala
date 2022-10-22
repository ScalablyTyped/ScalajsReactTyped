package typingsJapgolly.awsSdk.clientsGroundstationMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListMissionProfilesResponse extends StObject {
  
  /**
    * List of mission profiles.
    */
  var missionProfileList: js.UndefOr[MissionProfileList] = js.undefined
  
  /**
    * Next token returned in the response of a previous ListMissionProfiles call. Used to get the next page of results.
    */
  var nextToken: js.UndefOr[String] = js.undefined
}
object ListMissionProfilesResponse {
  
  inline def apply(): ListMissionProfilesResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListMissionProfilesResponse]
  }
  
  extension [Self <: ListMissionProfilesResponse](x: Self) {
    
    inline def setMissionProfileList(value: MissionProfileList): Self = StObject.set(x, "missionProfileList", value.asInstanceOf[js.Any])
    
    inline def setMissionProfileListUndefined: Self = StObject.set(x, "missionProfileList", js.undefined)
    
    inline def setMissionProfileListVarargs(value: MissionProfileListItem*): Self = StObject.set(x, "missionProfileList", js.Array(value*))
    
    inline def setNextToken(value: String): Self = StObject.set(x, "nextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "nextToken", js.undefined)
  }
}
