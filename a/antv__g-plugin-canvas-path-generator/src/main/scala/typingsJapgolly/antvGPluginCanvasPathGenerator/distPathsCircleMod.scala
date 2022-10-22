package typingsJapgolly.antvGPluginCanvasPathGenerator

import org.scalajs.dom.CanvasRenderingContext2D
import typingsJapgolly.antvGLite.distDisplayObjectsCircleMod.ParsedCircleStyleProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distPathsCircleMod {
  
  @JSImport("@antv/g-plugin-canvas-path-generator/dist/paths/Circle", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def generatePath(context: CanvasRenderingContext2D, parsedStyle: ParsedCircleStyleProps): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("generatePath")(context.asInstanceOf[js.Any], parsedStyle.asInstanceOf[js.Any])).asInstanceOf[Unit]
}
