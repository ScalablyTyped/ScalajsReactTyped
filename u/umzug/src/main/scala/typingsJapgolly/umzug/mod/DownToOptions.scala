package typingsJapgolly.umzug.mod

import typingsJapgolly.umzug.umzugNumbers.`0`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DownToOptions extends js.Object {
  /**
    * It is also possible to pass the name of a migration in order to
    * just run the migrations from the current state to the passed
    * migration name. down allows to pass 0 to revert everything.
    */
  var to: String | `0`
}

object DownToOptions {
  @scala.inline
  def apply(to: String | `0`): DownToOptions = {
    val __obj = js.Dynamic.literal(to = to.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[DownToOptions]
  }
}

