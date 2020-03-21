package typingsJapgolly.moviedb.mod.MovieDB

import japgolly.scalajs.react.Callback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IMovieDB extends js.Object {
  def movieImages(options: InfoOptions, callback: js.Function2[/* err */ js.Any, /* images */ MovieImages, Unit]): Unit
  def movieInfo(options: InfoOptions, callback: js.Function2[/* err */ js.Any, /* curMovie */ Movie, Unit]): Unit
  def searchMovie(params: SearchOptions, callback: js.Function2[/* err */ js.Any, /* movies */ SearchResults, Unit]): Unit
}

object IMovieDB {
  @scala.inline
  def apply(
    movieImages: (InfoOptions, js.Function2[/* err */ js.Any, /* images */ MovieImages, Unit]) => Callback,
    movieInfo: (InfoOptions, js.Function2[/* err */ js.Any, /* curMovie */ Movie, Unit]) => Callback,
    searchMovie: (SearchOptions, js.Function2[/* err */ js.Any, /* movies */ SearchResults, Unit]) => Callback
  ): IMovieDB = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("movieImages")(js.Any.fromFunction2((t0: typingsJapgolly.moviedb.mod.MovieDB.InfoOptions, t1: js.Function2[
  /* err */ js.Any, 
  /* images */ typingsJapgolly.moviedb.mod.MovieDB.MovieImages, 
  scala.Unit]) => movieImages(t0, t1).runNow()))
    __obj.updateDynamic("movieInfo")(js.Any.fromFunction2((t0: typingsJapgolly.moviedb.mod.MovieDB.InfoOptions, t1: js.Function2[
  /* err */ js.Any, 
  /* curMovie */ typingsJapgolly.moviedb.mod.MovieDB.Movie, 
  scala.Unit]) => movieInfo(t0, t1).runNow()))
    __obj.updateDynamic("searchMovie")(js.Any.fromFunction2((t0: typingsJapgolly.moviedb.mod.MovieDB.SearchOptions, t1: js.Function2[
  /* err */ js.Any, 
  /* movies */ typingsJapgolly.moviedb.mod.MovieDB.SearchResults, 
  scala.Unit]) => searchMovie(t0, t1).runNow()))
    __obj.asInstanceOf[IMovieDB]
  }
}

