package typingsJapgolly.googleAppsScript.GoogleAppsScript.Sites

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.googleAppsScript.GoogleAppsScript.Base.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A Comment attached to any Sites page.
  * A rebuilt
  * version of Sites was launched on November 22, 2016. Apps Script cannot currently access or
  * modify Sites made with this version, but script can still access
  * classic Sites.
  */
trait Comment extends js.Object {
  def deleteComment(): Unit
  def getAuthorEmail(): String
  def getAuthorName(): String
  def getContent(): String
  def getDatePublished(): Date
  def getLastUpdated(): Date
  def getParent(): Page
  def setContent(content: String): Comment
  def setParent(parent: Page): Comment
}

object Comment {
  @scala.inline
  def apply(
    deleteComment: Callback,
    getAuthorEmail: CallbackTo[String],
    getAuthorName: CallbackTo[String],
    getContent: CallbackTo[String],
    getDatePublished: CallbackTo[Date],
    getLastUpdated: CallbackTo[Date],
    getParent: CallbackTo[Page],
    setContent: String => CallbackTo[Comment],
    setParent: Page => CallbackTo[Comment]
  ): Comment = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("deleteComment")(deleteComment.toJsFn)
    __obj.updateDynamic("getAuthorEmail")(getAuthorEmail.toJsFn)
    __obj.updateDynamic("getAuthorName")(getAuthorName.toJsFn)
    __obj.updateDynamic("getContent")(getContent.toJsFn)
    __obj.updateDynamic("getDatePublished")(getDatePublished.toJsFn)
    __obj.updateDynamic("getLastUpdated")(getLastUpdated.toJsFn)
    __obj.updateDynamic("getParent")(getParent.toJsFn)
    __obj.updateDynamic("setContent")(js.Any.fromFunction1((t0: java.lang.String) => setContent(t0).runNow()))
    __obj.updateDynamic("setParent")(js.Any.fromFunction1((t0: typingsJapgolly.googleAppsScript.GoogleAppsScript.Sites.Page) => setParent(t0).runNow()))
    __obj.asInstanceOf[Comment]
  }
}

