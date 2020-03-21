package typingsJapgolly.dojo.dojo.request

import japgolly.scalajs.react.Callback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Permalink: http://dojotoolkit.org/api/1.9/dojo/request/default.html
  *
  *
  */
trait default extends js.Object {
  /**
    *
    */
  def getPlatformDefaultId(): Unit
  /**
    *
    * @param id
    * @param parentRequire
    * @param loaded
    * @param config
    */
  def load(id: js.Any, parentRequire: js.Any, loaded: js.Any, config: js.Any): Unit
}

object default {
  @scala.inline
  def apply(getPlatformDefaultId: Callback, load: (js.Any, js.Any, js.Any, js.Any) => Callback): default = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("getPlatformDefaultId")(getPlatformDefaultId.toJsFn)
    __obj.updateDynamic("load")(js.Any.fromFunction4((t0: js.Any, t1: js.Any, t2: js.Any, t3: js.Any) => load(t0, t1, t2, t3).runNow()))
    __obj.asInstanceOf[default]
  }
}

