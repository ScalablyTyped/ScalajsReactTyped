package typingsJapgolly.reactVerticalTimelineComponent.mod

import typingsJapgolly.reactVerticalTimelineComponent.reactVerticalTimelineComponentStrings.`1-column`
import typingsJapgolly.reactVerticalTimelineComponent.reactVerticalTimelineComponentStrings.`2-columns`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait VerticalTimelineProps extends js.Object {
  var animate: js.UndefOr[Boolean] = js.undefined
  var className: js.UndefOr[String] = js.undefined
  var layout: js.UndefOr[`1-column` | `2-columns`] = js.undefined
}

object VerticalTimelineProps {
  @scala.inline
  def apply(
    animate: js.UndefOr[Boolean] = js.undefined,
    className: String = null,
    layout: `1-column` | `2-columns` = null
  ): VerticalTimelineProps = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(animate)) __obj.updateDynamic("animate")(animate.asInstanceOf[js.Any])
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (layout != null) __obj.updateDynamic("layout")(layout.asInstanceOf[js.Any])
    __obj.asInstanceOf[VerticalTimelineProps]
  }
}

