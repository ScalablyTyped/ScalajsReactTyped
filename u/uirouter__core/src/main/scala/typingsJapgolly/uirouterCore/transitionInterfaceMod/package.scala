package typingsJapgolly.uirouterCore

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object transitionInterfaceMod {
  type HookFn = typingsJapgolly.uirouterCore.transitionInterfaceMod.TransitionHookFn | typingsJapgolly.uirouterCore.transitionInterfaceMod.TransitionStateHookFn | typingsJapgolly.uirouterCore.transitionInterfaceMod.TransitionCreateHookFn
  type HookMatchCriterion = java.lang.String | typingsJapgolly.uirouterCore.transitionInterfaceMod.IStateMatch | scala.Boolean
  type HookResult = scala.Boolean | typingsJapgolly.uirouterCore.targetStateMod.TargetState | scala.Unit | (js.Promise[
    scala.Boolean | typingsJapgolly.uirouterCore.targetStateMod.TargetState | scala.Unit
  ])
  type IHookRegistration = js.Function3[
    /* matchCriteria */ typingsJapgolly.uirouterCore.transitionInterfaceMod.HookMatchCriteria, 
    /* callback */ typingsJapgolly.uirouterCore.transitionInterfaceMod.HookFn, 
    /* options */ js.UndefOr[typingsJapgolly.uirouterCore.transitionInterfaceMod.HookRegOptions], 
    js.Function
  ]
  type IStateMatch = typingsJapgolly.uirouterCore.commonCommonMod.PredicateBinary[
    typingsJapgolly.uirouterCore.stateObjectMod.StateObject, 
    typingsJapgolly.uirouterCore.transitionTransitionMod.Transition
  ]
  type RegisteredHooks = org.scalablytyped.runtime.StringDictionary[js.Array[typingsJapgolly.uirouterCore.hookRegistryMod.RegisteredHook]]
  type TransitionCreateHookFn = js.Function1[
    /* transition */ typingsJapgolly.uirouterCore.transitionTransitionMod.Transition, 
    scala.Unit
  ]
  type TransitionHookFn = js.Function1[
    /* transition */ typingsJapgolly.uirouterCore.transitionTransitionMod.Transition, 
    typingsJapgolly.uirouterCore.transitionInterfaceMod.HookResult
  ]
  type TransitionStateHookFn = js.Function2[
    /* transition */ typingsJapgolly.uirouterCore.transitionTransitionMod.Transition, 
    /* state */ typingsJapgolly.uirouterCore.stateInterfaceMod.StateDeclaration, 
    typingsJapgolly.uirouterCore.transitionInterfaceMod.HookResult
  ]
}
