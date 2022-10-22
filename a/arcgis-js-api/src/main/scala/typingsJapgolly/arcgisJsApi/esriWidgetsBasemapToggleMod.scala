package typingsJapgolly.arcgisJsApi

import org.scalablytyped.runtime.Shortcut
import typingsJapgolly.arcgisJsApi.esri.BasemapToggle
import typingsJapgolly.arcgisJsApi.esri.BasemapToggleConstructor
import typingsJapgolly.arcgisJsApi.esri.BasemapToggleProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esriWidgetsBasemapToggleMod extends Shortcut {
  
  @JSImport("esri/widgets/BasemapToggle", JSImport.Namespace)
  @js.native
  val ^ : js.Object & BasemapToggleConstructor = js.native
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("esri/widgets/BasemapToggle", JSImport.Namespace)
  @js.native
  /**
    * The BasemapToggle provides a widget which allows an end-user to switch between two basemaps.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-BasemapToggle.html)
    */
  open class Class ()
    extends StObject
       with BasemapToggle {
    def this(properties: BasemapToggleProperties) = this()
  }
  
  type _To = js.Object & BasemapToggleConstructor
  
  /* This means you don't have to write `^`, but can instead just say `esriWidgetsBasemapToggleMod.foo` */
  override def _to: js.Object & BasemapToggleConstructor = ^
}
