package typingsJapgolly.koaGraphql

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type Options = (js.Function3[
    /* request */ typingsJapgolly.koa.mod.Request, 
    /* repsonse */ typingsJapgolly.koa.mod.Response, 
    /* ctx */ typingsJapgolly.koa.mod.Context, 
    typingsJapgolly.koaGraphql.mod.OptionsResult
  ]) | typingsJapgolly.koaGraphql.mod.OptionsResult
  type OptionsResult = typingsJapgolly.koaGraphql.mod.OptionsData | js.Promise[typingsJapgolly.koaGraphql.mod.OptionsData]
}
