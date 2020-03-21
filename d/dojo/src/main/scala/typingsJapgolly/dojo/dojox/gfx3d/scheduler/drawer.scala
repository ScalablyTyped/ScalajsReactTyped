package typingsJapgolly.dojo.dojox.gfx3d.scheduler

import japgolly.scalajs.react.Callback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Permalink: http://dojotoolkit.org/api/1.9/dojox/gfx3d/scheduler.drawer.html
  *
  *
  */
trait drawer extends js.Object {
  /**
    *
    * @param todos
    * @param objects
    * @param viewport
    */
  def chart(todos: js.Any, objects: js.Any, viewport: js.Any): Unit
  /**
    *
    * @param todos
    * @param objects
    * @param viewport
    */
  def conservative(todos: js.Any, objects: js.Any, viewport: js.Any): Unit
}

object drawer {
  @scala.inline
  def apply(chart: (js.Any, js.Any, js.Any) => Callback, conservative: (js.Any, js.Any, js.Any) => Callback): drawer = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("chart")(js.Any.fromFunction3((t0: js.Any, t1: js.Any, t2: js.Any) => chart(t0, t1, t2).runNow()))
    __obj.updateDynamic("conservative")(js.Any.fromFunction3((t0: js.Any, t1: js.Any, t2: js.Any) => conservative(t0, t1, t2).runNow()))
    __obj.asInstanceOf[drawer]
  }
}

