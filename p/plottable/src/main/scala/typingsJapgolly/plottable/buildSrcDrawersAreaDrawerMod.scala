package typingsJapgolly.plottable

import typingsJapgolly.d3Shape.mod.Area_
import typingsJapgolly.d3Shape.mod.Line_
import typingsJapgolly.plottable.buildSrcDrawersCanvasDrawerMod.CanvasDrawStep
import typingsJapgolly.plottable.buildSrcDrawersSvgDrawerMod.SVGDrawer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object buildSrcDrawersAreaDrawerMod {
  
  @JSImport("plottable/build/src/drawers/areaDrawer", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("plottable/build/src/drawers/areaDrawer", "AreaSVGDrawer")
  @js.native
  open class AreaSVGDrawer () extends SVGDrawer
  
  inline def makeAreaCanvasDrawStep(d3AreaFactory: js.Function0[Area_[Any]], d3LineFactory: js.Function0[Line_[Any]]): CanvasDrawStep = (^.asInstanceOf[js.Dynamic].applyDynamic("makeAreaCanvasDrawStep")(d3AreaFactory.asInstanceOf[js.Any], d3LineFactory.asInstanceOf[js.Any])).asInstanceOf[CanvasDrawStep]
}
