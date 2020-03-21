package typingsJapgolly.googleAppsScript.GoogleAppsScript.Slides

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A list in the text.
  */
trait List extends js.Object {
  def getListId(): String
  def getListParagraphs(): js.Array[Paragraph]
}

object List {
  @scala.inline
  def apply(getListId: CallbackTo[String], getListParagraphs: CallbackTo[js.Array[Paragraph]]): List = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("getListId")(getListId.toJsFn)
    __obj.updateDynamic("getListParagraphs")(getListParagraphs.toJsFn)
    __obj.asInstanceOf[List]
  }
}

