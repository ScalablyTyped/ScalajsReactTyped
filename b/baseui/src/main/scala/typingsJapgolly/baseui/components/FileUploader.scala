package typingsJapgolly.baseui.components

import japgolly.scalajs.react.CallbackTo
import japgolly.scalajs.react.CtorType.ChildArg
import japgolly.scalajs.react.Key
import japgolly.scalajs.react.ReactDragEventFrom
import japgolly.scalajs.react.ReactEventFrom
import japgolly.scalajs.react.ReactFocusEventFrom
import japgolly.scalajs.react.ReactKeyboardEventFrom
import japgolly.scalajs.react.ReactMouseEventFrom
import japgolly.scalajs.react.component.Js.MountedWithRawType
import japgolly.scalajs.react.component.Js.RawMounted
import japgolly.scalajs.react.component.Js.UnmountedSimple
import org.scalablytyped.runtime.StringDictionary
import org.scalajs.dom.raw.Element
import org.scalajs.dom.raw.File
import org.scalajs.dom.raw.HTMLElement
import typingsJapgolly.baseui.fileUploaderMod.FileUploaderOverrides
import typingsJapgolly.baseui.fileUploaderMod.FileUploaderProps
import typingsJapgolly.baseui.fileUploaderMod.StyleProps
import typingsJapgolly.std.DataTransferItem
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object FileUploader {
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
    progressMessage: String = null,
    key: js.UndefOr[Key] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  )(
    children: ChildArg*
  ): UnmountedSimple[
    FileUploaderProps, 
    MountedWithRawType[FileUploaderProps, js.Object, RawMounted[FileUploaderProps, js.Object]]
  ] = {
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
    key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
  
    val f = japgolly.scalajs.react.JsComponent[
  typingsJapgolly.baseui.fileUploaderMod.FileUploaderProps, 
  japgolly.scalajs.react.Children.Varargs, 
  js.Object](this.componentImport)
    f(__obj.asInstanceOf[typingsJapgolly.baseui.fileUploaderMod.FileUploaderProps])(children: _*)
  }
  @JSImport("baseui/file-uploader", "FileUploader")
  @js.native
  object componentImport extends js.Object
  
}

