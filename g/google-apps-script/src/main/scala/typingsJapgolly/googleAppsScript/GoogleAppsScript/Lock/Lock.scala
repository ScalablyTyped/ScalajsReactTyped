package typingsJapgolly.googleAppsScript.GoogleAppsScript.Lock

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.googleAppsScript.GoogleAppsScript.Integer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A representation of a mutual-exclusion lock.
  *
  * This class allows scripts to make sure that only one instance of the script is executing a
  * given section of code at a time. This is particularly useful for callbacks and triggers, where a
  * user action may cause changes to a shared resource and you want to ensure that aren't collisions.
  *
  * The following examples shows how to use a lock in a form submit handler.
  *
  *     // Generates a unique ticket number for every form submission.
  *     function onFormSubmit(e) {
  *       var targetCell = e.range.offset(0, e.range.getNumColumns(), 1, 1);
  *
  *       // Get a script lock, because we're about to modify a shared resource.
  *       var lock = LockService.getScriptLock();
  *       // Wait for up to 30 seconds for other processes to finish.
  *       lock.waitLock(30000);
  *
  *       var ticketNumber = Number(ScriptProperties.getProperty('lastTicketNumber')) + 1;
  *       ScriptProperties.setProperty('lastTicketNumber', ticketNumber);
  *
  *       // Release the lock so that other processes can continue.
  *       lock.releaseLock();
  *
  *       targetCell.setValue(ticketNumber);
  *     }
  *
  * lastTicketNumber
  * ScriptProperties
  */
trait Lock extends js.Object {
  def hasLock(): Boolean
  def releaseLock(): Unit
  def tryLock(timeoutInMillis: Integer): Boolean
  def waitLock(timeoutInMillis: Integer): Unit
}

object Lock {
  @scala.inline
  def apply(
    hasLock: CallbackTo[Boolean],
    releaseLock: Callback,
    tryLock: Integer => CallbackTo[Boolean],
    waitLock: Integer => Callback
  ): Lock = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("hasLock")(hasLock.toJsFn)
    __obj.updateDynamic("releaseLock")(releaseLock.toJsFn)
    __obj.updateDynamic("tryLock")(js.Any.fromFunction1((t0: typingsJapgolly.googleAppsScript.GoogleAppsScript.Integer) => tryLock(t0).runNow()))
    __obj.updateDynamic("waitLock")(js.Any.fromFunction1((t0: typingsJapgolly.googleAppsScript.GoogleAppsScript.Integer) => waitLock(t0).runNow()))
    __obj.asInstanceOf[Lock]
  }
}

