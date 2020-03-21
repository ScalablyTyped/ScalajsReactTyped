package typingsJapgolly.koaRouter

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type IMiddleware[StateT, CustomT] = typingsJapgolly.koa.mod.Middleware[
    StateT, 
    CustomT with (typingsJapgolly.koaRouter.mod.IRouterParamContext[StateT, CustomT])
  ]
  type IParamMiddleware = js.Function3[
    /* param */ java.lang.String, 
    /* ctx */ typingsJapgolly.koaRouter.RouterContextany, 
    /* next */ js.Function0[js.Promise[js.Any]], 
    js.Any
  ]
  type RouterContext[StateT, CustomT] = typingsJapgolly.koa.mod.ParameterizedContext[
    StateT, 
    CustomT with (typingsJapgolly.koaRouter.mod.IRouterParamContext[StateT, CustomT])
  ]
}
