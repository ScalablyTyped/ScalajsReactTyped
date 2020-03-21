package typingsJapgolly.baseui

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object tabsMod {
  type StateReducer = js.Function3[
    typingsJapgolly.baseui.baseuiStrings.change_, 
    /* nextState */ typingsJapgolly.baseui.tabsMod.State, 
    /* currentState */ typingsJapgolly.baseui.tabsMod.State, 
    typingsJapgolly.baseui.tabsMod.State
  ]
}
