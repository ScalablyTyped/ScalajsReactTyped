package typingsJapgolly.intercomClient

import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.intercomClient.intercomClientStrings.visitor
import typingsJapgolly.intercomClient.tagMod.Tag
import typingsJapgolly.intercomClient.userMod.Avatar
import typingsJapgolly.intercomClient.userMod.LocationData
import typingsJapgolly.intercomClient.userMod.Segment
import typingsJapgolly.intercomClient.userMod.SocialProfile
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object visitorMod {
  
  trait Visitor extends StObject {
    
    // The name of the Visitor
    var avatar: Avatar
    
    // The time the Lead last recorded making a request
    val created_at: Double
    
    // A list of segments the Visitor
    var custom_attributes: StringDictionary[Any]
    
    // value is 'visitor'
    val id: String
    
    // A Location Object relating to the Visitor
    var last_request_at: Double | Null
    
    // An avatar object for the Visitor
    var location_data: LocationData | js.Object
    
    // Automatically generated identifier for the Visitor
    var name: String | Null
    
    // A list of tags associated with the Visitor
    var segments: js.Array[Segment]
    
    // The last time the Visitor was updated
    var social_profiles: js.Array[SocialProfile]
    
    // Whether the Visitor is unsubscribed from emails
    var tags: js.Array[Tag]
    
    var `type`: visitor
    
    // A list of social profiles associated with the Visitor
    var unsubscribed_from_emails: Boolean
    
    // The time the Visitor was added to Intercom
    val updated_at: Double
    
    // The Intercom defined id representing the Visitor
    var user_id: String | Null
  }
  object Visitor {
    
    inline def apply(
      avatar: Avatar,
      created_at: Double,
      custom_attributes: StringDictionary[Any],
      id: String,
      location_data: LocationData | js.Object,
      segments: js.Array[Segment],
      social_profiles: js.Array[SocialProfile],
      tags: js.Array[Tag],
      unsubscribed_from_emails: Boolean,
      updated_at: Double
    ): Visitor = {
      val __obj = js.Dynamic.literal(avatar = avatar.asInstanceOf[js.Any], created_at = created_at.asInstanceOf[js.Any], custom_attributes = custom_attributes.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], location_data = location_data.asInstanceOf[js.Any], segments = segments.asInstanceOf[js.Any], social_profiles = social_profiles.asInstanceOf[js.Any], tags = tags.asInstanceOf[js.Any], unsubscribed_from_emails = unsubscribed_from_emails.asInstanceOf[js.Any], updated_at = updated_at.asInstanceOf[js.Any], last_request_at = null, name = null, user_id = null)
      __obj.updateDynamic("type")("visitor")
      __obj.asInstanceOf[Visitor]
    }
    
    extension [Self <: Visitor](x: Self) {
      
      inline def setAvatar(value: Avatar): Self = StObject.set(x, "avatar", value.asInstanceOf[js.Any])
      
      inline def setCreated_at(value: Double): Self = StObject.set(x, "created_at", value.asInstanceOf[js.Any])
      
      inline def setCustom_attributes(value: StringDictionary[Any]): Self = StObject.set(x, "custom_attributes", value.asInstanceOf[js.Any])
      
      inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setLast_request_at(value: Double): Self = StObject.set(x, "last_request_at", value.asInstanceOf[js.Any])
      
      inline def setLast_request_atNull: Self = StObject.set(x, "last_request_at", null)
      
      inline def setLocation_data(value: LocationData | js.Object): Self = StObject.set(x, "location_data", value.asInstanceOf[js.Any])
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setNameNull: Self = StObject.set(x, "name", null)
      
      inline def setSegments(value: js.Array[Segment]): Self = StObject.set(x, "segments", value.asInstanceOf[js.Any])
      
      inline def setSegmentsVarargs(value: Segment*): Self = StObject.set(x, "segments", js.Array(value*))
      
      inline def setSocial_profiles(value: js.Array[SocialProfile]): Self = StObject.set(x, "social_profiles", value.asInstanceOf[js.Any])
      
      inline def setSocial_profilesVarargs(value: SocialProfile*): Self = StObject.set(x, "social_profiles", js.Array(value*))
      
      inline def setTags(value: js.Array[Tag]): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
      
      inline def setTagsVarargs(value: Tag*): Self = StObject.set(x, "tags", js.Array(value*))
      
      inline def setType(value: visitor): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setUnsubscribed_from_emails(value: Boolean): Self = StObject.set(x, "unsubscribed_from_emails", value.asInstanceOf[js.Any])
      
      inline def setUpdated_at(value: Double): Self = StObject.set(x, "updated_at", value.asInstanceOf[js.Any])
      
      inline def setUser_id(value: String): Self = StObject.set(x, "user_id", value.asInstanceOf[js.Any])
      
      inline def setUser_idNull: Self = StObject.set(x, "user_id", null)
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.intercomClient.anon.IdString
    - typingsJapgolly.intercomClient.anon.Userid
  */
  trait VisitorIdentifier extends StObject
  object VisitorIdentifier {
    
    inline def IdString(id: String): typingsJapgolly.intercomClient.anon.IdString = {
      val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsJapgolly.intercomClient.anon.IdString]
    }
    
    inline def Userid(user_id: String): typingsJapgolly.intercomClient.anon.Userid = {
      val __obj = js.Dynamic.literal(user_id = user_id.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsJapgolly.intercomClient.anon.Userid]
    }
  }
}
