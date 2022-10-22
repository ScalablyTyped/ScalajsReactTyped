package typingsJapgolly.arcgisJsApi

import org.scalablytyped.runtime.Shortcut
import typingsJapgolly.arcgisJsApi.esri.AttributionViewModel
import typingsJapgolly.arcgisJsApi.esri.AttributionViewModelConstructor
import typingsJapgolly.arcgisJsApi.esri.AttributionViewModelProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esriWidgetsAttributionAttributionViewModelMod extends Shortcut {
  
  @JSImport("esri/widgets/Attribution/AttributionViewModel", JSImport.Namespace)
  @js.native
  val ^ : js.Object & AttributionViewModelConstructor = js.native
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("esri/widgets/Attribution/AttributionViewModel", JSImport.Namespace)
  @js.native
  /**
    * Provides the logic for the [Attribution](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Attribution.html) widget.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Attribution-AttributionViewModel.html)
    */
  open class Class ()
    extends StObject
       with AttributionViewModel {
    def this(properties: AttributionViewModelProperties) = this()
  }
  
  type _To = js.Object & AttributionViewModelConstructor
  
  /* This means you don't have to write `^`, but can instead just say `esriWidgetsAttributionAttributionViewModelMod.foo` */
  override def _to: js.Object & AttributionViewModelConstructor = ^
}
