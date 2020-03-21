package typingsJapgolly.atlaskitInlineEdit.mod

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.vdom.VdomElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StatelessProps extends BaseProps {
  /** Whether the component shows the readView or the editView. */
  var isEditing: Boolean
  /** Handler called when the wrapper or the label are clicked. */
  def onEditRequested(): Unit
}

object StatelessProps {
  @scala.inline
  def apply(
    isEditing: Boolean,
    onCancel: Callback,
    onConfirm: Callback,
    onEditRequested: Callback,
    readView: VdomElement,
    areActionButtonsHidden: js.UndefOr[Boolean] = js.undefined,
    disableEditViewFieldBase: js.UndefOr[Boolean] = js.undefined,
    editView: VdomElement = null,
    invalidMessage: VdomElement = null,
    isConfirmOnBlurDisabled: js.UndefOr[Boolean] = js.undefined,
    isFitContainerWidthReadView: js.UndefOr[Boolean] = js.undefined,
    isInvalid: js.UndefOr[Boolean] = js.undefined,
    isLabelHidden: js.UndefOr[Boolean] = js.undefined,
    isWaiting: js.UndefOr[Boolean] = js.undefined,
    label: String = null,
    labelHtmlFor: String = null,
    shouldConfirmOnEnter: js.UndefOr[Boolean] = js.undefined
  ): StatelessProps = {
    val __obj = js.Dynamic.literal(isEditing = isEditing.asInstanceOf[js.Any])
    __obj.updateDynamic("onCancel")(onCancel.toJsFn)
    __obj.updateDynamic("onConfirm")(onConfirm.toJsFn)
    __obj.updateDynamic("onEditRequested")(onEditRequested.toJsFn)
    if (readView != null) __obj.updateDynamic("readView")(readView.rawElement.asInstanceOf[js.Any])
    if (!js.isUndefined(areActionButtonsHidden)) __obj.updateDynamic("areActionButtonsHidden")(areActionButtonsHidden.asInstanceOf[js.Any])
    if (!js.isUndefined(disableEditViewFieldBase)) __obj.updateDynamic("disableEditViewFieldBase")(disableEditViewFieldBase.asInstanceOf[js.Any])
    if (editView != null) __obj.updateDynamic("editView")(editView.rawElement.asInstanceOf[js.Any])
    if (invalidMessage != null) __obj.updateDynamic("invalidMessage")(invalidMessage.rawElement.asInstanceOf[js.Any])
    if (!js.isUndefined(isConfirmOnBlurDisabled)) __obj.updateDynamic("isConfirmOnBlurDisabled")(isConfirmOnBlurDisabled.asInstanceOf[js.Any])
    if (!js.isUndefined(isFitContainerWidthReadView)) __obj.updateDynamic("isFitContainerWidthReadView")(isFitContainerWidthReadView.asInstanceOf[js.Any])
    if (!js.isUndefined(isInvalid)) __obj.updateDynamic("isInvalid")(isInvalid.asInstanceOf[js.Any])
    if (!js.isUndefined(isLabelHidden)) __obj.updateDynamic("isLabelHidden")(isLabelHidden.asInstanceOf[js.Any])
    if (!js.isUndefined(isWaiting)) __obj.updateDynamic("isWaiting")(isWaiting.asInstanceOf[js.Any])
    if (label != null) __obj.updateDynamic("label")(label.asInstanceOf[js.Any])
    if (labelHtmlFor != null) __obj.updateDynamic("labelHtmlFor")(labelHtmlFor.asInstanceOf[js.Any])
    if (!js.isUndefined(shouldConfirmOnEnter)) __obj.updateDynamic("shouldConfirmOnEnter")(shouldConfirmOnEnter.asInstanceOf[js.Any])
    __obj.asInstanceOf[StatelessProps]
  }
}

