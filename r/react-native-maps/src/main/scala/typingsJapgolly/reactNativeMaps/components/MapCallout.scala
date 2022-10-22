package typingsJapgolly.reactNativeMaps.components

import typingsJapgolly.reactNativeMaps.libMapCalloutMod.MapCalloutProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object MapCallout {
  
  @JSImport("react-native-maps/lib", "MapCallout")
  @js.native
  val component: js.Object = js.native
  
  implicit def make(companion: MapCallout.type): SharedBuilder_MapCalloutProps_219889337[typingsJapgolly.reactNativeMaps.libMod.MapCallout] = new SharedBuilder_MapCalloutProps_219889337[typingsJapgolly.reactNativeMaps.libMod.MapCallout](js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: MapCalloutProps): SharedBuilder_MapCalloutProps_219889337[typingsJapgolly.reactNativeMaps.libMod.MapCallout] = new SharedBuilder_MapCalloutProps_219889337[typingsJapgolly.reactNativeMaps.libMod.MapCallout](js.Array(this.component, p.asInstanceOf[js.Any]))
}
