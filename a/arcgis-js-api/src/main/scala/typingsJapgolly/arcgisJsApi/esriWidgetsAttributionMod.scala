package typingsJapgolly.arcgisJsApi

import org.scalablytyped.runtime.Shortcut
import typingsJapgolly.arcgisJsApi.esri.Attribution
import typingsJapgolly.arcgisJsApi.esri.AttributionConstructor
import typingsJapgolly.arcgisJsApi.esri.AttributionProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esriWidgetsAttributionMod extends Shortcut {
  
  @JSImport("esri/widgets/Attribution", JSImport.Namespace)
  @js.native
  val ^ : js.Object & AttributionConstructor = js.native
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("esri/widgets/Attribution", JSImport.Namespace)
  @js.native
  /**
    * The Attribution widget displays attribution text for the layers in a map.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Attribution.html)
    */
  open class Class ()
    extends StObject
       with Attribution {
    def this(properties: AttributionProperties) = this()
  }
  
  type _To = js.Object & AttributionConstructor
  
  /* This means you don't have to write `^`, but can instead just say `esriWidgetsAttributionMod.foo` */
  override def _to: js.Object & AttributionConstructor = ^
}
