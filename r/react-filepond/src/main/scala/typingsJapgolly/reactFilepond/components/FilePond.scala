package typingsJapgolly.reactFilepond.components

import japgolly.scalajs.react.Callback
import org.scalajs.dom.Blob
import typingsJapgolly.StBuildingComponent
import typingsJapgolly.filepond.anon.Fetch
import typingsJapgolly.filepond.filepondBooleans.`false`
import typingsJapgolly.filepond.filepondStrings.`compact circle`
import typingsJapgolly.filepond.filepondStrings.`integrated circle`
import typingsJapgolly.filepond.filepondStrings.after
import typingsJapgolly.filepond.filepondStrings.before
import typingsJapgolly.filepond.filepondStrings.circle
import typingsJapgolly.filepond.filepondStrings.compact
import typingsJapgolly.filepond.filepondStrings.integrated
import typingsJapgolly.filepond.mod.ActualFileObject
import typingsJapgolly.filepond.mod.CaptureAttribute
import typingsJapgolly.filepond.mod.FilePondErrorDescription
import typingsJapgolly.filepond.mod.FilePondFile
import typingsJapgolly.filepond.mod.FilePondInitialFile
import typingsJapgolly.reactFilepond.mod.FilePondProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object FilePond {
  
  @JSImport("react-filepond", "FilePond")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[typingsJapgolly.reactFilepond.mod.FilePond] {
    
    inline def acceptedFileTypes(value: js.Array[String]): this.type = set("acceptedFileTypes", value.asInstanceOf[js.Any])
    
    inline def acceptedFileTypesVarargs(value: String*): this.type = set("acceptedFileTypes", js.Array(value*))
    
    inline def allowBrowse(value: Boolean): this.type = set("allowBrowse", value.asInstanceOf[js.Any])
    
    inline def allowDirectoriesOnly(value: Boolean): this.type = set("allowDirectoriesOnly", value.asInstanceOf[js.Any])
    
    inline def allowDrop(value: Boolean): this.type = set("allowDrop", value.asInstanceOf[js.Any])
    
    inline def allowMultiple(value: Boolean): this.type = set("allowMultiple", value.asInstanceOf[js.Any])
    
    inline def allowPaste(value: Boolean): this.type = set("allowPaste", value.asInstanceOf[js.Any])
    
    inline def allowProcess(value: Boolean): this.type = set("allowProcess", value.asInstanceOf[js.Any])
    
    inline def allowReorder(value: Boolean): this.type = set("allowReorder", value.asInstanceOf[js.Any])
    
    inline def allowReplace(value: Boolean): this.type = set("allowReplace", value.asInstanceOf[js.Any])
    
    inline def allowRevert(value: Boolean): this.type = set("allowRevert", value.asInstanceOf[js.Any])
    
    inline def allowSyncAcceptAttribute(value: Boolean): this.type = set("allowSyncAcceptAttribute", value.asInstanceOf[js.Any])
    
    inline def beforeAddFile(value: /* item */ FilePondFile => Boolean | js.Promise[Boolean]): this.type = set("beforeAddFile", js.Any.fromFunction1(value))
    
    inline def beforeDropFile(value: /* file */ FilePondFile | String => Boolean): this.type = set("beforeDropFile", js.Any.fromFunction1(value))
    
    inline def beforeRemoveFile(value: /* item */ FilePondFile => Boolean | js.Promise[Boolean]): this.type = set("beforeRemoveFile", js.Any.fromFunction1(value))
    
    inline def captureMethod(value: CaptureAttribute): this.type = set("captureMethod", value.asInstanceOf[js.Any])
    
    inline def captureMethodNull: this.type = set("captureMethod", null)
    
    inline def checkValidity(value: Boolean): this.type = set("checkValidity", value.asInstanceOf[js.Any])
    
    inline def chunkForce(value: Boolean): this.type = set("chunkForce", value.asInstanceOf[js.Any])
    
    inline def chunkRetryDelays(value: js.Array[Double]): this.type = set("chunkRetryDelays", value.asInstanceOf[js.Any])
    
    inline def chunkRetryDelaysVarargs(value: Double*): this.type = set("chunkRetryDelays", js.Array(value*))
    
    inline def chunkSize(value: Double): this.type = set("chunkSize", value.asInstanceOf[js.Any])
    
    inline def chunkUploads(value: Boolean): this.type = set("chunkUploads", value.asInstanceOf[js.Any])
    
    inline def className(value: String): this.type = set("className", value.asInstanceOf[js.Any])
    
    inline def classNameNull: this.type = set("className", null)
    
    inline def credits(value: `false`): this.type = set("credits", value.asInstanceOf[js.Any])
    
    inline def disabled(value: Boolean): this.type = set("disabled", value.asInstanceOf[js.Any])
    
    inline def dropOnElement(value: Boolean): this.type = set("dropOnElement", value.asInstanceOf[js.Any])
    
    inline def dropOnPage(value: Boolean): this.type = set("dropOnPage", value.asInstanceOf[js.Any])
    
    inline def dropValidation(value: Boolean): this.type = set("dropValidation", value.asInstanceOf[js.Any])
    
    inline def fileSizeBase(value: Double): this.type = set("fileSizeBase", value.asInstanceOf[js.Any])
    
    inline def files(value: js.Array[FilePondInitialFile | ActualFileObject | Blob | String]): this.type = set("files", value.asInstanceOf[js.Any])
    
    inline def filesVarargs(value: (FilePondInitialFile | ActualFileObject | Blob | String)*): this.type = set("files", js.Array(value*))
    
    inline def forceRevert(value: Boolean): this.type = set("forceRevert", value.asInstanceOf[js.Any])
    
    inline def iconDone(value: String): this.type = set("iconDone", value.asInstanceOf[js.Any])
    
    inline def iconProcess(value: String): this.type = set("iconProcess", value.asInstanceOf[js.Any])
    
    inline def iconRemove(value: String): this.type = set("iconRemove", value.asInstanceOf[js.Any])
    
    inline def iconRetry(value: String): this.type = set("iconRetry", value.asInstanceOf[js.Any])
    
    inline def iconUndo(value: String): this.type = set("iconUndo", value.asInstanceOf[js.Any])
    
    inline def id(value: String): this.type = set("id", value.asInstanceOf[js.Any])
    
    inline def idNull: this.type = set("id", null)
    
    inline def ignoredFiles(value: js.Array[String]): this.type = set("ignoredFiles", value.asInstanceOf[js.Any])
    
    inline def ignoredFilesVarargs(value: String*): this.type = set("ignoredFiles", js.Array(value*))
    
    inline def instantUpload(value: Boolean): this.type = set("instantUpload", value.asInstanceOf[js.Any])
    
    inline def itemInsertInterval(value: Double): this.type = set("itemInsertInterval", value.asInstanceOf[js.Any])
    
    inline def itemInsertLocation(value: before | after | (js.Function2[/* a */ FilePondFile, /* b */ FilePondFile, Double])): this.type = set("itemInsertLocation", value.asInstanceOf[js.Any])
    
    inline def itemInsertLocationFreedom(value: Boolean): this.type = set("itemInsertLocationFreedom", value.asInstanceOf[js.Any])
    
    inline def itemInsertLocationFunction2(value: (/* a */ FilePondFile, /* b */ FilePondFile) => Double): this.type = set("itemInsertLocation", js.Any.fromFunction2(value))
    
    inline def labelButtonAbortItemLoad(value: String): this.type = set("labelButtonAbortItemLoad", value.asInstanceOf[js.Any])
    
    inline def labelButtonAbortItemProcessing(value: String): this.type = set("labelButtonAbortItemProcessing", value.asInstanceOf[js.Any])
    
    inline def labelButtonProcessItem(value: String): this.type = set("labelButtonProcessItem", value.asInstanceOf[js.Any])
    
    inline def labelButtonRemoveItem(value: String): this.type = set("labelButtonRemoveItem", value.asInstanceOf[js.Any])
    
    inline def labelButtonRetryItemLoad(value: String): this.type = set("labelButtonRetryItemLoad", value.asInstanceOf[js.Any])
    
    inline def labelButtonRetryItemProcessing(value: String): this.type = set("labelButtonRetryItemProcessing", value.asInstanceOf[js.Any])
    
    inline def labelButtonUndoItemProcessing(value: String): this.type = set("labelButtonUndoItemProcessing", value.asInstanceOf[js.Any])
    
    inline def labelDecimalSeparator(value: String): this.type = set("labelDecimalSeparator", value.asInstanceOf[js.Any])
    
    inline def labelFileAdded(value: String): this.type = set("labelFileAdded", value.asInstanceOf[js.Any])
    
    inline def labelFileCountPlural(value: String): this.type = set("labelFileCountPlural", value.asInstanceOf[js.Any])
    
    inline def labelFileCountSingular(value: String): this.type = set("labelFileCountSingular", value.asInstanceOf[js.Any])
    
    inline def labelFileLoadError(value: (js.Function1[/* error */ Any, String]) | String): this.type = set("labelFileLoadError", value.asInstanceOf[js.Any])
    
    inline def labelFileLoadErrorFunction1(value: /* error */ Any => String): this.type = set("labelFileLoadError", js.Any.fromFunction1(value))
    
    inline def labelFileLoading(value: String): this.type = set("labelFileLoading", value.asInstanceOf[js.Any])
    
    inline def labelFileProcessing(value: String): this.type = set("labelFileProcessing", value.asInstanceOf[js.Any])
    
    inline def labelFileProcessingAborted(value: String): this.type = set("labelFileProcessingAborted", value.asInstanceOf[js.Any])
    
    inline def labelFileProcessingComplete(value: String): this.type = set("labelFileProcessingComplete", value.asInstanceOf[js.Any])
    
    inline def labelFileProcessingError(value: (js.Function1[/* error */ Any, String]) | String): this.type = set("labelFileProcessingError", value.asInstanceOf[js.Any])
    
    inline def labelFileProcessingErrorFunction1(value: /* error */ Any => String): this.type = set("labelFileProcessingError", js.Any.fromFunction1(value))
    
    inline def labelFileProcessingRevertError(value: (js.Function1[/* error */ Any, String]) | String): this.type = set("labelFileProcessingRevertError", value.asInstanceOf[js.Any])
    
    inline def labelFileProcessingRevertErrorFunction1(value: /* error */ Any => String): this.type = set("labelFileProcessingRevertError", js.Any.fromFunction1(value))
    
    inline def labelFileRemoveError(value: (js.Function1[/* error */ Any, String]) | String): this.type = set("labelFileRemoveError", value.asInstanceOf[js.Any])
    
    inline def labelFileRemoveErrorFunction1(value: /* error */ Any => String): this.type = set("labelFileRemoveError", js.Any.fromFunction1(value))
    
    inline def labelFileRemoved(value: String): this.type = set("labelFileRemoved", value.asInstanceOf[js.Any])
    
    inline def labelFileSizeNotAvailable(value: String): this.type = set("labelFileSizeNotAvailable", value.asInstanceOf[js.Any])
    
    inline def labelFileWaitingForSize(value: String): this.type = set("labelFileWaitingForSize", value.asInstanceOf[js.Any])
    
    inline def labelIdle(value: String): this.type = set("labelIdle", value.asInstanceOf[js.Any])
    
    inline def labelInvalidField(value: String): this.type = set("labelInvalidField", value.asInstanceOf[js.Any])
    
    inline def labelTapToCancel(value: String): this.type = set("labelTapToCancel", value.asInstanceOf[js.Any])
    
    inline def labelTapToRetry(value: String): this.type = set("labelTapToRetry", value.asInstanceOf[js.Any])
    
    inline def labelTapToUndo(value: String): this.type = set("labelTapToUndo", value.asInstanceOf[js.Any])
    
    inline def labelThousandsSeparator(value: String): this.type = set("labelThousandsSeparator", value.asInstanceOf[js.Any])
    
    inline def maxFiles(value: Double): this.type = set("maxFiles", value.asInstanceOf[js.Any])
    
    inline def maxFilesNull: this.type = set("maxFiles", null)
    
    inline def maxParallelUploads(value: Double): this.type = set("maxParallelUploads", value.asInstanceOf[js.Any])
    
    inline def name(value: String): this.type = set("name", value.asInstanceOf[js.Any])
    
    inline def onactivatefile(value: /* file */ FilePondFile => Callback): this.type = set("onactivatefile", js.Any.fromFunction1((t0: /* file */ FilePondFile) => value(t0).runNow()))
    
    inline def onaddfile(value: (/* error */ FilePondErrorDescription | Null, /* file */ FilePondFile) => Callback): this.type = set("onaddfile", js.Any.fromFunction2((t0: /* error */ FilePondErrorDescription | Null, t1: /* file */ FilePondFile) => (value(t0, t1)).runNow()))
    
    inline def onaddfileprogress(value: (/* file */ FilePondFile, /* progress */ Double) => Callback): this.type = set("onaddfileprogress", js.Any.fromFunction2((t0: /* file */ FilePondFile, t1: /* progress */ Double) => (value(t0, t1)).runNow()))
    
    inline def onaddfilestart(value: /* file */ FilePondFile => Callback): this.type = set("onaddfilestart", js.Any.fromFunction1((t0: /* file */ FilePondFile) => value(t0).runNow()))
    
    inline def onerror(
      value: (/* error */ FilePondErrorDescription, /* file */ js.UndefOr[FilePondFile], /* status */ js.UndefOr[Any]) => Callback
    ): this.type = set("onerror", js.Any.fromFunction3((t0: /* error */ FilePondErrorDescription, t1: /* file */ js.UndefOr[FilePondFile], t2: /* status */ js.UndefOr[Any]) => (value(t0, t1, t2)).runNow()))
    
    inline def oninit(value: Callback): this.type = set("oninit", value.toJsFn)
    
    inline def onpreparefile(value: (/* file */ FilePondFile, /* output */ Any) => Callback): this.type = set("onpreparefile", js.Any.fromFunction2((t0: /* file */ FilePondFile, t1: /* output */ Any) => (value(t0, t1)).runNow()))
    
    inline def onprocessfile(value: (/* error */ FilePondErrorDescription | Null, /* file */ FilePondFile) => Callback): this.type = set("onprocessfile", js.Any.fromFunction2((t0: /* error */ FilePondErrorDescription | Null, t1: /* file */ FilePondFile) => (value(t0, t1)).runNow()))
    
    inline def onprocessfileabort(value: /* file */ FilePondFile => Callback): this.type = set("onprocessfileabort", js.Any.fromFunction1((t0: /* file */ FilePondFile) => value(t0).runNow()))
    
    inline def onprocessfileprogress(value: (/* file */ FilePondFile, /* progress */ Double) => Callback): this.type = set("onprocessfileprogress", js.Any.fromFunction2((t0: /* file */ FilePondFile, t1: /* progress */ Double) => (value(t0, t1)).runNow()))
    
    inline def onprocessfilerevert(value: /* file */ FilePondFile => Callback): this.type = set("onprocessfilerevert", js.Any.fromFunction1((t0: /* file */ FilePondFile) => value(t0).runNow()))
    
    inline def onprocessfiles(value: Callback): this.type = set("onprocessfiles", value.toJsFn)
    
    inline def onprocessfilestart(value: /* file */ FilePondFile => Callback): this.type = set("onprocessfilestart", js.Any.fromFunction1((t0: /* file */ FilePondFile) => value(t0).runNow()))
    
    inline def onremovefile(value: (/* error */ FilePondErrorDescription | Null, /* file */ FilePondFile) => Callback): this.type = set("onremovefile", js.Any.fromFunction2((t0: /* error */ FilePondErrorDescription | Null, t1: /* file */ FilePondFile) => (value(t0, t1)).runNow()))
    
    inline def onreorderfiles(value: /* files */ js.Array[FilePondFile] => Callback): this.type = set("onreorderfiles", js.Any.fromFunction1((t0: /* files */ js.Array[FilePondFile]) => value(t0).runNow()))
    
    inline def onupdatefiles(value: /* files */ js.Array[FilePondFile] => Callback): this.type = set("onupdatefiles", js.Any.fromFunction1((t0: /* files */ js.Array[FilePondFile]) => value(t0).runNow()))
    
    inline def onwarning(
      value: (/* error */ Any, /* file */ js.UndefOr[FilePondFile], /* status */ js.UndefOr[Any]) => Callback
    ): this.type = set("onwarning", js.Any.fromFunction3((t0: /* error */ Any, t1: /* file */ js.UndefOr[FilePondFile], t2: /* status */ js.UndefOr[Any]) => (value(t0, t1, t2)).runNow()))
    
    inline def required(value: Boolean): this.type = set("required", value.asInstanceOf[js.Any])
    
    inline def server(value: String | Fetch): this.type = set("server", value.asInstanceOf[js.Any])
    
    inline def serverNull: this.type = set("server", null)
    
    inline def storeAsFile(value: Boolean): this.type = set("storeAsFile", value.asInstanceOf[js.Any])
    
    inline def styleButtonProcessItemPosition(value: String): this.type = set("styleButtonProcessItemPosition", value.asInstanceOf[js.Any])
    
    inline def styleButtonRemoveItemAlign(value: Boolean): this.type = set("styleButtonRemoveItemAlign", value.asInstanceOf[js.Any])
    
    inline def styleButtonRemoveItemPosition(value: String): this.type = set("styleButtonRemoveItemPosition", value.asInstanceOf[js.Any])
    
    inline def styleItemPanelAspectRatio(value: String): this.type = set("styleItemPanelAspectRatio", value.asInstanceOf[js.Any])
    
    inline def styleItemPanelAspectRatioNull: this.type = set("styleItemPanelAspectRatio", null)
    
    inline def styleLoadIndicatorPosition(value: String): this.type = set("styleLoadIndicatorPosition", value.asInstanceOf[js.Any])
    
    inline def stylePanelAspectRatio(value: String): this.type = set("stylePanelAspectRatio", value.asInstanceOf[js.Any])
    
    inline def stylePanelAspectRatioNull: this.type = set("stylePanelAspectRatio", null)
    
    inline def stylePanelLayout(value: integrated | compact | circle | (`integrated circle`) | (`compact circle`)): this.type = set("stylePanelLayout", value.asInstanceOf[js.Any])
    
    inline def stylePanelLayoutNull: this.type = set("stylePanelLayout", null)
    
    inline def styleProgressIndicatorPosition(value: String): this.type = set("styleProgressIndicatorPosition", value.asInstanceOf[js.Any])
  }
  
  implicit def make(companion: FilePond.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: FilePondProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
