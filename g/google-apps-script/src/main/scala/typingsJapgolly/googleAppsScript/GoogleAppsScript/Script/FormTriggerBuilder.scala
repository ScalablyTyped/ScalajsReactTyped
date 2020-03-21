package typingsJapgolly.googleAppsScript.GoogleAppsScript.Script

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A builder for form triggers.
  */
trait FormTriggerBuilder extends js.Object {
  def create(): Trigger
  def onFormSubmit(): FormTriggerBuilder
  def onOpen(): FormTriggerBuilder
}

object FormTriggerBuilder {
  @scala.inline
  def apply(
    create: CallbackTo[Trigger],
    onFormSubmit: CallbackTo[FormTriggerBuilder],
    onOpen: CallbackTo[FormTriggerBuilder]
  ): FormTriggerBuilder = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("create")(create.toJsFn)
    __obj.updateDynamic("onFormSubmit")(onFormSubmit.toJsFn)
    __obj.updateDynamic("onOpen")(onOpen.toJsFn)
    __obj.asInstanceOf[FormTriggerBuilder]
  }
}

