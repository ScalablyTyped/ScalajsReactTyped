package typingsJapgolly.blockingProxy.webdriverCommandsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.blockingProxy.blockingProxyStrings.GET
  - typingsJapgolly.blockingProxy.blockingProxyStrings.POST
  - typingsJapgolly.blockingProxy.blockingProxyStrings.DELETE
*/
trait HttpMethod extends js.Object

object HttpMethod {
  @scala.inline
  def DELETE: typingsJapgolly.blockingProxy.blockingProxyStrings.DELETE = this.cast("DELETE")
  @scala.inline
  def GET: typingsJapgolly.blockingProxy.blockingProxyStrings.GET = this.cast("GET")
  @scala.inline
  def POST: typingsJapgolly.blockingProxy.blockingProxyStrings.POST = this.cast("POST")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
}

