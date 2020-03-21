package typingsJapgolly.npmKeyword.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  /**
  		Limits the amount of results.
  		@default 250
  		*/
  val size: js.UndefOr[Double] = js.undefined
}

object Options {
  @scala.inline
  def apply(size: Int | Double = null): Options = {
    val __obj = js.Dynamic.literal()
    if (size != null) __obj.updateDynamic("size")(size.asInstanceOf[js.Any])
    __obj.asInstanceOf[Options]
  }
}

