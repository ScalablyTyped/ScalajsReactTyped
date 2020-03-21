package typingsJapgolly.googleapis

import org.scalablytyped.runtime.Instantiable2
import org.scalablytyped.runtime.TopLevel
import typingsJapgolly.googleAuthLibrary.jwtclientMod.JWTOptions
import typingsJapgolly.googleapis.googleapisStrings.v2
import typingsJapgolly.googleapis.googleapisStrings.v3
import typingsJapgolly.googleapis.googleapisStrings.v3p1beta1
import typingsJapgolly.googleapis.jobsV2Mod.jobsV2.Jobs
import typingsJapgolly.googleapis.jobsV2Mod.jobsV2.Options
import typingsJapgolly.googleapisCommon.apiMod.GlobalOptions
import typingsJapgolly.googleapisCommon.apiMod.GoogleConfigurable
import typingsJapgolly.googleapisCommon.mod.AuthPlus
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("googleapis/build/src/apis/jobs", JSImport.Namespace)
@js.native
object jobsMod extends js.Object {
  def jobs(options: Options): Jobs = js.native
  def jobs(options: typingsJapgolly.googleapis.jobsV3Mod.jobsV3.Options): typingsJapgolly.googleapis.jobsV3Mod.jobsV3.Jobs = js.native
  def jobs(options: typingsJapgolly.googleapis.v3p1beta1Mod.jobsV3p1beta1.Options): typingsJapgolly.googleapis.v3p1beta1Mod.jobsV3p1beta1.Jobs = js.native
  @JSName("jobs")
  def jobs_v2(version: v2): Jobs = js.native
  @JSName("jobs")
  def jobs_v3(version: v3): typingsJapgolly.googleapis.jobsV3Mod.jobsV3.Jobs = js.native
  @JSName("jobs")
  def jobs_v3p1beta1(version: v3p1beta1): typingsJapgolly.googleapis.v3p1beta1Mod.jobsV3p1beta1.Jobs = js.native
  @js.native
  object VERSIONS extends js.Object {
    @js.native
    class v2 protected () extends Jobs {
      def this(options: GlobalOptions) = this()
      def this(options: GlobalOptions, google: GoogleConfigurable) = this()
    }
    
    @js.native
    class v3 protected ()
      extends typingsJapgolly.googleapis.jobsV3Mod.jobsV3.Jobs {
      def this(options: GlobalOptions) = this()
      def this(options: GlobalOptions, google: GoogleConfigurable) = this()
    }
    
    @js.native
    class v3p1beta1 protected ()
      extends typingsJapgolly.googleapis.v3p1beta1Mod.jobsV3p1beta1.Jobs {
      def this(options: GlobalOptions) = this()
      def this(options: GlobalOptions, google: GoogleConfigurable) = this()
    }
    
    @js.native
    object v2
      extends TopLevel[
              Instantiable2[/* options */ GlobalOptions, js.UndefOr[/* google */ GoogleConfigurable], Jobs]
            ]
    
    @js.native
    object v3
      extends TopLevel[
              Instantiable2[
                /* options */ GlobalOptions, 
                js.UndefOr[/* google */ GoogleConfigurable], 
                typingsJapgolly.googleapis.jobsV3Mod.jobsV3.Jobs
              ]
            ]
    
    @js.native
    object v3p1beta1
      extends TopLevel[
              Instantiable2[
                /* options */ GlobalOptions, 
                js.UndefOr[/* google */ GoogleConfigurable], 
                typingsJapgolly.googleapis.v3p1beta1Mod.jobsV3p1beta1.Jobs
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

