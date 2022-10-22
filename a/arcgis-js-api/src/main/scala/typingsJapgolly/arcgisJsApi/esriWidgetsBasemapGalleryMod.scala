package typingsJapgolly.arcgisJsApi

import org.scalablytyped.runtime.Shortcut
import typingsJapgolly.arcgisJsApi.esri.BasemapGallery
import typingsJapgolly.arcgisJsApi.esri.BasemapGalleryConstructor
import typingsJapgolly.arcgisJsApi.esri.BasemapGalleryProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esriWidgetsBasemapGalleryMod extends Shortcut {
  
  @JSImport("esri/widgets/BasemapGallery", JSImport.Namespace)
  @js.native
  val ^ : js.Object & BasemapGalleryConstructor = js.native
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("esri/widgets/BasemapGallery", JSImport.Namespace)
  @js.native
  /**
    * The BasemapGallery widget displays a collection images representing basemaps from ArcGIS.com or a user-defined set of map or image services.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-BasemapGallery.html)
    */
  open class Class ()
    extends StObject
       with BasemapGallery {
    def this(properties: BasemapGalleryProperties) = this()
  }
  
  type _To = js.Object & BasemapGalleryConstructor
  
  /* This means you don't have to write `^`, but can instead just say `esriWidgetsBasemapGalleryMod.foo` */
  override def _to: js.Object & BasemapGalleryConstructor = ^
}
