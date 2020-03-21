package typingsJapgolly.nivoSankey

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type AccessorFunc = js.Function1[/* datum */ typingsJapgolly.nivoSankey.mod.SankeyNodeDatum, java.lang.String]
  type LabelFormatter = js.Function1[/* label */ java.lang.String | scala.Double, java.lang.String | scala.Double]
  type SankeyMouseHandler = js.Function2[
    /* data */ typingsJapgolly.nivoSankey.mod.SankeyNodeDatum | typingsJapgolly.nivoSankey.mod.SankeyLinkDatum, 
    /* event */ japgolly.scalajs.react.ReactMouseEventFrom[org.scalajs.dom.raw.Element], 
    scala.Unit
  ]
  type SankeySortFunction = js.Function2[
    /* nodeA */ typingsJapgolly.nivoSankey.mod.SankeyDataNode, 
    /* nodeB */ typingsJapgolly.nivoSankey.mod.SankeyDataNode, 
    scala.Double
  ]
  type TooltipFormat = js.Function1[/* value */ scala.Double, japgolly.scalajs.react.raw.React.Node]
  type TooltipRenderer[T] = js.Function1[/* data */ T, japgolly.scalajs.react.raw.React.Node]
}
