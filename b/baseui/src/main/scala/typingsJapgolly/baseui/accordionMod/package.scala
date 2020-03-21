package typingsJapgolly.baseui

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object accordionMod {
  type StateReducer[T] = js.Function3[
    typingsJapgolly.baseui.baseuiStrings.expand, 
    /* nextState */ T, 
    /* currentState */ T, 
    T
  ]
  type StatefulPanelProps = typingsJapgolly.baseui.accordionMod.SharedPanelProps with typingsJapgolly.baseui.accordionMod.SharedStatefulPanelContainerProps
}
