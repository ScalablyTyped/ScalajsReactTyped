package typingsJapgolly.googleapis

import org.scalablytyped.runtime.Instantiable2
import org.scalablytyped.runtime.TopLevel
import typingsJapgolly.googleAuthLibrary.jwtclientMod.JWTOptions
import typingsJapgolly.googleapis.googleapisStrings.v1
import typingsJapgolly.googleapis.googleapisStrings.v1beta
import typingsJapgolly.googleapis.servicenetworkingV1Mod.servicenetworkingV1.Options
import typingsJapgolly.googleapis.servicenetworkingV1Mod.servicenetworkingV1.Servicenetworking
import typingsJapgolly.googleapisCommon.apiMod.GlobalOptions
import typingsJapgolly.googleapisCommon.apiMod.GoogleConfigurable
import typingsJapgolly.googleapisCommon.mod.AuthPlus
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("googleapis/build/src/apis/servicenetworking", JSImport.Namespace)
@js.native
object servicenetworkingMod extends js.Object {
  def servicenetworking(options: Options): Servicenetworking = js.native
  def servicenetworking(options: typingsJapgolly.googleapis.servicenetworkingV1betaMod.servicenetworkingV1beta.Options): typingsJapgolly.googleapis.servicenetworkingV1betaMod.servicenetworkingV1beta.Servicenetworking = js.native
  @JSName("servicenetworking")
  def servicenetworking_v1(version: v1): Servicenetworking = js.native
  @JSName("servicenetworking")
  def servicenetworking_v1beta(version: v1beta): typingsJapgolly.googleapis.servicenetworkingV1betaMod.servicenetworkingV1beta.Servicenetworking = js.native
  @js.native
  object VERSIONS extends js.Object {
    @js.native
    class v1 protected () extends Servicenetworking {
      def this(options: GlobalOptions) = this()
      def this(options: GlobalOptions, google: GoogleConfigurable) = this()
    }
    
    @js.native
    class v1beta protected ()
      extends typingsJapgolly.googleapis.servicenetworkingV1betaMod.servicenetworkingV1beta.Servicenetworking {
      def this(options: GlobalOptions) = this()
      def this(options: GlobalOptions, google: GoogleConfigurable) = this()
    }
    
    @js.native
    object v1
      extends TopLevel[
              Instantiable2[
                /* options */ GlobalOptions, 
                js.UndefOr[/* google */ GoogleConfigurable], 
                Servicenetworking
              ]
            ]
    
    @js.native
    object v1beta
      extends TopLevel[
              Instantiable2[
                /* options */ GlobalOptions, 
                js.UndefOr[/* google */ GoogleConfigurable], 
                typingsJapgolly.googleapis.servicenetworkingV1betaMod.servicenetworkingV1beta.Servicenetworking
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

