package typingsJapgolly.plottable

import typingsJapgolly.d3Shape.mod.Line_
import typingsJapgolly.plottable.canvasDrawerMod.CanvasDrawStep
import typingsJapgolly.plottable.svgDrawerMod.SVGDrawer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("plottable/build/src/drawers/lineDrawer", JSImport.Namespace)
@js.native
object lineDrawerMod extends js.Object {
  @js.native
  class LineSVGDrawer () extends SVGDrawer
  
  def makeLineCanvasDrawStep(d3LineFactory: js.Function0[Line_[_]]): CanvasDrawStep = js.native
}

