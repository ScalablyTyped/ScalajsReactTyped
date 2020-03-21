package typingsJapgolly.simonwepSelectionJs.mod

import org.scalajs.dom.raw.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SelectionOptions extends js.Object {
  var boundaries: js.UndefOr[js.Array[String]] = js.undefined
  var `class`: js.UndefOr[String] = js.undefined
  var disableTouch: js.UndefOr[Boolean] = js.undefined
  var mode: js.UndefOr[Mode] = js.undefined
  var scrollSpeedDivider: js.UndefOr[Double] = js.undefined
  var selectables: js.UndefOr[js.Array[String]] = js.undefined
  var selectionAreaContainer: js.UndefOr[String | HTMLElement | (js.Array[String | HTMLElement])] = js.undefined
  var singleClick: js.UndefOr[Boolean] = js.undefined
  var startThreshold: js.UndefOr[Double] = js.undefined
  var startareas: js.UndefOr[js.Array[String]] = js.undefined
}

object SelectionOptions {
  @scala.inline
  def apply(
    boundaries: js.Array[String] = null,
    `class`: String = null,
    disableTouch: js.UndefOr[Boolean] = js.undefined,
    mode: Mode = null,
    scrollSpeedDivider: Int | Double = null,
    selectables: js.Array[String] = null,
    selectionAreaContainer: String | HTMLElement | (js.Array[String | HTMLElement]) = null,
    singleClick: js.UndefOr[Boolean] = js.undefined,
    startThreshold: Int | Double = null,
    startareas: js.Array[String] = null
  ): SelectionOptions = {
    val __obj = js.Dynamic.literal()
    if (boundaries != null) __obj.updateDynamic("boundaries")(boundaries.asInstanceOf[js.Any])
    if (`class` != null) __obj.updateDynamic("class")(`class`.asInstanceOf[js.Any])
    if (!js.isUndefined(disableTouch)) __obj.updateDynamic("disableTouch")(disableTouch.asInstanceOf[js.Any])
    if (mode != null) __obj.updateDynamic("mode")(mode.asInstanceOf[js.Any])
    if (scrollSpeedDivider != null) __obj.updateDynamic("scrollSpeedDivider")(scrollSpeedDivider.asInstanceOf[js.Any])
    if (selectables != null) __obj.updateDynamic("selectables")(selectables.asInstanceOf[js.Any])
    if (selectionAreaContainer != null) __obj.updateDynamic("selectionAreaContainer")(selectionAreaContainer.asInstanceOf[js.Any])
    if (!js.isUndefined(singleClick)) __obj.updateDynamic("singleClick")(singleClick.asInstanceOf[js.Any])
    if (startThreshold != null) __obj.updateDynamic("startThreshold")(startThreshold.asInstanceOf[js.Any])
    if (startareas != null) __obj.updateDynamic("startareas")(startareas.asInstanceOf[js.Any])
    __obj.asInstanceOf[SelectionOptions]
  }
}

