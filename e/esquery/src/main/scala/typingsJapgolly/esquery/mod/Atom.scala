package typingsJapgolly.esquery.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

//
// Base Atoms
//
trait Atom extends js.Object {
  var `type`: String
}

object Atom {
  @scala.inline
  def apply(`type`: String): Atom = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Atom]
  }
}

