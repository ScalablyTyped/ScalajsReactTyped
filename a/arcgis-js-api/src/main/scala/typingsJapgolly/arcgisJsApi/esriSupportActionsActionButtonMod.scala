package typingsJapgolly.arcgisJsApi

import org.scalablytyped.runtime.Shortcut
import typingsJapgolly.arcgisJsApi.esri.ActionButton
import typingsJapgolly.arcgisJsApi.esri.ActionButtonConstructor
import typingsJapgolly.arcgisJsApi.esri.ActionButtonProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esriSupportActionsActionButtonMod extends Shortcut {
  
  @JSImport("esri/support/actions/ActionButton", JSImport.Namespace)
  @js.native
  val ^ : js.Object & ActionButtonConstructor = js.native
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("esri/support/actions/ActionButton", JSImport.Namespace)
  @js.native
  /**
    * A customizable button that performs a specific action(s) used in widgets such as the [Popup](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Popup.html), [LayerList](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-LayerList.html), and [BasemapLayerList](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-BasemapLayerList.html).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-support-actions-ActionButton.html)
    */
  open class Class ()
    extends StObject
       with ActionButton {
    def this(properties: ActionButtonProperties) = this()
  }
  
  type _To = js.Object & ActionButtonConstructor
  
  /* This means you don't have to write `^`, but can instead just say `esriSupportActionsActionButtonMod.foo` */
  override def _to: js.Object & ActionButtonConstructor = ^
}
