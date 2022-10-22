package typingsJapgolly.plottable

import typingsJapgolly.plottable.buildSrcCoreDatasetMod.Dataset
import typingsJapgolly.plottable.buildSrcCoreInterfacesMod.IAccessor
import typingsJapgolly.plottable.buildSrcCoreSymbolFactoriesMod.SymbolFactory
import typingsJapgolly.plottable.buildSrcDrawersCanvasBufferMod.CanvasBuffer
import typingsJapgolly.plottable.buildSrcDrawersCanvasDrawerMod.CanvasDrawStep
import typingsJapgolly.plottable.buildSrcDrawersSvgDrawerMod.SVGDrawer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object buildSrcDrawersSymbolDrawerMod {
  
  @JSImport("plottable/build/src/drawers/symbolDrawer", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("plottable/build/src/drawers/symbolDrawer", "SymbolSVGDrawer")
  @js.native
  open class SymbolSVGDrawer () extends SVGDrawer
  
  inline def makeSymbolCanvasDrawStep(
    dataset: Dataset,
    symbolProjector: js.Function0[IAccessor[SymbolFactory]],
    sizeProjector: js.Function0[IAccessor[Double]]
  ): CanvasDrawStep = (^.asInstanceOf[js.Dynamic].applyDynamic("makeSymbolCanvasDrawStep")(dataset.asInstanceOf[js.Any], symbolProjector.asInstanceOf[js.Any], sizeProjector.asInstanceOf[js.Any])).asInstanceOf[CanvasDrawStep]
  inline def makeSymbolCanvasDrawStep(
    dataset: Dataset,
    symbolProjector: js.Function0[IAccessor[SymbolFactory]],
    sizeProjector: js.Function0[IAccessor[Double]],
    stepBuffer: CanvasBuffer
  ): CanvasDrawStep = (^.asInstanceOf[js.Dynamic].applyDynamic("makeSymbolCanvasDrawStep")(dataset.asInstanceOf[js.Any], symbolProjector.asInstanceOf[js.Any], sizeProjector.asInstanceOf[js.Any], stepBuffer.asInstanceOf[js.Any])).asInstanceOf[CanvasDrawStep]
}
