package typingsJapgolly.koaRouter

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type Middleware[StateT, CustomT] = typingsJapgolly.koa.mod.Middleware[
    StateT, 
    CustomT with (typingsJapgolly.koaRouter.mod.RouterParamContext[StateT, CustomT])
  ]
  type ParamMiddleware = js.Function3[
    /* param */ java.lang.String, 
    /* ctx */ typingsJapgolly.koaRouter.RouterContextany, 
    /* next */ typingsJapgolly.koa.mod.Next, 
    js.Any
  ]
  type RouterContext[StateT, CustomT] = typingsJapgolly.koa.mod.ParameterizedContext[
    StateT, 
    CustomT with (typingsJapgolly.koaRouter.mod.RouterParamContext[StateT, CustomT])
  ]
}
