package typingsJapgolly.chrome.global.chrome

import typingsJapgolly.chrome.chrome.cookies.Cookie
import typingsJapgolly.chrome.chrome.cookies.CookieChangedEvent
import typingsJapgolly.chrome.chrome.cookies.CookieStore
import typingsJapgolly.chrome.chrome.cookies.Details
import typingsJapgolly.chrome.chrome.cookies.GetAllDetails
import typingsJapgolly.chrome.chrome.cookies.SetDetails
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

////////////////////
// Cookies
////////////////////
/**
  * Use the chrome.cookies API to query and modify cookies, and to be notified when they change.
  * Availability: Since Chrome 6.
  * Permissions:  "cookies", host permissions
  */
object cookies {
  
  @JSGlobal("chrome.cookies")
  @js.native
  val ^ : js.Any = js.native
  
  inline def get(details: Details): js.Promise[Cookie | Null] = ^.asInstanceOf[js.Dynamic].applyDynamic("get")(details.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Cookie | Null]]
  inline def get(details: Details, callback: js.Function1[/* cookie */ Cookie | Null, Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(details.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def getAll(details: GetAllDetails): js.Promise[js.Array[Cookie]] = ^.asInstanceOf[js.Dynamic].applyDynamic("getAll")(details.asInstanceOf[js.Any]).asInstanceOf[js.Promise[js.Array[Cookie]]]
  inline def getAll(details: GetAllDetails, callback: js.Function1[/* cookies */ js.Array[Cookie], Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("getAll")(details.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def getAllCookieStores(): js.Promise[js.Array[CookieStore]] = ^.asInstanceOf[js.Dynamic].applyDynamic("getAllCookieStores")().asInstanceOf[js.Promise[js.Array[CookieStore]]]
  inline def getAllCookieStores(callback: js.Function1[/* cookieStores */ js.Array[CookieStore], Unit]): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("getAllCookieStores")(callback.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  @JSGlobal("chrome.cookies.onChanged")
  @js.native
  def onChanged: CookieChangedEvent = js.native
  inline def onChanged_=(x: CookieChangedEvent): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("onChanged")(x.asInstanceOf[js.Any])
  
  inline def remove(details: Details): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("remove")(details.asInstanceOf[js.Any]).asInstanceOf[Unit]
  inline def remove(details: Details, callback: js.Function1[/* details */ Details, Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("remove")(details.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def remove_Promise(details: Details): js.Promise[Details] = ^.asInstanceOf[js.Dynamic].applyDynamic("remove")(details.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Details]]
  
  inline def set(details: SetDetails): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("set")(details.asInstanceOf[js.Any]).asInstanceOf[Unit]
  inline def set(details: SetDetails, callback: js.Function1[/* cookie */ Cookie | Null, Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("set")(details.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def set_Promise(details: SetDetails): js.Promise[Cookie | Null] = ^.asInstanceOf[js.Dynamic].applyDynamic("set")(details.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Cookie | Null]]
}
