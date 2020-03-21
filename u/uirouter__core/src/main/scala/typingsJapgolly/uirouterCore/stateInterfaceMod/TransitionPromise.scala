package typingsJapgolly.uirouterCore.stateInterfaceMod

import typingsJapgolly.std.Promise
import typingsJapgolly.uirouterCore.stateObjectMod.StateObject
import typingsJapgolly.uirouterCore.transitionTransitionMod.Transition
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TransitionPromise extends Promise[StateObject] {
  var transition: Transition = js.native
}

