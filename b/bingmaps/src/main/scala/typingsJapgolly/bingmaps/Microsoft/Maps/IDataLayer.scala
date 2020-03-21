package typingsJapgolly.bingmaps.Microsoft.Maps

import japgolly.scalajs.react.Callback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IDataLayer extends ILayer {
  /** Clears all data in the layer. */
  def clear(): Unit
}

object IDataLayer {
  @scala.inline
  def apply(clear: Callback): IDataLayer = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("clear")(clear.toJsFn)
    __obj.asInstanceOf[IDataLayer]
  }
}

