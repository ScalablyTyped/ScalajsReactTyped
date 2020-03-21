package typingsJapgolly.googleapis

import org.scalablytyped.runtime.Instantiable2
import org.scalablytyped.runtime.TopLevel
import typingsJapgolly.googleAuthLibrary.jwtclientMod.JWTOptions
import typingsJapgolly.googleapis.googleapisStrings.v1
import typingsJapgolly.googleapis.googleapisStrings.v1beta1
import typingsJapgolly.googleapis.googleapisStrings.v2
import typingsJapgolly.googleapis.youtubeAnalyticsV1Mod.youtubeAnalyticsV1.Options
import typingsJapgolly.googleapis.youtubeAnalyticsV1Mod.youtubeAnalyticsV1.Youtubeanalytics
import typingsJapgolly.googleapisCommon.apiMod.GlobalOptions
import typingsJapgolly.googleapisCommon.apiMod.GoogleConfigurable
import typingsJapgolly.googleapisCommon.mod.AuthPlus
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("googleapis/build/src/apis/youtubeAnalytics", JSImport.Namespace)
@js.native
object youtubeAnalyticsMod extends js.Object {
  def youtubeAnalytics(options: Options): Youtubeanalytics = js.native
  def youtubeAnalytics(options: typingsJapgolly.googleapis.youtubeAnalyticsV1beta1Mod.youtubeAnalyticsV1beta1.Options): typingsJapgolly.googleapis.youtubeAnalyticsV1beta1Mod.youtubeAnalyticsV1beta1.Youtubeanalytics = js.native
  def youtubeAnalytics(options: typingsJapgolly.googleapis.youtubeAnalyticsV2Mod.youtubeAnalyticsV2.Options): typingsJapgolly.googleapis.youtubeAnalyticsV2Mod.youtubeAnalyticsV2.Youtubeanalytics = js.native
  @JSName("youtubeAnalytics")
  def youtubeAnalytics_v1(version: v1): Youtubeanalytics = js.native
  @JSName("youtubeAnalytics")
  def youtubeAnalytics_v1beta1(version: v1beta1): typingsJapgolly.googleapis.youtubeAnalyticsV1beta1Mod.youtubeAnalyticsV1beta1.Youtubeanalytics = js.native
  @JSName("youtubeAnalytics")
  def youtubeAnalytics_v2(version: v2): typingsJapgolly.googleapis.youtubeAnalyticsV2Mod.youtubeAnalyticsV2.Youtubeanalytics = js.native
  @js.native
  object VERSIONS extends js.Object {
    @js.native
    class v1 protected () extends Youtubeanalytics {
      def this(options: GlobalOptions) = this()
      def this(options: GlobalOptions, google: GoogleConfigurable) = this()
    }
    
    @js.native
    class v1beta1 protected ()
      extends typingsJapgolly.googleapis.youtubeAnalyticsV1beta1Mod.youtubeAnalyticsV1beta1.Youtubeanalytics {
      def this(options: GlobalOptions) = this()
      def this(options: GlobalOptions, google: GoogleConfigurable) = this()
    }
    
    @js.native
    class v2 protected ()
      extends typingsJapgolly.googleapis.youtubeAnalyticsV2Mod.youtubeAnalyticsV2.Youtubeanalytics {
      def this(options: GlobalOptions) = this()
      def this(options: GlobalOptions, google: GoogleConfigurable) = this()
    }
    
    @js.native
    object v1
      extends TopLevel[
              Instantiable2[
                /* options */ GlobalOptions, 
                js.UndefOr[/* google */ GoogleConfigurable], 
                Youtubeanalytics
              ]
            ]
    
    @js.native
    object v1beta1
      extends TopLevel[
              Instantiable2[
                /* options */ GlobalOptions, 
                js.UndefOr[/* google */ GoogleConfigurable], 
                typingsJapgolly.googleapis.youtubeAnalyticsV1beta1Mod.youtubeAnalyticsV1beta1.Youtubeanalytics
              ]
            ]
    
    @js.native
    object v2
      extends TopLevel[
              Instantiable2[
                /* options */ GlobalOptions, 
                js.UndefOr[/* google */ GoogleConfigurable], 
                typingsJapgolly.googleapis.youtubeAnalyticsV2Mod.youtubeAnalyticsV2.Youtubeanalytics
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

