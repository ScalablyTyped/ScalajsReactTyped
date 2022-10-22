package typingsJapgolly.arcgisJsApi

import org.scalablytyped.runtime.Shortcut
import typingsJapgolly.arcgisJsApi.esri.DefaultUI
import typingsJapgolly.arcgisJsApi.esri.DefaultUIConstructor
import typingsJapgolly.arcgisJsApi.esri.DefaultUIProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esriViewsUiDefaultUIMod extends Shortcut {
  
  @JSImport("esri/views/ui/DefaultUI", JSImport.Namespace)
  @js.native
  val ^ : js.Object & DefaultUIConstructor = js.native
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("esri/views/ui/DefaultUI", JSImport.Namespace)
  @js.native
  /**
    * The DefaultUI class exposes the default [widget](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Widget.html) [components](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-ui-DefaultUI.html#components) available in either a [MapView](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-MapView.html) or a [SceneView](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-SceneView.html).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-ui-DefaultUI.html)
    */
  open class Class ()
    extends StObject
       with DefaultUI {
    def this(properties: DefaultUIProperties) = this()
  }
  
  type _To = js.Object & DefaultUIConstructor
  
  /* This means you don't have to write `^`, but can instead just say `esriViewsUiDefaultUIMod.foo` */
  override def _to: js.Object & DefaultUIConstructor = ^
}
