package typingsJapgolly.nodeMailjet.mod

import typingsJapgolly.nodeMailjet.mod.Email.Client
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("node-mailjet", "connect")
@js.native
object connect extends js.Object {
  def apply(apiKey: String, apiSecret: String): Client = js.native
  def apply(apiKey: String, apiSecret: String, options: ConnectOptions): Client = js.native
  def apply(apiToken: String): typingsJapgolly.nodeMailjet.mod.SMS.Client = js.native
  def apply(apiToken: String, options: ConnectOptions): typingsJapgolly.nodeMailjet.mod.SMS.Client = js.native
}

