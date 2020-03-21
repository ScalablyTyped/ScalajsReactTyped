package typingsJapgolly.reactPose

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object transitionTypesMod {
  type TransitionChild[T] = japgolly.scalajs.react.raw.React.Element | typingsJapgolly.reactPose.reactPoseBooleans.`false` | scala.Unit
  type TransitionChildren[T] = typingsJapgolly.reactPose.transitionTypesMod.TransitionChild[T] | js.Array[typingsJapgolly.reactPose.transitionTypesMod.TransitionChild[T]]
}
