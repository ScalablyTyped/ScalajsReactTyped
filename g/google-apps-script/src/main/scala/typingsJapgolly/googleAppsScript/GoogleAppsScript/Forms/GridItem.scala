package typingsJapgolly.googleAppsScript.GoogleAppsScript.Forms

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.googleAppsScript.GoogleAppsScript.Integer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A question item, presented as a grid of columns and rows, that allows the respondent to select
  * one choice per row from a sequence of radio buttons. Items can be accessed or created from a
  * Form.
  *
  *     // Open a form by ID and add a new grid item.
  *     var form = FormApp.openById('1234567890abcdefghijklmnopqrstuvwxyz');
  *     var item = form.addGridItem();
  *     item.setTitle('Rate your interests')
  *         .setRows(['Cars', 'Computers', 'Celebrities'])
  *         .setColumns(['Boring', 'So-so', 'Interesting']);
  */
trait GridItem extends js.Object {
  def clearValidation(): GridItem
  def createResponse(responses: js.Array[String]): ItemResponse
  def duplicate(): GridItem
  def getColumns(): js.Array[String]
  def getHelpText(): String
  def getId(): Integer
  def getIndex(): Integer
  def getRows(): js.Array[String]
  def getTitle(): String
  def getType(): ItemType
  def isRequired(): Boolean
  def setColumns(columns: js.Array[String]): GridItem
  def setHelpText(text: String): GridItem
  def setRequired(enabled: Boolean): GridItem
  def setRows(rows: js.Array[String]): GridItem
  def setTitle(title: String): GridItem
  def setValidation(validation: GridValidation): GridItem
}

object GridItem {
  @scala.inline
  def apply(
    clearValidation: CallbackTo[GridItem],
    createResponse: js.Array[String] => CallbackTo[ItemResponse],
    duplicate: CallbackTo[GridItem],
    getColumns: CallbackTo[js.Array[String]],
    getHelpText: CallbackTo[String],
    getId: CallbackTo[Integer],
    getIndex: CallbackTo[Integer],
    getRows: CallbackTo[js.Array[String]],
    getTitle: CallbackTo[String],
    getType: CallbackTo[ItemType],
    isRequired: CallbackTo[Boolean],
    setColumns: js.Array[String] => CallbackTo[GridItem],
    setHelpText: String => CallbackTo[GridItem],
    setRequired: Boolean => CallbackTo[GridItem],
    setRows: js.Array[String] => CallbackTo[GridItem],
    setTitle: String => CallbackTo[GridItem],
    setValidation: GridValidation => CallbackTo[GridItem]
  ): GridItem = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("clearValidation")(clearValidation.toJsFn)
    __obj.updateDynamic("createResponse")(js.Any.fromFunction1((t0: js.Array[java.lang.String]) => createResponse(t0).runNow()))
    __obj.updateDynamic("duplicate")(duplicate.toJsFn)
    __obj.updateDynamic("getColumns")(getColumns.toJsFn)
    __obj.updateDynamic("getHelpText")(getHelpText.toJsFn)
    __obj.updateDynamic("getId")(getId.toJsFn)
    __obj.updateDynamic("getIndex")(getIndex.toJsFn)
    __obj.updateDynamic("getRows")(getRows.toJsFn)
    __obj.updateDynamic("getTitle")(getTitle.toJsFn)
    __obj.updateDynamic("getType")(getType.toJsFn)
    __obj.updateDynamic("isRequired")(isRequired.toJsFn)
    __obj.updateDynamic("setColumns")(js.Any.fromFunction1((t0: js.Array[java.lang.String]) => setColumns(t0).runNow()))
    __obj.updateDynamic("setHelpText")(js.Any.fromFunction1((t0: java.lang.String) => setHelpText(t0).runNow()))
    __obj.updateDynamic("setRequired")(js.Any.fromFunction1((t0: scala.Boolean) => setRequired(t0).runNow()))
    __obj.updateDynamic("setRows")(js.Any.fromFunction1((t0: js.Array[java.lang.String]) => setRows(t0).runNow()))
    __obj.updateDynamic("setTitle")(js.Any.fromFunction1((t0: java.lang.String) => setTitle(t0).runNow()))
    __obj.updateDynamic("setValidation")(js.Any.fromFunction1((t0: typingsJapgolly.googleAppsScript.GoogleAppsScript.Forms.GridValidation) => setValidation(t0).runNow()))
    __obj.asInstanceOf[GridItem]
  }
}

