package typingsJapgolly.videoJs.mod.videojs

import typingsJapgolly.videoJs.mod.videojs.EventTarget.Event
import typingsJapgolly.videoJs.mod.videojs.TextTrackCueList.TextTrackCue
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The chapter track menu item
  */
@js.native
trait ChaptersTrackMenuItem
  extends StObject
     with MenuItem {
  
  var cue: TextTrackCue = js.native
  
  var track: TextTrack = js.native
  
  /**
    * Update chapter menu item
    *
    * @param [event]
    *        The `cuechange` event that caused this function to run.
    *
    * @listens TextTrack#cuechange
    */
  def update(event: Event): Unit = js.native
}
