package typingsJapgolly.moviedb.mod.MovieDB

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SpokenLanguage extends js.Object {
  var iso_639_1: Double
  var name: String
}

object SpokenLanguage {
  @scala.inline
  def apply(iso_639_1: Double, name: String): SpokenLanguage = {
    val __obj = js.Dynamic.literal(iso_639_1 = iso_639_1.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[SpokenLanguage]
  }
}

