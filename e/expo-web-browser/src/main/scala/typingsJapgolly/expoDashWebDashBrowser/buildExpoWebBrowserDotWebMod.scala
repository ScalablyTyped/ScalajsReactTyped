package typingsJapgolly.expoDashWebDashBrowser

import typingsJapgolly.expoDashWebDashBrowser.buildWebBrowserDotTypesMod.BrowserResult
import typingsJapgolly.expoDashWebDashBrowser.buildWebBrowserDotTypesMod.OpenBrowserOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("expo-web-browser/build/ExpoWebBrowser.web", JSImport.Namespace)
@js.native
object buildExpoWebBrowserDotWebMod extends js.Object {
  @js.native
  object default extends js.Object {
    val name: String = js.native
    def openBrowserAsync(url: String): js.Promise[BrowserResult] = js.native
    def openBrowserAsync(url: String, browserParams: OpenBrowserOptions): js.Promise[BrowserResult] = js.native
  }
  
}

