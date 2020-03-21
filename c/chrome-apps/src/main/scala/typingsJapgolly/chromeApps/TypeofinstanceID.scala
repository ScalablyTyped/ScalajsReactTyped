package typingsJapgolly.chromeApps

import japgolly.scalajs.react.Callback
import typingsJapgolly.chromeApps.chrome.events.Event
import typingsJapgolly.chromeApps.chrome.instanceID.DeleteTokenParams
import typingsJapgolly.chromeApps.chrome.instanceID.TokenParams
import typingsJapgolly.chromeApps.chrome.integer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TypeofinstanceID extends js.Object {
  /** Fired when all the granted tokens need to be refreshed. */
  val onTokenRefresh: Event[js.Function0[Unit]]
  /**
    * Fired when all the granted tokens need to be refreshed.
    * @param callback Function called when the deletion completes.
    *                 The instance identifier was revoked successfully if runtime.lastError is not set.
    */
  def deleteID(callback: js.Function0[Unit]): Unit
  /**
    * Revokes a granted token.
    * @param deleteTokenParams Parameters for deleteToken.
    * @param callback Function called when the token deletion completes.
    *                 The token was revoked successfully if runtime.lastError is not set.
    */
  def deleteToken(deleteTokenParams: DeleteTokenParams, callback: js.Function0[Unit]): Unit
  /**
    * Retrieves the time when the InstanceID has been generated.
    * The creation time will be returned by the callback.
    * @param callback Function called when the retrieval completes.
    *                 It should check runtime.lastError for error when creationTime is zero.
    *                 Provides `creationTime` (double)
    *                  > The time when the Instance ID has been generated, represented in milliseconds since the epoch.
    */
  def getCreationTime(callback: js.Function1[/* creationTime */ integer, Unit]): Unit
  /**
    * Retrieves an identifier for the app instance.
    * The instance ID will be returned by the callback.
    * The same ID will be returned as long as the application
    * identity has not been revoked or expired.
    * @param callback Function called when the retrieval completes.
    *                 It should check runtime.lastError for error when instanceID is empty.
    *                 Will be provided with instanceID: An Instance ID assigned to the app instance.
    */
  def getID(callback: js.Function1[/* instanceId */ String, Unit]): Unit
  /**
    * Return a token that allows the authorized entity to access the service defined by scope.
    * @param getTokenParams Parameters for getToken.
    * @param callback Function called when the retrieval completes. It should check runtime.lastError for error when token is empty.
    */
  def getToken(getTokenParams: TokenParams, callback: js.Function1[/* token */ String, Unit]): Unit
}

object TypeofinstanceID {
  @scala.inline
  def apply(
    deleteID: js.Function0[Unit] => Callback,
    deleteToken: (DeleteTokenParams, js.Function0[Unit]) => Callback,
    getCreationTime: js.Function1[/* creationTime */ integer, Unit] => Callback,
    getID: js.Function1[/* instanceId */ String, Unit] => Callback,
    getToken: (TokenParams, js.Function1[/* token */ String, Unit]) => Callback,
    onTokenRefresh: Event[js.Function0[Unit]]
  ): TypeofinstanceID = {
    val __obj = js.Dynamic.literal(onTokenRefresh = onTokenRefresh.asInstanceOf[js.Any])
    __obj.updateDynamic("deleteID")(js.Any.fromFunction1((t0: js.Function0[scala.Unit]) => deleteID(t0).runNow()))
    __obj.updateDynamic("deleteToken")(js.Any.fromFunction2((t0: typingsJapgolly.chromeApps.chrome.instanceID.DeleteTokenParams, t1: js.Function0[scala.Unit]) => deleteToken(t0, t1).runNow()))
    __obj.updateDynamic("getCreationTime")(js.Any.fromFunction1((t0: js.Function1[/* creationTime */ typingsJapgolly.chromeApps.chrome.integer, scala.Unit]) => getCreationTime(t0).runNow()))
    __obj.updateDynamic("getID")(js.Any.fromFunction1((t0: js.Function1[/* instanceId */ java.lang.String, scala.Unit]) => getID(t0).runNow()))
    __obj.updateDynamic("getToken")(js.Any.fromFunction2((t0: typingsJapgolly.chromeApps.chrome.instanceID.TokenParams, t1: js.Function1[/* token */ java.lang.String, scala.Unit]) => getToken(t0, t1).runNow()))
    __obj.asInstanceOf[TypeofinstanceID]
  }
}

