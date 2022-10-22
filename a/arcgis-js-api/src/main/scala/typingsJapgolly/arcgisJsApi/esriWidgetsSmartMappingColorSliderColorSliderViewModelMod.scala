package typingsJapgolly.arcgisJsApi

import org.scalablytyped.runtime.Shortcut
import typingsJapgolly.arcgisJsApi.esri.ColorSliderViewModel
import typingsJapgolly.arcgisJsApi.esri.ColorSliderViewModelConstructor
import typingsJapgolly.arcgisJsApi.esri.ColorSliderViewModelProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esriWidgetsSmartMappingColorSliderColorSliderViewModelMod extends Shortcut {
  
  @JSImport("esri/widgets/smartMapping/ColorSlider/ColorSliderViewModel", JSImport.Namespace)
  @js.native
  val ^ : js.Object & ColorSliderViewModelConstructor = js.native
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("esri/widgets/smartMapping/ColorSlider/ColorSliderViewModel", JSImport.Namespace)
  @js.native
  /**
    * Provides the logic for the [ColorSlider](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-smartMapping-ColorSlider.html) widget.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-smartMapping-ColorSlider-ColorSliderViewModel.html)
    */
  open class Class ()
    extends StObject
       with ColorSliderViewModel {
    def this(properties: ColorSliderViewModelProperties) = this()
  }
  
  type _To = js.Object & ColorSliderViewModelConstructor
  
  /* This means you don't have to write `^`, but can instead just say `esriWidgetsSmartMappingColorSliderColorSliderViewModelMod.foo` */
  override def _to: js.Object & ColorSliderViewModelConstructor = ^
}
