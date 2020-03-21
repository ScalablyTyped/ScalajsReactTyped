package typingsJapgolly.pollyjsCore.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.pollyjsCore.pollyjsCoreStrings.beforeReplay
  - typingsJapgolly.pollyjsCore.pollyjsCoreStrings.beforePersist
*/
trait RecordingRouteEvent extends js.Object

object RecordingRouteEvent {
  @scala.inline
  def beforePersist: typingsJapgolly.pollyjsCore.pollyjsCoreStrings.beforePersist = this.cast("beforePersist")
  @scala.inline
  def beforeReplay: typingsJapgolly.pollyjsCore.pollyjsCoreStrings.beforeReplay = this.cast("beforeReplay")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
}

