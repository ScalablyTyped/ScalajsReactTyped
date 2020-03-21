package typingsJapgolly.ejWebAll.ej.Accordion

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait InActivateEventArgs extends js.Object {
  /** if the event should be canceled; otherwise, false.
    */
  var cancel: js.UndefOr[Boolean] = js.undefined
  /** returns in active element
    */
  var inActiveHeader: js.UndefOr[js.Any] = js.undefined
  /** returns active index
    */
  var inActiveIndex: js.UndefOr[Double] = js.undefined
  /** returns true when the Accordion index activated by user interaction otherwise returns false
    */
  var isInteraction: js.UndefOr[Boolean] = js.undefined
  /** returns the accordion model
    */
  var model: js.UndefOr[Model] = js.undefined
  /** returns the name of the event
    */
  var `type`: js.UndefOr[String] = js.undefined
}

object InActivateEventArgs {
  @scala.inline
  def apply(
    cancel: js.UndefOr[Boolean] = js.undefined,
    inActiveHeader: js.Any = null,
    inActiveIndex: Int | Double = null,
    isInteraction: js.UndefOr[Boolean] = js.undefined,
    model: Model = null,
    `type`: String = null
  ): InActivateEventArgs = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(cancel)) __obj.updateDynamic("cancel")(cancel.asInstanceOf[js.Any])
    if (inActiveHeader != null) __obj.updateDynamic("inActiveHeader")(inActiveHeader.asInstanceOf[js.Any])
    if (inActiveIndex != null) __obj.updateDynamic("inActiveIndex")(inActiveIndex.asInstanceOf[js.Any])
    if (!js.isUndefined(isInteraction)) __obj.updateDynamic("isInteraction")(isInteraction.asInstanceOf[js.Any])
    if (model != null) __obj.updateDynamic("model")(model.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[InActivateEventArgs]
  }
}

