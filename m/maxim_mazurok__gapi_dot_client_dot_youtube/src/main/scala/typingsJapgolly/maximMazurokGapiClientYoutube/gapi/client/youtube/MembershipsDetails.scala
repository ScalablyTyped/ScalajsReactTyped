package typingsJapgolly.maximMazurokGapiClientYoutube.gapi.client.youtube

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MembershipsDetails extends StObject {
  
  /** Ids of all levels that the user has access to. This includes the currently active level and all other levels that are included because of a higher purchase. */
  var accessibleLevels: js.UndefOr[js.Array[String]] = js.undefined
  
  /** Id of the highest level that the user has access to at the moment. */
  var highestAccessibleLevel: js.UndefOr[String] = js.undefined
  
  /** Display name for the highest level that the user has access to at the moment. */
  var highestAccessibleLevelDisplayName: js.UndefOr[String] = js.undefined
  
  /** Data about memberships duration without taking into consideration pricing levels. */
  var membershipsDuration: js.UndefOr[MembershipsDuration] = js.undefined
  
  /** Data about memberships duration on particular pricing levels. */
  var membershipsDurationAtLevels: js.UndefOr[js.Array[MembershipsDurationAtLevel]] = js.undefined
}
object MembershipsDetails {
  
  inline def apply(): MembershipsDetails = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MembershipsDetails]
  }
  
  extension [Self <: MembershipsDetails](x: Self) {
    
    inline def setAccessibleLevels(value: js.Array[String]): Self = StObject.set(x, "accessibleLevels", value.asInstanceOf[js.Any])
    
    inline def setAccessibleLevelsUndefined: Self = StObject.set(x, "accessibleLevels", js.undefined)
    
    inline def setAccessibleLevelsVarargs(value: String*): Self = StObject.set(x, "accessibleLevels", js.Array(value*))
    
    inline def setHighestAccessibleLevel(value: String): Self = StObject.set(x, "highestAccessibleLevel", value.asInstanceOf[js.Any])
    
    inline def setHighestAccessibleLevelDisplayName(value: String): Self = StObject.set(x, "highestAccessibleLevelDisplayName", value.asInstanceOf[js.Any])
    
    inline def setHighestAccessibleLevelDisplayNameUndefined: Self = StObject.set(x, "highestAccessibleLevelDisplayName", js.undefined)
    
    inline def setHighestAccessibleLevelUndefined: Self = StObject.set(x, "highestAccessibleLevel", js.undefined)
    
    inline def setMembershipsDuration(value: MembershipsDuration): Self = StObject.set(x, "membershipsDuration", value.asInstanceOf[js.Any])
    
    inline def setMembershipsDurationAtLevels(value: js.Array[MembershipsDurationAtLevel]): Self = StObject.set(x, "membershipsDurationAtLevels", value.asInstanceOf[js.Any])
    
    inline def setMembershipsDurationAtLevelsUndefined: Self = StObject.set(x, "membershipsDurationAtLevels", js.undefined)
    
    inline def setMembershipsDurationAtLevelsVarargs(value: MembershipsDurationAtLevel*): Self = StObject.set(x, "membershipsDurationAtLevels", js.Array(value*))
    
    inline def setMembershipsDurationUndefined: Self = StObject.set(x, "membershipsDuration", js.undefined)
  }
}
