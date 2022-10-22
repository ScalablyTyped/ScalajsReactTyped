package typingsJapgolly.flowjs

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import org.scalajs.dom.Event
import org.scalajs.dom.File
import org.scalajs.dom.HTMLElement
import org.scalajs.dom.XMLHttpRequest
import typingsJapgolly.flowjs.flowjsBooleans.`false`
import typingsJapgolly.flowjs.flowjsInts.`0`
import typingsJapgolly.flowjs.flowjsInts.`1`
import typingsJapgolly.flowjs.flowjsInts.`2`
import typingsJapgolly.flowjs.flowjsStrings.catchAll
import typingsJapgolly.flowjs.flowjsStrings.complete
import typingsJapgolly.flowjs.flowjsStrings.error
import typingsJapgolly.flowjs.flowjsStrings.fileAdded
import typingsJapgolly.flowjs.flowjsStrings.fileError
import typingsJapgolly.flowjs.flowjsStrings.fileProgress
import typingsJapgolly.flowjs.flowjsStrings.fileRemoved
import typingsJapgolly.flowjs.flowjsStrings.fileRetry
import typingsJapgolly.flowjs.flowjsStrings.fileSuccess
import typingsJapgolly.flowjs.flowjsStrings.filesAdded
import typingsJapgolly.flowjs.flowjsStrings.filesSubmitted
import typingsJapgolly.flowjs.flowjsStrings.progress
import typingsJapgolly.flowjs.flowjsStrings.uploadStart
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("flowjs", "Flow")
  @js.native
  open class Flow () extends StObject {
    def this(options: FlowOptions) = this()
    
    def addFile(file: File): Unit = js.native
    
    def assignBrowse(domNodes: js.Array[HTMLElement]): Unit = js.native
    def assignBrowse(domNodes: js.Array[HTMLElement], isDirectory: Boolean): Unit = js.native
    def assignBrowse(domNodes: js.Array[HTMLElement], isDirectory: Boolean, singleFile: Boolean): Unit = js.native
    def assignBrowse(domNodes: js.Array[HTMLElement], isDirectory: Boolean, singleFile: Boolean, attributes: js.Object): Unit = js.native
    def assignBrowse(domNodes: js.Array[HTMLElement], isDirectory: Boolean, singleFile: Unit, attributes: js.Object): Unit = js.native
    def assignBrowse(domNodes: js.Array[HTMLElement], isDirectory: Unit, singleFile: Boolean): Unit = js.native
    def assignBrowse(domNodes: js.Array[HTMLElement], isDirectory: Unit, singleFile: Boolean, attributes: js.Object): Unit = js.native
    def assignBrowse(domNodes: js.Array[HTMLElement], isDirectory: Unit, singleFile: Unit, attributes: js.Object): Unit = js.native
    
    def assignDrop(node: js.Array[HTMLElement]): Unit = js.native
    def assignDrop(node: HTMLElement): Unit = js.native
    
    def cancel(): Unit = js.native
    
    var files: js.Array[FlowFile] = js.native
    
    def getFromUniqueIdentifier(uniqueIdentifier: String): FlowFile = js.native
    
    def getSize(): Double = js.native
    
    def isUploading(): Boolean = js.native
    
    def off(): Unit = js.native
    def off(event: Unit, callback: js.Function0[Unit]): Unit = js.native
    def off(event: EventName): Unit = js.native
    def off(event: EventName, callback: js.Function0[Unit]): Unit = js.native
    
    @JSName("on")
    def on_catchAll(event: catchAll, callback: js.Function1[/* args */ CatchAllCallbackArguments, Unit]): Unit = js.native
    @JSName("on")
    def on_complete(event: complete, callback: js.Function1[/* args */ CompleteCallbackArguments, Unit]): Unit = js.native
    @JSName("on")
    def on_error(event: error, callback: js.Function1[/* args */ ErrorCallbackArguments, Unit]): Unit = js.native
    @JSName("on")
    def on_fileAdded(event: fileAdded, callback: js.Function1[/* args */ FileAddedCallbackArguments, Unit]): Unit = js.native
    @JSName("on")
    def on_fileError(event: fileError, callback: js.Function1[/* args */ FileErrorCallbackArguments, Unit]): Unit = js.native
    @JSName("on")
    def on_fileProgress(event: fileProgress, callback: js.Function1[/* args */ FileProgressCallbackArguments, Unit]): Unit = js.native
    @JSName("on")
    def on_fileRemoved(event: fileRemoved, callback: js.Function1[/* args */ FileRemovedCallbackArguments, Unit]): Unit = js.native
    @JSName("on")
    def on_fileRetry(event: fileRetry, callback: js.Function1[/* args */ FileRetryCallbackArguments, Unit]): Unit = js.native
    @JSName("on")
    def on_fileSuccess(event: fileSuccess, callback: js.Function1[/* args */ FileSuccessCallbackArguments, Unit]): Unit = js.native
    @JSName("on")
    def on_filesAdded(event: filesAdded, callback: js.Function1[/* args */ FilesAddedCallbackArguments, Unit]): Unit = js.native
    @JSName("on")
    def on_filesSubmitted(event: filesSubmitted, callback: js.Function1[/* args */ FilesSubmittedCallbackArguments, Unit]): Unit = js.native
    @JSName("on")
    def on_progress(event: progress, callback: js.Function1[/* args */ ProgressCallbackArguments, Unit]): Unit = js.native
    @JSName("on")
    def on_uploadStart(event: uploadStart, callback: js.Function1[/* args */ UploadStartCallbackArguments, Unit]): Unit = js.native
    
    var opts: FlowOptions = js.native
    
    def pause(): Unit = js.native
    
    def progress(): Double = js.native
    
    def removeFile(file: FlowFile): Unit = js.native
    
    def resume(): Unit = js.native
    
    def sizeUploaded(): Double = js.native
    
    var support: Boolean = js.native
    
    var supportDirectory: Boolean = js.native
    
    def timeRemaining(): Double = js.native
    
    def unAssignDrop(node: js.Array[HTMLElement]): Unit = js.native
    def unAssignDrop(node: HTMLElement): Unit = js.native
    
    def upload(): Unit = js.native
  }
  
  type CatchAllCallbackArguments = js.Array[Event]
  
  type CompleteCallbackArguments = js.Array[Any]
  
  type ErrorCallbackArguments = js.Tuple3[String, FlowFile, FlowChunk]
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.flowjs.flowjsStrings.fileSuccess
    - typingsJapgolly.flowjs.flowjsStrings.fileProgress
    - typingsJapgolly.flowjs.flowjsStrings.fileAdded
    - typingsJapgolly.flowjs.flowjsStrings.filesAdded
    - typingsJapgolly.flowjs.flowjsStrings.filesSubmitted
    - typingsJapgolly.flowjs.flowjsStrings.fileRemoved
    - typingsJapgolly.flowjs.flowjsStrings.fileRetry
    - typingsJapgolly.flowjs.flowjsStrings.fileError
    - typingsJapgolly.flowjs.flowjsStrings.uploadStart
    - typingsJapgolly.flowjs.flowjsStrings.complete
    - typingsJapgolly.flowjs.flowjsStrings.progress
    - typingsJapgolly.flowjs.flowjsStrings.error
    - typingsJapgolly.flowjs.flowjsStrings.catchAll
  */
  trait EventName extends StObject
  
  type FileAddedCallbackArguments = js.Tuple2[FlowFile, Event]
  
  type FileErrorCallbackArguments = js.Tuple3[FlowFile, String, FlowChunk]
  
  type FileProgressCallbackArguments = js.Tuple2[FlowFile, FlowChunk]
  
  type FileRemovedCallbackArguments = js.Array[FlowFile]
  
  type FileRetryCallbackArguments = js.Tuple2[FlowFile, FlowChunk]
  
  type FileSuccessCallbackArguments = js.Tuple3[FlowFile, String, FlowChunk]
  
  type FilesAddedCallbackArguments = js.Tuple2[js.Array[FlowFile], Event]
  
  type FilesSubmittedCallbackArguments = js.Tuple2[js.Array[FlowFile], Event]
  
  trait FlowChunk extends StObject {
    
    def abort(): Unit
    
    var chunkSize: Double
    
    var endByte: Double
    
    var fileObj: FlowFile
    
    var flowObj: Flow
    
    def getParams(): FlowChunkParams
    
    var loaded: Double
    
    def message(): Unit
    
    var offset: Double
    
    var pendingRetry: `false`
    
    var preprocessState: `0` | `1` | `2`
    
    def progress(): Unit
    
    var readState: `0` | `1` | `2`
    
    var retries: Double
    
    def send(): Unit
    
    def sizeUploaded(): Double
    
    var startByte: Double
    
    def status(): Unit
    
    def test(): Unit
    
    var tested: Boolean
    
    var total: Double
    
    var xhr: XMLHttpRequest
  }
  object FlowChunk {
    
    inline def apply(
      abort: Callback,
      chunkSize: Double,
      endByte: Double,
      fileObj: FlowFile,
      flowObj: Flow,
      getParams: CallbackTo[FlowChunkParams],
      loaded: Double,
      message: Callback,
      offset: Double,
      preprocessState: `0` | `1` | `2`,
      progress: Callback,
      readState: `0` | `1` | `2`,
      retries: Double,
      send: Callback,
      sizeUploaded: CallbackTo[Double],
      startByte: Double,
      status: Callback,
      test: Callback,
      tested: Boolean,
      total: Double,
      xhr: XMLHttpRequest
    ): FlowChunk = {
      val __obj = js.Dynamic.literal(abort = abort.toJsFn, chunkSize = chunkSize.asInstanceOf[js.Any], endByte = endByte.asInstanceOf[js.Any], fileObj = fileObj.asInstanceOf[js.Any], flowObj = flowObj.asInstanceOf[js.Any], getParams = getParams.toJsFn, loaded = loaded.asInstanceOf[js.Any], message = message.toJsFn, offset = offset.asInstanceOf[js.Any], pendingRetry = false, preprocessState = preprocessState.asInstanceOf[js.Any], progress = progress.toJsFn, readState = readState.asInstanceOf[js.Any], retries = retries.asInstanceOf[js.Any], send = send.toJsFn, sizeUploaded = sizeUploaded.toJsFn, startByte = startByte.asInstanceOf[js.Any], status = status.toJsFn, test = test.toJsFn, tested = tested.asInstanceOf[js.Any], total = total.asInstanceOf[js.Any], xhr = xhr.asInstanceOf[js.Any])
      __obj.asInstanceOf[FlowChunk]
    }
    
    extension [Self <: FlowChunk](x: Self) {
      
      inline def setAbort(value: Callback): Self = StObject.set(x, "abort", value.toJsFn)
      
      inline def setChunkSize(value: Double): Self = StObject.set(x, "chunkSize", value.asInstanceOf[js.Any])
      
      inline def setEndByte(value: Double): Self = StObject.set(x, "endByte", value.asInstanceOf[js.Any])
      
      inline def setFileObj(value: FlowFile): Self = StObject.set(x, "fileObj", value.asInstanceOf[js.Any])
      
      inline def setFlowObj(value: Flow): Self = StObject.set(x, "flowObj", value.asInstanceOf[js.Any])
      
      inline def setGetParams(value: CallbackTo[FlowChunkParams]): Self = StObject.set(x, "getParams", value.toJsFn)
      
      inline def setLoaded(value: Double): Self = StObject.set(x, "loaded", value.asInstanceOf[js.Any])
      
      inline def setMessage(value: Callback): Self = StObject.set(x, "message", value.toJsFn)
      
      inline def setOffset(value: Double): Self = StObject.set(x, "offset", value.asInstanceOf[js.Any])
      
      inline def setPendingRetry(value: `false`): Self = StObject.set(x, "pendingRetry", value.asInstanceOf[js.Any])
      
      inline def setPreprocessState(value: `0` | `1` | `2`): Self = StObject.set(x, "preprocessState", value.asInstanceOf[js.Any])
      
      inline def setProgress(value: Callback): Self = StObject.set(x, "progress", value.toJsFn)
      
      inline def setReadState(value: `0` | `1` | `2`): Self = StObject.set(x, "readState", value.asInstanceOf[js.Any])
      
      inline def setRetries(value: Double): Self = StObject.set(x, "retries", value.asInstanceOf[js.Any])
      
      inline def setSend(value: Callback): Self = StObject.set(x, "send", value.toJsFn)
      
      inline def setSizeUploaded(value: CallbackTo[Double]): Self = StObject.set(x, "sizeUploaded", value.toJsFn)
      
      inline def setStartByte(value: Double): Self = StObject.set(x, "startByte", value.asInstanceOf[js.Any])
      
      inline def setStatus(value: Callback): Self = StObject.set(x, "status", value.toJsFn)
      
      inline def setTest(value: Callback): Self = StObject.set(x, "test", value.toJsFn)
      
      inline def setTested(value: Boolean): Self = StObject.set(x, "tested", value.asInstanceOf[js.Any])
      
      inline def setTotal(value: Double): Self = StObject.set(x, "total", value.asInstanceOf[js.Any])
      
      inline def setXhr(value: XMLHttpRequest): Self = StObject.set(x, "xhr", value.asInstanceOf[js.Any])
    }
  }
  
  trait FlowChunkParams extends StObject {
    
    var flowChunkNumber: Double
    
    var flowChunkSize: Double
    
    var flowCurrentChunkSize: Double
    
    var flowFilename: String
    
    var flowIdentifier: Any
    
    var flowRelativePath: String
    
    var flowTotalChunks: Double
    
    var flowTotalSize: Double
  }
  object FlowChunkParams {
    
    inline def apply(
      flowChunkNumber: Double,
      flowChunkSize: Double,
      flowCurrentChunkSize: Double,
      flowFilename: String,
      flowIdentifier: Any,
      flowRelativePath: String,
      flowTotalChunks: Double,
      flowTotalSize: Double
    ): FlowChunkParams = {
      val __obj = js.Dynamic.literal(flowChunkNumber = flowChunkNumber.asInstanceOf[js.Any], flowChunkSize = flowChunkSize.asInstanceOf[js.Any], flowCurrentChunkSize = flowCurrentChunkSize.asInstanceOf[js.Any], flowFilename = flowFilename.asInstanceOf[js.Any], flowIdentifier = flowIdentifier.asInstanceOf[js.Any], flowRelativePath = flowRelativePath.asInstanceOf[js.Any], flowTotalChunks = flowTotalChunks.asInstanceOf[js.Any], flowTotalSize = flowTotalSize.asInstanceOf[js.Any])
      __obj.asInstanceOf[FlowChunkParams]
    }
    
    extension [Self <: FlowChunkParams](x: Self) {
      
      inline def setFlowChunkNumber(value: Double): Self = StObject.set(x, "flowChunkNumber", value.asInstanceOf[js.Any])
      
      inline def setFlowChunkSize(value: Double): Self = StObject.set(x, "flowChunkSize", value.asInstanceOf[js.Any])
      
      inline def setFlowCurrentChunkSize(value: Double): Self = StObject.set(x, "flowCurrentChunkSize", value.asInstanceOf[js.Any])
      
      inline def setFlowFilename(value: String): Self = StObject.set(x, "flowFilename", value.asInstanceOf[js.Any])
      
      inline def setFlowIdentifier(value: Any): Self = StObject.set(x, "flowIdentifier", value.asInstanceOf[js.Any])
      
      inline def setFlowRelativePath(value: String): Self = StObject.set(x, "flowRelativePath", value.asInstanceOf[js.Any])
      
      inline def setFlowTotalChunks(value: Double): Self = StObject.set(x, "flowTotalChunks", value.asInstanceOf[js.Any])
      
      inline def setFlowTotalSize(value: Double): Self = StObject.set(x, "flowTotalSize", value.asInstanceOf[js.Any])
    }
  }
  
  type FlowEvent = CompleteCallbackArguments | UploadStartCallbackArguments | ProgressCallbackArguments | FileSuccessCallbackArguments | FilesSubmittedCallbackArguments | FileAddedCallbackArguments | FileRetryCallbackArguments | ErrorCallbackArguments | FileRemovedCallbackArguments | FileProgressCallbackArguments | FileErrorCallbackArguments | FilesAddedCallbackArguments | CatchAllCallbackArguments
  
  type FlowEventFromEventName[T /* <: EventName */] = /* import warning: importer.ImportType#apply Failed type conversion: flowjs.flowjs.FlowEventMap[T] */ js.Any
  
  trait FlowEventMap extends StObject {
    
    var catchAll: CatchAllCallbackArguments
    
    var complete: CompleteCallbackArguments
    
    var error: ErrorCallbackArguments
    
    var fileAdded: FileAddedCallbackArguments
    
    var fileError: FileErrorCallbackArguments
    
    var fileProgress: FileProgressCallbackArguments
    
    var fileRemoved: FileRemovedCallbackArguments
    
    var fileRetry: FileRetryCallbackArguments
    
    var fileSuccess: FileSuccessCallbackArguments
    
    var filesAdded: FilesAddedCallbackArguments
    
    var filesSubmitted: FilesSubmittedCallbackArguments
    
    var progress: ProgressCallbackArguments
    
    var uploadStart: UploadStartCallbackArguments
  }
  object FlowEventMap {
    
    inline def apply(
      catchAll: CatchAllCallbackArguments,
      complete: CompleteCallbackArguments,
      error: ErrorCallbackArguments,
      fileAdded: FileAddedCallbackArguments,
      fileError: FileErrorCallbackArguments,
      fileProgress: FileProgressCallbackArguments,
      fileRemoved: FileRemovedCallbackArguments,
      fileRetry: FileRetryCallbackArguments,
      fileSuccess: FileSuccessCallbackArguments,
      filesAdded: FilesAddedCallbackArguments,
      filesSubmitted: FilesSubmittedCallbackArguments,
      progress: ProgressCallbackArguments,
      uploadStart: UploadStartCallbackArguments
    ): FlowEventMap = {
      val __obj = js.Dynamic.literal(catchAll = catchAll.asInstanceOf[js.Any], complete = complete.asInstanceOf[js.Any], error = error.asInstanceOf[js.Any], fileAdded = fileAdded.asInstanceOf[js.Any], fileError = fileError.asInstanceOf[js.Any], fileProgress = fileProgress.asInstanceOf[js.Any], fileRemoved = fileRemoved.asInstanceOf[js.Any], fileRetry = fileRetry.asInstanceOf[js.Any], fileSuccess = fileSuccess.asInstanceOf[js.Any], filesAdded = filesAdded.asInstanceOf[js.Any], filesSubmitted = filesSubmitted.asInstanceOf[js.Any], progress = progress.asInstanceOf[js.Any], uploadStart = uploadStart.asInstanceOf[js.Any])
      __obj.asInstanceOf[FlowEventMap]
    }
    
    extension [Self <: FlowEventMap](x: Self) {
      
      inline def setCatchAll(value: CatchAllCallbackArguments): Self = StObject.set(x, "catchAll", value.asInstanceOf[js.Any])
      
      inline def setCatchAllVarargs(value: Event*): Self = StObject.set(x, "catchAll", js.Array(value*))
      
      inline def setComplete(value: CompleteCallbackArguments): Self = StObject.set(x, "complete", value.asInstanceOf[js.Any])
      
      inline def setCompleteVarargs(value: Any*): Self = StObject.set(x, "complete", js.Array(value*))
      
      inline def setError(value: ErrorCallbackArguments): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
      
      inline def setFileAdded(value: FileAddedCallbackArguments): Self = StObject.set(x, "fileAdded", value.asInstanceOf[js.Any])
      
      inline def setFileError(value: FileErrorCallbackArguments): Self = StObject.set(x, "fileError", value.asInstanceOf[js.Any])
      
      inline def setFileProgress(value: FileProgressCallbackArguments): Self = StObject.set(x, "fileProgress", value.asInstanceOf[js.Any])
      
      inline def setFileRemoved(value: FileRemovedCallbackArguments): Self = StObject.set(x, "fileRemoved", value.asInstanceOf[js.Any])
      
      inline def setFileRemovedVarargs(value: FlowFile*): Self = StObject.set(x, "fileRemoved", js.Array(value*))
      
      inline def setFileRetry(value: FileRetryCallbackArguments): Self = StObject.set(x, "fileRetry", value.asInstanceOf[js.Any])
      
      inline def setFileSuccess(value: FileSuccessCallbackArguments): Self = StObject.set(x, "fileSuccess", value.asInstanceOf[js.Any])
      
      inline def setFilesAdded(value: FilesAddedCallbackArguments): Self = StObject.set(x, "filesAdded", value.asInstanceOf[js.Any])
      
      inline def setFilesSubmitted(value: FilesSubmittedCallbackArguments): Self = StObject.set(x, "filesSubmitted", value.asInstanceOf[js.Any])
      
      inline def setProgress(value: ProgressCallbackArguments): Self = StObject.set(x, "progress", value.asInstanceOf[js.Any])
      
      inline def setProgressVarargs(value: Any*): Self = StObject.set(x, "progress", js.Array(value*))
      
      inline def setUploadStart(value: UploadStartCallbackArguments): Self = StObject.set(x, "uploadStart", value.asInstanceOf[js.Any])
      
      inline def setUploadStartVarargs(value: Any*): Self = StObject.set(x, "uploadStart", js.Array(value*))
    }
  }
  
  /** NOTE: Conditional type definitions are impossible to translate to Scala.
    * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
    * You'll have to cast your way around this structure, unfortunately. 
    * TS definition: {{{
    T extends flowjs.flowjs.FlowEventFromEventName<infer U> ? U : never
    }}}
    */
  @js.native
  trait FlowEventTypeFromFlowEvent[T /* <: FlowEvent */] extends StObject
  
  trait FlowFile extends StObject {
    
    var averageSpeed: Double
    
    def bootstrap(): Unit
    
    def cancel(): Unit
    
    var chunks: js.Array[FlowChunk]
    
    var currentSpeed: Double
    
    var error: Boolean
    
    var file: File
    
    var flowObj: Flow
    
    def getExtension(): String
    
    def getType(): String
    
    def isComplete(): Boolean
    
    def isUploading(): Boolean
    
    var name: String
    
    def pause(): Unit
    
    var paused: Boolean
    
    def progress(): Double
    
    var relativePath: String
    
    def resume(): Unit
    
    def retry(): Unit
    
    var size: Double
    
    def sizeUploaded(): Double
    
    def timeRemaining(): Double
    
    var uniqueIdentifier: String
  }
  object FlowFile {
    
    inline def apply(
      averageSpeed: Double,
      bootstrap: Callback,
      cancel: Callback,
      chunks: js.Array[FlowChunk],
      currentSpeed: Double,
      error: Boolean,
      file: File,
      flowObj: Flow,
      getExtension: CallbackTo[String],
      getType: CallbackTo[String],
      isComplete: CallbackTo[Boolean],
      isUploading: CallbackTo[Boolean],
      name: String,
      pause: Callback,
      paused: Boolean,
      progress: CallbackTo[Double],
      relativePath: String,
      resume: Callback,
      retry: Callback,
      size: Double,
      sizeUploaded: CallbackTo[Double],
      timeRemaining: CallbackTo[Double],
      uniqueIdentifier: String
    ): FlowFile = {
      val __obj = js.Dynamic.literal(averageSpeed = averageSpeed.asInstanceOf[js.Any], bootstrap = bootstrap.toJsFn, cancel = cancel.toJsFn, chunks = chunks.asInstanceOf[js.Any], currentSpeed = currentSpeed.asInstanceOf[js.Any], error = error.asInstanceOf[js.Any], file = file.asInstanceOf[js.Any], flowObj = flowObj.asInstanceOf[js.Any], getExtension = getExtension.toJsFn, getType = getType.toJsFn, isComplete = isComplete.toJsFn, isUploading = isUploading.toJsFn, name = name.asInstanceOf[js.Any], pause = pause.toJsFn, paused = paused.asInstanceOf[js.Any], progress = progress.toJsFn, relativePath = relativePath.asInstanceOf[js.Any], resume = resume.toJsFn, retry = retry.toJsFn, size = size.asInstanceOf[js.Any], sizeUploaded = sizeUploaded.toJsFn, timeRemaining = timeRemaining.toJsFn, uniqueIdentifier = uniqueIdentifier.asInstanceOf[js.Any])
      __obj.asInstanceOf[FlowFile]
    }
    
    extension [Self <: FlowFile](x: Self) {
      
      inline def setAverageSpeed(value: Double): Self = StObject.set(x, "averageSpeed", value.asInstanceOf[js.Any])
      
      inline def setBootstrap(value: Callback): Self = StObject.set(x, "bootstrap", value.toJsFn)
      
      inline def setCancel(value: Callback): Self = StObject.set(x, "cancel", value.toJsFn)
      
      inline def setChunks(value: js.Array[FlowChunk]): Self = StObject.set(x, "chunks", value.asInstanceOf[js.Any])
      
      inline def setChunksVarargs(value: FlowChunk*): Self = StObject.set(x, "chunks", js.Array(value*))
      
      inline def setCurrentSpeed(value: Double): Self = StObject.set(x, "currentSpeed", value.asInstanceOf[js.Any])
      
      inline def setError(value: Boolean): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
      
      inline def setFile(value: File): Self = StObject.set(x, "file", value.asInstanceOf[js.Any])
      
      inline def setFlowObj(value: Flow): Self = StObject.set(x, "flowObj", value.asInstanceOf[js.Any])
      
      inline def setGetExtension(value: CallbackTo[String]): Self = StObject.set(x, "getExtension", value.toJsFn)
      
      inline def setGetType(value: CallbackTo[String]): Self = StObject.set(x, "getType", value.toJsFn)
      
      inline def setIsComplete(value: CallbackTo[Boolean]): Self = StObject.set(x, "isComplete", value.toJsFn)
      
      inline def setIsUploading(value: CallbackTo[Boolean]): Self = StObject.set(x, "isUploading", value.toJsFn)
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setPause(value: Callback): Self = StObject.set(x, "pause", value.toJsFn)
      
      inline def setPaused(value: Boolean): Self = StObject.set(x, "paused", value.asInstanceOf[js.Any])
      
      inline def setProgress(value: CallbackTo[Double]): Self = StObject.set(x, "progress", value.toJsFn)
      
      inline def setRelativePath(value: String): Self = StObject.set(x, "relativePath", value.asInstanceOf[js.Any])
      
      inline def setResume(value: Callback): Self = StObject.set(x, "resume", value.toJsFn)
      
      inline def setRetry(value: Callback): Self = StObject.set(x, "retry", value.toJsFn)
      
      inline def setSize(value: Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setSizeUploaded(value: CallbackTo[Double]): Self = StObject.set(x, "sizeUploaded", value.toJsFn)
      
      inline def setTimeRemaining(value: CallbackTo[Double]): Self = StObject.set(x, "timeRemaining", value.toJsFn)
      
      inline def setUniqueIdentifier(value: String): Self = StObject.set(x, "uniqueIdentifier", value.asInstanceOf[js.Any])
    }
  }
  
  trait FlowOptions extends StObject {
    
    var allowDuplicateUploads: js.UndefOr[Boolean] = js.undefined
    
    var chunkRetryInterval: js.UndefOr[Double] = js.undefined
    
    var chunkSize: js.UndefOr[Double] = js.undefined
    
    var fileParameterName: js.UndefOr[String] = js.undefined
    
    var forceChunkSize: js.UndefOr[Boolean] = js.undefined
    
    var generateUniqueIdentifier: js.UndefOr[js.Function1[/* file */ FlowFile, Any]] = js.undefined
    
    var headers: js.UndefOr[js.Object] = js.undefined
    
    var initFileFn: js.UndefOr[js.Function2[/* file */ FlowFile, /* chunk */ FlowChunk, Unit]] = js.undefined
    
    var maxChunkRetries: js.UndefOr[Double] = js.undefined
    
    var method: js.UndefOr[String] = js.undefined
    
    var permanentErrors: js.UndefOr[js.Array[Double]] = js.undefined
    
    var preprocess: js.UndefOr[js.Function1[/* chunk */ FlowChunk, Unit]] = js.undefined
    
    var prioritizeFirstAndLastChunk: js.UndefOr[Boolean] = js.undefined
    
    var progressCallbacksInterval: js.UndefOr[Double] = js.undefined
    
    var query: js.UndefOr[js.Object] = js.undefined
    
    var readFileFn: js.UndefOr[
        js.Function5[
          /* file */ FlowFile, 
          /* startByte */ Double, 
          /* endByte */ Double, 
          /* fileType */ String, 
          /* chunk */ FlowChunk, 
          Unit
        ]
      ] = js.undefined
    
    var simultaneousUploads: js.UndefOr[Double] = js.undefined
    
    var singleFile: js.UndefOr[Boolean] = js.undefined
    
    var speedSmoothingFactor: js.UndefOr[Double] = js.undefined
    
    var successStatuses: js.UndefOr[js.Array[Double]] = js.undefined
    
    var target: js.UndefOr[String] = js.undefined
    
    var testChunks: js.UndefOr[Boolean] = js.undefined
    
    var testMethod: js.UndefOr[String] = js.undefined
    
    var uploadMethod: js.UndefOr[String] = js.undefined
    
    var withCredentials: js.UndefOr[Boolean] = js.undefined
  }
  object FlowOptions {
    
    inline def apply(): FlowOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[FlowOptions]
    }
    
    extension [Self <: FlowOptions](x: Self) {
      
      inline def setAllowDuplicateUploads(value: Boolean): Self = StObject.set(x, "allowDuplicateUploads", value.asInstanceOf[js.Any])
      
      inline def setAllowDuplicateUploadsUndefined: Self = StObject.set(x, "allowDuplicateUploads", js.undefined)
      
      inline def setChunkRetryInterval(value: Double): Self = StObject.set(x, "chunkRetryInterval", value.asInstanceOf[js.Any])
      
      inline def setChunkRetryIntervalUndefined: Self = StObject.set(x, "chunkRetryInterval", js.undefined)
      
      inline def setChunkSize(value: Double): Self = StObject.set(x, "chunkSize", value.asInstanceOf[js.Any])
      
      inline def setChunkSizeUndefined: Self = StObject.set(x, "chunkSize", js.undefined)
      
      inline def setFileParameterName(value: String): Self = StObject.set(x, "fileParameterName", value.asInstanceOf[js.Any])
      
      inline def setFileParameterNameUndefined: Self = StObject.set(x, "fileParameterName", js.undefined)
      
      inline def setForceChunkSize(value: Boolean): Self = StObject.set(x, "forceChunkSize", value.asInstanceOf[js.Any])
      
      inline def setForceChunkSizeUndefined: Self = StObject.set(x, "forceChunkSize", js.undefined)
      
      inline def setGenerateUniqueIdentifier(value: /* file */ FlowFile => Any): Self = StObject.set(x, "generateUniqueIdentifier", js.Any.fromFunction1(value))
      
      inline def setGenerateUniqueIdentifierUndefined: Self = StObject.set(x, "generateUniqueIdentifier", js.undefined)
      
      inline def setHeaders(value: js.Object): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
      
      inline def setHeadersUndefined: Self = StObject.set(x, "headers", js.undefined)
      
      inline def setInitFileFn(value: (/* file */ FlowFile, /* chunk */ FlowChunk) => Callback): Self = StObject.set(x, "initFileFn", js.Any.fromFunction2((t0: /* file */ FlowFile, t1: /* chunk */ FlowChunk) => (value(t0, t1)).runNow()))
      
      inline def setInitFileFnUndefined: Self = StObject.set(x, "initFileFn", js.undefined)
      
      inline def setMaxChunkRetries(value: Double): Self = StObject.set(x, "maxChunkRetries", value.asInstanceOf[js.Any])
      
      inline def setMaxChunkRetriesUndefined: Self = StObject.set(x, "maxChunkRetries", js.undefined)
      
      inline def setMethod(value: String): Self = StObject.set(x, "method", value.asInstanceOf[js.Any])
      
      inline def setMethodUndefined: Self = StObject.set(x, "method", js.undefined)
      
      inline def setPermanentErrors(value: js.Array[Double]): Self = StObject.set(x, "permanentErrors", value.asInstanceOf[js.Any])
      
      inline def setPermanentErrorsUndefined: Self = StObject.set(x, "permanentErrors", js.undefined)
      
      inline def setPermanentErrorsVarargs(value: Double*): Self = StObject.set(x, "permanentErrors", js.Array(value*))
      
      inline def setPreprocess(value: /* chunk */ FlowChunk => Callback): Self = StObject.set(x, "preprocess", js.Any.fromFunction1((t0: /* chunk */ FlowChunk) => value(t0).runNow()))
      
      inline def setPreprocessUndefined: Self = StObject.set(x, "preprocess", js.undefined)
      
      inline def setPrioritizeFirstAndLastChunk(value: Boolean): Self = StObject.set(x, "prioritizeFirstAndLastChunk", value.asInstanceOf[js.Any])
      
      inline def setPrioritizeFirstAndLastChunkUndefined: Self = StObject.set(x, "prioritizeFirstAndLastChunk", js.undefined)
      
      inline def setProgressCallbacksInterval(value: Double): Self = StObject.set(x, "progressCallbacksInterval", value.asInstanceOf[js.Any])
      
      inline def setProgressCallbacksIntervalUndefined: Self = StObject.set(x, "progressCallbacksInterval", js.undefined)
      
      inline def setQuery(value: js.Object): Self = StObject.set(x, "query", value.asInstanceOf[js.Any])
      
      inline def setQueryUndefined: Self = StObject.set(x, "query", js.undefined)
      
      inline def setReadFileFn(
        value: (/* file */ FlowFile, /* startByte */ Double, /* endByte */ Double, /* fileType */ String, /* chunk */ FlowChunk) => Callback
      ): Self = StObject.set(x, "readFileFn", js.Any.fromFunction5((t0: /* file */ FlowFile, t1: /* startByte */ Double, t2: /* endByte */ Double, t3: /* fileType */ String, t4: /* chunk */ FlowChunk) => (value(t0, t1, t2, t3, t4)).runNow()))
      
      inline def setReadFileFnUndefined: Self = StObject.set(x, "readFileFn", js.undefined)
      
      inline def setSimultaneousUploads(value: Double): Self = StObject.set(x, "simultaneousUploads", value.asInstanceOf[js.Any])
      
      inline def setSimultaneousUploadsUndefined: Self = StObject.set(x, "simultaneousUploads", js.undefined)
      
      inline def setSingleFile(value: Boolean): Self = StObject.set(x, "singleFile", value.asInstanceOf[js.Any])
      
      inline def setSingleFileUndefined: Self = StObject.set(x, "singleFile", js.undefined)
      
      inline def setSpeedSmoothingFactor(value: Double): Self = StObject.set(x, "speedSmoothingFactor", value.asInstanceOf[js.Any])
      
      inline def setSpeedSmoothingFactorUndefined: Self = StObject.set(x, "speedSmoothingFactor", js.undefined)
      
      inline def setSuccessStatuses(value: js.Array[Double]): Self = StObject.set(x, "successStatuses", value.asInstanceOf[js.Any])
      
      inline def setSuccessStatusesUndefined: Self = StObject.set(x, "successStatuses", js.undefined)
      
      inline def setSuccessStatusesVarargs(value: Double*): Self = StObject.set(x, "successStatuses", js.Array(value*))
      
      inline def setTarget(value: String): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
      
      inline def setTargetUndefined: Self = StObject.set(x, "target", js.undefined)
      
      inline def setTestChunks(value: Boolean): Self = StObject.set(x, "testChunks", value.asInstanceOf[js.Any])
      
      inline def setTestChunksUndefined: Self = StObject.set(x, "testChunks", js.undefined)
      
      inline def setTestMethod(value: String): Self = StObject.set(x, "testMethod", value.asInstanceOf[js.Any])
      
      inline def setTestMethodUndefined: Self = StObject.set(x, "testMethod", js.undefined)
      
      inline def setUploadMethod(value: String): Self = StObject.set(x, "uploadMethod", value.asInstanceOf[js.Any])
      
      inline def setUploadMethodUndefined: Self = StObject.set(x, "uploadMethod", js.undefined)
      
      inline def setWithCredentials(value: Boolean): Self = StObject.set(x, "withCredentials", value.asInstanceOf[js.Any])
      
      inline def setWithCredentialsUndefined: Self = StObject.set(x, "withCredentials", js.undefined)
    }
  }
  
  type ProgressCallbackArguments = js.Array[Any]
  
  type UploadStartCallbackArguments = js.Array[Any]
}
