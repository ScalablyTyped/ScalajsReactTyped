package typingsJapgolly.toughCookieFilestore.mod

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FileCookieStore extends js.Object {
  var filePath: String
  var idx: StringDictionary[StringDictionary[StringDictionary[Cookie]]]
  var synchronous: Boolean
  def findCookie(
    domain: String,
    path: String,
    key: String,
    cb: js.Function2[/* whatever */ Null, /* cookie */ js.UndefOr[Cookie | Null], Unit]
  ): Unit
  def findCookies(
    domain: String,
    path: String,
    cb: js.Function2[/* whatever */ Null, /* cookies */ js.Array[Cookie], Unit]
  ): Unit
  def inspect(): String
  def loadFromFile(filePath: String, cb: js.Function1[/* data */ js.Any, Unit]): Unit
  def putCookie(cookie: Cookie, path: String, key: String, cb: js.Function1[/* whatever */ Null, Unit]): Unit
  def removeCookie(domain: String, path: String, key: String, cb: js.Function1[/* whatever */ Null, Unit]): Unit
  def removeCookies(domain: String, path: String, cb: js.Function1[/* whatever */ Null, Unit]): Unit
  def saveToFile(filePath: String, data: js.Any, cb: js.Function0[Unit]): Unit
  def updateCookie(oldCookie: Cookie, newCookie: Cookie, cb: js.Function1[/* whatever */ Null, Unit]): Unit
}

object FileCookieStore {
  @scala.inline
  def apply(
    filePath: String,
    findCookie: (String, String, String, js.Function2[/* whatever */ Null, /* cookie */ js.UndefOr[Cookie | Null], Unit]) => Callback,
    findCookies: (String, String, js.Function2[/* whatever */ Null, /* cookies */ js.Array[Cookie], Unit]) => Callback,
    idx: StringDictionary[StringDictionary[StringDictionary[Cookie]]],
    inspect: CallbackTo[String],
    loadFromFile: (String, js.Function1[/* data */ js.Any, Unit]) => Callback,
    putCookie: (Cookie, String, String, js.Function1[/* whatever */ Null, Unit]) => Callback,
    removeCookie: (String, String, String, js.Function1[/* whatever */ Null, Unit]) => Callback,
    removeCookies: (String, String, js.Function1[/* whatever */ Null, Unit]) => Callback,
    saveToFile: (String, js.Any, js.Function0[Unit]) => Callback,
    synchronous: Boolean,
    updateCookie: (Cookie, Cookie, js.Function1[/* whatever */ Null, Unit]) => Callback
  ): FileCookieStore = {
    val __obj = js.Dynamic.literal(filePath = filePath.asInstanceOf[js.Any], idx = idx.asInstanceOf[js.Any], synchronous = synchronous.asInstanceOf[js.Any])
    __obj.updateDynamic("findCookie")(js.Any.fromFunction4((t0: java.lang.String, t1: java.lang.String, t2: java.lang.String, t3: js.Function2[
  /* whatever */ scala.Null, 
  /* cookie */ js.UndefOr[typingsJapgolly.toughCookieFilestore.mod.Cookie | scala.Null], 
  scala.Unit]) => findCookie(t0, t1, t2, t3).runNow()))
    __obj.updateDynamic("findCookies")(js.Any.fromFunction3((t0: java.lang.String, t1: java.lang.String, t2: js.Function2[
  /* whatever */ scala.Null, 
  /* cookies */ js.Array[typingsJapgolly.toughCookieFilestore.mod.Cookie], 
  scala.Unit]) => findCookies(t0, t1, t2).runNow()))
    __obj.updateDynamic("inspect")(inspect.toJsFn)
    __obj.updateDynamic("loadFromFile")(js.Any.fromFunction2((t0: java.lang.String, t1: js.Function1[/* data */ js.Any, scala.Unit]) => loadFromFile(t0, t1).runNow()))
    __obj.updateDynamic("putCookie")(js.Any.fromFunction4((t0: typingsJapgolly.toughCookieFilestore.mod.Cookie, t1: java.lang.String, t2: java.lang.String, t3: js.Function1[/* whatever */ scala.Null, scala.Unit]) => putCookie(t0, t1, t2, t3).runNow()))
    __obj.updateDynamic("removeCookie")(js.Any.fromFunction4((t0: java.lang.String, t1: java.lang.String, t2: java.lang.String, t3: js.Function1[/* whatever */ scala.Null, scala.Unit]) => removeCookie(t0, t1, t2, t3).runNow()))
    __obj.updateDynamic("removeCookies")(js.Any.fromFunction3((t0: java.lang.String, t1: java.lang.String, t2: js.Function1[/* whatever */ scala.Null, scala.Unit]) => removeCookies(t0, t1, t2).runNow()))
    __obj.updateDynamic("saveToFile")(js.Any.fromFunction3((t0: java.lang.String, t1: js.Any, t2: js.Function0[scala.Unit]) => saveToFile(t0, t1, t2).runNow()))
    __obj.updateDynamic("updateCookie")(js.Any.fromFunction3((t0: typingsJapgolly.toughCookieFilestore.mod.Cookie, t1: typingsJapgolly.toughCookieFilestore.mod.Cookie, t2: js.Function1[/* whatever */ scala.Null, scala.Unit]) => updateCookie(t0, t1, t2).runNow()))
    __obj.asInstanceOf[FileCookieStore]
  }
}

