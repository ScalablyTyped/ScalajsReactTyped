package typingsJapgolly.arcgisJsApi

import org.scalablytyped.runtime.Shortcut
import typingsJapgolly.arcgisJsApi.esri.HistogramRangeSlider
import typingsJapgolly.arcgisJsApi.esri.HistogramRangeSliderConstructor
import typingsJapgolly.arcgisJsApi.esri.HistogramRangeSliderProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esriWidgetsHistogramRangeSliderMod extends Shortcut {
  
  @JSImport("esri/widgets/HistogramRangeSlider", JSImport.Namespace)
  @js.native
  val ^ : js.Object & HistogramRangeSliderConstructor = js.native
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("esri/widgets/HistogramRangeSlider", JSImport.Namespace)
  @js.native
  /**
    * A slider widget that can be used for filtering data or gathering numeric input from a user for a range of data.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-HistogramRangeSlider.html)
    */
  open class Class ()
    extends StObject
       with HistogramRangeSlider {
    def this(properties: HistogramRangeSliderProperties) = this()
  }
  
  type _To = js.Object & HistogramRangeSliderConstructor
  
  /* This means you don't have to write `^`, but can instead just say `esriWidgetsHistogramRangeSliderMod.foo` */
  override def _to: js.Object & HistogramRangeSliderConstructor = ^
}
