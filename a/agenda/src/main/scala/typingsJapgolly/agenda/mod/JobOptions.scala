package typingsJapgolly.agenda.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait JobOptions extends js.Object {
  /**
    * Maximum number of that job that can be running at once (per instance of agenda)
    */
  var concurrency: js.UndefOr[Double] = js.undefined
  /**
    * Interval in ms of how long the job stays locked for (see multiple job processors for more info). A job will
    * automatically unlock if done() is called.
    */
  var lockLifetime: js.UndefOr[Double] = js.undefined
  /**
    * Maximum number of that job that can be locked at once (per instance of agenda)
    */
  var lockLimit: js.UndefOr[Double] = js.undefined
  /**
    * (lowest|low|normal|high|highest|number) specifies the priority of the job. Higher priority jobs will run
    * first.
    */
  var priority: js.UndefOr[String | Double] = js.undefined
}

object JobOptions {
  @scala.inline
  def apply(
    concurrency: Int | Double = null,
    lockLifetime: Int | Double = null,
    lockLimit: Int | Double = null,
    priority: String | Double = null
  ): JobOptions = {
    val __obj = js.Dynamic.literal()
    if (concurrency != null) __obj.updateDynamic("concurrency")(concurrency.asInstanceOf[js.Any])
    if (lockLifetime != null) __obj.updateDynamic("lockLifetime")(lockLifetime.asInstanceOf[js.Any])
    if (lockLimit != null) __obj.updateDynamic("lockLimit")(lockLimit.asInstanceOf[js.Any])
    if (priority != null) __obj.updateDynamic("priority")(priority.asInstanceOf[js.Any])
    __obj.asInstanceOf[JobOptions]
  }
}

