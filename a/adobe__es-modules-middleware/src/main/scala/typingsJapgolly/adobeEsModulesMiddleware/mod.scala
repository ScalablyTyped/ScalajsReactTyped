package typingsJapgolly.adobeEsModulesMiddleware

import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.connect.mod.NextHandleFunction
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@adobe/es-modules-middleware", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def middleware(): NextHandleFunction = ^.asInstanceOf[js.Dynamic].applyDynamic("middleware")().asInstanceOf[NextHandleFunction]
  inline def middleware(options: MiddlewareOptions): NextHandleFunction = ^.asInstanceOf[js.Dynamic].applyDynamic("middleware")(options.asInstanceOf[js.Any]).asInstanceOf[NextHandleFunction]
  
  trait MiddlewareOptions extends StObject {
    
    /** a map of url base path to file system path from which to serve files */
    var paths: StringDictionary[String]
  }
  object MiddlewareOptions {
    
    inline def apply(paths: StringDictionary[String]): MiddlewareOptions = {
      val __obj = js.Dynamic.literal(paths = paths.asInstanceOf[js.Any])
      __obj.asInstanceOf[MiddlewareOptions]
    }
    
    extension [Self <: MiddlewareOptions](x: Self) {
      
      inline def setPaths(value: StringDictionary[String]): Self = StObject.set(x, "paths", value.asInstanceOf[js.Any])
    }
  }
  
  /* augmented module */
  object karmaAugmentingMod {
    
    trait ConfigOptions extends StObject {
      
      /**
        * used in Karma to aid in testing es-modules in the browser
        * see {@link https://github.com/adobe/es-modules-middleware}
        */
      var esModulesMiddleware: js.UndefOr[MiddlewareOptions] = js.undefined
    }
    object ConfigOptions {
      
      inline def apply(): ConfigOptions = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[ConfigOptions]
      }
      
      extension [Self <: ConfigOptions](x: Self) {
        
        inline def setEsModulesMiddleware(value: MiddlewareOptions): Self = StObject.set(x, "esModulesMiddleware", value.asInstanceOf[js.Any])
        
        inline def setEsModulesMiddlewareUndefined: Self = StObject.set(x, "esModulesMiddleware", js.undefined)
      }
    }
  }
}
