package typingsJapgolly.angularCookies.mod.angularAugmentingMod.cookies

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * CookieStoreService DEPRECATED
  * see https://code.angularjs.org/1.2.26/docs/api/ngCookies/service/$cookieStore
  */
trait ICookieStoreService extends js.Object {
  /**
    * Returns the value of given cookie key
    * @param key Id to use for lookup
    */
  def get(key: String): js.Any
  /**
    * Sets a value for given cookie key
    * @param key Id for the value
    * @param value Value to be stored
    */
  def put(key: String, value: js.Any): Unit
  /**
    * Remove given cookie
    * @param key Id of the key-value pair to delete
    */
  def remove(key: String): Unit
}

object ICookieStoreService {
  @scala.inline
  def apply(get: String => CallbackTo[js.Any], put: (String, js.Any) => Callback, remove: String => Callback): ICookieStoreService = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("get")(js.Any.fromFunction1((t0: java.lang.String) => get(t0).runNow()))
    __obj.updateDynamic("put")(js.Any.fromFunction2((t0: java.lang.String, t1: js.Any) => put(t0, t1).runNow()))
    __obj.updateDynamic("remove")(js.Any.fromFunction1((t0: java.lang.String) => remove(t0).runNow()))
    __obj.asInstanceOf[ICookieStoreService]
  }
}

