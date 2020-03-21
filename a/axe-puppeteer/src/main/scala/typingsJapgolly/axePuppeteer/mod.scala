package typingsJapgolly.axePuppeteer

import typingsJapgolly.axePuppeteer.owningMod.OwningAxePuppeteer
import typingsJapgolly.axePuppeteer.typesMod.IPageOptions
import typingsJapgolly.puppeteer.mod.Browser
import typingsJapgolly.puppeteer.mod.Frame
import typingsJapgolly.puppeteer.mod.Page
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("axe-puppeteer", JSImport.Namespace)
@js.native
object mod extends js.Object {
  @js.native
  class AxePuppeteer protected ()
    extends typingsJapgolly.axePuppeteer.axePuppeteerMod.AxePuppeteer {
    def this(pageFrame: Frame) = this()
    def this(pageFrame: Page) = this()
    def this(pageFrame: Frame, source: String) = this()
    def this(pageFrame: Page, source: String) = this()
  }
  
  @js.native
  class default protected ()
    extends typingsJapgolly.axePuppeteer.axePuppeteerMod.AxePuppeteer {
    def this(pageFrame: Frame) = this()
    def this(pageFrame: Page) = this()
    def this(pageFrame: Frame, source: String) = this()
    def this(pageFrame: Page, source: String) = this()
  }
  
  def loadPage(browser: Browser, url: String): js.Promise[OwningAxePuppeteer] = js.native
  def loadPage(browser: Browser, url: String, pageOpts: IPageOptions): js.Promise[OwningAxePuppeteer] = js.native
}

