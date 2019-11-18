package typingsJapgolly.chartDotJs

import org.scalablytyped.runtime.Instantiable2
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.chartDotJs.chartDotJsMod.Chart
import typingsJapgolly.chartDotJs.chartDotJsMod.ChartConfiguration
import typingsJapgolly.chartDotJs.chartDotJsMod.ChartTooltipsStaticConfiguration
import typingsJapgolly.chartDotJs.chartDotJsMod.PluginServiceStatic
import typingsJapgolly.std.ArrayLike
import typingsJapgolly.std.CanvasRenderingContext2D
import typingsJapgolly.std.HTMLCanvasElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TypeofClassChart extends Instantiable2[
      (/* context */ ArrayLike[CanvasRenderingContext2D | HTMLCanvasElement]) | (/* context */ CanvasRenderingContext2D) | (/* context */ HTMLCanvasElement) | (/* context */ String), 
      /* options */ ChartConfiguration, 
      Chart
    ] {
  // Tooltip Static Options
  var Tooltip: ChartTooltipsStaticConfiguration = js.native
  var controllers: StringDictionary[js.Any] = js.native
  var defaults: Anon_Global = js.native
  var helpers: StringDictionary[js.Any] = js.native
  var pluginService: PluginServiceStatic = js.native
  var plugins: PluginServiceStatic = js.native
}

