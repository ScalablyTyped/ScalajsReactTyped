package typingsJapgolly.baseui

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object radioMod {
  type StateReducer = js.Function4[
    /* stateType */ java.lang.String, 
    /* nextState */ typingsJapgolly.baseui.radioMod.State, 
    /* currentState */ typingsJapgolly.baseui.radioMod.State, 
    /* event */ japgolly.scalajs.react.ReactEventFrom[org.scalajs.dom.raw.HTMLInputElement], 
    typingsJapgolly.baseui.radioMod.State
  ]
}
