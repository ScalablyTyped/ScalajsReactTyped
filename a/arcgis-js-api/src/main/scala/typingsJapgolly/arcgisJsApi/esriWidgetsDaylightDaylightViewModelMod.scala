package typingsJapgolly.arcgisJsApi

import org.scalablytyped.runtime.Shortcut
import typingsJapgolly.arcgisJsApi.esri.DaylightViewModel
import typingsJapgolly.arcgisJsApi.esri.DaylightViewModelConstructor
import typingsJapgolly.arcgisJsApi.esri.DaylightViewModelProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esriWidgetsDaylightDaylightViewModelMod extends Shortcut {
  
  @JSImport("esri/widgets/Daylight/DaylightViewModel", JSImport.Namespace)
  @js.native
  val ^ : js.Object & DaylightViewModelConstructor = js.native
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("esri/widgets/Daylight/DaylightViewModel", JSImport.Namespace)
  @js.native
  /**
    * Provides the logic for the [Daylight](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Daylight.html) widget.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Daylight-DaylightViewModel.html)
    */
  open class Class ()
    extends StObject
       with DaylightViewModel {
    def this(properties: DaylightViewModelProperties) = this()
  }
  
  type _To = js.Object & DaylightViewModelConstructor
  
  /* This means you don't have to write `^`, but can instead just say `esriWidgetsDaylightDaylightViewModelMod.foo` */
  override def _to: js.Object & DaylightViewModelConstructor = ^
}
