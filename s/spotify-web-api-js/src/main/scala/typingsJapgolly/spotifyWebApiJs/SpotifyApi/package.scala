package typingsJapgolly.spotifyWebApiJs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object SpotifyApi {
  /**
    * Add Tracks to a Playlist
    * 
    * POST /v1/users/{user_id}/playlists/{playlist_id}/tracks
    * https://developer.spotify.com/web-api/add-tracks-to-playlist/
    */
  type AddTracksToPlaylistResponse = typingsJapgolly.spotifyWebApiJs.SpotifyApi.PlaylistSnapshotResponse
  /**
    * Get an Album’s Tracks
    * 
    * GET /v1/albums/{id}/tracks
    * https://developer.spotify.com/web-api/get-albums-tracks/
    */
  type AlbumTracksResponse = typingsJapgolly.spotifyWebApiJs.SpotifyApi.PagingObject[typingsJapgolly.spotifyWebApiJs.SpotifyApi.TrackObjectSimplified]
  /**
    * Get an Artist’s Albums
    * 
    * GET /v1/artists/{id}/albums
    * https://developer.spotify.com/web-api/get-artists-albums/
    */
  type ArtistsAlbumsResponse = typingsJapgolly.spotifyWebApiJs.SpotifyApi.PagingObject[typingsJapgolly.spotifyWebApiJs.SpotifyApi.AlbumObjectSimplified]
  /**
    * Get Audio Analysis for a Track
    * 
    * GET /v1/audio-analysis/{id}
    * https://developer.spotify.com/web-api/get-audio-analysis/
    * 
    * At the time of typing, the Audio Analysis Object is absent from the Object Model, so it is typed as any.
    * Object Model: https://developer.spotify.com/web-api/object-model/
    */
  type AudioAnalysisResponse = js.Object
  /**
    * Get audio features for a track
    * 
    * GET /v1/audio-features/{id}
    * https://developer.spotify.com/web-api/get-audio-features/
    */
  type AudioFeaturesResponse = typingsJapgolly.spotifyWebApiJs.SpotifyApi.AudioFeaturesObject
  /**
    * Change a Playlist’s Details
    * 
    * PUT /v1/users/{user_id}/playlists/{playlist_id}
    * https://developer.spotify.com/web-api/change-playlist-details/
    */
  type ChangePlaylistDetailsReponse = typingsJapgolly.spotifyWebApiJs.SpotifyApi.VoidResponse
  /**
    * Check user's saved albums
    * 
    * GET /v1/me/albums/contains?ids={ids}
    * https://developer.spotify.com/web-api/check-users-saved-albums/
    */
  type CheckUserSavedAlbumsResponse = js.Array[scala.Boolean]
  /**
    * Check User’s Saved Tracks
    * 
    * GET /v1/me/tracks/contains?ids={ids}
    * https://developer.spotify.com/web-api/check-users-saved-tracks/
    */
  type CheckUsersSavedTracksResponse = js.Array[scala.Boolean]
  /**
    * Create a Playlist
    * 
    * POST /v1/users/{user_id}/playlists
    * https://developer.spotify.com/web-api/create-playlist/
    */
  type CreatePlaylistResponse = typingsJapgolly.spotifyWebApiJs.SpotifyApi.PlaylistObjectFull
  /**
    * Get Current User’s Profile
    * 
    * GET /v1/me
    * https://developer.spotify.com/web-api/get-current-users-profile/
    */
  type CurrentUsersProfileResponse = typingsJapgolly.spotifyWebApiJs.SpotifyApi.UserObjectPrivate
  type CurrentlyPlayingResponse = typingsJapgolly.spotifyWebApiJs.SpotifyApi.CurrentlyPlayingObject
  /**
    * Follow artists or users
    * 
    * PUT /v1/me/following
    * https://developer.spotify.com/web-api/follow-artists-users/
    */
  type FollowArtistsOrUsersResponse = typingsJapgolly.spotifyWebApiJs.SpotifyApi.VoidResponse
  /**
    * Follow a Playlist
    * 
    * PUT /v1/users/{owner_id}/playlists/{playlist_id}/followers
    * https://developer.spotify.com/web-api/follow-playlist/
    */
  type FollowPlaylistReponse = typingsJapgolly.spotifyWebApiJs.SpotifyApi.VoidResponse
  /**
    * Get a list of the current user's playlists
    * 
    * GET /v1/me/playlists
    * https://developer.spotify.com/web-api/get-list-users-playlists/
    */
  type ListOfCurrentUsersPlaylistsResponse = typingsJapgolly.spotifyWebApiJs.SpotifyApi.PagingObject[typingsJapgolly.spotifyWebApiJs.SpotifyApi.PlaylistObjectSimplified]
  /**
    * Get a list of a user's playlists
    * 
    * GET /v1/users/{user_id}/playlists
    * https://developer.spotify.com/web-api/get-list-users-playlists/
    */
  type ListOfUsersPlaylistsResponse = typingsJapgolly.spotifyWebApiJs.SpotifyApi.PagingObject[typingsJapgolly.spotifyWebApiJs.SpotifyApi.PlaylistObjectSimplified]
  /**
    * Get a playlist's tracks
    * 
    * GET /v1/users/{user_id}/playlists/{playlist_id}/tracks
    * https://developer.spotify.com/web-api/get-playlists-tracks/
    */
  type PlaylistTrackResponse = typingsJapgolly.spotifyWebApiJs.SpotifyApi.PagingObject[typingsJapgolly.spotifyWebApiJs.SpotifyApi.PlaylistTrackObject]
  /**
    * Get recommendations based on seeds
    * 
    * GET /v1/recommendations
    * https://developer.spotify.com/get-recommendations/
    */
  type RecommendationsFromSeedsResponse = typingsJapgolly.spotifyWebApiJs.SpotifyApi.RecommendationsObject
  /**
    * Remove Albums for Current User
    * 
    * DELETE /v1/me/albums?ids={ids}
    * https://developer.spotify.com/web-api/remove-albums-user/
    */
  type RemoveAlbumsForUserResponse = typingsJapgolly.spotifyWebApiJs.SpotifyApi.VoidResponse
  /**
    * Remove Tracks from a Playlist
    * 
    * DELETE /v1/users/{user_id}/playlists/{playlist_id}/tracks
    * https://developer.spotify.com/web-api/remove-tracks-playlist/
    */
  type RemoveTracksFromPlaylistResponse = typingsJapgolly.spotifyWebApiJs.SpotifyApi.PlaylistSnapshotResponse
  /**
    * Remove User’s Saved Tracks
    * 
    * DELETE /v1/me/tracks?ids={ids}
    * https://developer.spotify.com/web-api/remove-tracks-user/
    */
  type RemoveUsersSavedTracksResponse = typingsJapgolly.spotifyWebApiJs.SpotifyApi.VoidResponse
  /**
    * Reorder a Playlist’s Tracks
    * 
    * PUT /v1/users/{user_id}/playlists/{playlist_id}/tracks
    * https://developer.spotify.com/web-api/reorder-playlists-tracks/
    */
  type ReorderPlaylistTracksResponse = typingsJapgolly.spotifyWebApiJs.SpotifyApi.PlaylistSnapshotResponse
  /**
    * Replace a Playlist’s Tracks
    * 
    * PUT /v1/users/{user_id}/playlists/{playlist_id}/tracks
    * https://developer.spotify.com/web-api/replace-playlists-tracks/
    */
  type ReplacePlaylistTracksResponse = typingsJapgolly.spotifyWebApiJs.SpotifyApi.VoidResponse
  /**
    * Save albums for user
    * 
    * PUT /v1/me/albums?ids={ids}
    * https://developer.spotify.com/web-api/save-albums-user/
    */
  type SaveAlbumsForUserResponse = typingsJapgolly.spotifyWebApiJs.SpotifyApi.VoidResponse
  /**
    * Save tracks for user
    * 
    * PUT /v1/me/tracks?ids={ids}
    * https://developer.spotify.com/web-api/save-tracks-user/
    */
  type SaveTracksForUserResponse = typingsJapgolly.spotifyWebApiJs.SpotifyApi.VoidResponse
  // Spotify API Endpoints:
  /**
    * Get an Album
    * 
    * GET /v1/albums/{id}
    * https://developer.spotify.com/web-api/get-album/
    */
  type SingleAlbumResponse = typingsJapgolly.spotifyWebApiJs.SpotifyApi.AlbumObjectFull
  /**
    * Get an Artist
    * 
    * GET /v1/artists/{id}
    * https://developer.spotify.com/web-api/get-artist/
    */
  type SingleArtistResponse = typingsJapgolly.spotifyWebApiJs.SpotifyApi.ArtistObjectFull
  /**
    * Get a category
    * 
    * GET /v1/browse/categories/{id}
    * https://developer.spotify.com/web-api/get-category/
    */
  type SingleCategoryResponse = typingsJapgolly.spotifyWebApiJs.SpotifyApi.CategoryObject
  /**
    * Get a playlist
    * 
    * GET /v1/users/{user_id}/playlists/{playlist_id}
    * https://developer.spotify.com/web-api/get-playlist/
    */
  type SinglePlaylistResponse = typingsJapgolly.spotifyWebApiJs.SpotifyApi.PlaylistObjectFull
  /**
    * Get a track
    * 
    * GET /v1/tracks/{id}
    * https://developer.spotify.com/web-api/get-track/
    */
  type SingleTrackResponse = typingsJapgolly.spotifyWebApiJs.SpotifyApi.TrackObjectFull
  /**
    * Unfollow artists or users
    * 
    * DELETE /v1/me/following
    * https://developer.spotify.com/web-api/unfollow-artists-users/
    */
  type UnfollowArtistsOrUsersResponse = typingsJapgolly.spotifyWebApiJs.SpotifyApi.VoidResponse
  /**
    * Unfollow a Playlist
    * 
    * DELETE /v1/users/{owner_id}/playlists/{playlist_id}/followers
    * https://developer.spotify.com/web-api/unfollow-playlist/
    */
  type UnfollowPlaylistReponse = typingsJapgolly.spotifyWebApiJs.SpotifyApi.VoidResponse
  /**
    * Upload a Custom Playlist Cover Image
    * 
    * PUT /v1/users/{user_id}/playlists/{playlist_id}/images
    * https://developer.spotify.com/web-api/upload-a-custom-playlist-cover-image/
    */
  type UploadCustomPlaylistCoverImageReponse = typingsJapgolly.spotifyWebApiJs.SpotifyApi.VoidResponse
  /**
    * Check if User Follows Users or Artists
    * 
    * GET /v1/me/following/contains
    * https://developer.spotify.com/web-api/check-current-user-follows/
    */
  type UserFollowsUsersOrArtistsResponse = js.Array[scala.Boolean]
  /**
    * Get user profile
    * 
    * GET /v1/users/{user_id}
    * https://developer.spotify.com/web-api/get-users-profile/
    */
  type UserProfileResponse = typingsJapgolly.spotifyWebApiJs.SpotifyApi.UserObjectPublic
  /**
    * Check if Users Follow a Playlist
    * 
    * GET /v1/users/{user_id}/playlists/{playlist_id}/followers/contains
    * https://developer.spotify.com/web-api/check-user-following-playlist/
    */
  type UsersFollowPlaylistReponse = js.Array[scala.Boolean]
  /**
    * Get a User’s Recently Played Tracks
    * 
    * GET /v1/me/player/recently-played
    * https://developer.spotify.com/web-api/get-users-top-artists-and-tracks/
    */
  type UsersRecentlyPlayedTracksResponse = typingsJapgolly.spotifyWebApiJs.SpotifyApi.CursorBasedPagingObject[typingsJapgolly.spotifyWebApiJs.SpotifyApi.PlayHistoryObject]
  /**
    * Get user's saved albums
    * 
    * GET /v1/me/albums
    * https://developer.spotify.com/web-api/get-users-saved-albums/
    */
  type UsersSavedAlbumsResponse = typingsJapgolly.spotifyWebApiJs.SpotifyApi.PagingObject[typingsJapgolly.spotifyWebApiJs.SpotifyApi.SavedAlbumObject]
  /**
    * Get user's saved tracks
    * 
    * GET /v1/me/tracks
    * https://developer.spotify.com/web-api/get-users-saved-tracks/
    */
  type UsersSavedTracksResponse = typingsJapgolly.spotifyWebApiJs.SpotifyApi.PagingObject[typingsJapgolly.spotifyWebApiJs.SpotifyApi.SavedTrackObject]
  /**
    * Get a User’s Top Artists and Tracks (Note: This is only Artists)
    * 
    * GET /v1/me/top/{type}
    * https://developer.spotify.com/web-api/get-users-top-artists-and-tracks/
    */
  type UsersTopArtistsResponse = typingsJapgolly.spotifyWebApiJs.SpotifyApi.PagingObject[typingsJapgolly.spotifyWebApiJs.SpotifyApi.ArtistObjectFull]
  /**
    * Get a User’s Top Artists and Tracks (Note: This is only Tracks)
    * 
    * GET /v1/me/top/{type}
    * https://developer.spotify.com/web-api/get-users-top-artists-and-tracks/
    */
  type UsersTopTracksResponse = typingsJapgolly.spotifyWebApiJs.SpotifyApi.PagingObject[typingsJapgolly.spotifyWebApiJs.SpotifyApi.TrackObjectFull]
}
