package typingsJapgolly.nodegit

import typingsJapgolly.nodegit.certMod.Cert
import typingsJapgolly.nodegit.certMod.Cert.TYPE
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object certHostKeyMod {
  
  @JSImport("nodegit/cert-host-key", "CertHostkey")
  @js.native
  open class CertHostkey () extends StObject {
    
    var hashMd5: String = js.native
    
    var hashSha1: String = js.native
    
    var parent: Cert = js.native
    
    var `type`: TYPE = js.native
  }
}
