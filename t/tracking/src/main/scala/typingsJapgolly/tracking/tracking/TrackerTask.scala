package typingsJapgolly.tracking.tracking

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * TrackerTask utility.
  * Note: Types do not provide `setTracker()` even though not marked as private.
  * A new tracker should be created instead.
  */
@JSGlobal("tracking.TrackerTask")
@js.native
class TrackerTask protected () extends EventEmitter {
  /**
    * Create a new tracker task.
    * @param tracker The tracker instance to manage.
    */
  def this(tracker: Tracker) = this()
  /**
    * Gets the tracker instance managed by this task.
    */
  def getTracker(): Tracker = js.native
  /**
    * Emits a `run` event on the tracker task for the implementers to run any
    * child action, e.g. `requestAnimationFrame`.
    */
  def run(): this.type = js.native
  /**
    * Emits a `stop` event on the tracker task for the implementers to stop any
    * child action being done, e.g. `requestAnimationFrame`.
    */
  def stop(): this.type = js.native
}

