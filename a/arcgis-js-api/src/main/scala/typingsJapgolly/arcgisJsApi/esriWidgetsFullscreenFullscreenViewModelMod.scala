package typingsJapgolly.arcgisJsApi

import org.scalablytyped.runtime.Shortcut
import typingsJapgolly.arcgisJsApi.esri.FullscreenViewModel
import typingsJapgolly.arcgisJsApi.esri.FullscreenViewModelConstructor
import typingsJapgolly.arcgisJsApi.esri.FullscreenViewModelProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esriWidgetsFullscreenFullscreenViewModelMod extends Shortcut {
  
  @JSImport("esri/widgets/Fullscreen/FullscreenViewModel", JSImport.Namespace)
  @js.native
  val ^ : js.Object & FullscreenViewModelConstructor = js.native
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("esri/widgets/Fullscreen/FullscreenViewModel", JSImport.Namespace)
  @js.native
  /**
    * Provides the logic for the [Fullscreen](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Fullscreen.html) widget.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Fullscreen-FullscreenViewModel.html)
    */
  open class Class ()
    extends StObject
       with FullscreenViewModel {
    def this(properties: FullscreenViewModelProperties) = this()
  }
  
  type _To = js.Object & FullscreenViewModelConstructor
  
  /* This means you don't have to write `^`, but can instead just say `esriWidgetsFullscreenFullscreenViewModelMod.foo` */
  override def _to: js.Object & FullscreenViewModelConstructor = ^
}
