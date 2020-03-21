package typingsJapgolly.soap.mod

import typingsJapgolly.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("soap", "ClientSSLSecurity")
@js.native
class ClientSSLSecurity protected ()
  extends typingsJapgolly.soap.securityMod.ClientSSLSecurity {
  def this(key: String, cert: String) = this()
  def this(key: String, cert: Buffer) = this()
  def this(key: Buffer, cert: String) = this()
  def this(key: Buffer, cert: Buffer) = this()
  def this(key: String, cert: String, defaults: js.Any) = this()
  def this(key: String, cert: Buffer, defaults: js.Any) = this()
  def this(key: Buffer, cert: String, defaults: js.Any) = this()
  def this(key: Buffer, cert: Buffer, defaults: js.Any) = this()
}

