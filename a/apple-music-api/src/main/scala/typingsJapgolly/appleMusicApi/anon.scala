package typingsJapgolly.appleMusicApi

import typingsJapgolly.appleMusicApi.AppleMusicApi.PlayParameters
import typingsJapgolly.appleMusicApi.AppleMusicApi.Playlist
import typingsJapgolly.appleMusicApi.AppleMusicApi.Preview
import typingsJapgolly.appleMusicApi.AppleMusicApi.Relationship
import typingsJapgolly.appleMusicApi.AppleMusicApi.Song
import typingsJapgolly.appleMusicApi.AppleMusicApi.Station
import typingsJapgolly.appleMusicApi.appleMusicApiStrings.`personal-mix`
import typingsJapgolly.appleMusicApi.appleMusicApiStrings.`user-shared`
import typingsJapgolly.appleMusicApi.appleMusicApiStrings.clean
import typingsJapgolly.appleMusicApi.appleMusicApiStrings.editorial
import typingsJapgolly.appleMusicApi.appleMusicApiStrings.explicit
import typingsJapgolly.appleMusicApi.appleMusicApiStrings.external
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait AlbumName extends StObject {
    
    var albumName: String
    
    var artistName: String
    
    var artwork: js.UndefOr[typingsJapgolly.appleMusicApi.AppleMusicApi.Artwork] = js.undefined
    
    var composerName: js.UndefOr[String] = js.undefined
    
    var contentRating: js.UndefOr[String] = js.undefined
    
    var discNumber: Double
    
    var durationInMillis: Double
    
    var editorialNotes: js.UndefOr[typingsJapgolly.appleMusicApi.AppleMusicApi.EditorialNotes] = js.undefined
    
    var genreNames: js.Array[String]
    
    var hasLyrics: Boolean
    
    var isrc: String
    
    var movementCount: js.UndefOr[Double] = js.undefined
    
    var movementName: js.UndefOr[String] = js.undefined
    
    var movementNumber: js.UndefOr[String] = js.undefined
    
    var name: String
    
    var playParams: js.UndefOr[PlayParameters] = js.undefined
    
    var previews: js.Array[Preview]
    
    var releaseDate: String
    
    var trackNumber: Double
    
    var url: String
    
    var workName: js.UndefOr[String] = js.undefined
  }
  object AlbumName {
    
    inline def apply(
      albumName: String,
      artistName: String,
      discNumber: Double,
      durationInMillis: Double,
      genreNames: js.Array[String],
      hasLyrics: Boolean,
      isrc: String,
      name: String,
      previews: js.Array[Preview],
      releaseDate: String,
      trackNumber: Double,
      url: String
    ): AlbumName = {
      val __obj = js.Dynamic.literal(albumName = albumName.asInstanceOf[js.Any], artistName = artistName.asInstanceOf[js.Any], discNumber = discNumber.asInstanceOf[js.Any], durationInMillis = durationInMillis.asInstanceOf[js.Any], genreNames = genreNames.asInstanceOf[js.Any], hasLyrics = hasLyrics.asInstanceOf[js.Any], isrc = isrc.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], previews = previews.asInstanceOf[js.Any], releaseDate = releaseDate.asInstanceOf[js.Any], trackNumber = trackNumber.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
      __obj.asInstanceOf[AlbumName]
    }
    
    extension [Self <: AlbumName](x: Self) {
      
      inline def setAlbumName(value: String): Self = StObject.set(x, "albumName", value.asInstanceOf[js.Any])
      
      inline def setArtistName(value: String): Self = StObject.set(x, "artistName", value.asInstanceOf[js.Any])
      
      inline def setArtwork(value: typingsJapgolly.appleMusicApi.AppleMusicApi.Artwork): Self = StObject.set(x, "artwork", value.asInstanceOf[js.Any])
      
      inline def setArtworkUndefined: Self = StObject.set(x, "artwork", js.undefined)
      
      inline def setComposerName(value: String): Self = StObject.set(x, "composerName", value.asInstanceOf[js.Any])
      
      inline def setComposerNameUndefined: Self = StObject.set(x, "composerName", js.undefined)
      
      inline def setContentRating(value: String): Self = StObject.set(x, "contentRating", value.asInstanceOf[js.Any])
      
      inline def setContentRatingUndefined: Self = StObject.set(x, "contentRating", js.undefined)
      
      inline def setDiscNumber(value: Double): Self = StObject.set(x, "discNumber", value.asInstanceOf[js.Any])
      
      inline def setDurationInMillis(value: Double): Self = StObject.set(x, "durationInMillis", value.asInstanceOf[js.Any])
      
      inline def setEditorialNotes(value: typingsJapgolly.appleMusicApi.AppleMusicApi.EditorialNotes): Self = StObject.set(x, "editorialNotes", value.asInstanceOf[js.Any])
      
      inline def setEditorialNotesUndefined: Self = StObject.set(x, "editorialNotes", js.undefined)
      
      inline def setGenreNames(value: js.Array[String]): Self = StObject.set(x, "genreNames", value.asInstanceOf[js.Any])
      
      inline def setGenreNamesVarargs(value: String*): Self = StObject.set(x, "genreNames", js.Array(value*))
      
      inline def setHasLyrics(value: Boolean): Self = StObject.set(x, "hasLyrics", value.asInstanceOf[js.Any])
      
      inline def setIsrc(value: String): Self = StObject.set(x, "isrc", value.asInstanceOf[js.Any])
      
      inline def setMovementCount(value: Double): Self = StObject.set(x, "movementCount", value.asInstanceOf[js.Any])
      
      inline def setMovementCountUndefined: Self = StObject.set(x, "movementCount", js.undefined)
      
      inline def setMovementName(value: String): Self = StObject.set(x, "movementName", value.asInstanceOf[js.Any])
      
      inline def setMovementNameUndefined: Self = StObject.set(x, "movementName", js.undefined)
      
      inline def setMovementNumber(value: String): Self = StObject.set(x, "movementNumber", value.asInstanceOf[js.Any])
      
      inline def setMovementNumberUndefined: Self = StObject.set(x, "movementNumber", js.undefined)
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setPlayParams(value: PlayParameters): Self = StObject.set(x, "playParams", value.asInstanceOf[js.Any])
      
      inline def setPlayParamsUndefined: Self = StObject.set(x, "playParams", js.undefined)
      
      inline def setPreviews(value: js.Array[Preview]): Self = StObject.set(x, "previews", value.asInstanceOf[js.Any])
      
      inline def setPreviewsVarargs(value: Preview*): Self = StObject.set(x, "previews", js.Array(value*))
      
      inline def setReleaseDate(value: String): Self = StObject.set(x, "releaseDate", value.asInstanceOf[js.Any])
      
      inline def setTrackNumber(value: Double): Self = StObject.set(x, "trackNumber", value.asInstanceOf[js.Any])
      
      inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
      
      inline def setWorkName(value: String): Self = StObject.set(x, "workName", value.asInstanceOf[js.Any])
      
      inline def setWorkNameUndefined: Self = StObject.set(x, "workName", js.undefined)
    }
  }
  
  trait ArtistName extends StObject {
    
    // albumName might not actually be a required attribute of Album.
    // There may be a typo in Apple's documentation, their data doesn't
    // actually return this attribute for the example I picked and the description of the field references music videos, further increasingly the likelihood that it's just a typo):
    var albumName: js.UndefOr[String] = js.undefined
    
    var artistName: String
    
    var artwork: js.UndefOr[typingsJapgolly.appleMusicApi.AppleMusicApi.Artwork] = js.undefined
    
    var contentRating: js.UndefOr[clean | explicit] = js.undefined
    
    var copyright: js.UndefOr[String] = js.undefined
    
    var editorialNotes: js.UndefOr[typingsJapgolly.appleMusicApi.AppleMusicApi.EditorialNotes] = js.undefined
    
    var genreNames: js.Array[String]
    
    var isCompilation: Boolean
    
    var isComplete: Boolean
    
    var isMasteredForItunes: Boolean
    
    var isSingle: Boolean
    
    var name: String
    
    var playParams: js.UndefOr[PlayParameters] = js.undefined
    
    var recordLabel: String
    
    var releaseDate: String
    
    var trackCount: Double
    
    var url: String
  }
  object ArtistName {
    
    inline def apply(
      artistName: String,
      genreNames: js.Array[String],
      isCompilation: Boolean,
      isComplete: Boolean,
      isMasteredForItunes: Boolean,
      isSingle: Boolean,
      name: String,
      recordLabel: String,
      releaseDate: String,
      trackCount: Double,
      url: String
    ): ArtistName = {
      val __obj = js.Dynamic.literal(artistName = artistName.asInstanceOf[js.Any], genreNames = genreNames.asInstanceOf[js.Any], isCompilation = isCompilation.asInstanceOf[js.Any], isComplete = isComplete.asInstanceOf[js.Any], isMasteredForItunes = isMasteredForItunes.asInstanceOf[js.Any], isSingle = isSingle.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], recordLabel = recordLabel.asInstanceOf[js.Any], releaseDate = releaseDate.asInstanceOf[js.Any], trackCount = trackCount.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
      __obj.asInstanceOf[ArtistName]
    }
    
    extension [Self <: ArtistName](x: Self) {
      
      inline def setAlbumName(value: String): Self = StObject.set(x, "albumName", value.asInstanceOf[js.Any])
      
      inline def setAlbumNameUndefined: Self = StObject.set(x, "albumName", js.undefined)
      
      inline def setArtistName(value: String): Self = StObject.set(x, "artistName", value.asInstanceOf[js.Any])
      
      inline def setArtwork(value: typingsJapgolly.appleMusicApi.AppleMusicApi.Artwork): Self = StObject.set(x, "artwork", value.asInstanceOf[js.Any])
      
      inline def setArtworkUndefined: Self = StObject.set(x, "artwork", js.undefined)
      
      inline def setContentRating(value: clean | explicit): Self = StObject.set(x, "contentRating", value.asInstanceOf[js.Any])
      
      inline def setContentRatingUndefined: Self = StObject.set(x, "contentRating", js.undefined)
      
      inline def setCopyright(value: String): Self = StObject.set(x, "copyright", value.asInstanceOf[js.Any])
      
      inline def setCopyrightUndefined: Self = StObject.set(x, "copyright", js.undefined)
      
      inline def setEditorialNotes(value: typingsJapgolly.appleMusicApi.AppleMusicApi.EditorialNotes): Self = StObject.set(x, "editorialNotes", value.asInstanceOf[js.Any])
      
      inline def setEditorialNotesUndefined: Self = StObject.set(x, "editorialNotes", js.undefined)
      
      inline def setGenreNames(value: js.Array[String]): Self = StObject.set(x, "genreNames", value.asInstanceOf[js.Any])
      
      inline def setGenreNamesVarargs(value: String*): Self = StObject.set(x, "genreNames", js.Array(value*))
      
      inline def setIsCompilation(value: Boolean): Self = StObject.set(x, "isCompilation", value.asInstanceOf[js.Any])
      
      inline def setIsComplete(value: Boolean): Self = StObject.set(x, "isComplete", value.asInstanceOf[js.Any])
      
      inline def setIsMasteredForItunes(value: Boolean): Self = StObject.set(x, "isMasteredForItunes", value.asInstanceOf[js.Any])
      
      inline def setIsSingle(value: Boolean): Self = StObject.set(x, "isSingle", value.asInstanceOf[js.Any])
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setPlayParams(value: PlayParameters): Self = StObject.set(x, "playParams", value.asInstanceOf[js.Any])
      
      inline def setPlayParamsUndefined: Self = StObject.set(x, "playParams", js.undefined)
      
      inline def setRecordLabel(value: String): Self = StObject.set(x, "recordLabel", value.asInstanceOf[js.Any])
      
      inline def setReleaseDate(value: String): Self = StObject.set(x, "releaseDate", value.asInstanceOf[js.Any])
      
      inline def setTrackCount(value: Double): Self = StObject.set(x, "trackCount", value.asInstanceOf[js.Any])
      
      inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    }
  }
  
  trait Artwork extends StObject {
    
    var artwork: js.UndefOr[typingsJapgolly.appleMusicApi.AppleMusicApi.Artwork] = js.undefined
    
    var curatorName: js.UndefOr[String] = js.undefined
    
    var description: js.UndefOr[typingsJapgolly.appleMusicApi.AppleMusicApi.EditorialNotes] = js.undefined
    
    // `isChart` is not currently mentioned in the apple music api documentation:
    var isChart: js.UndefOr[Boolean] = js.undefined
    
    var lastModifiedDate: String
    
    var name: String
    
    var playParams: js.UndefOr[PlayParameters] = js.undefined
    
    var playlistType: `user-shared` | editorial | external | `personal-mix`
    
    var url: String
  }
  object Artwork {
    
    inline def apply(
      lastModifiedDate: String,
      name: String,
      playlistType: `user-shared` | editorial | external | `personal-mix`,
      url: String
    ): Artwork = {
      val __obj = js.Dynamic.literal(lastModifiedDate = lastModifiedDate.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], playlistType = playlistType.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
      __obj.asInstanceOf[Artwork]
    }
    
    extension [Self <: Artwork](x: Self) {
      
      inline def setArtwork(value: typingsJapgolly.appleMusicApi.AppleMusicApi.Artwork): Self = StObject.set(x, "artwork", value.asInstanceOf[js.Any])
      
      inline def setArtworkUndefined: Self = StObject.set(x, "artwork", js.undefined)
      
      inline def setCuratorName(value: String): Self = StObject.set(x, "curatorName", value.asInstanceOf[js.Any])
      
      inline def setCuratorNameUndefined: Self = StObject.set(x, "curatorName", js.undefined)
      
      inline def setDescription(value: typingsJapgolly.appleMusicApi.AppleMusicApi.EditorialNotes): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
      
      inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
      
      inline def setIsChart(value: Boolean): Self = StObject.set(x, "isChart", value.asInstanceOf[js.Any])
      
      inline def setIsChartUndefined: Self = StObject.set(x, "isChart", js.undefined)
      
      inline def setLastModifiedDate(value: String): Self = StObject.set(x, "lastModifiedDate", value.asInstanceOf[js.Any])
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setPlayParams(value: PlayParameters): Self = StObject.set(x, "playParams", value.asInstanceOf[js.Any])
      
      inline def setPlayParamsUndefined: Self = StObject.set(x, "playParams", js.undefined)
      
      inline def setPlaylistType(value: `user-shared` | editorial | external | `personal-mix`): Self = StObject.set(x, "playlistType", value.asInstanceOf[js.Any])
      
      inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    }
  }
  
  trait Curator extends StObject {
    
    var curator: Relationship[typingsJapgolly.appleMusicApi.AppleMusicApi.Curator]
    
    var tracks: js.UndefOr[Relationship[Song]] = js.undefined
  }
  object Curator {
    
    inline def apply(curator: Relationship[typingsJapgolly.appleMusicApi.AppleMusicApi.Curator]): Curator = {
      val __obj = js.Dynamic.literal(curator = curator.asInstanceOf[js.Any])
      __obj.asInstanceOf[Curator]
    }
    
    extension [Self <: Curator](x: Self) {
      
      inline def setCurator(value: Relationship[typingsJapgolly.appleMusicApi.AppleMusicApi.Curator]): Self = StObject.set(x, "curator", value.asInstanceOf[js.Any])
      
      inline def setTracks(value: Relationship[Song]): Self = StObject.set(x, "tracks", value.asInstanceOf[js.Any])
      
      inline def setTracksUndefined: Self = StObject.set(x, "tracks", js.undefined)
    }
  }
  
  trait Data extends StObject {
    
    var data: Station
  }
  object Data {
    
    inline def apply(data: Station): Data = {
      val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any])
      __obj.asInstanceOf[Data]
    }
    
    extension [Self <: Data](x: Self) {
      
      inline def setData(value: Station): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    }
  }
  
  trait EditorialNotes extends StObject {
    
    var editorialNotes: js.UndefOr[typingsJapgolly.appleMusicApi.AppleMusicApi.EditorialNotes] = js.undefined
    
    var genreNames: js.Array[String]
    
    var name: String
    
    var url: String
  }
  object EditorialNotes {
    
    inline def apply(genreNames: js.Array[String], name: String, url: String): EditorialNotes = {
      val __obj = js.Dynamic.literal(genreNames = genreNames.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
      __obj.asInstanceOf[EditorialNotes]
    }
    
    extension [Self <: EditorialNotes](x: Self) {
      
      inline def setEditorialNotes(value: typingsJapgolly.appleMusicApi.AppleMusicApi.EditorialNotes): Self = StObject.set(x, "editorialNotes", value.asInstanceOf[js.Any])
      
      inline def setEditorialNotesUndefined: Self = StObject.set(x, "editorialNotes", js.undefined)
      
      inline def setGenreNames(value: js.Array[String]): Self = StObject.set(x, "genreNames", value.asInstanceOf[js.Any])
      
      inline def setGenreNamesVarargs(value: String*): Self = StObject.set(x, "genreNames", js.Array(value*))
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    }
  }
  
  trait Name extends StObject {
    
    var name: String
  }
  object Name {
    
    inline def apply(name: String): Name = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[Name]
    }
    
    extension [Self <: Name](x: Self) {
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    }
  }
  
  trait Playlists extends StObject {
    
    var playlists: js.UndefOr[Relationship[Playlist]] = js.undefined
  }
  object Playlists {
    
    inline def apply(): Playlists = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Playlists]
    }
    
    extension [Self <: Playlists](x: Self) {
      
      inline def setPlaylists(value: Relationship[Playlist]): Self = StObject.set(x, "playlists", value.asInstanceOf[js.Any])
      
      inline def setPlaylistsUndefined: Self = StObject.set(x, "playlists", js.undefined)
    }
  }
  
  trait Url extends StObject {
    
    var artwork: js.UndefOr[typingsJapgolly.appleMusicApi.AppleMusicApi.Artwork] = js.undefined
    
    var editorialNotes: js.UndefOr[typingsJapgolly.appleMusicApi.AppleMusicApi.EditorialNotes] = js.undefined
    
    var name: String
    
    var url: String
  }
  object Url {
    
    inline def apply(name: String, url: String): Url = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
      __obj.asInstanceOf[Url]
    }
    
    extension [Self <: Url](x: Self) {
      
      inline def setArtwork(value: typingsJapgolly.appleMusicApi.AppleMusicApi.Artwork): Self = StObject.set(x, "artwork", value.asInstanceOf[js.Any])
      
      inline def setArtworkUndefined: Self = StObject.set(x, "artwork", js.undefined)
      
      inline def setEditorialNotes(value: typingsJapgolly.appleMusicApi.AppleMusicApi.EditorialNotes): Self = StObject.set(x, "editorialNotes", value.asInstanceOf[js.Any])
      
      inline def setEditorialNotesUndefined: Self = StObject.set(x, "editorialNotes", js.undefined)
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    }
  }
}
