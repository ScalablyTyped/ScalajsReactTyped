package typingsJapgolly.googleAppsScript.GoogleAppsScript.Lock

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Prevents concurrent access to sections of code. This can be useful when you have multiple users
  * or processes modifying a shared resource and want to prevent collisions.
  */
trait LockService extends js.Object {
  def getDocumentLock(): typingsJapgolly.googleAppsScript.GoogleAppsScript.Lock.Lock
  def getScriptLock(): typingsJapgolly.googleAppsScript.GoogleAppsScript.Lock.Lock
  def getUserLock(): typingsJapgolly.googleAppsScript.GoogleAppsScript.Lock.Lock
}

object LockService {
  @scala.inline
  def apply(
    getDocumentLock: CallbackTo[typingsJapgolly.googleAppsScript.GoogleAppsScript.Lock.Lock],
    getScriptLock: CallbackTo[typingsJapgolly.googleAppsScript.GoogleAppsScript.Lock.Lock],
    getUserLock: CallbackTo[typingsJapgolly.googleAppsScript.GoogleAppsScript.Lock.Lock]
  ): LockService = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("getDocumentLock")(getDocumentLock.toJsFn)
    __obj.updateDynamic("getScriptLock")(getScriptLock.toJsFn)
    __obj.updateDynamic("getUserLock")(getUserLock.toJsFn)
    __obj.asInstanceOf[LockService]
  }
}

