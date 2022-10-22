package typingsJapgolly.arcgisJsApi

import org.scalablytyped.runtime.Shortcut
import typingsJapgolly.arcgisJsApi.esri.SizeSliderViewModel
import typingsJapgolly.arcgisJsApi.esri.SizeSliderViewModelConstructor
import typingsJapgolly.arcgisJsApi.esri.SizeSliderViewModelProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esriWidgetsSmartMappingSizeSliderSizeSliderViewModelMod extends Shortcut {
  
  @JSImport("esri/widgets/smartMapping/SizeSlider/SizeSliderViewModel", JSImport.Namespace)
  @js.native
  val ^ : js.Object & SizeSliderViewModelConstructor = js.native
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("esri/widgets/smartMapping/SizeSlider/SizeSliderViewModel", JSImport.Namespace)
  @js.native
  /**
    * Provides the logic for the [SizeSlider](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-smartMapping-SizeSlider.html) widget.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-smartMapping-SizeSlider-SizeSliderViewModel.html)
    */
  open class Class ()
    extends StObject
       with SizeSliderViewModel {
    def this(properties: SizeSliderViewModelProperties) = this()
  }
  
  type _To = js.Object & SizeSliderViewModelConstructor
  
  /* This means you don't have to write `^`, but can instead just say `esriWidgetsSmartMappingSizeSliderSizeSliderViewModelMod.foo` */
  override def _to: js.Object & SizeSliderViewModelConstructor = ^
}
