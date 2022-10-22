package typingsJapgolly.firebaseStorageTypes

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StringDictionary
import org.scalajs.dom.Blob
import typingsJapgolly.firebaseAppTypes.mod.FirebaseApp
import typingsJapgolly.firebaseStorageTypes.anon.MockUserToken
import typingsJapgolly.firebaseUtil.mod.CompleteFn
import typingsJapgolly.firebaseUtil.mod.FirebaseError
import typingsJapgolly.firebaseUtil.mod.NextFn
import typingsJapgolly.firebaseUtil.mod.Unsubscribe
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@firebase/storage-types", "FirebaseStorage")
  @js.native
  /* private */ open class FirebaseStorage () extends StObject {
    
    var app: FirebaseApp = js.native
    
    var maxOperationRetryTime: Double = js.native
    
    var maxUploadRetryTime: Double = js.native
    
    def ref(): Reference = js.native
    def ref(path: String): Reference = js.native
    
    def refFromURL(url: String): Reference = js.native
    
    def setMaxOperationRetryTime(time: Double): Unit = js.native
    
    def setMaxUploadRetryTime(time: Double): Unit = js.native
    
    def useEmulator(host: String, port: Double): Unit = js.native
    def useEmulator(host: String, port: Double, options: MockUserToken): Unit = js.native
  }
  
  @js.native
  trait FirebaseStorageError extends FirebaseError {
    
    var serverResponse: String | Null = js.native
  }
  
  trait FullMetadata
    extends StObject
       with UploadMetadata {
    
    var bucket: String
    
    var fullPath: String
    
    var generation: String
    
    var metageneration: String
    
    var name: String
    
    var size: Double
    
    var timeCreated: String
    
    var updated: String
  }
  object FullMetadata {
    
    inline def apply(
      bucket: String,
      fullPath: String,
      generation: String,
      metageneration: String,
      name: String,
      size: Double,
      timeCreated: String,
      updated: String
    ): FullMetadata = {
      val __obj = js.Dynamic.literal(bucket = bucket.asInstanceOf[js.Any], fullPath = fullPath.asInstanceOf[js.Any], generation = generation.asInstanceOf[js.Any], metageneration = metageneration.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], size = size.asInstanceOf[js.Any], timeCreated = timeCreated.asInstanceOf[js.Any], updated = updated.asInstanceOf[js.Any])
      __obj.asInstanceOf[FullMetadata]
    }
    
    extension [Self <: FullMetadata](x: Self) {
      
      inline def setBucket(value: String): Self = StObject.set(x, "bucket", value.asInstanceOf[js.Any])
      
      inline def setFullPath(value: String): Self = StObject.set(x, "fullPath", value.asInstanceOf[js.Any])
      
      inline def setGeneration(value: String): Self = StObject.set(x, "generation", value.asInstanceOf[js.Any])
      
      inline def setMetageneration(value: String): Self = StObject.set(x, "metageneration", value.asInstanceOf[js.Any])
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setSize(value: Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setTimeCreated(value: String): Self = StObject.set(x, "timeCreated", value.asInstanceOf[js.Any])
      
      inline def setUpdated(value: String): Self = StObject.set(x, "updated", value.asInstanceOf[js.Any])
    }
  }
  
  trait ListOptions extends StObject {
    
    var maxResults: js.UndefOr[Double | Null] = js.undefined
    
    var pageToken: js.UndefOr[String | Null] = js.undefined
  }
  object ListOptions {
    
    inline def apply(): ListOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ListOptions]
    }
    
    extension [Self <: ListOptions](x: Self) {
      
      inline def setMaxResults(value: Double): Self = StObject.set(x, "maxResults", value.asInstanceOf[js.Any])
      
      inline def setMaxResultsNull: Self = StObject.set(x, "maxResults", null)
      
      inline def setMaxResultsUndefined: Self = StObject.set(x, "maxResults", js.undefined)
      
      inline def setPageToken(value: String): Self = StObject.set(x, "pageToken", value.asInstanceOf[js.Any])
      
      inline def setPageTokenNull: Self = StObject.set(x, "pageToken", null)
      
      inline def setPageTokenUndefined: Self = StObject.set(x, "pageToken", js.undefined)
    }
  }
  
  trait ListResult extends StObject {
    
    var items: js.Array[Reference]
    
    var nextPageToken: String | Null
    
    var prefixes: js.Array[Reference]
  }
  object ListResult {
    
    inline def apply(items: js.Array[Reference], prefixes: js.Array[Reference]): ListResult = {
      val __obj = js.Dynamic.literal(items = items.asInstanceOf[js.Any], prefixes = prefixes.asInstanceOf[js.Any], nextPageToken = null)
      __obj.asInstanceOf[ListResult]
    }
    
    extension [Self <: ListResult](x: Self) {
      
      inline def setItems(value: js.Array[Reference]): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
      
      inline def setItemsVarargs(value: Reference*): Self = StObject.set(x, "items", js.Array(value*))
      
      inline def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
      
      inline def setNextPageTokenNull: Self = StObject.set(x, "nextPageToken", null)
      
      inline def setPrefixes(value: js.Array[Reference]): Self = StObject.set(x, "prefixes", value.asInstanceOf[js.Any])
      
      inline def setPrefixesVarargs(value: Reference*): Self = StObject.set(x, "prefixes", js.Array(value*))
    }
  }
  
  @js.native
  trait Reference extends StObject {
    
    var bucket: String = js.native
    
    def child(path: String): Reference = js.native
    
    def delete(): js.Promise[Unit] = js.native
    
    var fullPath: String = js.native
    
    def getDownloadURL(): js.Promise[String] = js.native
    
    def getMetadata(): js.Promise[FullMetadata] = js.native
    
    def list(): js.Promise[ListResult] = js.native
    def list(options: ListOptions): js.Promise[ListResult] = js.native
    
    def listAll(): js.Promise[ListResult] = js.native
    
    var name: String = js.native
    
    var parent: Reference | Null = js.native
    
    def put(data: js.typedarray.ArrayBuffer): UploadTask = js.native
    def put(data: js.typedarray.ArrayBuffer, metadata: UploadMetadata): UploadTask = js.native
    def put(data: js.typedarray.Uint8Array): UploadTask = js.native
    def put(data: js.typedarray.Uint8Array, metadata: UploadMetadata): UploadTask = js.native
    def put(data: Blob): UploadTask = js.native
    def put(data: Blob, metadata: UploadMetadata): UploadTask = js.native
    
    def putString(data: String): UploadTask = js.native
    def putString(data: String, format: Unit, metadata: UploadMetadata): UploadTask = js.native
    def putString(data: String, format: StringFormat): UploadTask = js.native
    def putString(data: String, format: StringFormat, metadata: UploadMetadata): UploadTask = js.native
    
    var root: Reference = js.native
    
    var storage: FirebaseStorage = js.native
    
    def updateMetadata(metadata: SettableMetadata): js.Promise[FullMetadata] = js.native
  }
  
  trait SettableMetadata extends StObject {
    
    var cacheControl: js.UndefOr[String | Null] = js.undefined
    
    var contentDisposition: js.UndefOr[String | Null] = js.undefined
    
    var contentEncoding: js.UndefOr[String | Null] = js.undefined
    
    var contentLanguage: js.UndefOr[String | Null] = js.undefined
    
    var contentType: js.UndefOr[String | Null] = js.undefined
    
    var customMetadata: js.UndefOr[StringDictionary[String] | Null] = js.undefined
  }
  object SettableMetadata {
    
    inline def apply(): SettableMetadata = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SettableMetadata]
    }
    
    extension [Self <: SettableMetadata](x: Self) {
      
      inline def setCacheControl(value: String): Self = StObject.set(x, "cacheControl", value.asInstanceOf[js.Any])
      
      inline def setCacheControlNull: Self = StObject.set(x, "cacheControl", null)
      
      inline def setCacheControlUndefined: Self = StObject.set(x, "cacheControl", js.undefined)
      
      inline def setContentDisposition(value: String): Self = StObject.set(x, "contentDisposition", value.asInstanceOf[js.Any])
      
      inline def setContentDispositionNull: Self = StObject.set(x, "contentDisposition", null)
      
      inline def setContentDispositionUndefined: Self = StObject.set(x, "contentDisposition", js.undefined)
      
      inline def setContentEncoding(value: String): Self = StObject.set(x, "contentEncoding", value.asInstanceOf[js.Any])
      
      inline def setContentEncodingNull: Self = StObject.set(x, "contentEncoding", null)
      
      inline def setContentEncodingUndefined: Self = StObject.set(x, "contentEncoding", js.undefined)
      
      inline def setContentLanguage(value: String): Self = StObject.set(x, "contentLanguage", value.asInstanceOf[js.Any])
      
      inline def setContentLanguageNull: Self = StObject.set(x, "contentLanguage", null)
      
      inline def setContentLanguageUndefined: Self = StObject.set(x, "contentLanguage", js.undefined)
      
      inline def setContentType(value: String): Self = StObject.set(x, "contentType", value.asInstanceOf[js.Any])
      
      inline def setContentTypeNull: Self = StObject.set(x, "contentType", null)
      
      inline def setContentTypeUndefined: Self = StObject.set(x, "contentType", js.undefined)
      
      inline def setCustomMetadata(value: StringDictionary[String]): Self = StObject.set(x, "customMetadata", value.asInstanceOf[js.Any])
      
      inline def setCustomMetadataNull: Self = StObject.set(x, "customMetadata", null)
      
      inline def setCustomMetadataUndefined: Self = StObject.set(x, "customMetadata", js.undefined)
    }
  }
  
  trait StorageObserver[T] extends StObject {
    
    var complete: js.UndefOr[CompleteFn | Null] = js.undefined
    
    var error: js.UndefOr[js.Function1[/* error */ FirebaseStorageError, Unit | Null]] = js.undefined
    
    var next: js.UndefOr[NextFn[T] | Null] = js.undefined
  }
  object StorageObserver {
    
    inline def apply[T](): StorageObserver[T] = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[StorageObserver[T]]
    }
    
    extension [Self <: StorageObserver[?], T](x: Self & StorageObserver[T]) {
      
      inline def setComplete(value: Callback): Self = StObject.set(x, "complete", value.toJsFn)
      
      inline def setCompleteNull: Self = StObject.set(x, "complete", null)
      
      inline def setCompleteUndefined: Self = StObject.set(x, "complete", js.undefined)
      
      inline def setError(value: /* error */ FirebaseStorageError => Unit | Null): Self = StObject.set(x, "error", js.Any.fromFunction1(value))
      
      inline def setErrorUndefined: Self = StObject.set(x, "error", js.undefined)
      
      inline def setNext(value: T => Callback): Self = StObject.set(x, "next", js.Any.fromFunction1((t0: T) => value(t0).runNow()))
      
      inline def setNextNull: Self = StObject.set(x, "next", null)
      
      inline def setNextUndefined: Self = StObject.set(x, "next", js.undefined)
    }
  }
  
  type StringFormat = String
  
  type TaskEvent = String
  
  type TaskState = String
  
  trait UploadMetadata
    extends StObject
       with SettableMetadata {
    
    var md5Hash: js.UndefOr[String | Null] = js.undefined
  }
  object UploadMetadata {
    
    inline def apply(): UploadMetadata = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[UploadMetadata]
    }
    
    extension [Self <: UploadMetadata](x: Self) {
      
      inline def setMd5Hash(value: String): Self = StObject.set(x, "md5Hash", value.asInstanceOf[js.Any])
      
      inline def setMd5HashNull: Self = StObject.set(x, "md5Hash", null)
      
      inline def setMd5HashUndefined: Self = StObject.set(x, "md5Hash", js.undefined)
    }
  }
  
  @js.native
  trait UploadTask extends StObject {
    
    def cancel(): Boolean = js.native
    
    def `catch`(onRejected: js.Function1[/* error */ FirebaseStorageError, Any]): js.Promise[Any] = js.native
    
    def on(event: TaskEvent): js.Function = js.native
    def on(event: TaskEvent, nextOrObserver: js.Function1[/* snapshot */ UploadTaskSnapshot, Any]): js.Function = js.native
    def on(
      event: TaskEvent,
      nextOrObserver: js.Function1[/* snapshot */ UploadTaskSnapshot, Any],
      error: js.Function1[/* a */ FirebaseStorageError, Any]
    ): js.Function = js.native
    def on(
      event: TaskEvent,
      nextOrObserver: js.Function1[/* snapshot */ UploadTaskSnapshot, Any],
      error: js.Function1[/* a */ FirebaseStorageError, Any],
      complete: Unsubscribe
    ): js.Function = js.native
    def on(
      event: TaskEvent,
      nextOrObserver: js.Function1[/* snapshot */ UploadTaskSnapshot, Any],
      error: Null,
      complete: Unsubscribe
    ): js.Function = js.native
    def on(
      event: TaskEvent,
      nextOrObserver: js.Function1[/* snapshot */ UploadTaskSnapshot, Any],
      error: Unit,
      complete: Unsubscribe
    ): js.Function = js.native
    def on(event: TaskEvent, nextOrObserver: Null, error: js.Function1[/* a */ FirebaseStorageError, Any]): js.Function = js.native
    def on(
      event: TaskEvent,
      nextOrObserver: Null,
      error: js.Function1[/* a */ FirebaseStorageError, Any],
      complete: Unsubscribe
    ): js.Function = js.native
    def on(event: TaskEvent, nextOrObserver: Null, error: Null, complete: Unsubscribe): js.Function = js.native
    def on(event: TaskEvent, nextOrObserver: Null, error: Unit, complete: Unsubscribe): js.Function = js.native
    def on(event: TaskEvent, nextOrObserver: Unit, error: js.Function1[/* a */ FirebaseStorageError, Any]): js.Function = js.native
    def on(
      event: TaskEvent,
      nextOrObserver: Unit,
      error: js.Function1[/* a */ FirebaseStorageError, Any],
      complete: Unsubscribe
    ): js.Function = js.native
    def on(event: TaskEvent, nextOrObserver: Unit, error: Null, complete: Unsubscribe): js.Function = js.native
    def on(event: TaskEvent, nextOrObserver: Unit, error: Unit, complete: Unsubscribe): js.Function = js.native
    def on(event: TaskEvent, nextOrObserver: StorageObserver[UploadTaskSnapshot]): js.Function = js.native
    def on(
      event: TaskEvent,
      nextOrObserver: StorageObserver[UploadTaskSnapshot],
      error: js.Function1[/* a */ FirebaseStorageError, Any]
    ): js.Function = js.native
    def on(
      event: TaskEvent,
      nextOrObserver: StorageObserver[UploadTaskSnapshot],
      error: js.Function1[/* a */ FirebaseStorageError, Any],
      complete: Unsubscribe
    ): js.Function = js.native
    def on(
      event: TaskEvent,
      nextOrObserver: StorageObserver[UploadTaskSnapshot],
      error: Null,
      complete: Unsubscribe
    ): js.Function = js.native
    def on(
      event: TaskEvent,
      nextOrObserver: StorageObserver[UploadTaskSnapshot],
      error: Unit,
      complete: Unsubscribe
    ): js.Function = js.native
    
    def pause(): Boolean = js.native
    
    def resume(): Boolean = js.native
    
    var snapshot: UploadTaskSnapshot = js.native
    
    def `then`(): js.Promise[Any] = js.native
    def `then`(onFulfilled: js.Function1[/* snapshot */ UploadTaskSnapshot, Any]): js.Promise[Any] = js.native
    def `then`(
      onFulfilled: js.Function1[/* snapshot */ UploadTaskSnapshot, Any],
      onRejected: js.Function1[/* error */ FirebaseStorageError, Any]
    ): js.Promise[Any] = js.native
    def `then`(onFulfilled: Null, onRejected: js.Function1[/* error */ FirebaseStorageError, Any]): js.Promise[Any] = js.native
    def `then`(onFulfilled: Unit, onRejected: js.Function1[/* error */ FirebaseStorageError, Any]): js.Promise[Any] = js.native
  }
  
  trait UploadTaskSnapshot extends StObject {
    
    var bytesTransferred: Double
    
    var metadata: FullMetadata
    
    var ref: Reference
    
    var state: TaskState
    
    var task: UploadTask
    
    var totalBytes: Double
  }
  object UploadTaskSnapshot {
    
    inline def apply(
      bytesTransferred: Double,
      metadata: FullMetadata,
      ref: Reference,
      state: TaskState,
      task: UploadTask,
      totalBytes: Double
    ): UploadTaskSnapshot = {
      val __obj = js.Dynamic.literal(bytesTransferred = bytesTransferred.asInstanceOf[js.Any], metadata = metadata.asInstanceOf[js.Any], ref = ref.asInstanceOf[js.Any], state = state.asInstanceOf[js.Any], task = task.asInstanceOf[js.Any], totalBytes = totalBytes.asInstanceOf[js.Any])
      __obj.asInstanceOf[UploadTaskSnapshot]
    }
    
    extension [Self <: UploadTaskSnapshot](x: Self) {
      
      inline def setBytesTransferred(value: Double): Self = StObject.set(x, "bytesTransferred", value.asInstanceOf[js.Any])
      
      inline def setMetadata(value: FullMetadata): Self = StObject.set(x, "metadata", value.asInstanceOf[js.Any])
      
      inline def setRef(value: Reference): Self = StObject.set(x, "ref", value.asInstanceOf[js.Any])
      
      inline def setState(value: TaskState): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
      
      inline def setTask(value: UploadTask): Self = StObject.set(x, "task", value.asInstanceOf[js.Any])
      
      inline def setTotalBytes(value: Double): Self = StObject.set(x, "totalBytes", value.asInstanceOf[js.Any])
    }
  }
  
  /* augmented module */
  object firebaseComponentAugmentingMod {
    
    trait NameServiceMapping extends StObject {
      
      var `storage-compat`: FirebaseStorage
    }
    object NameServiceMapping {
      
      inline def apply(`storage-compat`: FirebaseStorage): NameServiceMapping = {
        val __obj = js.Dynamic.literal()
        __obj.updateDynamic("storage-compat")(`storage-compat`.asInstanceOf[js.Any])
        __obj.asInstanceOf[NameServiceMapping]
      }
      
      extension [Self <: NameServiceMapping](x: Self) {
        
        inline def `setStorage-compat`(value: FirebaseStorage): Self = StObject.set(x, "storage-compat", value.asInstanceOf[js.Any])
      }
    }
  }
}
