package typingsJapgolly.arcgisJsApi

import org.scalablytyped.runtime.Shortcut
import typingsJapgolly.arcgisJsApi.esri.SmartMappingSliderViewModel
import typingsJapgolly.arcgisJsApi.esri.SmartMappingSliderViewModelConstructor
import typingsJapgolly.arcgisJsApi.esri.SmartMappingSliderViewModelProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esriWidgetsSmartMappingSmartMappingSliderViewModelMod extends Shortcut {
  
  @JSImport("esri/widgets/smartMapping/SmartMappingSliderViewModel", JSImport.Namespace)
  @js.native
  val ^ : js.Object & SmartMappingSliderViewModelConstructor = js.native
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("esri/widgets/smartMapping/SmartMappingSliderViewModel", JSImport.Namespace)
  @js.native
  /**
    * Provides the shared base logic for the smart mapping slider view models.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-smartMapping-SmartMappingSliderViewModel.html)
    */
  open class Class ()
    extends StObject
       with SmartMappingSliderViewModel {
    def this(properties: SmartMappingSliderViewModelProperties) = this()
  }
  
  type _To = js.Object & SmartMappingSliderViewModelConstructor
  
  /* This means you don't have to write `^`, but can instead just say `esriWidgetsSmartMappingSmartMappingSliderViewModelMod.foo` */
  override def _to: js.Object & SmartMappingSliderViewModelConstructor = ^
}
