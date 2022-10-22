package typingsJapgolly.firebaseStorageCompat

import org.scalajs.dom.Blob
import typingsJapgolly.firebaseAppTypes.privateMod.FirebaseNamespace
import typingsJapgolly.firebaseStorage.mod.FullMetadata
import typingsJapgolly.firebaseStorage.mod.ListOptions
import typingsJapgolly.firebaseStorage.mod.ListResult
import typingsJapgolly.firebaseStorage.mod.SettableMetadata
import typingsJapgolly.firebaseStorage.mod.StorageReference
import typingsJapgolly.firebaseStorage.mod.StringFormat
import typingsJapgolly.firebaseStorage.mod.UploadMetadata
import typingsJapgolly.firebaseStorage.mod.UploadResult
import typingsJapgolly.firebaseStorage.mod.UploadTask
import typingsJapgolly.firebaseStorageCompat.anon.Call
import typingsJapgolly.firebaseStorageCompat.anon.MockUserToken
import typingsJapgolly.firebaseStorageCompat.mod.firebaseAppCompatAugmentingMod.FirebaseApp
import typingsJapgolly.firebaseStorageTypes.mod.FirebaseStorage
import typingsJapgolly.firebaseStorageTypes.mod.Reference
import typingsJapgolly.node.NodeJS.ReadableStream
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@firebase/storage-compat", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  /* augmented module */
  object firebaseStorageAugmentingMod {
    
    @JSImport("@firebase/storage", JSImport.Namespace)
    @js.native
    val ^ : js.Any = js.native
    
    inline def connectStorageEmulator(storage: FirebaseStorage, host: String, port: Double, options: js.UndefOr[MockUserToken]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("connectStorageEmulator")(storage.asInstanceOf[js.Any], host.asInstanceOf[js.Any], port.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    inline def deleteObject(ref: Reference): js.Promise[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("deleteObject")(ref.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Unit]]
    
    inline def getBlob(ref: Reference, maxDownloadSizeBytes: js.UndefOr[Double]): js.Promise[Blob] = (^.asInstanceOf[js.Dynamic].applyDynamic("getBlob")(ref.asInstanceOf[js.Any], maxDownloadSizeBytes.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Blob]]
    
    inline def getBytes(ref: Reference, maxDownloadSizeBytes: js.UndefOr[Double]): js.Promise[js.typedarray.ArrayBuffer] = (^.asInstanceOf[js.Dynamic].applyDynamic("getBytes")(ref.asInstanceOf[js.Any], maxDownloadSizeBytes.asInstanceOf[js.Any])).asInstanceOf[js.Promise[js.typedarray.ArrayBuffer]]
    
    inline def getDownloadURL(ref: Reference): js.Promise[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("getDownloadURL")(ref.asInstanceOf[js.Any]).asInstanceOf[js.Promise[String]]
    
    inline def getMetadata(ref: Reference): js.Promise[FullMetadata] = ^.asInstanceOf[js.Dynamic].applyDynamic("getMetadata")(ref.asInstanceOf[js.Any]).asInstanceOf[js.Promise[FullMetadata]]
    
    inline def getStorage(app: js.UndefOr[FirebaseApp], bucketUrl: js.UndefOr[String]): typingsJapgolly.firebaseStorage.mod.FirebaseStorage = (^.asInstanceOf[js.Dynamic].applyDynamic("getStorage")(app.asInstanceOf[js.Any], bucketUrl.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.firebaseStorage.mod.FirebaseStorage]
    
    inline def getStream(ref: Reference, maxDownloadSizeBytes: js.UndefOr[Double]): ReadableStream = (^.asInstanceOf[js.Dynamic].applyDynamic("getStream")(ref.asInstanceOf[js.Any], maxDownloadSizeBytes.asInstanceOf[js.Any])).asInstanceOf[ReadableStream]
    
    inline def list(ref: Reference, options: js.UndefOr[ListOptions]): js.Promise[ListResult] = (^.asInstanceOf[js.Dynamic].applyDynamic("list")(ref.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[ListResult]]
    
    inline def listAll(ref: Reference): js.Promise[ListResult] = ^.asInstanceOf[js.Dynamic].applyDynamic("listAll")(ref.asInstanceOf[js.Any]).asInstanceOf[js.Promise[ListResult]]
    
    inline def ref(storage: FirebaseStorage, url: js.UndefOr[String]): StorageReference = (^.asInstanceOf[js.Dynamic].applyDynamic("ref")(storage.asInstanceOf[js.Any], url.asInstanceOf[js.Any])).asInstanceOf[StorageReference]
    
    inline def updateMetadata(ref: Reference, metadata: SettableMetadata): js.Promise[FullMetadata] = (^.asInstanceOf[js.Dynamic].applyDynamic("updateMetadata")(ref.asInstanceOf[js.Any], metadata.asInstanceOf[js.Any])).asInstanceOf[js.Promise[FullMetadata]]
    
    inline def uploadBytes(
      ref: Reference,
      data: Blob | js.typedarray.Uint8Array | js.typedarray.ArrayBuffer,
      metadata: js.UndefOr[UploadMetadata]
    ): js.Promise[UploadResult] = (^.asInstanceOf[js.Dynamic].applyDynamic("uploadBytes")(ref.asInstanceOf[js.Any], data.asInstanceOf[js.Any], metadata.asInstanceOf[js.Any])).asInstanceOf[js.Promise[UploadResult]]
    
    inline def uploadBytesResumable(
      ref: Reference,
      data: Blob | js.typedarray.Uint8Array | js.typedarray.ArrayBuffer,
      metadata: js.UndefOr[UploadMetadata]
    ): UploadTask = (^.asInstanceOf[js.Dynamic].applyDynamic("uploadBytesResumable")(ref.asInstanceOf[js.Any], data.asInstanceOf[js.Any], metadata.asInstanceOf[js.Any])).asInstanceOf[UploadTask]
    
    inline def uploadString(
      ref: Reference,
      value: String,
      format: js.UndefOr[StringFormat],
      metadata: js.UndefOr[UploadMetadata]
    ): js.Promise[UploadResult] = (^.asInstanceOf[js.Dynamic].applyDynamic("uploadString")(ref.asInstanceOf[js.Any], value.asInstanceOf[js.Any], format.asInstanceOf[js.Any], metadata.asInstanceOf[js.Any])).asInstanceOf[js.Promise[UploadResult]]
  }
  
  inline def registerStorage(instance: FirebaseNamespace): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("registerStorage")(instance.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  /**
    * Define extension behavior for `registerStorage`
    */
  /* augmented module */
  object firebaseAppCompatAugmentingMod {
    
    trait FirebaseApp extends StObject {
      
      var storage: js.UndefOr[js.Function1[/* storageBucket */ js.UndefOr[String], FirebaseStorage]] = js.undefined
    }
    object FirebaseApp {
      
      inline def apply(): FirebaseApp = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[FirebaseApp]
      }
      
      extension [Self <: FirebaseApp](x: Self) {
        
        inline def setStorage(value: /* storageBucket */ js.UndefOr[String] => FirebaseStorage): Self = StObject.set(x, "storage", js.Any.fromFunction1(value))
        
        inline def setStorageUndefined: Self = StObject.set(x, "storage", js.undefined)
      }
    }
    
    trait FirebaseNamespace extends StObject {
      
      var storage: js.UndefOr[Call] = js.undefined
    }
    object FirebaseNamespace {
      
      inline def apply(): typingsJapgolly.firebaseStorageCompat.mod.firebaseAppCompatAugmentingMod.FirebaseNamespace = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[typingsJapgolly.firebaseStorageCompat.mod.firebaseAppCompatAugmentingMod.FirebaseNamespace]
      }
      
      extension [Self <: typingsJapgolly.firebaseStorageCompat.mod.firebaseAppCompatAugmentingMod.FirebaseNamespace](x: Self) {
        
        inline def setStorage(value: Call): Self = StObject.set(x, "storage", value.asInstanceOf[js.Any])
        
        inline def setStorageUndefined: Self = StObject.set(x, "storage", js.undefined)
      }
    }
  }
}
