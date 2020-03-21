package typingsJapgolly.jqueryGridster

import japgolly.scalajs.react.Callback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GridsterCollision extends js.Object {
  def on_overlap(data: GridsterCollisionData): Unit
  def on_overlap_start(data: GridsterCollisionData): Unit
  def on_overlap_stop(data: GridsterCollisionData): Unit
}

object GridsterCollision {
  @scala.inline
  def apply(
    on_overlap: GridsterCollisionData => Callback,
    on_overlap_start: GridsterCollisionData => Callback,
    on_overlap_stop: GridsterCollisionData => Callback
  ): GridsterCollision = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("on_overlap")(js.Any.fromFunction1((t0: typingsJapgolly.jqueryGridster.GridsterCollisionData) => on_overlap(t0).runNow()))
    __obj.updateDynamic("on_overlap_start")(js.Any.fromFunction1((t0: typingsJapgolly.jqueryGridster.GridsterCollisionData) => on_overlap_start(t0).runNow()))
    __obj.updateDynamic("on_overlap_stop")(js.Any.fromFunction1((t0: typingsJapgolly.jqueryGridster.GridsterCollisionData) => on_overlap_stop(t0).runNow()))
    __obj.asInstanceOf[GridsterCollision]
  }
}

