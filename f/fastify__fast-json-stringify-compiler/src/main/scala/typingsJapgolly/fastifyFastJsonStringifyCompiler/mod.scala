package typingsJapgolly.fastifyFastJsonStringifyCompiler

import japgolly.scalajs.react.Callback
import typingsJapgolly.fastJsonStringify.mod.Options
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@fastify/fast-json-stringify-compiler", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(): SerializerCompiler = ^.asInstanceOf[js.Dynamic].applyDynamic("default")().asInstanceOf[SerializerCompiler]
  
  inline def SerializerSelector(): SerializerCompiler = ^.asInstanceOf[js.Dynamic].applyDynamic("SerializerSelector")().asInstanceOf[SerializerCompiler]
  
  inline def StandaloneSerializer(options: StandaloneOptions): SerializerCompiler = ^.asInstanceOf[js.Dynamic].applyDynamic("StandaloneSerializer")(options.asInstanceOf[js.Any]).asInstanceOf[SerializerCompiler]
  
  trait RouteDefinition extends StObject {
    
    var httpStatus: String
    
    var method: String
    
    var schema: js.UndefOr[Any] = js.undefined
    
    var url: String
  }
  object RouteDefinition {
    
    inline def apply(httpStatus: String, method: String, url: String): RouteDefinition = {
      val __obj = js.Dynamic.literal(httpStatus = httpStatus.asInstanceOf[js.Any], method = method.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
      __obj.asInstanceOf[RouteDefinition]
    }
    
    extension [Self <: RouteDefinition](x: Self) {
      
      inline def setHttpStatus(value: String): Self = StObject.set(x, "httpStatus", value.asInstanceOf[js.Any])
      
      inline def setMethod(value: String): Self = StObject.set(x, "method", value.asInstanceOf[js.Any])
      
      inline def setSchema(value: Any): Self = StObject.set(x, "schema", value.asInstanceOf[js.Any])
      
      inline def setSchemaUndefined: Self = StObject.set(x, "schema", js.undefined)
      
      inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    }
  }
  
  type SerializerCompiler = js.Function2[
    /* externalSchemas */ Any, 
    /* options */ Options, 
    js.Function1[/* doc */ Any, String]
  ]
  
  trait StandaloneOptions extends StObject {
    
    var readMode: Boolean
    
    var restoreFunction: js.UndefOr[js.Function1[/* opts */ RouteDefinition, Unit]] = js.undefined
    
    var storeFunction: js.UndefOr[
        js.Function2[/* opts */ RouteDefinition, /* schemaSerializationCode */ String, Unit]
      ] = js.undefined
  }
  object StandaloneOptions {
    
    inline def apply(readMode: Boolean): StandaloneOptions = {
      val __obj = js.Dynamic.literal(readMode = readMode.asInstanceOf[js.Any])
      __obj.asInstanceOf[StandaloneOptions]
    }
    
    extension [Self <: StandaloneOptions](x: Self) {
      
      inline def setReadMode(value: Boolean): Self = StObject.set(x, "readMode", value.asInstanceOf[js.Any])
      
      inline def setRestoreFunction(value: /* opts */ RouteDefinition => Callback): Self = StObject.set(x, "restoreFunction", js.Any.fromFunction1((t0: /* opts */ RouteDefinition) => value(t0).runNow()))
      
      inline def setRestoreFunctionUndefined: Self = StObject.set(x, "restoreFunction", js.undefined)
      
      inline def setStoreFunction(value: (/* opts */ RouteDefinition, /* schemaSerializationCode */ String) => Callback): Self = StObject.set(x, "storeFunction", js.Any.fromFunction2((t0: /* opts */ RouteDefinition, t1: /* schemaSerializationCode */ String) => (value(t0, t1)).runNow()))
      
      inline def setStoreFunctionUndefined: Self = StObject.set(x, "storeFunction", js.undefined)
    }
  }
}
