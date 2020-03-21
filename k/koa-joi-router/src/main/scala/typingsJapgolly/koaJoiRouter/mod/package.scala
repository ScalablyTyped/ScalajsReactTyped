package typingsJapgolly.koaJoiRouter

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type FullHandler = js.Function2[
    /* ctx */ typingsJapgolly.koa.mod.Context, 
    /* next */ typingsJapgolly.koa.mod.Next, 
    js.Any
  ]
  type Handler = typingsJapgolly.koaJoiRouter.mod.FullHandler | typingsJapgolly.koaJoiRouter.mod.NestedHandler
  type Method = js.Function3[
    /* path */ java.lang.String | js.RegExp, 
    /* handlerOrConfig */ typingsJapgolly.koaJoiRouter.mod.Handler | typingsJapgolly.koaJoiRouter.mod.Config, 
    /* repeated */ typingsJapgolly.koaJoiRouter.mod.Handler, 
    typingsJapgolly.koaJoiRouter.mod.Router
  ]
}
