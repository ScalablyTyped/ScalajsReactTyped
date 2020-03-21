package typingsJapgolly.extjs.Ext.toolbar

import typingsJapgolly.extjs.Ext.container.IContainer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IToolbar extends IContainer {
  /** [Config Option] (String) */
  var defaultButtonUI: js.UndefOr[String] = js.undefined
  /** [Config Option] (Boolean) */
  var enableOverflow: js.UndefOr[Boolean] = js.undefined
  /** [Property] (Boolean) */
  var isToolbar: js.UndefOr[Boolean] = js.undefined
  /** [Config Option] (String) */
  var menuTriggerCls: js.UndefOr[String] = js.undefined
  /** [Config Option] (Boolean) */
  var vertical: js.UndefOr[Boolean] = js.undefined
}

object IToolbar {
  @scala.inline
  def apply(
    IContainer: IContainer = null,
    defaultButtonUI: String = null,
    enableOverflow: js.UndefOr[Boolean] = js.undefined,
    isToolbar: js.UndefOr[Boolean] = js.undefined,
    menuTriggerCls: String = null,
    vertical: js.UndefOr[Boolean] = js.undefined
  ): IToolbar = {
    val __obj = js.Dynamic.literal()
    if (IContainer != null) js.Dynamic.global.Object.assign(__obj, IContainer)
    if (defaultButtonUI != null) __obj.updateDynamic("defaultButtonUI")(defaultButtonUI.asInstanceOf[js.Any])
    if (!js.isUndefined(enableOverflow)) __obj.updateDynamic("enableOverflow")(enableOverflow.asInstanceOf[js.Any])
    if (!js.isUndefined(isToolbar)) __obj.updateDynamic("isToolbar")(isToolbar.asInstanceOf[js.Any])
    if (menuTriggerCls != null) __obj.updateDynamic("menuTriggerCls")(menuTriggerCls.asInstanceOf[js.Any])
    if (!js.isUndefined(vertical)) __obj.updateDynamic("vertical")(vertical.asInstanceOf[js.Any])
    __obj.asInstanceOf[IToolbar]
  }
}

