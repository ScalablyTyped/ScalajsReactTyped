package typingsJapgolly.reactNativeMaps.components

import typingsJapgolly.reactNativeMaps.libMapUrlTileMod.MapUrlTileProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object UrlTile {
  
  inline def apply(urlTemplate: String): SharedBuilder_MapUrlTileProps717996563[typingsJapgolly.reactNativeMaps.libMod.UrlTile] = {
    val __props = js.Dynamic.literal(urlTemplate = urlTemplate.asInstanceOf[js.Any])
    new SharedBuilder_MapUrlTileProps717996563[typingsJapgolly.reactNativeMaps.libMod.UrlTile](js.Array(this.component, __props.asInstanceOf[MapUrlTileProps]))
  }
  
  @JSImport("react-native-maps/lib", "UrlTile")
  @js.native
  val component: js.Object = js.native
  
  def withProps(p: MapUrlTileProps): SharedBuilder_MapUrlTileProps717996563[typingsJapgolly.reactNativeMaps.libMod.UrlTile] = new SharedBuilder_MapUrlTileProps717996563[typingsJapgolly.reactNativeMaps.libMod.UrlTile](js.Array(this.component, p.asInstanceOf[js.Any]))
}
