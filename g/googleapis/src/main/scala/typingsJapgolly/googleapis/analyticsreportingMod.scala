package typingsJapgolly.googleapis

import org.scalablytyped.runtime.Instantiable2
import org.scalablytyped.runtime.TopLevel
import typingsJapgolly.googleAuthLibrary.jwtclientMod.JWTOptions
import typingsJapgolly.googleapis.googleapisStrings.v4
import typingsJapgolly.googleapis.v4Mod.analyticsreportingV4.Analyticsreporting
import typingsJapgolly.googleapis.v4Mod.analyticsreportingV4.Options
import typingsJapgolly.googleapisCommon.apiMod.GlobalOptions
import typingsJapgolly.googleapisCommon.apiMod.GoogleConfigurable
import typingsJapgolly.googleapisCommon.mod.AuthPlus
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("googleapis/build/src/apis/analyticsreporting", JSImport.Namespace)
@js.native
object analyticsreportingMod extends js.Object {
  def analyticsreporting(options: Options): Analyticsreporting = js.native
  @JSName("analyticsreporting")
  def analyticsreporting_v4(version: v4): Analyticsreporting = js.native
  @js.native
  object VERSIONS extends js.Object {
    @js.native
    class v4 protected () extends Analyticsreporting {
      def this(options: GlobalOptions) = this()
      def this(options: GlobalOptions, google: GoogleConfigurable) = this()
    }
    
    @js.native
    object v4
      extends TopLevel[
              Instantiable2[
                /* options */ GlobalOptions, 
                js.UndefOr[/* google */ GoogleConfigurable], 
                Analyticsreporting
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

