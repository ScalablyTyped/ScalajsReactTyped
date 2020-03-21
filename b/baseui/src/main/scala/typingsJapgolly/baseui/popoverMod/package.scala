package typingsJapgolly.baseui

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object popoverMod {
  type ANIMATE_IN_TIME = typingsJapgolly.baseui.baseuiNumbers.`20`
  type ANIMATE_OUT_TIME = typingsJapgolly.baseui.baseuiNumbers.`0`
  type StateReducer = js.Function3[
    /* stateChangeType */ typingsJapgolly.baseui.baseuiStrings.open | typingsJapgolly.baseui.baseuiStrings.close, 
    /* nextState */ typingsJapgolly.baseui.popoverMod.State, 
    /* currentState */ typingsJapgolly.baseui.popoverMod.State, 
    typingsJapgolly.baseui.popoverMod.State
  ]
}
