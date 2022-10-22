package typingsJapgolly.arcgisJsApi

import org.scalablytyped.runtime.Shortcut
import typingsJapgolly.arcgisJsApi.esri.ChartMediaInfoValueSeries
import typingsJapgolly.arcgisJsApi.esri.ChartMediaInfoValueSeriesConstructor
import typingsJapgolly.arcgisJsApi.esri.ChartMediaInfoValueSeriesProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esriPopupContentSupportChartMediaInfoValueSeriesMod extends Shortcut {
  
  @JSImport("esri/popup/content/support/ChartMediaInfoValueSeries", JSImport.Namespace)
  @js.native
  val ^ : js.Object & ChartMediaInfoValueSeriesConstructor = js.native
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("esri/popup/content/support/ChartMediaInfoValueSeries", JSImport.Namespace)
  @js.native
  /**
    * The `ChartMediaInfoValueSeries` class is a read-only support class that represents information specific to how data should be plotted in a chart.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-popup-content-support-ChartMediaInfoValueSeries.html)
    */
  open class Class ()
    extends StObject
       with ChartMediaInfoValueSeries {
    def this(properties: ChartMediaInfoValueSeriesProperties) = this()
  }
  
  type _To = js.Object & ChartMediaInfoValueSeriesConstructor
  
  /* This means you don't have to write `^`, but can instead just say `esriPopupContentSupportChartMediaInfoValueSeriesMod.foo` */
  override def _to: js.Object & ChartMediaInfoValueSeriesConstructor = ^
}
