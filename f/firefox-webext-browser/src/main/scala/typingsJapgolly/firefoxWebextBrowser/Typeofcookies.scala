package typingsJapgolly.firefoxWebextBrowser

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.firefoxWebextBrowser.browser.cookies.Cookie
import typingsJapgolly.firefoxWebextBrowser.browser.cookies.CookieStore
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Typeofcookies extends js.Object {
  /* cookies events */
  /**
    * Fired when a cookie is set or removed. As a special case, note that updating a cookie's properties is
    * implemented as a two step process: the cookie to be updated is first removed entirely, generating a notification
    * with "cause" of "overwrite" . Afterwards, a new cookie is written with the updated values, generating a second
    * notification with "cause" "explicit".
    */
  val onChanged: WebExtEvent[js.Function1[/* changeInfo */ AnonCause, Unit]]
  /* cookies functions */
  /**
    * Retrieves information about a single cookie. If more than one cookie of the same name exists for the given URL,
    * the one with the longest path will be returned. For cookies with the same path length, the cookie with the
    * earliest creation time will be returned.
    * @param details Details to identify the cookie being retrieved.
    */
  def get(details: AnonFirstPartyDomain): js.Promise[Cookie]
  /**
    * Retrieves all cookies from a single cookie store that match the given information. The cookies returned will be
    * sorted, with those with the longest path first. If multiple cookies have the same path length, those with the
    * earliest creation time will be first.
    * @param details Information to filter the cookies being retrieved.
    */
  def getAll(details: AnonDomain): js.Promise[js.Array[Cookie]]
  /** Lists all existing cookie stores. */
  def getAllCookieStores(): js.Promise[js.Array[CookieStore]]
  /**
    * Deletes a cookie by name.
    * @param details Information to identify the cookie to remove.
    */
  def remove(details: AnonFirstPartyDomain): js.Promise[AnonStoreId]
  /**
    * Sets a cookie with the given cookie data; may overwrite equivalent cookies if they exist.
    * @param details Details about the cookie being set.
    */
  def set(details: AnonExpirationDate): js.Promise[Cookie]
}

object Typeofcookies {
  @scala.inline
  def apply(
    get: AnonFirstPartyDomain => CallbackTo[js.Promise[Cookie]],
    getAll: AnonDomain => CallbackTo[js.Promise[js.Array[Cookie]]],
    getAllCookieStores: CallbackTo[js.Promise[js.Array[CookieStore]]],
    onChanged: WebExtEvent[js.Function1[/* changeInfo */ AnonCause, Unit]],
    remove: AnonFirstPartyDomain => CallbackTo[js.Promise[AnonStoreId]],
    set: AnonExpirationDate => CallbackTo[js.Promise[Cookie]]
  ): Typeofcookies = {
    val __obj = js.Dynamic.literal(onChanged = onChanged.asInstanceOf[js.Any])
    __obj.updateDynamic("get")(js.Any.fromFunction1((t0: typingsJapgolly.firefoxWebextBrowser.AnonFirstPartyDomain) => get(t0).runNow()))
    __obj.updateDynamic("getAll")(js.Any.fromFunction1((t0: typingsJapgolly.firefoxWebextBrowser.AnonDomain) => getAll(t0).runNow()))
    __obj.updateDynamic("getAllCookieStores")(getAllCookieStores.toJsFn)
    __obj.updateDynamic("remove")(js.Any.fromFunction1((t0: typingsJapgolly.firefoxWebextBrowser.AnonFirstPartyDomain) => remove(t0).runNow()))
    __obj.updateDynamic("set")(js.Any.fromFunction1((t0: typingsJapgolly.firefoxWebextBrowser.AnonExpirationDate) => set(t0).runNow()))
    __obj.asInstanceOf[Typeofcookies]
  }
}

