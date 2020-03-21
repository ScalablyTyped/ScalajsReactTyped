package typingsJapgolly.dojo.dojox.charting.bidi

import japgolly.scalajs.react.Callback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Permalink: http://dojotoolkit.org/api/1.9/dojox/charting/bidi/_bidiutils.html
  *
  *
  */
trait bidiutils extends js.Object {
  /**
    *
    * @param plot
    * @param dim
    * @param offsets
    * @param rtl
    */
  def reverseMatrix(plot: js.Any, dim: js.Any, offsets: js.Any, rtl: js.Any): Unit
}

object bidiutils {
  @scala.inline
  def apply(reverseMatrix: (js.Any, js.Any, js.Any, js.Any) => Callback): bidiutils = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("reverseMatrix")(js.Any.fromFunction4((t0: js.Any, t1: js.Any, t2: js.Any, t3: js.Any) => reverseMatrix(t0, t1, t2, t3).runNow()))
    __obj.asInstanceOf[bidiutils]
  }
}

