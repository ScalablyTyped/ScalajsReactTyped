package typingsJapgolly.nivoScatterplot

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type CustomCanvasLayer = js.Function2[
    /* ctx */ org.scalajs.dom.raw.CanvasRenderingContext2D, 
    /* props */ typingsJapgolly.nivoScatterplot.mod.CustomCanvasLayerProps, 
    scala.Unit
  ]
  type CustomSvgLayer = js.Function1[
    /* props */ typingsJapgolly.nivoScatterplot.mod.CustomSvgLayerProps, 
    japgolly.scalajs.react.raw.React.Node
  ]
  type CustomTooltip = js.Function1[/* hasNode */ js.Any, japgolly.scalajs.react.raw.React.Node]
  type DerivedDatumProp[T] = js.Function1[/* node */ typingsJapgolly.nivoScatterplot.mod.Datum, T]
  type DerivedNodeProp[T] = js.Function1[/* node */ typingsJapgolly.nivoScatterplot.mod.Node, T]
  type MouseHandler = js.Function2[
    /* node */ typingsJapgolly.nivoScatterplot.mod.Node, 
    /* event */ japgolly.scalajs.react.ReactMouseEventFrom[js.Any with org.scalajs.dom.raw.Element], 
    scala.Unit
  ]
  type NodeCanvasComponent = js.Function2[
    /* ctx */ org.scalajs.dom.raw.CanvasRenderingContext2D, 
    /* props */ typingsJapgolly.nivoScatterplot.mod.NodeProps, 
    scala.Unit
  ]
  type NodeComponent = js.Function1[
    /* props */ typingsJapgolly.nivoScatterplot.mod.NodeProps, 
    japgolly.scalajs.react.raw.React.Node
  ]
  type Scale = js.Function1[/* value */ typingsJapgolly.nivoScatterplot.mod.Value, scala.Double]
  type Value = scala.Double | java.lang.String | js.Date
  type ValueFormatter = js.Function1[
    /* value */ typingsJapgolly.nivoScatterplot.mod.Value, 
    java.lang.String | scala.Double
  ]
}
