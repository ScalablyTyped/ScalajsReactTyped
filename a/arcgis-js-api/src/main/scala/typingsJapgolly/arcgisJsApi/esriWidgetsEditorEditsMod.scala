package typingsJapgolly.arcgisJsApi

import org.scalablytyped.runtime.Shortcut
import typingsJapgolly.arcgisJsApi.esri.Edits
import typingsJapgolly.arcgisJsApi.esri.EditsConstructor
import typingsJapgolly.arcgisJsApi.esri.EditsProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esriWidgetsEditorEditsMod extends Shortcut {
  
  @JSImport("esri/widgets/Editor/Edits", JSImport.Namespace)
  @js.native
  val ^ : js.Object & EditsConstructor = js.native
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("esri/widgets/Editor/Edits", JSImport.Namespace)
  @js.native
  /**
    * This class supports the [Editor](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Editor.html) widget.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Editor-Edits.html)
    */
  open class Class ()
    extends StObject
       with Edits {
    def this(properties: EditsProperties) = this()
  }
  
  type _To = js.Object & EditsConstructor
  
  /* This means you don't have to write `^`, but can instead just say `esriWidgetsEditorEditsMod.foo` */
  override def _to: js.Object & EditsConstructor = ^
}
