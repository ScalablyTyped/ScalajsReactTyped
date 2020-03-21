package typingsJapgolly.webdriverio.WebdriverIO

import typingsJapgolly.webdriver.AsyncClient
import typingsJapgolly.webdriver.WebDriver.ClientOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
- typingsJapgolly.webdriverio.WebdriverIO.Browser because var conflicts: config, options. Inlined  */ @js.native
trait BrowserObject
  extends typingsJapgolly.webdriverio.WebdriverIOAsync.Browser
     with ClientOptions
     with AsyncClient

