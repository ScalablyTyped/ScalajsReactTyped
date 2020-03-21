package typingsJapgolly.googleapis

import org.scalablytyped.runtime.Instantiable2
import org.scalablytyped.runtime.TopLevel
import typingsJapgolly.googleAuthLibrary.jwtclientMod.JWTOptions
import typingsJapgolly.googleapis.driveV2Mod.driveV2.Drive
import typingsJapgolly.googleapis.driveV2Mod.driveV2.Options
import typingsJapgolly.googleapis.googleapisStrings.v2
import typingsJapgolly.googleapis.googleapisStrings.v3
import typingsJapgolly.googleapisCommon.apiMod.GlobalOptions
import typingsJapgolly.googleapisCommon.apiMod.GoogleConfigurable
import typingsJapgolly.googleapisCommon.mod.AuthPlus
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("googleapis/build/src/apis/drive", JSImport.Namespace)
@js.native
object driveMod extends js.Object {
  def drive(options: Options): Drive = js.native
  def drive(options: typingsJapgolly.googleapis.driveV3Mod.driveV3.Options): typingsJapgolly.googleapis.driveV3Mod.driveV3.Drive = js.native
  @JSName("drive")
  def drive_v2(version: v2): Drive = js.native
  @JSName("drive")
  def drive_v3(version: v3): typingsJapgolly.googleapis.driveV3Mod.driveV3.Drive = js.native
  @js.native
  object VERSIONS extends js.Object {
    @js.native
    class v2 protected () extends Drive {
      def this(options: GlobalOptions) = this()
      def this(options: GlobalOptions, google: GoogleConfigurable) = this()
    }
    
    @js.native
    class v3 protected ()
      extends typingsJapgolly.googleapis.driveV3Mod.driveV3.Drive {
      def this(options: GlobalOptions) = this()
      def this(options: GlobalOptions, google: GoogleConfigurable) = this()
    }
    
    @js.native
    object v2
      extends TopLevel[
              Instantiable2[/* options */ GlobalOptions, js.UndefOr[/* google */ GoogleConfigurable], Drive]
            ]
    
    @js.native
    object v3
      extends TopLevel[
              Instantiable2[
                /* options */ GlobalOptions, 
                js.UndefOr[/* google */ GoogleConfigurable], 
                typingsJapgolly.googleapis.driveV3Mod.driveV3.Drive
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

