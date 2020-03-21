package typingsJapgolly.naverWhale

import typingsJapgolly.chrome.chrome.cookies.Cookie
import typingsJapgolly.chrome.chrome.cookies.CookieChangedEvent
import typingsJapgolly.chrome.chrome.cookies.CookieStore
import typingsJapgolly.chrome.chrome.cookies.Details
import typingsJapgolly.chrome.chrome.cookies.GetAllDetails
import typingsJapgolly.chrome.chrome.cookies.SetDetails
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Typeofcookies extends js.Object {
  var onChanged: CookieChangedEvent = js.native
  def get(details: Details, callback: js.Function1[/* cookie */ Cookie | Null, Unit]): Unit = js.native
  def getAll(details: GetAllDetails, callback: js.Function1[/* cookies */ js.Array[Cookie], Unit]): Unit = js.native
  def getAllCookieStores(callback: js.Function1[/* cookieStores */ js.Array[CookieStore], Unit]): Unit = js.native
  def remove(details: Details): Unit = js.native
  def remove(details: Details, callback: js.Function1[/* details */ Details, Unit]): Unit = js.native
  def set(details: SetDetails): Unit = js.native
  def set(details: SetDetails, callback: js.Function1[/* cookie */ Cookie | Null, Unit]): Unit = js.native
}

