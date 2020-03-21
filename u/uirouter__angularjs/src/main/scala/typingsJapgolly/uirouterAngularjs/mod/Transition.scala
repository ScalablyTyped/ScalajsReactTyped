package typingsJapgolly.uirouterAngularjs.mod

import typingsJapgolly.uirouterCore.TypeofTransition
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@uirouter/angularjs", "Transition")
@js.native
class Transition protected ()
  extends typingsJapgolly.uirouterCore.mod.Transition {
  /**
    * Creates a new Transition object.
    *
    * If the target state is not valid, an error is thrown.
    *
    * @internalapi
    *
    * @param fromPath The path of [[PathNode]]s from which the transition is leaving.  The last node in the `fromPath`
    *        encapsulates the "from state".
    * @param targetState The target state and parameters being transitioned to (also, the transition options)
    * @param router The [[UIRouter]] instance
    */
  def this(
    fromPath: js.Array[typingsJapgolly.uirouterCore.pathNodeMod.PathNode],
    targetState: typingsJapgolly.uirouterCore.targetStateMod.TargetState,
    router: typingsJapgolly.uirouterCore.routerMod.UIRouter
  ) = this()
}

/* static members */
@JSImport("@uirouter/angularjs", "Transition")
@js.native
object Transition extends js.Object {
  /** @hidden */
  var diToken: TypeofTransition = js.native
}

