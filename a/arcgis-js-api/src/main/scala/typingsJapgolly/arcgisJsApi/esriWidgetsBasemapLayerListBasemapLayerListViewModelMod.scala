package typingsJapgolly.arcgisJsApi

import org.scalablytyped.runtime.Shortcut
import typingsJapgolly.arcgisJsApi.esri.BasemapLayerListViewModel
import typingsJapgolly.arcgisJsApi.esri.BasemapLayerListViewModelConstructor
import typingsJapgolly.arcgisJsApi.esri.BasemapLayerListViewModelProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esriWidgetsBasemapLayerListBasemapLayerListViewModelMod extends Shortcut {
  
  @JSImport("esri/widgets/BasemapLayerList/BasemapLayerListViewModel", JSImport.Namespace)
  @js.native
  val ^ : js.Object & BasemapLayerListViewModelConstructor = js.native
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("esri/widgets/BasemapLayerList/BasemapLayerListViewModel", JSImport.Namespace)
  @js.native
  /**
    * Provides logic for the [BasemapLayerList](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-BasemapLayerList.html) widget.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-BasemapLayerList-BasemapLayerListViewModel.html)
    */
  open class Class ()
    extends StObject
       with BasemapLayerListViewModel {
    def this(properties: BasemapLayerListViewModelProperties) = this()
  }
  
  type _To = js.Object & BasemapLayerListViewModelConstructor
  
  /* This means you don't have to write `^`, but can instead just say `esriWidgetsBasemapLayerListBasemapLayerListViewModelMod.foo` */
  override def _to: js.Object & BasemapLayerListViewModelConstructor = ^
}
