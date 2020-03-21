package typingsJapgolly.mediumEditor.MediumEditor

import org.scalajs.dom.raw.Node
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ToolbarOptions extends js.Object {
  var align: js.UndefOr[String] = js.undefined
  var allowMultiParagraphSelection: js.UndefOr[Boolean] = js.undefined
  var buttons: js.UndefOr[js.Array[Button]] = js.undefined
  var diffLeft: js.UndefOr[Double] = js.undefined
  var diffTop: js.UndefOr[Double] = js.undefined
  var firstButtonClass: js.UndefOr[String] = js.undefined
  var lastButtonClass: js.UndefOr[String] = js.undefined
  var relativeContainer: js.UndefOr[Node] = js.undefined
  var standardizeSelectionStart: js.UndefOr[Boolean] = js.undefined
  var static: js.UndefOr[Boolean] = js.undefined
  var sticky: js.UndefOr[Boolean] = js.undefined
  var stickyTopOffset: js.UndefOr[Double] = js.undefined
  var updateOnEmptySelection: js.UndefOr[Boolean] = js.undefined
}

object ToolbarOptions {
  @scala.inline
  def apply(
    align: String = null,
    allowMultiParagraphSelection: js.UndefOr[Boolean] = js.undefined,
    buttons: js.Array[Button] = null,
    diffLeft: Int | Double = null,
    diffTop: Int | Double = null,
    firstButtonClass: String = null,
    lastButtonClass: String = null,
    relativeContainer: Node = null,
    standardizeSelectionStart: js.UndefOr[Boolean] = js.undefined,
    static: js.UndefOr[Boolean] = js.undefined,
    sticky: js.UndefOr[Boolean] = js.undefined,
    stickyTopOffset: Int | Double = null,
    updateOnEmptySelection: js.UndefOr[Boolean] = js.undefined
  ): ToolbarOptions = {
    val __obj = js.Dynamic.literal()
    if (align != null) __obj.updateDynamic("align")(align.asInstanceOf[js.Any])
    if (!js.isUndefined(allowMultiParagraphSelection)) __obj.updateDynamic("allowMultiParagraphSelection")(allowMultiParagraphSelection.asInstanceOf[js.Any])
    if (buttons != null) __obj.updateDynamic("buttons")(buttons.asInstanceOf[js.Any])
    if (diffLeft != null) __obj.updateDynamic("diffLeft")(diffLeft.asInstanceOf[js.Any])
    if (diffTop != null) __obj.updateDynamic("diffTop")(diffTop.asInstanceOf[js.Any])
    if (firstButtonClass != null) __obj.updateDynamic("firstButtonClass")(firstButtonClass.asInstanceOf[js.Any])
    if (lastButtonClass != null) __obj.updateDynamic("lastButtonClass")(lastButtonClass.asInstanceOf[js.Any])
    if (relativeContainer != null) __obj.updateDynamic("relativeContainer")(relativeContainer.asInstanceOf[js.Any])
    if (!js.isUndefined(standardizeSelectionStart)) __obj.updateDynamic("standardizeSelectionStart")(standardizeSelectionStart.asInstanceOf[js.Any])
    if (!js.isUndefined(static)) __obj.updateDynamic("static")(static.asInstanceOf[js.Any])
    if (!js.isUndefined(sticky)) __obj.updateDynamic("sticky")(sticky.asInstanceOf[js.Any])
    if (stickyTopOffset != null) __obj.updateDynamic("stickyTopOffset")(stickyTopOffset.asInstanceOf[js.Any])
    if (!js.isUndefined(updateOnEmptySelection)) __obj.updateDynamic("updateOnEmptySelection")(updateOnEmptySelection.asInstanceOf[js.Any])
    __obj.asInstanceOf[ToolbarOptions]
  }
}

