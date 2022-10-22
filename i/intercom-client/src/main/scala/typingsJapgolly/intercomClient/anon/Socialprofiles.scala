package typingsJapgolly.intercomClient.anon

import typingsJapgolly.intercomClient.intercomClientStrings.social_profileDotlist
import typingsJapgolly.intercomClient.userMod.SocialProfile
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Socialprofiles extends StObject {
  
  var social_profiles: js.Array[SocialProfile]
  
  var `type`: social_profileDotlist
}
object Socialprofiles {
  
  inline def apply(social_profiles: js.Array[SocialProfile]): Socialprofiles = {
    val __obj = js.Dynamic.literal(social_profiles = social_profiles.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("social_profile.list")
    __obj.asInstanceOf[Socialprofiles]
  }
  
  extension [Self <: Socialprofiles](x: Self) {
    
    inline def setSocial_profiles(value: js.Array[SocialProfile]): Self = StObject.set(x, "social_profiles", value.asInstanceOf[js.Any])
    
    inline def setSocial_profilesVarargs(value: SocialProfile*): Self = StObject.set(x, "social_profiles", js.Array(value*))
    
    inline def setType(value: social_profileDotlist): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
