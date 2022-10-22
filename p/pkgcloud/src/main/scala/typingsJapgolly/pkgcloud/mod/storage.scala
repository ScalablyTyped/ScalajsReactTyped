package typingsJapgolly.pkgcloud.mod

import japgolly.scalajs.react.Callback
import typingsJapgolly.node.processMod.global.NodeJS.ReadStream
import typingsJapgolly.node.processMod.global.NodeJS.WriteStream
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object storage {
  
  @JSImport("pkgcloud", "storage")
  @js.native
  val ^ : js.Any = js.native
  
  inline def createClient(options: ProviderOptions): Client = ^.asInstanceOf[js.Dynamic].applyDynamic("createClient")(options.asInstanceOf[js.Any]).asInstanceOf[Client]
  
  trait Client extends StObject {
    
    var config: ProviderOptions
    
    def createContainer(options: Any, callback: js.Function2[/* err */ ClientError, /* container */ Container, Any]): Unit
    
    def destroyContainer(containerName: String, callback: js.Function1[/* err */ ClientError, Any]): Unit
    
    def download(options: StorageDownloadOptions): ReadStream
    
    def getContainer(
      containerName: String,
      callback: js.Function2[/* err */ ClientError, /* container */ Container, Any]
    ): Unit
    
    def getContainers(callback: js.Function2[/* err */ ClientError, /* containers */ js.Array[Container], Any]): Unit
    
    def getFile(
      containerName: String,
      file: String,
      callback: js.Function2[/* err */ ClientError, /* file */ File, Any]
    ): Unit
    
    def getFiles(
      containerName: String,
      callback: js.Function2[/* err */ ClientError, /* files */ js.Array[File], Any]
    ): Unit
    
    // Logs
    def on(eventName: String, callback: js.Function2[/* message */ String, /* object */ js.UndefOr[Any], Any]): Unit
    
    var protocol: String
    
    var provider: String
    
    def removeFile(containerName: String, file: String, callback: js.Function1[/* err */ ClientError, Any]): Unit
    
    def upload(options: StorageUploadOptions): WriteStream
  }
  object Client {
    
    inline def apply(
      config: ProviderOptions,
      createContainer: (Any, js.Function2[/* err */ ClientError, /* container */ Container, Any]) => Callback,
      destroyContainer: (String, js.Function1[/* err */ ClientError, Any]) => Callback,
      download: StorageDownloadOptions => ReadStream,
      getContainer: (String, js.Function2[/* err */ ClientError, /* container */ Container, Any]) => Callback,
      getContainers: js.Function2[/* err */ ClientError, /* containers */ js.Array[Container], Any] => Callback,
      getFile: (String, String, js.Function2[/* err */ ClientError, /* file */ File, Any]) => Callback,
      getFiles: (String, js.Function2[/* err */ ClientError, /* files */ js.Array[File], Any]) => Callback,
      on: (String, js.Function2[/* message */ String, /* object */ js.UndefOr[Any], Any]) => Callback,
      protocol: String,
      provider: String,
      removeFile: (String, String, js.Function1[/* err */ ClientError, Any]) => Callback,
      upload: StorageUploadOptions => WriteStream
    ): Client = {
      val __obj = js.Dynamic.literal(config = config.asInstanceOf[js.Any], createContainer = js.Any.fromFunction2((t0: Any, t1: js.Function2[/* err */ ClientError, /* container */ Container, Any]) => (createContainer(t0, t1)).runNow()), destroyContainer = js.Any.fromFunction2((t0: String, t1: js.Function1[/* err */ ClientError, Any]) => (destroyContainer(t0, t1)).runNow()), download = js.Any.fromFunction1(download), getContainer = js.Any.fromFunction2((t0: String, t1: js.Function2[/* err */ ClientError, /* container */ Container, Any]) => (getContainer(t0, t1)).runNow()), getContainers = js.Any.fromFunction1((t0: js.Function2[/* err */ ClientError, /* containers */ js.Array[Container], Any]) => getContainers(t0).runNow()), getFile = js.Any.fromFunction3((t0: String, t1: String, t2: js.Function2[/* err */ ClientError, /* file */ File, Any]) => (getFile(t0, t1, t2)).runNow()), getFiles = js.Any.fromFunction2((t0: String, t1: js.Function2[/* err */ ClientError, /* files */ js.Array[File], Any]) => (getFiles(t0, t1)).runNow()), on = js.Any.fromFunction2((t0: String, t1: js.Function2[/* message */ String, /* object */ js.UndefOr[Any], Any]) => (on(t0, t1)).runNow()), protocol = protocol.asInstanceOf[js.Any], provider = provider.asInstanceOf[js.Any], removeFile = js.Any.fromFunction3((t0: String, t1: String, t2: js.Function1[/* err */ ClientError, Any]) => (removeFile(t0, t1, t2)).runNow()), upload = js.Any.fromFunction1(upload))
      __obj.asInstanceOf[Client]
    }
    
    extension [Self <: Client](x: Self) {
      
      inline def setConfig(value: ProviderOptions): Self = StObject.set(x, "config", value.asInstanceOf[js.Any])
      
      inline def setCreateContainer(value: (Any, js.Function2[/* err */ ClientError, /* container */ Container, Any]) => Callback): Self = StObject.set(x, "createContainer", js.Any.fromFunction2((t0: Any, t1: js.Function2[/* err */ ClientError, /* container */ Container, Any]) => (value(t0, t1)).runNow()))
      
      inline def setDestroyContainer(value: (String, js.Function1[/* err */ ClientError, Any]) => Callback): Self = StObject.set(x, "destroyContainer", js.Any.fromFunction2((t0: String, t1: js.Function1[/* err */ ClientError, Any]) => (value(t0, t1)).runNow()))
      
      inline def setDownload(value: StorageDownloadOptions => ReadStream): Self = StObject.set(x, "download", js.Any.fromFunction1(value))
      
      inline def setGetContainer(value: (String, js.Function2[/* err */ ClientError, /* container */ Container, Any]) => Callback): Self = StObject.set(x, "getContainer", js.Any.fromFunction2((t0: String, t1: js.Function2[/* err */ ClientError, /* container */ Container, Any]) => (value(t0, t1)).runNow()))
      
      inline def setGetContainers(value: js.Function2[/* err */ ClientError, /* containers */ js.Array[Container], Any] => Callback): Self = StObject.set(x, "getContainers", js.Any.fromFunction1((t0: js.Function2[/* err */ ClientError, /* containers */ js.Array[Container], Any]) => value(t0).runNow()))
      
      inline def setGetFile(value: (String, String, js.Function2[/* err */ ClientError, /* file */ File, Any]) => Callback): Self = StObject.set(x, "getFile", js.Any.fromFunction3((t0: String, t1: String, t2: js.Function2[/* err */ ClientError, /* file */ File, Any]) => (value(t0, t1, t2)).runNow()))
      
      inline def setGetFiles(value: (String, js.Function2[/* err */ ClientError, /* files */ js.Array[File], Any]) => Callback): Self = StObject.set(x, "getFiles", js.Any.fromFunction2((t0: String, t1: js.Function2[/* err */ ClientError, /* files */ js.Array[File], Any]) => (value(t0, t1)).runNow()))
      
      inline def setOn(value: (String, js.Function2[/* message */ String, /* object */ js.UndefOr[Any], Any]) => Callback): Self = StObject.set(x, "on", js.Any.fromFunction2((t0: String, t1: js.Function2[/* message */ String, /* object */ js.UndefOr[Any], Any]) => (value(t0, t1)).runNow()))
      
      inline def setProtocol(value: String): Self = StObject.set(x, "protocol", value.asInstanceOf[js.Any])
      
      inline def setProvider(value: String): Self = StObject.set(x, "provider", value.asInstanceOf[js.Any])
      
      inline def setRemoveFile(value: (String, String, js.Function1[/* err */ ClientError, Any]) => Callback): Self = StObject.set(x, "removeFile", js.Any.fromFunction3((t0: String, t1: String, t2: js.Function1[/* err */ ClientError, Any]) => (value(t0, t1, t2)).runNow()))
      
      inline def setUpload(value: StorageUploadOptions => WriteStream): Self = StObject.set(x, "upload", js.Any.fromFunction1(value))
    }
  }
  
  trait Container extends StObject {
    
    // files: ?
    var client: Client
  }
  object Container {
    
    inline def apply(client: Client): Container = {
      val __obj = js.Dynamic.literal(client = client.asInstanceOf[js.Any])
      __obj.asInstanceOf[Container]
    }
    
    extension [Self <: Container](x: Self) {
      
      inline def setClient(value: Client): Self = StObject.set(x, "client", value.asInstanceOf[js.Any])
    }
  }
  
  trait File extends StObject {
    
    var client: Client
    
    var container: String
    
    var name: String
    
    var size: Double
  }
  object File {
    
    inline def apply(client: Client, container: String, name: String, size: Double): File = {
      val __obj = js.Dynamic.literal(client = client.asInstanceOf[js.Any], container = container.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], size = size.asInstanceOf[js.Any])
      __obj.asInstanceOf[File]
    }
    
    extension [Self <: File](x: Self) {
      
      inline def setClient(value: Client): Self = StObject.set(x, "client", value.asInstanceOf[js.Any])
      
      inline def setContainer(value: String): Self = StObject.set(x, "container", value.asInstanceOf[js.Any])
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setSize(value: Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
    }
  }
  
  trait StorageDownloadOptions extends StObject {
    
    var container: String
    
    var remote: String
  }
  object StorageDownloadOptions {
    
    inline def apply(container: String, remote: String): StorageDownloadOptions = {
      val __obj = js.Dynamic.literal(container = container.asInstanceOf[js.Any], remote = remote.asInstanceOf[js.Any])
      __obj.asInstanceOf[StorageDownloadOptions]
    }
    
    extension [Self <: StorageDownloadOptions](x: Self) {
      
      inline def setContainer(value: String): Self = StObject.set(x, "container", value.asInstanceOf[js.Any])
      
      inline def setRemote(value: String): Self = StObject.set(x, "remote", value.asInstanceOf[js.Any])
    }
  }
  
  trait StorageUploadOptions extends StObject {
    
    var container: String
    
    var remote: String
  }
  object StorageUploadOptions {
    
    inline def apply(container: String, remote: String): StorageUploadOptions = {
      val __obj = js.Dynamic.literal(container = container.asInstanceOf[js.Any], remote = remote.asInstanceOf[js.Any])
      __obj.asInstanceOf[StorageUploadOptions]
    }
    
    extension [Self <: StorageUploadOptions](x: Self) {
      
      inline def setContainer(value: String): Self = StObject.set(x, "container", value.asInstanceOf[js.Any])
      
      inline def setRemote(value: String): Self = StObject.set(x, "remote", value.asInstanceOf[js.Any])
    }
  }
}
