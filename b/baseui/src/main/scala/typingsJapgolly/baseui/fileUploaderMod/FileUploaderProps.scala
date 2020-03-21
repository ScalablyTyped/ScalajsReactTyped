package typingsJapgolly.baseui.fileUploaderMod

import japgolly.scalajs.react.CallbackTo
import japgolly.scalajs.react.ReactDragEventFrom
import japgolly.scalajs.react.ReactEventFrom
import japgolly.scalajs.react.ReactFocusEventFrom
import japgolly.scalajs.react.ReactKeyboardEventFrom
import japgolly.scalajs.react.ReactMouseEventFrom
import org.scalajs.dom.raw.Element
import org.scalajs.dom.raw.File
import org.scalajs.dom.raw.HTMLElement
import typingsJapgolly.std.DataTransferItem
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FileUploaderProps extends js.Object {
  var accept: js.UndefOr[String | js.Array[String]] = js.undefined
  var disableClick: js.UndefOr[Boolean] = js.undefined
  var disabled: js.UndefOr[Boolean] = js.undefined
  var errorMessage: js.UndefOr[String] = js.undefined
  var getDataTransferItems: js.UndefOr[GetDataTransferItems] = js.undefined
  var maxSize: js.UndefOr[Double] = js.undefined
  var minSize: js.UndefOr[Double] = js.undefined
  var multiple: js.UndefOr[Boolean] = js.undefined
  var name: js.UndefOr[String] = js.undefined
  var onBlur: js.UndefOr[js.Function1[/* event */ ReactFocusEventFrom[HTMLElement], _]] = js.undefined
  var onCancel: js.UndefOr[js.Function0[_]] = js.undefined
  var onClick: js.UndefOr[js.Function1[/* event */ ReactMouseEventFrom[HTMLElement], _]] = js.undefined
  var onDragEnter: js.UndefOr[js.Function1[/* event */ ReactDragEventFrom[HTMLElement], _]] = js.undefined
  var onDragLeave: js.UndefOr[js.Function1[/* event */ ReactDragEventFrom[HTMLElement], _]] = js.undefined
  var onDragOver: js.UndefOr[js.Function1[/* event */ ReactDragEventFrom[HTMLElement], _]] = js.undefined
  var onDragStart: js.UndefOr[js.Function1[/* event */ ReactDragEventFrom[HTMLElement], _]] = js.undefined
  var onDrop: js.UndefOr[DropFilesEventHandler] = js.undefined
  var onDropAccepted: js.UndefOr[DropFileEventHandler] = js.undefined
  var onDropRejected: js.UndefOr[DropFileEventHandler] = js.undefined
  var onFileDialogCancel: js.UndefOr[js.Function0[_]] = js.undefined
  var onFocus: js.UndefOr[js.Function1[/* event */ ReactFocusEventFrom[HTMLElement], _]] = js.undefined
  var onKeyDown: js.UndefOr[js.Function1[/* event */ ReactKeyboardEventFrom[HTMLElement], _]] = js.undefined
  var onRetry: js.UndefOr[js.Function0[_]] = js.undefined
  var overrides: js.UndefOr[FileUploaderOverrides[StyleProps]] = js.undefined
  var preventDropOnDocument: js.UndefOr[Boolean] = js.undefined
  var progressAmount: js.UndefOr[Double] = js.undefined
  var progressMessage: js.UndefOr[String] = js.undefined
}

object FileUploaderProps {
  @scala.inline
  def apply(
    accept: String | js.Array[String] = null,
    disableClick: js.UndefOr[Boolean] = js.undefined,
    disabled: js.UndefOr[Boolean] = js.undefined,
    errorMessage: String = null,
    getDataTransferItems: /* event */ ReactEventFrom[js.Any with Element] => CallbackTo[js.Promise[js.Array[File | DataTransferItem]]] = null,
    maxSize: Int | Double = null,
    minSize: Int | Double = null,
    multiple: js.UndefOr[Boolean] = js.undefined,
    name: String = null,
    onBlur: /* event */ ReactFocusEventFrom[HTMLElement] => CallbackTo[js.Any] = null,
    onCancel: js.UndefOr[CallbackTo[js.Any]] = js.undefined,
    onClick: /* event */ ReactMouseEventFrom[HTMLElement] => CallbackTo[js.Any] = null,
    onDragEnter: /* event */ ReactDragEventFrom[HTMLElement] => CallbackTo[js.Any] = null,
    onDragLeave: /* event */ ReactDragEventFrom[HTMLElement] => CallbackTo[js.Any] = null,
    onDragOver: /* event */ ReactDragEventFrom[HTMLElement] => CallbackTo[js.Any] = null,
    onDragStart: /* event */ ReactDragEventFrom[HTMLElement] => CallbackTo[js.Any] = null,
    onDrop: (/* accepted */ js.Array[File], /* rejected */ js.Array[File], /* event */ ReactEventFrom[HTMLElement]) => CallbackTo[js.Any] = null,
    onDropAccepted: (/* acceptedOrRejected */ js.Array[File], /* event */ ReactEventFrom[HTMLElement]) => CallbackTo[js.Any] = null,
    onDropRejected: (/* acceptedOrRejected */ js.Array[File], /* event */ ReactEventFrom[HTMLElement]) => CallbackTo[js.Any] = null,
    onFileDialogCancel: js.UndefOr[CallbackTo[js.Any]] = js.undefined,
    onFocus: /* event */ ReactFocusEventFrom[HTMLElement] => CallbackTo[js.Any] = null,
    onKeyDown: /* event */ ReactKeyboardEventFrom[HTMLElement] => CallbackTo[js.Any] = null,
    onRetry: js.UndefOr[CallbackTo[js.Any]] = js.undefined,
    overrides: FileUploaderOverrides[StyleProps] = null,
    preventDropOnDocument: js.UndefOr[Boolean] = js.undefined,
    progressAmount: Int | Double = null,
    progressMessage: String = null
  ): FileUploaderProps = {
    val __obj = js.Dynamic.literal()
    if (accept != null) __obj.updateDynamic("accept")(accept.asInstanceOf[js.Any])
    if (!js.isUndefined(disableClick)) __obj.updateDynamic("disableClick")(disableClick.asInstanceOf[js.Any])
    if (!js.isUndefined(disabled)) __obj.updateDynamic("disabled")(disabled.asInstanceOf[js.Any])
    if (errorMessage != null) __obj.updateDynamic("errorMessage")(errorMessage.asInstanceOf[js.Any])
    if (getDataTransferItems != null) __obj.updateDynamic("getDataTransferItems")(js.Any.fromFunction1((t0: /* event */ japgolly.scalajs.react.ReactEventFrom[js.Any with org.scalajs.dom.raw.Element]) => getDataTransferItems(t0).runNow()))
    if (maxSize != null) __obj.updateDynamic("maxSize")(maxSize.asInstanceOf[js.Any])
    if (minSize != null) __obj.updateDynamic("minSize")(minSize.asInstanceOf[js.Any])
    if (!js.isUndefined(multiple)) __obj.updateDynamic("multiple")(multiple.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (onBlur != null) __obj.updateDynamic("onBlur")(js.Any.fromFunction1((t0: /* event */ japgolly.scalajs.react.ReactFocusEventFrom[org.scalajs.dom.raw.HTMLElement]) => onBlur(t0).runNow()))
    onCancel.foreach(p => __obj.updateDynamic("onCancel")(p.toJsFn))
    if (onClick != null) __obj.updateDynamic("onClick")(js.Any.fromFunction1((t0: /* event */ japgolly.scalajs.react.ReactMouseEventFrom[org.scalajs.dom.raw.HTMLElement]) => onClick(t0).runNow()))
    if (onDragEnter != null) __obj.updateDynamic("onDragEnter")(js.Any.fromFunction1((t0: /* event */ japgolly.scalajs.react.ReactDragEventFrom[org.scalajs.dom.raw.HTMLElement]) => onDragEnter(t0).runNow()))
    if (onDragLeave != null) __obj.updateDynamic("onDragLeave")(js.Any.fromFunction1((t0: /* event */ japgolly.scalajs.react.ReactDragEventFrom[org.scalajs.dom.raw.HTMLElement]) => onDragLeave(t0).runNow()))
    if (onDragOver != null) __obj.updateDynamic("onDragOver")(js.Any.fromFunction1((t0: /* event */ japgolly.scalajs.react.ReactDragEventFrom[org.scalajs.dom.raw.HTMLElement]) => onDragOver(t0).runNow()))
    if (onDragStart != null) __obj.updateDynamic("onDragStart")(js.Any.fromFunction1((t0: /* event */ japgolly.scalajs.react.ReactDragEventFrom[org.scalajs.dom.raw.HTMLElement]) => onDragStart(t0).runNow()))
    if (onDrop != null) __obj.updateDynamic("onDrop")(js.Any.fromFunction3((t0: /* accepted */ js.Array[org.scalajs.dom.raw.File], t1: /* rejected */ js.Array[org.scalajs.dom.raw.File], t2: /* event */ japgolly.scalajs.react.ReactEventFrom[org.scalajs.dom.raw.HTMLElement]) => onDrop(t0, t1, t2).runNow()))
    if (onDropAccepted != null) __obj.updateDynamic("onDropAccepted")(js.Any.fromFunction2((t0: /* acceptedOrRejected */ js.Array[org.scalajs.dom.raw.File], t1: /* event */ japgolly.scalajs.react.ReactEventFrom[org.scalajs.dom.raw.HTMLElement]) => onDropAccepted(t0, t1).runNow()))
    if (onDropRejected != null) __obj.updateDynamic("onDropRejected")(js.Any.fromFunction2((t0: /* acceptedOrRejected */ js.Array[org.scalajs.dom.raw.File], t1: /* event */ japgolly.scalajs.react.ReactEventFrom[org.scalajs.dom.raw.HTMLElement]) => onDropRejected(t0, t1).runNow()))
    onFileDialogCancel.foreach(p => __obj.updateDynamic("onFileDialogCancel")(p.toJsFn))
    if (onFocus != null) __obj.updateDynamic("onFocus")(js.Any.fromFunction1((t0: /* event */ japgolly.scalajs.react.ReactFocusEventFrom[org.scalajs.dom.raw.HTMLElement]) => onFocus(t0).runNow()))
    if (onKeyDown != null) __obj.updateDynamic("onKeyDown")(js.Any.fromFunction1((t0: /* event */ japgolly.scalajs.react.ReactKeyboardEventFrom[org.scalajs.dom.raw.HTMLElement]) => onKeyDown(t0).runNow()))
    onRetry.foreach(p => __obj.updateDynamic("onRetry")(p.toJsFn))
    if (overrides != null) __obj.updateDynamic("overrides")(overrides.asInstanceOf[js.Any])
    if (!js.isUndefined(preventDropOnDocument)) __obj.updateDynamic("preventDropOnDocument")(preventDropOnDocument.asInstanceOf[js.Any])
    if (progressAmount != null) __obj.updateDynamic("progressAmount")(progressAmount.asInstanceOf[js.Any])
    if (progressMessage != null) __obj.updateDynamic("progressMessage")(progressMessage.asInstanceOf[js.Any])
    __obj.asInstanceOf[FileUploaderProps]
  }
}

