package typingsJapgolly.nwJs.mod.global.NWJSHelpers

import japgolly.scalajs.react.Callback
import typingsJapgolly.nwJs.anon.AddListener
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * This includes multiple functions to manipulate the cookies.
  */
trait Cookies extends StObject {
  
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
    * Fired when a cookie is set or removed.
    */
  var onChanged: AddListener
  
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
  
  inline def apply(
    get: (CookiesGetDetails, js.Function1[/* cookie */ js.UndefOr[Cookie], Unit]) => Callback,
    getAll: (CookiesGetAllDetails, js.Function1[/* cookies */ js.UndefOr[js.Array[Cookie]], Unit]) => Callback,
    onChanged: AddListener,
    remove: (CookiesRemoveDetails, js.Function1[/* details */ js.UndefOr[CookiesRemovedDetails], Unit]) => Callback,
    set: (CookiesSetDetails, js.Function1[/* cookie */ js.UndefOr[Cookie], Unit]) => Callback
  ): Cookies = {
    val __obj = js.Dynamic.literal(get = js.Any.fromFunction2((t0: CookiesGetDetails, t1: js.Function1[/* cookie */ js.UndefOr[Cookie], Unit]) => (get(t0, t1)).runNow()), getAll = js.Any.fromFunction2((t0: CookiesGetAllDetails, t1: js.Function1[/* cookies */ js.UndefOr[js.Array[Cookie]], Unit]) => (getAll(t0, t1)).runNow()), onChanged = onChanged.asInstanceOf[js.Any], remove = js.Any.fromFunction2((t0: CookiesRemoveDetails, t1: js.Function1[/* details */ js.UndefOr[CookiesRemovedDetails], Unit]) => (remove(t0, t1)).runNow()), set = js.Any.fromFunction2((t0: CookiesSetDetails, t1: js.Function1[/* cookie */ js.UndefOr[Cookie], Unit]) => (set(t0, t1)).runNow()))
    __obj.asInstanceOf[Cookies]
  }
  
  extension [Self <: Cookies](x: Self) {
    
    inline def setGet(value: (CookiesGetDetails, js.Function1[/* cookie */ js.UndefOr[Cookie], Unit]) => Callback): Self = StObject.set(x, "get", js.Any.fromFunction2((t0: CookiesGetDetails, t1: js.Function1[/* cookie */ js.UndefOr[Cookie], Unit]) => (value(t0, t1)).runNow()))
    
    inline def setGetAll(
      value: (CookiesGetAllDetails, js.Function1[/* cookies */ js.UndefOr[js.Array[Cookie]], Unit]) => Callback
    ): Self = StObject.set(x, "getAll", js.Any.fromFunction2((t0: CookiesGetAllDetails, t1: js.Function1[/* cookies */ js.UndefOr[js.Array[Cookie]], Unit]) => (value(t0, t1)).runNow()))
    
    inline def setOnChanged(value: AddListener): Self = StObject.set(x, "onChanged", value.asInstanceOf[js.Any])
    
    inline def setRemove(
      value: (CookiesRemoveDetails, js.Function1[/* details */ js.UndefOr[CookiesRemovedDetails], Unit]) => Callback
    ): Self = StObject.set(x, "remove", js.Any.fromFunction2((t0: CookiesRemoveDetails, t1: js.Function1[/* details */ js.UndefOr[CookiesRemovedDetails], Unit]) => (value(t0, t1)).runNow()))
    
    inline def setSet(value: (CookiesSetDetails, js.Function1[/* cookie */ js.UndefOr[Cookie], Unit]) => Callback): Self = StObject.set(x, "set", js.Any.fromFunction2((t0: CookiesSetDetails, t1: js.Function1[/* cookie */ js.UndefOr[Cookie], Unit]) => (value(t0, t1)).runNow()))
  }
}
