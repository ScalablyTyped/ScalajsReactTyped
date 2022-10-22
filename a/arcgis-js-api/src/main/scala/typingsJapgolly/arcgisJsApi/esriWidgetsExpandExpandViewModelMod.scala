package typingsJapgolly.arcgisJsApi

import org.scalablytyped.runtime.Shortcut
import typingsJapgolly.arcgisJsApi.esri.ExpandViewModel
import typingsJapgolly.arcgisJsApi.esri.ExpandViewModelConstructor
import typingsJapgolly.arcgisJsApi.esri.ExpandViewModelProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esriWidgetsExpandExpandViewModelMod extends Shortcut {
  
  @JSImport("esri/widgets/Expand/ExpandViewModel", JSImport.Namespace)
  @js.native
  val ^ : js.Object & ExpandViewModelConstructor = js.native
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("esri/widgets/Expand/ExpandViewModel", JSImport.Namespace)
  @js.native
  /**
    * Provides the logic for the [Expand](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Expand.html) widget.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Expand-ExpandViewModel.html)
    */
  open class Class ()
    extends StObject
       with ExpandViewModel {
    def this(properties: ExpandViewModelProperties) = this()
  }
  
  type _To = js.Object & ExpandViewModelConstructor
  
  /* This means you don't have to write `^`, but can instead just say `esriWidgetsExpandExpandViewModelMod.foo` */
  override def _to: js.Object & ExpandViewModelConstructor = ^
}
