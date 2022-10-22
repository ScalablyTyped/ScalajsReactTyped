package typingsJapgolly.electronPublish

import typingsJapgolly.builderUtil.outArchMod.Arch
import typingsJapgolly.builderUtilRuntime.mod.CancellationToken
import typingsJapgolly.builderUtilRuntime.outPublishOptionsMod.PublishProvider
import typingsJapgolly.electronPublish.outMultiProgressMod.MultiProgress
import typingsJapgolly.electronPublish.outProgressMod.ProgressBar
import typingsJapgolly.fsExtra.mod.Stats
import typingsJapgolly.node.NodeJS.ReadableStream
import typingsJapgolly.node.bufferMod.global.Buffer
import typingsJapgolly.node.httpMod.ClientRequest
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("electron-publish", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  /* note: abstract class */ @JSImport("electron-publish", "HttpPublisher")
  @js.native
  open class HttpPublisher protected () extends Publisher {
    /* protected */ def this(context: PublishContext) = this()
    /* protected */ def this(context: PublishContext, useSafeArtifactName: Boolean) = this()
    
    /* protected */ def doUpload(
      fileName: String,
      arch: Arch,
      dataLength: Double,
      requestProcessor: js.Function2[
          /* request */ ClientRequest, 
          /* reject */ js.Function1[/* error */ js.Error, Unit], 
          Unit
        ],
      file: String
    ): js.Promise[Any] = js.native
    
    /* private */ val useSafeArtifactName: Any = js.native
  }
  
  @JSImport("electron-publish", "ProgressCallback")
  @js.native
  open class ProgressCallback protected ()
    extends typingsJapgolly.electronPublish.outProgressMod.ProgressCallback {
    def this(progressBar: ProgressBar) = this()
  }
  
  /* note: abstract class */ @JSImport("electron-publish", "Publisher")
  @js.native
  open class Publisher protected () extends StObject {
    /* protected */ def this(context: PublishContext) = this()
    
    /* protected */ val context: PublishContext = js.native
    
    /* protected */ def createProgressBar(fileName: String, size: Double): ProgressBar | Null = js.native
    
    /* protected */ def createReadStreamAndProgressBar(file: String, fileStat: Stats, progressBar: Null, reject: js.Function1[/* error */ js.Error, Unit]): ReadableStream = js.native
    /* protected */ def createReadStreamAndProgressBar(
      file: String,
      fileStat: Stats,
      progressBar: ProgressBar,
      reject: js.Function1[/* error */ js.Error, Unit]
    ): ReadableStream = js.native
    
    def providerName: PublishProvider = js.native
    
    def upload(task: UploadTask): js.Promise[Any] = js.native
  }
  
  inline def getCiTag(): String | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("getCiTag")().asInstanceOf[String | Null]
  
  trait PublishContext extends StObject {
    
    val cancellationToken: CancellationToken
    
    val progress: MultiProgress | Null
  }
  object PublishContext {
    
    inline def apply(cancellationToken: CancellationToken): PublishContext = {
      val __obj = js.Dynamic.literal(cancellationToken = cancellationToken.asInstanceOf[js.Any], progress = null)
      __obj.asInstanceOf[PublishContext]
    }
    
    extension [Self <: PublishContext](x: Self) {
      
      inline def setCancellationToken(value: CancellationToken): Self = StObject.set(x, "cancellationToken", value.asInstanceOf[js.Any])
      
      inline def setProgress(value: MultiProgress): Self = StObject.set(x, "progress", value.asInstanceOf[js.Any])
      
      inline def setProgressNull: Self = StObject.set(x, "progress", null)
    }
  }
  
  trait PublishOptions extends StObject {
    
    var publish: js.UndefOr[PublishPolicy | Null] = js.undefined
  }
  object PublishOptions {
    
    inline def apply(): PublishOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PublishOptions]
    }
    
    extension [Self <: PublishOptions](x: Self) {
      
      inline def setPublish(value: PublishPolicy): Self = StObject.set(x, "publish", value.asInstanceOf[js.Any])
      
      inline def setPublishNull: Self = StObject.set(x, "publish", null)
      
      inline def setPublishUndefined: Self = StObject.set(x, "publish", js.undefined)
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.electronPublish.electronPublishStrings.onTag
    - typingsJapgolly.electronPublish.electronPublishStrings.onTagOrDraft
    - typingsJapgolly.electronPublish.electronPublishStrings.always
    - typingsJapgolly.electronPublish.electronPublishStrings.never
  */
  trait PublishPolicy extends StObject
  object PublishPolicy {
    
    inline def always: typingsJapgolly.electronPublish.electronPublishStrings.always = "always".asInstanceOf[typingsJapgolly.electronPublish.electronPublishStrings.always]
    
    inline def never: typingsJapgolly.electronPublish.electronPublishStrings.never = "never".asInstanceOf[typingsJapgolly.electronPublish.electronPublishStrings.never]
    
    inline def onTag: typingsJapgolly.electronPublish.electronPublishStrings.onTag = "onTag".asInstanceOf[typingsJapgolly.electronPublish.electronPublishStrings.onTag]
    
    inline def onTagOrDraft: typingsJapgolly.electronPublish.electronPublishStrings.onTagOrDraft = "onTagOrDraft".asInstanceOf[typingsJapgolly.electronPublish.electronPublishStrings.onTagOrDraft]
  }
  
  trait UploadTask extends StObject {
    
    var arch: Arch | Null
    
    var file: String
    
    var fileContent: js.UndefOr[Buffer | Null] = js.undefined
    
    var safeArtifactName: js.UndefOr[String | Null] = js.undefined
    
    var timeout: js.UndefOr[Double | Null] = js.undefined
  }
  object UploadTask {
    
    inline def apply(file: String): UploadTask = {
      val __obj = js.Dynamic.literal(file = file.asInstanceOf[js.Any], arch = null)
      __obj.asInstanceOf[UploadTask]
    }
    
    extension [Self <: UploadTask](x: Self) {
      
      inline def setArch(value: Arch): Self = StObject.set(x, "arch", value.asInstanceOf[js.Any])
      
      inline def setArchNull: Self = StObject.set(x, "arch", null)
      
      inline def setFile(value: String): Self = StObject.set(x, "file", value.asInstanceOf[js.Any])
      
      inline def setFileContent(value: Buffer): Self = StObject.set(x, "fileContent", value.asInstanceOf[js.Any])
      
      inline def setFileContentNull: Self = StObject.set(x, "fileContent", null)
      
      inline def setFileContentUndefined: Self = StObject.set(x, "fileContent", js.undefined)
      
      inline def setSafeArtifactName(value: String): Self = StObject.set(x, "safeArtifactName", value.asInstanceOf[js.Any])
      
      inline def setSafeArtifactNameNull: Self = StObject.set(x, "safeArtifactName", null)
      
      inline def setSafeArtifactNameUndefined: Self = StObject.set(x, "safeArtifactName", js.undefined)
      
      inline def setTimeout(value: Double): Self = StObject.set(x, "timeout", value.asInstanceOf[js.Any])
      
      inline def setTimeoutNull: Self = StObject.set(x, "timeout", null)
      
      inline def setTimeoutUndefined: Self = StObject.set(x, "timeout", js.undefined)
    }
  }
}
