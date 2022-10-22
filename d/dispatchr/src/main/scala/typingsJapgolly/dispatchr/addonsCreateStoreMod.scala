package typingsJapgolly.dispatchr

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.dispatchr.dispatchrStrings.handlers
import typingsJapgolly.dispatchr.dispatchrStrings.mixins
import typingsJapgolly.dispatchr.dispatchrStrings.statics
import typingsJapgolly.dispatchr.dispatchrStrings.storeName
import typingsJapgolly.dispatchr.mod.Store
import typingsJapgolly.dispatchr.mod.StoreClass
import typingsJapgolly.std.Pick
import typingsJapgolly.std.ThisType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object addonsCreateStoreMod {
  
  inline def apply[T /* <: StoreOptions */](options: T & ThisType[StoreThis[T]]): StoreClass = ^.asInstanceOf[js.Dynamic].apply(options.asInstanceOf[js.Any]).asInstanceOf[StoreClass]
  
  @JSImport("dispatchr/addons/createStore", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  type Omit[T, K /* <: /* keyof T */ String */] = Pick[
    T, 
    /* import warning: importer.ImportType#apply Failed type conversion: {[ P in keyof T ]: P} & {[ P in K ]: never} & {[x: string] : never, [x: number] : never}[keyof T] */ js.Any
  ]
  
  trait StoreOptions extends StObject {
    
    var dehydrate: js.UndefOr[js.Function0[Any]] = js.undefined
    
    var handlers: StringDictionary[String]
    
    var initialize: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    var mixins: js.UndefOr[js.Array[js.Object]] = js.undefined
    
    var rehydrate: js.UndefOr[js.Function1[/* state */ Any, Unit]] = js.undefined
    
    var statics: js.UndefOr[StringDictionary[Any]] = js.undefined
    
    var storeName: String
  }
  object StoreOptions {
    
    inline def apply(handlers: StringDictionary[String], storeName: String): StoreOptions = {
      val __obj = js.Dynamic.literal(handlers = handlers.asInstanceOf[js.Any], storeName = storeName.asInstanceOf[js.Any])
      __obj.asInstanceOf[StoreOptions]
    }
    
    extension [Self <: StoreOptions](x: Self) {
      
      inline def setDehydrate(value: CallbackTo[Any]): Self = StObject.set(x, "dehydrate", value.toJsFn)
      
      inline def setDehydrateUndefined: Self = StObject.set(x, "dehydrate", js.undefined)
      
      inline def setHandlers(value: StringDictionary[String]): Self = StObject.set(x, "handlers", value.asInstanceOf[js.Any])
      
      inline def setInitialize(value: Callback): Self = StObject.set(x, "initialize", value.toJsFn)
      
      inline def setInitializeUndefined: Self = StObject.set(x, "initialize", js.undefined)
      
      inline def setMixins(value: js.Array[js.Object]): Self = StObject.set(x, "mixins", value.asInstanceOf[js.Any])
      
      inline def setMixinsUndefined: Self = StObject.set(x, "mixins", js.undefined)
      
      inline def setMixinsVarargs(value: js.Object*): Self = StObject.set(x, "mixins", js.Array(value*))
      
      inline def setRehydrate(value: /* state */ Any => Callback): Self = StObject.set(x, "rehydrate", js.Any.fromFunction1((t0: /* state */ Any) => value(t0).runNow()))
      
      inline def setRehydrateUndefined: Self = StObject.set(x, "rehydrate", js.undefined)
      
      inline def setStatics(value: StringDictionary[Any]): Self = StObject.set(x, "statics", value.asInstanceOf[js.Any])
      
      inline def setStaticsUndefined: Self = StObject.set(x, "statics", js.undefined)
      
      inline def setStoreName(value: String): Self = StObject.set(x, "storeName", value.asInstanceOf[js.Any])
    }
  }
  
  // see: https://github.com/yahoo/fluxible/blob/dispatchr-v1.2.0/packages/dispatchr/addons/createStore.js#L9
  type StoreThis[T /* <: StoreOptions */] = (Omit[T, statics | storeName | handlers | mixins]) & Store[js.Object]
}
