package typingsJapgolly.videoJs.mod.videojs

import typingsJapgolly.videoJs.mod.videojs.EventTarget.Event
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The specific menu item type for selecting a language within a text track kind
  */
@js.native
trait TextTrackMenuItem
  extends StObject
     with MenuItem {
  
  /**
    * Handle selected language change
    *
    * @param event
    *        The `change` event that caused this function to be called.
    */
  def handleSelectedLanguageChange(event: Event): Unit = js.native
  
  /**
    * Handle text track list change
    *
    * @param event
    *        The `change` event that caused this function to be called.
    *
    * @listens TextTrackList#change
    */
  def handleTracksChange(event: Event): Unit = js.native
}
