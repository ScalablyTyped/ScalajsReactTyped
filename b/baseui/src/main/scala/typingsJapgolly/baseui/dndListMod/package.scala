package typingsJapgolly.baseui

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object dndListMod {
  type StateReducer = js.Function3[
    typingsJapgolly.baseui.baseuiStrings.change_, 
    /* nextState */ typingsJapgolly.baseui.dndListMod.State, 
    /* currentState */ typingsJapgolly.baseui.dndListMod.State, 
    typingsJapgolly.baseui.dndListMod.State
  ]
}
