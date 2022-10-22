package typingsJapgolly.axiosCancel

import japgolly.scalajs.react.Callback
import typingsJapgolly.axios.mod.AxiosStatic
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("axios-cancel", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(axiosStatic: AxiosStatic): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(axiosStatic.asInstanceOf[js.Any]).asInstanceOf[Unit]
  inline def default(axiosStatic: AxiosStatic, options: AxiosCancelOptions): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(axiosStatic.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  trait AxiosCancelOptions extends StObject {
    
    /**
      * Enables logging
      * default: false
      */
    var debug: Boolean
  }
  object AxiosCancelOptions {
    
    inline def apply(debug: Boolean): AxiosCancelOptions = {
      val __obj = js.Dynamic.literal(debug = debug.asInstanceOf[js.Any])
      __obj.asInstanceOf[AxiosCancelOptions]
    }
    
    extension [Self <: AxiosCancelOptions](x: Self) {
      
      inline def setDebug(value: Boolean): Self = StObject.set(x, "debug", value.asInstanceOf[js.Any])
    }
  }
  
  /* augmented module */
  object axiosAugmentingMod {
    
    trait AxiosRequestConfig extends StObject {
      
      var requestId: js.UndefOr[String] = js.undefined
    }
    object AxiosRequestConfig {
      
      inline def apply(): AxiosRequestConfig = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[AxiosRequestConfig]
      }
      
      extension [Self <: AxiosRequestConfig](x: Self) {
        
        inline def setRequestId(value: String): Self = StObject.set(x, "requestId", value.asInstanceOf[js.Any])
        
        inline def setRequestIdUndefined: Self = StObject.set(x, "requestId", js.undefined)
      }
    }
    
    trait AxiosStatic extends StObject {
      
      def cancel(requestId: String): Unit
      
      def cancelAll(): Unit
    }
    object AxiosStatic {
      
      inline def apply(cancel: String => Callback, cancelAll: Callback): typingsJapgolly.axiosCancel.mod.axiosAugmentingMod.AxiosStatic = {
        val __obj = js.Dynamic.literal(cancel = js.Any.fromFunction1((t0: String) => cancel(t0).runNow()), cancelAll = cancelAll.toJsFn)
        __obj.asInstanceOf[typingsJapgolly.axiosCancel.mod.axiosAugmentingMod.AxiosStatic]
      }
      
      extension [Self <: typingsJapgolly.axiosCancel.mod.axiosAugmentingMod.AxiosStatic](x: Self) {
        
        inline def setCancel(value: String => Callback): Self = StObject.set(x, "cancel", js.Any.fromFunction1((t0: String) => value(t0).runNow()))
        
        inline def setCancelAll(value: Callback): Self = StObject.set(x, "cancelAll", value.toJsFn)
      }
    }
  }
}
