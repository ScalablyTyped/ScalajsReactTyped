package typingsJapgolly.uploadcare

import japgolly.scalajs.react.Callback
import typingsJapgolly.node.fsMod.ReadStream
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait File extends StObject {
    
    var file: String
  }
  object File {
    
    inline def apply(file: String): File = {
      val __obj = js.Dynamic.literal(file = file.asInstanceOf[js.Any])
      __obj.asInstanceOf[File]
    }
    
    extension [Self <: File](x: Self) {
      
      inline def setFile(value: String): Self = StObject.set(x, "file", value.asInstanceOf[js.Any])
    }
  }
  
  trait FromUrl extends StObject {
    
    def fromUrl(
      url: String,
      options: Store,
      callback: js.Function2[/* err */ js.Error, /* res */ typingsJapgolly.uploadcare.mod.File, Unit]
    ): Unit
    
    def upload(
      readStream: ReadStream,
      options: Store,
      callback: js.Function2[/* err */ js.Error, /* res */ File, Unit]
    ): Unit
  }
  object FromUrl {
    
    inline def apply(
      fromUrl: (String, Store, js.Function2[/* err */ js.Error, /* res */ typingsJapgolly.uploadcare.mod.File, Unit]) => Callback,
      upload: (ReadStream, Store, js.Function2[/* err */ js.Error, /* res */ File, Unit]) => Callback
    ): FromUrl = {
      val __obj = js.Dynamic.literal(fromUrl = js.Any.fromFunction3((t0: String, t1: Store, t2: js.Function2[/* err */ js.Error, /* res */ typingsJapgolly.uploadcare.mod.File, Unit]) => (fromUrl(t0, t1, t2)).runNow()), upload = js.Any.fromFunction3((t0: ReadStream, t1: Store, t2: js.Function2[/* err */ js.Error, /* res */ File, Unit]) => (upload(t0, t1, t2)).runNow()))
      __obj.asInstanceOf[FromUrl]
    }
    
    extension [Self <: FromUrl](x: Self) {
      
      inline def setFromUrl(
        value: (String, Store, js.Function2[/* err */ js.Error, /* res */ typingsJapgolly.uploadcare.mod.File, Unit]) => Callback
      ): Self = StObject.set(x, "fromUrl", js.Any.fromFunction3((t0: String, t1: Store, t2: js.Function2[/* err */ js.Error, /* res */ typingsJapgolly.uploadcare.mod.File, Unit]) => (value(t0, t1, t2)).runNow()))
      
      inline def setUpload(value: (ReadStream, Store, js.Function2[/* err */ js.Error, /* res */ File, Unit]) => Callback): Self = StObject.set(x, "upload", js.Any.fromFunction3((t0: ReadStream, t1: Store, t2: js.Function2[/* err */ js.Error, /* res */ File, Unit]) => (value(t0, t1, t2)).runNow()))
    }
  }
  
  trait Remove extends StObject {
    
    def remove(
      uuid: String,
      callback: js.Function2[/* err */ js.Error, /* res */ typingsJapgolly.uploadcare.mod.File, Unit]
    ): Unit
    
    def store(
      uuid: String,
      callback: js.Function2[/* err */ js.Error, /* res */ typingsJapgolly.uploadcare.mod.File, Unit]
    ): Unit
  }
  object Remove {
    
    inline def apply(
      remove: (String, js.Function2[/* err */ js.Error, /* res */ typingsJapgolly.uploadcare.mod.File, Unit]) => Callback,
      store: (String, js.Function2[/* err */ js.Error, /* res */ typingsJapgolly.uploadcare.mod.File, Unit]) => Callback
    ): Remove = {
      val __obj = js.Dynamic.literal(remove = js.Any.fromFunction2((t0: String, t1: js.Function2[/* err */ js.Error, /* res */ typingsJapgolly.uploadcare.mod.File, Unit]) => (remove(t0, t1)).runNow()), store = js.Any.fromFunction2((t0: String, t1: js.Function2[/* err */ js.Error, /* res */ typingsJapgolly.uploadcare.mod.File, Unit]) => (store(t0, t1)).runNow()))
      __obj.asInstanceOf[Remove]
    }
    
    extension [Self <: Remove](x: Self) {
      
      inline def setRemove(
        value: (String, js.Function2[/* err */ js.Error, /* res */ typingsJapgolly.uploadcare.mod.File, Unit]) => Callback
      ): Self = StObject.set(x, "remove", js.Any.fromFunction2((t0: String, t1: js.Function2[/* err */ js.Error, /* res */ typingsJapgolly.uploadcare.mod.File, Unit]) => (value(t0, t1)).runNow()))
      
      inline def setStore(
        value: (String, js.Function2[/* err */ js.Error, /* res */ typingsJapgolly.uploadcare.mod.File, Unit]) => Callback
      ): Self = StObject.set(x, "store", js.Any.fromFunction2((t0: String, t1: js.Function2[/* err */ js.Error, /* res */ typingsJapgolly.uploadcare.mod.File, Unit]) => (value(t0, t1)).runNow()))
    }
  }
  
  trait Store extends StObject {
    
    var store: js.UndefOr[Boolean] = js.undefined
  }
  object Store {
    
    inline def apply(): Store = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Store]
    }
    
    extension [Self <: Store](x: Self) {
      
      inline def setStore(value: Boolean): Self = StObject.set(x, "store", value.asInstanceOf[js.Any])
      
      inline def setStoreUndefined: Self = StObject.set(x, "store", js.undefined)
    }
  }
}
