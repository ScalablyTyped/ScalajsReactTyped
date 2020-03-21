package typingsJapgolly.reduxFirstRouter.mod

import typingsJapgolly.reduxFirstRouter.AnonEnhancer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("redux-first-router", "connectRoutes")
@js.native
object connectRoutes extends js.Object {
  def apply[TKeys, TState](routesMap: RoutesMap[TKeys, TState]): AnonEnhancer[TKeys, TState] = js.native
  def apply[TKeys, TState](routesMap: RoutesMap[TKeys, TState], options: Options[TKeys, TState]): AnonEnhancer[TKeys, TState] = js.native
}

