package typingsJapgolly.reactNativePaper

import typingsJapgolly.reactNative.mod.Animated.Value
import typingsJapgolly.reactNativePaper.anon.ShadowColor
import typingsJapgolly.reactNativePaper.anon.ShadowOffset
import typingsJapgolly.reactNativePaper.anon.ShadowOpacity
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libTypescriptStylesShadowMod {
  
  @JSImport("react-native-paper/lib/typescript/styles/shadow", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(): ShadowColor | ShadowOffset | ShadowOpacity = ^.asInstanceOf[js.Dynamic].applyDynamic("default")().asInstanceOf[ShadowColor | ShadowOffset | ShadowOpacity]
  inline def default(elevation: Double): ShadowColor | ShadowOffset | ShadowOpacity = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(elevation.asInstanceOf[js.Any]).asInstanceOf[ShadowColor | ShadowOffset | ShadowOpacity]
  inline def default(elevation: Value): ShadowColor | ShadowOffset | ShadowOpacity = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(elevation.asInstanceOf[js.Any]).asInstanceOf[ShadowColor | ShadowOffset | ShadowOpacity]
}
