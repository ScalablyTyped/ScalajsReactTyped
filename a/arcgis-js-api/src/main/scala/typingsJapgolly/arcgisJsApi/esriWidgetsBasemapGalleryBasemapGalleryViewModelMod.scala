package typingsJapgolly.arcgisJsApi

import org.scalablytyped.runtime.Shortcut
import typingsJapgolly.arcgisJsApi.esri.BasemapGalleryViewModel
import typingsJapgolly.arcgisJsApi.esri.BasemapGalleryViewModelConstructor
import typingsJapgolly.arcgisJsApi.esri.BasemapGalleryViewModelProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esriWidgetsBasemapGalleryBasemapGalleryViewModelMod extends Shortcut {
  
  @JSImport("esri/widgets/BasemapGallery/BasemapGalleryViewModel", JSImport.Namespace)
  @js.native
  val ^ : js.Object & BasemapGalleryViewModelConstructor = js.native
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("esri/widgets/BasemapGallery/BasemapGalleryViewModel", JSImport.Namespace)
  @js.native
  /**
    * Provides the logic for the [BasemapGallery](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-BasemapGallery.html) widget.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-BasemapGallery-BasemapGalleryViewModel.html)
    */
  open class Class ()
    extends StObject
       with BasemapGalleryViewModel {
    def this(properties: BasemapGalleryViewModelProperties) = this()
  }
  
  type _To = js.Object & BasemapGalleryViewModelConstructor
  
  /* This means you don't have to write `^`, but can instead just say `esriWidgetsBasemapGalleryBasemapGalleryViewModelMod.foo` */
  override def _to: js.Object & BasemapGalleryViewModelConstructor = ^
}
