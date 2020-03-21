package typingsJapgolly.reactRouter

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type Omit[T, K /* <: java.lang.String */] = typingsJapgolly.std.Pick[T, typingsJapgolly.std.Exclude[java.lang.String, K]]
  type WithRouterProps[C /* <: typingsJapgolly.react.mod.ComponentType[_] */] = js.Object | typingsJapgolly.reactRouter.AnonWrappedComponentRef[C]
}
