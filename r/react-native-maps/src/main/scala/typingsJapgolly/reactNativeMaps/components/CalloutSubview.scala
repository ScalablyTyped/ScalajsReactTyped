package typingsJapgolly.reactNativeMaps.components

import typingsJapgolly.reactNativeMaps.libMapCalloutSubviewMod.MapCalloutSubviewProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object CalloutSubview {
  
  @JSImport("react-native-maps/lib", "CalloutSubview")
  @js.native
  val component: js.Object = js.native
  
  implicit def make(companion: CalloutSubview.type): SharedBuilder_MapCalloutSubviewProps_1542353043[typingsJapgolly.reactNativeMaps.libMod.CalloutSubview] = new SharedBuilder_MapCalloutSubviewProps_1542353043[typingsJapgolly.reactNativeMaps.libMod.CalloutSubview](js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: MapCalloutSubviewProps): SharedBuilder_MapCalloutSubviewProps_1542353043[typingsJapgolly.reactNativeMaps.libMod.CalloutSubview] = new SharedBuilder_MapCalloutSubviewProps_1542353043[typingsJapgolly.reactNativeMaps.libMod.CalloutSubview](js.Array(this.component, p.asInstanceOf[js.Any]))
}
