package typingsJapgolly.inquirer

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_IsFinal extends js.Object {
  var isFinal: js.UndefOr[Boolean] = js.undefined
}

object Anon_IsFinal {
  @scala.inline
  def apply(isFinal: js.UndefOr[Boolean] = js.undefined): Anon_IsFinal = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(isFinal)) __obj.updateDynamic("isFinal")(isFinal.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_IsFinal]
  }
}

