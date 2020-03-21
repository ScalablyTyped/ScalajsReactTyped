package typingsJapgolly.reactCookies

import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.cookie.mod.CookieSerializeOptions
import typingsJapgolly.express.mod.Request_
import typingsJapgolly.express.mod.Response_
import typingsJapgolly.expressServeStaticCore.mod.ParamsDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("react-cookies", JSImport.Namespace)
@js.native
object mod extends js.Object {
  def load(name: String): js.Any = js.native
  def load(name: String, doNotParse: Boolean): js.Any = js.native
  def loadAll(): StringDictionary[js.Any] = js.native
  def loadAll(doNotParse: Boolean): StringDictionary[js.Any] = js.native
  def plugToRequest(req: Request_[ParamsDictionary], res: Response_): js.Function0[Unit] = js.native
  def remove(name: String): Unit = js.native
  def remove(name: String, opt: CookieSerializeOptions): Unit = js.native
  def save(name: String, `val`: String, opt: CookieSerializeOptions): Unit = js.native
  def save(name: String, `val`: js.Object, opt: CookieSerializeOptions): Unit = js.native
  def save(name: String, `val`: Double, opt: CookieSerializeOptions): Unit = js.native
  def select(): StringDictionary[js.Any] = js.native
  def select(regex: js.RegExp): StringDictionary[js.Any] = js.native
  def setRawCookie(): Unit = js.native
  def setRawCookie(rawCookie: String): Unit = js.native
}

