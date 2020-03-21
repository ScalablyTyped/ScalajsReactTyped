package typingsJapgolly.nwJs.mod._Global_.NWJSHelpers

import japgolly.scalajs.react.Callback
import typingsJapgolly.nwJs.AnonAddListener
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * This includes multiple functions to manipulate the cookies.
  */
trait Cookies extends js.Object {
  /**
    * Fired when a cookie is set or removed.
    */
  var onChanged: AnonAddListener
  /**
    * Retrieves information about a single cookie.
    *
    * @param details {Objet} Details to identify the cookie being retrieved.
    * @param callback {function(cookie?)} The callback when cookie retrieved.
    * - (Optional) cookie {Cookie} Contains details about the cookie. This parameter is null if no such cookie was found.
    */
  def get(details: CookiesGetDetails, callback: js.Function1[/* cookie */ js.UndefOr[Cookie], Unit]): Unit
  /**
    * Retrieves all cookies from a single cookie store that match the given information.
    *
    * @param details {Objet} Information to filter the cookies being retrieved.
    * @param callback {function(cookies?)} The callback when cookies retrieved.
    * - (Optional) cookies {Cookie[]} All the existing, unexpired cookies that match the given cookie info.
    */
  def getAll(
    details: CookiesGetAllDetails,
    callback: js.Function1[/* cookies */ js.UndefOr[js.Array[Cookie]], Unit]
  ): Unit
  /**
    * Deletes a cookie by name.
    *
    * @param details {Objet} Information to identify the cookie to remove.
    * @param callback {function(cookie?)} The callback when cookie has been set.
    * - (Optional) details {Objet} Contains details about the cookie that's been removed. If removal failed for any reason, this will be "null", and "chrome.runtime.lastError" will be set.
    */
  def remove(
    details: CookiesRemoveDetails,
    callback: js.Function1[/* details */ js.UndefOr[CookiesRemovedDetails], Unit]
  ): Unit
  /**
    * Sets a cookie with the given cookie data; may overwrite equivalent cookies if they exist.
    *
    * @param details {Objet} Details about the cookie being set.
    * @param callback {function(cookie?)} The callback when cookie has been set.
    * - (Optional) cookie {Cookie} Contains details about the cookie that's been set. If setting failed for any reason, this will be "null", and "chrome.runtime.lastError" will be set.
    */
  def set(details: CookiesSetDetails, callback: js.Function1[/* cookie */ js.UndefOr[Cookie], Unit]): Unit
}

object Cookies {
  @scala.inline
  def apply(
    get: (CookiesGetDetails, js.Function1[/* cookie */ js.UndefOr[Cookie], Unit]) => Callback,
    getAll: (CookiesGetAllDetails, js.Function1[/* cookies */ js.UndefOr[js.Array[Cookie]], Unit]) => Callback,
    onChanged: AnonAddListener,
    remove: (CookiesRemoveDetails, js.Function1[/* details */ js.UndefOr[CookiesRemovedDetails], Unit]) => Callback,
    set: (CookiesSetDetails, js.Function1[/* cookie */ js.UndefOr[Cookie], Unit]) => Callback
  ): Cookies = {
    val __obj = js.Dynamic.literal(onChanged = onChanged.asInstanceOf[js.Any])
    __obj.updateDynamic("get")(js.Any.fromFunction2((t0: typingsJapgolly.nwJs.mod._Global_.NWJSHelpers.CookiesGetDetails, t1: js.Function1[
  /* cookie */ js.UndefOr[typingsJapgolly.nwJs.mod._Global_.NWJSHelpers.Cookie], 
  scala.Unit]) => get(t0, t1).runNow()))
    __obj.updateDynamic("getAll")(js.Any.fromFunction2((t0: typingsJapgolly.nwJs.mod._Global_.NWJSHelpers.CookiesGetAllDetails, t1: js.Function1[
  /* cookies */ js.UndefOr[js.Array[typingsJapgolly.nwJs.mod._Global_.NWJSHelpers.Cookie]], 
  scala.Unit]) => getAll(t0, t1).runNow()))
    __obj.updateDynamic("remove")(js.Any.fromFunction2((t0: typingsJapgolly.nwJs.mod._Global_.NWJSHelpers.CookiesRemoveDetails, t1: js.Function1[
  /* details */ js.UndefOr[typingsJapgolly.nwJs.mod._Global_.NWJSHelpers.CookiesRemovedDetails], 
  scala.Unit]) => remove(t0, t1).runNow()))
    __obj.updateDynamic("set")(js.Any.fromFunction2((t0: typingsJapgolly.nwJs.mod._Global_.NWJSHelpers.CookiesSetDetails, t1: js.Function1[
  /* cookie */ js.UndefOr[typingsJapgolly.nwJs.mod._Global_.NWJSHelpers.Cookie], 
  scala.Unit]) => set(t0, t1).runNow()))
    __obj.asInstanceOf[Cookies]
  }
}

