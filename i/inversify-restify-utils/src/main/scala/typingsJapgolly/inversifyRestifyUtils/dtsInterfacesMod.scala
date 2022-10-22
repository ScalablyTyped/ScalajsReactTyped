package typingsJapgolly.inversifyRestifyUtils

import typingsJapgolly.inversify.libInterfacesInterfacesMod.interfaces.ServiceIdentifier
import typingsJapgolly.restify.mod.RequestHandler
import typingsJapgolly.restify.mod.Server
import typingsJapgolly.std.PropertyKey
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object dtsInterfacesMod {
  
  object interfaces {
    
    type ConfigFunction = js.Function1[/* app */ Server, Unit]
    
    trait Controller extends StObject
    
    trait ControllerMetadata extends StObject {
      
      var middleware: js.Array[Middleware]
      
      var path: String
      
      var target: Any
    }
    object ControllerMetadata {
      
      inline def apply(middleware: js.Array[Middleware], path: String, target: Any): ControllerMetadata = {
        val __obj = js.Dynamic.literal(middleware = middleware.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any], target = target.asInstanceOf[js.Any])
        __obj.asInstanceOf[ControllerMetadata]
      }
      
      extension [Self <: ControllerMetadata](x: Self) {
        
        inline def setMiddleware(value: js.Array[Middleware]): Self = StObject.set(x, "middleware", value.asInstanceOf[js.Any])
        
        inline def setMiddlewareVarargs(value: Middleware*): Self = StObject.set(x, "middleware", js.Array(value*))
        
        inline def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
        
        inline def setTarget(value: Any): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
      }
    }
    
    trait ControllerMethodMetadata extends StObject {
      
      var key: String
      
      var method: String
      
      var middleware: js.Array[Middleware]
      
      var options: RouteOptions
      
      var target: Any
    }
    object ControllerMethodMetadata {
      
      inline def apply(key: String, method: String, middleware: js.Array[Middleware], options: RouteOptions, target: Any): ControllerMethodMetadata = {
        val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any], method = method.asInstanceOf[js.Any], middleware = middleware.asInstanceOf[js.Any], options = options.asInstanceOf[js.Any], target = target.asInstanceOf[js.Any])
        __obj.asInstanceOf[ControllerMethodMetadata]
      }
      
      extension [Self <: ControllerMethodMetadata](x: Self) {
        
        inline def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
        
        inline def setMethod(value: String): Self = StObject.set(x, "method", value.asInstanceOf[js.Any])
        
        inline def setMiddleware(value: js.Array[Middleware]): Self = StObject.set(x, "middleware", value.asInstanceOf[js.Any])
        
        inline def setMiddlewareVarargs(value: Middleware*): Self = StObject.set(x, "middleware", js.Array(value*))
        
        inline def setOptions(value: RouteOptions): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
        
        inline def setTarget(value: Any): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
      }
    }
    
    type HandlerDecorator = js.Function3[/* target */ Any, /* key */ String, /* value */ Any, Unit]
    
    type Middleware = ServiceIdentifier[Any] | RequestHandler
    
    /* Rewritten from type alias, can be one of: 
      - typingsJapgolly.inversifyRestifyUtils.dtsInterfacesMod.interfaces.StrOrRegex
      - typingsJapgolly.inversifyRestifyUtils.anon.Path
      - typingsJapgolly.inversifyRestifyUtils.anon.optionsObjectpathStrOrReg
    */
    type RouteOptions = _RouteOptions | StrOrRegex
    
    trait ServerOptions
      extends StObject
         with typingsJapgolly.restify.mod.ServerOptions {
      
      var defaultRoot: js.UndefOr[String] = js.undefined
    }
    object ServerOptions {
      
      inline def apply(): ServerOptions = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[ServerOptions]
      }
      
      extension [Self <: ServerOptions](x: Self) {
        
        inline def setDefaultRoot(value: String): Self = StObject.set(x, "defaultRoot", value.asInstanceOf[js.Any])
        
        inline def setDefaultRootUndefined: Self = StObject.set(x, "defaultRoot", js.undefined)
      }
    }
    
    type StrOrRegex = String | js.RegExp
    
    trait _RouteOptions extends StObject
    object _RouteOptions {
      
      inline def Path(path: StrOrRegex): typingsJapgolly.inversifyRestifyUtils.anon.Path = {
        val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any])
        __obj.asInstanceOf[typingsJapgolly.inversifyRestifyUtils.anon.Path]
      }
      
      inline def optionsObjectpathStrOrReg(
        constructor: js.Function,
        hasOwnProperty: PropertyKey => Boolean,
        options: js.Object,
        path: StrOrRegex,
        propertyIsEnumerable: PropertyKey => Boolean
      ): typingsJapgolly.inversifyRestifyUtils.anon.optionsObjectpathStrOrReg = {
        val __obj = js.Dynamic.literal(constructor = constructor.asInstanceOf[js.Any], hasOwnProperty = js.Any.fromFunction1(hasOwnProperty), options = options.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any], propertyIsEnumerable = js.Any.fromFunction1(propertyIsEnumerable))
        __obj.asInstanceOf[typingsJapgolly.inversifyRestifyUtils.anon.optionsObjectpathStrOrReg]
      }
    }
  }
}
