package typingsJapgolly.nodeHueApi.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.nodeHueApi.nodeHueApiStrings.none
  - typingsJapgolly.nodeHueApi.nodeHueApiStrings.select
  - typingsJapgolly.nodeHueApi.nodeHueApiStrings.lselect
*/
trait LightAlert extends js.Object

object LightAlert {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def lselect: typingsJapgolly.nodeHueApi.nodeHueApiStrings.lselect = this.cast("lselect")
  @scala.inline
  def none: typingsJapgolly.nodeHueApi.nodeHueApiStrings.none = this.cast("none")
  @scala.inline
  def select: typingsJapgolly.nodeHueApi.nodeHueApiStrings.select = this.cast("select")
}

