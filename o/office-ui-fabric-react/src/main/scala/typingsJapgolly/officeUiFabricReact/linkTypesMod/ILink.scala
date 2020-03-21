package typingsJapgolly.officeUiFabricReact.linkTypesMod

import japgolly.scalajs.react.Callback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ILink extends js.Object {
  /** Sets focus to the link. */
  def focus(): Unit
}

object ILink {
  @scala.inline
  def apply(focus: Callback): ILink = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("focus")(focus.toJsFn)
    __obj.asInstanceOf[ILink]
  }
}

