package typingsJapgolly.baseui

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object datepickerMod {
  type StateReducer = js.Function3[
    /* stateType */ typingsJapgolly.baseui.baseuiStrings.mouseLeave | typingsJapgolly.baseui.baseuiStrings.moveRight | typingsJapgolly.baseui.baseuiStrings.moveDown | typingsJapgolly.baseui.baseuiStrings.moveUp | typingsJapgolly.baseui.baseuiStrings.mouseOver | typingsJapgolly.baseui.baseuiStrings.change_ | typingsJapgolly.baseui.baseuiStrings.moveLeft, 
    /* nextState */ typingsJapgolly.baseui.datepickerMod.ContainerState, 
    /* currentState */ typingsJapgolly.baseui.datepickerMod.ContainerState, 
    typingsJapgolly.baseui.datepickerMod.ContainerState
  ]
  type StatefulDatepickerProps[T] = T with typingsJapgolly.baseui.datepickerMod.StatefulContainerProps[T] with typingsJapgolly.baseui.AnonChildren[T]
  type onChange = js.Function1[/* args */ typingsJapgolly.baseui.AnonDate, js.Any]
}
