package typingsJapgolly.swaggerExpressMiddleware

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type CORSSignature = js.Function0[
    typingsJapgolly.express.mod.RequestHandler[typingsJapgolly.expressServeStaticCore.mod.ParamsDictionary]
  ]
  type DefinitionsObject = org.scalablytyped.runtime.StringDictionary[typingsJapgolly.swaggerExpressMiddleware.mod.SchemaObject]
  type ExampleObject = org.scalablytyped.runtime.StringDictionary[js.Any]
  type HeaderObject = typingsJapgolly.swaggerExpressMiddleware.mod.ItemsObject
  type HeadersObject = org.scalablytyped.runtime.StringDictionary[typingsJapgolly.swaggerExpressMiddleware.mod.HeaderObject]
  type MetadataSignature = js.Function1[
    /* router */ js.UndefOr[typingsJapgolly.express.mod.Application_ | typingsJapgolly.express.mod.Router], 
    typingsJapgolly.express.mod.RequestHandler[typingsJapgolly.expressServeStaticCore.mod.ParamsDictionary]
  ]
  type MimeTypes = js.Array[java.lang.String]
  type MockSignature = js.Function2[
    /* router */ js.UndefOr[typingsJapgolly.express.mod.Application_ | typingsJapgolly.express.mod.Router], 
    /* datastore */ js.UndefOr[js.Any], 
    typingsJapgolly.express.mod.RequestHandler[typingsJapgolly.expressServeStaticCore.mod.ParamsDictionary]
  ]
  type Parameters = js.Array[
    typingsJapgolly.swaggerExpressMiddleware.mod.ParameterObject | typingsJapgolly.swaggerExpressMiddleware.mod.ReferenceObject
  ]
  type ParametersDefinitionsObject = org.scalablytyped.runtime.StringDictionary[typingsJapgolly.swaggerExpressMiddleware.mod.ParameterObject]
  type PathsObject = org.scalablytyped.runtime.StringDictionary[typingsJapgolly.swaggerExpressMiddleware.mod.PathItemObject | js.Any]
  type ResponsesDefinitionsObject = org.scalablytyped.runtime.StringDictionary[typingsJapgolly.swaggerExpressMiddleware.mod.ResponseObject]
  type ScopesObject = org.scalablytyped.runtime.StringDictionary[js.Any]
  type SecurityDefinitionsObject = org.scalablytyped.runtime.StringDictionary[typingsJapgolly.swaggerExpressMiddleware.mod.SecuritySchemeObject]
  type SecurityRequirementObject = org.scalablytyped.runtime.StringDictionary[js.Array[java.lang.String]]
  type SwaggerMiddlewareConstructor = js.Function3[
    /* apiDefinitionPathOrObject */ java.lang.String | typingsJapgolly.swaggerExpressMiddleware.mod.SwaggerObject, 
    /* appOrRouter */ typingsJapgolly.express.mod.Application_ | typingsJapgolly.express.mod.Router, 
    /* cb */ typingsJapgolly.swaggerExpressMiddleware.mod.SwaggerMiddlewareConstructorCallback, 
    typingsJapgolly.swaggerExpressMiddleware.mod.SwaggerMiddleware
  ]
  type SwaggerMiddlewareConstructorCallback = js.Function4[
    /* err */ js.Any, 
    /* middleware */ typingsJapgolly.swaggerExpressMiddleware.mod.SwaggerMiddleware, 
    /* api */ typingsJapgolly.swaggerExpressMiddleware.mod.SwaggerObject, 
    /* parser */ typingsJapgolly.swaggerParser.mod.^, 
    scala.Unit
  ]
}
