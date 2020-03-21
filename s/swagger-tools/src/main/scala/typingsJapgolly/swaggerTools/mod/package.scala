package typingsJapgolly.swaggerTools

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type InitializeMiddlewareCallback12 = js.Function1[/* middleware */ typingsJapgolly.swaggerTools.mod.Middleware12, scala.Unit]
  type InitializeMiddlewareCallback20 = js.Function1[/* middleware */ typingsJapgolly.swaggerTools.mod.Middleware20, scala.Unit]
  type Swagger20Security = org.scalablytyped.runtime.StringDictionary[js.Any]
  type SwaggerRequestParameters = org.scalablytyped.runtime.StringDictionary[js.UndefOr[typingsJapgolly.swaggerTools.mod.SwaggerRequestParameter[js.Any]]]
  type SwaggerRouter12HandlerFunction = js.Function3[
    /* req */ typingsJapgolly.swaggerTools.mod.Swagger12Request, 
    /* res */ typingsJapgolly.node.httpMod.ServerResponse, 
    /* next */ js.Function1[/* arg */ js.UndefOr[js.Any], scala.Unit], 
    scala.Unit
  ]
  type SwaggerRouter12OptionsControllers = org.scalablytyped.runtime.StringDictionary[typingsJapgolly.swaggerTools.mod.SwaggerRouter12HandlerFunction]
  type SwaggerRouter20HandlerFunction = js.Function3[
    /* req */ typingsJapgolly.swaggerTools.mod.Swagger20Request[js.Any], 
    /* res */ typingsJapgolly.node.httpMod.ServerResponse, 
    /* next */ js.Function1[/* arg */ js.UndefOr[js.Any], scala.Unit], 
    scala.Unit
  ]
  type SwaggerRouter20OptionsControllers = org.scalablytyped.runtime.StringDictionary[typingsJapgolly.swaggerTools.mod.SwaggerRouter20HandlerFunction]
  type SwaggerSecurityCallback = js.Function1[
    /* err */ js.UndefOr[typingsJapgolly.swaggerTools.mod.SwaggerSecurityError], 
    scala.Unit
  ]
  type SwaggerSecurityHandler = js.Function4[
    /* request */ typingsJapgolly.node.httpMod.IncomingMessage, 
    /* securityDefinition */ js.Any, 
    /* scopes */ java.lang.String | js.Array[java.lang.String], 
    /* callback */ typingsJapgolly.swaggerTools.mod.SwaggerSecurityCallback, 
    scala.Unit
  ]
  type SwaggerSecurityOptions = org.scalablytyped.runtime.StringDictionary[typingsJapgolly.swaggerTools.mod.SwaggerSecurityHandler]
  type SwaggerUi12ApiDeclarations = org.scalablytyped.runtime.StringDictionary[js.Any]
}
