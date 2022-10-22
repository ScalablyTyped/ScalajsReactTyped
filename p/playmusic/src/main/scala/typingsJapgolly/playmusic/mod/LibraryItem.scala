package typingsJapgolly.playmusic.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LibraryItem extends StObject {
  
  var album: js.UndefOr[String] = js.undefined
  
  var albumArtRef: js.UndefOr[js.Array[ArtRef]] = js.undefined
  
  var albumArtist: js.UndefOr[String] = js.undefined
  
  var artist: js.UndefOr[String] = js.undefined
  
  var artistArtRef: js.UndefOr[js.Array[ArtRef]] = js.undefined
  
  var artistId: js.UndefOr[js.Array[String]] = js.undefined
  
  var beatsPerMinute: js.UndefOr[Double] = js.undefined
  
  var clientId: js.UndefOr[String] = js.undefined
  
  var comment: js.UndefOr[String] = js.undefined
  
  var composer: js.UndefOr[String] = js.undefined
  
  var creationTimestamp: js.UndefOr[String] = js.undefined
  
  var deleted: js.UndefOr[Boolean] = js.undefined
  
  var discNumber: js.UndefOr[Double] = js.undefined
  
  var durationMillis: js.UndefOr[String] = js.undefined
  
  var estimatedSize: js.UndefOr[String] = js.undefined
  
  var genre: js.UndefOr[String] = js.undefined
  
  var id: js.UndefOr[String] = js.undefined
  
  var kind: js.UndefOr[String] = js.undefined
  
  var lastModifiedTimestamp: js.UndefOr[String] = js.undefined
  
  var nid: js.UndefOr[String] = js.undefined
  
  var playCount: js.UndefOr[Double] = js.undefined
  
  var rating: js.UndefOr[String] = js.undefined
  
  var recentTimestamp: js.UndefOr[String] = js.undefined
  
  var storeId: js.UndefOr[String] = js.undefined
  
  var title: js.UndefOr[String] = js.undefined
  
  var totalDiscCount: js.UndefOr[Double] = js.undefined
  
  var totalTrackCount: js.UndefOr[Double] = js.undefined
  
  var trackNumber: js.UndefOr[Double] = js.undefined
  
  var year: js.UndefOr[Double] = js.undefined
}
object LibraryItem {
  
  inline def apply(): LibraryItem = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LibraryItem]
  }
  
  extension [Self <: LibraryItem](x: Self) {
    
    inline def setAlbum(value: String): Self = StObject.set(x, "album", value.asInstanceOf[js.Any])
    
    inline def setAlbumArtRef(value: js.Array[ArtRef]): Self = StObject.set(x, "albumArtRef", value.asInstanceOf[js.Any])
    
    inline def setAlbumArtRefUndefined: Self = StObject.set(x, "albumArtRef", js.undefined)
    
    inline def setAlbumArtRefVarargs(value: ArtRef*): Self = StObject.set(x, "albumArtRef", js.Array(value*))
    
    inline def setAlbumArtist(value: String): Self = StObject.set(x, "albumArtist", value.asInstanceOf[js.Any])
    
    inline def setAlbumArtistUndefined: Self = StObject.set(x, "albumArtist", js.undefined)
    
    inline def setAlbumUndefined: Self = StObject.set(x, "album", js.undefined)
    
    inline def setArtist(value: String): Self = StObject.set(x, "artist", value.asInstanceOf[js.Any])
    
    inline def setArtistArtRef(value: js.Array[ArtRef]): Self = StObject.set(x, "artistArtRef", value.asInstanceOf[js.Any])
    
    inline def setArtistArtRefUndefined: Self = StObject.set(x, "artistArtRef", js.undefined)
    
    inline def setArtistArtRefVarargs(value: ArtRef*): Self = StObject.set(x, "artistArtRef", js.Array(value*))
    
    inline def setArtistId(value: js.Array[String]): Self = StObject.set(x, "artistId", value.asInstanceOf[js.Any])
    
    inline def setArtistIdUndefined: Self = StObject.set(x, "artistId", js.undefined)
    
    inline def setArtistIdVarargs(value: String*): Self = StObject.set(x, "artistId", js.Array(value*))
    
    inline def setArtistUndefined: Self = StObject.set(x, "artist", js.undefined)
    
    inline def setBeatsPerMinute(value: Double): Self = StObject.set(x, "beatsPerMinute", value.asInstanceOf[js.Any])
    
    inline def setBeatsPerMinuteUndefined: Self = StObject.set(x, "beatsPerMinute", js.undefined)
    
    inline def setClientId(value: String): Self = StObject.set(x, "clientId", value.asInstanceOf[js.Any])
    
    inline def setClientIdUndefined: Self = StObject.set(x, "clientId", js.undefined)
    
    inline def setComment(value: String): Self = StObject.set(x, "comment", value.asInstanceOf[js.Any])
    
    inline def setCommentUndefined: Self = StObject.set(x, "comment", js.undefined)
    
    inline def setComposer(value: String): Self = StObject.set(x, "composer", value.asInstanceOf[js.Any])
    
    inline def setComposerUndefined: Self = StObject.set(x, "composer", js.undefined)
    
    inline def setCreationTimestamp(value: String): Self = StObject.set(x, "creationTimestamp", value.asInstanceOf[js.Any])
    
    inline def setCreationTimestampUndefined: Self = StObject.set(x, "creationTimestamp", js.undefined)
    
    inline def setDeleted(value: Boolean): Self = StObject.set(x, "deleted", value.asInstanceOf[js.Any])
    
    inline def setDeletedUndefined: Self = StObject.set(x, "deleted", js.undefined)
    
    inline def setDiscNumber(value: Double): Self = StObject.set(x, "discNumber", value.asInstanceOf[js.Any])
    
    inline def setDiscNumberUndefined: Self = StObject.set(x, "discNumber", js.undefined)
    
    inline def setDurationMillis(value: String): Self = StObject.set(x, "durationMillis", value.asInstanceOf[js.Any])
    
    inline def setDurationMillisUndefined: Self = StObject.set(x, "durationMillis", js.undefined)
    
    inline def setEstimatedSize(value: String): Self = StObject.set(x, "estimatedSize", value.asInstanceOf[js.Any])
    
    inline def setEstimatedSizeUndefined: Self = StObject.set(x, "estimatedSize", js.undefined)
    
    inline def setGenre(value: String): Self = StObject.set(x, "genre", value.asInstanceOf[js.Any])
    
    inline def setGenreUndefined: Self = StObject.set(x, "genre", js.undefined)
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    inline def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    inline def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
    
    inline def setLastModifiedTimestamp(value: String): Self = StObject.set(x, "lastModifiedTimestamp", value.asInstanceOf[js.Any])
    
    inline def setLastModifiedTimestampUndefined: Self = StObject.set(x, "lastModifiedTimestamp", js.undefined)
    
    inline def setNid(value: String): Self = StObject.set(x, "nid", value.asInstanceOf[js.Any])
    
    inline def setNidUndefined: Self = StObject.set(x, "nid", js.undefined)
    
    inline def setPlayCount(value: Double): Self = StObject.set(x, "playCount", value.asInstanceOf[js.Any])
    
    inline def setPlayCountUndefined: Self = StObject.set(x, "playCount", js.undefined)
    
    inline def setRating(value: String): Self = StObject.set(x, "rating", value.asInstanceOf[js.Any])
    
    inline def setRatingUndefined: Self = StObject.set(x, "rating", js.undefined)
    
    inline def setRecentTimestamp(value: String): Self = StObject.set(x, "recentTimestamp", value.asInstanceOf[js.Any])
    
    inline def setRecentTimestampUndefined: Self = StObject.set(x, "recentTimestamp", js.undefined)
    
    inline def setStoreId(value: String): Self = StObject.set(x, "storeId", value.asInstanceOf[js.Any])
    
    inline def setStoreIdUndefined: Self = StObject.set(x, "storeId", js.undefined)
    
    inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    inline def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
    
    inline def setTotalDiscCount(value: Double): Self = StObject.set(x, "totalDiscCount", value.asInstanceOf[js.Any])
    
    inline def setTotalDiscCountUndefined: Self = StObject.set(x, "totalDiscCount", js.undefined)
    
    inline def setTotalTrackCount(value: Double): Self = StObject.set(x, "totalTrackCount", value.asInstanceOf[js.Any])
    
    inline def setTotalTrackCountUndefined: Self = StObject.set(x, "totalTrackCount", js.undefined)
    
    inline def setTrackNumber(value: Double): Self = StObject.set(x, "trackNumber", value.asInstanceOf[js.Any])
    
    inline def setTrackNumberUndefined: Self = StObject.set(x, "trackNumber", js.undefined)
    
    inline def setYear(value: Double): Self = StObject.set(x, "year", value.asInstanceOf[js.Any])
    
    inline def setYearUndefined: Self = StObject.set(x, "year", js.undefined)
  }
}
