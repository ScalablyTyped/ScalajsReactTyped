package typingsJapgolly.moviedb.mod.MovieDB

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ProductionCompany extends js.Object {
  var id: Double
  var name: String
}

object ProductionCompany {
  @scala.inline
  def apply(id: Double, name: String): ProductionCompany = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[ProductionCompany]
  }
}

