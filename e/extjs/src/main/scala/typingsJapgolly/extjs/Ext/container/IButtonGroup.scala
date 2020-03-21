package typingsJapgolly.extjs.Ext.container

import japgolly.scalajs.react.Callback
import typingsJapgolly.extjs.Ext.panel.IPanel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IButtonGroup extends IPanel {
  /** [Config Option] (Number) */
  var columns: js.UndefOr[Double] = js.undefined
  /** [Config Option] (String) */
  var defaultButtonUI: js.UndefOr[String] = js.undefined
  /** [Method] private
  		* @param component Object
  		*/
  @JSName("onBeforeAdd")
  var onBeforeAdd_IButtonGroup: js.UndefOr[js.Function1[/* component */ js.UndefOr[js.Any], Unit]] = js.undefined
}

object IButtonGroup {
  @scala.inline
  def apply(
    IPanel: IPanel = null,
    columns: Int | Double = null,
    defaultButtonUI: String = null,
    onBeforeAdd: /* component */ js.UndefOr[js.Any] => Callback = null
  ): IButtonGroup = {
    val __obj = js.Dynamic.literal()
    if (IPanel != null) js.Dynamic.global.Object.assign(__obj, IPanel)
    if (columns != null) __obj.updateDynamic("columns")(columns.asInstanceOf[js.Any])
    if (defaultButtonUI != null) __obj.updateDynamic("defaultButtonUI")(defaultButtonUI.asInstanceOf[js.Any])
    if (onBeforeAdd != null) __obj.updateDynamic("onBeforeAdd")(js.Any.fromFunction1((t0: /* component */ js.UndefOr[js.Any]) => onBeforeAdd(t0).runNow()))
    __obj.asInstanceOf[IButtonGroup]
  }
}

