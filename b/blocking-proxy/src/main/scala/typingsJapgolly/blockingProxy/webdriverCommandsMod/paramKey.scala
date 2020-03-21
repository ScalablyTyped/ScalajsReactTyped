package typingsJapgolly.blockingProxy.webdriverCommandsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.blockingProxy.blockingProxyStrings.sessionId
  - typingsJapgolly.blockingProxy.blockingProxyStrings.elementId
  - typingsJapgolly.blockingProxy.blockingProxyStrings.name
  - typingsJapgolly.blockingProxy.blockingProxyStrings.propertyName
*/
trait paramKey extends js.Object

object paramKey {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def elementId: typingsJapgolly.blockingProxy.blockingProxyStrings.elementId = this.cast("elementId")
  @scala.inline
  def name: typingsJapgolly.blockingProxy.blockingProxyStrings.name = this.cast("name")
  @scala.inline
  def propertyName: typingsJapgolly.blockingProxy.blockingProxyStrings.propertyName = this.cast("propertyName")
  @scala.inline
  def sessionId: typingsJapgolly.blockingProxy.blockingProxyStrings.sessionId = this.cast("sessionId")
}

