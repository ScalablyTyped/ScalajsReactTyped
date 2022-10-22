package typingsJapgolly.arcgisJsApi

import org.scalablytyped.runtime.Shortcut
import typingsJapgolly.arcgisJsApi.esri.InitialViewProperties
import typingsJapgolly.arcgisJsApi.esri.InitialViewPropertiesConstructor
import typingsJapgolly.arcgisJsApi.esri.InitialViewPropertiesProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esriWebmapInitialViewPropertiesMod extends Shortcut {
  
  @JSImport("esri/webmap/InitialViewProperties", JSImport.Namespace)
  @js.native
  val ^ : js.Object & InitialViewPropertiesConstructor = js.native
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("esri/webmap/InitialViewProperties", JSImport.Namespace)
  @js.native
  /**
    * Represents the initial viewing state of the [WebMap](https://developers.arcgis.com/javascript/latest/api-reference/esri-WebMap.html) when displayed in a [MapView](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-MapView.html).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-webmap-InitialViewProperties.html)
    */
  open class Class ()
    extends StObject
       with InitialViewProperties {
    def this(properties: InitialViewPropertiesProperties) = this()
  }
  
  type _To = js.Object & InitialViewPropertiesConstructor
  
  /* This means you don't have to write `^`, but can instead just say `esriWebmapInitialViewPropertiesMod.foo` */
  override def _to: js.Object & InitialViewPropertiesConstructor = ^
}
