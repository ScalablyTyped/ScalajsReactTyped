package typingsJapgolly.dojo.doh.main

import japgolly.scalajs.react.Callback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Permalink: http://dojotoolkit.org/api/1.9/doh/main._testTypes.html
  *
  *
  */
trait testTypes extends js.Object {
  /**
    *
    * @param group
    * @param tObj
    * @param type
    */
  def perf(group: js.Any, tObj: js.Any, `type`: js.Any): Unit
}

object testTypes {
  @scala.inline
  def apply(perf: (js.Any, js.Any, js.Any) => Callback): testTypes = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("perf")(js.Any.fromFunction3((t0: js.Any, t1: js.Any, t2: js.Any) => perf(t0, t1, t2).runNow()))
    __obj.asInstanceOf[testTypes]
  }
}

