package typingsJapgolly.ngkookies

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object angular {
  
  object kookies {
    
    trait Config extends StObject {
      
      var json: js.UndefOr[Boolean] = js.undefined
      
      var raw: js.UndefOr[Boolean] = js.undefined
    }
    object Config {
      
      inline def apply(): Config = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[Config]
      }
      
      extension [Self <: Config](x: Self) {
        
        inline def setJson(value: Boolean): Self = StObject.set(x, "json", value.asInstanceOf[js.Any])
        
        inline def setJsonUndefined: Self = StObject.set(x, "json", js.undefined)
        
        inline def setRaw(value: Boolean): Self = StObject.set(x, "raw", value.asInstanceOf[js.Any])
        
        inline def setRawUndefined: Self = StObject.set(x, "raw", js.undefined)
      }
    }
    
    trait IKookiesProvider extends StObject {
      
      var config: Config
      
      var defaults: Options
      
      def setConfig(config: Config): Unit
      
      def setDefaults(options: Options): Unit
    }
    object IKookiesProvider {
      
      inline def apply(config: Config, defaults: Options, setConfig: Config => Callback, setDefaults: Options => Callback): IKookiesProvider = {
        val __obj = js.Dynamic.literal(config = config.asInstanceOf[js.Any], defaults = defaults.asInstanceOf[js.Any], setConfig = js.Any.fromFunction1((t0: Config) => setConfig(t0).runNow()), setDefaults = js.Any.fromFunction1((t0: Options) => setDefaults(t0).runNow()))
        __obj.asInstanceOf[IKookiesProvider]
      }
      
      extension [Self <: IKookiesProvider](x: Self) {
        
        inline def setConfig(value: Config): Self = StObject.set(x, "config", value.asInstanceOf[js.Any])
        
        inline def setDefaults(value: Options): Self = StObject.set(x, "defaults", value.asInstanceOf[js.Any])
        
        inline def setSetConfig(value: Config => Callback): Self = StObject.set(x, "setConfig", js.Any.fromFunction1((t0: Config) => value(t0).runNow()))
        
        inline def setSetDefaults(value: Options => Callback): Self = StObject.set(x, "setDefaults", js.Any.fromFunction1((t0: Options) => value(t0).runNow()))
      }
    }
    
    @js.native
    trait IKookiesService extends StObject {
      
      def get(): Any = js.native
      def get(name: String): Any = js.native
      def get(name: String, converter: Any): Any = js.native
      @JSName("get")
      def get_T_T[T](name: String, converter: Any): T = js.native
      
      def remove(name: String): Boolean = js.native
      def remove(name: String, options: Options): Boolean = js.native
      
      def set(name: String, value: String): Unit = js.native
      def set(name: String, value: String, optopns: Options): Unit = js.native
    }
    
    trait Options extends StObject {
      
      var domain: js.UndefOr[String] = js.undefined
      
      var expires: js.UndefOr[Double | js.Date] = js.undefined
      
      var path: js.UndefOr[String] = js.undefined
      
      var secure: js.UndefOr[Boolean] = js.undefined
    }
    object Options {
      
      inline def apply(): Options = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[Options]
      }
      
      extension [Self <: Options](x: Self) {
        
        inline def setDomain(value: String): Self = StObject.set(x, "domain", value.asInstanceOf[js.Any])
        
        inline def setDomainUndefined: Self = StObject.set(x, "domain", js.undefined)
        
        inline def setExpires(value: Double | js.Date): Self = StObject.set(x, "expires", value.asInstanceOf[js.Any])
        
        inline def setExpiresUndefined: Self = StObject.set(x, "expires", js.undefined)
        
        inline def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
        
        inline def setPathUndefined: Self = StObject.set(x, "path", js.undefined)
        
        inline def setSecure(value: Boolean): Self = StObject.set(x, "secure", value.asInstanceOf[js.Any])
        
        inline def setSecureUndefined: Self = StObject.set(x, "secure", js.undefined)
      }
    }
  }
}
