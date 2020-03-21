package typingsJapgolly.jquerySteps.JQuerySteps

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

//#endregion "Settings"
//#region "Label Settings"
trait LabelSettings extends js.Object {
  /**
    * Label for the cancel button. Default value is Cancel.
    */
  var cancel: js.UndefOr[String] = js.undefined
  /**
    * This label is important for accessability reasons. Indicates which step is activated. Default value is current step:.
    */
  var current: js.UndefOr[String] = js.undefined
  /**
    * Label for the finish button. Default value is Finish.
    */
  var finish: js.UndefOr[String] = js.undefined
  /**
    * Label for the loading animation. Default value is Loading ... .
    */
  var loading: js.UndefOr[String] = js.undefined
  /**
    * Label for the next button. Default value is Next.
    */
  var next: js.UndefOr[String] = js.undefined
  /**
    * This label is important for accessability reasons and describes the kind of navigation. Default value is Pagination.
    */
  var pagination: js.UndefOr[String] = js.undefined
  /**
    * Label for the previous button. Default value is Previous.
    */
  var previous: js.UndefOr[String] = js.undefined
}

object LabelSettings {
  @scala.inline
  def apply(
    cancel: String = null,
    current: String = null,
    finish: String = null,
    loading: String = null,
    next: String = null,
    pagination: String = null,
    previous: String = null
  ): LabelSettings = {
    val __obj = js.Dynamic.literal()
    if (cancel != null) __obj.updateDynamic("cancel")(cancel.asInstanceOf[js.Any])
    if (current != null) __obj.updateDynamic("current")(current.asInstanceOf[js.Any])
    if (finish != null) __obj.updateDynamic("finish")(finish.asInstanceOf[js.Any])
    if (loading != null) __obj.updateDynamic("loading")(loading.asInstanceOf[js.Any])
    if (next != null) __obj.updateDynamic("next")(next.asInstanceOf[js.Any])
    if (pagination != null) __obj.updateDynamic("pagination")(pagination.asInstanceOf[js.Any])
    if (previous != null) __obj.updateDynamic("previous")(previous.asInstanceOf[js.Any])
    __obj.asInstanceOf[LabelSettings]
  }
}

