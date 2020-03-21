package typingsJapgolly.rollup

import typingsJapgolly.rollup.mod.InputOption
import typingsJapgolly.rollup.mod.RollupBuild
import typingsJapgolly.rollup.mod.RollupWatcherEvent
import typingsJapgolly.rollup.rollupStrings.BUNDLE_END
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonDuration extends RollupWatcherEvent {
  var code: BUNDLE_END
  var duration: Double
  var input: InputOption
  var output: js.Array[String]
  var result: RollupBuild
}

object AnonDuration {
  @scala.inline
  def apply(
    code: BUNDLE_END,
    duration: Double,
    input: InputOption,
    output: js.Array[String],
    result: RollupBuild
  ): AnonDuration = {
    val __obj = js.Dynamic.literal(code = code.asInstanceOf[js.Any], duration = duration.asInstanceOf[js.Any], input = input.asInstanceOf[js.Any], output = output.asInstanceOf[js.Any], result = result.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonDuration]
  }
}

