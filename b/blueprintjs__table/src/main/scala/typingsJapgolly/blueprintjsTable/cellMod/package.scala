package typingsJapgolly.blueprintjsTable

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object cellMod {
  type ICellRenderer = js.Function2[
    /* rowIndex */ scala.Double, 
    /* columnIndex */ scala.Double, 
    japgolly.scalajs.react.raw.React.Element
  ]
}
