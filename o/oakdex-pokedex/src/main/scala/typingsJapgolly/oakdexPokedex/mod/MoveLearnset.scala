package typingsJapgolly.oakdexPokedex.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MoveLearnset extends js.Object {
  var games: js.Array[String]
  var learnset: js.Array[Learnset]
}

object MoveLearnset {
  @scala.inline
  def apply(games: js.Array[String], learnset: js.Array[Learnset]): MoveLearnset = {
    val __obj = js.Dynamic.literal(games = games.asInstanceOf[js.Any], learnset = learnset.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[MoveLearnset]
  }
}

