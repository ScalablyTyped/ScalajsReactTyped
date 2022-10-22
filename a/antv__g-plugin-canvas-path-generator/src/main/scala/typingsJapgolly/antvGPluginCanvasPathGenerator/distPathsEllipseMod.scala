package typingsJapgolly.antvGPluginCanvasPathGenerator

import org.scalajs.dom.CanvasRenderingContext2D
import typingsJapgolly.antvGLite.distDisplayObjectsEllipseMod.ParsedEllipseStyleProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distPathsEllipseMod {
  
  @JSImport("@antv/g-plugin-canvas-path-generator/dist/paths/Ellipse", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def generatePath(context: CanvasRenderingContext2D, parsedStyle: ParsedEllipseStyleProps): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("generatePath")(context.asInstanceOf[js.Any], parsedStyle.asInstanceOf[js.Any])).asInstanceOf[Unit]
}
