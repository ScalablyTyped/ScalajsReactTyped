package typingsJapgolly.reduxImmutableStateInvariant

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type immutableStateInvariantMiddlewareInterface = js.Function1[
    /* options */ js.UndefOr[
      typingsJapgolly.reduxImmutableStateInvariant.mod.immutableStateInvariantMiddlewareOptions
    ], 
    typingsJapgolly.redux.mod.Middleware[
      js.Object, 
      js.Any, 
      typingsJapgolly.redux.mod.Dispatch[typingsJapgolly.redux.mod.AnyAction]
    ]
  ]
}
