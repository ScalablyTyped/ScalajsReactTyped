package typingsJapgolly.googleapis

import org.scalablytyped.runtime.Instantiable2
import org.scalablytyped.runtime.TopLevel
import typingsJapgolly.googleAuthLibrary.jwtclientMod.JWTOptions
import typingsJapgolly.googleapis.googleapisStrings.v1
import typingsJapgolly.googleapis.googleapisStrings.v2
import typingsJapgolly.googleapis.googleapisStrings.v4
import typingsJapgolly.googleapis.googleapisStrings.v5
import typingsJapgolly.googleapis.pagespeedonlineV1Mod.pagespeedonlineV1.Options
import typingsJapgolly.googleapis.pagespeedonlineV1Mod.pagespeedonlineV1.Pagespeedonline
import typingsJapgolly.googleapisCommon.apiMod.GlobalOptions
import typingsJapgolly.googleapisCommon.apiMod.GoogleConfigurable
import typingsJapgolly.googleapisCommon.mod.AuthPlus
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("googleapis/build/src/apis/pagespeedonline", JSImport.Namespace)
@js.native
object pagespeedonlineMod extends js.Object {
  def pagespeedonline(options: Options): Pagespeedonline = js.native
  def pagespeedonline(options: typingsJapgolly.googleapis.pagespeedonlineV2Mod.pagespeedonlineV2.Options): typingsJapgolly.googleapis.pagespeedonlineV2Mod.pagespeedonlineV2.Pagespeedonline = js.native
  def pagespeedonline(options: typingsJapgolly.googleapis.pagespeedonlineV4Mod.pagespeedonlineV4.Options): typingsJapgolly.googleapis.pagespeedonlineV4Mod.pagespeedonlineV4.Pagespeedonline = js.native
  def pagespeedonline(options: typingsJapgolly.googleapis.v5Mod.pagespeedonlineV5.Options): typingsJapgolly.googleapis.v5Mod.pagespeedonlineV5.Pagespeedonline = js.native
  @JSName("pagespeedonline")
  def pagespeedonline_v1(version: v1): Pagespeedonline = js.native
  @JSName("pagespeedonline")
  def pagespeedonline_v2(version: v2): typingsJapgolly.googleapis.pagespeedonlineV2Mod.pagespeedonlineV2.Pagespeedonline = js.native
  @JSName("pagespeedonline")
  def pagespeedonline_v4(version: v4): typingsJapgolly.googleapis.pagespeedonlineV4Mod.pagespeedonlineV4.Pagespeedonline = js.native
  @JSName("pagespeedonline")
  def pagespeedonline_v5(version: v5): typingsJapgolly.googleapis.v5Mod.pagespeedonlineV5.Pagespeedonline = js.native
  @js.native
  object VERSIONS extends js.Object {
    @js.native
    class v1 protected () extends Pagespeedonline {
      def this(options: GlobalOptions) = this()
      def this(options: GlobalOptions, google: GoogleConfigurable) = this()
    }
    
    @js.native
    class v2 protected ()
      extends typingsJapgolly.googleapis.pagespeedonlineV2Mod.pagespeedonlineV2.Pagespeedonline {
      def this(options: GlobalOptions) = this()
      def this(options: GlobalOptions, google: GoogleConfigurable) = this()
    }
    
    @js.native
    class v4 protected ()
      extends typingsJapgolly.googleapis.pagespeedonlineV4Mod.pagespeedonlineV4.Pagespeedonline {
      def this(options: GlobalOptions) = this()
      def this(options: GlobalOptions, google: GoogleConfigurable) = this()
    }
    
    @js.native
    class v5 protected ()
      extends typingsJapgolly.googleapis.v5Mod.pagespeedonlineV5.Pagespeedonline {
      def this(options: GlobalOptions) = this()
      def this(options: GlobalOptions, google: GoogleConfigurable) = this()
    }
    
    @js.native
    object v1
      extends TopLevel[
              Instantiable2[
                /* options */ GlobalOptions, 
                js.UndefOr[/* google */ GoogleConfigurable], 
                Pagespeedonline
              ]
            ]
    
    @js.native
    object v2
      extends TopLevel[
              Instantiable2[
                /* options */ GlobalOptions, 
                js.UndefOr[/* google */ GoogleConfigurable], 
                typingsJapgolly.googleapis.pagespeedonlineV2Mod.pagespeedonlineV2.Pagespeedonline
              ]
            ]
    
    @js.native
    object v4
      extends TopLevel[
              Instantiable2[
                /* options */ GlobalOptions, 
                js.UndefOr[/* google */ GoogleConfigurable], 
                typingsJapgolly.googleapis.pagespeedonlineV4Mod.pagespeedonlineV4.Pagespeedonline
              ]
            ]
    
    @js.native
    object v5
      extends TopLevel[
              Instantiable2[
                /* options */ GlobalOptions, 
                js.UndefOr[/* google */ GoogleConfigurable], 
                typingsJapgolly.googleapis.v5Mod.pagespeedonlineV5.Pagespeedonline
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

