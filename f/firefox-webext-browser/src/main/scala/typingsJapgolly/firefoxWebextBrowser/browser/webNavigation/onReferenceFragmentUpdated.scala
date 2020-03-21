package typingsJapgolly.firefoxWebextBrowser.browser.webNavigation

import org.scalablytyped.runtime.TopLevel
import typingsJapgolly.firefoxWebextBrowser.AnonTimeStamp
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Fired when the reference fragment of a frame was updated. All future events for that frame will use the updated
  * URL.
  */
@JSGlobal("browser.webNavigation.onReferenceFragmentUpdated")
@js.native
object onReferenceFragmentUpdated
  extends TopLevel[
      WebNavigationOnReferenceFragmentUpdatedEvent[js.Function1[/* details */ AnonTimeStamp, Unit]]
    ]

