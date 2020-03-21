package typingsJapgolly.baseui

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object paginationMod {
  type StateReducer = js.Function3[
    typingsJapgolly.baseui.baseuiStrings.change_, 
    /* changes */ typingsJapgolly.baseui.paginationMod.State, 
    /* currentState */ typingsJapgolly.baseui.paginationMod.State, 
    typingsJapgolly.baseui.paginationMod.State
  ]
}
