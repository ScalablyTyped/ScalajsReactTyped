package typingsJapgolly.vegaLite

import typingsJapgolly.vegaLite.buildSrcChannelMod.ScaleChannel
import typingsJapgolly.vegaLite.buildSrcCompileSelectionMod.SelectionCompiler
import typingsJapgolly.vegaLite.buildSrcCompileUnitMod.UnitModel
import typingsJapgolly.vegaLite.vegaLiteStrings.interval
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object buildSrcCompileSelectionScalesMod {
  
  @JSImport("vega-lite/build/src/compile/selection/scales", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("vega-lite/build/src/compile/selection/scales", JSImport.Default)
  @js.native
  val default: SelectionCompiler[interval] = js.native
  
  inline def domain(model: UnitModel, channel: ScaleChannel): String = (^.asInstanceOf[js.Dynamic].applyDynamic("domain")(model.asInstanceOf[js.Any], channel.asInstanceOf[js.Any])).asInstanceOf[String]
}
