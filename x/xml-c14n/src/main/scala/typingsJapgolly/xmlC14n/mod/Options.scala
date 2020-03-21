package typingsJapgolly.xmlC14n.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  var includeComments: js.UndefOr[Boolean] = js.undefined
  var inclusiveNamespaces: js.UndefOr[Boolean] = js.undefined
}

object Options {
  @scala.inline
  def apply(
    includeComments: js.UndefOr[Boolean] = js.undefined,
    inclusiveNamespaces: js.UndefOr[Boolean] = js.undefined
  ): Options = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(includeComments)) __obj.updateDynamic("includeComments")(includeComments.asInstanceOf[js.Any])
    if (!js.isUndefined(inclusiveNamespaces)) __obj.updateDynamic("inclusiveNamespaces")(inclusiveNamespaces.asInstanceOf[js.Any])
    __obj.asInstanceOf[Options]
  }
}

