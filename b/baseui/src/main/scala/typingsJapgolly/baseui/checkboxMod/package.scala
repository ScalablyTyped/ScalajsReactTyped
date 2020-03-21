package typingsJapgolly.baseui

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object checkboxMod {
  type StateReducer = js.Function4[
    /* stateType */ java.lang.String, 
    /* nextState */ typingsJapgolly.baseui.checkboxMod.CheckboxState, 
    /* currentState */ typingsJapgolly.baseui.checkboxMod.CheckboxState, 
    /* event */ japgolly.scalajs.react.ReactEventFrom[org.scalajs.dom.raw.HTMLInputElement], 
    typingsJapgolly.baseui.checkboxMod.CheckboxState
  ]
}
