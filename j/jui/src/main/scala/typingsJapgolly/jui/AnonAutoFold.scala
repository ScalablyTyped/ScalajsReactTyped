package typingsJapgolly.jui

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonAutoFold extends js.Object {
  /**
    * @cfg {Boolean} [autoFold=false]
    * When you click on a node, the node folding
    */
  var autoFold: js.UndefOr[Boolean] = js.undefined
  var event: js.UndefOr[js.Any] = js.undefined
  /**
    * @cfg {Integer} [index=null]
    * Sets an enabled node
    */
  var index: js.UndefOr[Double] = js.undefined
  /**
    * @cfg {Boolean} [multipanel=false]
    */
  var multipanel: js.UndefOr[Boolean] = js.undefined
  var tpl: js.UndefOr[js.Any] = js.undefined
}

object AnonAutoFold {
  @scala.inline
  def apply(
    autoFold: js.UndefOr[Boolean] = js.undefined,
    event: js.Any = null,
    index: Int | Double = null,
    multipanel: js.UndefOr[Boolean] = js.undefined,
    tpl: js.Any = null
  ): AnonAutoFold = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(autoFold)) __obj.updateDynamic("autoFold")(autoFold.asInstanceOf[js.Any])
    if (event != null) __obj.updateDynamic("event")(event.asInstanceOf[js.Any])
    if (index != null) __obj.updateDynamic("index")(index.asInstanceOf[js.Any])
    if (!js.isUndefined(multipanel)) __obj.updateDynamic("multipanel")(multipanel.asInstanceOf[js.Any])
    if (tpl != null) __obj.updateDynamic("tpl")(tpl.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonAutoFold]
  }
}

