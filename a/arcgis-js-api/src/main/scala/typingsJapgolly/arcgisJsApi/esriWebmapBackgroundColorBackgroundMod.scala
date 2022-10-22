package typingsJapgolly.arcgisJsApi

import org.scalablytyped.runtime.Shortcut
import typingsJapgolly.arcgisJsApi.esri.ColorBackground
import typingsJapgolly.arcgisJsApi.esri.ColorBackgroundConstructor
import typingsJapgolly.arcgisJsApi.esri.ColorBackgroundProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esriWebmapBackgroundColorBackgroundMod extends Shortcut {
  
  @JSImport("esri/webmap/background/ColorBackground", JSImport.Namespace)
  @js.native
  val ^ : js.Object & ColorBackgroundConstructor = js.native
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("esri/webmap/background/ColorBackground", JSImport.Namespace)
  @js.native
  /**
    * Represents the background color of the [WebMap](https://developers.arcgis.com/javascript/latest/api-reference/esri-WebMap.html) when displayed in a [MapView](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-MapView.html).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-webmap-background-ColorBackground.html)
    */
  open class Class ()
    extends StObject
       with ColorBackground {
    def this(properties: ColorBackgroundProperties) = this()
    
    /**
      * Converts an instance of this class to its [ArcGIS portal JSON](https://developers.arcgis.com/documentation/common-data-types/geometry-objects.htm) representation.
      *
      * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-core-JSONSupport.html#toJSON)
      */
    /* CompleteClass */
    override def toJSON(): Any = js.native
  }
  
  type _To = js.Object & ColorBackgroundConstructor
  
  /* This means you don't have to write `^`, but can instead just say `esriWebmapBackgroundColorBackgroundMod.foo` */
  override def _to: js.Object & ColorBackgroundConstructor = ^
}
