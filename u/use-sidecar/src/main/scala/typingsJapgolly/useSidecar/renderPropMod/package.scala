package typingsJapgolly.useSidecar

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object renderPropMod {
  type CombinedProps[T /* <: js.Array[_] */, K] = typingsJapgolly.useSidecar.AnonChildren[T] with K
  type RenderPropComponent[T /* <: js.Array[_] */, K] = typingsJapgolly.react.mod.ComponentType[typingsJapgolly.useSidecar.renderPropMod.CombinedProps[T, K]]
}
