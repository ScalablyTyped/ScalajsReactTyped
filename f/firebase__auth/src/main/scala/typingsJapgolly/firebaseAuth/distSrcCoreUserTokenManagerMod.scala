package typingsJapgolly.firebaseAuth

import typingsJapgolly.firebaseAuth.distSrcApiAuthenticationMfaMod.FinalizeMfaResponse
import typingsJapgolly.firebaseAuth.distSrcCorePersistenceMod.PersistedBlob
import typingsJapgolly.firebaseAuth.distSrcModelAuthMod.AuthInternal
import typingsJapgolly.firebaseAuth.distSrcModelIdTokenMod.IdTokenResponse
import typingsJapgolly.firebaseAuth.firebaseAuthInts.`30000`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSrcCoreUserTokenManagerMod {
  
  @JSImport("@firebase/auth/dist/src/core/user/token_manager", "StsTokenManager")
  @js.native
  open class StsTokenManager () extends StObject {
    
    def _assign(stsTokenManager: StsTokenManager): Unit = js.native
    
    def _clone(): StsTokenManager = js.native
    
    def _performRefresh(): scala.Nothing = js.native
    
    var accessToken: String | Null = js.native
    
    def clearRefreshToken(): Unit = js.native
    
    var expirationTime: Double | Null = js.native
    
    def getToken(auth: AuthInternal): js.Promise[String | Null] = js.native
    def getToken(auth: AuthInternal, forceRefresh: Boolean): js.Promise[String | Null] = js.native
    
    def isExpired: Boolean = js.native
    
    /* private */ var refresh: Any = js.native
    
    var refreshToken: String | Null = js.native
    
    def toJSON(): js.Object = js.native
    
    def updateFromServerResponse(response: FinalizeMfaResponse): Unit = js.native
    def updateFromServerResponse(response: IdTokenResponse): Unit = js.native
    
    /* private */ var updateTokensAndExpiration: Any = js.native
  }
  /* static members */
  object StsTokenManager {
    
    @JSImport("@firebase/auth/dist/src/core/user/token_manager", "StsTokenManager")
    @js.native
    val ^ : js.Any = js.native
    
    inline def fromJSON(appName: String, `object`: PersistedBlob): StsTokenManager = (^.asInstanceOf[js.Dynamic].applyDynamic("fromJSON")(appName.asInstanceOf[js.Any], `object`.asInstanceOf[js.Any])).asInstanceOf[StsTokenManager]
  }
  
  object Buffer {
    
    inline def TOKEN_REFRESH: `30000` = 30000.asInstanceOf[`30000`]
  }
  type Buffer = `30000`
}
