package typingsJapgolly.reactSelect

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object stateManagerMod {
  type GetOptionType[T] = js.Any
  type StateProps[T /* <: typingsJapgolly.reactSelect.selectMod.Props[_] */] = typingsJapgolly.std.Pick[
    T, 
    typingsJapgolly.std.Exclude[
      java.lang.String, 
      typingsJapgolly.reactSelect.reactSelectStrings.inputValue | typingsJapgolly.reactSelect.reactSelectStrings.value | typingsJapgolly.reactSelect.reactSelectStrings.menuIsOpen | typingsJapgolly.reactSelect.reactSelectStrings.onChange | typingsJapgolly.reactSelect.reactSelectStrings.onInputChange | typingsJapgolly.reactSelect.reactSelectStrings.onMenuClose | typingsJapgolly.reactSelect.reactSelectStrings.onMenuOpen
    ]
  ]
}
