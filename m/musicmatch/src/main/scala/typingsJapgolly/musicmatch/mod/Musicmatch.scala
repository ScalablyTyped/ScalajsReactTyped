package typingsJapgolly.musicmatch.mod

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Musicmatch extends js.Object {
  def album(params: AlbumParams): js.Promise[_]
  def albumTracks(params: AlbumTracksParams): js.Promise[_]
  def artist(params: ArtistParams): js.Promise[_]
  def artistAlbums(params: ArtistAlbumsParams): js.Promise[_]
  def artistRelated(params: ArtistRelatedParams): js.Promise[_]
  def artistSearch(params: ArtistSearchParams): js.Promise[_]
  def chartArtists(params: ChartArtistsParams): js.Promise[_]
  def chartTracks(params: ChartTracksParams): js.Promise[_]
  def matcherLyrics(params: MatcherLyricsParams): js.Promise[_]
  def matcherSubtitle(params: MatcherSubtitleParams): js.Promise[_]
  def matcherTrack(params: MatcherTrackParams): js.Promise[_]
  def track(params: TrackParams): js.Promise[_]
  def trackLyrics(params: TrackLyricsParams): js.Promise[_]
  def trackLyricsAdd(params: TrackLyricsAddParams): js.Promise[_]
  def trackLyricsFeedback(params: TrackLyricsFeedbackParams): js.Promise[_]
  def trackSearch(params: TrackSearchParams): js.Promise[TrackSearchResult]
  def trackSnippet(params: TrackSnippetParams): js.Promise[_]
  def trackSubtitle(params: TrackSubtitleParams): js.Promise[_]
}

object Musicmatch {
  @scala.inline
  def apply(
    album: AlbumParams => CallbackTo[js.Promise[js.Any]],
    albumTracks: AlbumTracksParams => CallbackTo[js.Promise[js.Any]],
    artist: ArtistParams => CallbackTo[js.Promise[js.Any]],
    artistAlbums: ArtistAlbumsParams => CallbackTo[js.Promise[js.Any]],
    artistRelated: ArtistRelatedParams => CallbackTo[js.Promise[js.Any]],
    artistSearch: ArtistSearchParams => CallbackTo[js.Promise[js.Any]],
    chartArtists: ChartArtistsParams => CallbackTo[js.Promise[js.Any]],
    chartTracks: ChartTracksParams => CallbackTo[js.Promise[js.Any]],
    matcherLyrics: MatcherLyricsParams => CallbackTo[js.Promise[js.Any]],
    matcherSubtitle: MatcherSubtitleParams => CallbackTo[js.Promise[js.Any]],
    matcherTrack: MatcherTrackParams => CallbackTo[js.Promise[js.Any]],
    track: TrackParams => CallbackTo[js.Promise[js.Any]],
    trackLyrics: TrackLyricsParams => CallbackTo[js.Promise[js.Any]],
    trackLyricsAdd: TrackLyricsAddParams => CallbackTo[js.Promise[js.Any]],
    trackLyricsFeedback: TrackLyricsFeedbackParams => CallbackTo[js.Promise[js.Any]],
    trackSearch: TrackSearchParams => CallbackTo[js.Promise[TrackSearchResult]],
    trackSnippet: TrackSnippetParams => CallbackTo[js.Promise[js.Any]],
    trackSubtitle: TrackSubtitleParams => CallbackTo[js.Promise[js.Any]]
  ): Musicmatch = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("album")(js.Any.fromFunction1((t0: typingsJapgolly.musicmatch.mod.AlbumParams) => album(t0).runNow()))
    __obj.updateDynamic("albumTracks")(js.Any.fromFunction1((t0: typingsJapgolly.musicmatch.mod.AlbumTracksParams) => albumTracks(t0).runNow()))
    __obj.updateDynamic("artist")(js.Any.fromFunction1((t0: typingsJapgolly.musicmatch.mod.ArtistParams) => artist(t0).runNow()))
    __obj.updateDynamic("artistAlbums")(js.Any.fromFunction1((t0: typingsJapgolly.musicmatch.mod.ArtistAlbumsParams) => artistAlbums(t0).runNow()))
    __obj.updateDynamic("artistRelated")(js.Any.fromFunction1((t0: typingsJapgolly.musicmatch.mod.ArtistRelatedParams) => artistRelated(t0).runNow()))
    __obj.updateDynamic("artistSearch")(js.Any.fromFunction1((t0: typingsJapgolly.musicmatch.mod.ArtistSearchParams) => artistSearch(t0).runNow()))
    __obj.updateDynamic("chartArtists")(js.Any.fromFunction1((t0: typingsJapgolly.musicmatch.mod.ChartArtistsParams) => chartArtists(t0).runNow()))
    __obj.updateDynamic("chartTracks")(js.Any.fromFunction1((t0: typingsJapgolly.musicmatch.mod.ChartTracksParams) => chartTracks(t0).runNow()))
    __obj.updateDynamic("matcherLyrics")(js.Any.fromFunction1((t0: typingsJapgolly.musicmatch.mod.MatcherLyricsParams) => matcherLyrics(t0).runNow()))
    __obj.updateDynamic("matcherSubtitle")(js.Any.fromFunction1((t0: typingsJapgolly.musicmatch.mod.MatcherSubtitleParams) => matcherSubtitle(t0).runNow()))
    __obj.updateDynamic("matcherTrack")(js.Any.fromFunction1((t0: typingsJapgolly.musicmatch.mod.MatcherTrackParams) => matcherTrack(t0).runNow()))
    __obj.updateDynamic("track")(js.Any.fromFunction1((t0: typingsJapgolly.musicmatch.mod.TrackParams) => track(t0).runNow()))
    __obj.updateDynamic("trackLyrics")(js.Any.fromFunction1((t0: typingsJapgolly.musicmatch.mod.TrackLyricsParams) => trackLyrics(t0).runNow()))
    __obj.updateDynamic("trackLyricsAdd")(js.Any.fromFunction1((t0: typingsJapgolly.musicmatch.mod.TrackLyricsAddParams) => trackLyricsAdd(t0).runNow()))
    __obj.updateDynamic("trackLyricsFeedback")(js.Any.fromFunction1((t0: typingsJapgolly.musicmatch.mod.TrackLyricsFeedbackParams) => trackLyricsFeedback(t0).runNow()))
    __obj.updateDynamic("trackSearch")(js.Any.fromFunction1((t0: typingsJapgolly.musicmatch.mod.TrackSearchParams) => trackSearch(t0).runNow()))
    __obj.updateDynamic("trackSnippet")(js.Any.fromFunction1((t0: typingsJapgolly.musicmatch.mod.TrackSnippetParams) => trackSnippet(t0).runNow()))
    __obj.updateDynamic("trackSubtitle")(js.Any.fromFunction1((t0: typingsJapgolly.musicmatch.mod.TrackSubtitleParams) => trackSubtitle(t0).runNow()))
    __obj.asInstanceOf[Musicmatch]
  }
}

