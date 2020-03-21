package typingsJapgolly.firefoxWebextBrowser.browser.runtime

import org.scalablytyped.runtime.TopLevel
import typingsJapgolly.firefoxWebextBrowser.WebExtEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Fired when a connection is made from either an extension process or a content script. */
@JSGlobal("browser.runtime.onConnect")
@js.native
object onConnect
  extends TopLevel[WebExtEvent[js.Function1[/* port */ Port, Unit]]]

