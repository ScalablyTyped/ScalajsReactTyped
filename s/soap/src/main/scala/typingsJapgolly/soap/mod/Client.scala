package typingsJapgolly.soap.mod

import typingsJapgolly.soap.typesMod.IOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("soap", "Client")
@js.native
class Client protected ()
  extends typingsJapgolly.soap.clientMod.Client {
  def this(wsdl: typingsJapgolly.soap.wsdlMod.WSDL) = this()
  def this(wsdl: typingsJapgolly.soap.wsdlMod.WSDL, endpoint: String) = this()
  def this(wsdl: typingsJapgolly.soap.wsdlMod.WSDL, endpoint: String, options: IOptions) = this()
}

