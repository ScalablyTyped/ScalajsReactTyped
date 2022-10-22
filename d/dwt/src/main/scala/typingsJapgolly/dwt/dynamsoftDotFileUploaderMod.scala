package typingsJapgolly.dwt

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object dynamsoftDotFileUploaderMod {
  
  trait FileUploader extends StObject {
    
    /**
      * Initialize and create a FileUploader instance.
      * @param URL Specify a path to retrieve the FileUploader library.
      * @param successCallback A callback function that is executed if the request succeeds.
      * @param failureCallback A callback function that is executed if the request fails.
      * @argument uploadManager A FileUploader instance.
      * @argument errorCode The error code.
      * @argument errorString The error string.
      */
    def Init(
      URL: String,
      successCallback: js.Function1[/* uploadManager */ UploadManager, Unit],
      failureCallback: js.Function2[/* errorCode */ Double, /* errorString */ String, Unit]
    ): Unit
  }
  object FileUploader {
    
    inline def apply(
      Init: (String, js.Function1[/* uploadManager */ UploadManager, Unit], js.Function2[/* errorCode */ Double, /* errorString */ String, Unit]) => Callback
    ): FileUploader = {
      val __obj = js.Dynamic.literal(Init = js.Any.fromFunction3((t0: String, t1: js.Function1[/* uploadManager */ UploadManager, Unit], t2: js.Function2[/* errorCode */ Double, /* errorString */ String, Unit]) => (Init(t0, t1, t2)).runNow()))
      __obj.asInstanceOf[FileUploader]
    }
    
    extension [Self <: FileUploader](x: Self) {
      
      inline def setInit(
        value: (String, js.Function1[/* uploadManager */ UploadManager, Unit], js.Function2[/* errorCode */ Double, /* errorString */ String, Unit]) => Callback
      ): Self = StObject.set(x, "Init", js.Any.fromFunction3((t0: String, t1: js.Function1[/* uploadManager */ UploadManager, Unit], t2: js.Function2[/* errorCode */ Double, /* errorString */ String, Unit]) => (value(t0, t1, t2)).runNow()))
    }
  }
  
  trait FormField extends StObject {
    
    /**
      * Specify the block size. By default, it's 10240.
      * @param key Specify the key of the field.
      * @param value Sepcify the value of the field.
      */
    def Add(key: String, value: String): Unit
  }
  object FormField {
    
    inline def apply(Add: (String, String) => Callback): FormField = {
      val __obj = js.Dynamic.literal(Add = js.Any.fromFunction2((t0: String, t1: String) => (Add(t0, t1)).runNow()))
      __obj.asInstanceOf[FormField]
    }
    
    extension [Self <: FormField](x: Self) {
      
      inline def setAdd(value: (String, String) => Callback): Self = StObject.set(x, "Add", js.Any.fromFunction2((t0: String, t1: String) => (value(t0, t1)).runNow()))
    }
  }
  
  trait Job extends StObject {
    
    /**
      * Specify the block size (in bytes). By default, it's 10240.
      */
    var BlockSize: Double
    
    /**
      * Specify the file name.
      */
    var FileName: String
    
    /**
      * Specify the fields in the HTTP Post Form.
      */
    var FormField: typingsJapgolly.dwt.dynamsoftDotFileUploaderMod.FormField
    
    /**
      * Specify custom HTTP Post request headers.
      * Example: job.HttpHeader["Content-Type"] = "text/plain";
      */
    var HttpHeader: js.Object
    
    /**
      * Return the Http version.
      */
    val HttpVersion: String
    
    /**
      * A callback triggered when the job succeeds.
      * @argument job Specify the job.
      * @argument errorCode The error code.
      * @argument errorString The error string.
      */
    def OnRunFailure(job: Job, errorCode: Double, errorString: String): Unit
    
    /**
      * A callback triggered when the job succeeds.
      * @argument job Specify the job.
      */
    def OnRunSuccess(job: Job): Unit
    
    /**
      * A callback triggered multiple times during the upload.
      * @argument job Specify the job.
      * @argument percentage Return the percentage.
      */
    def OnUploadTransferPercentage(job: Job, percentage: Double): Unit
    
    /**
      * Specify the URL of the script to receive the upload.
      */
    var ServerUrl: String
    
    /**
      * Specify the main content of the job, i.e. the file(s).
      */
    var SourceValue: typingsJapgolly.dwt.dynamsoftDotFileUploaderMod.SourceValue
    
    /**
      * Specify the number of threads (<=4) for the upload.
      */
    var ThreadNum: Double
    
    /**
      * Return the version of the job.
      */
    val Version: Double
  }
  object Job {
    
    inline def apply(
      BlockSize: Double,
      FileName: String,
      FormField: FormField,
      HttpHeader: js.Object,
      HttpVersion: String,
      OnRunFailure: (Job, Double, String) => Callback,
      OnRunSuccess: Job => Callback,
      OnUploadTransferPercentage: (Job, Double) => Callback,
      ServerUrl: String,
      SourceValue: SourceValue,
      ThreadNum: Double,
      Version: Double
    ): Job = {
      val __obj = js.Dynamic.literal(BlockSize = BlockSize.asInstanceOf[js.Any], FileName = FileName.asInstanceOf[js.Any], FormField = FormField.asInstanceOf[js.Any], HttpHeader = HttpHeader.asInstanceOf[js.Any], HttpVersion = HttpVersion.asInstanceOf[js.Any], OnRunFailure = js.Any.fromFunction3((t0: Job, t1: Double, t2: String) => (OnRunFailure(t0, t1, t2)).runNow()), OnRunSuccess = js.Any.fromFunction1((t0: Job) => OnRunSuccess(t0).runNow()), OnUploadTransferPercentage = js.Any.fromFunction2((t0: Job, t1: Double) => (OnUploadTransferPercentage(t0, t1)).runNow()), ServerUrl = ServerUrl.asInstanceOf[js.Any], SourceValue = SourceValue.asInstanceOf[js.Any], ThreadNum = ThreadNum.asInstanceOf[js.Any], Version = Version.asInstanceOf[js.Any])
      __obj.asInstanceOf[Job]
    }
    
    extension [Self <: Job](x: Self) {
      
      inline def setBlockSize(value: Double): Self = StObject.set(x, "BlockSize", value.asInstanceOf[js.Any])
      
      inline def setFileName(value: String): Self = StObject.set(x, "FileName", value.asInstanceOf[js.Any])
      
      inline def setFormField(value: FormField): Self = StObject.set(x, "FormField", value.asInstanceOf[js.Any])
      
      inline def setHttpHeader(value: js.Object): Self = StObject.set(x, "HttpHeader", value.asInstanceOf[js.Any])
      
      inline def setHttpVersion(value: String): Self = StObject.set(x, "HttpVersion", value.asInstanceOf[js.Any])
      
      inline def setOnRunFailure(value: (Job, Double, String) => Callback): Self = StObject.set(x, "OnRunFailure", js.Any.fromFunction3((t0: Job, t1: Double, t2: String) => (value(t0, t1, t2)).runNow()))
      
      inline def setOnRunSuccess(value: Job => Callback): Self = StObject.set(x, "OnRunSuccess", js.Any.fromFunction1((t0: Job) => value(t0).runNow()))
      
      inline def setOnUploadTransferPercentage(value: (Job, Double) => Callback): Self = StObject.set(x, "OnUploadTransferPercentage", js.Any.fromFunction2((t0: Job, t1: Double) => (value(t0, t1)).runNow()))
      
      inline def setServerUrl(value: String): Self = StObject.set(x, "ServerUrl", value.asInstanceOf[js.Any])
      
      inline def setSourceValue(value: SourceValue): Self = StObject.set(x, "SourceValue", value.asInstanceOf[js.Any])
      
      inline def setThreadNum(value: Double): Self = StObject.set(x, "ThreadNum", value.asInstanceOf[js.Any])
      
      inline def setVersion(value: Double): Self = StObject.set(x, "Version", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait SourceValue extends StObject {
    
    /**
      * Specify the block size. By default, it's 10240.
      * @param source A URL to specify the content of the file.
      * Normally it's generated by {GenerateURLForUploadData()}
      * @param name Specify the name of the file.
      * @param key Specify the key of the file in the request. This key can be used to retrieve the file content in server-side scripts.
      */
    def Add(source: String, name: String): Unit = js.native
    def Add(source: String, name: String, key: String): Unit = js.native
  }
  
  trait UploadManager extends StObject {
    
    /**
      * Cancel a job.
      * @param job Specify the job.
      */
    def Cancel(job: Job): Boolean
    
    /**
      * Cancel all jobs.
      */
    def CancelAllUpload(): Boolean
    
    /**
      * Create an upload job.
      */
    def CreateJob(): Job
    
    /**
      * Start uploading (processing the specified job).
      * @param job Specify the job.
      */
    def Run(job: Job): Boolean
  }
  object UploadManager {
    
    inline def apply(
      Cancel: Job => Boolean,
      CancelAllUpload: CallbackTo[Boolean],
      CreateJob: CallbackTo[Job],
      Run: Job => Boolean
    ): UploadManager = {
      val __obj = js.Dynamic.literal(Cancel = js.Any.fromFunction1(Cancel), CancelAllUpload = CancelAllUpload.toJsFn, CreateJob = CreateJob.toJsFn, Run = js.Any.fromFunction1(Run))
      __obj.asInstanceOf[UploadManager]
    }
    
    extension [Self <: UploadManager](x: Self) {
      
      inline def setCancel(value: Job => Boolean): Self = StObject.set(x, "Cancel", js.Any.fromFunction1(value))
      
      inline def setCancelAllUpload(value: CallbackTo[Boolean]): Self = StObject.set(x, "CancelAllUpload", value.toJsFn)
      
      inline def setCreateJob(value: CallbackTo[Job]): Self = StObject.set(x, "CreateJob", value.toJsFn)
      
      inline def setRun(value: Job => Boolean): Self = StObject.set(x, "Run", js.Any.fromFunction1(value))
    }
  }
}
