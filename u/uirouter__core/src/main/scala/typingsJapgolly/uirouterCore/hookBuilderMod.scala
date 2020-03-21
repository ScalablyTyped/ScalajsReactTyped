package typingsJapgolly.uirouterCore

import typingsJapgolly.uirouterCore.hookRegistryMod.RegisteredHook
import typingsJapgolly.uirouterCore.transitionEventTypeMod.TransitionEventType
import typingsJapgolly.uirouterCore.transitionHookMod.TransitionHook
import typingsJapgolly.uirouterCore.transitionInterfaceMod.TransitionHookPhase
import typingsJapgolly.uirouterCore.transitionInterfaceMod.TreeChanges
import typingsJapgolly.uirouterCore.transitionTransitionMod.Transition
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@uirouter/core/lib/transition/hookBuilder", JSImport.Namespace)
@js.native
object hookBuilderMod extends js.Object {
  @js.native
  class HookBuilder protected () extends js.Object {
    def this(transition: Transition) = this()
    var transition: js.Any = js.native
    /**
      * Returns an array of newly built TransitionHook objects.
      *
      * - Finds all RegisteredHooks registered for the given `hookType` which matched the transition's [[TreeChanges]].
      * - Finds [[PathNode]] (or `PathNode[]`) to use as the TransitionHook context(s)
      * - For each of the [[PathNode]]s, creates a TransitionHook
      *
      * @param hookType the type of the hook registration function, e.g., 'onEnter', 'onFinish'.
      */
    def buildHooks(hookType: TransitionEventType): js.Array[TransitionHook] = js.native
    def buildHooksForPhase(phase: TransitionHookPhase): js.Array[TransitionHook] = js.native
    /**
      * Finds all RegisteredHooks from:
      * - The Transition object instance hook registry
      * - The TransitionService ($transitions) global hook registry
      *
      * which matched:
      * - the eventType
      * - the matchCriteria (to, from, exiting, retained, entering)
      *
      * @returns an array of matched [[RegisteredHook]]s
      */
    def getMatchingHooks(hookType: TransitionEventType, treeChanges: TreeChanges, transition: Transition): js.Array[RegisteredHook] = js.native
  }
  
}

