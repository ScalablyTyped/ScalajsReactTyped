package typingsJapgolly.sinonjsFakeTimers.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FakeTimerInstallOpts extends js.Object {
  /**
    * Relevant only when using with shouldAdvanceTime: true. increment mocked time by advanceTimeDelta ms every advanceTimeDelta ms change
    * in the real system time (default: 20)
    */
  var advanceTimeDelta: js.UndefOr[Double] = js.undefined
  /**
    * The maximum number of timers that will be run when calling runAll() (default: 1000)
    */
  var loopLimit: js.UndefOr[Double] = js.undefined
  /**
    * Installs fake timers with the specified unix epoch (default: 0)
    */
  var now: js.UndefOr[Double | js.Date] = js.undefined
  /**
    * Tells @sinonjs/fake-timers to increment mocked time automatically based on the real system time shift (e.g. the mocked time will be incremented by
    * 20ms for every 20ms change in the real system time) (default: false)
    */
  var shouldAdvanceTime: js.UndefOr[Boolean] = js.undefined
  /**
    * Installs fake timers onto the specified target context (default: global)
    */
  var target: js.UndefOr[js.Any] = js.undefined
  /**
    * An array with explicit function names to hijack. When not set, @sinonjs/fake-timers will automatically fake all methods except nextTick
    * e.g., FakeTimers.install({ toFake: ["setTimeout", "nextTick"]}) will fake only setTimeout and nextTick
    */
  var toFake: js.UndefOr[js.Array[FakeMethod]] = js.undefined
}

object FakeTimerInstallOpts {
  @scala.inline
  def apply(
    advanceTimeDelta: Int | Double = null,
    loopLimit: Int | Double = null,
    now: Double | js.Date = null,
    shouldAdvanceTime: js.UndefOr[Boolean] = js.undefined,
    target: js.Any = null,
    toFake: js.Array[FakeMethod] = null
  ): FakeTimerInstallOpts = {
    val __obj = js.Dynamic.literal()
    if (advanceTimeDelta != null) __obj.updateDynamic("advanceTimeDelta")(advanceTimeDelta.asInstanceOf[js.Any])
    if (loopLimit != null) __obj.updateDynamic("loopLimit")(loopLimit.asInstanceOf[js.Any])
    if (now != null) __obj.updateDynamic("now")(now.asInstanceOf[js.Any])
    if (!js.isUndefined(shouldAdvanceTime)) __obj.updateDynamic("shouldAdvanceTime")(shouldAdvanceTime.asInstanceOf[js.Any])
    if (target != null) __obj.updateDynamic("target")(target.asInstanceOf[js.Any])
    if (toFake != null) __obj.updateDynamic("toFake")(toFake.asInstanceOf[js.Any])
    __obj.asInstanceOf[FakeTimerInstallOpts]
  }
}

