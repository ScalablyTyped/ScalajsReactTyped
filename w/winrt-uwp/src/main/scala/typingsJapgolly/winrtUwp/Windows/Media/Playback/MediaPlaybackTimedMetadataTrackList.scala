package typingsJapgolly.winrtUwp.Windows.Media.Playback

import typingsJapgolly.std.Array
import typingsJapgolly.winrtUwp.Windows.Foundation.Collections.IIterator
import typingsJapgolly.winrtUwp.Windows.Foundation.EventHandler
import typingsJapgolly.winrtUwp.Windows.Foundation.TypedEventHandler
import typingsJapgolly.winrtUwp.Windows.Media.Core.TimedMetadataTrack
import typingsJapgolly.winrtUwp.Windows.WinRTEvent
import typingsJapgolly.winrtUwp.anon.Index
import typingsJapgolly.winrtUwp.anon.ItemsTimedMetadataTrack
import typingsJapgolly.winrtUwp.winrtUwpStrings.presentationmodechanged
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents a read-only list of timed metadata tracks. */
@js.native
trait MediaPlaybackTimedMetadataTrackList
  extends StObject
     with Array[TimedMetadataTrack] {
  
  def addEventListener(`type`: String, listener: EventHandler[Any]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_presentationmodechanged(
    `type`: presentationmodechanged,
    listener: TypedEventHandler[MediaPlaybackTimedMetadataTrackList, TimedMetadataPresentationModeChangedEventArgs]
  ): Unit = js.native
  
  /**
    * Returns an iterator that iterates over the items in the collection.
    * @return The iterator.
    */
  def first(): IIterator[TimedMetadataTrack] = js.native
  
  /**
    * Returns the timed metadata track at the specified index.
    * @param index The zero-based index of the timed metadata track.
    * @return The timed metadata track at the specified index.
    */
  def getAt(index: Double): TimedMetadataTrack = js.native
  
  /**
    * Retrieves the timed metadata tracks that start at the specified index in the list.
    * @param startIndex The zero-based index of the start of the timed metadata tracks in the list.
    */
  def getMany(startIndex: Double): ItemsTimedMetadataTrack = js.native
  
  /**
    * Gets the presentation mode of the timed metadata track with the specified index.
    * @param index The index of the timed metadata track for which the presentation mode is queried.
    * @return The presentation mode.
    */
  def getPresentationMode(index: Double): TimedMetadataTrackPresentationMode = js.native
  
  def indexOf(value: TimedMetadataTrack, extra: Any*): Index = js.native
  /* hack */
  @JSName("indexOf")
  def indexOf_Double(searchElement: TimedMetadataTrack): Double = js.native
  
  /** Occurs when the presentation mode of the MediaPlaybackTimedMetadataTrackList changes. */
  def onpresentationmodechanged(
    ev: TimedMetadataPresentationModeChangedEventArgs & WinRTEvent[MediaPlaybackTimedMetadataTrackList]
  ): Unit = js.native
  /** Occurs when the presentation mode of the MediaPlaybackTimedMetadataTrackList changes. */
  @JSName("onpresentationmodechanged")
  var onpresentationmodechanged_Original: TypedEventHandler[MediaPlaybackTimedMetadataTrackList, TimedMetadataPresentationModeChangedEventArgs] = js.native
  
  def removeEventListener(`type`: String, listener: EventHandler[Any]): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_presentationmodechanged(
    `type`: presentationmodechanged,
    listener: TypedEventHandler[MediaPlaybackTimedMetadataTrackList, TimedMetadataPresentationModeChangedEventArgs]
  ): Unit = js.native
  
  /**
    * Sets the presentation mode of the timed metadata track with the specified index.
    * @param index The index of the timed metadata track for which the presentation mode is set.
    * @param value The presentation mode to set.
    */
  def setPresentationMode(index: Double, value: TimedMetadataTrackPresentationMode): Unit = js.native
  
  /** Gets the number of timed metadata tracks in the list. */
  var size: Double = js.native
}
