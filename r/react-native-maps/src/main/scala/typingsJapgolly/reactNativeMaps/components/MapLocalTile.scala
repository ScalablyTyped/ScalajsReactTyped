package typingsJapgolly.reactNativeMaps.components

import typingsJapgolly.reactNativeMaps.libMapLocalTileMod.MapLocalTileProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object MapLocalTile {
  
  inline def apply(pathTemplate: String): SharedBuilder_MapLocalTileProps_362889274[typingsJapgolly.reactNativeMaps.libMod.MapLocalTile] = {
    val __props = js.Dynamic.literal(pathTemplate = pathTemplate.asInstanceOf[js.Any])
    new SharedBuilder_MapLocalTileProps_362889274[typingsJapgolly.reactNativeMaps.libMod.MapLocalTile](js.Array(this.component, __props.asInstanceOf[MapLocalTileProps]))
  }
  
  @JSImport("react-native-maps/lib", "MapLocalTile")
  @js.native
  val component: js.Object = js.native
  
  def withProps(p: MapLocalTileProps): SharedBuilder_MapLocalTileProps_362889274[typingsJapgolly.reactNativeMaps.libMod.MapLocalTile] = new SharedBuilder_MapLocalTileProps_362889274[typingsJapgolly.reactNativeMaps.libMod.MapLocalTile](js.Array(this.component, p.asInstanceOf[js.Any]))
}
