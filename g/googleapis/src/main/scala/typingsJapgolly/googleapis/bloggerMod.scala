package typingsJapgolly.googleapis

import org.scalablytyped.runtime.Instantiable2
import org.scalablytyped.runtime.TopLevel
import typingsJapgolly.googleAuthLibrary.jwtclientMod.JWTOptions
import typingsJapgolly.googleapis.bloggerV2Mod.bloggerV2.Blogger
import typingsJapgolly.googleapis.bloggerV2Mod.bloggerV2.Options
import typingsJapgolly.googleapis.googleapisStrings.v2
import typingsJapgolly.googleapis.googleapisStrings.v3
import typingsJapgolly.googleapisCommon.apiMod.GlobalOptions
import typingsJapgolly.googleapisCommon.apiMod.GoogleConfigurable
import typingsJapgolly.googleapisCommon.mod.AuthPlus
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("googleapis/build/src/apis/blogger", JSImport.Namespace)
@js.native
object bloggerMod extends js.Object {
  def blogger(options: Options): Blogger = js.native
  def blogger(options: typingsJapgolly.googleapis.bloggerV3Mod.bloggerV3.Options): typingsJapgolly.googleapis.bloggerV3Mod.bloggerV3.Blogger = js.native
  @JSName("blogger")
  def blogger_v2(version: v2): Blogger = js.native
  @JSName("blogger")
  def blogger_v3(version: v3): typingsJapgolly.googleapis.bloggerV3Mod.bloggerV3.Blogger = js.native
  @js.native
  object VERSIONS extends js.Object {
    @js.native
    class v2 protected () extends Blogger {
      def this(options: GlobalOptions) = this()
      def this(options: GlobalOptions, google: GoogleConfigurable) = this()
    }
    
    @js.native
    class v3 protected ()
      extends typingsJapgolly.googleapis.bloggerV3Mod.bloggerV3.Blogger {
      def this(options: GlobalOptions) = this()
      def this(options: GlobalOptions, google: GoogleConfigurable) = this()
    }
    
    @js.native
    object v2
      extends TopLevel[
              Instantiable2[/* options */ GlobalOptions, js.UndefOr[/* google */ GoogleConfigurable], Blogger]
            ]
    
    @js.native
    object v3
      extends TopLevel[
              Instantiable2[
                /* options */ GlobalOptions, 
                js.UndefOr[/* google */ GoogleConfigurable], 
                typingsJapgolly.googleapis.bloggerV3Mod.bloggerV3.Blogger
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

