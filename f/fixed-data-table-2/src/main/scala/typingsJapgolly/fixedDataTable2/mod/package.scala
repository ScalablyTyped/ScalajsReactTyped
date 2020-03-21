package typingsJapgolly.fixedDataTable2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type ElementOrFunc[P] = java.lang.String | japgolly.scalajs.react.raw.React.Element | (js.Function1[/* props */ P, java.lang.String | japgolly.scalajs.react.raw.React.Element])
  type TableRowEventHandler = js.Function2[
    /* event */ japgolly.scalajs.react.ReactEventFrom[typingsJapgolly.fixedDataTable2.mod.Table with org.scalajs.dom.raw.Element], 
    /* rowIndex */ scala.Double, 
    scala.Unit
  ]
}
