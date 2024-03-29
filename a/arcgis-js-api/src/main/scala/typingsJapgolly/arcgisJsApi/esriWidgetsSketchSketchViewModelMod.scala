package typingsJapgolly.arcgisJsApi

import org.scalablytyped.runtime.Shortcut
import typingsJapgolly.arcgisJsApi.esri.SketchViewModel
import typingsJapgolly.arcgisJsApi.esri.SketchViewModelConstructor
import typingsJapgolly.arcgisJsApi.esri.SketchViewModelProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esriWidgetsSketchSketchViewModelMod extends Shortcut {
  
  @JSImport("esri/widgets/Sketch/SketchViewModel", JSImport.Namespace)
  @js.native
  val ^ : js.Object & SketchViewModelConstructor = js.native
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("esri/widgets/Sketch/SketchViewModel", JSImport.Namespace)
  @js.native
  /**
    * Provides the logic for the [Sketch](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Sketch.html) widget.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Sketch-SketchViewModel.html)
    */
  open class Class ()
    extends StObject
       with SketchViewModel {
    def this(properties: SketchViewModelProperties) = this()
  }
  
  type _To = js.Object & SketchViewModelConstructor
  
  /* This means you don't have to write `^`, but can instead just say `esriWidgetsSketchSketchViewModelMod.foo` */
  override def _to: js.Object & SketchViewModelConstructor = ^
}
