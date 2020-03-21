package typingsJapgolly.igniteUi

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IgGridColumnMovingColumnSetting
  extends /**
	 * Option for IgGridColumnMovingColumnSetting
	 */
/* optionName */ StringDictionary[js.Any] {
  /**
  	 * Allows the column to be moved.
  	 *
  	 */
  var allowMoving: js.UndefOr[Boolean] = js.undefined
  /**
  	 * Column index. Can be used in place of column key. The preferred way of populating a column setting is to always use the column keys as identifiers.
  	 *
  	 */
  var columnIndex: js.UndefOr[Double] = js.undefined
  /**
  	 * Column key. This is a required property in every column setting if columnIndex is not set.
  	 *
  	 */
  var columnKey: js.UndefOr[String] = js.undefined
}

object IgGridColumnMovingColumnSetting {
  @scala.inline
  def apply(
    StringDictionary: /**
  	 * Option for IgGridColumnMovingColumnSetting
  	 */
  /* optionName */ StringDictionary[js.Any] = null,
    allowMoving: js.UndefOr[Boolean] = js.undefined,
    columnIndex: Int | Double = null,
    columnKey: String = null
  ): IgGridColumnMovingColumnSetting = {
    val __obj = js.Dynamic.literal()
    if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (!js.isUndefined(allowMoving)) __obj.updateDynamic("allowMoving")(allowMoving.asInstanceOf[js.Any])
    if (columnIndex != null) __obj.updateDynamic("columnIndex")(columnIndex.asInstanceOf[js.Any])
    if (columnKey != null) __obj.updateDynamic("columnKey")(columnKey.asInstanceOf[js.Any])
    __obj.asInstanceOf[IgGridColumnMovingColumnSetting]
  }
}

