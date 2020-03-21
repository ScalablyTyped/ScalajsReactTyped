package typingsJapgolly.nivoBar

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type AccessorFunc = js.Function1[/* datum */ typingsJapgolly.nivoBar.mod.BarDatum, java.lang.String]
  type BarClickHandler = js.Function2[
    /* datum */ typingsJapgolly.nivoBar.mod.BarExtendedDatum, 
    /* event */ japgolly.scalajs.react.ReactMouseEventFrom[org.scalajs.dom.raw.HTMLCanvasElement], 
    scala.Unit
  ]
  type BarCustomLayer = js.Function1[/* props */ js.Any, japgolly.scalajs.react.raw.React.Node]
  type BarDatum = org.scalablytyped.runtime.StringDictionary[java.lang.String | scala.Double]
  type IndexByFunc = js.Function1[/* datum */ typingsJapgolly.nivoBar.mod.BarDatum, java.lang.String | scala.Double]
  type LabelFormatter = js.Function1[/* label */ java.lang.String | scala.Double, java.lang.String | scala.Double]
  type Layer = typingsJapgolly.nivoBar.mod.BarLayerType | typingsJapgolly.nivoBar.mod.BarCustomLayer
  type TooltipProp = typingsJapgolly.react.mod.StatelessComponent[typingsJapgolly.nivoBar.mod.BarExtendedDatum]
  type ValueFormatter = js.Function1[/* value */ scala.Double, java.lang.String | scala.Double]
}
