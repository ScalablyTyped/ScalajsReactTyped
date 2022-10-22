package typingsJapgolly.vegaLite

import typingsJapgolly.vegaLite.anon.Header
import typingsJapgolly.vegaLite.buildSrcCompileAxisComponentMod.AxisComponent
import typingsJapgolly.vegaLite.buildSrcCompileAxisComponentMod.AxisComponentIndex
import typingsJapgolly.vegaLite.buildSrcCompileModelMod.Model
import typingsJapgolly.vegaLite.buildSrcConfigMod.Config
import typingsJapgolly.vegaLite.vegaLiteStrings.grid
import typingsJapgolly.vegaLite.vegaLiteStrings.main
import typingsJapgolly.vegaTypings.typesSpecAxisMod.Axis
import typingsJapgolly.vegaTypings.typesSpecSignalMod.NewSignal
import typingsJapgolly.vegaTypings.typesSpecSignalMod.SignalRef
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object buildSrcCompileAxisAssembleMod {
  
  @JSImport("vega-lite/build/src/compile/axis/assemble", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def assembleAxes(axisComponents: AxisComponentIndex, config: Config[SignalRef]): js.Array[Axis] = (^.asInstanceOf[js.Dynamic].applyDynamic("assembleAxes")(axisComponents.asInstanceOf[js.Any], config.asInstanceOf[js.Any])).asInstanceOf[js.Array[Axis]]
  
  inline def assembleAxis(axisCmpt: AxisComponent, kind: main | grid, config: Config[SignalRef]): Axis = (^.asInstanceOf[js.Dynamic].applyDynamic("assembleAxis")(axisCmpt.asInstanceOf[js.Any], kind.asInstanceOf[js.Any], config.asInstanceOf[js.Any])).asInstanceOf[Axis]
  inline def assembleAxis(axisCmpt: AxisComponent, kind: main | grid, config: Config[SignalRef], opt: Header): Axis = (^.asInstanceOf[js.Dynamic].applyDynamic("assembleAxis")(axisCmpt.asInstanceOf[js.Any], kind.asInstanceOf[js.Any], config.asInstanceOf[js.Any], opt.asInstanceOf[js.Any])).asInstanceOf[Axis]
  
  inline def assembleAxisSignals(model: Model): js.Array[NewSignal] = ^.asInstanceOf[js.Dynamic].applyDynamic("assembleAxisSignals")(model.asInstanceOf[js.Any]).asInstanceOf[js.Array[NewSignal]]
}
