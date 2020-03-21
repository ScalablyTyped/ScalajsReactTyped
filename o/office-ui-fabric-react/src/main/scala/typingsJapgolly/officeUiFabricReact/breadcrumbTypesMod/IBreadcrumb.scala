package typingsJapgolly.officeUiFabricReact.breadcrumbTypesMod

import japgolly.scalajs.react.Callback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IBreadcrumb extends js.Object {
  /**
    * Sets focus to the first breadcrumb link.
    */
  def focus(): Unit
}

object IBreadcrumb {
  @scala.inline
  def apply(focus: Callback): IBreadcrumb = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("focus")(focus.toJsFn)
    __obj.asInstanceOf[IBreadcrumb]
  }
}

