package typingsJapgolly.cucumber.mod.pickle

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Argument extends js.Object {
  var rows: js.Array[Cell]
}

object Argument {
  @scala.inline
  def apply(rows: js.Array[Cell]): Argument = {
    val __obj = js.Dynamic.literal(rows = rows.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Argument]
  }
}

