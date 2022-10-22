package typingsJapgolly.googleapisCommon

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.Instantiable1
import typingsJapgolly.googleAuthLibrary.buildSrcAuthAwsclientMod.AwsClientOptions
import typingsJapgolly.googleAuthLibrary.buildSrcAuthGoogleauthMod.GoogleAuthOptions
import typingsJapgolly.googleAuthLibrary.buildSrcAuthGoogleauthMod.JSONClient
import typingsJapgolly.googleAuthLibrary.buildSrcAuthIdentitypoolclientMod.IdentityPoolClientOptions
import typingsJapgolly.googleAuthLibrary.buildSrcAuthJwtclientMod.JWTOptions
import typingsJapgolly.googleAuthLibrary.mod.BaseExternalAccountClient
import typingsJapgolly.googleAuthLibrary.mod.Compute
import typingsJapgolly.googleAuthLibrary.mod.GoogleAuth
import typingsJapgolly.googleAuthLibrary.mod.Impersonated
import typingsJapgolly.googleAuthLibrary.mod.JWT
import typingsJapgolly.googleAuthLibrary.mod.UserRefreshClient
import typingsJapgolly.googleapisCommon.anon.TypeofExternalAccountClie
import typingsJapgolly.googleapisCommon.anon.TypeofGoogleAuth
import typingsJapgolly.googleapisCommon.anon.TypeofOAuth2Client
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object buildSrcAuthplusMod {
  
  @JSImport("googleapis-common/build/src/authplus", "AuthPlus")
  @js.native
  open class AuthPlus () extends GoogleAuth[JSONClient] {
    def this(opts: GoogleAuthOptions[JSONClient]) = this()
    
    var AwsClient: Instantiable1[/* options */ AwsClientOptions, typingsJapgolly.googleAuthLibrary.mod.AwsClient] = js.native
    
    var Compute: Instantiable0[typingsJapgolly.googleAuthLibrary.mod.Compute] = js.native
    
    var ExternalAccountClient: TypeofExternalAccountClie = js.native
    
    var GoogleAuth: TypeofGoogleAuth = js.native
    
    var IdentityPoolClient: Instantiable1[
        /* options */ IdentityPoolClientOptions, 
        typingsJapgolly.googleAuthLibrary.mod.IdentityPoolClient
      ] = js.native
    
    var JWT: Instantiable1[/* options */ JWTOptions, typingsJapgolly.googleAuthLibrary.mod.JWT] = js.native
    
    var OAuth2: TypeofOAuth2Client = js.native
    
    /* private */ var _cachedAuth: Any = js.native
    
    def getClient(options: GoogleAuthOptions[JSONClient]): js.Promise[Compute | JWT | UserRefreshClient | BaseExternalAccountClient | Impersonated] = js.native
  }
}
