package typingsJapgolly.googleapis

import org.scalablytyped.runtime.Instantiable2
import org.scalablytyped.runtime.TopLevel
import typingsJapgolly.googleAuthLibrary.jwtclientMod.JWTOptions
import typingsJapgolly.googleapis.dnsV1Mod.dnsV1.Dns
import typingsJapgolly.googleapis.dnsV1Mod.dnsV1.Options
import typingsJapgolly.googleapis.googleapisStrings.v1
import typingsJapgolly.googleapis.googleapisStrings.v1beta2
import typingsJapgolly.googleapis.googleapisStrings.v2beta1
import typingsJapgolly.googleapisCommon.apiMod.GlobalOptions
import typingsJapgolly.googleapisCommon.apiMod.GoogleConfigurable
import typingsJapgolly.googleapisCommon.mod.AuthPlus
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("googleapis/build/src/apis/dns", JSImport.Namespace)
@js.native
object dnsMod extends js.Object {
  def dns(options: Options): Dns = js.native
  def dns(options: typingsJapgolly.googleapis.dnsV1beta2Mod.dnsV1beta2.Options): typingsJapgolly.googleapis.dnsV1beta2Mod.dnsV1beta2.Dns = js.native
  def dns(options: typingsJapgolly.googleapis.dnsV2beta1Mod.dnsV2beta1.Options): typingsJapgolly.googleapis.dnsV2beta1Mod.dnsV2beta1.Dns = js.native
  @JSName("dns")
  def dns_v1(version: v1): Dns = js.native
  @JSName("dns")
  def dns_v1beta2(version: v1beta2): typingsJapgolly.googleapis.dnsV1beta2Mod.dnsV1beta2.Dns = js.native
  @JSName("dns")
  def dns_v2beta1(version: v2beta1): typingsJapgolly.googleapis.dnsV2beta1Mod.dnsV2beta1.Dns = js.native
  @js.native
  object VERSIONS extends js.Object {
    @js.native
    class v1 protected () extends Dns {
      def this(options: GlobalOptions) = this()
      def this(options: GlobalOptions, google: GoogleConfigurable) = this()
    }
    
    @js.native
    class v1beta2 protected ()
      extends typingsJapgolly.googleapis.dnsV1beta2Mod.dnsV1beta2.Dns {
      def this(options: GlobalOptions) = this()
      def this(options: GlobalOptions, google: GoogleConfigurable) = this()
    }
    
    @js.native
    class v2beta1 protected ()
      extends typingsJapgolly.googleapis.dnsV2beta1Mod.dnsV2beta1.Dns {
      def this(options: GlobalOptions) = this()
      def this(options: GlobalOptions, google: GoogleConfigurable) = this()
    }
    
    @js.native
    object v1
      extends TopLevel[
              Instantiable2[/* options */ GlobalOptions, js.UndefOr[/* google */ GoogleConfigurable], Dns]
            ]
    
    @js.native
    object v1beta2
      extends TopLevel[
              Instantiable2[
                /* options */ GlobalOptions, 
                js.UndefOr[/* google */ GoogleConfigurable], 
                typingsJapgolly.googleapis.dnsV1beta2Mod.dnsV1beta2.Dns
              ]
            ]
    
    @js.native
    object v2beta1
      extends TopLevel[
              Instantiable2[
                /* options */ GlobalOptions, 
                js.UndefOr[/* google */ GoogleConfigurable], 
                typingsJapgolly.googleapis.dnsV2beta1Mod.dnsV2beta1.Dns
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

