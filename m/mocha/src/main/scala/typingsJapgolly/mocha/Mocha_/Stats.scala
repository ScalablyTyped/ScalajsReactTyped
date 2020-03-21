package typingsJapgolly.mocha.Mocha_

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Test statistics
  */
trait Stats extends js.Object {
  var duration: js.UndefOr[Double] = js.undefined
  var end: js.UndefOr[js.Date] = js.undefined
  var failures: Double
  var passes: Double
  var pending: Double
  var start: js.UndefOr[js.Date] = js.undefined
  var suites: Double
  var tests: Double
}

object Stats {
  @scala.inline
  def apply(
    failures: Double,
    passes: Double,
    pending: Double,
    suites: Double,
    tests: Double,
    duration: Int | Double = null,
    end: js.Date = null,
    start: js.Date = null
  ): Stats = {
    val __obj = js.Dynamic.literal(failures = failures.asInstanceOf[js.Any], passes = passes.asInstanceOf[js.Any], pending = pending.asInstanceOf[js.Any], suites = suites.asInstanceOf[js.Any], tests = tests.asInstanceOf[js.Any])
    if (duration != null) __obj.updateDynamic("duration")(duration.asInstanceOf[js.Any])
    if (end != null) __obj.updateDynamic("end")(end.asInstanceOf[js.Any])
    if (start != null) __obj.updateDynamic("start")(start.asInstanceOf[js.Any])
    __obj.asInstanceOf[Stats]
  }
}

