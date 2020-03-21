package typingsJapgolly.expressGraphql

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type Middleware = js.Function2[
    /* request */ typingsJapgolly.expressGraphql.mod.Request, 
    /* response */ typingsJapgolly.expressGraphql.mod.Response, 
    js.Promise[js.UndefOr[scala.Nothing]]
  ]
  /**
    * Used to configure the graphqlHTTP middleware by providing a schema
    * and other configuration options.
    *
    * Options can be provided as an Object, a Promise for an Object, or a Function
    * that returns an Object or a Promise for an Object.
    */
  type Options = (js.Function3[
    /* request */ typingsJapgolly.expressGraphql.mod.Request, 
    /* response */ typingsJapgolly.expressGraphql.mod.Response, 
    /* params */ js.UndefOr[typingsJapgolly.expressGraphql.mod.GraphQLParams], 
    typingsJapgolly.expressGraphql.mod.OptionsResult
  ]) | typingsJapgolly.expressGraphql.mod.OptionsResult
  type OptionsResult = typingsJapgolly.expressGraphql.mod.OptionsData | js.Promise[typingsJapgolly.expressGraphql.mod.OptionsData]
  type Request = typingsJapgolly.node.httpMod.IncomingMessage
  type Response = typingsJapgolly.node.httpMod.ServerResponse
}
