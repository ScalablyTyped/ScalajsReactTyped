package typingsJapgolly.nodemailer.cookiesMod

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Creates a biskviit cookie jar for managing cookie values in memory */
trait Cookies extends js.Object {
  var cookies: js.Array[Cookie]
  var options: Options
  /** Adds (or updates/removes if needed) a cookie object to the cookie storage */
  def add(cookie: Cookie): Boolean
  /** Checks if two cookie objects are the same */
  def compare(a: Cookie, b: Cookie): Boolean
  /** Returns cookie string for the 'Cookie:' header. */
  def get(url: String): String
  /** Returns normalized cookie path for an URL path argument */
  def getPath(pathname: String): String
  /** Checks if a cookie is expired */
  def isExpired(cookie: Cookie): Boolean
  /** Lists all valied cookie objects for the specified URL */
  def list(url: String): js.Array[Cookie]
  /** Checks if a cookie object is valid for a specified URL */
  def `match`(cookie: Cookie, url: String): Boolean
  /** Parses cookie string from the 'Set-Cookie:' header */
  def parse(cookieStr: String): Cookie
  /** Stores a cookie string to the cookie storage */
  def set(cookieStr: String, url: String): Boolean
}

object Cookies {
  @scala.inline
  def apply(
    add: Cookie => CallbackTo[Boolean],
    compare: (Cookie, Cookie) => CallbackTo[Boolean],
    cookies: js.Array[Cookie],
    get: String => CallbackTo[String],
    getPath: String => CallbackTo[String],
    isExpired: Cookie => CallbackTo[Boolean],
    list: String => CallbackTo[js.Array[Cookie]],
    `match`: (Cookie, String) => CallbackTo[Boolean],
    options: Options,
    parse: String => CallbackTo[Cookie],
    set: (String, String) => CallbackTo[Boolean]
  ): Cookies = {
    val __obj = js.Dynamic.literal(cookies = cookies.asInstanceOf[js.Any], options = options.asInstanceOf[js.Any])
    __obj.updateDynamic("add")(js.Any.fromFunction1((t0: typingsJapgolly.nodemailer.cookiesMod.Cookie) => add(t0).runNow()))
    __obj.updateDynamic("compare")(js.Any.fromFunction2((t0: typingsJapgolly.nodemailer.cookiesMod.Cookie, t1: typingsJapgolly.nodemailer.cookiesMod.Cookie) => compare(t0, t1).runNow()))
    __obj.updateDynamic("get")(js.Any.fromFunction1((t0: java.lang.String) => get(t0).runNow()))
    __obj.updateDynamic("getPath")(js.Any.fromFunction1((t0: java.lang.String) => getPath(t0).runNow()))
    __obj.updateDynamic("isExpired")(js.Any.fromFunction1((t0: typingsJapgolly.nodemailer.cookiesMod.Cookie) => isExpired(t0).runNow()))
    __obj.updateDynamic("list")(js.Any.fromFunction1((t0: java.lang.String) => list(t0).runNow()))
    __obj.updateDynamic("match")(js.Any.fromFunction2((t0: typingsJapgolly.nodemailer.cookiesMod.Cookie, t1: java.lang.String) => `match`(t0, t1).runNow()))
    __obj.updateDynamic("parse")(js.Any.fromFunction1((t0: java.lang.String) => parse(t0).runNow()))
    __obj.updateDynamic("set")(js.Any.fromFunction2((t0: java.lang.String, t1: java.lang.String) => set(t0, t1).runNow()))
    __obj.asInstanceOf[Cookies]
  }
}

