package typingsJapgolly.jestCore

import typingsJapgolly.jestCore.typesMod.Stats
import typingsJapgolly.jestRunner.mod.Test
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonStats extends js.Object {
  var allTests: Double
  var stats: js.UndefOr[Stats] = js.undefined
  var tests: js.Array[Test]
  var total: js.UndefOr[Double] = js.undefined
}

object AnonStats {
  @scala.inline
  def apply(allTests: Double, tests: js.Array[Test], stats: Stats = null, total: Int | Double = null): AnonStats = {
    val __obj = js.Dynamic.literal(allTests = allTests.asInstanceOf[js.Any], tests = tests.asInstanceOf[js.Any])
    if (stats != null) __obj.updateDynamic("stats")(stats.asInstanceOf[js.Any])
    if (total != null) __obj.updateDynamic("total")(total.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonStats]
  }
}

