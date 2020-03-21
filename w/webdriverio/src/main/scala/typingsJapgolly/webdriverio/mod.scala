package typingsJapgolly.webdriverio

import typingsJapgolly.webdriver.WebDriver.AttachSessionOptions
import typingsJapgolly.webdriverio.WebdriverIO.BrowserObject
import typingsJapgolly.webdriverio.WebdriverIO.MultiRemoteOptions
import typingsJapgolly.webdriverio.WebdriverIO.RemoteOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("webdriverio", JSImport.Namespace)
@js.native
object mod extends js.Object {
  def attach(options: AttachSessionOptions): BrowserObject = js.native
  @JSName("attach")
  def attach_BrowserObject(options: AttachSessionOptions): typingsJapgolly.webdriverio.WebdriverIOAsync.BrowserObject = js.native
  def multiremote(options: MultiRemoteOptions): BrowserObject = js.native
  @JSName("multiremote")
  def multiremote_BrowserObject(options: MultiRemoteOptions): typingsJapgolly.webdriverio.WebdriverIOAsync.BrowserObject = js.native
  def remote(): BrowserObject = js.native
  def remote(options: RemoteOptions): BrowserObject = js.native
  def remote(options: RemoteOptions, modifier: js.Function1[/* repeated */ js.Any, _]): BrowserObject = js.native
  @JSName("remote")
  def remote_BrowserObject(): typingsJapgolly.webdriverio.WebdriverIOAsync.BrowserObject = js.native
  @JSName("remote")
  def remote_BrowserObject(options: RemoteOptions): typingsJapgolly.webdriverio.WebdriverIOAsync.BrowserObject = js.native
  @JSName("remote")
  def remote_BrowserObject(options: RemoteOptions, modifier: js.Function1[/* repeated */ js.Any, _]): typingsJapgolly.webdriverio.WebdriverIOAsync.BrowserObject = js.native
}

