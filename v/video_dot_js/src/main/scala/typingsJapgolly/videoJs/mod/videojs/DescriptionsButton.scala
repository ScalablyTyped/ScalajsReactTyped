package typingsJapgolly.videoJs.mod.videojs

import typingsJapgolly.videoJs.mod.videojs.EventTarget.Event
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The button component for toggling and selecting descriptions
  */
@js.native
trait DescriptionsButton extends TextTrackButton {
  /**
    * Handle text track change
    *
    * @param event
    *        The event that caused this function to run
    *
    * @listens TextTrackList#change
    */
  def handleTracksChange(event: Event): Unit = js.native
}

