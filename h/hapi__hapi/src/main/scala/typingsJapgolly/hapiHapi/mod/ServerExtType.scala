package typingsJapgolly.hapiHapi.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.hapiHapi.hapiHapiStrings.onPreStart
  - typingsJapgolly.hapiHapi.hapiHapiStrings.onPostStart
  - typingsJapgolly.hapiHapi.hapiHapiStrings.onPreStop
  - typingsJapgolly.hapiHapi.hapiHapiStrings.onPostStop
*/
trait ServerExtType extends js.Object

object ServerExtType {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def onPostStart: typingsJapgolly.hapiHapi.hapiHapiStrings.onPostStart = this.cast("onPostStart")
  @scala.inline
  def onPostStop: typingsJapgolly.hapiHapi.hapiHapiStrings.onPostStop = this.cast("onPostStop")
  @scala.inline
  def onPreStart: typingsJapgolly.hapiHapi.hapiHapiStrings.onPreStart = this.cast("onPreStart")
  @scala.inline
  def onPreStop: typingsJapgolly.hapiHapi.hapiHapiStrings.onPreStop = this.cast("onPreStop")
}

