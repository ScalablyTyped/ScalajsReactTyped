package typingsJapgolly.reactNativeMaps.components

import typingsJapgolly.reactNativeMaps.libMapHeatmapMod.MapHeatmapProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Heatmap {
  
  @JSImport("react-native-maps/lib", "Heatmap")
  @js.native
  val component: js.Object = js.native
  
  implicit def make(companion: Heatmap.type): SharedBuilder_MapHeatmapProps_1477137980[typingsJapgolly.reactNativeMaps.libMod.Heatmap] = new SharedBuilder_MapHeatmapProps_1477137980[typingsJapgolly.reactNativeMaps.libMod.Heatmap](js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: MapHeatmapProps): SharedBuilder_MapHeatmapProps_1477137980[typingsJapgolly.reactNativeMaps.libMod.Heatmap] = new SharedBuilder_MapHeatmapProps_1477137980[typingsJapgolly.reactNativeMaps.libMod.Heatmap](js.Array(this.component, p.asInstanceOf[js.Any]))
}
