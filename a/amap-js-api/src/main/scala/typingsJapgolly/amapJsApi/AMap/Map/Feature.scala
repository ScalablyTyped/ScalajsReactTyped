package typingsJapgolly.amapJsApi.AMap.Map

import typingsJapgolly.amapJsApi.amapJsApiStrings.point_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.amapJsApi.amapJsApiStrings.bg
  - typingsJapgolly.amapJsApi.amapJsApiStrings.point_
  - typingsJapgolly.amapJsApi.amapJsApiStrings.road
  - typingsJapgolly.amapJsApi.amapJsApiStrings.building
*/
trait Feature extends js.Object

object Feature {
  @scala.inline
  def bg: typingsJapgolly.amapJsApi.amapJsApiStrings.bg = this.cast("bg")
  @scala.inline
  def building: typingsJapgolly.amapJsApi.amapJsApiStrings.building = this.cast("building")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def point: point_ = this.cast("point")
  @scala.inline
  def road: typingsJapgolly.amapJsApi.amapJsApiStrings.road = this.cast("road")
}

