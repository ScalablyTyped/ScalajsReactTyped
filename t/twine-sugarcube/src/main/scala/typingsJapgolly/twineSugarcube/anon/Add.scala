package typingsJapgolly.twineSugarcube.anon

import japgolly.scalajs.react.Callback
import typingsJapgolly.twineSugarcube.audioMod.AudioTrack
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Add extends StObject {
  
  /**
    * Adds an audio track with the given track ID.
    * @param trackId The ID of the track, which will be used to reference it.
    * @param sources The audio sources for the track, which may be a list of sources or an array. Only one is required,
    * though supplying additional sources in differing formats is recommended, as no single format is supported by all browsers.
    * A source must be either a URL (absolute or relative) to an audio resource, the name of an audio passage, or a data URI. In
    * rare cases where the audio format cannot be automatically detected from the source (URLs are parsed for a file extension,
    * data URIs are parsed for the media type), a format specifier may be prepended to the front of each source to manually
    * specify the format (syntax: formatId|, where formatId is the audio format—generally, whatever the file extension would
    * normally be; e.g., mp3, mp4, ogg, weba, wav).
    * @example
    * // Cache a track with the ID "boom" and one source via relative URL
    * SimpleAudio.tracks.add("boom", "media/audio/explosion.mp3");
    *
    * // Cache a track with the ID "boom" and one source via audio passage
    * SimpleAudio.tracks.add("boom", "explosion");
    *
    * // Cache a track with the ID "bgm_space" and two sources via relative URLs
    * SimpleAudio.tracks.add("bgm_space", "media/audio/space_quest.mp3", "media/audio/space_quest.ogg");
    *
    * // Cache a track with the ID "what" and one source via URL with a format specifier
    * SimpleAudio.tracks.add("what", "mp3|http://an-audio-service.com/a-user/a-track-id");
    *
    * @since 2.28.0
    */
  def add(trackId: String, sources: String*): Unit
  
  /**
    * Deletes all audio tracks.
    * NOTE: Cannot delete tracks solely under the control of a playlist.
    * @since 2.28.0
    */
  def clear(): Unit
  
  /**
    * Deletes the audio track with the given track ID.
    *
    * NOTE: Cannot delete tracks solely under the control of a playlist.
    * WARNING: Does not currently remove the track from either groups or playlists. Thus, any groups or playlists
    * containing the deleted track should be rebuilt.
    * @param trackId The ID of the track.
    * @since 2.28.0
    * @example
    * SimpleAudio.tracks.delete("bgm_space");
    */
  def delete(trackId: String): Unit
  
  /**
    * Returns the AudioTrack instance with the given track ID, or null on failure.
    * NOTE: To affect multiple tracks and/or groups at once, see the SimpleAudio.select() method.
    * Returns the AudioTrack instance with the given track ID, or null on failure.
    * @param trackId The ID of the track.
    * @since 2.28.0
    * @example
    * SimpleAudio.tracks.get("swamped")  → Returns the AudioTrack instance matching "swamped"
    * @example
    * // Return the AudioTrack instance matching "swamped" and do something with it
    * SimpleAudio.tracks.get("swamped").volume(1).play();
    */
  def get(trackId: String): AudioTrack | Null
  
  /**
    * Returns whether an audio track with the given track ID exists.
    * @param trackId The ID of the track.
    */
  def has(trackId: String): Boolean
}
object Add {
  
  inline def apply(
    add: (String, /* repeated */ String) => Callback,
    clear: Callback,
    delete: String => Callback,
    get: String => AudioTrack | Null,
    has: String => Boolean
  ): Add = {
    val __obj = js.Dynamic.literal(add = js.Any.fromFunction2((t0: String, t1: /* repeated */ String) => (add(t0, t1)).runNow()), clear = clear.toJsFn, delete = js.Any.fromFunction1((t0: String) => delete(t0).runNow()), get = js.Any.fromFunction1(get), has = js.Any.fromFunction1(has))
    __obj.asInstanceOf[Add]
  }
  
  extension [Self <: Add](x: Self) {
    
    inline def setAdd(value: (String, /* repeated */ String) => Callback): Self = StObject.set(x, "add", js.Any.fromFunction2((t0: String, t1: /* repeated */ String) => (value(t0, t1)).runNow()))
    
    inline def setClear(value: Callback): Self = StObject.set(x, "clear", value.toJsFn)
    
    inline def setDelete(value: String => Callback): Self = StObject.set(x, "delete", js.Any.fromFunction1((t0: String) => value(t0).runNow()))
    
    inline def setGet(value: String => AudioTrack | Null): Self = StObject.set(x, "get", js.Any.fromFunction1(value))
    
    inline def setHas(value: String => Boolean): Self = StObject.set(x, "has", js.Any.fromFunction1(value))
  }
}
