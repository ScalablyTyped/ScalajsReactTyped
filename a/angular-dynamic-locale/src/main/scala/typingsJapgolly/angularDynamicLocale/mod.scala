package typingsJapgolly.angularDynamicLocale

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.angular.mod.ILocaleService
import typingsJapgolly.angular.mod.IPromise
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  object tmh {
    
    trait IDynamicLocale extends StObject {
      
      def get(): String
      
      def set(locale: String): IPromise[ILocaleService]
    }
    object IDynamicLocale {
      
      inline def apply(get: CallbackTo[String], set: String => IPromise[ILocaleService]): IDynamicLocale = {
        val __obj = js.Dynamic.literal(get = get.toJsFn, set = js.Any.fromFunction1(set))
        __obj.asInstanceOf[IDynamicLocale]
      }
      
      extension [Self <: IDynamicLocale](x: Self) {
        
        inline def setGet(value: CallbackTo[String]): Self = StObject.set(x, "get", value.toJsFn)
        
        inline def setSet(value: String => IPromise[ILocaleService]): Self = StObject.set(x, "set", js.Any.fromFunction1(value))
      }
    }
    
    trait IDynamicLocaleProvider extends StObject {
      
      def defaultLocale(locale: String): Unit
      
      def localeLocationPattern(locationPattern: String): Unit
    }
    object IDynamicLocaleProvider {
      
      inline def apply(defaultLocale: String => Callback, localeLocationPattern: String => Callback): IDynamicLocaleProvider = {
        val __obj = js.Dynamic.literal(defaultLocale = js.Any.fromFunction1((t0: String) => defaultLocale(t0).runNow()), localeLocationPattern = js.Any.fromFunction1((t0: String) => localeLocationPattern(t0).runNow()))
        __obj.asInstanceOf[IDynamicLocaleProvider]
      }
      
      extension [Self <: IDynamicLocaleProvider](x: Self) {
        
        inline def setDefaultLocale(value: String => Callback): Self = StObject.set(x, "defaultLocale", js.Any.fromFunction1((t0: String) => value(t0).runNow()))
        
        inline def setLocaleLocationPattern(value: String => Callback): Self = StObject.set(x, "localeLocationPattern", js.Any.fromFunction1((t0: String) => value(t0).runNow()))
      }
    }
  }
}
