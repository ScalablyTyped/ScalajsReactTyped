package typingsJapgolly.firefoxWebextBrowser.browser.webNavigation

import org.scalablytyped.runtime.TopLevel
import typingsJapgolly.firefoxWebextBrowser.AnonTimeStamp
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Fired when a navigation is committed. The document (and the resources it refers to, such as images and
  * subframes) might still be downloading, but at least part of the document has been received from the server and
  * the browser has decided to switch to the new document.
  */
@JSGlobal("browser.webNavigation.onCommitted")
@js.native
object onCommitted
  extends TopLevel[WebNavigationOnCommittedEvent[js.Function1[/* details */ AnonTimeStamp, Unit]]]

