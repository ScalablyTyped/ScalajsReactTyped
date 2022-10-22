package typingsJapgolly.uirouterCore

import typingsJapgolly.uirouterCore.libCommonQueueMod.Queue
import typingsJapgolly.uirouterCore.libInterfaceMod.Disposable
import typingsJapgolly.uirouterCore.libParamsStateParamsMod.StateParams
import typingsJapgolly.uirouterCore.libStateInterfaceMod.StateDeclaration
import typingsJapgolly.uirouterCore.libStateStateObjectMod.StateObject
import typingsJapgolly.uirouterCore.libTransitionTransitionMod.Transition
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libGlobalsMod {
  
  @JSImport("@uirouter/core/lib/globals", "UIRouterGlobals")
  @js.native
  open class UIRouterGlobals ()
    extends StObject
       with Disposable {
    
    /**
      * Current state (internal object)
      *
      * The to-state from the latest successful transition
      * @internal
      */
    @JSName("$current")
    var $current: StateObject = js.native
    
    /**
      * Current state
      *
      * The to-state from the latest successful transition
      */
    var current: StateDeclaration = js.native
    
    /** @internal */
    var lastStartedTransitionId: Double = js.native
    
    /**
      * Current parameter values
      *
      * The parameter values from the latest successful transition
      */
    var params: StateParams = js.native
    
    /** @internal */
    var successfulTransitions: Queue[Transition] = js.native
    
    /**
      * The current started/running transition.
      * This transition has reached at least the onStart phase, but is not yet complete
      */
    var transition: Transition = js.native
    
    /** @internal */
    var transitionHistory: Queue[Transition] = js.native
  }
}
