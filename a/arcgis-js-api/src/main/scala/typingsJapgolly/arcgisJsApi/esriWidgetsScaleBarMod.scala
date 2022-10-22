package typingsJapgolly.arcgisJsApi

import org.scalablytyped.runtime.Shortcut
import typingsJapgolly.arcgisJsApi.esri.ScaleBar
import typingsJapgolly.arcgisJsApi.esri.ScaleBarConstructor
import typingsJapgolly.arcgisJsApi.esri.ScaleBarProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esriWidgetsScaleBarMod extends Shortcut {
  
  @JSImport("esri/widgets/ScaleBar", JSImport.Namespace)
  @js.native
  val ^ : js.Object & ScaleBarConstructor = js.native
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("esri/widgets/ScaleBar", JSImport.Namespace)
  @js.native
  /**
    * The ScaleBar widget displays a scale bar on the map or in a specified HTML node.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-ScaleBar.html)
    */
  open class Class ()
    extends StObject
       with ScaleBar {
    def this(properties: ScaleBarProperties) = this()
  }
  
  type _To = js.Object & ScaleBarConstructor
  
  /* This means you don't have to write `^`, but can instead just say `esriWidgetsScaleBarMod.foo` */
  override def _to: js.Object & ScaleBarConstructor = ^
}
