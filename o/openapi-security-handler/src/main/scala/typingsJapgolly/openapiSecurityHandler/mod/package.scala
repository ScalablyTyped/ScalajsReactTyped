package typingsJapgolly.openapiSecurityHandler

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type SecurityHandler = js.Function3[
    /* req */ typingsJapgolly.openapiTypes.mod.OpenAPI.Request, 
    /* scopes */ js.Array[typingsJapgolly.openapiSecurityHandler.mod.SecurityScope], 
    /* definition */ typingsJapgolly.openapiTypes.mod.OpenAPIV2.SecuritySchemeObject, 
    js.Promise[scala.Boolean] | scala.Boolean
  ]
  type SecurityHandlers = org.scalablytyped.runtime.StringDictionary[typingsJapgolly.openapiSecurityHandler.mod.SecurityHandler]
  type SecurityScope = java.lang.String
}
