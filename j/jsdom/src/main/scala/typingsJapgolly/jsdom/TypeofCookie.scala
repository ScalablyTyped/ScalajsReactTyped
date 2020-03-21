package typingsJapgolly.jsdom

import org.scalablytyped.runtime.Instantiable0
import typingsJapgolly.toughCookie.mod.Cookie
import typingsJapgolly.toughCookie.mod.Cookie.ParseOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TypeofCookie extends Instantiable0[Cookie] {
  def fromJSON(strOrObj: String): Cookie | Null = js.native
  def fromJSON(strOrObj: js.Object): Cookie | Null = js.native
  def parse(cookieString: String): js.UndefOr[Cookie] = js.native
  def parse(cookieString: String, options: ParseOptions): js.UndefOr[Cookie] = js.native
}

