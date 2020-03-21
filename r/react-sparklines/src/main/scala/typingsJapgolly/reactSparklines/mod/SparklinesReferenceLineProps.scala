package typingsJapgolly.reactSparklines.mod

import typingsJapgolly.react.mod.CSSProperties
import typingsJapgolly.reactSparklines.reactSparklinesStrings.avg
import typingsJapgolly.reactSparklines.reactSparklinesStrings.custom
import typingsJapgolly.reactSparklines.reactSparklinesStrings.max
import typingsJapgolly.reactSparklines.reactSparklinesStrings.mean
import typingsJapgolly.reactSparklines.reactSparklinesStrings.median
import typingsJapgolly.reactSparklines.reactSparklinesStrings.min
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SparklinesReferenceLineProps extends js.Object {
  var style: js.UndefOr[CSSProperties] = js.undefined
  var `type`: js.UndefOr[max | min | mean | avg | median | custom] = js.undefined
  var value: js.UndefOr[Double] = js.undefined
}

object SparklinesReferenceLineProps {
  @scala.inline
  def apply(
    style: CSSProperties = null,
    `type`: max | min | mean | avg | median | custom = null,
    value: Int | Double = null
  ): SparklinesReferenceLineProps = {
    val __obj = js.Dynamic.literal()
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    __obj.asInstanceOf[SparklinesReferenceLineProps]
  }
}

