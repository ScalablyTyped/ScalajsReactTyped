package typingsJapgolly.downshift

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type Callback = js.Function0[scala.Unit]
  type ChildrenFunction[Item] = js.Function1[
    /* options */ typingsJapgolly.downshift.mod.ControllerStateAndHelpers[Item], 
    japgolly.scalajs.react.raw.React.Node
  ]
  type ControllerStateAndHelpers[Item] = typingsJapgolly.downshift.mod.DownshiftState[Item] with typingsJapgolly.downshift.mod.PropGetters[Item] with typingsJapgolly.downshift.mod.Actions[Item]
  type StateChangeFunction[Item] = js.Function1[
    /* state */ typingsJapgolly.downshift.mod.DownshiftState[Item], 
    typingsJapgolly.std.Partial[typingsJapgolly.downshift.mod.StateChangeOptions[Item]]
  ]
  type UseSelectReturnValue[Item] = typingsJapgolly.downshift.mod.UseSelectState[Item] with typingsJapgolly.downshift.mod.UseSelectPropGetters[Item] with typingsJapgolly.downshift.mod.UseSelectActions[Item]
}
