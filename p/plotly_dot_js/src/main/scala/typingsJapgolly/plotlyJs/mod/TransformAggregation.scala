package typingsJapgolly.plotlyJs.mod

import typingsJapgolly.plotlyJs.plotlyJsStrings.avg
import typingsJapgolly.plotlyJs.plotlyJsStrings.count
import typingsJapgolly.plotlyJs.plotlyJsStrings.first
import typingsJapgolly.plotlyJs.plotlyJsStrings.last
import typingsJapgolly.plotlyJs.plotlyJsStrings.max
import typingsJapgolly.plotlyJs.plotlyJsStrings.median
import typingsJapgolly.plotlyJs.plotlyJsStrings.min
import typingsJapgolly.plotlyJs.plotlyJsStrings.mode
import typingsJapgolly.plotlyJs.plotlyJsStrings.population
import typingsJapgolly.plotlyJs.plotlyJsStrings.rms
import typingsJapgolly.plotlyJs.plotlyJsStrings.sample
import typingsJapgolly.plotlyJs.plotlyJsStrings.stddev
import typingsJapgolly.plotlyJs.plotlyJsStrings.sum
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TransformAggregation extends js.Object {
  var enabled: js.UndefOr[Boolean] = js.undefined
  var func: js.UndefOr[count | sum | avg | median | mode | rms | stddev | min | max | first | last] = js.undefined
  var funcmode: js.UndefOr[sample | population] = js.undefined
  var target: String
}

object TransformAggregation {
  @scala.inline
  def apply(
    target: String,
    enabled: js.UndefOr[Boolean] = js.undefined,
    func: count | sum | avg | median | mode | rms | stddev | min | max | first | last = null,
    funcmode: sample | population = null
  ): TransformAggregation = {
    val __obj = js.Dynamic.literal(target = target.asInstanceOf[js.Any])
    if (!js.isUndefined(enabled)) __obj.updateDynamic("enabled")(enabled.asInstanceOf[js.Any])
    if (func != null) __obj.updateDynamic("func")(func.asInstanceOf[js.Any])
    if (funcmode != null) __obj.updateDynamic("funcmode")(funcmode.asInstanceOf[js.Any])
    __obj.asInstanceOf[TransformAggregation]
  }
}

