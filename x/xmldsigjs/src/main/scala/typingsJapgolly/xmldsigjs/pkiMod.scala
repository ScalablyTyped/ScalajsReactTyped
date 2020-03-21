package typingsJapgolly.xmldsigjs

import typingsJapgolly.std.BufferSource
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("xmldsigjs/build/types/pki", JSImport.Namespace)
@js.native
object pkiMod extends js.Object {
  @js.native
  class X509Certificate ()
    extends typingsJapgolly.xmldsigjs.x509Mod.X509Certificate {
    def this(rawData: BufferSource) = this()
  }
  
}

