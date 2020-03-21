package typingsJapgolly.igniteUi

import japgolly.scalajs.react.Callback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IgGridAppendRowsOnDemandMethods extends js.Object {
  /**
  	 * Destroys the append rows on demand widget
  	 */
  def destroy(): Unit
  /**
  	 * Loads the next chunk of data.
  	 */
  def nextChunk(): Unit
}

object IgGridAppendRowsOnDemandMethods {
  @scala.inline
  def apply(destroy: Callback, nextChunk: Callback): IgGridAppendRowsOnDemandMethods = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("destroy")(destroy.toJsFn)
    __obj.updateDynamic("nextChunk")(nextChunk.toJsFn)
    __obj.asInstanceOf[IgGridAppendRowsOnDemandMethods]
  }
}

