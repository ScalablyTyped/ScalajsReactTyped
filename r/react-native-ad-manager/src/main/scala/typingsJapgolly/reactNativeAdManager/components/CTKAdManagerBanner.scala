package typingsJapgolly.reactNativeAdManager.components

import typingsJapgolly.reactNativeAdManager.helperTypesMod.BannerProps
import typingsJapgolly.reactNativeAdManager.srcCtkadmanagerbannerMod.^
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object CTKAdManagerBanner {
  
  @JSImport("react-native-ad-manager/src/CTKAdManagerBanner", JSImport.Namespace)
  @js.native
  val component: js.Object = js.native
  
  implicit def make(companion: CTKAdManagerBanner.type): SharedBuilder_BannerProps285303575[^] = new SharedBuilder_BannerProps285303575[^](js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: BannerProps): SharedBuilder_BannerProps285303575[^] = new SharedBuilder_BannerProps285303575[^](js.Array(this.component, p.asInstanceOf[js.Any]))
}
