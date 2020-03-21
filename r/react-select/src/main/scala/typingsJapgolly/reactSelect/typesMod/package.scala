package typingsJapgolly.reactSelect

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object typesMod {
  type ClassNameList = js.Array[java.lang.String]
  type ClassNamesState = js.UndefOr[org.scalablytyped.runtime.StringDictionary[scala.Boolean]]
  type FocusEventHandler = js.Function1[
    /* event */ japgolly.scalajs.react.ReactFocusEventFrom[org.scalajs.dom.raw.HTMLElement], 
    scala.Unit
  ]
  type GroupedOptionsType[OptionType /* <: typingsJapgolly.reactSelect.typesMod.OptionTypeBase */] = js.Array[typingsJapgolly.reactSelect.typesMod.GroupType[OptionType]]
  type InnerRef = japgolly.scalajs.react.raw.React.Ref
  type KeyboardEventHandler = js.Function1[
    /* event */ japgolly.scalajs.react.ReactKeyboardEventFrom[org.scalajs.dom.raw.HTMLElement], 
    scala.Unit
  ]
  type MouseEventHandler = js.Function1[
    /* event */ japgolly.scalajs.react.ReactMouseEventFrom[org.scalajs.dom.raw.HTMLElement], 
    scala.Unit
  ]
  type OptionTypeBase = org.scalablytyped.runtime.StringDictionary[js.Any]
  type OptionsType[OptionType /* <: typingsJapgolly.reactSelect.typesMod.OptionTypeBase */] = js.Array[OptionType]
  type ValueType[OptionType /* <: typingsJapgolly.reactSelect.typesMod.OptionTypeBase */] = js.UndefOr[
    OptionType | typingsJapgolly.reactSelect.typesMod.OptionsType[OptionType] | scala.Null
  ]
}
