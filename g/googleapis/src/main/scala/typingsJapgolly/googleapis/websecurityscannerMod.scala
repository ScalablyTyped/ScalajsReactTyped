package typingsJapgolly.googleapis

import org.scalablytyped.runtime.Instantiable2
import org.scalablytyped.runtime.TopLevel
import typingsJapgolly.googleAuthLibrary.jwtclientMod.JWTOptions
import typingsJapgolly.googleapis.googleapisStrings.v1alpha
import typingsJapgolly.googleapis.googleapisStrings.v1beta
import typingsJapgolly.googleapis.websecurityscannerV1alphaMod.websecurityscannerV1alpha.Options
import typingsJapgolly.googleapis.websecurityscannerV1alphaMod.websecurityscannerV1alpha.Websecurityscanner
import typingsJapgolly.googleapisCommon.apiMod.GlobalOptions
import typingsJapgolly.googleapisCommon.apiMod.GoogleConfigurable
import typingsJapgolly.googleapisCommon.mod.AuthPlus
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("googleapis/build/src/apis/websecurityscanner", JSImport.Namespace)
@js.native
object websecurityscannerMod extends js.Object {
  def websecurityscanner(options: Options): Websecurityscanner = js.native
  def websecurityscanner(options: typingsJapgolly.googleapis.websecurityscannerV1betaMod.websecurityscannerV1beta.Options): typingsJapgolly.googleapis.websecurityscannerV1betaMod.websecurityscannerV1beta.Websecurityscanner = js.native
  @JSName("websecurityscanner")
  def websecurityscanner_v1alpha(version: v1alpha): Websecurityscanner = js.native
  @JSName("websecurityscanner")
  def websecurityscanner_v1beta(version: v1beta): typingsJapgolly.googleapis.websecurityscannerV1betaMod.websecurityscannerV1beta.Websecurityscanner = js.native
  @js.native
  object VERSIONS extends js.Object {
    @js.native
    class v1alpha protected () extends Websecurityscanner {
      def this(options: GlobalOptions) = this()
      def this(options: GlobalOptions, google: GoogleConfigurable) = this()
    }
    
    @js.native
    class v1beta protected ()
      extends typingsJapgolly.googleapis.websecurityscannerV1betaMod.websecurityscannerV1beta.Websecurityscanner {
      def this(options: GlobalOptions) = this()
      def this(options: GlobalOptions, google: GoogleConfigurable) = this()
    }
    
    @js.native
    object v1alpha
      extends TopLevel[
              Instantiable2[
                /* options */ GlobalOptions, 
                js.UndefOr[/* google */ GoogleConfigurable], 
                Websecurityscanner
              ]
            ]
    
    @js.native
    object v1beta
      extends TopLevel[
              Instantiable2[
                /* options */ GlobalOptions, 
                js.UndefOr[/* google */ GoogleConfigurable], 
                typingsJapgolly.googleapis.websecurityscannerV1betaMod.websecurityscannerV1beta.Websecurityscanner
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

