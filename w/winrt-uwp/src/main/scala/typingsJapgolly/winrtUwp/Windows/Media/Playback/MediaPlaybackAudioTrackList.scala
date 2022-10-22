package typingsJapgolly.winrtUwp.Windows.Media.Playback

import typingsJapgolly.std.Array
import typingsJapgolly.winrtUwp.Windows.Foundation.Collections.IIterator
import typingsJapgolly.winrtUwp.Windows.Foundation.EventHandler
import typingsJapgolly.winrtUwp.Windows.Foundation.TypedEventHandler
import typingsJapgolly.winrtUwp.Windows.Media.Core.AudioTrack
import typingsJapgolly.winrtUwp.Windows.Media.Core.ISingleSelectMediaTrackList
import typingsJapgolly.winrtUwp.Windows.WinRTEvent
import typingsJapgolly.winrtUwp.anon.Index
import typingsJapgolly.winrtUwp.anon.ItemsReturnValue
import typingsJapgolly.winrtUwp.winrtUwpStrings.selectedindexchanged
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents a read-only list of audio tracks, of which a single track can be selected at one time. */
@js.native
trait MediaPlaybackAudioTrackList
  extends StObject
     with Array[AudioTrack] {
  
  def addEventListener(`type`: String, listener: EventHandler[Any]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_selectedindexchanged(`type`: selectedindexchanged, listener: TypedEventHandler[ISingleSelectMediaTrackList, Any]): Unit = js.native
  
  /**
    * Returns an iterator that iterates over the items in the collection.
    * @return The iterator.
    */
  def first(): IIterator[AudioTrack] = js.native
  
  /**
    * Returns the audio track at the specified index.
    * @param index The zero-based index of the audio track.
    * @return The audio track at the specified index.
    */
  def getAt(index: Double): AudioTrack = js.native
  
  /**
    * Retrieves the audio tracks that start at the specified index in the list.
    * @param startIndex The zero-based index of the start of the audio tracks in the list.
    */
  def getMany(startIndex: Double): ItemsReturnValue = js.native
  
  def indexOf(value: AudioTrack, extra: Any*): Index = js.native
  /* hack */
  @JSName("indexOf")
  def indexOf_Double(searchElement: AudioTrack): Double = js.native
  
  /** Occurs when the index of the currently selected audio track changes. */
  def onselectedindexchanged(ev: Any & WinRTEvent[ISingleSelectMediaTrackList]): Unit = js.native
  /** Occurs when the index of the currently selected audio track changes. */
  @JSName("onselectedindexchanged")
  var onselectedindexchanged_Original: TypedEventHandler[ISingleSelectMediaTrackList, Any] = js.native
  
  def removeEventListener(`type`: String, listener: EventHandler[Any]): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_selectedindexchanged(`type`: selectedindexchanged, listener: TypedEventHandler[ISingleSelectMediaTrackList, Any]): Unit = js.native
  
  /** Gets or sets the index of the currently selected audio track in the list. */
  var selectedIndex: Double = js.native
  
  /** Gets the number of audio tracks in the list. */
  var size: Double = js.native
}
