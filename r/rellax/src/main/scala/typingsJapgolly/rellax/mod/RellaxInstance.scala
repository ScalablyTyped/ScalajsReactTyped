package typingsJapgolly.rellax.mod

import japgolly.scalajs.react.Callback
import org.scalajs.dom.raw.Element
import org.scalajs.dom.raw.Node
import org.scalajs.dom.raw.NodeListOf
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RellaxInstance extends js.Object {
  /**
    * Rellax elements
    */
  var elms: (NodeListOf[Element with Node]) | js.Array[Element]
  /**
    * Options
    */
  var options: RellaxOptions
  /**
    * End Rellax and reset parallax elements to their original positions
    */
  def destroy(): Unit
  /**
    * Destroy and create again parallax with previous settings
    */
  def refresh(): Unit
}

object RellaxInstance {
  @scala.inline
  def apply(
    destroy: Callback,
    elms: (NodeListOf[Element with Node]) | js.Array[Element],
    options: RellaxOptions,
    refresh: Callback
  ): RellaxInstance = {
    val __obj = js.Dynamic.literal(elms = elms.asInstanceOf[js.Any], options = options.asInstanceOf[js.Any])
    __obj.updateDynamic("destroy")(destroy.toJsFn)
    __obj.updateDynamic("refresh")(refresh.toJsFn)
    __obj.asInstanceOf[RellaxInstance]
  }
}

