package typingsJapgolly.soap

import typingsJapgolly.node.Buffer
import typingsJapgolly.soap.wssecurityMod.IWSSecurityOptions
import typingsJapgolly.soap.wssecuritycertMod.IWSSecurityCertOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("soap/lib/security", JSImport.Namespace)
@js.native
object securityMod extends js.Object {
  @js.native
  class BasicAuthSecurity protected ()
    extends typingsJapgolly.soap.basicAuthSecurityMod.BasicAuthSecurity {
    def this(username: String, password: String) = this()
    def this(username: String, password: String, defaults: js.Any) = this()
  }
  
  @js.native
  class BearerSecurity protected ()
    extends typingsJapgolly.soap.bearerSecurityMod.BearerSecurity {
    def this(token: String) = this()
    def this(token: String, defaults: js.Any) = this()
  }
  
  @js.native
  class ClientSSLSecurity protected ()
    extends typingsJapgolly.soap.clientSSLSecurityMod.ClientSSLSecurity {
    def this(key: String, cert: String) = this()
    def this(key: String, cert: Buffer) = this()
    def this(key: Buffer, cert: String) = this()
    def this(key: Buffer, cert: Buffer) = this()
    def this(key: String, cert: String, defaults: js.Any) = this()
    def this(key: String, cert: Buffer, defaults: js.Any) = this()
    def this(key: Buffer, cert: String, defaults: js.Any) = this()
    def this(key: Buffer, cert: Buffer, defaults: js.Any) = this()
  }
  
  @js.native
  class ClientSSLSecurityPFX protected ()
    extends typingsJapgolly.soap.clientSSLSecurityPFXMod.ClientSSLSecurityPFX {
    def this(pfx: String) = this()
    def this(pfx: Buffer) = this()
    def this(pfx: String, defaults: js.Any) = this()
    def this(pfx: Buffer, defaults: js.Any) = this()
  }
  
  @js.native
  class NTLMSecurity protected ()
    extends typingsJapgolly.soap.ntlmsecurityMod.NTLMSecurity {
    def this(defaults: js.Any) = this()
  }
  
  @js.native
  class WSSecurity protected ()
    extends typingsJapgolly.soap.wssecurityMod.WSSecurity {
    def this(username: String, password: String) = this()
    def this(username: String, password: String, options: String) = this()
    def this(username: String, password: String, options: IWSSecurityOptions) = this()
  }
  
  @js.native
  class WSSecurityCert protected ()
    extends typingsJapgolly.soap.wssecuritycertMod.WSSecurityCert {
    def this(privatePEM: js.Any, publicP12PEM: js.Any, password: js.Any) = this()
    def this(privatePEM: js.Any, publicP12PEM: js.Any, password: js.Any, options: IWSSecurityCertOptions) = this()
  }
  
}

