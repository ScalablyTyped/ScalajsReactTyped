package typingsJapgolly.reactNativeMaps.components

import typingsJapgolly.reactNativeMaps.libMapLocalTileMod.MapLocalTileProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object LocalTile {
  
  inline def apply(pathTemplate: String): SharedBuilder_MapLocalTileProps_362889274[typingsJapgolly.reactNativeMaps.libMod.LocalTile] = {
    val __props = js.Dynamic.literal(pathTemplate = pathTemplate.asInstanceOf[js.Any])
    new SharedBuilder_MapLocalTileProps_362889274[typingsJapgolly.reactNativeMaps.libMod.LocalTile](js.Array(this.component, __props.asInstanceOf[MapLocalTileProps]))
  }
  
  @JSImport("react-native-maps/lib", "LocalTile")
  @js.native
  val component: js.Object = js.native
  
  def withProps(p: MapLocalTileProps): SharedBuilder_MapLocalTileProps_362889274[typingsJapgolly.reactNativeMaps.libMod.LocalTile] = new SharedBuilder_MapLocalTileProps_362889274[typingsJapgolly.reactNativeMaps.libMod.LocalTile](js.Array(this.component, p.asInstanceOf[js.Any]))
}
