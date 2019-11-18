package typingsJapgolly.std

import japgolly.scalajs.react.Callback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NavigatorContentUtils extends js.Object {
  def registerProtocolHandler(scheme: java.lang.String, url: java.lang.String, title: java.lang.String): Unit
  def unregisterProtocolHandler(scheme: java.lang.String, url: java.lang.String): Unit
}

object NavigatorContentUtils {
  @scala.inline
  def apply(
    registerProtocolHandler: (java.lang.String, java.lang.String, java.lang.String) => Callback,
    unregisterProtocolHandler: (java.lang.String, java.lang.String) => Callback
  ): NavigatorContentUtils = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("registerProtocolHandler")(js.Any.fromFunction3((t0: java.lang.String, t1: java.lang.String, t2: java.lang.String) => registerProtocolHandler(t0, t1, t2).runNow()))
    __obj.updateDynamic("unregisterProtocolHandler")(js.Any.fromFunction2((t0: java.lang.String, t1: java.lang.String) => unregisterProtocolHandler(t0, t1).runNow()))
    __obj.asInstanceOf[NavigatorContentUtils]
  }
}

