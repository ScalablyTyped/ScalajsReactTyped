package typingsJapgolly.jui

import typingsJapgolly.jui.juiStrings.black
import typingsJapgolly.jui.juiStrings.gray
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonAutoHide extends js.Object {
  /**
    * @cfg {Boolean} [autoHide=true]
    * Automatically hides a modal when clicking on it
    */
  var autoHide: js.UndefOr[Boolean] = js.undefined
  /**
    * @cfg {Boolean} [clone=false]
    * Copies an existing modal and shows it
    */
  @JSName("clone")
  var clone_FAnonAutoHide: js.UndefOr[Boolean] = js.undefined
  /**
    * @cfg {"black"/"gray"} [color="black"]
    * Determines the color of a modal
    */
  var color: js.UndefOr[black | gray] = js.undefined
  var event: js.UndefOr[js.Any] = js.undefined
  /**
    * @cfg {Integer} [index=0]
    * Determines the sequence (index) of a modal
    */
  var index: js.UndefOr[Double] = js.undefined
  /**
    * @cfg {Float} [opacity=0.4]
    * Sets the transparency of a modal
    */
  var opacity: js.UndefOr[Double] = js.undefined
  /**
    * @cfg {String/DOMElement} [target="body"]
    * Sets a selector on which a modal is shown
    */
  var target: js.UndefOr[String | js.Any] = js.undefined
  var tpl: js.UndefOr[js.Any] = js.undefined
}

object AnonAutoHide {
  @scala.inline
  def apply(
    autoHide: js.UndefOr[Boolean] = js.undefined,
    clone: js.UndefOr[Boolean] = js.undefined,
    color: black | gray = null,
    event: js.Any = null,
    index: Int | Double = null,
    opacity: Int | Double = null,
    target: String | js.Any = null,
    tpl: js.Any = null
  ): AnonAutoHide = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(autoHide)) __obj.updateDynamic("autoHide")(autoHide.asInstanceOf[js.Any])
    if (!js.isUndefined(clone)) __obj.updateDynamic("clone")(clone.asInstanceOf[js.Any])
    if (color != null) __obj.updateDynamic("color")(color.asInstanceOf[js.Any])
    if (event != null) __obj.updateDynamic("event")(event.asInstanceOf[js.Any])
    if (index != null) __obj.updateDynamic("index")(index.asInstanceOf[js.Any])
    if (opacity != null) __obj.updateDynamic("opacity")(opacity.asInstanceOf[js.Any])
    if (target != null) __obj.updateDynamic("target")(target.asInstanceOf[js.Any])
    if (tpl != null) __obj.updateDynamic("tpl")(tpl.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonAutoHide]
  }
}

