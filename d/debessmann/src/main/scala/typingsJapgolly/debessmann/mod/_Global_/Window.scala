package typingsJapgolly.debessmann.mod._Global_

import typingsJapgolly.debessmann.mod.DM
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Window extends js.Object {
  var dm: DM
}

object Window {
  @scala.inline
  def apply(dm: DM): Window = {
    val __obj = js.Dynamic.literal(dm = dm.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Window]
  }
}

