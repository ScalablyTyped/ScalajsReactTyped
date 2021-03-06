package typingsJapgolly.googleapis

import org.scalablytyped.runtime.Instantiable2
import org.scalablytyped.runtime.TopLevel
import typingsJapgolly.googleAuthLibrary.jwtclientMod.JWTOptions
import typingsJapgolly.googleapis.datastoreV1Mod.datastoreV1.Datastore
import typingsJapgolly.googleapis.datastoreV1Mod.datastoreV1.Options
import typingsJapgolly.googleapis.googleapisStrings.v1
import typingsJapgolly.googleapis.googleapisStrings.v1beta1
import typingsJapgolly.googleapis.googleapisStrings.v1beta3
import typingsJapgolly.googleapisCommon.apiMod.GlobalOptions
import typingsJapgolly.googleapisCommon.apiMod.GoogleConfigurable
import typingsJapgolly.googleapisCommon.mod.AuthPlus
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("googleapis/build/src/apis/datastore", JSImport.Namespace)
@js.native
object datastoreMod extends js.Object {
  def datastore(options: Options): Datastore = js.native
  def datastore(options: typingsJapgolly.googleapis.datastoreV1beta1Mod.datastoreV1beta1.Options): typingsJapgolly.googleapis.datastoreV1beta1Mod.datastoreV1beta1.Datastore = js.native
  def datastore(options: typingsJapgolly.googleapis.v1beta3Mod.datastoreV1beta3.Options): typingsJapgolly.googleapis.v1beta3Mod.datastoreV1beta3.Datastore = js.native
  @JSName("datastore")
  def datastore_v1(version: v1): Datastore = js.native
  @JSName("datastore")
  def datastore_v1beta1(version: v1beta1): typingsJapgolly.googleapis.datastoreV1beta1Mod.datastoreV1beta1.Datastore = js.native
  @JSName("datastore")
  def datastore_v1beta3(version: v1beta3): typingsJapgolly.googleapis.v1beta3Mod.datastoreV1beta3.Datastore = js.native
  @js.native
  object VERSIONS extends js.Object {
    @js.native
    class v1 protected () extends Datastore {
      def this(options: GlobalOptions) = this()
      def this(options: GlobalOptions, google: GoogleConfigurable) = this()
    }
    
    @js.native
    class v1beta1 protected ()
      extends typingsJapgolly.googleapis.datastoreV1beta1Mod.datastoreV1beta1.Datastore {
      def this(options: GlobalOptions) = this()
      def this(options: GlobalOptions, google: GoogleConfigurable) = this()
    }
    
    @js.native
    class v1beta3 protected ()
      extends typingsJapgolly.googleapis.v1beta3Mod.datastoreV1beta3.Datastore {
      def this(options: GlobalOptions) = this()
      def this(options: GlobalOptions, google: GoogleConfigurable) = this()
    }
    
    @js.native
    object v1
      extends TopLevel[
              Instantiable2[/* options */ GlobalOptions, js.UndefOr[/* google */ GoogleConfigurable], Datastore]
            ]
    
    @js.native
    object v1beta1
      extends TopLevel[
              Instantiable2[
                /* options */ GlobalOptions, 
                js.UndefOr[/* google */ GoogleConfigurable], 
                typingsJapgolly.googleapis.datastoreV1beta1Mod.datastoreV1beta1.Datastore
              ]
            ]
    
    @js.native
    object v1beta3
      extends TopLevel[
              Instantiable2[
                /* options */ GlobalOptions, 
                js.UndefOr[/* google */ GoogleConfigurable], 
                typingsJapgolly.googleapis.v1beta3Mod.datastoreV1beta3.Datastore
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

