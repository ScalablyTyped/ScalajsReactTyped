package typingsJapgolly.plottable

import typingsJapgolly.d3Shape.mod.Area_
import typingsJapgolly.d3Shape.mod.Line_
import typingsJapgolly.plottable.canvasDrawerMod.CanvasDrawStep
import typingsJapgolly.plottable.svgDrawerMod.SVGDrawer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("plottable/build/src/drawers/areaDrawer", JSImport.Namespace)
@js.native
object areaDrawerMod extends js.Object {
  @js.native
  class AreaSVGDrawer () extends SVGDrawer
  
  def makeAreaCanvasDrawStep(d3AreaFactory: js.Function0[Area_[_]], d3LineFactory: js.Function0[Line_[_]]): CanvasDrawStep = js.native
}

