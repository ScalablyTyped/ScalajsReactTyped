package typingsJapgolly.reactNativeMaps.components

import typingsJapgolly.reactNativeMaps.libMapHeatmapMod.MapHeatmapProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object MapHeatmap {
  
  @JSImport("react-native-maps/lib", "MapHeatmap")
  @js.native
  val component: js.Object = js.native
  
  implicit def make(companion: MapHeatmap.type): SharedBuilder_MapHeatmapProps_1477137980[typingsJapgolly.reactNativeMaps.libMod.MapHeatmap] = new SharedBuilder_MapHeatmapProps_1477137980[typingsJapgolly.reactNativeMaps.libMod.MapHeatmap](js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: MapHeatmapProps): SharedBuilder_MapHeatmapProps_1477137980[typingsJapgolly.reactNativeMaps.libMod.MapHeatmap] = new SharedBuilder_MapHeatmapProps_1477137980[typingsJapgolly.reactNativeMaps.libMod.MapHeatmap](js.Array(this.component, p.asInstanceOf[js.Any]))
}
