package typingsJapgolly.titanium

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A specifier for a media library query. By default, filters perform an exact match.
  */
trait MediaQueryType extends js.Object {
  /**
  	 * The album artist to filter on. Value should be a String.
  	 */
  var albumArtist: js.UndefOr[MediaQueryInfoType | String] = js.undefined
  /**
  	 * The album artist persistent ID to filter on. Value should be a Number.
  	 */
  var albumArtistPersistentID: js.UndefOr[MediaQueryInfoType | Double] = js.undefined
  /**
  	 * The album persistent ID to filter on. Value should be a Number.
  	 */
  var albumPersistentID: js.UndefOr[MediaQueryInfoType | Double] = js.undefined
  /**
  	 * The album title to filter on. Value should be a String.
  	 */
  var albumTitle: js.UndefOr[MediaQueryInfoType | String] = js.undefined
  /**
  	 * The artist to filter on. Value should be a String.
  	 */
  var artist: js.UndefOr[MediaQueryInfoType | String] = js.undefined
  /**
  	 * The composer to filter on. Value should be a String.
  	 */
  var composer: js.UndefOr[MediaQueryInfoType | String] = js.undefined
  /**
  	 * The composer persistent ID to filter on. Value should be a Number.
  	 */
  var composerPersistentID: js.UndefOr[MediaQueryInfoType | Double] = js.undefined
  /**
  	 * The genre to filter on. Value should be a String.
  	 */
  var genre: js.UndefOr[MediaQueryInfoType | String] = js.undefined
  /**
  	 * The genre persistent ID to filter on. Value should be a Number.
  	 */
  var genrePersistentID: js.UndefOr[MediaQueryInfoType | Double] = js.undefined
  /**
  	 * A constant that specifies the ordering of the result array.
  	 */
  var grouping: js.UndefOr[Double] = js.undefined
  /**
  	 * Filter by whether or not the item is a protected asset.
  	 * Value should be a Boolean.
  	 */
  var hasProtectedAsset: js.UndefOr[MediaQueryInfoType | Boolean] = js.undefined
  /**
  	 * Filter by whether or not the item is a cloud item.
  	 * Value should be a Boolean.
  	 */
  var isCloudItem: js.UndefOr[MediaQueryInfoType | Boolean] = js.undefined
  /**
  	 * Filter by whether or not the item is a compilation.
  	 * The value should be a Boolean.
  	 */
  var isCompilation: js.UndefOr[MediaQueryInfoType | Boolean] = js.undefined
  /**
  	 * The media type to filter on.
  	 */
  var mediaType: js.UndefOr[MediaQueryInfoType | Double] = js.undefined
  /**
  	 * The persistent ID to filter on. Value should be a Number.
  	 */
  var persistentID: js.UndefOr[MediaQueryInfoType | Double] = js.undefined
  /**
  	 * The play count to filter on. Value should be a Number.
  	 */
  var playCount: js.UndefOr[MediaQueryInfoType | Double] = js.undefined
  /**
  	 * The podcast persistent ID to filter on. Value should be a Number.
  	 */
  var podcastPersistentID: js.UndefOr[MediaQueryInfoType | Double] = js.undefined
  /**
  	 * The podcast title to filter on. Value should be a String.
  	 */
  var podcastTitle: js.UndefOr[MediaQueryInfoType | String] = js.undefined
  /**
  	 * The title to filter on. Value should be a String.
  	 */
  var title: js.UndefOr[MediaQueryInfoType | String] = js.undefined
}

object MediaQueryType {
  @scala.inline
  def apply(
    albumArtist: MediaQueryInfoType | String = null,
    albumArtistPersistentID: MediaQueryInfoType | Double = null,
    albumPersistentID: MediaQueryInfoType | Double = null,
    albumTitle: MediaQueryInfoType | String = null,
    artist: MediaQueryInfoType | String = null,
    composer: MediaQueryInfoType | String = null,
    composerPersistentID: MediaQueryInfoType | Double = null,
    genre: MediaQueryInfoType | String = null,
    genrePersistentID: MediaQueryInfoType | Double = null,
    grouping: Int | Double = null,
    hasProtectedAsset: MediaQueryInfoType | Boolean = null,
    isCloudItem: MediaQueryInfoType | Boolean = null,
    isCompilation: MediaQueryInfoType | Boolean = null,
    mediaType: MediaQueryInfoType | Double = null,
    persistentID: MediaQueryInfoType | Double = null,
    playCount: MediaQueryInfoType | Double = null,
    podcastPersistentID: MediaQueryInfoType | Double = null,
    podcastTitle: MediaQueryInfoType | String = null,
    title: MediaQueryInfoType | String = null
  ): MediaQueryType = {
    val __obj = js.Dynamic.literal()
    if (albumArtist != null) __obj.updateDynamic("albumArtist")(albumArtist.asInstanceOf[js.Any])
    if (albumArtistPersistentID != null) __obj.updateDynamic("albumArtistPersistentID")(albumArtistPersistentID.asInstanceOf[js.Any])
    if (albumPersistentID != null) __obj.updateDynamic("albumPersistentID")(albumPersistentID.asInstanceOf[js.Any])
    if (albumTitle != null) __obj.updateDynamic("albumTitle")(albumTitle.asInstanceOf[js.Any])
    if (artist != null) __obj.updateDynamic("artist")(artist.asInstanceOf[js.Any])
    if (composer != null) __obj.updateDynamic("composer")(composer.asInstanceOf[js.Any])
    if (composerPersistentID != null) __obj.updateDynamic("composerPersistentID")(composerPersistentID.asInstanceOf[js.Any])
    if (genre != null) __obj.updateDynamic("genre")(genre.asInstanceOf[js.Any])
    if (genrePersistentID != null) __obj.updateDynamic("genrePersistentID")(genrePersistentID.asInstanceOf[js.Any])
    if (grouping != null) __obj.updateDynamic("grouping")(grouping.asInstanceOf[js.Any])
    if (hasProtectedAsset != null) __obj.updateDynamic("hasProtectedAsset")(hasProtectedAsset.asInstanceOf[js.Any])
    if (isCloudItem != null) __obj.updateDynamic("isCloudItem")(isCloudItem.asInstanceOf[js.Any])
    if (isCompilation != null) __obj.updateDynamic("isCompilation")(isCompilation.asInstanceOf[js.Any])
    if (mediaType != null) __obj.updateDynamic("mediaType")(mediaType.asInstanceOf[js.Any])
    if (persistentID != null) __obj.updateDynamic("persistentID")(persistentID.asInstanceOf[js.Any])
    if (playCount != null) __obj.updateDynamic("playCount")(playCount.asInstanceOf[js.Any])
    if (podcastPersistentID != null) __obj.updateDynamic("podcastPersistentID")(podcastPersistentID.asInstanceOf[js.Any])
    if (podcastTitle != null) __obj.updateDynamic("podcastTitle")(podcastTitle.asInstanceOf[js.Any])
    if (title != null) __obj.updateDynamic("title")(title.asInstanceOf[js.Any])
    __obj.asInstanceOf[MediaQueryType]
  }
}

