package typingsJapgolly.jsdom.mod

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.TopLevel
import typingsJapgolly.jsdom.TypeofCookie
import typingsJapgolly.jsdom.TypeofCookieJar
import typingsJapgolly.toughCookie.mod.Cookie
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("jsdom", "toughCookie")
@js.native
object toughCookie extends js.Object {
  @js.native
  class MemoryCookieStore ()
    extends typingsJapgolly.toughCookie.mod.MemoryCookieStore
  
  @js.native
  class Store ()
    extends typingsJapgolly.toughCookie.mod.Store
  
  var Cookie: js.Any | TypeofCookie = js.native
  var CookieJar: js.Any | TypeofCookieJar = js.native
  def canonicalDomain(str: String): String = js.native
  def cookieCompare(a: Cookie, b: Cookie): Double = js.native
  def defaultPath(path: String): String = js.native
  def domainMatch(str: String, domStr: String): Boolean = js.native
  def domainMatch(str: String, domStr: String, canonicalize: Boolean): Boolean = js.native
  def formatDate(date: js.Date): String = js.native
  def fromJSON(string: String): Cookie = js.native
  def getPublicSuffix(hostname: String): String | Null = js.native
  def parseDate(string: String): js.Date = js.native
  def pathMatch(reqPath: String, cookiePath: String): Boolean = js.native
  def permuteDomain(domain: String): js.Array[String] = js.native
  def permutePath(path: String): js.Array[String] = js.native
  @js.native
  object MemoryCookieStore
    extends TopLevel[Instantiable0[typingsJapgolly.toughCookie.mod.MemoryCookieStore]]
  
  @js.native
  object Store
    extends TopLevel[Instantiable0[typingsJapgolly.toughCookie.mod.Store]]
  
}

