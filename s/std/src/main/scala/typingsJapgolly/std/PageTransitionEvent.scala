package typingsJapgolly.std

import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.Instantiable2
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** The PageTransitionEvent is fired when a document is being loaded or unloaded. */
@js.native
trait PageTransitionEvent extends Event_ {
  /**
    * For the pageshow event, returns false if the page is newly being loaded (and the load event will fire). Otherwise, returns true.
    * 
    * For the pagehide event, returns false if the page is going away for the last time. Otherwise, returns true, meaning that (if nothing conspires to make the page unsalvageable) the page might be reused if the user navigates back to this page.
    * 
    * Things that can cause the page to be unsalvageable include:
    * 
    * Listening for beforeunload events
    * Listening for unload events
    * Having iframes that are not salvageable
    * Active WebSocket objects
    * Aborting a Document
    */
  val persisted: scala.Boolean = js.native
}

@JSGlobal("PageTransitionEvent")
@js.native
object PageTransitionEvent
  extends Instantiable1[/* type */ java.lang.String, PageTransitionEvent]
     with Instantiable2[
      /* type */ java.lang.String, 
      /* eventInitDict */ PageTransitionEventInit, 
      PageTransitionEvent
    ]

