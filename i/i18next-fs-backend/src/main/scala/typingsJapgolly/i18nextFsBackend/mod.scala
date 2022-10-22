package typingsJapgolly.i18nextFsBackend

import japgolly.scalajs.react.Callback
import typingsJapgolly.i18next.mod.BackendModule
import typingsJapgolly.i18next.mod.InitOptions
import typingsJapgolly.i18next.mod.ModuleType
import typingsJapgolly.i18next.mod.ReadCallback
import typingsJapgolly.i18next.mod.Services
import typingsJapgolly.i18nextFsBackend.i18nextFsBackendStrings.backend
import typingsJapgolly.i18nextFsBackend.mod.i18nextFsBackend.i18nextFsBackendOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("i18next-fs-backend", JSImport.Default)
  @js.native
  open class default protected ()
    extends StObject
       with Backend {
    def this(services: Services, backendOptions: i18nextFsBackendOptions, i18nextOptions: InitOptions) = this()
    
    /* CompleteClass */
    @JSName("create")
    override def create_MBackend(languages: js.Array[String], namespace: String, key: String, fallbackValue: String): Unit = js.native
    
    /* CompleteClass */
    override def init(services: Services, backendOptions: i18nextFsBackendOptions, i18nextOptions: InitOptions): Unit = js.native
    
    /* CompleteClass */
    override def queue(lng: String, namespace: String, key: String, fallbackValue: String, callback: Any): Unit = js.native
    
    /* CompleteClass */
    override def read(language: String, namespace: String, callback: ReadCallback): Unit = js.native
    
    /* CompleteClass */
    var `type`: ModuleType = js.native
    /* CompleteClass */
    @JSName("type")
    var type_Backend: backend = js.native
    /* CompleteClass */
    @JSName("type")
    var type_BackendModule: typingsJapgolly.i18next.i18nextStrings.backend = js.native
    
    /* CompleteClass */
    override def write(): Unit = js.native
    
    /* CompleteClass */
    override def writeFile(lng: String, namespace: String): Unit = js.native
  }
  /* static members */
  object default {
    
    @JSImport("i18next-fs-backend", "default.type")
    @js.native
    val `type`: backend = js.native
  }
  
  trait Backend
    extends StObject
       with BackendModule[i18nextFsBackendOptions] {
    
    @JSName("create")
    def create_MBackend(languages: js.Array[String], namespace: String, key: String, fallbackValue: String): Unit
    
    def queue(lng: String, namespace: String, key: String, fallbackValue: String, callback: Any): Unit
    
    @JSName("type")
    var type_Backend: backend
    
    def write(): Unit
    
    def writeFile(lng: String, namespace: String): Unit
  }
  object Backend {
    
    inline def apply(
      create: (js.Array[String], String, String, String) => Callback,
      init: (Services, i18nextFsBackendOptions, InitOptions) => Callback,
      queue: (String, String, String, String, Any) => Callback,
      read: (String, String, ReadCallback) => Callback,
      write: Callback,
      writeFile: (String, String) => Callback
    ): Backend = {
      val __obj = js.Dynamic.literal(create = js.Any.fromFunction4((t0: js.Array[String], t1: String, t2: String, t3: String) => (create(t0, t1, t2, t3)).runNow()), init = js.Any.fromFunction3((t0: Services, t1: i18nextFsBackendOptions, t2: InitOptions) => (init(t0, t1, t2)).runNow()), queue = js.Any.fromFunction5((t0: String, t1: String, t2: String, t3: String, t4: Any) => (queue(t0, t1, t2, t3, t4)).runNow()), read = js.Any.fromFunction3((t0: String, t1: String, t2: ReadCallback) => (read(t0, t1, t2)).runNow()), write = write.toJsFn, writeFile = js.Any.fromFunction2((t0: String, t1: String) => (writeFile(t0, t1)).runNow()))
      __obj.updateDynamic("type")("backend")
      __obj.asInstanceOf[Backend]
    }
    
    extension [Self <: Backend](x: Self) {
      
      inline def setCreate(value: (js.Array[String], String, String, String) => Callback): Self = StObject.set(x, "create", js.Any.fromFunction4((t0: js.Array[String], t1: String, t2: String, t3: String) => (value(t0, t1, t2, t3)).runNow()))
      
      inline def setQueue(value: (String, String, String, String, Any) => Callback): Self = StObject.set(x, "queue", js.Any.fromFunction5((t0: String, t1: String, t2: String, t3: String, t4: Any) => (value(t0, t1, t2, t3, t4)).runNow()))
      
      inline def setType(value: backend): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setWrite(value: Callback): Self = StObject.set(x, "write", value.toJsFn)
      
      inline def setWriteFile(value: (String, String) => Callback): Self = StObject.set(x, "writeFile", js.Any.fromFunction2((t0: String, t1: String) => (value(t0, t1)).runNow()))
    }
  }
  
  object i18next {
    
    trait InitOptions extends StObject {
      
      var backend: js.UndefOr[i18nextFsBackendOptions] = js.undefined
    }
    object InitOptions {
      
      inline def apply(): typingsJapgolly.i18nextFsBackend.mod.i18next.InitOptions = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[typingsJapgolly.i18nextFsBackend.mod.i18next.InitOptions]
      }
      
      extension [Self <: typingsJapgolly.i18nextFsBackend.mod.i18next.InitOptions](x: Self) {
        
        inline def setBackend(value: i18nextFsBackendOptions): Self = StObject.set(x, "backend", value.asInstanceOf[js.Any])
        
        inline def setBackendUndefined: Self = StObject.set(x, "backend", js.undefined)
      }
    }
  }
  
  object i18nextFsBackend {
    
    trait i18nextFsBackendOptions extends StObject {
      
      var addPath: js.UndefOr[String] = js.undefined
      
      var ident: js.UndefOr[Double] = js.undefined
      
      var loadPath: js.UndefOr[String | loadPathFunction] = js.undefined
      
      var parse: js.UndefOr[js.Function1[/* data */ String, Any]] = js.undefined
      
      var stringify: js.UndefOr[js.Function1[/* data */ Any, String]] = js.undefined
    }
    object i18nextFsBackendOptions {
      
      inline def apply(): i18nextFsBackendOptions = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[i18nextFsBackendOptions]
      }
      
      extension [Self <: i18nextFsBackendOptions](x: Self) {
        
        inline def setAddPath(value: String): Self = StObject.set(x, "addPath", value.asInstanceOf[js.Any])
        
        inline def setAddPathUndefined: Self = StObject.set(x, "addPath", js.undefined)
        
        inline def setIdent(value: Double): Self = StObject.set(x, "ident", value.asInstanceOf[js.Any])
        
        inline def setIdentUndefined: Self = StObject.set(x, "ident", js.undefined)
        
        inline def setLoadPath(value: String | loadPathFunction): Self = StObject.set(x, "loadPath", value.asInstanceOf[js.Any])
        
        inline def setLoadPathFunction2(value: (/* language */ String, /* namespace */ String) => String): Self = StObject.set(x, "loadPath", js.Any.fromFunction2(value))
        
        inline def setLoadPathUndefined: Self = StObject.set(x, "loadPath", js.undefined)
        
        inline def setParse(value: /* data */ String => Any): Self = StObject.set(x, "parse", js.Any.fromFunction1(value))
        
        inline def setParseUndefined: Self = StObject.set(x, "parse", js.undefined)
        
        inline def setStringify(value: /* data */ Any => String): Self = StObject.set(x, "stringify", js.Any.fromFunction1(value))
        
        inline def setStringifyUndefined: Self = StObject.set(x, "stringify", js.undefined)
      }
    }
    
    type loadPathFunction = js.Function2[/* language */ String, /* namespace */ String, String]
  }
}
