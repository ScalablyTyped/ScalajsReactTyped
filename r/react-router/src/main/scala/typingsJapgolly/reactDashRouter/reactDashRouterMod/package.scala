package typingsJapgolly.reactDashRouter

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object reactDashRouterMod {
  import typingsJapgolly.react.reactMod.ComponentType
  import typingsJapgolly.reactDashRouter.Anon_WrappedComponentRef
  import typingsJapgolly.std.Exclude
  import typingsJapgolly.std.Pick

  type Omit[T, K /* <: String */] = Pick[T, Exclude[String, K]]
  type WithRouterProps[C /* <: ComponentType[_] */] = js.Object | Anon_WrappedComponentRef[C]
}
