package typingsJapgolly.nodegit

import typingsJapgolly.node.Buffer
import typingsJapgolly.nodegit.certMod.Cert
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("nodegit/cert-x509", JSImport.Namespace)
@js.native
object certX509Mod extends js.Object {
  @js.native
  class CertX509 () extends js.Object {
    var data: Buffer = js.native
    var len: Double = js.native
    var parent: Cert = js.native
  }
  
}

