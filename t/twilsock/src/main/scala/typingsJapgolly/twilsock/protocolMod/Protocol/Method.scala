package typingsJapgolly.twilsock.protocolMod.Protocol

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.twilsock.twilsockStrings.GET
  - typingsJapgolly.twilsock.twilsockStrings.POST
  - typingsJapgolly.twilsock.twilsockStrings.PUT
  - typingsJapgolly.twilsock.twilsockStrings.DELETE
  - typingsJapgolly.twilsock.twilsockStrings.put_notification_ctx
  - typingsJapgolly.twilsock.twilsockStrings.delete_notification_ctx
*/
trait Method extends js.Object

object Method {
  @scala.inline
  def DELETE: typingsJapgolly.twilsock.twilsockStrings.DELETE = this.cast("DELETE")
  @scala.inline
  def GET: typingsJapgolly.twilsock.twilsockStrings.GET = this.cast("GET")
  @scala.inline
  def POST: typingsJapgolly.twilsock.twilsockStrings.POST = this.cast("POST")
  @scala.inline
  def PUT: typingsJapgolly.twilsock.twilsockStrings.PUT = this.cast("PUT")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def delete_notification_ctx: typingsJapgolly.twilsock.twilsockStrings.delete_notification_ctx = this.cast("delete_notification_ctx")
  @scala.inline
  def put_notification_ctx: typingsJapgolly.twilsock.twilsockStrings.put_notification_ctx = this.cast("put_notification_ctx")
}

