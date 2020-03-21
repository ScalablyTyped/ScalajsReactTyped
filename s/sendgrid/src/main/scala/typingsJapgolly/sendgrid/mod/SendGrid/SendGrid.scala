package typingsJapgolly.sendgrid.mod.SendGrid

import typingsJapgolly.sendgrid.mod.SendGrid.Rest.Request
import typingsJapgolly.sendgrid.mod.SendGrid.Rest.Response
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SendGrid extends js.Object {
  def API(request: Request): js.Promise[Response] = js.native
  def API(request: Request, callback: js.Function2[js.Error, /* response */ Response, Unit]): Unit = js.native
  def emptyRequest(): Request = js.native
  def emptyRequest(data: Request): Request = js.native
}

