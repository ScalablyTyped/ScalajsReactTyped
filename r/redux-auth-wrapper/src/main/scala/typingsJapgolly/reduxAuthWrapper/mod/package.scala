package typingsJapgolly.reduxAuthWrapper

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type AuthWrapperDecorator[Props] = js.Function1[
    /* component */ typingsJapgolly.react.mod.ComponentType[Props], 
    japgolly.scalajs.react.raw.React.ComponentClassP[Props with js.Object]
  ]
  type StateSelector[State, OwnProps, R] = js.Function2[/* state */ State, /* props */ OwnProps, R]
}
