package typingsJapgolly.amapJsApi.AMap

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.amapJsApi.amapJsApiStrings.miter
  - typingsJapgolly.amapJsApi.amapJsApiStrings.round
  - typingsJapgolly.amapJsApi.amapJsApiStrings.bevel
*/
trait StrokeLineJoin extends js.Object

object StrokeLineJoin {
  @scala.inline
  def bevel: typingsJapgolly.amapJsApi.amapJsApiStrings.bevel = this.cast("bevel")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def miter: typingsJapgolly.amapJsApi.amapJsApiStrings.miter = this.cast("miter")
  @scala.inline
  def round: typingsJapgolly.amapJsApi.amapJsApiStrings.round = this.cast("round")
}

