package typingsJapgolly.reactFilepond

import typingsJapgolly.filepond.mod.FilePondOptions
import typingsJapgolly.react.mod.Component
import typingsJapgolly.std.Exclude
import typingsJapgolly.std.Pick
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("react-filepond", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped {[ P in std.Exclude<keyof filepond.filepond.FilePond, react-filepond.react-filepond.FilteredMethods> ]: filepond.filepond.FilePond[P]} */ @JSImport("react-filepond", "FilePond")
  @js.native
  open class FilePond protected ()
    extends Component[FilePondProps, js.Object, Any] {
    def this(props: FilePondProps) = this()
    /**
      * @deprecated
      * @see https://reactjs.org/docs/legacy-context.html
      */
    def this(props: FilePondProps, context: Any) = this()
  }
  
  @JSImport("react-filepond", "FileStatus")
  @js.native
  object FileStatus extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typingsJapgolly.filepond.mod.FileStatus & Double] = js.native
    
    /* 2 */ val IDLE: typingsJapgolly.filepond.mod.FileStatus.IDLE & Double = js.native
    
    /* 1 */ val INIT: typingsJapgolly.filepond.mod.FileStatus.INIT & Double = js.native
    
    /* 7 */ val LOADING: typingsJapgolly.filepond.mod.FileStatus.LOADING & Double = js.native
    
    /* 8 */ val LOAD_ERROR: typingsJapgolly.filepond.mod.FileStatus.LOAD_ERROR & Double = js.native
    
    /* 3 */ val PROCESSING: typingsJapgolly.filepond.mod.FileStatus.PROCESSING & Double = js.native
    
    /* 5 */ val PROCESSING_COMPLETE: typingsJapgolly.filepond.mod.FileStatus.PROCESSING_COMPLETE & Double = js.native
    
    /* 6 */ val PROCESSING_ERROR: typingsJapgolly.filepond.mod.FileStatus.PROCESSING_ERROR & Double = js.native
    
    /* 9 */ val PROCESSING_QUEUED: typingsJapgolly.filepond.mod.FileStatus.PROCESSING_QUEUED & Double = js.native
    
    /* 10 */ val PROCESSING_REVERT_ERROR: typingsJapgolly.filepond.mod.FileStatus.PROCESSING_REVERT_ERROR & Double = js.native
  }
  
  inline def registerPlugin(plugins: Any*): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("registerPlugin")(plugins.asInstanceOf[Seq[js.Any]]*).asInstanceOf[Unit]
  
  trait FilePondProps
    extends StObject
       with FilePondOptions {
    
    // (Temporarily) changed to old definition, see discussion at <https://github.com/pqina/react-filepond/pull/151>
    // acceptedFileTypes?: React.InputHTMLAttributes<any>['accept'];
    var acceptedFileTypes: js.UndefOr[js.Array[String]] = js.undefined
  }
  object FilePondProps {
    
    inline def apply(): FilePondProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[FilePondProps]
    }
    
    extension [Self <: FilePondProps](x: Self) {
      
      inline def setAcceptedFileTypes(value: js.Array[String]): Self = StObject.set(x, "acceptedFileTypes", value.asInstanceOf[js.Any])
      
      inline def setAcceptedFileTypesUndefined: Self = StObject.set(x, "acceptedFileTypes", js.undefined)
      
      inline def setAcceptedFileTypesVarargs(value: String*): Self = StObject.set(x, "acceptedFileTypes", js.Array(value*))
    }
  }
  
  /*
  According to react-filepond implementation, every FilePond instance key is cloned except some from an array, see
  <https://github.com/pqina/react-filepond/blob/7deaee287dd24614706f2401dcf39df6207ef5ef/lib/index.js#L13> and
  <https://github.com/pqina/react-filepond/blob/7deaee287dd24614706f2401dcf39df6207ef5ef/lib/index.js#L56-L61>.
  Exluded keys as of 2020-08-27:
  */
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.reactFilepond.reactFilepondStrings.setOptions
    - typingsJapgolly.reactFilepond.reactFilepondStrings.on
    - typingsJapgolly.reactFilepond.reactFilepondStrings.off
    - typingsJapgolly.reactFilepond.reactFilepondStrings.onOnce
    - typingsJapgolly.reactFilepond.reactFilepondStrings.appendTo
    - typingsJapgolly.reactFilepond.reactFilepondStrings.insertAfter
    - typingsJapgolly.reactFilepond.reactFilepondStrings.insertBefore
    - typingsJapgolly.reactFilepond.reactFilepondStrings.isAttachedTo
    - typingsJapgolly.reactFilepond.reactFilepondStrings.replaceElement
    - typingsJapgolly.reactFilepond.reactFilepondStrings.restoreElement
    - typingsJapgolly.reactFilepond.reactFilepondStrings.destroy
    - typingsJapgolly.reactFilepond.reactFilepondStrings.dropOnPage
    - typingsJapgolly.reactFilepond.reactFilepondStrings.dropOnElement
    - typingsJapgolly.reactFilepond.reactFilepondStrings.dropValidation
    - typingsJapgolly.reactFilepond.reactFilepondStrings.ignoredFiles
    - typingsJapgolly.reactFilepond.reactFilepondStrings.instantUpload
    - typingsJapgolly.reactFilepond.reactFilepondStrings.maxParallelUploads
    - typingsJapgolly.reactFilepond.reactFilepondStrings.server
    - typingsJapgolly.reactFilepond.reactFilepondStrings.chunkUploads
    - typingsJapgolly.reactFilepond.reactFilepondStrings.chunkForce
    - typingsJapgolly.reactFilepond.reactFilepondStrings.chunkSize
    - typingsJapgolly.reactFilepond.reactFilepondStrings.chunkRetryDelays
    - typingsJapgolly.reactFilepond.reactFilepondStrings.files
    - typingsJapgolly.reactFilepond.reactFilepondStrings.labelDecimalSeparator
    - typingsJapgolly.reactFilepond.reactFilepondStrings.labelThousandsSeparator
    - typingsJapgolly.reactFilepond.reactFilepondStrings.labelIdle
    - typingsJapgolly.reactFilepond.reactFilepondStrings.labelInvalidField
    - typingsJapgolly.reactFilepond.reactFilepondStrings.labelFileWaitingForSize
    - typingsJapgolly.reactFilepond.reactFilepondStrings.labelFileSizeNotAvailable
    - typingsJapgolly.reactFilepond.reactFilepondStrings.labelFileCountSingular
    - typingsJapgolly.reactFilepond.reactFilepondStrings.labelFileCountPlural
    - typingsJapgolly.reactFilepond.reactFilepondStrings.labelFileLoading
    - typingsJapgolly.reactFilepond.reactFilepondStrings.labelFileAdded
    - typingsJapgolly.reactFilepond.reactFilepondStrings.labelFileLoadError
    - typingsJapgolly.reactFilepond.reactFilepondStrings.labelFileRemoved
    - typingsJapgolly.reactFilepond.reactFilepondStrings.labelFileRemoveError
    - typingsJapgolly.reactFilepond.reactFilepondStrings.labelFileProcessing
    - typingsJapgolly.reactFilepond.reactFilepondStrings.labelFileProcessingComplete
    - typingsJapgolly.reactFilepond.reactFilepondStrings.labelFileProcessingAborted
    - typingsJapgolly.reactFilepond.reactFilepondStrings.labelFileProcessingError
    - typingsJapgolly.reactFilepond.reactFilepondStrings.labelFileProcessingRevertError
    - typingsJapgolly.reactFilepond.reactFilepondStrings.labelTapToCancel
    - typingsJapgolly.reactFilepond.reactFilepondStrings.labelTapToRetry
    - typingsJapgolly.reactFilepond.reactFilepondStrings.labelTapToUndo
    - typingsJapgolly.reactFilepond.reactFilepondStrings.labelButtonRemoveItem
    - typingsJapgolly.reactFilepond.reactFilepondStrings.labelButtonAbortItemLoad
    - typingsJapgolly.reactFilepond.reactFilepondStrings.labelButtonRetryItemLoad
    - typingsJapgolly.reactFilepond.reactFilepondStrings.labelButtonAbortItemProcessing
    - typingsJapgolly.reactFilepond.reactFilepondStrings.labelButtonUndoItemProcessing
    - typingsJapgolly.reactFilepond.reactFilepondStrings.labelButtonRetryItemProcessing
    - typingsJapgolly.reactFilepond.reactFilepondStrings.labelButtonProcessItem
    - typingsJapgolly.reactFilepond.reactFilepondStrings.iconRemove
    - typingsJapgolly.reactFilepond.reactFilepondStrings.iconProcess
    - typingsJapgolly.reactFilepond.reactFilepondStrings.iconRetry
    - typingsJapgolly.reactFilepond.reactFilepondStrings.iconUndo
    - typingsJapgolly.reactFilepond.reactFilepondStrings.iconDone
    - typingsJapgolly.reactFilepond.reactFilepondStrings.oninit
    - typingsJapgolly.reactFilepond.reactFilepondStrings.onwarning
    - typingsJapgolly.reactFilepond.reactFilepondStrings.onerror
    - typingsJapgolly.reactFilepond.reactFilepondStrings.onaddfilestart
    - typingsJapgolly.reactFilepond.reactFilepondStrings.onaddfileprogress
    - typingsJapgolly.reactFilepond.reactFilepondStrings.onaddfile
    - typingsJapgolly.reactFilepond.reactFilepondStrings.onprocessfilestart
    - typingsJapgolly.reactFilepond.reactFilepondStrings.onprocessfileprogress
    - typingsJapgolly.reactFilepond.reactFilepondStrings.onprocessfileabort
    - typingsJapgolly.reactFilepond.reactFilepondStrings.onprocessfilerevert
    - typingsJapgolly.reactFilepond.reactFilepondStrings.onprocessfile
    - typingsJapgolly.reactFilepond.reactFilepondStrings.onprocessfiles
    - typingsJapgolly.reactFilepond.reactFilepondStrings.onremovefile
    - typingsJapgolly.reactFilepond.reactFilepondStrings.onpreparefile
    - typingsJapgolly.reactFilepond.reactFilepondStrings.onupdatefiles
    - typingsJapgolly.reactFilepond.reactFilepondStrings.onactivatefile
    - typingsJapgolly.reactFilepond.reactFilepondStrings.onreorderfiles
    - typingsJapgolly.reactFilepond.reactFilepondStrings.beforeDropFile
    - typingsJapgolly.reactFilepond.reactFilepondStrings.beforeAddFile
    - typingsJapgolly.reactFilepond.reactFilepondStrings.beforeRemoveFile
    - typingsJapgolly.reactFilepond.reactFilepondStrings.stylePanelLayout
    - typingsJapgolly.reactFilepond.reactFilepondStrings.stylePanelAspectRatio
    - typingsJapgolly.reactFilepond.reactFilepondStrings.styleItemPanelAspectRatio
    - typingsJapgolly.reactFilepond.reactFilepondStrings.styleButtonRemoveItemPosition
    - typingsJapgolly.reactFilepond.reactFilepondStrings.styleButtonProcessItemPosition
    - typingsJapgolly.reactFilepond.reactFilepondStrings.styleLoadIndicatorPosition
    - typingsJapgolly.reactFilepond.reactFilepondStrings.styleProgressIndicatorPosition
    - typingsJapgolly.reactFilepond.reactFilepondStrings.styleButtonRemoveItemAlign
    - typingsJapgolly.reactFilepond.reactFilepondStrings.id
    - typingsJapgolly.reactFilepond.reactFilepondStrings.name
    - typingsJapgolly.reactFilepond.reactFilepondStrings.className
    - typingsJapgolly.reactFilepond.reactFilepondStrings.required
    - typingsJapgolly.reactFilepond.reactFilepondStrings.disabled
    - typingsJapgolly.reactFilepond.reactFilepondStrings.captureMethod
    - typingsJapgolly.reactFilepond.reactFilepondStrings.allowSyncAcceptAttribute
    - typingsJapgolly.reactFilepond.reactFilepondStrings.allowDrop
    - typingsJapgolly.reactFilepond.reactFilepondStrings.allowBrowse
    - typingsJapgolly.reactFilepond.reactFilepondStrings.allowPaste
    - typingsJapgolly.reactFilepond.reactFilepondStrings.allowMultiple
    - typingsJapgolly.reactFilepond.reactFilepondStrings.allowReplace
    - typingsJapgolly.reactFilepond.reactFilepondStrings.allowRevert
    - typingsJapgolly.reactFilepond.reactFilepondStrings.allowProcess
    - typingsJapgolly.reactFilepond.reactFilepondStrings.allowReorder
    - typingsJapgolly.reactFilepond.reactFilepondStrings.allowDirectoriesOnly
    - typingsJapgolly.reactFilepond.reactFilepondStrings.forceRevert
    - typingsJapgolly.reactFilepond.reactFilepondStrings.maxFiles
    - typingsJapgolly.reactFilepond.reactFilepondStrings.checkValidity
    - typingsJapgolly.reactFilepond.reactFilepondStrings.itemInsertLocationFreedom
    - typingsJapgolly.reactFilepond.reactFilepondStrings.itemInsertLocation
    - typingsJapgolly.reactFilepond.reactFilepondStrings.itemInsertInterval
    - typingsJapgolly.reactFilepond.reactFilepondStrings.fileSizeBase
    - typingsJapgolly.reactFilepond.reactFilepondStrings.storeAsFile
    - typingsJapgolly.reactFilepond.reactFilepondStrings.credits
  */
  trait FilteredMethods extends StObject
  
  // Copy of Omit to retain TypeScript 3.4 compatibility (Omit is a built-in since TS 3.5)
  type Omit[T, K /* <: /* keyof any */ String */] = Pick[T, Exclude[/* keyof T */ String, K]]
}
