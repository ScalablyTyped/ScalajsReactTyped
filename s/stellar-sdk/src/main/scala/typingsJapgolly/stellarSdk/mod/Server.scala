package typingsJapgolly.stellarSdk.mod

import typingsJapgolly.stellarSdk.serverMod.Server.Options
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("stellar-sdk", "Server")
@js.native
class Server protected ()
  extends typingsJapgolly.stellarSdk.serverMod.Server {
  def this(serverURL: String) = this()
  def this(serverURL: String, opts: Options) = this()
}

