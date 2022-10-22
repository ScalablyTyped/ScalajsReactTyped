package typingsJapgolly.arcgisJsApi

import org.scalablytyped.runtime.Shortcut
import typingsJapgolly.arcgisJsApi.esri.SliderViewModel
import typingsJapgolly.arcgisJsApi.esri.SliderViewModelConstructor
import typingsJapgolly.arcgisJsApi.esri.SliderViewModelProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esriWidgetsSliderSliderViewModelMod extends Shortcut {
  
  @JSImport("esri/widgets/Slider/SliderViewModel", JSImport.Namespace)
  @js.native
  val ^ : js.Object & SliderViewModelConstructor = js.native
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("esri/widgets/Slider/SliderViewModel", JSImport.Namespace)
  @js.native
  /**
    * Provides the logic for the [Slider](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Slider.html) widget.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Slider-SliderViewModel.html)
    */
  open class Class ()
    extends StObject
       with SliderViewModel {
    def this(properties: SliderViewModelProperties) = this()
  }
  
  type _To = js.Object & SliderViewModelConstructor
  
  /* This means you don't have to write `^`, but can instead just say `esriWidgetsSliderSliderViewModelMod.foo` */
  override def _to: js.Object & SliderViewModelConstructor = ^
}
