package typingsJapgolly.reactPlotlyJs

import typingsJapgolly.react.mod.ComponentType
import typingsJapgolly.reactPlotlyJs.mod.PlotParams
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object factoryMod {
  
  @JSImport("react-plotly.js/factory", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(plotly: js.Object): ComponentType[PlotParams] = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(plotly.asInstanceOf[js.Any]).asInstanceOf[ComponentType[PlotParams]]
}
