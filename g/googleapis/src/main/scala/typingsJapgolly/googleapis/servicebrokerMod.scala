package typingsJapgolly.googleapis

import org.scalablytyped.runtime.Instantiable2
import org.scalablytyped.runtime.TopLevel
import typingsJapgolly.googleAuthLibrary.jwtclientMod.JWTOptions
import typingsJapgolly.googleapis.googleapisStrings.v1
import typingsJapgolly.googleapis.googleapisStrings.v1alpha1
import typingsJapgolly.googleapis.googleapisStrings.v1beta1
import typingsJapgolly.googleapis.servicebrokerV1Mod.servicebrokerV1.Options
import typingsJapgolly.googleapis.servicebrokerV1Mod.servicebrokerV1.Servicebroker
import typingsJapgolly.googleapisCommon.apiMod.GlobalOptions
import typingsJapgolly.googleapisCommon.apiMod.GoogleConfigurable
import typingsJapgolly.googleapisCommon.mod.AuthPlus
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("googleapis/build/src/apis/servicebroker", JSImport.Namespace)
@js.native
object servicebrokerMod extends js.Object {
  def servicebroker(options: Options): Servicebroker = js.native
  def servicebroker(options: typingsJapgolly.googleapis.servicebrokerV1alpha1Mod.servicebrokerV1alpha1.Options): typingsJapgolly.googleapis.servicebrokerV1alpha1Mod.servicebrokerV1alpha1.Servicebroker = js.native
  def servicebroker(options: typingsJapgolly.googleapis.servicebrokerV1beta1Mod.servicebrokerV1beta1.Options): typingsJapgolly.googleapis.servicebrokerV1beta1Mod.servicebrokerV1beta1.Servicebroker = js.native
  @JSName("servicebroker")
  def servicebroker_v1(version: v1): Servicebroker = js.native
  @JSName("servicebroker")
  def servicebroker_v1alpha1(version: v1alpha1): typingsJapgolly.googleapis.servicebrokerV1alpha1Mod.servicebrokerV1alpha1.Servicebroker = js.native
  @JSName("servicebroker")
  def servicebroker_v1beta1(version: v1beta1): typingsJapgolly.googleapis.servicebrokerV1beta1Mod.servicebrokerV1beta1.Servicebroker = js.native
  @js.native
  object VERSIONS extends js.Object {
    @js.native
    class v1 protected () extends Servicebroker {
      def this(options: GlobalOptions) = this()
      def this(options: GlobalOptions, google: GoogleConfigurable) = this()
    }
    
    @js.native
    class v1alpha1 protected ()
      extends typingsJapgolly.googleapis.servicebrokerV1alpha1Mod.servicebrokerV1alpha1.Servicebroker {
      def this(options: GlobalOptions) = this()
      def this(options: GlobalOptions, google: GoogleConfigurable) = this()
    }
    
    @js.native
    class v1beta1 protected ()
      extends typingsJapgolly.googleapis.servicebrokerV1beta1Mod.servicebrokerV1beta1.Servicebroker {
      def this(options: GlobalOptions) = this()
      def this(options: GlobalOptions, google: GoogleConfigurable) = this()
    }
    
    @js.native
    object v1
      extends TopLevel[
              Instantiable2[
                /* options */ GlobalOptions, 
                js.UndefOr[/* google */ GoogleConfigurable], 
                Servicebroker
              ]
            ]
    
    @js.native
    object v1alpha1
      extends TopLevel[
              Instantiable2[
                /* options */ GlobalOptions, 
                js.UndefOr[/* google */ GoogleConfigurable], 
                typingsJapgolly.googleapis.servicebrokerV1alpha1Mod.servicebrokerV1alpha1.Servicebroker
              ]
            ]
    
    @js.native
    object v1beta1
      extends TopLevel[
              Instantiable2[
                /* options */ GlobalOptions, 
                js.UndefOr[/* google */ GoogleConfigurable], 
                typingsJapgolly.googleapis.servicebrokerV1beta1Mod.servicebrokerV1beta1.Servicebroker
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

