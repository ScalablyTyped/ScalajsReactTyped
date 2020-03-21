package typingsJapgolly.soap.mod

import typingsJapgolly.soap.serverMod.ServerType
import typingsJapgolly.soap.typesMod.IServerOptions
import typingsJapgolly.soap.typesMod.IServices
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("soap", "listen")
@js.native
object listen extends js.Object {
  def apply(server: ServerType, options: IServerOptions): typingsJapgolly.soap.serverMod.Server = js.native
  def apply(server: ServerType, path: String, services: IServices, wsdl: String): typingsJapgolly.soap.serverMod.Server = js.native
  def apply(
    server: ServerType,
    path: String,
    services: IServices,
    wsdl: String,
    callback: js.Function2[/* err */ js.Any, /* res */ js.Any, Unit]
  ): typingsJapgolly.soap.serverMod.Server = js.native
}

