package typingsJapgolly.i18next.mod

import typingsJapgolly.i18next.i18nextStrings.backend
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BackendModule[TOptions]
  extends StObject
     with Module {
  
  /** Save the missing translation */
  var create: js.UndefOr[
    js.Function4[
      /* languages */ js.Array[String], 
      /* namespace */ String, 
      /* key */ String, 
      /* fallbackValue */ String, 
      Unit
    ]
  ] = js.undefined
  
  def init(services: Services, backendOptions: TOptions, i18nextOptions: InitOptions): Unit
  
  def read(language: String, namespace: String, callback: ReadCallback): Unit
  
  /** Load multiple languages and namespaces. For backends supporting multiple resources loading */
  var readMulti: js.UndefOr[
    js.Function3[
      /* languages */ js.Array[String], 
      /* namespaces */ js.Array[String], 
      /* callback */ MultiReadCallback, 
      Unit
    ]
  ] = js.undefined
  
  /** Store the translation. For backends acting as cache layer */
  var save: js.UndefOr[
    js.Function3[/* language */ String, /* namespace */ String, /* data */ ResourceLanguage, Unit]
  ] = js.undefined
  
  @JSName("type")
  var type_BackendModule: backend
}
object BackendModule {
  
  inline def apply[TOptions](
    init: (Services, TOptions, InitOptions) => japgolly.scalajs.react.Callback,
    read: (String, String, ReadCallback) => japgolly.scalajs.react.Callback
  ): BackendModule[TOptions] = {
    val __obj = js.Dynamic.literal(init = js.Any.fromFunction3((t0: Services, t1: TOptions, t2: InitOptions) => (init(t0, t1, t2)).runNow()), read = js.Any.fromFunction3((t0: String, t1: String, t2: ReadCallback) => (read(t0, t1, t2)).runNow()))
    __obj.updateDynamic("type")("backend")
    __obj.asInstanceOf[BackendModule[TOptions]]
  }
  
  extension [Self <: BackendModule[?], TOptions](x: Self & BackendModule[TOptions]) {
    
    inline def setCreate(
      value: (/* languages */ js.Array[String], /* namespace */ String, /* key */ String, /* fallbackValue */ String) => japgolly.scalajs.react.Callback
    ): Self = StObject.set(x, "create", js.Any.fromFunction4((t0: /* languages */ js.Array[String], t1: /* namespace */ String, t2: /* key */ String, t3: /* fallbackValue */ String) => (value(t0, t1, t2, t3)).runNow()))
    
    inline def setCreateUndefined: Self = StObject.set(x, "create", js.undefined)
    
    inline def setInit(value: (Services, TOptions, InitOptions) => japgolly.scalajs.react.Callback): Self = StObject.set(x, "init", js.Any.fromFunction3((t0: Services, t1: TOptions, t2: InitOptions) => (value(t0, t1, t2)).runNow()))
    
    inline def setRead(value: (String, String, ReadCallback) => japgolly.scalajs.react.Callback): Self = StObject.set(x, "read", js.Any.fromFunction3((t0: String, t1: String, t2: ReadCallback) => (value(t0, t1, t2)).runNow()))
    
    inline def setReadMulti(
      value: (/* languages */ js.Array[String], /* namespaces */ js.Array[String], /* callback */ MultiReadCallback) => japgolly.scalajs.react.Callback
    ): Self = StObject.set(x, "readMulti", js.Any.fromFunction3((t0: /* languages */ js.Array[String], t1: /* namespaces */ js.Array[String], t2: /* callback */ MultiReadCallback) => (value(t0, t1, t2)).runNow()))
    
    inline def setReadMultiUndefined: Self = StObject.set(x, "readMulti", js.undefined)
    
    inline def setSave(
      value: (/* language */ String, /* namespace */ String, /* data */ ResourceLanguage) => japgolly.scalajs.react.Callback
    ): Self = StObject.set(x, "save", js.Any.fromFunction3((t0: /* language */ String, t1: /* namespace */ String, t2: /* data */ ResourceLanguage) => (value(t0, t1, t2)).runNow()))
    
    inline def setSaveUndefined: Self = StObject.set(x, "save", js.undefined)
    
    inline def setType(value: backend): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
