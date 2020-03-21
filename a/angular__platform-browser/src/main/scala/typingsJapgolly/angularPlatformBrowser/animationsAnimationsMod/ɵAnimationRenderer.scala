package typingsJapgolly.angularPlatformBrowser.animationsAnimationsMod

import typingsJapgolly.angularAnimations.browserMod.ɵAnimationEngine
import typingsJapgolly.angularCore.mod.Renderer2
import typingsJapgolly.angularPlatformBrowser.angularPlatformBrowserStrings.body
import typingsJapgolly.angularPlatformBrowser.angularPlatformBrowserStrings.document
import typingsJapgolly.angularPlatformBrowser.angularPlatformBrowserStrings.window
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@angular/platform-browser/animations/animations", "\u0275AnimationRenderer")
@js.native
class ɵAnimationRenderer protected () extends ɵangularPackagesPlatformBrowserAnimationsAnimationsF {
  def this(
    factory: ɵAnimationRendererFactory,
    namespaceId: String,
    delegate: Renderer2,
    engine: ɵAnimationEngine
  ) = this()
  var factory: ɵAnimationRendererFactory = js.native
  @JSName("listen")
  def listen_body(target: body, eventName: String, callback: js.Function1[/* event */ js.Any, _]): js.Function0[Unit] = js.native
  @JSName("listen")
  def listen_document(target: document, eventName: String, callback: js.Function1[/* event */ js.Any, _]): js.Function0[Unit] = js.native
  @JSName("listen")
  def listen_window(target: window, eventName: String, callback: js.Function1[/* event */ js.Any, _]): js.Function0[Unit] = js.native
}

