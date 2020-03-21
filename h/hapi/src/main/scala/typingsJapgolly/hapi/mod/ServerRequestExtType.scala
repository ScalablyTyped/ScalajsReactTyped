package typingsJapgolly.hapi.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.hapi.hapiStrings.onRequest
  - typingsJapgolly.hapi.hapiStrings.onPreAuth
  - typingsJapgolly.hapi.hapiStrings.onCredentials
  - typingsJapgolly.hapi.hapiStrings.onPostAuth
  - typingsJapgolly.hapi.hapiStrings.onPreHandler
  - typingsJapgolly.hapi.hapiStrings.onPostHandler
  - typingsJapgolly.hapi.hapiStrings.onPreResponse
*/
trait ServerRequestExtType extends js.Object

object ServerRequestExtType {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def onCredentials: typingsJapgolly.hapi.hapiStrings.onCredentials = this.cast("onCredentials")
  @scala.inline
  def onPostAuth: typingsJapgolly.hapi.hapiStrings.onPostAuth = this.cast("onPostAuth")
  @scala.inline
  def onPostHandler: typingsJapgolly.hapi.hapiStrings.onPostHandler = this.cast("onPostHandler")
  @scala.inline
  def onPreAuth: typingsJapgolly.hapi.hapiStrings.onPreAuth = this.cast("onPreAuth")
  @scala.inline
  def onPreHandler: typingsJapgolly.hapi.hapiStrings.onPreHandler = this.cast("onPreHandler")
  @scala.inline
  def onPreResponse: typingsJapgolly.hapi.hapiStrings.onPreResponse = this.cast("onPreResponse")
  @scala.inline
  def onRequest: typingsJapgolly.hapi.hapiStrings.onRequest = this.cast("onRequest")
}

