package typingsJapgolly.spotifyWebApiNode.mod

import typingsJapgolly.spotifyApi.SpotifyApi.AddToQueueResponse
import typingsJapgolly.spotifyApi.SpotifyApi.AddTracksToPlaylistResponse
import typingsJapgolly.spotifyApi.SpotifyApi.AlbumTracksResponse
import typingsJapgolly.spotifyApi.SpotifyApi.ArtistsAlbumsResponse
import typingsJapgolly.spotifyApi.SpotifyApi.ArtistsRelatedArtistsResponse
import typingsJapgolly.spotifyApi.SpotifyApi.ArtistsTopTracksResponse
import typingsJapgolly.spotifyApi.SpotifyApi.AudioAnalysisResponse
import typingsJapgolly.spotifyApi.SpotifyApi.AudioFeaturesResponse
import typingsJapgolly.spotifyApi.SpotifyApi.AvailableGenreSeedsResponse
import typingsJapgolly.spotifyApi.SpotifyApi.CategoryPlaylistsReponse
import typingsJapgolly.spotifyApi.SpotifyApi.ChangePlaylistDetailsReponse
import typingsJapgolly.spotifyApi.SpotifyApi.CheckUserSavedAlbumsResponse
import typingsJapgolly.spotifyApi.SpotifyApi.CheckUsersSavedTracksResponse
import typingsJapgolly.spotifyApi.SpotifyApi.CreatePlaylistResponse
import typingsJapgolly.spotifyApi.SpotifyApi.CurrentPlaybackResponse
import typingsJapgolly.spotifyApi.SpotifyApi.CurrentUsersProfileResponse
import typingsJapgolly.spotifyApi.SpotifyApi.CurrentlyPlayingResponse
import typingsJapgolly.spotifyApi.SpotifyApi.FollowPlaylistReponse
import typingsJapgolly.spotifyApi.SpotifyApi.ListOfFeaturedPlaylistsResponse
import typingsJapgolly.spotifyApi.SpotifyApi.ListOfNewReleasesResponse
import typingsJapgolly.spotifyApi.SpotifyApi.ListOfUsersPlaylistsResponse
import typingsJapgolly.spotifyApi.SpotifyApi.MultipleAlbumsResponse
import typingsJapgolly.spotifyApi.SpotifyApi.MultipleArtistsResponse
import typingsJapgolly.spotifyApi.SpotifyApi.MultipleAudioFeaturesResponse
import typingsJapgolly.spotifyApi.SpotifyApi.MultipleCategoriesResponse
import typingsJapgolly.spotifyApi.SpotifyApi.MultipleEpisodesResponse
import typingsJapgolly.spotifyApi.SpotifyApi.MultipleShowsResponse
import typingsJapgolly.spotifyApi.SpotifyApi.MultipleTracksResponse
import typingsJapgolly.spotifyApi.SpotifyApi.PlaylistTrackResponse
import typingsJapgolly.spotifyApi.SpotifyApi.RecommendationsFromSeedsResponse
import typingsJapgolly.spotifyApi.SpotifyApi.RemoveAlbumsForUserResponse
import typingsJapgolly.spotifyApi.SpotifyApi.RemoveTracksFromPlaylistResponse
import typingsJapgolly.spotifyApi.SpotifyApi.RemoveUsersSavedTracksResponse
import typingsJapgolly.spotifyApi.SpotifyApi.ReorderPlaylistTracksResponse
import typingsJapgolly.spotifyApi.SpotifyApi.ReplacePlaylistTracksResponse
import typingsJapgolly.spotifyApi.SpotifyApi.SaveAlbumsForUserResponse
import typingsJapgolly.spotifyApi.SpotifyApi.SaveTracksForUserResponse
import typingsJapgolly.spotifyApi.SpotifyApi.SearchResponse
import typingsJapgolly.spotifyApi.SpotifyApi.ShowEpisodesResponse
import typingsJapgolly.spotifyApi.SpotifyApi.SingleAlbumResponse
import typingsJapgolly.spotifyApi.SpotifyApi.SingleArtistResponse
import typingsJapgolly.spotifyApi.SpotifyApi.SingleCategoryResponse
import typingsJapgolly.spotifyApi.SpotifyApi.SingleEpisodeResponse
import typingsJapgolly.spotifyApi.SpotifyApi.SinglePlaylistResponse
import typingsJapgolly.spotifyApi.SpotifyApi.SingleShowResponse
import typingsJapgolly.spotifyApi.SpotifyApi.SingleTrackResponse
import typingsJapgolly.spotifyApi.SpotifyApi.UnfollowPlaylistReponse
import typingsJapgolly.spotifyApi.SpotifyApi.UploadCustomPlaylistCoverImageReponse
import typingsJapgolly.spotifyApi.SpotifyApi.UserDevicesResponse
import typingsJapgolly.spotifyApi.SpotifyApi.UserFollowsUsersOrArtistsResponse
import typingsJapgolly.spotifyApi.SpotifyApi.UserProfileResponse
import typingsJapgolly.spotifyApi.SpotifyApi.UsersFollowPlaylistReponse
import typingsJapgolly.spotifyApi.SpotifyApi.UsersFollowedArtistsResponse
import typingsJapgolly.spotifyApi.SpotifyApi.UsersRecentlyPlayedTracksResponse
import typingsJapgolly.spotifyApi.SpotifyApi.UsersSavedAlbumsResponse
import typingsJapgolly.spotifyApi.SpotifyApi.UsersSavedShowsResponse
import typingsJapgolly.spotifyApi.SpotifyApi.UsersSavedTracksResponse
import typingsJapgolly.spotifyApi.SpotifyApi.UsersTopArtistsResponse
import typingsJapgolly.spotifyApi.SpotifyApi.UsersTopTracksResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SpotifyWebApi extends StObject {
  
  def addToMySavedAlbums(albumIds: js.Array[String]): js.Promise[Response[SaveAlbumsForUserResponse]] = js.native
  /**
    * Add an album from the authenticated user's Your Music library.
    * @param albumIds The track IDs
    * @param callback Optional callback method to be called instead of the promise.
    * @returns A promise that if successful returns null, otherwise an error. Not returned if a callback is given.
    */
  def addToMySavedAlbums(albumIds: js.Array[String], callback: Callback[SaveAlbumsForUserResponse]): Unit = js.native
  
  def addToMySavedShows(showIds: js.Array[String]): js.Promise[Response[Unit]] = js.native
  /**
    * Add a show from the authenticated user's Your Music library.
    * @param showIds The show IDs
    * @param callback Optional callback method to be called instead of the promise.
    * @returns A promise that if successful returns null, otherwise an error. Not returned if a callback is given.
    */
  def addToMySavedShows(showIds: js.Array[String], callback: Callback[Unit]): Unit = js.native
  
  def addToMySavedTracks(trackIds: js.Array[String]): js.Promise[Response[SaveTracksForUserResponse]] = js.native
  /**
    * Add a track from the authenticated user's Your Music library.
    * @param trackIds The track IDs
    * @param callback Optional callback method to be called instead of the promise.
    * @returns A promise that if successful returns null, otherwise an error. Not returned if a callback is given.
    */
  def addToMySavedTracks(trackIds: js.Array[String], callback: Callback[SaveTracksForUserResponse]): Unit = js.native
  
  /**
    * Add track or episode to device queue
    * @param uri URI of the track or episode to add
    * @param options Options, being device_id.
    * @returns A promise that if successful returns null, otherwise an error.
    */
  def addToQueue(uri: String): js.Promise[Response[AddToQueueResponse]] = js.native
  def addToQueue(uri: String, options: DeviceOptions): js.Promise[Response[AddToQueueResponse]] = js.native
  
  def addTracksToPlaylist(playlistId: String, tracks: js.Array[String]): js.Promise[Response[AddTracksToPlaylistResponse]] = js.native
  def addTracksToPlaylist(playlistId: String, tracks: js.Array[String], options: PositionOptions): js.Promise[Response[AddTracksToPlaylistResponse]] = js.native
  /**
    * Add tracks to a playlist.
    * @param playlistId The playlist's ID
    * @param tracks URIs of the tracks to add to the playlist.
    * @param options Options, position being the only one.
    * @param callback Optional callback method to be called instead of the promise.
    * @example addTracksToPlaylist('3EsfV6XzCHU8SPNdbnFogK', ["spotify:track:4iV5W9uYEdYUVa79Axb7Rh", "spotify:track:1301WleyT98MSxVHPZCA6M"]).then(...)
    * @returns A promise that if successful returns an object containing a snapshot_id. If rejected,
    * it contains an error object. Not returned if a callback is given.
    */
  def addTracksToPlaylist(
    playlistId: String,
    tracks: js.Array[String],
    options: PositionOptions,
    callback: Callback[AddTracksToPlaylistResponse]
  ): Unit = js.native
  
  def areFollowingPlaylist(userId: String, playlistId: String, followerIds: js.Array[String]): js.Promise[Response[UsersFollowPlaylistReponse]] = js.native
  /**
    * Check if users are following a playlist.
    * @param userId The playlist's owner's user ID
    * @param playlistId The playlist's ID
    * @param User IDs of the following users
    * @param callback Optional callback method to be called instead of the promise.
    * @returns A promise that if successful returns an array of booleans. If rejected,
    * it contains an error object. Not returned if a callback is given.
    */
  def areFollowingPlaylist(
    userId: String,
    playlistId: String,
    followerIds: js.Array[String],
    callback: Callback[UsersFollowPlaylistReponse]
  ): Unit = js.native
  
  def authorizationCodeGrant(code: String): js.Promise[Response[AuthorizationCodeGrantResponse]] = js.native
  /**
    * Request an access token using the Authorization Code flow.
    * Requires that client ID, client secret, and redirect URI has been set previous to the call.
    * @param code The authorization code returned in the callback in the Authorization Code flow.
    * @param callback Optional callback method to be called instead of the promise.
    * @returns A promise that if successful, resolves into an object containing the access token,
    *          refresh token, token type and time to expiration. If rejected, it contains an error object.
    *          Not returned if a callback is given.
    */
  def authorizationCodeGrant(code: String, callback: Callback[AuthorizationCodeGrantResponse]): Unit = js.native
  
  def changePlaylistDetails(playlistId: String): js.Promise[Response[ChangePlaylistDetailsReponse]] = js.native
  def changePlaylistDetails(playlistId: String, options: ChangePlaylistOptions): js.Promise[Response[ChangePlaylistDetailsReponse]] = js.native
  /**
    * Change playlist details.
    * @param playlistId The playlist's ID
    * @param options The possible options, e.g. name, public.
    * @param callback Optional callback method to be called instead of the promise.
    * @example changePlaylistDetails('3EsfV6XzCHU8SPNdbnFogK', {name: 'New name', public: true}).then(...)
    * @returns A promise that if successful, simply resolves to an empty object. If rejected,
    * it contains an error object. Not returned if a callback is given.
    */
  def changePlaylistDetails(
    playlistId: String,
    options: ChangePlaylistOptions,
    callback: Callback[ChangePlaylistDetailsReponse]
  ): Unit = js.native
  
  def clientCredentialsGrant(): js.Promise[Response[ClientCredentialsGrantResponse]] = js.native
  def clientCredentialsGrant(options: js.Object): js.Promise[Response[ClientCredentialsGrantResponse]] = js.native
  /**
    * Request an access token using the Client Credentials flow.
    * Requires that client ID and client secret has been set previous to the call.
    * @param options Options.
    * @param callback Optional callback method to be called instead of the promise.
    * @returns A promise that if successful, resolves into an object containing the access token,
    *          token type and time to expiration. If rejected, it contains an error object. Not returned if a callback is given.
    */
  def clientCredentialsGrant(options: js.Object, callback: Callback[ClientCredentialsGrantResponse]): Unit = js.native
  
  def containsMySavedAlbums(albumIds: js.Array[String]): js.Promise[Response[CheckUserSavedAlbumsResponse]] = js.native
  /**
    * Check if one or more albums is already saved in the current Spotify user’s “Your Music” library.
    * @param albumIds The album IDs
    * @param callback Optional callback method to be called instead of the promise.
    * @returns A promise that if successful, resolves into an array of booleans. The order
    * of the returned array's elements correspond to the album ID in the request.
    * The boolean value of true indicates that the album is part of the user's library, otherwise false.
    * Not returned if a callback is given.
    */
  def containsMySavedAlbums(albumIds: js.Array[String], callback: Callback[CheckUserSavedAlbumsResponse]): Unit = js.native
  
  def containsMySavedShows(showIds: js.Array[String]): js.Promise[Response[js.Array[Boolean]]] = js.native
  /**
    * Check if one or more shows is already saved in the current Spotify user’s “Your Music” library.
    * @param showIds The show IDs
    * @param callback Optional callback method to be called instead of the promise.
    * @returns A promise that if successful, resolves into an array of booleans. The order
    * of the returned array's elements correspond to the show ID in the request.
    * The boolean value of true indicates that the show is part of the user's library, otherwise false.
    * Not returned if a callback is given.
    */
  def containsMySavedShows(showIds: js.Array[String], callback: Callback[js.Array[Boolean]]): Unit = js.native
  
  def containsMySavedTracks(trackIds: js.Array[String]): js.Promise[Response[CheckUsersSavedTracksResponse]] = js.native
  /**
    * Check if one or more tracks is already saved in the current Spotify user’s “Your Music” library.
    * @param trackIds The track IDs
    * @param callback Optional callback method to be called instead of the promise.
    * @returns A promise that if successful, resolves into an array of booleans. The order
    * of the returned array's elements correspond to the track ID in the request.
    * The boolean value of true indicates that the track is part of the user's library, otherwise false.
    * Not returned if a callback is given.
    */
  def containsMySavedTracks(trackIds: js.Array[String], callback: Callback[CheckUsersSavedTracksResponse]): Unit = js.native
  
  /**
    * Retrieve a URL where the user can give the application permissions.
    * @param scopes The scopes corresponding to the permissions the application needs.
    * @param state A parameter that you can use to maintain a value between the request and the callback to redirect_uri.It is useful to prevent CSRF exploits.
    * @param showDialog A parameter that you can use to force the user to approve the app on each login rather than being automatically redirected.
    * @returns The URL where the user can give application permissions.
    */
  def createAuthorizeURL(scopes: js.Array[String], state: String): String = js.native
  def createAuthorizeURL(scopes: js.Array[String], state: String, showDialog: Boolean): String = js.native
  
  def createPlaylist(playlistName: String): js.Promise[Response[CreatePlaylistResponse]] = js.native
  def createPlaylist(playlistName: String, options: PlaylistDetailsOptions): js.Promise[Response[CreatePlaylistResponse]] = js.native
  /**
    * Create a playlist.
    * @param name The name of the playlist.
    * @param options The possible options, being description, collaborative and public.
    * @param callback Optional callback method to be called instead of the promise.
    * @example createPlaylist('My playlist', {''description': 'My description', 'collaborative' : false, 'public': true}).then(...)
    * @returns A promise that if successful, resolves to an object containing information about the
    *          created playlist. If rejected, it contains an error object. Not returned if a callback is given.
    */
  def createPlaylist(playlistName: String, options: PlaylistDetailsOptions, callback: Callback[CreatePlaylistResponse]): Unit = js.native
  
  def followArtists(artistIds: js.Array[String]): js.Promise[Response[Unit]] = js.native
  /**
    * Add the current user as a follower of one or more artists.
    * @param artistIds The IDs of the artists to be followed.
    * @param callback Optional callback method to be called instead of the promise.
    * @example followArtists(['0LcJLqbBmaGUft1e9Mm8HV', '3gqv1kgivAc92KnUm4elKv']).then(...)
    * @returns A promise that if successful, simply resolves to an empty object. If rejected,
    *          it contains an error object. Not returned if a callback is given.
    */
  def followArtists(artistIds: js.Array[String], callback: Callback[Unit]): Unit = js.native
  
  def followPlaylist(playlistId: String): js.Promise[Response[FollowPlaylistReponse]] = js.native
  def followPlaylist(playlistId: String, options: PublicOptions): js.Promise[Response[FollowPlaylistReponse]] = js.native
  /**
    * Follow a playlist.
    * @param playlistId The playlist's ID
    * @param options The possible options, currently only public.
    * @param callback Optional callback method to be called instead of the promise.
    * @returns A promise that if successful, simply resolves to an empty object. If rejected,
    * it contains an error object. Not returned if a callback is given.
    */
  def followPlaylist(playlistId: String, options: PublicOptions, callback: Callback[FollowPlaylistReponse]): Unit = js.native
  
  def followUsers(userIds: js.Array[String]): js.Promise[Response[Unit]] = js.native
  /**
    * Add the current user as a follower of one or more other Spotify users.
    * @param userIds The IDs of the users to be followed.
    * @param callback Optional callback method to be called instead of the promise.
    * @example followUsers(['thelinmichael', 'wizzler']).then(...)
    * @returns A promise that if successful, simply resolves to an empty object. If rejected,
    *          it contains an error object. Not returned if a callback is given.
    */
  def followUsers(userIds: js.Array[String], callback: Callback[Unit]): Unit = js.native
  
  def getAccessToken(): js.UndefOr[String] = js.native
  
  def getAlbum(albumId: String): js.Promise[Response[SingleAlbumResponse]] = js.native
  def getAlbum(albumId: String, options: MarketOptions): js.Promise[Response[SingleAlbumResponse]] = js.native
  /**
    * Look up an album.
    * @param albumId The album's ID.
    * @param options The possible options, currently only market.
    * @param callback Optional callback method to be called instead of the promise.
    * @example getAlbum('0sNOF9WDwhWunNAHPD3Baj').then(...)
    * @returns A promise that if successful, returns an object containing information
    *          about the album. Not returned if a callback is given.
    */
  def getAlbum(albumId: String, options: MarketOptions, callback: Callback[SingleAlbumResponse]): Unit = js.native
  
  def getAlbumTracks(albumId: String): js.Promise[Response[AlbumTracksResponse]] = js.native
  def getAlbumTracks(albumId: String, options: PaginationMarketOptions): js.Promise[Response[AlbumTracksResponse]] = js.native
  /**
    * Get the tracks of an album.
    * @param albumId the album's ID.
    * @param options The possible options, e.g. limit.
    * @param callback Optional callback method to be called instead of the promise.
    * @example getAlbumTracks('41MnTivkwTO3UUJ8DrqEJJ', { limit : 5, offset : 1 }).then(...)
    * @returns A promise that if successful, returns an object containing the
    *                    tracks in the album. The result is paginated. If the promise is rejected.
    *                    it contains an error object. Not returned if a callback is given.
    */
  def getAlbumTracks(albumId: String, options: PaginationMarketOptions, callback: Callback[AlbumTracksResponse]): Unit = js.native
  
  def getAlbums(albumIds: js.Array[String]): js.Promise[Response[MultipleAlbumsResponse]] = js.native
  def getAlbums(albumIds: js.Array[String], options: MarketOptions): js.Promise[Response[MultipleAlbumsResponse]] = js.native
  /**
    * Look up several albums.
    * @param albumIds The IDs of the albums.
    * @param options The possible options, currently only market.
    * @param callback Optional callback method to be called instead of the promise.
    * @example getAlbums(['26TtzBrPdUkHMSTPSbctbl', '5kUSMNOHu33TTDtV8RGHLg']).then(...)
    * @returns A promise that if successful, returns an object containing information
    *          about the albums. Not returned if a callback is given.
    */
  def getAlbums(albumIds: js.Array[String], options: MarketOptions, callback: Callback[MultipleAlbumsResponse]): Unit = js.native
  
  def getArtist(artistId: String): js.Promise[Response[SingleArtistResponse]] = js.native
  /**
    * Look up an artist.
    * @param artistId The artist's ID.
    * @param callback Optional callback method to be called instead of the promise.
    * @example getArtist('1u7kkVrr14iBvrpYnZILJR').then(...)
    * @returns A promise that if successful, returns an object containing information
    *          about the artist. Not returned if a callback is given.
    */
  def getArtist(artistId: String, callback: Callback[SingleArtistResponse]): Unit = js.native
  
  def getArtistAlbums(artistId: String): js.Promise[Response[ArtistsAlbumsResponse]] = js.native
  def getArtistAlbums(artistId: String, options: GetArtistAlbumsOptions): js.Promise[Response[ArtistsAlbumsResponse]] = js.native
  /**
    * Get an artist's albums.
    * @param artistId The artist's ID.
    * @param options The possible options, e.g. limit, offset.
    * @param callback Optional callback method to be called instead of the promise.
    * @example getArtistAlbums('0oSGxfWSnnOXhD2fKuz2Gy', { album_type : 'album', country : 'GB', limit : 2, offset : 5 }).then(...)
    * @returns A promise that if successful, returns an object containing the albums
    *          for the given artist. The result is paginated. If the promise is rejected,
    *          it contains an error object. Not returned if a callback is given.
    */
  def getArtistAlbums(artistId: String, options: GetArtistAlbumsOptions, callback: Callback[ArtistsAlbumsResponse]): Unit = js.native
  
  def getArtistRelatedArtists(artistId: String): js.Promise[Response[ArtistsRelatedArtistsResponse]] = js.native
  /**
    * Get related artists.
    * @param artistId The artist's ID.
    * @param callback Optional callback method to be called instead of the promise.
    * @example getArtistRelatedArtists('0oSGxfWSnnOXhD2fKuz2Gy').then(...)
    * @returns A promise that if successful, returns an object containing the
    *          related artists. If the promise is rejected, it contains an error object. Not returned if a callback is given.
    */
  def getArtistRelatedArtists(artistId: String, callback: Callback[ArtistsRelatedArtistsResponse]): Unit = js.native
  
  def getArtistTopTracks(artistId: String, country: String): js.Promise[Response[ArtistsTopTracksResponse]] = js.native
  /**
    * Get an artist's top tracks.
    * @param artistId The artist's ID.
    * @param country The country/territory where the tracks are most popular. (format: ISO 3166-1 alpha-2)
    * @param callback Optional callback method to be called instead of the promise.
    * @example getArtistTopTracks('0oSGxfWSnnOXhD2fKuz2Gy', 'GB').then(...)
    * @returns A promise that if successful, returns an object containing the
    *          artist's top tracks in the given country. If the promise is rejected,
    *          it contains an error object. Not returned if a callback is given.
    */
  def getArtistTopTracks(artistId: String, country: String, callback: Callback[ArtistsTopTracksResponse]): Unit = js.native
  
  def getArtists(artistIds: js.Array[String]): js.Promise[Response[MultipleArtistsResponse]] = js.native
  /**
    * Look up several artists.
    * @param artistIds The IDs of the artists.
    * @param callback Optional callback method to be called instead of the promise.
    * @example getArtists(['0oSGxfWSnnOXhD2fKuz2Gy', '3dBVyJ7JuOMt4GE9607Qin']).then(...)
    * @returns A promise that if successful, returns an object containing information
    *          about the artists. Not returned if a callback is given.
    */
  def getArtists(artistIds: js.Array[String], callback: Callback[MultipleArtistsResponse]): Unit = js.native
  
  def getAudioAnalysisForTrack(trackId: String): js.Promise[Response[AudioAnalysisResponse]] = js.native
  /**
    * Get audio analysis for a single track identified by its unique Spotify ID.
    * @param trackId The track ID
    * @param callback Optional callback method to be called instead of the promise.
    * @example getAudioAnalysisForTrack('38P3Q4QcdjQALGF2Z92BmR').then(...)
    * @returns A promise that if successful, resolves to an object
    *          containing information about the audio analysis. If the promise is
    *          rejected, it contains an error object. Not returned if a callback is given.
    */
  def getAudioAnalysisForTrack(trackId: String, callback: Callback[AudioAnalysisResponse]): Unit = js.native
  
  def getAudioFeaturesForTrack(trackId: String): js.Promise[Response[AudioFeaturesResponse]] = js.native
  /**
    * Get audio features for a single track identified by its unique Spotify ID.
    * @param trackId The track ID
    * @param callback Optional callback method to be called instead of the promise.
    * @example getAudioFeaturesForTrack('38P3Q4QcdjQALGF2Z92BmR').then(...)
    * @returns A promise that if successful, resolves to an object
    *          containing information about the audio features. If the promise is
    *          rejected, it contains an error object. Not returned if a callback is given.
    */
  def getAudioFeaturesForTrack(trackId: String, callback: Callback[AudioFeaturesResponse]): Unit = js.native
  
  def getAudioFeaturesForTracks(trackIds: js.Array[String]): js.Promise[Response[MultipleAudioFeaturesResponse]] = js.native
  /**
    * Get audio features for multiple tracks identified by their unique Spotify ID.
    * @param trackIds The track IDs
    * @param callback Optional callback method to be called instead of the promise.
    * @example getAudioFeaturesForTracks(['38P3Q4QcdjQALGF2Z92BmR', '2HO2bnoMrpnZUbUqiilLHi']).then(...)
    * @returns A promise that if successful, resolves to an object
    *          containing information about the audio features for the tracks. If the promise is
    *          rejected, it contains an error object. Not returned if a callback is given.
    */
  def getAudioFeaturesForTracks(trackIds: js.Array[String], callback: Callback[MultipleAudioFeaturesResponse]): Unit = js.native
  
  def getAvailableGenreSeeds(): js.Promise[Response[AvailableGenreSeedsResponse]] = js.native
  /**
    * Retrieve a list of available genres seed parameter values for recommendations.
    * @param callback Optional callback method to be called instead of the promise.
    * @example getAvailableGenreSeeds().then(...)
    * @returns A promise that if successful, resolves to an object containing
    *          a list of available genres to be used as seeds for recommendations.
    *          If rejected, it contains an error object. Not returned if a callback is given.
    */
  def getAvailableGenreSeeds(callback: Callback[AvailableGenreSeedsResponse]): Unit = js.native
  
  def getCategories(): js.Promise[Response[MultipleCategoriesResponse]] = js.native
  def getCategories(options: PaginationLocaleOptions): js.Promise[Response[MultipleCategoriesResponse]] = js.native
  /**
    * Retrieve a list of categories used to tag items in Spotify (e.g. in the 'Browse' tab)
    * @param options Options, being country, locale, limit, offset.
    * @param callback Optional callback method to be called instead of the promise.
    * @returns A promise that if successful, resolves to an object containing a paging object of categories.
    * Not returned if a callback is given.
    */
  def getCategories(options: PaginationLocaleOptions, callback: Callback[MultipleCategoriesResponse]): Unit = js.native
  
  def getCategory(categoryId: String): js.Promise[Response[SingleCategoryResponse]] = js.native
  def getCategory(categoryId: String, options: LocaleOptions): js.Promise[Response[SingleCategoryResponse]] = js.native
  /**
    * Retrieve a category.
    * @param categoryId The id of the category to retrieve.
    * @param options Options, being country, locale.
    * @param callback Optional callback method to be called instead of the promise.
    * @returns A promise that if successful, resolves to an object containing a category object.
    * Not returned if a callback is given.
    */
  def getCategory(categoryId: String, options: LocaleOptions, callback: Callback[SingleCategoryResponse]): Unit = js.native
  
  def getClientId(): js.UndefOr[String] = js.native
  
  def getClientSecret(): js.UndefOr[String] = js.native
  
  def getCredentials(): Credentials = js.native
  
  def getEpisode(episodeId: String): js.Promise[Response[SingleEpisodeResponse]] = js.native
  def getEpisode(episodeId: String, options: MarketOptions): js.Promise[Response[SingleEpisodeResponse]] = js.native
  /**
    * Look up an episode.
    * @param episodeId The episode's ID.
    * @param options The possible options, currently only market.
    * @param callback Optional callback method to be called instead of the promise.
    * @example getEpisode('3Qm86XLflmIXVm1wcwkgDK').then(...)
    * @returns A promise that if successful, returns an object containing information
    *          about the episode. Not returned if a callback is given.
    */
  def getEpisode(episodeId: String, options: MarketOptions, callback: Callback[SingleEpisodeResponse]): Unit = js.native
  
  def getEpisodes(episodeIds: js.Array[String]): js.Promise[Response[MultipleEpisodesResponse]] = js.native
  def getEpisodes(episodeIds: js.Array[String], options: MarketOptions): js.Promise[Response[MultipleEpisodesResponse]] = js.native
  /**
    * Look up several episodes.
    * @param episodeIds The IDs of the episodes.
    * @param options The possible options, currently only market.
    * @param callback Optional callback method to be called instead of the promise.
    * @example getEpisodes(['0oSGxfWSnnOXhD2fKuz2Gy', '3dBVyJ7JuOMt4GE9607Qin']).then(...)
    * @returns A promise that if successful, returns an object containing information
    *          about the episodes. Not returned if a callback is given.
    */
  def getEpisodes(episodeIds: js.Array[String], options: MarketOptions, callback: Callback[MultipleEpisodesResponse]): Unit = js.native
  
  def getFeaturedPlaylists(): js.Promise[Response[ListOfFeaturedPlaylistsResponse]] = js.native
  def getFeaturedPlaylists(options: GetFeaturedPlaylistsOptions): js.Promise[Response[ListOfFeaturedPlaylistsResponse]] = js.native
  /**
    * Retrieve featured playlists
    * @param options Options, being country, locale, timestamp, limit, offset.
    * @param callback Optional callback method to be called instead of the promise.
    * @returns A promise that if successful, resolves to an object containing a paging object which contains
    * featured playlists. Not returned if a callback is given.
    */
  def getFeaturedPlaylists(options: GetFeaturedPlaylistsOptions, callback: Callback[ListOfFeaturedPlaylistsResponse]): Unit = js.native
  
  def getFollowedArtists(): js.Promise[Response[UsersFollowedArtistsResponse]] = js.native
  def getFollowedArtists(options: AfterOptions[String]): js.Promise[Response[UsersFollowedArtistsResponse]] = js.native
  /**
    * Get the current user's followed artists.
    * @param options Options, being after and limit.
    * @param callback Optional callback method to be called instead of the promise.
    * @returns A promise that if successful, resolves to an object containing a paging object which contains
    * album objects. Not returned if a callback is given.
    */
  def getFollowedArtists(options: AfterOptions[String], callback: Callback[UsersFollowedArtistsResponse]): Unit = js.native
  
  def getMe(): js.Promise[Response[CurrentUsersProfileResponse]] = js.native
  /**
    * Get information about the user that has signed in (the current user).
    * @param callback Optional callback method to be called instead of the promise.
    * @example getMe().then(...)
    * @returns A promise that if successful, resolves to an object
    *          containing information about the user. The amount of information
    *          depends on the permissions given by the user. If the promise is
    *          rejected, it contains an error object. Not returned if a callback is given.
    */
  def getMe(callback: Callback[CurrentUsersProfileResponse]): Unit = js.native
  
  def getMyCurrentPlaybackState(): js.Promise[Response[CurrentPlaybackResponse]] = js.native
  def getMyCurrentPlaybackState(options: MarketOptions): js.Promise[Response[CurrentPlaybackResponse]] = js.native
  /**
    * Get Information About The User's Current Playback State
    * @param options Options, being market.
    * @param callback Optional callback method to be called instead of the promise.
    * @returns A promise that if successful, resolves into a paging object of tracks,
    *          otherwise an error. Not returned if a callback is given.
    */
  def getMyCurrentPlaybackState(options: MarketOptions, callback: Callback[CurrentPlaybackResponse]): Unit = js.native
  
  def getMyCurrentPlayingTrack(): js.Promise[Response[CurrentlyPlayingResponse]] = js.native
  def getMyCurrentPlayingTrack(options: MarketOptions): js.Promise[Response[CurrentlyPlayingResponse]] = js.native
  /**
    * Get the Current User's Currently Playing Track.
    * @param options Options, being market.
    * @param callback Optional callback method to be called instead of the promise.
    * @returns A promise that if successful, resolves into a paging object of tracks,
    *          otherwise an error. Not returned if a callback is given.
    */
  def getMyCurrentPlayingTrack(options: MarketOptions, callback: Callback[CurrentlyPlayingResponse]): Unit = js.native
  
  def getMyDevices(): js.Promise[Response[UserDevicesResponse]] = js.native
  /**
    * Get the Current User's Connect Devices
    * @param callback Optional callback method to be called instead of the promise.
    * @returns A promise that if successful, resolves into a paging object of tracks,
    *          otherwise an error. Not returned if a callback is given.
    */
  def getMyDevices(callback: Callback[UserDevicesResponse]): Unit = js.native
  
  def getMyRecentlyPlayedTracks(): js.Promise[Response[UsersRecentlyPlayedTracksResponse]] = js.native
  def getMyRecentlyPlayedTracks(options: AfterOptions[Double]): js.Promise[Response[UsersRecentlyPlayedTracksResponse]] = js.native
  def getMyRecentlyPlayedTracks(options: AfterOptions[Double], callback: Callback[UsersRecentlyPlayedTracksResponse]): Unit = js.native
  def getMyRecentlyPlayedTracks(options: BeforeOptions): js.Promise[Response[UsersRecentlyPlayedTracksResponse]] = js.native
  /**
    * Get the Current User's Recently Played Tracks
    * @param options Options, being type, after, limit, before.
    * @param callback Optional callback method to be called instead of the promise.
    * @returns A promise that if successful, resolves into a paging object of play history objects,
    *          otherwise an error. Not returned if a callback is given. Note that the response will be empty
    *          in case the user has enabled private session.
    */
  def getMyRecentlyPlayedTracks(options: BeforeOptions, callback: Callback[UsersRecentlyPlayedTracksResponse]): Unit = js.native
  
  def getMySavedAlbums(): js.Promise[Response[UsersSavedAlbumsResponse]] = js.native
  def getMySavedAlbums(options: PaginationMarketOptions): js.Promise[Response[UsersSavedAlbumsResponse]] = js.native
  /**
    * Retrieve the albums that are saved to the authenticated users Your Music library.
    * @param options Options, being market, limit, and/or offset.
    * @param callback Optional callback method to be called instead of the promise.
    * @returns A promise that if successful, resolves to an object containing a paging object which in turn contains
    *          playlist album objects. Not returned if a callback is given.
    */
  def getMySavedAlbums(options: PaginationMarketOptions, callback: Callback[UsersSavedAlbumsResponse]): Unit = js.native
  
  def getMySavedShows(): js.Promise[Response[UsersSavedShowsResponse]] = js.native
  def getMySavedShows(options: PaginationMarketOptions): js.Promise[Response[UsersSavedShowsResponse]] = js.native
  /**
    * Retrieve the shows that are saved to the authenticated users Your Music library.
    * @param options Options, being market, limit, and/or offset.
    * @param callback Optional callback method to be called instead of the promise.
    * @returns A promise that if successful, resolves to an object containing a paging object which in turn contains
    *          playlist show objects. Not returned if a callback is given.
    */
  def getMySavedShows(options: PaginationMarketOptions, callback: Callback[UsersSavedShowsResponse]): Unit = js.native
  
  def getMySavedTracks(): js.Promise[Response[UsersSavedTracksResponse]] = js.native
  def getMySavedTracks(options: PaginationMarketOptions): js.Promise[Response[UsersSavedTracksResponse]] = js.native
  /**
    * Retrieve the tracks that are saved to the authenticated users Your Music library.
    * @param options Options, being market, limit, and/or offset.
    * @param callback Optional callback method to be called instead of the promise.
    * @returns A promise that if successful, resolves to an object containing a paging object which in turn contains
    *          playlist track objects. Not returned if a callback is given.
    */
  def getMySavedTracks(options: PaginationMarketOptions, callback: Callback[UsersSavedTracksResponse]): Unit = js.native
  
  def getMyTopArtists(): js.Promise[Response[UsersTopArtistsResponse]] = js.native
  def getMyTopArtists(options: GetTopOptions): js.Promise[Response[UsersTopArtistsResponse]] = js.native
  /**
    * Get the current user's top artists based on calculated affinity.
    * @param options Options, being time_range, limit, offset.
    * @param callback Optional callback method to be called instead of the promise.
    * @returns A promise that if successful, resolves into a paging object of artists,
    *          otherwise an error. Not returned if a callback is given.
    */
  def getMyTopArtists(options: GetTopOptions, callback: Callback[UsersTopArtistsResponse]): Unit = js.native
  
  def getMyTopTracks(): js.Promise[Response[UsersTopTracksResponse]] = js.native
  def getMyTopTracks(options: GetTopOptions): js.Promise[Response[UsersTopTracksResponse]] = js.native
  /**
    * Get the current user's top tracks based on calculated affinity.
    * @param options Options, being time_range, limit, offset.
    * @param callback Optional callback method to be called instead of the promise.
    * @returns A promise that if successful, resolves into a paging object of tracks,
    *          otherwise an error. Not returned if a callback is given.
    */
  def getMyTopTracks(options: GetTopOptions, callback: Callback[UsersTopTracksResponse]): Unit = js.native
  
  def getNewReleases(): js.Promise[Response[ListOfNewReleasesResponse]] = js.native
  def getNewReleases(options: PaginationCountryOptions): js.Promise[Response[ListOfNewReleasesResponse]] = js.native
  /**
    * Retrieve new releases
    * @param options Options, being country, limit and/or offset.
    * @param callback Optional callback method to be called instead of the promise.
    * @returns A promise that if successful, resolves to an object containing a paging object which contains
    * album objects. Not returned if a callback is given.
    */
  def getNewReleases(options: PaginationCountryOptions, callback: Callback[ListOfNewReleasesResponse]): Unit = js.native
  
  def getPlaylist(playlistId: String): js.Promise[Response[SinglePlaylistResponse]] = js.native
  def getPlaylist(playlistId: String, options: GetPlaylistOptions): js.Promise[Response[SinglePlaylistResponse]] = js.native
  /**
    * Get a playlist.
    * @param playlistId The playlist's ID.
    * @param options The options supplied to this request.
    * @param callback Optional callback method to be called instead of the promise.
    * @example getPlaylist('3EsfV6XzCHU8SPNdbnFogK').then(...)
    * @returns A promise that if successful, resolves to an object containing
    *          the playlist. If rejected, it contains an error object. Not returned if a callback is given.
    */
  def getPlaylist(playlistId: String, options: GetPlaylistOptions, callback: Callback[SinglePlaylistResponse]): Unit = js.native
  
  def getPlaylistTracks(playlistId: String): js.Promise[Response[PlaylistTrackResponse]] = js.native
  def getPlaylistTracks(playlistId: String, options: GetPlaylistTracksOptions): js.Promise[Response[PlaylistTrackResponse]] = js.native
  /**
    * Get tracks in a playlist.
    * @param playlistId The playlist's ID.
    * @param options Optional options, such as fields.
    * @param callback Optional callback method to be called instead of the promise.
    * @example getPlaylistTracks('3ktAYNcRHpazJ9qecm3ptn').then(...)
    * @returns A promise that if successful, resolves to an object that containing
    * the tracks in the playlist. If rejected, it contains an error object. Not returned if a callback is given.
    */
  def getPlaylistTracks(playlistId: String, options: GetPlaylistTracksOptions, callback: Callback[PlaylistTrackResponse]): Unit = js.native
  
  def getPlaylistsForCategory(categoryId: String): js.Promise[Response[CategoryPlaylistsReponse]] = js.native
  def getPlaylistsForCategory(categoryId: String, options: PaginationCountryOptions): js.Promise[Response[CategoryPlaylistsReponse]] = js.native
  /**
    * Retrieve playlists for a category.
    * @param categoryId The id of the category to retrieve playlists for.
    * @param options Options, being country, limit, offset.
    * @param callback Optional callback method to be called instead of the promise.
    * @returns A promise that if successful, resolves to a paging object containing simple playlists.
    * Not returned if a callback is given.
    */
  def getPlaylistsForCategory(
    categoryId: String,
    options: PaginationCountryOptions,
    callback: Callback[CategoryPlaylistsReponse]
  ): Unit = js.native
  
  def getRecommendations(): js.Promise[Response[RecommendationsFromSeedsResponse]] = js.native
  def getRecommendations(options: GetRecommendationsOptions): js.Promise[Response[RecommendationsFromSeedsResponse]] = js.native
  /**
    * Create a playlist-style listening experience based on seed artists, tracks and genres.
    * @param options The options supplied to this request.
    * @param callback Optional callback method to be called instead of the promise.
    * @example getRecommendations({ min_energy: 0.4, seed_artists: ['6mfK6Q2tzLMEchAr0e9Uzu', '4DYFVNKZ1uixa6SQTvzQwJ'], min_popularity: 50 }).then(...)
    * @returns A promise that if successful, resolves to an object containing
    *          a list of tracks and a list of seeds. If rejected, it contains an error object. Not returned if a callback is given.
    */
  def getRecommendations(options: GetRecommendationsOptions, callback: Callback[RecommendationsFromSeedsResponse]): Unit = js.native
  
  def getRedirectURI(): js.UndefOr[String] = js.native
  
  def getRefreshToken(): js.UndefOr[String] = js.native
  
  def getShow(showId: String): js.Promise[Response[SingleShowResponse]] = js.native
  def getShow(showId: String, options: MarketOptions): js.Promise[Response[SingleShowResponse]] = js.native
  /**
    * Get a show.
    * @param showId The show's ID.
    * @param options The possible options, currently only market.
    * @param callback Optional callback method to be called instead of the promise.
    * @example getShow('3Qm86XLflmIXVm1wcwkgDK').then(...)
    * @returns A promise that if successful, returns an object containing information
    *          about the show. Not returned if a callback is given.
    */
  def getShow(showId: String, options: MarketOptions, callback: Callback[SingleShowResponse]): Unit = js.native
  
  def getShowEpisodes(showId: String): js.Promise[Response[ShowEpisodesResponse]] = js.native
  def getShowEpisodes(showId: String, options: PaginationMarketOptions): js.Promise[Response[ShowEpisodesResponse]] = js.native
  /**
    * Get the episodes of an show.
    * @param showId the show's ID.
    * @param options The possible options, being limit, offset, and market.
    * @param callback Optional callback method to be called instead of the promise.
    * @example getShowEpisodes('41MnTivkwTO3UUJ8DrqEJJ', { limit : 5, offset : 1 }).then(...)
    * @returns A promise that if successful, returns an object containing the
    *                    episodes in the album. The result is paginated. If the promise is rejected.
    *                    it contains an error object. Not returned if a callback is given.
    */
  def getShowEpisodes(showId: String, options: PaginationMarketOptions, callback: Callback[ShowEpisodesResponse]): Unit = js.native
  
  def getShows(showIds: js.Array[String]): js.Promise[Response[MultipleShowsResponse]] = js.native
  def getShows(showIds: js.Array[String], options: MarketOptions): js.Promise[Response[MultipleShowsResponse]] = js.native
  /**
    * Look up several shows.
    * @param showIds The IDs of the shows.
    * @param options The possible options, currently only market.
    * @param callback Optional callback method to be called instead of the promise.
    * @example getShows(['0oSGxfWSnnOXhD2fKuz2Gy', '3dBVyJ7JuOMt4GE9607Qin']).then(...)
    * @returns A promise that if successful, returns an object containing information
    *          about the shows. Not returned if a callback is given.
    */
  def getShows(showIds: js.Array[String], options: MarketOptions, callback: Callback[MultipleShowsResponse]): Unit = js.native
  
  def getTrack(trackId: String): js.Promise[Response[SingleTrackResponse]] = js.native
  def getTrack(trackId: String, options: MarketOptions): js.Promise[Response[SingleTrackResponse]] = js.native
  /**
    * Look up a track.
    * @param trackId The track's ID.
    * @param options The possible options, currently only market.
    * @param callback Optional callback method to be called instead of the promise.
    * @example getTrack('3Qm86XLflmIXVm1wcwkgDK').then(...)
    * @returns A promise that if successful, returns an object containing information
    *          about the track. Not returned if a callback is given.
    */
  def getTrack(trackId: String, options: MarketOptions, callback: Callback[SingleTrackResponse]): Unit = js.native
  
  def getTracks(trackIds: js.Array[String]): js.Promise[Response[MultipleTracksResponse]] = js.native
  def getTracks(trackIds: js.Array[String], options: MarketOptions): js.Promise[Response[MultipleTracksResponse]] = js.native
  /**
    * Look up several tracks.
    * @param trackIds The IDs of the tracks.
    * @param options The possible options, currently only market.
    * @param callback Optional callback method to be called instead of the promise.
    * @example getTracks(['3AyuigFWbuirWHvidbMz8O', '6bP4GyrKNbcKPMDqWJqpxI']).then(...)
    * @returns A promise that if successful, returns an object containing information
    *          about the tracks. Not returned if a callback is given.
    */
  def getTracks(trackIds: js.Array[String], options: MarketOptions, callback: Callback[MultipleTracksResponse]): Unit = js.native
  
  def getUser(userId: String): js.Promise[Response[UserProfileResponse]] = js.native
  /**
    * Get information about a user.
    * @param userId The user ID.
    * @param callback Optional callback method to be called instead of the promise.
    * @example getUser('thelinmichael').then(...)
    * @returns A promise that if successful, resolves to an object
    *          containing information about the user. If the promise is
    *          rejected, it contains an error object. Not returned if a callback is given.
    */
  def getUser(userId: String, callback: Callback[UserProfileResponse]): Unit = js.native
  
  def getUserPlaylists(): js.Promise[Response[ListOfUsersPlaylistsResponse]] = js.native
  def getUserPlaylists(options: PaginationOptions): js.Promise[Response[ListOfUsersPlaylistsResponse]] = js.native
  def getUserPlaylists(options: PaginationOptions, callback: Callback[ListOfUsersPlaylistsResponse]): Unit = js.native
  def getUserPlaylists(userId: String): js.Promise[Response[ListOfUsersPlaylistsResponse]] = js.native
  def getUserPlaylists(userId: String, options: PaginationOptions): js.Promise[Response[ListOfUsersPlaylistsResponse]] = js.native
  /**
    * Get a user's playlists.
    * @param userId An optional id of the user. If you know the Spotify URI it is easy
    * to find the id (e.g. spotify:user:<here_is_the_id>). If not provided, the id of the user that granted
    * the permissions will be used.
    * @param options The options supplied to this request.
    * @param callback Optional callback method to be called instead of the promise.
    * @example getUserPlaylists('thelinmichael').then(...)
    * @returns A promise that if successful, resolves to an object containing
    *          a list of playlists. If rejected, it contains an error object. Not returned if a callback is given.
    */
  def getUserPlaylists(userId: String, options: PaginationOptions, callback: Callback[ListOfUsersPlaylistsResponse]): Unit = js.native
  
  def isFollowingArtists(artistIds: js.Array[String]): js.Promise[Response[UserFollowsUsersOrArtistsResponse]] = js.native
  /**
    * Check to see if the current user is following one or more artists.
    * @param artistIds The IDs of the artists to check if are followed by the current user.
    * @param callback Optional callback method to be called instead of the promise.
    * @example isFollowingArtists(['0LcJLqbBmaGUft1e9Mm8HV', '3gqv1kgivAc92KnUm4elKv']).then(...)
    * @returns A promise that if successful, resolves into an array of booleans. The order
    *          of the returned array's elements correspond to the artists IDs in the request.
    *          The boolean value of true indicates that the user is following that artist, otherwise is not.
    *          Not returned if a callback is given.
    */
  def isFollowingArtists(artistIds: js.Array[String], callback: Callback[UserFollowsUsersOrArtistsResponse]): Unit = js.native
  
  def isFollowingUsers(userIds: js.Array[String]): js.Promise[Response[UserFollowsUsersOrArtistsResponse]] = js.native
  /**
    * Check to see if the current user is following one or more other Spotify users.
    * @param userIds The IDs of the users to check if are followed by the current user.
    * @param callback Optional callback method to be called instead of the promise.
    * @example isFollowingUsers(['thelinmichael', 'wizzler']).then(...)
    * @returns A promise that if successful, resolves into an array of booleans. The order
    *          of the returned array's elements correspond to the users IDs in the request.
    *          The boolean value of true indicates that the user is following that user, otherwise is not.
    *          Not returned if a callback is given.
    */
  def isFollowingUsers(userIds: js.Array[String], callback: Callback[UserFollowsUsersOrArtistsResponse]): Unit = js.native
  
  def pause(): js.Promise[Response[Unit]] = js.native
  def pause(options: DeviceOptions): js.Promise[Response[Unit]] = js.native
  /**
    * Pauses the Current User's Playback
    * @param options Options, being device_id. If left empty will target the user's currently active device.
    * @param callback Optional callback method to be called instead of the promise.
    * @example pause().then(...)
    * @returns A promise that if successful, resolves into an empty response,
    *          otherwise an error. Not returned if a callback is given.
    */
  def pause(options: DeviceOptions, callback: Callback[Unit]): Unit = js.native
  
  def play(): js.Promise[Response[Unit]] = js.native
  def play(options: PlayOptions): js.Promise[Response[Unit]] = js.native
  /**
    * Starts or Resumes the Current User's Playback
    * @param options Options, being device_id, context_uri, offset, uris, position_ms.
    * @param callback Optional callback method to be called instead of the promise.
    * @example play({context_uri: 'spotify:album:5ht7ItJgpBH7W6vJ5BqpPr'}).then(...)
    * @returns A promise that if successful, resolves into an empty response,
    *          otherwise an error. Not returned if a callback is given.
    */
  def play(options: PlayOptions, callback: Callback[Unit]): Unit = js.native
  
  def refreshAccessToken(): js.Promise[Response[RefreshAccessTokenResponse]] = js.native
  /**
    * Refresh the access token given that it hasn't expired.
    * Requires that client ID, client secret and refresh token has been set previous to the call.
    * @param callback Optional callback method to be called instead of the promise.
    * @returns A promise that if successful, resolves to an object containing the
    *          access token, time to expiration and token type. If rejected, it contains an error object.
    *          Not returned if a callback is given.
    */
  def refreshAccessToken(callback: Callback[RefreshAccessTokenResponse]): Unit = js.native
  
  def removeFromMySavedAlbums(albumIds: js.Array[String]): js.Promise[Response[RemoveAlbumsForUserResponse]] = js.native
  /**
    * Remove an album from the authenticated user's Your Music library.
    * @param albumIds The album IDs
    * @param callback Optional callback method to be called instead of the promise.
    * @returns A promise that if successful returns null, otherwise an error.
    * Not returned if a callback is given.
    */
  def removeFromMySavedAlbums(albumIds: js.Array[String], callback: Callback[RemoveAlbumsForUserResponse]): Unit = js.native
  
  def removeFromMySavedShows(showIds: js.Array[String]): js.Promise[Response[Unit]] = js.native
  /**
    * Remove an show from the authenticated user's Your Music library.
    * @param showIds The show IDs
    * @param callback Optional callback method to be called instead of the promise.
    * @returns A promise that if successful returns null, otherwise an error.
    * Not returned if a callback is given.
    */
  def removeFromMySavedShows(showIds: js.Array[String], callback: Callback[Unit]): Unit = js.native
  
  def removeFromMySavedTracks(trackIds: js.Array[String]): js.Promise[Response[RemoveUsersSavedTracksResponse]] = js.native
  /**
    * Remove a track from the authenticated user's Your Music library.
    * @param trackIds The track IDs
    * @param callback Optional callback method to be called instead of the promise.
    * @returns A promise that if successful returns null, otherwise an error.
    * Not returned if a callback is given.
    */
  def removeFromMySavedTracks(trackIds: js.Array[String], callback: Callback[RemoveUsersSavedTracksResponse]): Unit = js.native
  
  def removeTracksFromPlaylist(playlistId: String, tracks: js.Array[Track]): js.Promise[Response[RemoveTracksFromPlaylistResponse]] = js.native
  def removeTracksFromPlaylist(playlistId: String, tracks: js.Array[Track], options: SnapshotOptions): js.Promise[Response[RemoveTracksFromPlaylistResponse]] = js.native
  /**
    * Remove tracks from a playlist.
    * @param playlistId The playlist's ID
    * @param tracks An array of objects containing a property called uri with the track URI (String), and
    * an optional property called positions (int[]), e.g. { uri : "spotify:track:491rM2JN8KvmV6p0oDDuJT", positions : [0, 15] }
    * @param options Options, snapshot_id being the only one.
    * @param callback Optional callback method to be called instead of the promise.
    * @returns A promise that if successful returns an object containing a snapshot_id. If rejected,
    * it contains an error object. Not returned if a callback is given.
    */
  def removeTracksFromPlaylist(
    playlistId: String,
    tracks: js.Array[Track],
    options: SnapshotOptions,
    callback: Callback[RemoveTracksFromPlaylistResponse]
  ): Unit = js.native
  
  def removeTracksFromPlaylistByPosition(playlistId: String, positions: js.Array[Double], snapshotId: String): js.Promise[Response[RemoveTracksFromPlaylistResponse]] = js.native
  /**
    * Remove tracks from a playlist by position instead of specifying the tracks' URIs.
    * @param playlistId The playlist's ID
    * @param positions The positions of the tracks in the playlist that should be removed
    * @param snapshot_id The snapshot ID, or version, of the playlist. Required
    * @param callback Optional callback method to be called instead of the promise.
    * @returns A promise that if successful returns an object containing a snapshot_id. If rejected,
    * it contains an error object. Not returned if a callback is given.
    */
  def removeTracksFromPlaylistByPosition(
    playlistId: String,
    positions: js.Array[Double],
    snapshotId: String,
    callback: Callback[RemoveTracksFromPlaylistResponse]
  ): Unit = js.native
  
  def reorderTracksInPlaylist(playlistId: String, rangeStart: Double, insertBefore: Double): js.Promise[Response[ReorderPlaylistTracksResponse]] = js.native
  def reorderTracksInPlaylist(
    playlistId: String,
    rangeStart: Double,
    insertBefore: Double,
    options: ReorderPlaylistTracksOptions
  ): js.Promise[Response[ReorderPlaylistTracksResponse]] = js.native
  /**
    * Reorder tracks in a playlist.
    * @param playlistId The playlist's ID
    * @param rangeStart The position of the first track to be reordered.
    * @param insertBefore The position where the tracks should be inserted.
    * @param options Optional parameters, i.e. range_length and snapshot_id.
    * @param callback Optional callback method to be called instead of the promise.
    * @returns A promise that if successful returns an object containing a snapshot_id. If rejected,
    * it contains an error object. Not returned if a callback is given.
    */
  def reorderTracksInPlaylist(
    playlistId: String,
    rangeStart: Double,
    insertBefore: Double,
    options: ReorderPlaylistTracksOptions,
    callback: Callback[ReorderPlaylistTracksResponse]
  ): Unit = js.native
  
  def replaceTracksInPlaylist(playlistId: String, uris: js.Array[String]): js.Promise[Response[ReplacePlaylistTracksResponse]] = js.native
  /**
    * Replace tracks in a playlist.
    * @param playlistId The playlist's ID
    * @param uris An array of track URIs (strings)
    * @param callback Optional callback method to be called instead of the promise.
    * @returns A promise that if successful returns an empty object. If rejected,
    * it contains an error object. Not returned if a callback is given.
    */
  def replaceTracksInPlaylist(playlistId: String, uris: js.Array[String], callback: Callback[ReplacePlaylistTracksResponse]): Unit = js.native
  
  def resetAccessToken(): Unit = js.native
  
  def resetClientId(): Unit = js.native
  
  def resetClientSecret(): Unit = js.native
  
  def resetCredentials(): Unit = js.native
  
  def resetRedirectURI(): Unit = js.native
  
  def resetRefreshToken(): Unit = js.native
  
  def search(query: String, types: js.Array[SearchType]): js.Promise[Response[SearchResponse]] = js.native
  def search(query: String, types: js.Array[SearchType], options: SearchOptions): js.Promise[Response[SearchResponse]] = js.native
  /**
    * Search for music entities of certain types.
    * @param query The search query.
    * @param types An array of item types to search across.
    * Valid types are: 'album', 'artist', 'playlist', 'track', 'show', and 'episode'.
    * @param options The possible options, e.g. limit, offset.
    * @param callback Optional callback method to be called instead of the promise.
    * @example search('Abba', ['track', 'playlist'], { limit : 5, offset : 1 }).then(...)
    * @returns A promise that if successful, returns an object containing the
    *          search results. The result is paginated. If the promise is rejected,
    *          it contains an error object. Not returned if a callback is given.
    */
  def search(
    query: String,
    types: js.Array[SearchType],
    options: SearchOptions,
    callback: Callback[SearchResponse]
  ): Unit = js.native
  
  def searchAlbums(query: String): js.Promise[Response[SearchResponse]] = js.native
  def searchAlbums(query: String, options: SearchOptions): js.Promise[Response[SearchResponse]] = js.native
  /**
    * Search for an album.
    * @param query The search query.
    * @param options The possible options, e.g. limit, offset.
    * @param callback Optional callback method to be called instead of the promise.
    * @example searchAlbums('Space Oddity', { limit : 5, offset : 1 }).then(...)
    * @returns A promise that if successful, returns an object containing the
    *          search results. The result is paginated. If the promise is rejected,
    *          it contains an error object. Not returned if a callback is given.
    */
  def searchAlbums(query: String, options: SearchOptions, callback: Callback[SearchResponse]): Unit = js.native
  
  def searchArtists(query: String): js.Promise[Response[SearchResponse]] = js.native
  def searchArtists(query: String, options: SearchOptions): js.Promise[Response[SearchResponse]] = js.native
  /**
    * Search for an artist.
    * @param query The search query.
    * @param options The possible options, e.g. limit, offset.
    * @param callback Optional callback method to be called instead of the promise.
    * @example searchArtists('David Bowie', { limit : 5, offset : 1 }).then(...)
    * @returns A promise that if successful, returns an object containing the
    *          search results. The result is paginated. If the promise is rejected,
    *          it contains an error object. Not returned if a callback is given.
    */
  def searchArtists(query: String, options: SearchOptions, callback: Callback[SearchResponse]): Unit = js.native
  
  def searchEpisodes(query: String): js.Promise[Response[SearchResponse]] = js.native
  def searchEpisodes(query: String, options: PaginationOptions): js.Promise[Response[SearchResponse]] = js.native
  /**
    * Search for an episode.
    * @param query The search query.
    * @param options The possible options, e.g. limit, offset.
    * @param callback Optional callback method to be called instead of the promise.
    * @example searchEpisodes('Space Oddity', { limit : 5, offset : 1 }).then(...)
    * @returns A promise that if successful, returns an object containing the
    *          search results. The result is paginated. If the promise is rejected,
    *          it contains an error object. Not returned if a callback is given.
    */
  def searchEpisodes(query: String, options: PaginationOptions, callback: Callback[SearchResponse]): Unit = js.native
  
  def searchPlaylists(query: String): js.Promise[Response[SearchResponse]] = js.native
  def searchPlaylists(query: String, options: SearchOptions): js.Promise[Response[SearchResponse]] = js.native
  /**
    * Search for playlists.
    * @param query The search query.
    * @param options The possible options.
    * @param callback Optional callback method to be called instead of the promise.
    * @example searchPlaylists('workout', { limit : 1, offset : 0 }).then(...)
    * @returns A promise that if successful, returns an object containing the
    *          search results. The result is paginated. If the promise is rejected,
    *          it contains an error object. Not returned if a callback is given.
    */
  def searchPlaylists(query: String, options: SearchOptions, callback: Callback[SearchResponse]): Unit = js.native
  
  def searchShows(query: String): js.Promise[Response[SearchResponse]] = js.native
  def searchShows(query: String, options: PaginationOptions): js.Promise[Response[SearchResponse]] = js.native
  /**
    * Search for a show.
    * @param query The search query.
    * @param options The possible options, e.g. limit, offset.
    * @param callback Optional callback method to be called instead of the promise.
    * @example searchShows('Space Oddity', { limit : 5, offset : 1 }).then(...)
    * @returns A promise that if successful, returns an object containing the
    *          search results. The result is paginated. If the promise is rejected,
    *          it contains an error object. Not returned if a callback is given.
    */
  def searchShows(query: String, options: PaginationOptions, callback: Callback[SearchResponse]): Unit = js.native
  
  def searchTracks(query: String): js.Promise[Response[SearchResponse]] = js.native
  def searchTracks(query: String, options: SearchOptions): js.Promise[Response[SearchResponse]] = js.native
  /**
    * Search for a track.
    * @param query The search query.
    * @param options The possible options, e.g. limit, offset.
    * @param callback Optional callback method to be called instead of the promise.
    * @example searchTracks('Mr. Brightside', { limit : 3, offset : 2 }).then(...)
    * @returns A promise that if successful, returns an object containing the
    *          search results. The result is paginated. If the promise is rejected,
    *          it contains an error object. Not returned if a callback is given.
    */
  def searchTracks(query: String, options: SearchOptions, callback: Callback[SearchResponse]): Unit = js.native
  
  def seek(positionMs: Double): js.Promise[Response[Unit]] = js.native
  def seek(positionMs: Double, options: DeviceOptions): js.Promise[Response[Unit]] = js.native
  /**
    * Seeks to the given position in the user’s currently playing track.
    *
    * @param positionMs The position in milliseconds to seek to. Must be a positive number.
    * @param options Options, being device_id. If left empty will target the user's currently active device.
    * @param callback An optional callback that receives 2 parameters. The first
    * one is the error object (null if no error), and the second is the value if the request succeeded.
    * @returns Null if a callback is provided, a Promise otherwise
    */
  def seek(positionMs: Double, options: DeviceOptions, callback: Callback[Unit]): Unit = js.native
  
  def setAccessToken(accessToken: String): Unit = js.native
  
  def setClientId(clientId: String): Unit = js.native
  
  def setClientSecret(clientSecret: String): Unit = js.native
  
  def setCredentials(credentials: Credentials): Unit = js.native
  
  def setRedirectURI(redirectUri: String): Unit = js.native
  
  def setRefreshToken(refreshToken: String): Unit = js.native
  
  def setRepeat(state: RepeatState): js.Promise[Response[Unit]] = js.native
  def setRepeat(state: RepeatState, options: DeviceOptions): js.Promise[Response[Unit]] = js.native
  /**
    * Set Repeat Mode On The Current User's Playback
    * @param state State (track, context, or off)
    * @param options Options, being device_id. If left empty will target the user's currently active device.
    * @param callback Optional callback method to be called instead of the promise.
    * @example setRepeat('context', {}).then(...)
    * @returns A promise that if successful, resolves into an empty response,
    *          otherwise an error. Not returned if a callback is given.
    */
  def setRepeat(state: RepeatState, options: DeviceOptions, callback: Callback[Unit]): Unit = js.native
  
  def setShuffle(state: Boolean): js.Promise[Response[Unit]] = js.native
  def setShuffle(state: Boolean, options: DeviceOptions): js.Promise[Response[Unit]] = js.native
  /**
    * Set Shuffle Mode On The Current User's Playback
    * @param state State
    * @param options Options, being device_id. If left empty will target the user's currently active device.
    * @param callback Optional callback method to be called instead of the promise.
    * @example setShuffle('false').then(...)
    * @returns A promise that if successful, resolves into an empty response,
    *          otherwise an error. Not returned if a callback is given.
    */
  def setShuffle(state: Boolean, options: DeviceOptions, callback: Callback[Unit]): Unit = js.native
  
  def setVolume(volumePercent: Double): js.Promise[Response[Unit]] = js.native
  def setVolume(volumePercent: Double, options: DeviceOptions): js.Promise[Response[Unit]] = js.native
  /**
    * Set the volume for the user’s current playback device.
    * @param volumePercent The volume to set. Must be a value from 0 to 100.
    * @param options Options, being device_id. If left empty will target the user's currently active device.
    * @param callback An optional callback that receives 2 parameters. The first
    * one is the error object (null if no error), and the second is the value if the request succeeded.
    * @returns A promise that if successful, resolves into an empty response,
    *          otherwise an error. Not returned if a callback is given.
    */
  def setVolume(volumePercent: Double, options: DeviceOptions, callback: Callback[Unit]): Unit = js.native
  
  def skipToNext(): js.Promise[Response[Unit]] = js.native
  def skipToNext(options: DeviceOptions): js.Promise[Response[Unit]] = js.native
  /**
    * Skip the Current User's Playback To Next Track
    * @param options Options, being device_id. If left empty will target the user's currently active device.
    * @param callback Optional callback method to be called instead of the promise.
    * @example skipToNext().then(...)
    * @returns A promise that if successful, resolves into an empty response,
    *          otherwise an error. Not returned if a callback is given.
    */
  def skipToNext(options: DeviceOptions, callback: Callback[Unit]): Unit = js.native
  
  def skipToPrevious(): js.Promise[Response[Unit]] = js.native
  def skipToPrevious(options: DeviceOptions): js.Promise[Response[Unit]] = js.native
  /**
    * Skip the Current User's Playback To Previous Track
    * @param options Options, being device_id. If left empty will target the user's currently active device.
    * @param callback Optional callback method to be called instead of the promise.
    * @example skipToPrevious().then(...)
    * @returns A promise that if successful, resolves into an empty response,
    *          otherwise an error. Not returned if a callback is given.
    */
  def skipToPrevious(options: DeviceOptions, callback: Callback[Unit]): Unit = js.native
  
  def transferMyPlayback(deviceIds: js.Array[String]): js.Promise[Response[Unit]] = js.native
  def transferMyPlayback(deviceIds: js.Array[String], options: TransferPlaybackOptions): js.Promise[Response[Unit]] = js.native
  /**
    * Transfer a User's Playback
    * @param deviceIds An _array_ containing a device ID on which playback should be started/transferred.
    * (NOTE: The API is currently only supporting a single device ID.)
    * @param options Options, the only one being 'play'.
    * @param callback Optional callback method to be called instead of the promise.
    * @returns A promise that if successful, resolves into an empty response,
    *          otherwise an error. Not returned if a callback is given.
    */
  def transferMyPlayback(deviceIds: js.Array[String], options: TransferPlaybackOptions, callback: Callback[Unit]): Unit = js.native
  
  def unfollowArtists(artistIds: js.Array[String]): js.Promise[Response[Unit]] = js.native
  /**
    * Remove the current user as a follower of one or more artists.
    * @param artistIds The IDs of the artists to be unfollowed.
    * @param callback Optional callback method to be called instead of the promise.
    * @example unfollowArtists(['0LcJLqbBmaGUft1e9Mm8HV', '3gqv1kgivAc92KnUm4elKv']).then(...)
    * @returns A promise that if successful, simply resolves to an empty object. If rejected,
    *          it contains an error object. Not returned if a callback is given.
    */
  def unfollowArtists(artistIds: js.Array[String], callback: Callback[Unit]): Unit = js.native
  
  def unfollowPlaylist(playlistId: String): js.Promise[Response[UnfollowPlaylistReponse]] = js.native
  /**
    * Unfollow a playlist.
    * @param playlistId The playlist's ID
    * @param options The possible options, currently only public.
    * @param callback Optional callback method to be called instead of the promise.
    * @returns A promise that if successful, simply resolves to an empty object. If rejected,
    * it contains an error object. Not returned if a callback is given.
    */
  def unfollowPlaylist(playlistId: String, callback: Callback[UnfollowPlaylistReponse]): Unit = js.native
  
  def unfollowUsers(userIds: js.Array[String]): js.Promise[Response[Unit]] = js.native
  /**
    * Remove the current user as a follower of one or more other Spotify users.
    * @param userIds The IDs of the users to be unfollowed.
    * @param callback Optional callback method to be called instead of the promise.
    * @example unfollowUsers(['thelinmichael', 'wizzler']).then(...)
    * @returns A promise that if successful, simply resolves to an empty object. If rejected,
    *          it contains an error object. Not returned if a callback is given.
    */
  def unfollowUsers(userIds: js.Array[String], callback: Callback[Unit]): Unit = js.native
  
  def uploadCustomPlaylistCoverImage(playlistId: String, base64URI: String): js.Promise[Response[UploadCustomPlaylistCoverImageReponse]] = js.native
  /**
    * Replace the image used to represent a specific playlist.
    * @param playlistId The playlist's ID
    * @param base64URI Base64 encoded JPEG image data, maximum payload size is 256 KB
    * @param callback Optional callback method to be called instead of the promise.
    * @example uploadCustomPlaylistCoverImage('3EsfV6XzCHU8SPNdbnFogK', 'longbase64uri').then(...)
    * @returns A promise that if successful, simply resolves to an empty object. If rejected,
    * it contains an error object. Not returned if a callback is given.
    */
  def uploadCustomPlaylistCoverImage(playlistId: String, base64URI: String, callback: Callback[UploadCustomPlaylistCoverImageReponse]): Unit = js.native
}
