package typingsJapgolly.spotifyApi.SpotifyApi

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


/**
  * Add an item to the end of the user’s current playback queue.
  *
  * POST /v1/me/player/queue
  * https://developer.spotify.com/documentation/web-api/reference/player/add-to-queue/
  */
type AddToQueueResponse = VoidResponse

/**
  * Add Tracks to a Playlist
  *
  * POST /v1/users/{user_id}/playlists/{playlist_id}/tracks
  * https://developer.spotify.com/web-api/add-tracks-to-playlist/
  */
type AddTracksToPlaylistResponse = PlaylistSnapshotResponse

/**
  * Get an Album’s Tracks
  *
  * GET /v1/albums/{id}/tracks
  * https://developer.spotify.com/web-api/get-albums-tracks/
  */
type AlbumTracksResponse = PagingObject[TrackObjectSimplified]

/**
  * Get an Artist’s Albums
  *
  * GET /v1/artists/{id}/albums
  * https://developer.spotify.com/web-api/get-artists-albums/
  */
type ArtistsAlbumsResponse = PagingObject[AlbumObjectSimplified]

/**
  * Get Audio Analysis for a Track
  *
  * GET /v1/audio-analysis/{id}
  * https://developer.spotify.com/web-api/get-audio-analysis/
  *
  * At the time of typing, the Audio Analysis Object is absent from the Object Model, so it is typed as any.
  * Object Model: https://developer.spotify.com/web-api/object-model/
  */
type AudioAnalysisResponse = AudioAnalysisObject

/**
  * Get audio features for a track
  *
  * GET /v1/audio-features/{id}
  * https://developer.spotify.com/web-api/get-audio-features/
  */
type AudioFeaturesResponse = AudioFeaturesObject

/**
  * Get a categorys playlists
  *
  * GET /v1/browse/categories/{id}/playlists
  * https://developer.spotify.com/web-api/get-categorys-playlists/
  * @deprecated Use `CategoryPlaylistsResponse` instead
  */
type CategoryPlaylistsReponse = CategoryPlaylistsResponse

/**
  * Change a Playlist’s Details
  *
  * PUT /v1/users/{user_id}/playlists/{playlist_id}
  * https://developer.spotify.com/web-api/change-playlist-details/
  * @deprecated Use `ChangePlaylistDetailsResponse` instead
  */
type ChangePlaylistDetailsReponse = ChangePlaylistDetailsResponse

/**
  * Change a Playlist’s Details
  *
  * PUT /v1/users/{user_id}/playlists/{playlist_id}
  * https://developer.spotify.com/web-api/change-playlist-details/
  */
type ChangePlaylistDetailsResponse = VoidResponse

/**
  * Check user's saved albums
  *
  * GET /v1/me/albums/contains?ids={ids}
  * https://developer.spotify.com/web-api/check-users-saved-albums/
  */
type CheckUserSavedAlbumsResponse = js.Array[Boolean]

/**
  * Check User's Saved Episodes
  *
  * GET /v1/me/shows/episodes
  * https://developer.spotify.com/documentation/web-api/reference/#/operations/check-users-saved-episodes
  */
type CheckUserSavedEpisodesResponse = js.Array[Boolean]

/**
  * Check User's Saved Shows
  *
  * GET /v1/me/shows/contains
  * https://developer.spotify.com/documentation/web-api/reference/#/operations/check-users-saved-shows
  */
type CheckUserSavedShowsResponse = js.Array[Boolean]

/**
  * Check User’s Saved Tracks
  *
  * GET /v1/me/tracks/contains?ids={ids}
  * https://developer.spotify.com/web-api/check-users-saved-tracks/
  */
type CheckUsersSavedTracksResponse = js.Array[Boolean]

/**
  * Create a Playlist
  *
  * POST /v1/users/{user_id}/playlists
  * https://developer.spotify.com/web-api/create-playlist/
  */
type CreatePlaylistResponse = PlaylistObjectFull

/**
  * Get Current User’s Profile
  *
  * GET /v1/me
  * https://developer.spotify.com/web-api/get-current-users-profile/
  */
type CurrentUsersProfileResponse = UserObjectPrivate

type CurrentlyPlayingResponse = CurrentlyPlayingObject

type EpisodeObjectFull = EpisodeObject

/**
  * Follow artists or users
  *
  * PUT /v1/me/following
  * https://developer.spotify.com/web-api/follow-artists-users/
  */
type FollowArtistsOrUsersResponse = VoidResponse

/**
  * Follow a Playlist
  *
  * PUT /v1/users/{owner_id}/playlists/{playlist_id}/followers
  * https://developer.spotify.com/web-api/follow-playlist/
  * @deprecated Use `FollowPlaylistResponse` instead
  */
type FollowPlaylistReponse = FollowPlaylistResponse

/**
  * Follow a Playlist
  *
  * PUT /v1/users/{owner_id}/playlists/{playlist_id}/followers
  * https://developer.spotify.com/web-api/follow-playlist/
  */
type FollowPlaylistResponse = VoidResponse

/**
  * Get a list of the current user's playlists
  *
  * GET /v1/me/playlists
  * https://developer.spotify.com/web-api/get-list-users-playlists/
  */
type ListOfCurrentUsersPlaylistsResponse = PagingObject[PlaylistObjectSimplified]

/**
  * Get a list of a user's playlists
  *
  * GET /v1/users/{user_id}/playlists
  * https://developer.spotify.com/web-api/get-list-users-playlists/
  */
type ListOfUsersPlaylistsResponse = PagingObject[PlaylistObjectSimplified]

/**
  * Get Playlist Cover Image
  *
  * GET /v1/playlists/playlist_id/image
  * https://developer.spotify.com/documentation/web-api/reference/#/operations/get-playlist-cover
  */
type PlaylistCoverImageResponse = js.Array[ImageObject]

/**
  * Get a playlist's tracks
  *
  * GET /v1/users/{user_id}/playlists/{playlist_id}/tracks
  * https://developer.spotify.com/web-api/get-playlists-tracks/
  */
type PlaylistTrackResponse = PagingObject[PlaylistTrackObject]

/**
  * Get recommendations based on seeds
  *
  * GET /v1/recommendations
  * https://developer.spotify.com/get-recommendations/
  */
type RecommendationsFromSeedsResponse = RecommendationsObject

/**
  * Remove Albums for Current User
  *
  * DELETE /v1/me/albums?ids={ids}
  * https://developer.spotify.com/web-api/remove-albums-user/
  */
type RemoveAlbumsForUserResponse = VoidResponse

/**
  * Remove User's Saved Episodes
  *
  * DELETE /v1/me/episodes
  * https://developer.spotify.com/documentation/web-api/reference/#/operations/remove-episodes-user
  */
type RemoveEpisodesForUserResponse = VoidResponse

/**
  * Remove User's Saved Shows
  *
  * DELETE /v1/me/shows
  * https://developer.spotify.com/documentation/web-api/reference/#/operations/remove-shows-user
  */
type RemoveShowsForUserResponse = VoidResponse

/**
  * Remove Tracks from a Playlist
  *
  * DELETE /v1/users/{user_id}/playlists/{playlist_id}/tracks
  * https://developer.spotify.com/web-api/remove-tracks-playlist/
  */
type RemoveTracksFromPlaylistResponse = PlaylistSnapshotResponse

/**
  * Remove User’s Saved Tracks
  *
  * DELETE /v1/me/tracks?ids={ids}
  * https://developer.spotify.com/web-api/remove-tracks-user/
  */
type RemoveUsersSavedTracksResponse = VoidResponse

/**
  * Reorder a Playlist’s Tracks
  *
  * PUT /v1/users/{user_id}/playlists/{playlist_id}/tracks
  * https://developer.spotify.com/web-api/reorder-playlists-tracks/
  */
type ReorderPlaylistTracksResponse = PlaylistSnapshotResponse

/**
  * Replace a Playlist’s Tracks
  *
  * PUT /v1/users/{user_id}/playlists/{playlist_id}/tracks
  * https://developer.spotify.com/web-api/replace-playlists-tracks/
  */
type ReplacePlaylistTracksResponse = PlaylistSnapshotResponse

/**
  * Save albums for user
  *
  * PUT /v1/me/albums?ids={ids}
  * https://developer.spotify.com/web-api/save-albums-user/
  */
type SaveAlbumsForUserResponse = VoidResponse

/**
  * Save Episodes for Current User
  *
  * PUT /v1/me/episodes
  * https://developer.spotify.com/documentation/web-api/reference/#/operations/save-episodes-user
  */
type SaveEpisodesForUserResponse = VoidResponse

/**
  * Save Shows for Current User
  *
  * PUT /v1/me/shows
  * https://developer.spotify.com/documentation/web-api/reference/#/operations/save-shows-user
  */
type SaveShowsForUserResponse = VoidResponse

/**
  * Save tracks for user
  *
  * PUT /v1/me/tracks?ids={ids}
  * https://developer.spotify.com/web-api/save-tracks-user/
  */
type SaveTracksForUserResponse = VoidResponse

/**
  * Get an Shows’s Episodes
  *
  * GET /v1/shows/{id}/episodes
  * https://developer.spotify.com/documentation/web-api/reference/shows/get-shows-episodes/
  */
type ShowEpisodesResponse = PagingObject[EpisodeObjectSimplified]

type ShowObjectFull = ShowObject

// Spotify API Endpoints:
/**
  * Get an Album
  *
  * GET /v1/albums/{id}
  * https://developer.spotify.com/web-api/get-album/
  */
type SingleAlbumResponse = AlbumObjectFull

/**
  * Get an Artist
  *
  * GET /v1/artists/{id}
  * https://developer.spotify.com/web-api/get-artist/
  */
type SingleArtistResponse = ArtistObjectFull

/**
  * Get a category
  *
  * GET /v1/browse/categories/{id}
  * https://developer.spotify.com/web-api/get-category/
  */
type SingleCategoryResponse = CategoryObject

/**
  * Get an Episode
  *
  * GET /v1/episodes/{id}
  * https://developer.spotify.com/documentation/web-api/reference/episodes/get-an-episode/
  */
type SingleEpisodeResponse = EpisodeObject

/**
  * Get a playlist
  *
  * GET /v1/users/{user_id}/playlists/{playlist_id}
  * https://developer.spotify.com/web-api/get-playlist/
  */
type SinglePlaylistResponse = PlaylistObjectFull

/**
  * Get an Show
  *
  * GET /v1/shows/{id}
  * https://developer.spotify.com/web-api/get-show/
  */
type SingleShowResponse = ShowObject

/**
  * Get a track
  *
  * GET /v1/tracks/{id}
  * https://developer.spotify.com/web-api/get-track/
  */
type SingleTrackResponse = TrackObjectFull

/**
  * Unfollow artists or users
  *
  * DELETE /v1/me/following
  * https://developer.spotify.com/web-api/unfollow-artists-users/
  */
type UnfollowArtistsOrUsersResponse = VoidResponse

/**
  * Unfollow a Playlist
  *
  * DELETE /v1/users/{owner_id}/playlists/{playlist_id}/followers
  * https://developer.spotify.com/web-api/unfollow-playlist/
  * @deprecated Use `UnfollowPlaylistResponse` instead
  */
type UnfollowPlaylistReponse = UnfollowPlaylistResponse

/**
  * Unfollow a Playlist
  *
  * DELETE /v1/users/{owner_id}/playlists/{playlist_id}/followers
  * https://developer.spotify.com/web-api/unfollow-playlist/
  */
type UnfollowPlaylistResponse = VoidResponse

/**
  * Upload a Custom Playlist Cover Image
  *
  * PUT /v1/users/{user_id}/playlists/{playlist_id}/images
  * https://developer.spotify.com/web-api/upload-a-custom-playlist-cover-image/
  * @deprecated Use `UploadCustomPlaylistCoverImageResponse` instead
  */
type UploadCustomPlaylistCoverImageReponse = UploadCustomPlaylistCoverImageResponse

/**
  * Upload a Custom Playlist Cover Image
  *
  * PUT /v1/users/{user_id}/playlists/{playlist_id}/images
  * https://developer.spotify.com/web-api/upload-a-custom-playlist-cover-image/
  */
type UploadCustomPlaylistCoverImageResponse = VoidResponse

/**
  * Check if User Follows Users or Artists
  *
  * GET /v1/me/following/contains
  * https://developer.spotify.com/web-api/check-current-user-follows/
  */
type UserFollowsUsersOrArtistsResponse = js.Array[Boolean]

/**
  * Get user profile
  *
  * GET /v1/users/{user_id}
  * https://developer.spotify.com/web-api/get-users-profile/
  */
type UserProfileResponse = UserObjectPublic

/**
  * Check if Users Follow a Playlist
  *
  * GET /v1/users/{user_id}/playlists/{playlist_id}/followers/contains
  * https://developer.spotify.com/web-api/check-user-following-playlist/
  * @deprecated Use `UsersFollowPlaylistResponse` instead
  */
type UsersFollowPlaylistReponse = UsersFollowPlaylistResponse

/**
  * Check if Users Follow a Playlist
  *
  * GET /v1/users/{user_id}/playlists/{playlist_id}/followers/contains
  * https://developer.spotify.com/web-api/check-user-following-playlist/
  */
type UsersFollowPlaylistResponse = js.Array[Boolean]

/**
  * Get a User’s Recently Played Tracks
  *
  * GET /v1/me/player/recently-played
  * https://developer.spotify.com/web-api/get-users-top-artists-and-tracks/
  */
type UsersRecentlyPlayedTracksResponse = CursorBasedPagingObject[PlayHistoryObject]

/**
  * Get user's saved albums
  *
  * GET /v1/me/albums
  * https://developer.spotify.com/web-api/get-users-saved-albums/
  */
type UsersSavedAlbumsResponse = PagingObject[SavedAlbumObject]

/**
  * Get User's Saved Episodes
  *
  * GET /v1/me/episodes
  * https://developer.spotify.com/documentation/web-api/reference/#/operations/get-users-saved-episodes
  */
type UsersSavedEpisodesResponse = PagingObject[SavedEpisodeObject]

/**
  * Get user's saved shows
  *
  * GET /v1/me/shows
  * https://developer.spotify.com/documentation/web-api/reference/#endpoint-get-users-saved-shows
  */
type UsersSavedShowsResponse = PagingObject[SavedShowObject]

/**
  * Get user's saved tracks
  *
  * GET /v1/me/tracks
  * https://developer.spotify.com/web-api/get-users-saved-tracks/
  */
type UsersSavedTracksResponse = PagingObject[SavedTrackObject]

/**
  * Get a User’s Top Artists and Tracks (Note: This is only Artists)
  *
  * GET /v1/me/top/{type}
  * https://developer.spotify.com/web-api/get-users-top-artists-and-tracks/
  */
type UsersTopArtistsResponse = PagingObject[ArtistObjectFull]

/**
  * Get a User’s Top Artists and Tracks (Note: This is only Tracks)
  *
  * GET /v1/me/top/{type}
  * https://developer.spotify.com/web-api/get-users-top-artists-and-tracks/
  */
type UsersTopTracksResponse = PagingObject[TrackObjectFull]
