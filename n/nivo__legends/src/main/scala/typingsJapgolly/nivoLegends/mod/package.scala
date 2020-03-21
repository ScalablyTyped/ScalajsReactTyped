package typingsJapgolly.nivoLegends

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type LegendMouseHandler = js.Function2[
    /* data */ typingsJapgolly.nivoLegends.mod.LegendMouseHandlerData, 
    /* event */ japgolly.scalajs.react.ReactMouseEventFrom[js.Any with org.scalajs.dom.raw.Element], 
    scala.Unit
  ]
  type QuantileLegendSvg = typingsJapgolly.react.mod.FunctionComponent[typingsJapgolly.nivoLegends.mod.QuantileLegendProps]
}
