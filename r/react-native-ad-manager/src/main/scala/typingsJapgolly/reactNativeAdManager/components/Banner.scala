package typingsJapgolly.reactNativeAdManager.components

import typingsJapgolly.reactNativeAdManager.helperTypesMod.BannerProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Banner {
  
  @JSImport("react-native-ad-manager", "Banner")
  @js.native
  val component: js.Object = js.native
  
  implicit def make(companion: Banner.type): SharedBuilder_BannerProps285303575[typingsJapgolly.reactNativeAdManager.mod.Banner] = new SharedBuilder_BannerProps285303575[typingsJapgolly.reactNativeAdManager.mod.Banner](js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: BannerProps): SharedBuilder_BannerProps285303575[typingsJapgolly.reactNativeAdManager.mod.Banner] = new SharedBuilder_BannerProps285303575[typingsJapgolly.reactNativeAdManager.mod.Banner](js.Array(this.component, p.asInstanceOf[js.Any]))
}
