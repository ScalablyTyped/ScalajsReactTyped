package typingsJapgolly.officeUiFabricReact.searchBoxTypesMod

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ISearchBox extends js.Object {
  /**
    * Sets focus inside the search input box.
    */
  def focus(): Unit
  /**
    * Returns whether or not the SearchBox has focus
    */
  def hasFocus(): Boolean
}

object ISearchBox {
  @scala.inline
  def apply(focus: Callback, hasFocus: CallbackTo[Boolean]): ISearchBox = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("focus")(focus.toJsFn)
    __obj.updateDynamic("hasFocus")(hasFocus.toJsFn)
    __obj.asInstanceOf[ISearchBox]
  }
}

