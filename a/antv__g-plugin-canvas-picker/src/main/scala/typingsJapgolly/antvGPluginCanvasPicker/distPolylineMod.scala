package typingsJapgolly.antvGPluginCanvasPicker

import typingsJapgolly.antvGLite.distDisplayObjectsPolylineMod.PolylineStyleProps
import typingsJapgolly.antvGLite.mod.DisplayObject
import typingsJapgolly.antvGLite.mod.Point
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distPolylineMod {
  
  @JSImport("@antv/g-plugin-canvas-picker/dist/Polyline", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def isPointInPath(displayObject: DisplayObject[PolylineStyleProps, Any], position: Point): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isPointInPath")(displayObject.asInstanceOf[js.Any], position.asInstanceOf[js.Any])).asInstanceOf[Boolean]
}
