package typingsJapgolly.googleAppsScript.GoogleAppsScript.Sites

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.googleAppsScript.GoogleAppsScript.Base.Date
import typingsJapgolly.googleAppsScript.GoogleAppsScript.Integer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A Sites ListItem - a list element from a Sites List page.
  * A rebuilt
  * version of Sites was launched on November 22, 2016. Apps Script cannot currently access or
  * modify Sites made with this version, but script can still access
  * classic Sites.
  */
trait ListItem extends js.Object {
  def deleteListItem(): Unit
  def getDatePublished(): Date
  def getLastUpdated(): Date
  def getParent(): Page
  def getValueByIndex(index: Integer): String
  def getValueByName(name: String): String
  def setParent(parent: Page): ListItem
  def setValueByIndex(index: Integer, value: String): ListItem
  def setValueByName(name: String, value: String): ListItem
}

object ListItem {
  @scala.inline
  def apply(
    deleteListItem: Callback,
    getDatePublished: CallbackTo[Date],
    getLastUpdated: CallbackTo[Date],
    getParent: CallbackTo[Page],
    getValueByIndex: Integer => CallbackTo[String],
    getValueByName: String => CallbackTo[String],
    setParent: Page => CallbackTo[ListItem],
    setValueByIndex: (Integer, String) => CallbackTo[ListItem],
    setValueByName: (String, String) => CallbackTo[ListItem]
  ): ListItem = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("deleteListItem")(deleteListItem.toJsFn)
    __obj.updateDynamic("getDatePublished")(getDatePublished.toJsFn)
    __obj.updateDynamic("getLastUpdated")(getLastUpdated.toJsFn)
    __obj.updateDynamic("getParent")(getParent.toJsFn)
    __obj.updateDynamic("getValueByIndex")(js.Any.fromFunction1((t0: typingsJapgolly.googleAppsScript.GoogleAppsScript.Integer) => getValueByIndex(t0).runNow()))
    __obj.updateDynamic("getValueByName")(js.Any.fromFunction1((t0: java.lang.String) => getValueByName(t0).runNow()))
    __obj.updateDynamic("setParent")(js.Any.fromFunction1((t0: typingsJapgolly.googleAppsScript.GoogleAppsScript.Sites.Page) => setParent(t0).runNow()))
    __obj.updateDynamic("setValueByIndex")(js.Any.fromFunction2((t0: typingsJapgolly.googleAppsScript.GoogleAppsScript.Integer, t1: java.lang.String) => setValueByIndex(t0, t1).runNow()))
    __obj.updateDynamic("setValueByName")(js.Any.fromFunction2((t0: java.lang.String, t1: java.lang.String) => setValueByName(t0, t1).runNow()))
    __obj.asInstanceOf[ListItem]
  }
}

