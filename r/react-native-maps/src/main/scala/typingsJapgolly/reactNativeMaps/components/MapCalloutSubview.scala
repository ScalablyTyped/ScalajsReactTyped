package typingsJapgolly.reactNativeMaps.components

import typingsJapgolly.reactNativeMaps.libMapCalloutSubviewMod.MapCalloutSubviewProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object MapCalloutSubview {
  
  @JSImport("react-native-maps/lib", "MapCalloutSubview")
  @js.native
  val component: js.Object = js.native
  
  implicit def make(companion: MapCalloutSubview.type): SharedBuilder_MapCalloutSubviewProps_1542353043[typingsJapgolly.reactNativeMaps.libMod.MapCalloutSubview] = new SharedBuilder_MapCalloutSubviewProps_1542353043[typingsJapgolly.reactNativeMaps.libMod.MapCalloutSubview](js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: MapCalloutSubviewProps): SharedBuilder_MapCalloutSubviewProps_1542353043[typingsJapgolly.reactNativeMaps.libMod.MapCalloutSubview] = new SharedBuilder_MapCalloutSubviewProps_1542353043[typingsJapgolly.reactNativeMaps.libMod.MapCalloutSubview](js.Array(this.component, p.asInstanceOf[js.Any]))
}
