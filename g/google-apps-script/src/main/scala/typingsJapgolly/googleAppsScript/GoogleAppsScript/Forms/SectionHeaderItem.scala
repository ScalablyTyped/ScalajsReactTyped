package typingsJapgolly.googleAppsScript.GoogleAppsScript.Forms

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.googleAppsScript.GoogleAppsScript.Integer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A layout item that visually indicates the start of a section. Items can be accessed or created
  * from a Form.
  *
  *     // Open a form by ID and add a new section header.
  *     var form = FormApp.openById('1234567890abcdefghijklmnopqrstuvwxyz');
  *     var item = form.addSectionHeaderItem();
  *     item.setTitle('Title of new section');
  */
trait SectionHeaderItem extends js.Object {
  def duplicate(): SectionHeaderItem
  def getHelpText(): String
  def getId(): Integer
  def getIndex(): Integer
  def getTitle(): String
  def getType(): ItemType
  def setHelpText(text: String): SectionHeaderItem
  def setTitle(title: String): SectionHeaderItem
}

object SectionHeaderItem {
  @scala.inline
  def apply(
    duplicate: CallbackTo[SectionHeaderItem],
    getHelpText: CallbackTo[String],
    getId: CallbackTo[Integer],
    getIndex: CallbackTo[Integer],
    getTitle: CallbackTo[String],
    getType: CallbackTo[ItemType],
    setHelpText: String => CallbackTo[SectionHeaderItem],
    setTitle: String => CallbackTo[SectionHeaderItem]
  ): SectionHeaderItem = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("duplicate")(duplicate.toJsFn)
    __obj.updateDynamic("getHelpText")(getHelpText.toJsFn)
    __obj.updateDynamic("getId")(getId.toJsFn)
    __obj.updateDynamic("getIndex")(getIndex.toJsFn)
    __obj.updateDynamic("getTitle")(getTitle.toJsFn)
    __obj.updateDynamic("getType")(getType.toJsFn)
    __obj.updateDynamic("setHelpText")(js.Any.fromFunction1((t0: java.lang.String) => setHelpText(t0).runNow()))
    __obj.updateDynamic("setTitle")(js.Any.fromFunction1((t0: java.lang.String) => setTitle(t0).runNow()))
    __obj.asInstanceOf[SectionHeaderItem]
  }
}

