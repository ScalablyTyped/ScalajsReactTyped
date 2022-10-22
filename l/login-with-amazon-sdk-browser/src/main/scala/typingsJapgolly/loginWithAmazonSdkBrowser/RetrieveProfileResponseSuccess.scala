package typingsJapgolly.loginWithAmazonSdkBrowser

import typingsJapgolly.loginWithAmazonSdkBrowser.loginWithAmazonSdkBrowserBooleans.`true`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Response type if `retrieveProfile` call succeeded.
  */
trait RetrieveProfileResponseSuccess
  extends StObject
     with RetrieveProfileResponse {
  
  /**
    * Contains the user's profile information.
    */
  var profile: UserProfile
  
  /**
    * Indicates whether profile was successfully retrieved.
    * For this type, it is always true.
    */
  var success: `true`
}
object RetrieveProfileResponseSuccess {
  
  inline def apply(profile: UserProfile): RetrieveProfileResponseSuccess = {
    val __obj = js.Dynamic.literal(profile = profile.asInstanceOf[js.Any], success = true)
    __obj.asInstanceOf[RetrieveProfileResponseSuccess]
  }
  
  extension [Self <: RetrieveProfileResponseSuccess](x: Self) {
    
    inline def setProfile(value: UserProfile): Self = StObject.set(x, "profile", value.asInstanceOf[js.Any])
    
    inline def setSuccess(value: `true`): Self = StObject.set(x, "success", value.asInstanceOf[js.Any])
  }
}
