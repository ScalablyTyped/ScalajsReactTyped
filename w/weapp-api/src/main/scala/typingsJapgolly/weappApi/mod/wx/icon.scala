package typingsJapgolly.weappApi.mod.wx

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.weappApi.weappApiStrings.success
  - typingsJapgolly.weappApi.weappApiStrings.loading
  - typingsJapgolly.weappApi.weappApiStrings.none
*/
trait icon extends js.Object

object icon {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def loading: typingsJapgolly.weappApi.weappApiStrings.loading = this.cast("loading")
  @scala.inline
  def none: typingsJapgolly.weappApi.weappApiStrings.none = this.cast("none")
  @scala.inline
  def success: typingsJapgolly.weappApi.weappApiStrings.success = this.cast("success")
}

