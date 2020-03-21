package typingsJapgolly.lyricist.mod

import typingsJapgolly.lyricist.AnonFetchLyrics
import typingsJapgolly.lyricist.AnonFetchTracklist
import typingsJapgolly.lyricist.AnonPage
import typingsJapgolly.lyricist.AnonTextFormat
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Lyricist extends js.Object {
  def album(id: Double): js.Promise[Album] = js.native
  def album(id: Double, opts: AnonFetchTracklist): js.Promise[Album] = js.native
  def artist(id: Double, opts: AnonTextFormat): js.Promise[Artist] = js.native
  def artistByName(name: String, opts: AnonTextFormat): js.Promise[Artist] = js.native
  def search(query: String): js.Promise[js.Array[SearchResult]] = js.native
  def song(id: Double): js.Promise[Song] = js.native
  def song(id: Double, opts: AnonFetchLyrics): js.Promise[Song] = js.native
  def songsByArtist(id: Double): js.Promise[js.Array[SongByArtist]] = js.native
  def songsByArtist(id: Double, opts: AnonPage): js.Promise[js.Array[SongByArtist]] = js.native
}

