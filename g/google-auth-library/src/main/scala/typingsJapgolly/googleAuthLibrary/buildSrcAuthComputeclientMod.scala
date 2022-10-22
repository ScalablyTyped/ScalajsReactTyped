package typingsJapgolly.googleAuthLibrary

import typingsJapgolly.gaxios.mod.GaxiosError
import typingsJapgolly.googleAuthLibrary.buildSrcAuthOauth2clientMod.OAuth2Client
import typingsJapgolly.googleAuthLibrary.buildSrcAuthOauth2clientMod.RefreshOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object buildSrcAuthComputeclientMod {
  
  @JSImport("google-auth-library/build/src/auth/computeclient", "Compute")
  @js.native
  /**
    * Google Compute Engine service account credentials.
    *
    * Retrieve access token from the metadata server.
    * See: https://developers.google.com/compute/docs/authentication
    */
  open class Compute () extends OAuth2Client {
    def this(options: ComputeOptions) = this()
    
    /**
      * Fetches an ID token.
      * @param targetAudience the audience for the fetched ID token.
      */
    def fetchIdToken(targetAudience: String): js.Promise[String] = js.native
    
    var scopes: js.Array[String] = js.native
    
    /* private */ var serviceAccountEmail: Any = js.native
    
    /* protected */ def wrapError(e: GaxiosError[Any]): Unit = js.native
  }
  
  trait ComputeOptions
    extends StObject
       with RefreshOptions {
    
    /**
      * The scopes that will be requested when acquiring service account
      * credentials. Only applicable to modern App Engine and Cloud Function
      * runtimes as of March 2019.
      */
    var scopes: js.UndefOr[String | js.Array[String]] = js.undefined
    
    /**
      * The service account email to use, or 'default'. A Compute Engine instance
      * may have multiple service accounts.
      */
    var serviceAccountEmail: js.UndefOr[String] = js.undefined
  }
  object ComputeOptions {
    
    inline def apply(): ComputeOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ComputeOptions]
    }
    
    extension [Self <: ComputeOptions](x: Self) {
      
      inline def setScopes(value: String | js.Array[String]): Self = StObject.set(x, "scopes", value.asInstanceOf[js.Any])
      
      inline def setScopesUndefined: Self = StObject.set(x, "scopes", js.undefined)
      
      inline def setScopesVarargs(value: String*): Self = StObject.set(x, "scopes", js.Array(value*))
      
      inline def setServiceAccountEmail(value: String): Self = StObject.set(x, "serviceAccountEmail", value.asInstanceOf[js.Any])
      
      inline def setServiceAccountEmailUndefined: Self = StObject.set(x, "serviceAccountEmail", js.undefined)
    }
  }
}
