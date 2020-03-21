package typingsJapgolly.googleAppsScript.GoogleAppsScript.Script

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Builder for spreadsheet triggers.
  */
trait SpreadsheetTriggerBuilder extends js.Object {
  def create(): Trigger
  def onChange(): SpreadsheetTriggerBuilder
  def onEdit(): SpreadsheetTriggerBuilder
  def onFormSubmit(): SpreadsheetTriggerBuilder
  def onOpen(): SpreadsheetTriggerBuilder
}

object SpreadsheetTriggerBuilder {
  @scala.inline
  def apply(
    create: CallbackTo[Trigger],
    onChange: CallbackTo[SpreadsheetTriggerBuilder],
    onEdit: CallbackTo[SpreadsheetTriggerBuilder],
    onFormSubmit: CallbackTo[SpreadsheetTriggerBuilder],
    onOpen: CallbackTo[SpreadsheetTriggerBuilder]
  ): SpreadsheetTriggerBuilder = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("create")(create.toJsFn)
    __obj.updateDynamic("onChange")(onChange.toJsFn)
    __obj.updateDynamic("onEdit")(onEdit.toJsFn)
    __obj.updateDynamic("onFormSubmit")(onFormSubmit.toJsFn)
    __obj.updateDynamic("onOpen")(onOpen.toJsFn)
    __obj.asInstanceOf[SpreadsheetTriggerBuilder]
  }
}

