package typingsJapgolly.jui

import typingsJapgolly.jui.juiStrings.bottom
import typingsJapgolly.jui.juiStrings.top
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonFlex extends js.Object {
  var event: js.UndefOr[js.Any] = js.undefined
  /**
    * @cfg {Boolean} [flex=true]
    * Drop-down menu is varied by changing the width function
    */
  var flex: js.UndefOr[Boolean] = js.undefined
  /**
    * @cfg {Integer} [height=100]
    * Determines an initial selection button with a specified value
    */
  var height: js.UndefOr[Double] = js.undefined
  /**
    * @cfg {Integer} [index=0]
    * Determines an initial selection button with a specified index
    */
  var index: js.UndefOr[Double] = js.undefined
  /**
    * @cfg {Boolean} [keydown=false]
    * It is possible to select a node using the keyboard
    */
  var keydown: js.UndefOr[Boolean] = js.undefined
  /**
    * @cfg {"top"/"bottom"} [position="bottom"]
    * It is possible to determine an initial selection button with a specified value
    */
  var position: js.UndefOr[top | bottom] = js.undefined
  var tpl: js.UndefOr[js.Any] = js.undefined
  /**
    * @cfg {String} [value=0]
    * Determines an initial selection button with a specified value
    */
  var value: js.UndefOr[String] = js.undefined
  /**
    * @cfg {Integer} [width=0]
    * Determines the horizontal size of a combo box
    */
  var width: js.UndefOr[Double] = js.undefined
}

object AnonFlex {
  @scala.inline
  def apply(
    event: js.Any = null,
    flex: js.UndefOr[Boolean] = js.undefined,
    height: Int | Double = null,
    index: Int | Double = null,
    keydown: js.UndefOr[Boolean] = js.undefined,
    position: top | bottom = null,
    tpl: js.Any = null,
    value: String = null,
    width: Int | Double = null
  ): AnonFlex = {
    val __obj = js.Dynamic.literal()
    if (event != null) __obj.updateDynamic("event")(event.asInstanceOf[js.Any])
    if (!js.isUndefined(flex)) __obj.updateDynamic("flex")(flex.asInstanceOf[js.Any])
    if (height != null) __obj.updateDynamic("height")(height.asInstanceOf[js.Any])
    if (index != null) __obj.updateDynamic("index")(index.asInstanceOf[js.Any])
    if (!js.isUndefined(keydown)) __obj.updateDynamic("keydown")(keydown.asInstanceOf[js.Any])
    if (position != null) __obj.updateDynamic("position")(position.asInstanceOf[js.Any])
    if (tpl != null) __obj.updateDynamic("tpl")(tpl.asInstanceOf[js.Any])
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonFlex]
  }
}

