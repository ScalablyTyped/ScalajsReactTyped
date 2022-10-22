package typingsJapgolly.firebaseAuth

import typingsJapgolly.firebaseAuth.distEsm2017SrcModelIdTokenMod.IdTokenResponse
import typingsJapgolly.firebaseAuth.distEsm2017SrcModelPublicTypesMod.AdditionalUserInfo
import typingsJapgolly.firebaseAuth.distEsm2017SrcModelPublicTypesMod.UserCredential
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distEsm2017SrcCoreUserAdditionalUserInfoMod {
  
  @JSImport("@firebase/auth/dist/esm2017/src/core/user/additional_user_info", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def fromIdTokenResponse(): AdditionalUserInfo | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("_fromIdTokenResponse")().asInstanceOf[AdditionalUserInfo | Null]
  inline def fromIdTokenResponse(idTokenResponse: IdTokenResponse): AdditionalUserInfo | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("_fromIdTokenResponse")(idTokenResponse.asInstanceOf[js.Any]).asInstanceOf[AdditionalUserInfo | Null]
  
  inline def getAdditionalUserInfo(userCredential: UserCredential): AdditionalUserInfo | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("getAdditionalUserInfo")(userCredential.asInstanceOf[js.Any]).asInstanceOf[AdditionalUserInfo | Null]
}
