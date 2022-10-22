package typingsJapgolly.reactNativeMaps.components

import typingsJapgolly.reactNativeMaps.libMapCalloutMod.MapCalloutProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Callout {
  
  @JSImport("react-native-maps/lib", "Callout")
  @js.native
  val component: js.Object = js.native
  
  implicit def make(companion: Callout.type): SharedBuilder_MapCalloutProps_219889337[typingsJapgolly.reactNativeMaps.libMod.Callout] = new SharedBuilder_MapCalloutProps_219889337[typingsJapgolly.reactNativeMaps.libMod.Callout](js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: MapCalloutProps): SharedBuilder_MapCalloutProps_219889337[typingsJapgolly.reactNativeMaps.libMod.Callout] = new SharedBuilder_MapCalloutProps_219889337[typingsJapgolly.reactNativeMaps.libMod.Callout](js.Array(this.component, p.asInstanceOf[js.Any]))
}
