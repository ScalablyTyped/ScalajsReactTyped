package typingsJapgolly.winrtUwp.Windows.Media

import typingsJapgolly.winrtUwp.Windows.Foundation.Collections.IVector
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Provides properties for music information that is displayed by the SystemMediaTransportControlsDisplayUpdater class. */
trait MusicDisplayProperties extends StObject {
  
  /** Gets or sets the name of the album artist. */
  var albumArtist: String
  
  /** Gets or sets the album title. */
  var albumTitle: String
  
  /** Gets or set the name of the song artist. */
  var artist: String
  
  /** Gets a modifiable list of strings representing genre names. */
  var genres: IVector[String]
  
  /** Gets or set the title of the song. */
  var title: String
  
  /** Gets or sets the track number. */
  var trackNumber: Double
}
object MusicDisplayProperties {
  
  inline def apply(
    albumArtist: String,
    albumTitle: String,
    artist: String,
    genres: IVector[String],
    title: String,
    trackNumber: Double
  ): MusicDisplayProperties = {
    val __obj = js.Dynamic.literal(albumArtist = albumArtist.asInstanceOf[js.Any], albumTitle = albumTitle.asInstanceOf[js.Any], artist = artist.asInstanceOf[js.Any], genres = genres.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any], trackNumber = trackNumber.asInstanceOf[js.Any])
    __obj.asInstanceOf[MusicDisplayProperties]
  }
  
  extension [Self <: MusicDisplayProperties](x: Self) {
    
    inline def setAlbumArtist(value: String): Self = StObject.set(x, "albumArtist", value.asInstanceOf[js.Any])
    
    inline def setAlbumTitle(value: String): Self = StObject.set(x, "albumTitle", value.asInstanceOf[js.Any])
    
    inline def setArtist(value: String): Self = StObject.set(x, "artist", value.asInstanceOf[js.Any])
    
    inline def setGenres(value: IVector[String]): Self = StObject.set(x, "genres", value.asInstanceOf[js.Any])
    
    inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    inline def setTrackNumber(value: Double): Self = StObject.set(x, "trackNumber", value.asInstanceOf[js.Any])
  }
}
