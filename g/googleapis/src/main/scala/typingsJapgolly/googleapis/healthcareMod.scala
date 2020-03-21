package typingsJapgolly.googleapis

import org.scalablytyped.runtime.Instantiable2
import org.scalablytyped.runtime.TopLevel
import typingsJapgolly.googleAuthLibrary.jwtclientMod.JWTOptions
import typingsJapgolly.googleapis.googleapisStrings.v1alpha
import typingsJapgolly.googleapis.googleapisStrings.v1alpha2
import typingsJapgolly.googleapis.googleapisStrings.v1beta1
import typingsJapgolly.googleapis.healthcareV1alpha2Mod.healthcareV1alpha2.Healthcare
import typingsJapgolly.googleapis.healthcareV1alpha2Mod.healthcareV1alpha2.Options
import typingsJapgolly.googleapisCommon.apiMod.GlobalOptions
import typingsJapgolly.googleapisCommon.apiMod.GoogleConfigurable
import typingsJapgolly.googleapisCommon.mod.AuthPlus
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("googleapis/build/src/apis/healthcare", JSImport.Namespace)
@js.native
object healthcareMod extends js.Object {
  def healthcare(options: Options): Healthcare = js.native
  def healthcare(options: typingsJapgolly.googleapis.healthcareV1alphaMod.healthcareV1alpha.Options): typingsJapgolly.googleapis.healthcareV1alphaMod.healthcareV1alpha.Healthcare = js.native
  def healthcare(options: typingsJapgolly.googleapis.healthcareV1beta1Mod.healthcareV1beta1.Options): typingsJapgolly.googleapis.healthcareV1beta1Mod.healthcareV1beta1.Healthcare = js.native
  @JSName("healthcare")
  def healthcare_v1alpha(version: v1alpha): typingsJapgolly.googleapis.healthcareV1alphaMod.healthcareV1alpha.Healthcare = js.native
  @JSName("healthcare")
  def healthcare_v1alpha2(version: v1alpha2): Healthcare = js.native
  @JSName("healthcare")
  def healthcare_v1beta1(version: v1beta1): typingsJapgolly.googleapis.healthcareV1beta1Mod.healthcareV1beta1.Healthcare = js.native
  @js.native
  object VERSIONS extends js.Object {
    @js.native
    class v1alpha protected ()
      extends typingsJapgolly.googleapis.healthcareV1alphaMod.healthcareV1alpha.Healthcare {
      def this(options: GlobalOptions) = this()
      def this(options: GlobalOptions, google: GoogleConfigurable) = this()
    }
    
    @js.native
    class v1alpha2 protected () extends Healthcare {
      def this(options: GlobalOptions) = this()
      def this(options: GlobalOptions, google: GoogleConfigurable) = this()
    }
    
    @js.native
    class v1beta1 protected ()
      extends typingsJapgolly.googleapis.healthcareV1beta1Mod.healthcareV1beta1.Healthcare {
      def this(options: GlobalOptions) = this()
      def this(options: GlobalOptions, google: GoogleConfigurable) = this()
    }
    
    @js.native
    object v1alpha
      extends TopLevel[
              Instantiable2[
                /* options */ GlobalOptions, 
                js.UndefOr[/* google */ GoogleConfigurable], 
                typingsJapgolly.googleapis.healthcareV1alphaMod.healthcareV1alpha.Healthcare
              ]
            ]
    
    @js.native
    object v1alpha2
      extends TopLevel[
              Instantiable2[/* options */ GlobalOptions, js.UndefOr[/* google */ GoogleConfigurable], Healthcare]
            ]
    
    @js.native
    object v1beta1
      extends TopLevel[
              Instantiable2[
                /* options */ GlobalOptions, 
                js.UndefOr[/* google */ GoogleConfigurable], 
                typingsJapgolly.googleapis.healthcareV1beta1Mod.healthcareV1beta1.Healthcare
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

