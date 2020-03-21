package typingsJapgolly.googleAppsScript.GoogleAppsScript.Sites

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A Sites Column - a column from a Sites List page.
  * A rebuilt
  * version of Sites was launched on November 22, 2016. Apps Script cannot currently access or
  * modify Sites made with this version, but script can still access
  * classic Sites.
  */
trait Column extends js.Object {
  def deleteColumn(): Unit
  def getName(): String
  def getParent(): Page
  def setName(name: String): Column
}

object Column {
  @scala.inline
  def apply(
    deleteColumn: Callback,
    getName: CallbackTo[String],
    getParent: CallbackTo[Page],
    setName: String => CallbackTo[Column]
  ): Column = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("deleteColumn")(deleteColumn.toJsFn)
    __obj.updateDynamic("getName")(getName.toJsFn)
    __obj.updateDynamic("getParent")(getParent.toJsFn)
    __obj.updateDynamic("setName")(js.Any.fromFunction1((t0: java.lang.String) => setName(t0).runNow()))
    __obj.asInstanceOf[Column]
  }
}

