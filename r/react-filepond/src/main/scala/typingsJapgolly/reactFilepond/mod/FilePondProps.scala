package typingsJapgolly.reactFilepond.mod

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import japgolly.scalajs.react.raw.React.Element
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.reactFilepond.AnonFetch
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FilePondProps
  extends FilePondDragDropProps
     with FilePondServerConfigProps
     with FilePondLabelProps
     with FilePondSvgIconProps
     with FilePondCallbackProps
     with FilePondHookProps
     with FilePondBaseProps

object FilePondProps {
  @scala.inline
  def apply(
    acceptedFileTypes: js.Array[String] = null,
    allowBrowse: js.UndefOr[Boolean] = js.undefined,
    allowDrop: js.UndefOr[Boolean] = js.undefined,
    allowMultiple: js.UndefOr[Boolean] = js.undefined,
    allowPaste: js.UndefOr[Boolean] = js.undefined,
    allowReplace: js.UndefOr[Boolean] = js.undefined,
    allowRevert: js.UndefOr[Boolean] = js.undefined,
    beforeRemoveFile: /* file */ File => CallbackTo[Boolean] = null,
    captureMethod: js.Any = null,
    children: Element | js.Array[Element] = null,
    className: String = null,
    dropOnElement: js.UndefOr[Boolean] = js.undefined,
    dropOnPage: js.UndefOr[Boolean] = js.undefined,
    dropValidation: js.UndefOr[Boolean] = js.undefined,
    files: js.Array[File] = null,
    iconProcess: String = null,
    iconRemove: String = null,
    iconRetry: String = null,
    iconUndo: String = null,
    id: String = null,
    ignoredFiles: js.Array[String] = null,
    instantUpload: js.UndefOr[Boolean] = js.undefined,
    labelButtonAbortItemLoad: String = null,
    labelButtonAbortItemProcessing: String = null,
    labelButtonProcessItem: String = null,
    labelButtonRemoveItem: String = null,
    labelButtonRetryItemLoad: String = null,
    labelButtonRetryItemProcessing: String = null,
    labelButtonUndoItemProcessing: String = null,
    labelDecimalSeparator: String = null,
    labelFileLoadError: String = null,
    labelFileLoading: String = null,
    labelFileProcessing: String = null,
    labelFileProcessingAborted: String = null,
    labelFileProcessingComplete: String = null,
    labelFileProcessingError: String = null,
    labelFileSizeNotAvailable: String = null,
    labelFileWaitingForSize: String = null,
    labelIdle: String = null,
    labelTapToCancel: String = null,
    labelTapToRetry: String = null,
    labelTapToUndo: String = null,
    labelThousandsSeparator: String = null,
    maxFiles: Int | Double = null,
    maxParallelUploads: Int | Double = null,
    metadata: StringDictionary[js.Any] = null,
    name: String = null,
    onaddfile: (/* error */ FilePondErrorDescription, /* file */ File) => Callback = null,
    onaddfileprogress: (/* file */ File, /* progress */ Double) => Callback = null,
    onaddfilestart: /* file */ File => Callback = null,
    onerror: (/* error */ FilePondErrorDescription, /* file */ js.UndefOr[File], /* status */ js.UndefOr[js.Any]) => Callback = null,
    oninit: js.UndefOr[Callback] = js.undefined,
    onpreparefile: (/* file */ File, /* output */ js.Any) => Callback = null,
    onprocessfile: (/* error */ FilePondErrorDescription, /* file */ File) => Callback = null,
    onprocessfileabort: /* file */ File => Callback = null,
    onprocessfileprogress: (/* file */ File, /* progress */ Double) => Callback = null,
    onprocessfilestart: /* file */ File => Callback = null,
    onprocessfileundo: /* file */ File => Callback = null,
    onremovefile: /* file */ File => Callback = null,
    onupdatefiles: /* fileItems */ js.Array[File] => Callback = null,
    onwarning: (/* error */ js.Any, /* file */ js.UndefOr[File], /* status */ js.UndefOr[js.Any]) => Callback = null,
    required: js.UndefOr[Boolean] = js.undefined,
    server: String | AnonFetch = null
  ): FilePondProps = {
    val __obj = js.Dynamic.literal()
    if (acceptedFileTypes != null) __obj.updateDynamic("acceptedFileTypes")(acceptedFileTypes.asInstanceOf[js.Any])
    if (!js.isUndefined(allowBrowse)) __obj.updateDynamic("allowBrowse")(allowBrowse.asInstanceOf[js.Any])
    if (!js.isUndefined(allowDrop)) __obj.updateDynamic("allowDrop")(allowDrop.asInstanceOf[js.Any])
    if (!js.isUndefined(allowMultiple)) __obj.updateDynamic("allowMultiple")(allowMultiple.asInstanceOf[js.Any])
    if (!js.isUndefined(allowPaste)) __obj.updateDynamic("allowPaste")(allowPaste.asInstanceOf[js.Any])
    if (!js.isUndefined(allowReplace)) __obj.updateDynamic("allowReplace")(allowReplace.asInstanceOf[js.Any])
    if (!js.isUndefined(allowRevert)) __obj.updateDynamic("allowRevert")(allowRevert.asInstanceOf[js.Any])
    if (beforeRemoveFile != null) __obj.updateDynamic("beforeRemoveFile")(js.Any.fromFunction1((t0: /* file */ typingsJapgolly.reactFilepond.mod.File) => beforeRemoveFile(t0).runNow()))
    if (captureMethod != null) __obj.updateDynamic("captureMethod")(captureMethod.asInstanceOf[js.Any])
    if (children != null) __obj.updateDynamic("children")(children.asInstanceOf[js.Any])
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (!js.isUndefined(dropOnElement)) __obj.updateDynamic("dropOnElement")(dropOnElement.asInstanceOf[js.Any])
    if (!js.isUndefined(dropOnPage)) __obj.updateDynamic("dropOnPage")(dropOnPage.asInstanceOf[js.Any])
    if (!js.isUndefined(dropValidation)) __obj.updateDynamic("dropValidation")(dropValidation.asInstanceOf[js.Any])
    if (files != null) __obj.updateDynamic("files")(files.asInstanceOf[js.Any])
    if (iconProcess != null) __obj.updateDynamic("iconProcess")(iconProcess.asInstanceOf[js.Any])
    if (iconRemove != null) __obj.updateDynamic("iconRemove")(iconRemove.asInstanceOf[js.Any])
    if (iconRetry != null) __obj.updateDynamic("iconRetry")(iconRetry.asInstanceOf[js.Any])
    if (iconUndo != null) __obj.updateDynamic("iconUndo")(iconUndo.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (ignoredFiles != null) __obj.updateDynamic("ignoredFiles")(ignoredFiles.asInstanceOf[js.Any])
    if (!js.isUndefined(instantUpload)) __obj.updateDynamic("instantUpload")(instantUpload.asInstanceOf[js.Any])
    if (labelButtonAbortItemLoad != null) __obj.updateDynamic("labelButtonAbortItemLoad")(labelButtonAbortItemLoad.asInstanceOf[js.Any])
    if (labelButtonAbortItemProcessing != null) __obj.updateDynamic("labelButtonAbortItemProcessing")(labelButtonAbortItemProcessing.asInstanceOf[js.Any])
    if (labelButtonProcessItem != null) __obj.updateDynamic("labelButtonProcessItem")(labelButtonProcessItem.asInstanceOf[js.Any])
    if (labelButtonRemoveItem != null) __obj.updateDynamic("labelButtonRemoveItem")(labelButtonRemoveItem.asInstanceOf[js.Any])
    if (labelButtonRetryItemLoad != null) __obj.updateDynamic("labelButtonRetryItemLoad")(labelButtonRetryItemLoad.asInstanceOf[js.Any])
    if (labelButtonRetryItemProcessing != null) __obj.updateDynamic("labelButtonRetryItemProcessing")(labelButtonRetryItemProcessing.asInstanceOf[js.Any])
    if (labelButtonUndoItemProcessing != null) __obj.updateDynamic("labelButtonUndoItemProcessing")(labelButtonUndoItemProcessing.asInstanceOf[js.Any])
    if (labelDecimalSeparator != null) __obj.updateDynamic("labelDecimalSeparator")(labelDecimalSeparator.asInstanceOf[js.Any])
    if (labelFileLoadError != null) __obj.updateDynamic("labelFileLoadError")(labelFileLoadError.asInstanceOf[js.Any])
    if (labelFileLoading != null) __obj.updateDynamic("labelFileLoading")(labelFileLoading.asInstanceOf[js.Any])
    if (labelFileProcessing != null) __obj.updateDynamic("labelFileProcessing")(labelFileProcessing.asInstanceOf[js.Any])
    if (labelFileProcessingAborted != null) __obj.updateDynamic("labelFileProcessingAborted")(labelFileProcessingAborted.asInstanceOf[js.Any])
    if (labelFileProcessingComplete != null) __obj.updateDynamic("labelFileProcessingComplete")(labelFileProcessingComplete.asInstanceOf[js.Any])
    if (labelFileProcessingError != null) __obj.updateDynamic("labelFileProcessingError")(labelFileProcessingError.asInstanceOf[js.Any])
    if (labelFileSizeNotAvailable != null) __obj.updateDynamic("labelFileSizeNotAvailable")(labelFileSizeNotAvailable.asInstanceOf[js.Any])
    if (labelFileWaitingForSize != null) __obj.updateDynamic("labelFileWaitingForSize")(labelFileWaitingForSize.asInstanceOf[js.Any])
    if (labelIdle != null) __obj.updateDynamic("labelIdle")(labelIdle.asInstanceOf[js.Any])
    if (labelTapToCancel != null) __obj.updateDynamic("labelTapToCancel")(labelTapToCancel.asInstanceOf[js.Any])
    if (labelTapToRetry != null) __obj.updateDynamic("labelTapToRetry")(labelTapToRetry.asInstanceOf[js.Any])
    if (labelTapToUndo != null) __obj.updateDynamic("labelTapToUndo")(labelTapToUndo.asInstanceOf[js.Any])
    if (labelThousandsSeparator != null) __obj.updateDynamic("labelThousandsSeparator")(labelThousandsSeparator.asInstanceOf[js.Any])
    if (maxFiles != null) __obj.updateDynamic("maxFiles")(maxFiles.asInstanceOf[js.Any])
    if (maxParallelUploads != null) __obj.updateDynamic("maxParallelUploads")(maxParallelUploads.asInstanceOf[js.Any])
    if (metadata != null) __obj.updateDynamic("metadata")(metadata.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (onaddfile != null) __obj.updateDynamic("onaddfile")(js.Any.fromFunction2((t0: /* error */ typingsJapgolly.reactFilepond.mod.FilePondErrorDescription, t1: /* file */ typingsJapgolly.reactFilepond.mod.File) => onaddfile(t0, t1).runNow()))
    if (onaddfileprogress != null) __obj.updateDynamic("onaddfileprogress")(js.Any.fromFunction2((t0: /* file */ typingsJapgolly.reactFilepond.mod.File, t1: /* progress */ scala.Double) => onaddfileprogress(t0, t1).runNow()))
    if (onaddfilestart != null) __obj.updateDynamic("onaddfilestart")(js.Any.fromFunction1((t0: /* file */ typingsJapgolly.reactFilepond.mod.File) => onaddfilestart(t0).runNow()))
    if (onerror != null) __obj.updateDynamic("onerror")(js.Any.fromFunction3((t0: /* error */ typingsJapgolly.reactFilepond.mod.FilePondErrorDescription, t1: /* file */ js.UndefOr[typingsJapgolly.reactFilepond.mod.File], t2: /* status */ js.UndefOr[js.Any]) => onerror(t0, t1, t2).runNow()))
    oninit.foreach(p => __obj.updateDynamic("oninit")(p.toJsFn))
    if (onpreparefile != null) __obj.updateDynamic("onpreparefile")(js.Any.fromFunction2((t0: /* file */ typingsJapgolly.reactFilepond.mod.File, t1: /* output */ js.Any) => onpreparefile(t0, t1).runNow()))
    if (onprocessfile != null) __obj.updateDynamic("onprocessfile")(js.Any.fromFunction2((t0: /* error */ typingsJapgolly.reactFilepond.mod.FilePondErrorDescription, t1: /* file */ typingsJapgolly.reactFilepond.mod.File) => onprocessfile(t0, t1).runNow()))
    if (onprocessfileabort != null) __obj.updateDynamic("onprocessfileabort")(js.Any.fromFunction1((t0: /* file */ typingsJapgolly.reactFilepond.mod.File) => onprocessfileabort(t0).runNow()))
    if (onprocessfileprogress != null) __obj.updateDynamic("onprocessfileprogress")(js.Any.fromFunction2((t0: /* file */ typingsJapgolly.reactFilepond.mod.File, t1: /* progress */ scala.Double) => onprocessfileprogress(t0, t1).runNow()))
    if (onprocessfilestart != null) __obj.updateDynamic("onprocessfilestart")(js.Any.fromFunction1((t0: /* file */ typingsJapgolly.reactFilepond.mod.File) => onprocessfilestart(t0).runNow()))
    if (onprocessfileundo != null) __obj.updateDynamic("onprocessfileundo")(js.Any.fromFunction1((t0: /* file */ typingsJapgolly.reactFilepond.mod.File) => onprocessfileundo(t0).runNow()))
    if (onremovefile != null) __obj.updateDynamic("onremovefile")(js.Any.fromFunction1((t0: /* file */ typingsJapgolly.reactFilepond.mod.File) => onremovefile(t0).runNow()))
    if (onupdatefiles != null) __obj.updateDynamic("onupdatefiles")(js.Any.fromFunction1((t0: /* fileItems */ js.Array[typingsJapgolly.reactFilepond.mod.File]) => onupdatefiles(t0).runNow()))
    if (onwarning != null) __obj.updateDynamic("onwarning")(js.Any.fromFunction3((t0: /* error */ js.Any, t1: /* file */ js.UndefOr[typingsJapgolly.reactFilepond.mod.File], t2: /* status */ js.UndefOr[js.Any]) => onwarning(t0, t1, t2).runNow()))
    if (!js.isUndefined(required)) __obj.updateDynamic("required")(required.asInstanceOf[js.Any])
    if (server != null) __obj.updateDynamic("server")(server.asInstanceOf[js.Any])
    __obj.asInstanceOf[FilePondProps]
  }
}

