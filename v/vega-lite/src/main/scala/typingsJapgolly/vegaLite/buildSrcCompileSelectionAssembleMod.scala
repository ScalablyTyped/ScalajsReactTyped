package typingsJapgolly.vegaLite

import typingsJapgolly.vegaLite.buildSrcCompileFacetMod.FacetModel
import typingsJapgolly.vegaLite.buildSrcCompileLayerMod.LayerModel
import typingsJapgolly.vegaLite.buildSrcCompileModelMod.Model
import typingsJapgolly.vegaLite.buildSrcCompileScaleComponentMod.ScaleComponent
import typingsJapgolly.vegaLite.buildSrcCompileUnitMod.UnitModel
import typingsJapgolly.vegaLite.buildSrcSelectionMod.ParameterExtent
import typingsJapgolly.vegaLite.buildSrcSelectionMod.SelectionInit
import typingsJapgolly.vegaLite.buildSrcSelectionMod.SelectionInitInterval
import typingsJapgolly.vegaLite.buildSrcVegaDotschemaMod.VgData
import typingsJapgolly.vegaLite.buildSrcVegaDotschemaMod.VgDomain
import typingsJapgolly.vegaTypings.typesSpecSignalMod.Signal
import typingsJapgolly.vegaTypings.typesSpecSignalMod.SignalRef
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object buildSrcCompileSelectionAssembleMod {
  
  @JSImport("vega-lite/build/src/compile/selection/assemble", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def assembleFacetSignals(model: FacetModel, signals: js.Array[Signal]): js.Array[Signal] = (^.asInstanceOf[js.Dynamic].applyDynamic("assembleFacetSignals")(model.asInstanceOf[js.Any], signals.asInstanceOf[js.Any])).asInstanceOf[js.Array[Signal]]
  
  inline def assembleInit(init: js.Array[SelectionInit | js.Array[SelectionInit] | SelectionInitInterval]): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("assembleInit")(init.asInstanceOf[js.Any]).asInstanceOf[Any]
  inline def assembleInit(init: js.Array[SelectionInit | js.Array[SelectionInit] | SelectionInitInterval], isExpr: Boolean): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("assembleInit")(init.asInstanceOf[js.Any], isExpr.asInstanceOf[js.Any])).asInstanceOf[Any]
  inline def assembleInit(
    init: js.Array[SelectionInit | js.Array[SelectionInit] | SelectionInitInterval],
    isExpr: Boolean,
    wrap: js.Function1[/* str */ String | Double, String | Double]
  ): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("assembleInit")(init.asInstanceOf[js.Any], isExpr.asInstanceOf[js.Any], wrap.asInstanceOf[js.Any])).asInstanceOf[Any]
  inline def assembleInit(
    init: js.Array[SelectionInit | js.Array[SelectionInit] | SelectionInitInterval],
    isExpr: Unit,
    wrap: js.Function1[/* str */ String | Double, String | Double]
  ): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("assembleInit")(init.asInstanceOf[js.Any], isExpr.asInstanceOf[js.Any], wrap.asInstanceOf[js.Any])).asInstanceOf[Any]
  inline def assembleInit(init: SelectionInit): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("assembleInit")(init.asInstanceOf[js.Any]).asInstanceOf[Any]
  inline def assembleInit(init: SelectionInit, isExpr: Boolean): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("assembleInit")(init.asInstanceOf[js.Any], isExpr.asInstanceOf[js.Any])).asInstanceOf[Any]
  inline def assembleInit(
    init: SelectionInit,
    isExpr: Boolean,
    wrap: js.Function1[/* str */ String | Double, String | Double]
  ): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("assembleInit")(init.asInstanceOf[js.Any], isExpr.asInstanceOf[js.Any], wrap.asInstanceOf[js.Any])).asInstanceOf[Any]
  inline def assembleInit(init: SelectionInit, isExpr: Unit, wrap: js.Function1[/* str */ String | Double, String | Double]): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("assembleInit")(init.asInstanceOf[js.Any], isExpr.asInstanceOf[js.Any], wrap.asInstanceOf[js.Any])).asInstanceOf[Any]
  
  inline def assembleLayerSelectionMarks(model: LayerModel, marks: js.Array[Any]): js.Array[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("assembleLayerSelectionMarks")(model.asInstanceOf[js.Any], marks.asInstanceOf[js.Any])).asInstanceOf[js.Array[Any]]
  
  inline def assembleSelectionScaleDomain(model: Model, extent: ParameterExtent, scaleCmpt: ScaleComponent, domain: VgDomain): SignalRef = (^.asInstanceOf[js.Dynamic].applyDynamic("assembleSelectionScaleDomain")(model.asInstanceOf[js.Any], extent.asInstanceOf[js.Any], scaleCmpt.asInstanceOf[js.Any], domain.asInstanceOf[js.Any])).asInstanceOf[SignalRef]
  
  inline def assembleTopLevelSignals(model: UnitModel, signals: js.Array[Signal]): js.Array[Signal] = (^.asInstanceOf[js.Dynamic].applyDynamic("assembleTopLevelSignals")(model.asInstanceOf[js.Any], signals.asInstanceOf[js.Any])).asInstanceOf[js.Array[Signal]]
  
  inline def assembleUnitSelectionData(model: UnitModel, data: js.Array[VgData]): js.Array[VgData] = (^.asInstanceOf[js.Dynamic].applyDynamic("assembleUnitSelectionData")(model.asInstanceOf[js.Any], data.asInstanceOf[js.Any])).asInstanceOf[js.Array[VgData]]
  
  inline def assembleUnitSelectionMarks(model: UnitModel, marks: js.Array[Any]): js.Array[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("assembleUnitSelectionMarks")(model.asInstanceOf[js.Any], marks.asInstanceOf[js.Any])).asInstanceOf[js.Array[Any]]
  
  inline def assembleUnitSelectionSignals(model: UnitModel, signals: js.Array[Signal]): js.Array[Signal] = (^.asInstanceOf[js.Dynamic].applyDynamic("assembleUnitSelectionSignals")(model.asInstanceOf[js.Any], signals.asInstanceOf[js.Any])).asInstanceOf[js.Array[Signal]]
}
