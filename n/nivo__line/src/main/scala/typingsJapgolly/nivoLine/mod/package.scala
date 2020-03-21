package typingsJapgolly.nivoLine

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type DataFormatter = js.Function1[
    /* value */ typingsJapgolly.nivoLine.mod.LineValue, 
    java.lang.String | scala.Double
  ]
  type Layer = typingsJapgolly.nivoLine.mod.LineLayerType | typingsJapgolly.nivoLine.mod.LineCustomLayer
  type LineCustomLayer = js.Function1[
    /* props */ typingsJapgolly.nivoLine.mod.LineCustomLayerProps, 
    japgolly.scalajs.react.raw.React.Node
  ]
  type LineValue = java.lang.String | scala.Double | js.Date
  type TooltipFormatter = js.Function1[
    /* value */ typingsJapgolly.nivoLine.mod.LineValue, 
    japgolly.scalajs.react.raw.React.Node
  ]
  type TooltipProp = typingsJapgolly.react.mod.FC[typingsJapgolly.nivoLine.mod.LineTooltipProps]
}
