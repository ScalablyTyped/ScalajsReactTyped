package typingsJapgolly.toughCookieFileStore.mod

import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.toughCookie.mod.Cookie
import typingsJapgolly.toughCookie.mod.Store
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FileCookieStore extends Store {
  var filePath: String = js.native
  var idx: StringDictionary[StringDictionary[StringDictionary[Cookie]]] = js.native
  var synchronous: Boolean = js.native
  def checkExpired(): Boolean = js.native
  def checkExpired(domain: String): Boolean = js.native
  def checkExpired(domain: String, path: String): Boolean = js.native
  def checkExpired(domain: String, path: String, key: String): Boolean = js.native
  def checkExpired(domain: String, path: Null, key: String): Boolean = js.native
  def checkExpired(domain: Null, path: String): Boolean = js.native
  def checkExpired(domain: Null, path: String, key: String): Boolean = js.native
  def checkExpired(domain: Null, path: Null, key: String): Boolean = js.native
  def inspect(): String = js.native
  def isEmpty(): Boolean = js.native
  def isExpired(): Boolean = js.native
}

