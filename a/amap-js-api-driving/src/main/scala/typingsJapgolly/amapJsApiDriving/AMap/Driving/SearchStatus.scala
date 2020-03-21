package typingsJapgolly.amapJsApiDriving.AMap.Driving

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.amapJsApiDriving.amapJsApiDrivingStrings.error
  - typingsJapgolly.amapJsApiDriving.amapJsApiDrivingStrings.no_data
  - typingsJapgolly.amapJsApiDriving.amapJsApiDrivingStrings.complete
*/
trait SearchStatus extends js.Object

object SearchStatus {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def complete: typingsJapgolly.amapJsApiDriving.amapJsApiDrivingStrings.complete = this.cast("complete")
  @scala.inline
  def error: typingsJapgolly.amapJsApiDriving.amapJsApiDrivingStrings.error = this.cast("error")
  @scala.inline
  def no_data: typingsJapgolly.amapJsApiDriving.amapJsApiDrivingStrings.no_data = this.cast("no_data")
}

