package typingsJapgolly.googleapis

import org.scalablytyped.runtime.Instantiable2
import org.scalablytyped.runtime.TopLevel
import typingsJapgolly.googleAuthLibrary.jwtclientMod.JWTOptions
import typingsJapgolly.googleapis.googleapisStrings.v2beta1
import typingsJapgolly.googleapis.v2beta1Mod.adexchangebuyer2V2beta1.Adexchangebuyer2
import typingsJapgolly.googleapis.v2beta1Mod.adexchangebuyer2V2beta1.Options
import typingsJapgolly.googleapisCommon.apiMod.GlobalOptions
import typingsJapgolly.googleapisCommon.apiMod.GoogleConfigurable
import typingsJapgolly.googleapisCommon.mod.AuthPlus
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("googleapis/build/src/apis/adexchangebuyer2", JSImport.Namespace)
@js.native
object adexchangebuyer2Mod extends js.Object {
  def adexchangebuyer2(options: Options): Adexchangebuyer2 = js.native
  @JSName("adexchangebuyer2")
  def adexchangebuyer2_v2beta1(version: v2beta1): Adexchangebuyer2 = js.native
  @js.native
  object VERSIONS extends js.Object {
    @js.native
    class v2beta1 protected () extends Adexchangebuyer2 {
      def this(options: GlobalOptions) = this()
      def this(options: GlobalOptions, google: GoogleConfigurable) = this()
    }
    
    @js.native
    object v2beta1
      extends TopLevel[
              Instantiable2[
                /* options */ GlobalOptions, 
                js.UndefOr[/* google */ GoogleConfigurable], 
                Adexchangebuyer2
              ]
            ]
    
  }
  
  @js.native
  object auth extends TopLevel[AuthPlus] {
    @js.native
    /**
      * Google Compute Engine service account credentials.
      *
      * Retrieve access token from the metadata server.
      * See: https://developers.google.com/compute/docs/authentication
      */
    class Compute ()
      extends typingsJapgolly.googleAuthLibrary.mod.Compute
    
    @js.native
    class JWT protected ()
      extends typingsJapgolly.googleAuthLibrary.mod.JWT {
      /**
        * JWT service account credentials.
        *
        * Retrieve access token using gtoken.
        *
        * @param email service account email address.
        * @param keyFile path to private key file.
        * @param key value of key
        * @param scopes list of requested scopes or a single scope.
        * @param subject impersonated account's email address.
        * @param key_id the ID of the key
        */
      def this(options: JWTOptions) = this()
    }
    
  }
  
}

