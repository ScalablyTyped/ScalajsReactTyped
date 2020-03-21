package typingsJapgolly.googleapis

import org.scalablytyped.runtime.Instantiable2
import org.scalablytyped.runtime.TopLevel
import typingsJapgolly.googleAuthLibrary.jwtclientMod.JWTOptions
import typingsJapgolly.googleapis.googleapisStrings.v1
import typingsJapgolly.googleapis.googleapisStrings.v1beta2
import typingsJapgolly.googleapis.googleapisStrings.v1p1beta1
import typingsJapgolly.googleapis.googleapisStrings.v1p2beta1
import typingsJapgolly.googleapis.googleapisStrings.v1p3beta1
import typingsJapgolly.googleapis.v1p2beta1Mod.videointelligenceV1p2beta1.Options
import typingsJapgolly.googleapis.v1p2beta1Mod.videointelligenceV1p2beta1.Videointelligence
import typingsJapgolly.googleapisCommon.apiMod.GlobalOptions
import typingsJapgolly.googleapisCommon.apiMod.GoogleConfigurable
import typingsJapgolly.googleapisCommon.mod.AuthPlus
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("googleapis/build/src/apis/videointelligence", JSImport.Namespace)
@js.native
object videointelligenceMod extends js.Object {
  def videointelligence(options: Options): Videointelligence = js.native
  def videointelligence(options: typingsJapgolly.googleapis.v1p3beta1Mod.videointelligenceV1p3beta1.Options): typingsJapgolly.googleapis.v1p3beta1Mod.videointelligenceV1p3beta1.Videointelligence = js.native
  def videointelligence(options: typingsJapgolly.googleapis.videointelligenceV1Mod.videointelligenceV1.Options): typingsJapgolly.googleapis.videointelligenceV1Mod.videointelligenceV1.Videointelligence = js.native
  def videointelligence(options: typingsJapgolly.googleapis.videointelligenceV1beta2Mod.videointelligenceV1beta2.Options): typingsJapgolly.googleapis.videointelligenceV1beta2Mod.videointelligenceV1beta2.Videointelligence = js.native
  def videointelligence(
    options: typingsJapgolly.googleapis.videointelligenceV1p1beta1Mod.videointelligenceV1p1beta1.Options
  ): typingsJapgolly.googleapis.videointelligenceV1p1beta1Mod.videointelligenceV1p1beta1.Videointelligence = js.native
  @JSName("videointelligence")
  def videointelligence_v1(version: v1): typingsJapgolly.googleapis.videointelligenceV1Mod.videointelligenceV1.Videointelligence = js.native
  @JSName("videointelligence")
  def videointelligence_v1beta2(version: v1beta2): typingsJapgolly.googleapis.videointelligenceV1beta2Mod.videointelligenceV1beta2.Videointelligence = js.native
  @JSName("videointelligence")
  def videointelligence_v1p1beta1(version: v1p1beta1): typingsJapgolly.googleapis.videointelligenceV1p1beta1Mod.videointelligenceV1p1beta1.Videointelligence = js.native
  @JSName("videointelligence")
  def videointelligence_v1p2beta1(version: v1p2beta1): Videointelligence = js.native
  @JSName("videointelligence")
  def videointelligence_v1p3beta1(version: v1p3beta1): typingsJapgolly.googleapis.v1p3beta1Mod.videointelligenceV1p3beta1.Videointelligence = js.native
  @js.native
  object VERSIONS extends js.Object {
    @js.native
    class v1 protected ()
      extends typingsJapgolly.googleapis.videointelligenceV1Mod.videointelligenceV1.Videointelligence {
      def this(options: GlobalOptions) = this()
      def this(options: GlobalOptions, google: GoogleConfigurable) = this()
    }
    
    @js.native
    class v1beta2 protected ()
      extends typingsJapgolly.googleapis.videointelligenceV1beta2Mod.videointelligenceV1beta2.Videointelligence {
      def this(options: GlobalOptions) = this()
      def this(options: GlobalOptions, google: GoogleConfigurable) = this()
    }
    
    @js.native
    class v1p1beta1 protected ()
      extends typingsJapgolly.googleapis.videointelligenceV1p1beta1Mod.videointelligenceV1p1beta1.Videointelligence {
      def this(options: GlobalOptions) = this()
      def this(options: GlobalOptions, google: GoogleConfigurable) = this()
    }
    
    @js.native
    class v1p2beta1 protected () extends Videointelligence {
      def this(options: GlobalOptions) = this()
      def this(options: GlobalOptions, google: GoogleConfigurable) = this()
    }
    
    @js.native
    class v1p3beta1 protected ()
      extends typingsJapgolly.googleapis.v1p3beta1Mod.videointelligenceV1p3beta1.Videointelligence {
      def this(options: GlobalOptions) = this()
      def this(options: GlobalOptions, google: GoogleConfigurable) = this()
    }
    
    @js.native
    object v1
      extends TopLevel[
              Instantiable2[
                /* options */ GlobalOptions, 
                js.UndefOr[/* google */ GoogleConfigurable], 
                typingsJapgolly.googleapis.videointelligenceV1Mod.videointelligenceV1.Videointelligence
              ]
            ]
    
    @js.native
    object v1beta2
      extends TopLevel[
              Instantiable2[
                /* options */ GlobalOptions, 
                js.UndefOr[/* google */ GoogleConfigurable], 
                typingsJapgolly.googleapis.videointelligenceV1beta2Mod.videointelligenceV1beta2.Videointelligence
              ]
            ]
    
    @js.native
    object v1p1beta1
      extends TopLevel[
              Instantiable2[
                /* options */ GlobalOptions, 
                js.UndefOr[/* google */ GoogleConfigurable], 
                typingsJapgolly.googleapis.videointelligenceV1p1beta1Mod.videointelligenceV1p1beta1.Videointelligence
              ]
            ]
    
    @js.native
    object v1p2beta1
      extends TopLevel[
              Instantiable2[
                /* options */ GlobalOptions, 
                js.UndefOr[/* google */ GoogleConfigurable], 
                Videointelligence
              ]
            ]
    
    @js.native
    object v1p3beta1
      extends TopLevel[
              Instantiable2[
                /* options */ GlobalOptions, 
                js.UndefOr[/* google */ GoogleConfigurable], 
                typingsJapgolly.googleapis.v1p3beta1Mod.videointelligenceV1p3beta1.Videointelligence
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

