package typingsJapgolly.awsSdkMiddlewareEndpoint

import typingsJapgolly.awsSdkMiddlewareEndpoint.distTypesResolveEndpointConfigMod.EndpointResolvedConfig
import typingsJapgolly.awsSdkMiddlewareEndpoint.distTypesTypesMod.EndpointParameterInstructions
import typingsJapgolly.awsSdkTypes.distTypesEndpointMod.EndpointParameters
import typingsJapgolly.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Config[T /* <: EndpointParameters */] extends StObject {
    
    var config: EndpointResolvedConfig[T]
    
    var instructions: EndpointParameterInstructions
  }
  object Config {
    
    inline def apply[T /* <: EndpointParameters */](config: EndpointResolvedConfig[T], instructions: EndpointParameterInstructions): Config[T] = {
      val __obj = js.Dynamic.literal(config = config.asInstanceOf[js.Any], instructions = instructions.asInstanceOf[js.Any])
      __obj.asInstanceOf[Config[T]]
    }
    
    extension [Self <: Config[?], T /* <: EndpointParameters */](x: Self & Config[T]) {
      
      inline def setConfig(value: EndpointResolvedConfig[T]): Self = StObject.set(x, "config", value.asInstanceOf[js.Any])
      
      inline def setInstructions(value: EndpointParameterInstructions): Self = StObject.set(x, "instructions", value.asInstanceOf[js.Any])
    }
  }
  
  trait Headers extends StObject {
    
    var headers: js.UndefOr[Record[String, js.Array[String]]] = js.undefined
    
    var properties: js.UndefOr[Record[String, Any]] = js.undefined
    
    var url: String
  }
  object Headers {
    
    inline def apply(url: String): Headers = {
      val __obj = js.Dynamic.literal(url = url.asInstanceOf[js.Any])
      __obj.asInstanceOf[Headers]
    }
    
    extension [Self <: Headers](x: Self) {
      
      inline def setHeaders(value: Record[String, js.Array[String]]): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
      
      inline def setHeadersUndefined: Self = StObject.set(x, "headers", js.undefined)
      
      inline def setProperties(value: Record[String, Any]): Self = StObject.set(x, "properties", value.asInstanceOf[js.Any])
      
      inline def setPropertiesUndefined: Self = StObject.set(x, "properties", js.undefined)
      
      inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    }
  }
  
  trait Logger extends StObject {
    
    var logger: js.UndefOr[typingsJapgolly.awsSdkTypes.distTypesLoggerMod.Logger] = js.undefined
  }
  object Logger {
    
    inline def apply(): Logger = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Logger]
    }
    
    extension [Self <: Logger](x: Self) {
      
      inline def setLogger(value: typingsJapgolly.awsSdkTypes.distTypesLoggerMod.Logger): Self = StObject.set(x, "logger", value.asInstanceOf[js.Any])
      
      inline def setLoggerUndefined: Self = StObject.set(x, "logger", js.undefined)
    }
  }
}
