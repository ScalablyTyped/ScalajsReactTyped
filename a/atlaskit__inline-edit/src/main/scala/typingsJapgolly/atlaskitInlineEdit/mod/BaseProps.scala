package typingsJapgolly.atlaskitInlineEdit.mod

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.raw.React.Element
import japgolly.scalajs.react.vdom.VdomElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BaseProps extends js.Object {
  /** Sets whether the checkmark and cross are displayed in the bottom right fo the field. */
  var areActionButtonsHidden: js.UndefOr[Boolean] = js.undefined
  /** Set whether default stylings should be disabled when editing. */
  var disableEditViewFieldBase: js.UndefOr[Boolean] = js.undefined
  /** Component to be shown when editing. Should be an @atlaskit/input. */
  var editView: js.UndefOr[Element] = js.undefined
  /** Component to be shown in an @atlaskit/inline-dialog when edit view is open. */
  var invalidMessage: js.UndefOr[Element] = js.undefined
  /** Sets whether the confirm function is called when the input loses focus. */
  var isConfirmOnBlurDisabled: js.UndefOr[Boolean] = js.undefined
  /** Set whether the read view should fit width, most obvious when hovered. */
  var isFitContainerWidthReadView: js.UndefOr[Boolean] = js.undefined
  /** Sets yellow border with warning symbol at end of input. Removes confirm and cancel buttons. */
  var isInvalid: js.UndefOr[Boolean] = js.undefined
  /** Determine whether the label is shown. */
  var isLabelHidden: js.UndefOr[Boolean] = js.undefined
  /** Greys out text and shows spinner. Does not disable input. */
  var isWaiting: js.UndefOr[Boolean] = js.undefined
  /** Label above the input. */
  var label: js.UndefOr[String] = js.undefined
  /** html to pass down to the label htmlFor prop. */
  var labelHtmlFor: js.UndefOr[String] = js.undefined
  /** Component to be shown when reading only */
  var readView: Element
  /** Set whether onConfirm is called on pressing enter. */
  var shouldConfirmOnEnter: js.UndefOr[Boolean] = js.undefined
  /** Handler called when the cross is clicked on. */
  def onCancel(): Unit
  /** Handler called when checkmark is clicked. Also by default called when the input loses focus. */
  def onConfirm(): Unit
}

object BaseProps {
  @scala.inline
  def apply(
    onCancel: Callback,
    onConfirm: Callback,
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
  ): BaseProps = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("onCancel")(onCancel.toJsFn)
    __obj.updateDynamic("onConfirm")(onConfirm.toJsFn)
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
    __obj.asInstanceOf[BaseProps]
  }
}

