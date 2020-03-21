package typingsJapgolly.uirouterCore

import typingsJapgolly.uirouterCore.interfaceMod.Disposable
import typingsJapgolly.uirouterCore.queueMod.Queue
import typingsJapgolly.uirouterCore.stateInterfaceMod.StateDeclaration
import typingsJapgolly.uirouterCore.stateObjectMod.StateObject
import typingsJapgolly.uirouterCore.stateParamsMod.StateParams
import typingsJapgolly.uirouterCore.transitionTransitionMod.Transition
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@uirouter/core/lib/globals", JSImport.Namespace)
@js.native
object globalsMod extends js.Object {
  @js.native
  class UIRouterGlobals () extends Disposable {
    /**
      * Current state (internal object)
      *
      * The to-state from the latest successful transition
      * @internalapi
      */
    @JSName("$current")
    var $current: StateObject = js.native
    /**
      * Current state
      *
      * The to-state from the latest successful transition
      */
    var current: StateDeclaration = js.native
    /** @internalapi */
    var lastStartedTransitionId: Double = js.native
    /**
      * Current parameter values
      *
      * The parameter values from the latest successful transition
      */
    var params: StateParams = js.native
    /** @internalapi */
    var successfulTransitions: Queue[Transition] = js.native
    /**
      * The current started/running transition.
      * This transition has reached at least the onStart phase, but is not yet complete
      */
    var transition: Transition = js.native
    /** @internalapi */
    var transitionHistory: Queue[Transition] = js.native
  }
  
}

