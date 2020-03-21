package typingsJapgolly.hapi.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.hapi.hapiStrings.onPreStart
  - typingsJapgolly.hapi.hapiStrings.onPostStart
  - typingsJapgolly.hapi.hapiStrings.onPreStop
  - typingsJapgolly.hapi.hapiStrings.onPostStop
*/
trait ServerExtType extends js.Object

object ServerExtType {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def onPostStart: typingsJapgolly.hapi.hapiStrings.onPostStart = this.cast("onPostStart")
  @scala.inline
  def onPostStop: typingsJapgolly.hapi.hapiStrings.onPostStop = this.cast("onPostStop")
  @scala.inline
  def onPreStart: typingsJapgolly.hapi.hapiStrings.onPreStart = this.cast("onPreStart")
  @scala.inline
  def onPreStop: typingsJapgolly.hapi.hapiStrings.onPreStop = this.cast("onPreStop")
}

