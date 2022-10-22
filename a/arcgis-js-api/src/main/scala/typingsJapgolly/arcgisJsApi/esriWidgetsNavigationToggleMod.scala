package typingsJapgolly.arcgisJsApi

import org.scalablytyped.runtime.Shortcut
import typingsJapgolly.arcgisJsApi.esri.NavigationToggle
import typingsJapgolly.arcgisJsApi.esri.NavigationToggleConstructor
import typingsJapgolly.arcgisJsApi.esri.NavigationToggleProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esriWidgetsNavigationToggleMod extends Shortcut {
  
  @JSImport("esri/widgets/NavigationToggle", JSImport.Namespace)
  @js.native
  val ^ : js.Object & NavigationToggleConstructor = js.native
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("esri/widgets/NavigationToggle", JSImport.Namespace)
  @js.native
  /**
    * Provides two simple buttons for toggling the [navigation mode](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-NavigationToggle-NavigationToggleViewModel.html#navigationMode) of a [SceneView](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-SceneView.html).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-NavigationToggle.html)
    */
  open class Class ()
    extends StObject
       with NavigationToggle {
    def this(properties: NavigationToggleProperties) = this()
  }
  
  type _To = js.Object & NavigationToggleConstructor
  
  /* This means you don't have to write `^`, but can instead just say `esriWidgetsNavigationToggleMod.foo` */
  override def _to: js.Object & NavigationToggleConstructor = ^
}
