package typingsJapgolly.arcgisJsApi

import org.scalablytyped.runtime.Shortcut
import typingsJapgolly.arcgisJsApi.esri.Zoom
import typingsJapgolly.arcgisJsApi.esri.ZoomConstructor
import typingsJapgolly.arcgisJsApi.esri.ZoomProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esriWidgetsZoomMod extends Shortcut {
  
  @JSImport("esri/widgets/Zoom", JSImport.Namespace)
  @js.native
  val ^ : js.Object & ZoomConstructor = js.native
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("esri/widgets/Zoom", JSImport.Namespace)
  @js.native
  /**
    * The Zoom widget allows users to zoom in/out within a view.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Zoom.html)
    */
  open class Class ()
    extends StObject
       with Zoom {
    def this(properties: ZoomProperties) = this()
  }
  
  type _To = js.Object & ZoomConstructor
  
  /* This means you don't have to write `^`, but can instead just say `esriWidgetsZoomMod.foo` */
  override def _to: js.Object & ZoomConstructor = ^
}
