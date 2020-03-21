package typingsJapgolly.firefoxWebextBrowser.browser.proxy

import org.scalablytyped.runtime.TopLevel
import typingsJapgolly.firefoxWebextBrowser.WebExtEvent
import typingsJapgolly.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Notifies about errors caused by the invalid use of the proxy API. */
@JSGlobal("browser.proxy.onError")
@js.native
object onError
  extends TopLevel[WebExtEvent[js.Function1[/* error */ Error, Unit]]]

