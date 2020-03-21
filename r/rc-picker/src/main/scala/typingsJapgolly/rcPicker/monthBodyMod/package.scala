package typingsJapgolly.rcPicker

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object monthBodyMod {
  type MonthCellRender[DateType] = js.Function2[
    /* currentDate */ DateType, 
    /* locale */ typingsJapgolly.rcPicker.interfaceMod.Locale, 
    japgolly.scalajs.react.raw.React.Node
  ]
}
