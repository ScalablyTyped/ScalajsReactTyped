package typingsJapgolly.rcPicker

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object dateBodyMod {
  type DateRender[DateType] = js.Function2[
    /* currentDate */ DateType, 
    /* today */ DateType, 
    japgolly.scalajs.react.raw.React.Node
  ]
}
