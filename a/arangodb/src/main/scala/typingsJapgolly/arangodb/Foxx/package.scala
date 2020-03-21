package typingsJapgolly.arangodb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object Foxx {
  type Handler = js.Function2[
    /* req */ typingsJapgolly.arangodb.Foxx.Request, 
    /* res */ typingsJapgolly.arangodb.Foxx.Response, 
    scala.Unit
  ]
  type Middleware = typingsJapgolly.arangodb.Foxx.SimpleMiddleware | typingsJapgolly.arangodb.Foxx.DelegateMiddleware
  type NextFunction = js.Function0[scala.Unit]
  type SimpleMiddleware = js.Function3[
    /* req */ typingsJapgolly.arangodb.Foxx.Request, 
    /* res */ typingsJapgolly.arangodb.Foxx.Response, 
    /* next */ typingsJapgolly.arangodb.Foxx.NextFunction, 
    scala.Unit
  ]
}
