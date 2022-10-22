package typingsJapgolly.arcgisJsApi

import org.scalablytyped.runtime.Shortcut
import typingsJapgolly.arcgisJsApi.esri.OpacitySliderViewModel
import typingsJapgolly.arcgisJsApi.esri.OpacitySliderViewModelConstructor
import typingsJapgolly.arcgisJsApi.esri.OpacitySliderViewModelProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esriWidgetsSmartMappingOpacitySliderOpacitySliderViewModelMod extends Shortcut {
  
  @JSImport("esri/widgets/smartMapping/OpacitySlider/OpacitySliderViewModel", JSImport.Namespace)
  @js.native
  val ^ : js.Object & OpacitySliderViewModelConstructor = js.native
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("esri/widgets/smartMapping/OpacitySlider/OpacitySliderViewModel", JSImport.Namespace)
  @js.native
  /**
    * Provides the logic for the [OpacitySlider](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-smartMapping-OpacitySlider.html) widget.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-smartMapping-OpacitySlider-OpacitySliderViewModel.html)
    */
  open class Class ()
    extends StObject
       with OpacitySliderViewModel {
    def this(properties: OpacitySliderViewModelProperties) = this()
  }
  
  type _To = js.Object & OpacitySliderViewModelConstructor
  
  /* This means you don't have to write `^`, but can instead just say `esriWidgetsSmartMappingOpacitySliderOpacitySliderViewModelMod.foo` */
  override def _to: js.Object & OpacitySliderViewModelConstructor = ^
}
