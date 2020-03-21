package typingsJapgolly.titanium.Titanium.Media

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.titanium.Titanium.Blob
import typingsJapgolly.titanium.Titanium.Proxy
import typingsJapgolly.titanium.Titanium.UI.TabGroup
import typingsJapgolly.titanium.Titanium.UI.Window
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
		 * A representation of a media item returned by [openMusicLibrary](Titanium.Media.openMusicLibrary) or [queryMusicLibrary](Titanium.Media.queryMusicLibrary).
		 */
trait Item extends Proxy {
  /**
  			 * Artist credited for the album containing this item.
  			 */
  val albumArtist: String
  /**
  			 * The persistent identifier for an album artist.
  			 */
  val albumArtistPersistentID: Double
  /**
  			 * The key for the persistent identifier for an album.
  			 */
  val albumPersistentID: Double
  /**
  			 * Title of the album containing this item.
  			 */
  val albumTitle: String
  /**
  			 * Number of tracks for the album containing this item.
  			 */
  val albumTrackCount: Double
  /**
  			 * Track number for this item.
  			 */
  val albumTrackNumber: Double
  /**
  			 * Artist credited for this item.
  			 */
  val artist: String
  /**
  			 * Image for the item's artwork as a `Blob` object,  or `null` if no artwork is
  			 * available.
  			 */
  val artwork: Blob
  /**
  			 * A URL pointing to the media item.
  			 */
  val assetURL: String
  /**
  			 * The number of musical beats per minute for the media item, corresponding
  			 * to the "BPM" field in the Info tab in the "Get Info" dialog in iTunes.
  			 */
  val beatsPerMinute: Double
  /**
  			 * The user's place in the media item the most recent time it was played.
  			 */
  val bookmarkTime: String
  /**
  			 * Textual information about the media item, corresponding to the "Comments"
  			 * field in in the Info tab in the Get Info dialog in iTunes.
  			 */
  val comments: String
  /**
  			 * Composer of this item.
  			 */
  val composer: String
  /**
  			 * Date when the item was added to the music library.
  			 */
  val dateAdded: js.Date
  /**
  			 * Total number of discs for the album containing this item.
  			 */
  val discCount: Double
  /**
  			 * Disc number for this item in the album.
  			 */
  val discNumber: Double
  /**
  			 * Genre of this item.
  			 */
  val genre: String
  /**
  			 * The persistent identifier for a genre.
  			 */
  val genrePersistentID: Double
  /**
  			 * True if the item represents a protected asset.
  			 */
  val hasProtectedAsset: Boolean
  /**
  			 * True if the media item is an iCloud item.
  			 */
  val isCloudItem: Boolean
  /**
  			 * True if this item is part of a compilation album.
  			 */
  val isCompilation: Boolean
  /**
  			 * True if this item is marked as "Explicit".
  			 */
  val isExplicit: Boolean
  /**
  			 * The most recent calendar date on which the user played the media item.
  			 */
  val lastPlayedDate: js.Date
  /**
  			 * Lyrics for this item.
  			 */
  val lyrics: String
  /**
  			 * The type of the media.
  			 */
  val mediaType: Double
  /**
  			 * The key for the persistent identifier for the media item.
  			 */
  val persistentID: String
  /**
  			 * Number of times the item has been played.
  			 */
  val playCount: Double
  /**
  			 * Length (in seconds) of this item.
  			 */
  val playbackDuration: Double
  /**
  			 * Used to enqueue store tracks by their ID.
  			 */
  val playbackStoreID: Double
  /**
  			 * The persistent identifier for an audio podcast.
  			 */
  val podcastPersistentID: Double
  /**
  			 * Title of a podcast item.
  			 */
  val podcastTitle: String
  /**
  			 * Rating for this item.
  			 */
  val rating: Double
  /**
  			 * Date when this this item was released.
  			 */
  val releaseDate: js.Date
  /**
  			 * Number of times this item has been skipped.
  			 */
  val skipCount: Double
  /**
  			 * Title of this item.
  			 */
  val title: String
  /**
  			 * Corresponds to the "Grouping" field in the Info tab in the "Get Info"
  			 * dialog in iTunes.
  			 */
  val userGrouping: String
  /**
  			 * Gets the value of the <Titanium.Media.Item.albumArtist> property.
  			 */
  def getAlbumArtist(): String
  /**
  			 * Gets the value of the <Titanium.Media.Item.albumArtistPersistentID> property.
  			 */
  def getAlbumArtistPersistentID(): Double
  /**
  			 * Gets the value of the <Titanium.Media.Item.albumPersistentID> property.
  			 */
  def getAlbumPersistentID(): Double
  /**
  			 * Gets the value of the <Titanium.Media.Item.albumTitle> property.
  			 */
  def getAlbumTitle(): String
  /**
  			 * Gets the value of the <Titanium.Media.Item.albumTrackCount> property.
  			 */
  def getAlbumTrackCount(): Double
  /**
  			 * Gets the value of the <Titanium.Media.Item.albumTrackNumber> property.
  			 */
  def getAlbumTrackNumber(): Double
  /**
  			 * Gets the value of the <Titanium.Media.Item.artist> property.
  			 */
  def getArtist(): String
  /**
  			 * Gets the value of the <Titanium.Media.Item.artwork> property.
  			 */
  def getArtwork(): Blob
  /**
  			 * Gets the value of the <Titanium.Media.Item.assetURL> property.
  			 */
  def getAssetURL(): String
  /**
  			 * Gets the value of the <Titanium.Media.Item.beatsPerMinute> property.
  			 */
  def getBeatsPerMinute(): Double
  /**
  			 * Gets the value of the <Titanium.Media.Item.bookmarkTime> property.
  			 */
  def getBookmarkTime(): String
  /**
  			 * Gets the value of the <Titanium.Media.Item.comments> property.
  			 */
  def getComments(): String
  /**
  			 * Gets the value of the <Titanium.Media.Item.composer> property.
  			 */
  def getComposer(): String
  /**
  			 * Gets the value of the <Titanium.Media.Item.dateAdded> property.
  			 */
  def getDateAdded(): js.Date
  /**
  			 * Gets the value of the <Titanium.Media.Item.discCount> property.
  			 */
  def getDiscCount(): Double
  /**
  			 * Gets the value of the <Titanium.Media.Item.discNumber> property.
  			 */
  def getDiscNumber(): Double
  /**
  			 * Gets the value of the <Titanium.Media.Item.genre> property.
  			 */
  def getGenre(): String
  /**
  			 * Gets the value of the <Titanium.Media.Item.genrePersistentID> property.
  			 */
  def getGenrePersistentID(): Double
  /**
  			 * Gets the value of the <Titanium.Media.Item.hasProtectedAsset> property.
  			 */
  def getHasProtectedAsset(): Boolean
  /**
  			 * Gets the value of the <Titanium.Media.Item.isCloudItem> property.
  			 */
  def getIsCloudItem(): Boolean
  /**
  			 * Gets the value of the <Titanium.Media.Item.isCompilation> property.
  			 */
  def getIsCompilation(): Boolean
  /**
  			 * Gets the value of the <Titanium.Media.Item.isExplicit> property.
  			 */
  def getIsExplicit(): Boolean
  /**
  			 * Gets the value of the <Titanium.Media.Item.lastPlayedDate> property.
  			 */
  def getLastPlayedDate(): js.Date
  /**
  			 * Gets the value of the <Titanium.Media.Item.lyrics> property.
  			 */
  def getLyrics(): String
  /**
  			 * Gets the value of the <Titanium.Media.Item.mediaType> property.
  			 */
  def getMediaType(): Double
  /**
  			 * Gets the value of the <Titanium.Media.Item.persistentID> property.
  			 */
  def getPersistentID(): String
  /**
  			 * Gets the value of the <Titanium.Media.Item.playCount> property.
  			 */
  def getPlayCount(): Double
  /**
  			 * Gets the value of the <Titanium.Media.Item.playbackDuration> property.
  			 */
  def getPlaybackDuration(): Double
  /**
  			 * Gets the value of the <Titanium.Media.Item.playbackStoreID> property.
  			 */
  def getPlaybackStoreID(): Double
  /**
  			 * Gets the value of the <Titanium.Media.Item.podcastPersistentID> property.
  			 */
  def getPodcastPersistentID(): Double
  /**
  			 * Gets the value of the <Titanium.Media.Item.podcastTitle> property.
  			 */
  def getPodcastTitle(): String
  /**
  			 * Gets the value of the <Titanium.Media.Item.rating> property.
  			 */
  def getRating(): Double
  /**
  			 * Gets the value of the <Titanium.Media.Item.releaseDate> property.
  			 */
  def getReleaseDate(): js.Date
  /**
  			 * Gets the value of the <Titanium.Media.Item.skipCount> property.
  			 */
  def getSkipCount(): Double
  /**
  			 * Gets the value of the <Titanium.Media.Item.title> property.
  			 */
  def getTitle(): String
  /**
  			 * Gets the value of the <Titanium.Media.Item.userGrouping> property.
  			 */
  def getUserGrouping(): String
}

object Item {
  @scala.inline
  def apply(
    addEventListener: (String, js.Function1[/* param0 */ js.Any, js.Any]) => Callback,
    albumArtist: String,
    albumArtistPersistentID: Double,
    albumPersistentID: Double,
    albumTitle: String,
    albumTrackCount: Double,
    albumTrackNumber: Double,
    apiName: String,
    applyProperties: js.Any => Callback,
    artist: String,
    artwork: Blob,
    assetURL: String,
    beatsPerMinute: Double,
    bookmarkTime: String,
    bubbleParent: Boolean,
    comments: String,
    composer: String,
    dateAdded: js.Date,
    discCount: Double,
    discNumber: Double,
    fireEvent: (String, js.Any) => Callback,
    genre: String,
    genrePersistentID: Double,
    getAlbumArtist: CallbackTo[String],
    getAlbumArtistPersistentID: CallbackTo[Double],
    getAlbumPersistentID: CallbackTo[Double],
    getAlbumTitle: CallbackTo[String],
    getAlbumTrackCount: CallbackTo[Double],
    getAlbumTrackNumber: CallbackTo[Double],
    getApiName: CallbackTo[String],
    getArtist: CallbackTo[String],
    getArtwork: CallbackTo[Blob],
    getAssetURL: CallbackTo[String],
    getBeatsPerMinute: CallbackTo[Double],
    getBookmarkTime: CallbackTo[String],
    getBubbleParent: CallbackTo[Boolean],
    getComments: CallbackTo[String],
    getComposer: CallbackTo[String],
    getDateAdded: CallbackTo[js.Date],
    getDiscCount: CallbackTo[Double],
    getDiscNumber: CallbackTo[Double],
    getGenre: CallbackTo[String],
    getGenrePersistentID: CallbackTo[Double],
    getHasProtectedAsset: CallbackTo[Boolean],
    getIsCloudItem: CallbackTo[Boolean],
    getIsCompilation: CallbackTo[Boolean],
    getIsExplicit: CallbackTo[Boolean],
    getLastPlayedDate: CallbackTo[js.Date],
    getLyrics: CallbackTo[String],
    getMediaType: CallbackTo[Double],
    getPersistentID: CallbackTo[String],
    getPlayCount: CallbackTo[Double],
    getPlaybackDuration: CallbackTo[Double],
    getPlaybackStoreID: CallbackTo[Double],
    getPodcastPersistentID: CallbackTo[Double],
    getPodcastTitle: CallbackTo[String],
    getRating: CallbackTo[Double],
    getReleaseDate: CallbackTo[js.Date],
    getSkipCount: CallbackTo[Double],
    getTitle: CallbackTo[String],
    getUserGrouping: CallbackTo[String],
    hasProtectedAsset: Boolean,
    isCloudItem: Boolean,
    isCompilation: Boolean,
    isExplicit: Boolean,
    lastPlayedDate: js.Date,
    lyrics: String,
    mediaType: Double,
    persistentID: String,
    playCount: Double,
    playbackDuration: Double,
    playbackStoreID: Double,
    podcastPersistentID: Double,
    podcastTitle: String,
    rating: Double,
    releaseDate: js.Date,
    removeEventListener: (String, js.Function1[/* param0 */ js.Any, js.Any]) => Callback,
    setBubbleParent: Boolean => Callback,
    skipCount: Double,
    title: String,
    userGrouping: String,
    getLifecycleContainer: js.UndefOr[CallbackTo[Window | TabGroup]] = js.undefined,
    lifecycleContainer: Window | TabGroup = null,
    setLifecycleContainer: (js.Function1[/* lifecycleContainer */ Window, Unit]) with (js.Function1[/* lifecycleContainer */ TabGroup, Unit]) = null
  ): Item = {
    val __obj = js.Dynamic.literal(albumArtist = albumArtist.asInstanceOf[js.Any], albumArtistPersistentID = albumArtistPersistentID.asInstanceOf[js.Any], albumPersistentID = albumPersistentID.asInstanceOf[js.Any], albumTitle = albumTitle.asInstanceOf[js.Any], albumTrackCount = albumTrackCount.asInstanceOf[js.Any], albumTrackNumber = albumTrackNumber.asInstanceOf[js.Any], apiName = apiName.asInstanceOf[js.Any], artist = artist.asInstanceOf[js.Any], artwork = artwork.asInstanceOf[js.Any], assetURL = assetURL.asInstanceOf[js.Any], beatsPerMinute = beatsPerMinute.asInstanceOf[js.Any], bookmarkTime = bookmarkTime.asInstanceOf[js.Any], bubbleParent = bubbleParent.asInstanceOf[js.Any], comments = comments.asInstanceOf[js.Any], composer = composer.asInstanceOf[js.Any], dateAdded = dateAdded.asInstanceOf[js.Any], discCount = discCount.asInstanceOf[js.Any], discNumber = discNumber.asInstanceOf[js.Any], genre = genre.asInstanceOf[js.Any], genrePersistentID = genrePersistentID.asInstanceOf[js.Any], hasProtectedAsset = hasProtectedAsset.asInstanceOf[js.Any], isCloudItem = isCloudItem.asInstanceOf[js.Any], isCompilation = isCompilation.asInstanceOf[js.Any], isExplicit = isExplicit.asInstanceOf[js.Any], lastPlayedDate = lastPlayedDate.asInstanceOf[js.Any], lyrics = lyrics.asInstanceOf[js.Any], mediaType = mediaType.asInstanceOf[js.Any], persistentID = persistentID.asInstanceOf[js.Any], playCount = playCount.asInstanceOf[js.Any], playbackDuration = playbackDuration.asInstanceOf[js.Any], playbackStoreID = playbackStoreID.asInstanceOf[js.Any], podcastPersistentID = podcastPersistentID.asInstanceOf[js.Any], podcastTitle = podcastTitle.asInstanceOf[js.Any], rating = rating.asInstanceOf[js.Any], releaseDate = releaseDate.asInstanceOf[js.Any], skipCount = skipCount.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any], userGrouping = userGrouping.asInstanceOf[js.Any])
    __obj.updateDynamic("addEventListener")(js.Any.fromFunction2((t0: java.lang.String, t1: js.Function1[/* param0 */ js.Any, js.Any]) => addEventListener(t0, t1).runNow()))
    __obj.updateDynamic("applyProperties")(js.Any.fromFunction1((t0: js.Any) => applyProperties(t0).runNow()))
    __obj.updateDynamic("fireEvent")(js.Any.fromFunction2((t0: java.lang.String, t1: js.Any) => fireEvent(t0, t1).runNow()))
    __obj.updateDynamic("getAlbumArtist")(getAlbumArtist.toJsFn)
    __obj.updateDynamic("getAlbumArtistPersistentID")(getAlbumArtistPersistentID.toJsFn)
    __obj.updateDynamic("getAlbumPersistentID")(getAlbumPersistentID.toJsFn)
    __obj.updateDynamic("getAlbumTitle")(getAlbumTitle.toJsFn)
    __obj.updateDynamic("getAlbumTrackCount")(getAlbumTrackCount.toJsFn)
    __obj.updateDynamic("getAlbumTrackNumber")(getAlbumTrackNumber.toJsFn)
    __obj.updateDynamic("getApiName")(getApiName.toJsFn)
    __obj.updateDynamic("getArtist")(getArtist.toJsFn)
    __obj.updateDynamic("getArtwork")(getArtwork.toJsFn)
    __obj.updateDynamic("getAssetURL")(getAssetURL.toJsFn)
    __obj.updateDynamic("getBeatsPerMinute")(getBeatsPerMinute.toJsFn)
    __obj.updateDynamic("getBookmarkTime")(getBookmarkTime.toJsFn)
    __obj.updateDynamic("getBubbleParent")(getBubbleParent.toJsFn)
    __obj.updateDynamic("getComments")(getComments.toJsFn)
    __obj.updateDynamic("getComposer")(getComposer.toJsFn)
    __obj.updateDynamic("getDateAdded")(getDateAdded.toJsFn)
    __obj.updateDynamic("getDiscCount")(getDiscCount.toJsFn)
    __obj.updateDynamic("getDiscNumber")(getDiscNumber.toJsFn)
    __obj.updateDynamic("getGenre")(getGenre.toJsFn)
    __obj.updateDynamic("getGenrePersistentID")(getGenrePersistentID.toJsFn)
    __obj.updateDynamic("getHasProtectedAsset")(getHasProtectedAsset.toJsFn)
    __obj.updateDynamic("getIsCloudItem")(getIsCloudItem.toJsFn)
    __obj.updateDynamic("getIsCompilation")(getIsCompilation.toJsFn)
    __obj.updateDynamic("getIsExplicit")(getIsExplicit.toJsFn)
    __obj.updateDynamic("getLastPlayedDate")(getLastPlayedDate.toJsFn)
    __obj.updateDynamic("getLyrics")(getLyrics.toJsFn)
    __obj.updateDynamic("getMediaType")(getMediaType.toJsFn)
    __obj.updateDynamic("getPersistentID")(getPersistentID.toJsFn)
    __obj.updateDynamic("getPlayCount")(getPlayCount.toJsFn)
    __obj.updateDynamic("getPlaybackDuration")(getPlaybackDuration.toJsFn)
    __obj.updateDynamic("getPlaybackStoreID")(getPlaybackStoreID.toJsFn)
    __obj.updateDynamic("getPodcastPersistentID")(getPodcastPersistentID.toJsFn)
    __obj.updateDynamic("getPodcastTitle")(getPodcastTitle.toJsFn)
    __obj.updateDynamic("getRating")(getRating.toJsFn)
    __obj.updateDynamic("getReleaseDate")(getReleaseDate.toJsFn)
    __obj.updateDynamic("getSkipCount")(getSkipCount.toJsFn)
    __obj.updateDynamic("getTitle")(getTitle.toJsFn)
    __obj.updateDynamic("getUserGrouping")(getUserGrouping.toJsFn)
    __obj.updateDynamic("removeEventListener")(js.Any.fromFunction2((t0: java.lang.String, t1: js.Function1[/* param0 */ js.Any, js.Any]) => removeEventListener(t0, t1).runNow()))
    __obj.updateDynamic("setBubbleParent")(js.Any.fromFunction1((t0: scala.Boolean) => setBubbleParent(t0).runNow()))
    getLifecycleContainer.foreach(p => __obj.updateDynamic("getLifecycleContainer")(p.toJsFn))
    if (lifecycleContainer != null) __obj.updateDynamic("lifecycleContainer")(lifecycleContainer.asInstanceOf[js.Any])
    if (setLifecycleContainer != null) __obj.updateDynamic("setLifecycleContainer")(setLifecycleContainer.asInstanceOf[js.Any])
    __obj.asInstanceOf[Item]
  }
}

