package typingsJapgolly.firebaseAuth

import typingsJapgolly.firebaseAuth.distCordovaSrcModelIdTokenMod.IdTokenResponse
import typingsJapgolly.firebaseAuth.distCordovaSrcModelPublicTypesMod.Auth
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distCordovaSrcApiAccountManagementProfileMod {
  
  @JSImport("@firebase/auth/dist/cordova/src/api/account_management/profile", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def updateProfile(auth: Auth, request: UpdateProfileRequest): js.Promise[UpdateProfileResponse] = (^.asInstanceOf[js.Dynamic].applyDynamic("updateProfile")(auth.asInstanceOf[js.Any], request.asInstanceOf[js.Any])).asInstanceOf[js.Promise[UpdateProfileResponse]]
  
  trait UpdateProfileRequest extends StObject {
    
    var displayName: js.UndefOr[String | Null] = js.undefined
    
    var idToken: String
    
    var photoUrl: js.UndefOr[String | Null] = js.undefined
    
    var returnSecureToken: Boolean
  }
  object UpdateProfileRequest {
    
    inline def apply(idToken: String, returnSecureToken: Boolean): UpdateProfileRequest = {
      val __obj = js.Dynamic.literal(idToken = idToken.asInstanceOf[js.Any], returnSecureToken = returnSecureToken.asInstanceOf[js.Any])
      __obj.asInstanceOf[UpdateProfileRequest]
    }
    
    extension [Self <: UpdateProfileRequest](x: Self) {
      
      inline def setDisplayName(value: String): Self = StObject.set(x, "displayName", value.asInstanceOf[js.Any])
      
      inline def setDisplayNameNull: Self = StObject.set(x, "displayName", null)
      
      inline def setDisplayNameUndefined: Self = StObject.set(x, "displayName", js.undefined)
      
      inline def setIdToken(value: String): Self = StObject.set(x, "idToken", value.asInstanceOf[js.Any])
      
      inline def setPhotoUrl(value: String): Self = StObject.set(x, "photoUrl", value.asInstanceOf[js.Any])
      
      inline def setPhotoUrlNull: Self = StObject.set(x, "photoUrl", null)
      
      inline def setPhotoUrlUndefined: Self = StObject.set(x, "photoUrl", js.undefined)
      
      inline def setReturnSecureToken(value: Boolean): Self = StObject.set(x, "returnSecureToken", value.asInstanceOf[js.Any])
    }
  }
  
  trait UpdateProfileResponse
    extends StObject
       with IdTokenResponse
  object UpdateProfileResponse {
    
    inline def apply(localId: String): UpdateProfileResponse = {
      val __obj = js.Dynamic.literal(localId = localId.asInstanceOf[js.Any])
      __obj.asInstanceOf[UpdateProfileResponse]
    }
  }
}
