package typingsJapgolly.webdriverio

import typingsJapgolly.webdriverio.WebdriverIO.BrowserObject
import typingsJapgolly.webdriverio.WebdriverIO.Element
import typingsJapgolly.webdriverio.WebdriverIO.ElementArray
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobalScope
@js.native
object ^ extends js.Object {
  /**
    * find multiple elements on the page.
    */
  @JSName("$$")
  var $: (js.Function1[/* selector */ String | js.Function, js.Promise[ElementArray]]) with typingsJapgolly.webdriverio.$ = js.native
  /**
    * find a single element on the page.
    */
  @JSName("$")
  var _empty: (js.Function1[/* selector */ String | js.Function, js.Promise[Element]]) with typingsJapgolly.webdriverio._empty = js.native
  var browser: BrowserObject with typingsJapgolly.webdriverio.WebdriverIOAsync.BrowserObject = js.native
}

