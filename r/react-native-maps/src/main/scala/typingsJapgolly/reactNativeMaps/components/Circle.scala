package typingsJapgolly.reactNativeMaps.components

import typingsJapgolly.reactNativeMaps.libMapCircleMod.MapCircleProps
import typingsJapgolly.reactNativeMaps.libSharedTypesMod.LatLng
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Circle {
  
  inline def apply(center: LatLng, radius: Double): SharedBuilder_MapCircleProps_1906288328[typingsJapgolly.reactNativeMaps.libMod.Circle] = {
    val __props = js.Dynamic.literal(center = center.asInstanceOf[js.Any], radius = radius.asInstanceOf[js.Any])
    new SharedBuilder_MapCircleProps_1906288328[typingsJapgolly.reactNativeMaps.libMod.Circle](js.Array(this.component, __props.asInstanceOf[MapCircleProps]))
  }
  
  @JSImport("react-native-maps/lib", "Circle")
  @js.native
  val component: js.Object = js.native
  
  def withProps(p: MapCircleProps): SharedBuilder_MapCircleProps_1906288328[typingsJapgolly.reactNativeMaps.libMod.Circle] = new SharedBuilder_MapCircleProps_1906288328[typingsJapgolly.reactNativeMaps.libMod.Circle](js.Array(this.component, p.asInstanceOf[js.Any]))
}
