package typingsJapgolly.arcgisJsApi

import org.scalablytyped.runtime.Shortcut
import typingsJapgolly.arcgisJsApi.esri.FloorFilter
import typingsJapgolly.arcgisJsApi.esri.FloorFilterConstructor
import typingsJapgolly.arcgisJsApi.esri.FloorFilterProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esriWidgetsFloorFilterMod extends Shortcut {
  
  @JSImport("esri/widgets/FloorFilter", JSImport.Namespace)
  @js.native
  val ^ : js.Object & FloorFilterConstructor = js.native
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("esri/widgets/FloorFilter", JSImport.Namespace)
  @js.native
  /**
    * The FloorFilter widget simplifies visualization of GIS data for a specific floor of a building in your application.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-FloorFilter.html)
    */
  open class Class ()
    extends StObject
       with FloorFilter {
    def this(properties: FloorFilterProperties) = this()
  }
  
  type _To = js.Object & FloorFilterConstructor
  
  /* This means you don't have to write `^`, but can instead just say `esriWidgetsFloorFilterMod.foo` */
  override def _to: js.Object & FloorFilterConstructor = ^
}
