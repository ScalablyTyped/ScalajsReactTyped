package typingsJapgolly.angularStrap.mgcrea.ngStrap.dropdown

import japgolly.scalajs.react.Callback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IDropdown extends js.Object {
  def destroy(): Unit
  def hide(): Unit
  def show(): Unit
}

object IDropdown {
  @scala.inline
  def apply(destroy: Callback, hide: Callback, show: Callback): IDropdown = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("destroy")(destroy.toJsFn)
    __obj.updateDynamic("hide")(hide.toJsFn)
    __obj.updateDynamic("show")(show.toJsFn)
    __obj.asInstanceOf[IDropdown]
  }
}

