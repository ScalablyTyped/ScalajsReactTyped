package typingsJapgolly.onetime.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  /**
  		Throw an error when called more than once.
  		@default false
  		*/
  var `throw`: js.UndefOr[Boolean] = js.undefined
}

object Options {
  @scala.inline
  def apply(`throw`: js.UndefOr[Boolean] = js.undefined): Options = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(`throw`)) __obj.updateDynamic("throw")(`throw`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Options]
  }
}

