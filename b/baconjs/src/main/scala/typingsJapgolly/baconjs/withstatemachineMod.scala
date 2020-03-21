package typingsJapgolly.baconjs

import typingsJapgolly.baconjs.observableMod.default
import typingsJapgolly.baconjs.transformMod.Transformer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("baconjs/types/withstatemachine", JSImport.Namespace)
@js.native
object withstatemachineMod extends js.Object {
  def default[In, State, Out](
    initState: State,
    f: StateF[In, State, Out],
    src: typingsJapgolly.baconjs.observableMod.default[In]
  ): typingsJapgolly.baconjs.observableMod.default[Out] = js.native
  def withStateMachine[In, State, Out](initState: State, f: StateF[In, State, Out], src: default[In]): default[Out] = js.native
  def withStateMachineT[In, State, Out](initState: State, f: StateF[In, State, Out]): Transformer[In, Out] = js.native
  type StateF[In, State, Out] = js.Function2[
    /* state */ State, 
    /* event */ typingsJapgolly.baconjs.eventMod.default[In], 
    js.Tuple2[State, js.Array[typingsJapgolly.baconjs.eventMod.default[Out]]]
  ]
}

