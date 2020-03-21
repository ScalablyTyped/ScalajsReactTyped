package typingsJapgolly.chartJs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type BorderWidth = scala.Double | typingsJapgolly.chartJs.keyinPositionTypenumber
  type ChartColor = java.lang.String | org.scalajs.dom.raw.CanvasGradient | org.scalajs.dom.raw.CanvasPattern | js.Array[java.lang.String]
  // NOTE: declare plugin options as interface instead of inline '{ [plugin: string]: any }'
  // to allow module augmentation in case some plugins want to strictly type their options.
  type ChartPluginsOptions = org.scalablytyped.runtime.StringDictionary[js.Any]
  type ChartTooltipPositioner = js.Function2[
    /* elements */ js.Array[js.Any], 
    /* eventPosition */ typingsJapgolly.chartJs.mod.Point, 
    typingsJapgolly.chartJs.mod.Point
  ]
  // tslint:disable-next-line no-empty-interface
  type ChartYAxe = typingsJapgolly.chartJs.mod.CommonAxe
  // tslint:disable-next-line no-empty-interface
  type LogarithmicTickOptions = typingsJapgolly.chartJs.mod.TickOptions
  type Scriptable[T] = js.Function1[/* ctx */ typingsJapgolly.chartJs.AnonChart, T]
}
