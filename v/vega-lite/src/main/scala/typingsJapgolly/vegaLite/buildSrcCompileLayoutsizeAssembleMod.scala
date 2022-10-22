package typingsJapgolly.vegaLite

import typingsJapgolly.vegaLite.buildSrcCompileLayoutsizeComponentMod.LayoutSizeType
import typingsJapgolly.vegaLite.buildSrcCompileModelMod.Model
import typingsJapgolly.vegaLite.buildSrcCompileScaleComponentMod.ScaleComponent
import typingsJapgolly.vegaTypings.typesSpecSignalMod.InitSignal
import typingsJapgolly.vegaTypings.typesSpecSignalMod.NewSignal
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object buildSrcCompileLayoutsizeAssembleMod {
  
  @JSImport("vega-lite/build/src/compile/layoutsize/assemble", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def assembleLayoutSignals(model: Model): js.Array[NewSignal] = ^.asInstanceOf[js.Dynamic].applyDynamic("assembleLayoutSignals")(model.asInstanceOf[js.Any]).asInstanceOf[js.Array[NewSignal]]
  
  inline def sizeExpr(scaleName: String, scaleComponent: ScaleComponent, cardinality: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("sizeExpr")(scaleName.asInstanceOf[js.Any], scaleComponent.asInstanceOf[js.Any], cardinality.asInstanceOf[js.Any])).asInstanceOf[String]
  
  inline def sizeSignals(model: Model, sizeType: LayoutSizeType): js.Array[NewSignal | InitSignal] = (^.asInstanceOf[js.Dynamic].applyDynamic("sizeSignals")(model.asInstanceOf[js.Any], sizeType.asInstanceOf[js.Any])).asInstanceOf[js.Array[NewSignal | InitSignal]]
}
