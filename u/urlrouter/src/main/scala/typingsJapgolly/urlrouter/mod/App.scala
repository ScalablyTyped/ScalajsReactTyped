package typingsJapgolly.urlrouter.mod

import japgolly.scalajs.react.Callback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait App extends js.Object {
  def all(urlpattern: String, handler: HttpHandler): Unit
  def checkout(urlpattern: String, handler: HttpHandler): Unit
  def copy(urlpattern: String, handler: HttpHandler): Unit
  def delete(urlpattern: String, handler: HttpHandler): Unit
  // https://github.com/visionmedia/node-methods/blob/master/index.js
  def get(urlpattern: String, handler: HttpHandler): Unit
  def head(urlpattern: String, handler: HttpHandler): Unit
  def lock(urlpattern: String, handler: HttpHandler): Unit
  def `m-search`(urlpattern: String, handler: HttpHandler): Unit
  def merge(urlpattern: String, handler: HttpHandler): Unit
  def mkactivity(urlpattern: String, handler: HttpHandler): Unit
  def mkcol(urlpattern: String, handler: HttpHandler): Unit
  def move(urlpattern: String, handler: HttpHandler): Unit
  def notify(urlpattern: String, handler: HttpHandler): Unit
  def options(urlpattern: String, handler: HttpHandler): Unit
  def patch(urlpattern: String, handler: HttpHandler): Unit
  def post(urlpattern: String, handler: HttpHandler): Unit
  def propfind(urlpattern: String, handler: HttpHandler): Unit
  def proppatch(urlpattern: String, handler: HttpHandler): Unit
  def put(urlpattern: String, handler: HttpHandler): Unit
  def redirect(urlpattern: String, to: String): Unit
  def report(urlpattern: String, handler: HttpHandler): Unit
  def search(urlpattern: String, handler: HttpHandler): Unit
  def subscribe(urlpattern: String, handler: HttpHandler): Unit
  def trace(urlpattern: String, handler: HttpHandler): Unit
  def unlock(urlpattern: String, handler: HttpHandler): Unit
  def unsubscribe(urlpattern: String, handler: HttpHandler): Unit
}

object App {
  @scala.inline
  def apply(
    all: (String, HttpHandler) => Callback,
    checkout: (String, HttpHandler) => Callback,
    copy: (String, HttpHandler) => Callback,
    delete: (String, HttpHandler) => Callback,
    get: (String, HttpHandler) => Callback,
    head: (String, HttpHandler) => Callback,
    lock: (String, HttpHandler) => Callback,
    `m-search`: (String, HttpHandler) => Callback,
    merge: (String, HttpHandler) => Callback,
    mkactivity: (String, HttpHandler) => Callback,
    mkcol: (String, HttpHandler) => Callback,
    move: (String, HttpHandler) => Callback,
    notify: (String, HttpHandler) => Callback,
    options: (String, HttpHandler) => Callback,
    patch: (String, HttpHandler) => Callback,
    post: (String, HttpHandler) => Callback,
    propfind: (String, HttpHandler) => Callback,
    proppatch: (String, HttpHandler) => Callback,
    put: (String, HttpHandler) => Callback,
    redirect: (String, String) => Callback,
    report: (String, HttpHandler) => Callback,
    search: (String, HttpHandler) => Callback,
    subscribe: (String, HttpHandler) => Callback,
    trace: (String, HttpHandler) => Callback,
    unlock: (String, HttpHandler) => Callback,
    unsubscribe: (String, HttpHandler) => Callback
  ): App = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("all")(js.Any.fromFunction2((t0: java.lang.String, t1: typingsJapgolly.urlrouter.mod.HttpHandler) => all(t0, t1).runNow()))
    __obj.updateDynamic("checkout")(js.Any.fromFunction2((t0: java.lang.String, t1: typingsJapgolly.urlrouter.mod.HttpHandler) => checkout(t0, t1).runNow()))
    __obj.updateDynamic("copy")(js.Any.fromFunction2((t0: java.lang.String, t1: typingsJapgolly.urlrouter.mod.HttpHandler) => copy(t0, t1).runNow()))
    __obj.updateDynamic("delete")(js.Any.fromFunction2((t0: java.lang.String, t1: typingsJapgolly.urlrouter.mod.HttpHandler) => delete(t0, t1).runNow()))
    __obj.updateDynamic("get")(js.Any.fromFunction2((t0: java.lang.String, t1: typingsJapgolly.urlrouter.mod.HttpHandler) => get(t0, t1).runNow()))
    __obj.updateDynamic("head")(js.Any.fromFunction2((t0: java.lang.String, t1: typingsJapgolly.urlrouter.mod.HttpHandler) => head(t0, t1).runNow()))
    __obj.updateDynamic("lock")(js.Any.fromFunction2((t0: java.lang.String, t1: typingsJapgolly.urlrouter.mod.HttpHandler) => lock(t0, t1).runNow()))
    __obj.updateDynamic("m-search")(js.Any.fromFunction2((t0: java.lang.String, t1: typingsJapgolly.urlrouter.mod.HttpHandler) => `m-search`(t0, t1).runNow()))
    __obj.updateDynamic("merge")(js.Any.fromFunction2((t0: java.lang.String, t1: typingsJapgolly.urlrouter.mod.HttpHandler) => merge(t0, t1).runNow()))
    __obj.updateDynamic("mkactivity")(js.Any.fromFunction2((t0: java.lang.String, t1: typingsJapgolly.urlrouter.mod.HttpHandler) => mkactivity(t0, t1).runNow()))
    __obj.updateDynamic("mkcol")(js.Any.fromFunction2((t0: java.lang.String, t1: typingsJapgolly.urlrouter.mod.HttpHandler) => mkcol(t0, t1).runNow()))
    __obj.updateDynamic("move")(js.Any.fromFunction2((t0: java.lang.String, t1: typingsJapgolly.urlrouter.mod.HttpHandler) => move(t0, t1).runNow()))
    __obj.updateDynamic("notify")(js.Any.fromFunction2((t0: java.lang.String, t1: typingsJapgolly.urlrouter.mod.HttpHandler) => notify(t0, t1).runNow()))
    __obj.updateDynamic("options")(js.Any.fromFunction2((t0: java.lang.String, t1: typingsJapgolly.urlrouter.mod.HttpHandler) => options(t0, t1).runNow()))
    __obj.updateDynamic("patch")(js.Any.fromFunction2((t0: java.lang.String, t1: typingsJapgolly.urlrouter.mod.HttpHandler) => patch(t0, t1).runNow()))
    __obj.updateDynamic("post")(js.Any.fromFunction2((t0: java.lang.String, t1: typingsJapgolly.urlrouter.mod.HttpHandler) => post(t0, t1).runNow()))
    __obj.updateDynamic("propfind")(js.Any.fromFunction2((t0: java.lang.String, t1: typingsJapgolly.urlrouter.mod.HttpHandler) => propfind(t0, t1).runNow()))
    __obj.updateDynamic("proppatch")(js.Any.fromFunction2((t0: java.lang.String, t1: typingsJapgolly.urlrouter.mod.HttpHandler) => proppatch(t0, t1).runNow()))
    __obj.updateDynamic("put")(js.Any.fromFunction2((t0: java.lang.String, t1: typingsJapgolly.urlrouter.mod.HttpHandler) => put(t0, t1).runNow()))
    __obj.updateDynamic("redirect")(js.Any.fromFunction2((t0: java.lang.String, t1: java.lang.String) => redirect(t0, t1).runNow()))
    __obj.updateDynamic("report")(js.Any.fromFunction2((t0: java.lang.String, t1: typingsJapgolly.urlrouter.mod.HttpHandler) => report(t0, t1).runNow()))
    __obj.updateDynamic("search")(js.Any.fromFunction2((t0: java.lang.String, t1: typingsJapgolly.urlrouter.mod.HttpHandler) => search(t0, t1).runNow()))
    __obj.updateDynamic("subscribe")(js.Any.fromFunction2((t0: java.lang.String, t1: typingsJapgolly.urlrouter.mod.HttpHandler) => subscribe(t0, t1).runNow()))
    __obj.updateDynamic("trace")(js.Any.fromFunction2((t0: java.lang.String, t1: typingsJapgolly.urlrouter.mod.HttpHandler) => trace(t0, t1).runNow()))
    __obj.updateDynamic("unlock")(js.Any.fromFunction2((t0: java.lang.String, t1: typingsJapgolly.urlrouter.mod.HttpHandler) => unlock(t0, t1).runNow()))
    __obj.updateDynamic("unsubscribe")(js.Any.fromFunction2((t0: java.lang.String, t1: typingsJapgolly.urlrouter.mod.HttpHandler) => unsubscribe(t0, t1).runNow()))
    __obj.asInstanceOf[App]
  }
}

