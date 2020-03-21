package typingsJapgolly.koa

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type DefaultContextExtends = js.Object
  /**
    * This interface can be augmented by users to add types to Koa's default state
    */
  type DefaultState = typingsJapgolly.koa.mod.DefaultStateExtends
  type DefaultStateExtends = js.Any
  type Middleware[StateT, CustomT] = /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify compose.Middleware<ParameterizedContext<StateT, CustomT>> */ js.Any
  type Next = js.Function0[js.Promise[js.Any]]
  type ParameterizedContext[StateT, CustomT] = typingsJapgolly.koa.mod.ExtendableContext with typingsJapgolly.koa.AnonState[StateT] with CustomT
}
