package typingsJapgolly.soap.mod

import typingsJapgolly.soap.serverMod.ServerType
import typingsJapgolly.soap.typesMod.IServerOptions
import typingsJapgolly.soap.typesMod.IServices
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("soap", "Server")
@js.native
class Server protected ()
  extends typingsJapgolly.soap.serverMod.Server {
  def this(server: ServerType, path: String, services: IServices, wsdl: typingsJapgolly.soap.wsdlMod.WSDL) = this()
  def this(
    server: ServerType,
    path: String,
    services: IServices,
    wsdl: typingsJapgolly.soap.wsdlMod.WSDL,
    options: IServerOptions
  ) = this()
}

