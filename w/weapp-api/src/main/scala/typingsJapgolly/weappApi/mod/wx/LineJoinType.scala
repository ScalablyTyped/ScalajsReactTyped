package typingsJapgolly.weappApi.mod.wx

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.weappApi.weappApiStrings.bevel
  - typingsJapgolly.weappApi.weappApiStrings.round
  - typingsJapgolly.weappApi.weappApiStrings.miter
*/
trait LineJoinType extends js.Object

object LineJoinType {
  @scala.inline
  def bevel: typingsJapgolly.weappApi.weappApiStrings.bevel = this.cast("bevel")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def miter: typingsJapgolly.weappApi.weappApiStrings.miter = this.cast("miter")
  @scala.inline
  def round: typingsJapgolly.weappApi.weappApiStrings.round = this.cast("round")
}

