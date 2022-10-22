package typingsJapgolly.plottable

import org.scalajs.dom.CanvasRenderingContext2D
import typingsJapgolly.plottable.buildSrcDrawersCanvasDrawerMod.CanvasDrawStep
import typingsJapgolly.plottable.buildSrcDrawersCanvasDrawerMod.CanvasDrawer
import typingsJapgolly.plottable.buildSrcDrawersSvgDrawerMod.SVGDrawer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object buildSrcDrawersRectangleDrawerMod {
  
  @JSImport("plottable/build/src/drawers/rectangleDrawer", "RectangleCanvasDrawStep")
  @js.native
  val RectangleCanvasDrawStep: CanvasDrawStep = js.native
  
  @JSImport("plottable/build/src/drawers/rectangleDrawer", "RectangleCanvasDrawer")
  @js.native
  open class RectangleCanvasDrawer protected () extends CanvasDrawer {
    def this(ctx: CanvasRenderingContext2D) = this()
  }
  
  @JSImport("plottable/build/src/drawers/rectangleDrawer", "RectangleSVGDrawer")
  @js.native
  open class RectangleSVGDrawer () extends SVGDrawer {
    def this(_rootClassName: String) = this()
    
    /* private */ var _rootClassName: Any = js.native
  }
}
