package typingsJapgolly.arcgisJsApi

import org.scalablytyped.runtime.Shortcut
import typingsJapgolly.arcgisJsApi.esri.Swipe
import typingsJapgolly.arcgisJsApi.esri.SwipeConstructor
import typingsJapgolly.arcgisJsApi.esri.SwipeProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esriWidgetsSwipeMod extends Shortcut {
  
  @JSImport("esri/widgets/Swipe", JSImport.Namespace)
  @js.native
  val ^ : js.Object & SwipeConstructor = js.native
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("esri/widgets/Swipe", JSImport.Namespace)
  @js.native
  /**
    * The Swipe widget provides a tool to show a portion of a layer or layers on top of a map.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Swipe.html)
    */
  open class Class ()
    extends StObject
       with Swipe {
    def this(properties: SwipeProperties) = this()
  }
  
  type _To = js.Object & SwipeConstructor
  
  /* This means you don't have to write `^`, but can instead just say `esriWidgetsSwipeMod.foo` */
  override def _to: js.Object & SwipeConstructor = ^
}
