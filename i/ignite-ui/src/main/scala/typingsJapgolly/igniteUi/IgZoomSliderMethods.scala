package typingsJapgolly.igniteUi

import japgolly.scalajs.react.Callback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IgZoomSliderMethods extends js.Object {
  /**
  	 * Destroys widget.
  	 */
  def destroy(): Unit
  /**
  	 * Flushes the gauge.
  	 */
  def flush(): Unit
  def notifySizeChanged(): Unit
}

object IgZoomSliderMethods {
  @scala.inline
  def apply(destroy: Callback, flush: Callback, notifySizeChanged: Callback): IgZoomSliderMethods = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("destroy")(destroy.toJsFn)
    __obj.updateDynamic("flush")(flush.toJsFn)
    __obj.updateDynamic("notifySizeChanged")(notifySizeChanged.toJsFn)
    __obj.asInstanceOf[IgZoomSliderMethods]
  }
}

