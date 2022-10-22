package typingsJapgolly.arcgisJsApi

import org.scalablytyped.runtime.Shortcut
import typingsJapgolly.arcgisJsApi.esri.Expand
import typingsJapgolly.arcgisJsApi.esri.ExpandConstructor
import typingsJapgolly.arcgisJsApi.esri.ExpandProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esriWidgetsExpandMod extends Shortcut {
  
  @JSImport("esri/widgets/Expand", JSImport.Namespace)
  @js.native
  val ^ : js.Object & ExpandConstructor = js.native
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("esri/widgets/Expand", JSImport.Namespace)
  @js.native
  /**
    * The Expand widget acts as a clickable button for opening a widget.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Expand.html)
    */
  open class Class ()
    extends StObject
       with Expand {
    def this(properties: ExpandProperties) = this()
  }
  
  type _To = js.Object & ExpandConstructor
  
  /* This means you don't have to write `^`, but can instead just say `esriWidgetsExpandMod.foo` */
  override def _to: js.Object & ExpandConstructor = ^
}
