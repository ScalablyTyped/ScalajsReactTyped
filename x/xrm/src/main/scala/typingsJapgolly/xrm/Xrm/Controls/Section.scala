package typingsJapgolly.xrm.Xrm.Controls

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.xrm.Xrm.Collection.ItemCollection
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Interface for a form section.
  * @see {@link UiElement}
  */
trait Section extends UiStandardElement {
  /**
    * A reference to the collection of controls within this tab.
    * @see {@link https://docs.microsoft.com/en-us/dynamics365/customer-engagement/developer/clientapi/reference/collections External Link: Collections (Client API reference)}
    */
  var controls: ItemCollection[Control]
  /**
    * Gets the name of the section.
    * @returns The name.
    */
  def getName(): String
  /**
    * Gets a reference to the parent {@link Tab}.
    * @returns The parent.
    */
  def getParent(): Tab
}

object Section {
  @scala.inline
  def apply(
    controls: ItemCollection[Control],
    getLabel: CallbackTo[String],
    getName: CallbackTo[String],
    getParent: CallbackTo[Tab],
    getVisible: CallbackTo[Boolean],
    setLabel: String => Callback,
    setVisible: Boolean => Callback
  ): Section = {
    val __obj = js.Dynamic.literal(controls = controls.asInstanceOf[js.Any])
    __obj.updateDynamic("getLabel")(getLabel.toJsFn)
    __obj.updateDynamic("getName")(getName.toJsFn)
    __obj.updateDynamic("getParent")(getParent.toJsFn)
    __obj.updateDynamic("getVisible")(getVisible.toJsFn)
    __obj.updateDynamic("setLabel")(js.Any.fromFunction1((t0: java.lang.String) => setLabel(t0).runNow()))
    __obj.updateDynamic("setVisible")(js.Any.fromFunction1((t0: scala.Boolean) => setVisible(t0).runNow()))
    __obj.asInstanceOf[Section]
  }
}

