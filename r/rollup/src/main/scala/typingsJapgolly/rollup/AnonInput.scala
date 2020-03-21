package typingsJapgolly.rollup

import typingsJapgolly.rollup.mod.InputOption
import typingsJapgolly.rollup.mod.RollupWatcherEvent
import typingsJapgolly.rollup.rollupStrings.BUNDLE_START
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonInput extends RollupWatcherEvent {
  var code: BUNDLE_START
  var input: InputOption
  var output: js.Array[String]
}

object AnonInput {
  @scala.inline
  def apply(code: BUNDLE_START, input: InputOption, output: js.Array[String]): AnonInput = {
    val __obj = js.Dynamic.literal(code = code.asInstanceOf[js.Any], input = input.asInstanceOf[js.Any], output = output.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonInput]
  }
}

