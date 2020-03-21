package typingsJapgolly.plottable

import typingsJapgolly.plottable.canvasBufferMod.CanvasBuffer
import typingsJapgolly.plottable.canvasDrawerMod.CanvasDrawStep
import typingsJapgolly.plottable.datasetMod.Dataset
import typingsJapgolly.plottable.interfacesMod.IAccessor
import typingsJapgolly.plottable.svgDrawerMod.SVGDrawer
import typingsJapgolly.plottable.symbolFactoriesMod.SymbolFactory
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("plottable/build/src/drawers/symbolDrawer", JSImport.Namespace)
@js.native
object symbolDrawerMod extends js.Object {
  @js.native
  class SymbolSVGDrawer () extends SVGDrawer
  
  def makeSymbolCanvasDrawStep(
    dataset: Dataset,
    symbolProjector: js.Function0[IAccessor[SymbolFactory]],
    sizeProjector: js.Function0[IAccessor[Double]]
  ): CanvasDrawStep = js.native
  def makeSymbolCanvasDrawStep(
    dataset: Dataset,
    symbolProjector: js.Function0[IAccessor[SymbolFactory]],
    sizeProjector: js.Function0[IAccessor[Double]],
    stepBuffer: CanvasBuffer
  ): CanvasDrawStep = js.native
}

