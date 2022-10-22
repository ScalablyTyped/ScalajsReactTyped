package typingsJapgolly.arcgisJsApi

import org.scalablytyped.runtime.Shortcut
import typingsJapgolly.arcgisJsApi.esri.LayerList
import typingsJapgolly.arcgisJsApi.esri.LayerListConstructor
import typingsJapgolly.arcgisJsApi.esri.LayerListProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esriWidgetsLayerListMod extends Shortcut {
  
  @JSImport("esri/widgets/LayerList", JSImport.Namespace)
  @js.native
  val ^ : js.Object & LayerListConstructor = js.native
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("esri/widgets/LayerList", JSImport.Namespace)
  @js.native
  /**
    * The LayerList widget provides a way to display a list of layers, and switch on/off their visibility.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-LayerList.html)
    */
  open class Class ()
    extends StObject
       with LayerList {
    def this(properties: LayerListProperties) = this()
  }
  
  type _To = js.Object & LayerListConstructor
  
  /* This means you don't have to write `^`, but can instead just say `esriWidgetsLayerListMod.foo` */
  override def _to: js.Object & LayerListConstructor = ^
}
