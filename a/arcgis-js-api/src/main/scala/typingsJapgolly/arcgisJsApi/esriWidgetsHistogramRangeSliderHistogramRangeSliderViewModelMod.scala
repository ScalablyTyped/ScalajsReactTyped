package typingsJapgolly.arcgisJsApi

import org.scalablytyped.runtime.Shortcut
import typingsJapgolly.arcgisJsApi.esri.HistogramRangeSliderViewModel
import typingsJapgolly.arcgisJsApi.esri.HistogramRangeSliderViewModelConstructor
import typingsJapgolly.arcgisJsApi.esri.HistogramRangeSliderViewModelProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esriWidgetsHistogramRangeSliderHistogramRangeSliderViewModelMod extends Shortcut {
  
  @JSImport("esri/widgets/HistogramRangeSlider/HistogramRangeSliderViewModel", JSImport.Namespace)
  @js.native
  val ^ : js.Object & HistogramRangeSliderViewModelConstructor = js.native
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("esri/widgets/HistogramRangeSlider/HistogramRangeSliderViewModel", JSImport.Namespace)
  @js.native
  /**
    * Provides the logic for the [HistogramRangeSlider](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-HistogramRangeSlider.html) widget.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-HistogramRangeSlider-HistogramRangeSliderViewModel.html)
    */
  open class Class ()
    extends StObject
       with HistogramRangeSliderViewModel {
    def this(properties: HistogramRangeSliderViewModelProperties) = this()
  }
  
  type _To = js.Object & HistogramRangeSliderViewModelConstructor
  
  /* This means you don't have to write `^`, but can instead just say `esriWidgetsHistogramRangeSliderHistogramRangeSliderViewModelMod.foo` */
  override def _to: js.Object & HistogramRangeSliderViewModelConstructor = ^
}
