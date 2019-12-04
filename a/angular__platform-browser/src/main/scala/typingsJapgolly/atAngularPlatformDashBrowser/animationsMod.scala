package typingsJapgolly.atAngularPlatformDashBrowser

import typingsJapgolly.atAngularAnimations.browserMod.AnimationDriver
import typingsJapgolly.atAngularAnimations.browserMod.ɵAnimationEngine
import typingsJapgolly.atAngularAnimations.browserMod.ɵAnimationStyleNormalizer
import typingsJapgolly.atAngularAnimations.browserMod.ɵCssKeyframesDriver
import typingsJapgolly.atAngularAnimations.browserMod.ɵWebAnimationsDriver
import typingsJapgolly.atAngularAnimations.browserMod.ɵWebAnimationsStyleNormalizer
import typingsJapgolly.atAngularCore.atAngularCoreMod.InjectionToken
import typingsJapgolly.atAngularCore.atAngularCoreMod.NgZone
import typingsJapgolly.atAngularCore.atAngularCoreMod.Provider
import typingsJapgolly.atAngularCore.atAngularCoreMod.Renderer2
import typingsJapgolly.atAngularCore.atAngularCoreMod.RendererFactory2
import typingsJapgolly.atAngularPlatformDashBrowser.atAngularPlatformDashBrowserMod.ɵDomRendererFactory2
import typingsJapgolly.atAngularPlatformDashBrowser.atAngularPlatformDashBrowserStrings.BrowserAnimations
import typingsJapgolly.atAngularPlatformDashBrowser.atAngularPlatformDashBrowserStrings.NoopAnimations
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@angular/platform-browser/animations", JSImport.Namespace)
@js.native
object animationsMod extends js.Object {
  @js.native
  class BrowserAnimationsModule ()
    extends typingsJapgolly.atAngularPlatformDashBrowser.animationsAnimationsMod.BrowserAnimationsModule
  
  @js.native
  class NoopAnimationsModule ()
    extends typingsJapgolly.atAngularPlatformDashBrowser.animationsAnimationsMod.NoopAnimationsModule
  
  @js.native
  class ɵAnimationRenderer protected ()
    extends typingsJapgolly.atAngularPlatformDashBrowser.animationsAnimationsMod.ɵAnimationRenderer {
    def this(
      factory: typingsJapgolly.atAngularPlatformDashBrowser.animationsAnimationsMod.ɵAnimationRendererFactory,
      namespaceId: String,
      delegate: Renderer2,
      engine: ɵAnimationEngine
    ) = this()
  }
  
  @js.native
  class ɵAnimationRendererFactory protected ()
    extends typingsJapgolly.atAngularPlatformDashBrowser.animationsAnimationsMod.ɵAnimationRendererFactory {
    def this(delegate: RendererFactory2, engine: ɵAnimationEngine, _zone: NgZone) = this()
  }
  
  @js.native
  class ɵBrowserAnimationBuilder protected ()
    extends typingsJapgolly.atAngularPlatformDashBrowser.animationsAnimationsMod.ɵBrowserAnimationBuilder {
    def this(rootRenderer: RendererFactory2, doc: js.Any) = this()
  }
  
  @js.native
  class ɵBrowserAnimationFactory protected ()
    extends typingsJapgolly.atAngularPlatformDashBrowser.animationsAnimationsMod.ɵBrowserAnimationFactory {
    def this(
      _id: String,
      _renderer: typingsJapgolly.atAngularPlatformDashBrowser.animationsAnimationsMod.ɵAnimationRenderer
    ) = this()
  }
  
  @js.native
  class ɵInjectableAnimationEngine protected ()
    extends typingsJapgolly.atAngularPlatformDashBrowser.animationsAnimationsMod.ɵInjectableAnimationEngine {
    def this(doc: js.Any, driver: AnimationDriver, normalizer: ɵAnimationStyleNormalizer) = this()
  }
  
  @js.native
  class ɵangular_packages_platform_browser_animations_animations_f protected ()
    extends typingsJapgolly.atAngularPlatformDashBrowser.animationsAnimationsMod.ɵangular_packages_platform_browser_animations_animations_f {
    def this(namespaceId: String, delegate: Renderer2, engine: ɵAnimationEngine) = this()
  }
  
  val ANIMATION_MODULE_TYPE: InjectionToken[NoopAnimations | BrowserAnimations] = js.native
  val ɵangular_packages_platform_browser_animations_animations_d: js.Array[Provider] = js.native
  val ɵangular_packages_platform_browser_animations_animations_e: js.Array[Provider] = js.native
  def ɵangular_packages_platform_browser_animations_animations_a(): ɵWebAnimationsDriver | ɵCssKeyframesDriver = js.native
  def ɵangular_packages_platform_browser_animations_animations_b(): ɵWebAnimationsStyleNormalizer = js.native
  def ɵangular_packages_platform_browser_animations_animations_c(renderer: ɵDomRendererFactory2, engine: ɵAnimationEngine, zone: NgZone): typingsJapgolly.atAngularPlatformDashBrowser.animationsAnimationsMod.ɵAnimationRendererFactory = js.native
}

