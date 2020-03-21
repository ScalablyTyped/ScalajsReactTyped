package typingsJapgolly.googleAppsScript.GoogleAppsScript.Forms

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.googleAppsScript.GoogleAppsScript.Integer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A question item, presented as a grid of columns and rows, that allows the respondent to select
  * multiple choices per row from a sequence of checkboxes. Items can be accessed or created from a
  * Form.
  *
  *     // Open a form by ID and add a new checkgox grid item.
  *     var form = FormApp.openById('1234567890abcdefghijklmnopqrstuvwxyz');
  *     var item = form.addCheckboxGridItem();
  *     item.setTitle('Where did you celebrate New Years?')
  *       .setRows(['New York', 'San Francisco', 'London'])
  *       .setColumns(['2014', '2015', '2016', '2017']);
  */
trait CheckboxGridItem extends js.Object {
  def clearValidation(): CheckboxGridItem
  def createResponse(responses: js.Array[js.Array[String]]): ItemResponse
  def duplicate(): CheckboxGridItem
  def getColumns(): js.Array[String]
  def getHelpText(): String
  def getId(): Integer
  def getIndex(): Integer
  def getRows(): js.Array[String]
  def getTitle(): String
  def getType(): ItemType
  def isRequired(): Boolean
  def setColumns(columns: js.Array[String]): CheckboxGridItem
  def setHelpText(text: String): CheckboxGridItem
  def setRequired(enabled: Boolean): CheckboxGridItem
  def setRows(rows: js.Array[String]): CheckboxGridItem
  def setTitle(title: String): CheckboxGridItem
  def setValidation(validation: CheckboxGridValidation): CheckboxGridItem
}

object CheckboxGridItem {
  @scala.inline
  def apply(
    clearValidation: CallbackTo[CheckboxGridItem],
    createResponse: js.Array[js.Array[String]] => CallbackTo[ItemResponse],
    duplicate: CallbackTo[CheckboxGridItem],
    getColumns: CallbackTo[js.Array[String]],
    getHelpText: CallbackTo[String],
    getId: CallbackTo[Integer],
    getIndex: CallbackTo[Integer],
    getRows: CallbackTo[js.Array[String]],
    getTitle: CallbackTo[String],
    getType: CallbackTo[ItemType],
    isRequired: CallbackTo[Boolean],
    setColumns: js.Array[String] => CallbackTo[CheckboxGridItem],
    setHelpText: String => CallbackTo[CheckboxGridItem],
    setRequired: Boolean => CallbackTo[CheckboxGridItem],
    setRows: js.Array[String] => CallbackTo[CheckboxGridItem],
    setTitle: String => CallbackTo[CheckboxGridItem],
    setValidation: CheckboxGridValidation => CallbackTo[CheckboxGridItem]
  ): CheckboxGridItem = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("clearValidation")(clearValidation.toJsFn)
    __obj.updateDynamic("createResponse")(js.Any.fromFunction1((t0: js.Array[js.Array[java.lang.String]]) => createResponse(t0).runNow()))
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
    __obj.updateDynamic("setValidation")(js.Any.fromFunction1((t0: typingsJapgolly.googleAppsScript.GoogleAppsScript.Forms.CheckboxGridValidation) => setValidation(t0).runNow()))
    __obj.asInstanceOf[CheckboxGridItem]
  }
}

