package typingsJapgolly.vegaLite

import typingsJapgolly.vegaLite.anon.ClipHeight
import typingsJapgolly.vegaLite.buildSrcCompileLegendComponentMod.LegendComponent
import typingsJapgolly.vegaLite.buildSrcCompileModelMod.Model
import typingsJapgolly.vegaLite.buildSrcConfigMod.Config
import typingsJapgolly.vegaLite.buildSrcExprMod.ExprRef
import typingsJapgolly.vegaTypings.typesSpecLegendMod.Legend
import typingsJapgolly.vegaTypings.typesSpecSignalMod.SignalRef
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object buildSrcCompileLegendAssembleMod {
  
  @JSImport("vega-lite/build/src/compile/legend/assemble", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def assembleLegend(legendCmpt: LegendComponent, config: Config[ExprRef | SignalRef]): ClipHeight = (^.asInstanceOf[js.Dynamic].applyDynamic("assembleLegend")(legendCmpt.asInstanceOf[js.Any], config.asInstanceOf[js.Any])).asInstanceOf[ClipHeight]
  
  inline def assembleLegends(model: Model): js.Array[Legend] = ^.asInstanceOf[js.Dynamic].applyDynamic("assembleLegends")(model.asInstanceOf[js.Any]).asInstanceOf[js.Array[Legend]]
}
