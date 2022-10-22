package typingsJapgolly.fastifyAjvCompiler

import japgolly.scalajs.react.Callback
import typingsJapgolly.ajv.distCoreMod.Options
import typingsJapgolly.ajv.mod.default
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@fastify/ajv-compiler", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(): ValidatorCompiler = ^.asInstanceOf[js.Dynamic].applyDynamic("default")().asInstanceOf[ValidatorCompiler]
  
  @js.native
  sealed trait HttpParts extends StObject
  @JSImport("@fastify/ajv-compiler", "HttpParts")
  @js.native
  object HttpParts extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[HttpParts & String] = js.native
    
    @js.native
    sealed trait Body
      extends StObject
         with HttpParts
    /* "body" */ val Body: typingsJapgolly.fastifyAjvCompiler.mod.HttpParts.Body & String = js.native
    
    @js.native
    sealed trait Headers
      extends StObject
         with HttpParts
    /* "headers" */ val Headers: typingsJapgolly.fastifyAjvCompiler.mod.HttpParts.Headers & String = js.native
    
    @js.native
    sealed trait Params
      extends StObject
         with HttpParts
    /* "params" */ val Params: typingsJapgolly.fastifyAjvCompiler.mod.HttpParts.Params & String = js.native
    
    @js.native
    sealed trait Query
      extends StObject
         with HttpParts
    /* "querystring" */ val Query: typingsJapgolly.fastifyAjvCompiler.mod.HttpParts.Query & String = js.native
  }
  
  inline def StandaloneValidator(options: StandaloneOptions): ValidatorCompiler = ^.asInstanceOf[js.Dynamic].applyDynamic("StandaloneValidator")(options.asInstanceOf[js.Any]).asInstanceOf[ValidatorCompiler]
  
  inline def ValidatorSelector(): ValidatorCompiler = ^.asInstanceOf[js.Dynamic].applyDynamic("ValidatorSelector")().asInstanceOf[ValidatorCompiler]
  
  type Ajv = default
  
  trait RouteDefinition extends StObject {
    
    var httpPart: HttpParts
    
    var method: String
    
    var schema: js.UndefOr[Any] = js.undefined
    
    var url: String
  }
  object RouteDefinition {
    
    inline def apply(httpPart: HttpParts, method: String, url: String): RouteDefinition = {
      val __obj = js.Dynamic.literal(httpPart = httpPart.asInstanceOf[js.Any], method = method.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
      __obj.asInstanceOf[RouteDefinition]
    }
    
    extension [Self <: RouteDefinition](x: Self) {
      
      inline def setHttpPart(value: HttpParts): Self = StObject.set(x, "httpPart", value.asInstanceOf[js.Any])
      
      inline def setMethod(value: String): Self = StObject.set(x, "method", value.asInstanceOf[js.Any])
      
      inline def setSchema(value: Any): Self = StObject.set(x, "schema", value.asInstanceOf[js.Any])
      
      inline def setSchemaUndefined: Self = StObject.set(x, "schema", js.undefined)
      
      inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    }
  }
  
  trait StandaloneOptions extends StObject {
    
    var readMode: Boolean
    
    var restoreFunction: js.UndefOr[js.Function1[/* opts */ RouteDefinition, Unit]] = js.undefined
    
    var storeFunction: js.UndefOr[
        js.Function2[/* opts */ RouteDefinition, /* schemaValidationCode */ String, Unit]
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
      
      inline def setStoreFunction(value: (/* opts */ RouteDefinition, /* schemaValidationCode */ String) => Callback): Self = StObject.set(x, "storeFunction", js.Any.fromFunction2((t0: /* opts */ RouteDefinition, t1: /* schemaValidationCode */ String) => (value(t0, t1)).runNow()))
      
      inline def setStoreFunctionUndefined: Self = StObject.set(x, "storeFunction", js.undefined)
    }
  }
  
  type ValidatorCompiler = js.Function2[/* externalSchemas */ Any, /* options */ Options, Ajv]
}
