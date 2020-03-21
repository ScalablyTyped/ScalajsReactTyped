package typingsJapgolly.hapiHapi.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.hapiHapi.hapiHapiStrings.onRequest
  - typingsJapgolly.hapiHapi.hapiHapiStrings.onPreAuth
  - typingsJapgolly.hapiHapi.hapiHapiStrings.onCredentials
  - typingsJapgolly.hapiHapi.hapiHapiStrings.onPostAuth
  - typingsJapgolly.hapiHapi.hapiHapiStrings.onPreHandler
  - typingsJapgolly.hapiHapi.hapiHapiStrings.onPostHandler
  - typingsJapgolly.hapiHapi.hapiHapiStrings.onPreResponse
*/
trait ServerRequestExtType extends js.Object

object ServerRequestExtType {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def onCredentials: typingsJapgolly.hapiHapi.hapiHapiStrings.onCredentials = this.cast("onCredentials")
  @scala.inline
  def onPostAuth: typingsJapgolly.hapiHapi.hapiHapiStrings.onPostAuth = this.cast("onPostAuth")
  @scala.inline
  def onPostHandler: typingsJapgolly.hapiHapi.hapiHapiStrings.onPostHandler = this.cast("onPostHandler")
  @scala.inline
  def onPreAuth: typingsJapgolly.hapiHapi.hapiHapiStrings.onPreAuth = this.cast("onPreAuth")
  @scala.inline
  def onPreHandler: typingsJapgolly.hapiHapi.hapiHapiStrings.onPreHandler = this.cast("onPreHandler")
  @scala.inline
  def onPreResponse: typingsJapgolly.hapiHapi.hapiHapiStrings.onPreResponse = this.cast("onPreResponse")
  @scala.inline
  def onRequest: typingsJapgolly.hapiHapi.hapiHapiStrings.onRequest = this.cast("onRequest")
}

