package typingsJapgolly.extjs.Ext.toolbar

import typingsJapgolly.extjs.Ext.IComponent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IFill extends IComponent {
  /** [Property] (Boolean) */
  var isFill: js.UndefOr[Boolean] = js.undefined
}

object IFill {
  @scala.inline
  def apply(IComponent: IComponent = null, isFill: js.UndefOr[Boolean] = js.undefined): IFill = {
    val __obj = js.Dynamic.literal()
    if (IComponent != null) js.Dynamic.global.Object.assign(__obj, IComponent)
    if (!js.isUndefined(isFill)) __obj.updateDynamic("isFill")(isFill.asInstanceOf[js.Any])
    __obj.asInstanceOf[IFill]
  }
}

