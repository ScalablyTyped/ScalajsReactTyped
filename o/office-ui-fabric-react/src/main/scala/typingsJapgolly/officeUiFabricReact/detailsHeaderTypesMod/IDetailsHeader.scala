package typingsJapgolly.officeUiFabricReact.detailsHeaderTypesMod

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IDetailsHeader extends js.Object {
  /** sets focus into the header */
  def focus(): Boolean
}

object IDetailsHeader {
  @scala.inline
  def apply(focus: CallbackTo[Boolean]): IDetailsHeader = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("focus")(focus.toJsFn)
    __obj.asInstanceOf[IDetailsHeader]
  }
}

