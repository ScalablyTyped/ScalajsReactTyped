package typingsJapgolly.sailsIoJs.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait InitialConnectionHeaders extends js.Object {
  var nosession: js.UndefOr[Boolean] = js.undefined
}

object InitialConnectionHeaders {
  @scala.inline
  def apply(nosession: js.UndefOr[Boolean] = js.undefined): InitialConnectionHeaders = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(nosession)) __obj.updateDynamic("nosession")(nosession.asInstanceOf[js.Any])
    __obj.asInstanceOf[InitialConnectionHeaders]
  }
}

