package typingsJapgolly.arcgisJsApi

import org.scalablytyped.runtime.Shortcut
import typingsJapgolly.arcgisJsApi.esri.EditorViewModel
import typingsJapgolly.arcgisJsApi.esri.EditorViewModelConstructor
import typingsJapgolly.arcgisJsApi.esri.EditorViewModelProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esriWidgetsEditorEditorViewModelMod extends Shortcut {
  
  @JSImport("esri/widgets/Editor/EditorViewModel", JSImport.Namespace)
  @js.native
  val ^ : js.Object & EditorViewModelConstructor = js.native
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("esri/widgets/Editor/EditorViewModel", JSImport.Namespace)
  @js.native
  /**
    * Provides the logic for the [Editor](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Editor.html) widget.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Editor-EditorViewModel.html)
    */
  open class Class ()
    extends StObject
       with EditorViewModel {
    def this(properties: EditorViewModelProperties) = this()
  }
  
  type _To = js.Object & EditorViewModelConstructor
  
  /* This means you don't have to write `^`, but can instead just say `esriWidgetsEditorEditorViewModelMod.foo` */
  override def _to: js.Object & EditorViewModelConstructor = ^
}
