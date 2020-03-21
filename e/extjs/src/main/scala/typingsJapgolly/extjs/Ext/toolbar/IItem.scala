package typingsJapgolly.extjs.Ext.toolbar

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.extjs.Ext.IComponent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IItem extends IComponent {
  /** [Method] Disable the component  */
  @JSName("disable")
  var disable_IItem: js.UndefOr[js.Function0[Unit]] = js.undefined
  /** [Method] Enable the component */
  @JSName("enable")
  var enable_IItem: js.UndefOr[js.Function0[Unit]] = js.undefined
  /** [Method] Try to focus this component
  		* @returns Ext.Component The focused Component. Usually this Component. Some Containers may delegate focus to a descendant Component (Windows can do this through their defaultFocus config option.
  		*/
  @JSName("focus")
  var focus_IItem: js.UndefOr[js.Function0[IComponent]] = js.undefined
  /** [Config Option] (String) */
  var overflowText: js.UndefOr[String] = js.undefined
}

object IItem {
  @scala.inline
  def apply(
    IComponent: IComponent = null,
    disable: js.UndefOr[Callback] = js.undefined,
    enable: js.UndefOr[Callback] = js.undefined,
    focus: js.UndefOr[CallbackTo[IComponent]] = js.undefined,
    overflowText: String = null
  ): IItem = {
    val __obj = js.Dynamic.literal()
    if (IComponent != null) js.Dynamic.global.Object.assign(__obj, IComponent)
    disable.foreach(p => __obj.updateDynamic("disable")(p.toJsFn))
    enable.foreach(p => __obj.updateDynamic("enable")(p.toJsFn))
    focus.foreach(p => __obj.updateDynamic("focus")(p.toJsFn))
    if (overflowText != null) __obj.updateDynamic("overflowText")(overflowText.asInstanceOf[js.Any])
    __obj.asInstanceOf[IItem]
  }
}

