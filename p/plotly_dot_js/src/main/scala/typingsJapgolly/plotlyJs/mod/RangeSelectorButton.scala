package typingsJapgolly.plotlyJs.mod

import typingsJapgolly.plotlyJs.plotlyJsStrings.all
import typingsJapgolly.plotlyJs.plotlyJsStrings.backward
import typingsJapgolly.plotlyJs.plotlyJsStrings.day
import typingsJapgolly.plotlyJs.plotlyJsStrings.hour
import typingsJapgolly.plotlyJs.plotlyJsStrings.minute
import typingsJapgolly.plotlyJs.plotlyJsStrings.month
import typingsJapgolly.plotlyJs.plotlyJsStrings.second
import typingsJapgolly.plotlyJs.plotlyJsStrings.todate
import typingsJapgolly.plotlyJs.plotlyJsStrings.year
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RangeSelectorButton extends js.Object {
  var count: Double
  var label: String
  var step: second | minute | hour | day | month | year | all
  var stepmode: backward | todate
}

object RangeSelectorButton {
  @scala.inline
  def apply(
    count: Double,
    label: String,
    step: second | minute | hour | day | month | year | all,
    stepmode: backward | todate
  ): RangeSelectorButton = {
    val __obj = js.Dynamic.literal(count = count.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any], step = step.asInstanceOf[js.Any], stepmode = stepmode.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[RangeSelectorButton]
  }
}

