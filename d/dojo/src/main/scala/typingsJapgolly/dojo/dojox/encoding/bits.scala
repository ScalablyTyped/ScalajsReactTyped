package typingsJapgolly.dojo.dojox.encoding

import japgolly.scalajs.react.Callback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Permalink: http://dojotoolkit.org/api/1.9/dojox/encoding/bits.html
  *
  *
  */
trait bits extends js.Object {
  /**
    *
    * @param buffer
    * @param width
    */
  def InputStream(buffer: js.Any, width: js.Any): Unit
  /**
    *
    */
  def OutputStream(): Unit
}

object bits {
  @scala.inline
  def apply(InputStream: (js.Any, js.Any) => Callback, OutputStream: Callback): bits = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("InputStream")(js.Any.fromFunction2((t0: js.Any, t1: js.Any) => InputStream(t0, t1).runNow()))
    __obj.updateDynamic("OutputStream")(OutputStream.toJsFn)
    __obj.asInstanceOf[bits]
  }
}

