package typingsJapgolly.jestEnvironmentPuppeteer.mod

import typingsJapgolly.node.vmMod.Context
import typingsJapgolly.puppeteer.mod.Browser
import typingsJapgolly.puppeteer.mod.Page
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Global
  extends typingsJapgolly.jestTypes.globalMod.Global {
  var browser: Browser = js.native
  var context: Context = js.native
  var jestPuppeteer: JestPuppeteer = js.native
  var page: Page = js.native
}

