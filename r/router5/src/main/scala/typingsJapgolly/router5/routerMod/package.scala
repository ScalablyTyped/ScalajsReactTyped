package typingsJapgolly.router5

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object routerMod {
  type ActivationFn = js.Function3[
    /* toState */ typingsJapgolly.router5.baseMod.State, 
    /* fromState */ typingsJapgolly.router5.baseMod.State, 
    /* done */ typingsJapgolly.router5.baseMod.DoneFn, 
    scala.Boolean | js.Promise[scala.Boolean] | scala.Unit
  ]
  type ActivationFnFactory = js.Function2[
    /* router */ typingsJapgolly.router5.routerMod.Router, 
    /* dependencies */ js.UndefOr[typingsJapgolly.router5.routerMod.Dependencies], 
    typingsJapgolly.router5.routerMod.ActivationFn
  ]
  type CreateRouter = js.Function3[
    /* routes */ js.UndefOr[
      js.Array[typingsJapgolly.router5.routerMod.Route] | typingsJapgolly.routeNode.mod.default
    ], 
    /* options */ js.UndefOr[typingsJapgolly.router5.PartialOptions], 
    /* dependencies */ js.UndefOr[typingsJapgolly.router5.routerMod.Dependencies], 
    typingsJapgolly.router5.routerMod.Router
  ]
  type Dependencies = typingsJapgolly.std.Record[java.lang.String, js.Any]
  type Middleware = js.Function3[
    /* toState */ typingsJapgolly.router5.baseMod.State, 
    /* fromState */ typingsJapgolly.router5.baseMod.State, 
    /* done */ typingsJapgolly.router5.baseMod.DoneFn, 
    scala.Boolean | js.Promise[js.Any] | scala.Unit
  ]
  type MiddlewareFactory = js.Function2[
    /* router */ typingsJapgolly.router5.routerMod.Router, 
    /* dependencies */ typingsJapgolly.router5.routerMod.Dependencies, 
    typingsJapgolly.router5.routerMod.Middleware
  ]
  type PluginFactory = js.Function2[
    /* router */ js.UndefOr[typingsJapgolly.router5.routerMod.Router], 
    /* dependencies */ js.UndefOr[typingsJapgolly.router5.routerMod.Dependencies], 
    typingsJapgolly.router5.routerMod.Plugin
  ]
  type SubscribeFn = js.Function1[/* state */ typingsJapgolly.router5.routerMod.SubscribeState, scala.Unit]
}
