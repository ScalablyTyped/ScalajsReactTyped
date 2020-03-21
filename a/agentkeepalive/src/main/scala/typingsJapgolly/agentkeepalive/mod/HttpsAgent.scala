package typingsJapgolly.agentkeepalive.mod

import typingsJapgolly.node.httpMod.IncomingMessage
import typingsJapgolly.node.httpsMod.Agent
import typingsJapgolly.node.httpsMod.RequestOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("agentkeepalive", "HttpsAgent")
@js.native
class HttpsAgent () extends Agent {
  def this(opts: HttpsOptions) = this()
  val statusChanged: Boolean = js.native
  def createSocket(req: IncomingMessage, options: RequestOptions, cb: js.Function): Unit = js.native
  def getCurrentStatus(): AgentStatus = js.native
}

