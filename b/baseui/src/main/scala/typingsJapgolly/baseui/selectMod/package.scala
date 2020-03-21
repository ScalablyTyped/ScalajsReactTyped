package typingsJapgolly.baseui

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object selectMod {
  type ChangeAction = js.Function0[js.Any]
  type OptionsT = typingsJapgolly.baseui.selectMod.Value | typingsJapgolly.baseui.selectMod.OptgroupsT
  type StateReducer = js.Function3[
    /* stateType */ java.lang.String, 
    /* nextState */ typingsJapgolly.baseui.selectMod.State, 
    /* currentState */ typingsJapgolly.baseui.selectMod.State, 
    typingsJapgolly.baseui.selectMod.State
  ]
  type Value = js.Array[typingsJapgolly.baseui.selectMod.Option]
  type filterOptions = js.Function4[
    /* options */ typingsJapgolly.baseui.selectMod.Value, 
    /* filterValue */ java.lang.String, 
    /* excludeOptions */ js.UndefOr[typingsJapgolly.baseui.selectMod.Value], 
    /* newProps */ js.UndefOr[typingsJapgolly.baseui.AnonFilterOption], 
    typingsJapgolly.baseui.selectMod.Value
  ]
}
