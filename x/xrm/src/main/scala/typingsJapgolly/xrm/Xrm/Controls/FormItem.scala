package typingsJapgolly.xrm.Xrm.Controls

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Interface for an entity's form selector item.
  */
trait FormItem extends js.Object {
  /**
    * Gets the unique identifier of the form.
    * @returns The identifier, in Guid format.
    */
  def getId(): String
  /**
    * Gets the label for the form.
    * @returns The label.
    */
  def getLabel(): String
  /**
    * Navigates the user to this form.
    */
  def navigate(): Unit
}

object FormItem {
  @scala.inline
  def apply(getId: CallbackTo[String], getLabel: CallbackTo[String], navigate: Callback): FormItem = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("getId")(getId.toJsFn)
    __obj.updateDynamic("getLabel")(getLabel.toJsFn)
    __obj.updateDynamic("navigate")(navigate.toJsFn)
    __obj.asInstanceOf[FormItem]
  }
}

