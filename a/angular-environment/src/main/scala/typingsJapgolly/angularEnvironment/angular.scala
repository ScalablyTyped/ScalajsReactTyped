package typingsJapgolly.angularEnvironment

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object angular {
  
  object environment {
    
    trait Config extends StObject {
      
      /**
        * Map of domains to their environments
        */
      var domains: StringDictionary[js.Array[String]]
      
      /**
        * List of variables split by environment
        */
      var vars: StringDictionary[StringDictionary[Any]]
    }
    object Config {
      
      inline def apply(domains: StringDictionary[js.Array[String]], vars: StringDictionary[StringDictionary[Any]]): Config = {
        val __obj = js.Dynamic.literal(domains = domains.asInstanceOf[js.Any], vars = vars.asInstanceOf[js.Any])
        __obj.asInstanceOf[Config]
      }
      
      extension [Self <: Config](x: Self) {
        
        inline def setDomains(value: StringDictionary[js.Array[String]]): Self = StObject.set(x, "domains", value.asInstanceOf[js.Any])
        
        inline def setVars(value: StringDictionary[StringDictionary[Any]]): Self = StObject.set(x, "vars", value.asInstanceOf[js.Any])
      }
    }
    
    trait Service extends StObject {
      
      /**
        * Retrieve the current environment
        */
      def get(): String
      
      /**
        * Evaluates current environment against
        * environment parameter.
        */
      def is(environment: String): Boolean
      
      /**
        * Retrieves the correct version of a
        * variable for the current environment.
        */
      def read(key: String): Any
      
      /**
        * Force sets the current environment
        */
      def set(environment: String): Unit
    }
    object Service {
      
      inline def apply(get: CallbackTo[String], is: String => Boolean, read: String => Any, set: String => Callback): Service = {
        val __obj = js.Dynamic.literal(get = get.toJsFn, is = js.Any.fromFunction1(is), read = js.Any.fromFunction1(read), set = js.Any.fromFunction1((t0: String) => set(t0).runNow()))
        __obj.asInstanceOf[Service]
      }
      
      extension [Self <: Service](x: Self) {
        
        inline def setGet(value: CallbackTo[String]): Self = StObject.set(x, "get", value.toJsFn)
        
        inline def setIs(value: String => Boolean): Self = StObject.set(x, "is", js.Any.fromFunction1(value))
        
        inline def setRead(value: String => Any): Self = StObject.set(x, "read", js.Any.fromFunction1(value))
        
        inline def setSet(value: String => Callback): Self = StObject.set(x, "set", js.Any.fromFunction1((t0: String) => value(t0).runNow()))
      }
    }
    
    trait ServiceProvider extends StObject {
      
      /**
        * Evaluates the current domain and
        * loads the correct environment variables.
        */
      def check(): Unit
      
      /**
        * Sets the configuration object
        */
      def config(config: Config): Unit
      
      /**
        * Retrieves the correct version of a
        * variable for the current environment.
        */
      def read(key: String): Any
    }
    object ServiceProvider {
      
      inline def apply(check: Callback, config: Config => Callback, read: String => Any): ServiceProvider = {
        val __obj = js.Dynamic.literal(check = check.toJsFn, config = js.Any.fromFunction1((t0: Config) => config(t0).runNow()), read = js.Any.fromFunction1(read))
        __obj.asInstanceOf[ServiceProvider]
      }
      
      extension [Self <: ServiceProvider](x: Self) {
        
        inline def setCheck(value: Callback): Self = StObject.set(x, "check", value.toJsFn)
        
        inline def setConfig(value: Config => Callback): Self = StObject.set(x, "config", js.Any.fromFunction1((t0: Config) => value(t0).runNow()))
        
        inline def setRead(value: String => Any): Self = StObject.set(x, "read", js.Any.fromFunction1(value))
      }
    }
  }
}
