package typingsJapgolly.extjs.Ext.tab

import japgolly.scalajs.react.Callback
import typingsJapgolly.extjs.Ext.IComponent
import typingsJapgolly.extjs.Ext.button.IButton
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ITab extends IButton {
  /** [Property] (Boolean) */
  var active: js.UndefOr[Boolean] = js.undefined
  /** [Config Option] (String) */
  var activeCls: js.UndefOr[String] = js.undefined
  /** [Config Option] (Boolean) */
  var closable: js.UndefOr[Boolean] = js.undefined
  /** [Config Option] (String) */
  var closableCls: js.UndefOr[String] = js.undefined
  /** [Config Option] (String) */
  var closeText: js.UndefOr[String] = js.undefined
  /** [Property] (Boolean) */
  var isTab: js.UndefOr[Boolean] = js.undefined
  /** [Method] Sets this tab s attached card
  		* @param card Ext.Component The card to set
  		*/
  var setCard: js.UndefOr[js.Function1[/* card */ js.UndefOr[IComponent], Unit]] = js.undefined
  /** [Method] Sets the tab as either closable or not
  		* @param closable Boolean Pass false to make the tab not closable. Otherwise the tab will be made closable (eg a close button will appear on the tab)
  		*/
  var setClosable: js.UndefOr[js.Function1[/* closable */ js.UndefOr[Boolean], Unit]] = js.undefined
}

object ITab {
  @scala.inline
  def apply(
    IButton: IButton = null,
    active: js.UndefOr[Boolean] = js.undefined,
    activeCls: String = null,
    closable: js.UndefOr[Boolean] = js.undefined,
    closableCls: String = null,
    closeText: String = null,
    isTab: js.UndefOr[Boolean] = js.undefined,
    setCard: /* card */ js.UndefOr[IComponent] => Callback = null,
    setClosable: /* closable */ js.UndefOr[Boolean] => Callback = null
  ): ITab = {
    val __obj = js.Dynamic.literal()
    if (IButton != null) js.Dynamic.global.Object.assign(__obj, IButton)
    if (!js.isUndefined(active)) __obj.updateDynamic("active")(active.asInstanceOf[js.Any])
    if (activeCls != null) __obj.updateDynamic("activeCls")(activeCls.asInstanceOf[js.Any])
    if (!js.isUndefined(closable)) __obj.updateDynamic("closable")(closable.asInstanceOf[js.Any])
    if (closableCls != null) __obj.updateDynamic("closableCls")(closableCls.asInstanceOf[js.Any])
    if (closeText != null) __obj.updateDynamic("closeText")(closeText.asInstanceOf[js.Any])
    if (!js.isUndefined(isTab)) __obj.updateDynamic("isTab")(isTab.asInstanceOf[js.Any])
    if (setCard != null) __obj.updateDynamic("setCard")(js.Any.fromFunction1((t0: /* card */ js.UndefOr[typingsJapgolly.extjs.Ext.IComponent]) => setCard(t0).runNow()))
    if (setClosable != null) __obj.updateDynamic("setClosable")(js.Any.fromFunction1((t0: /* closable */ js.UndefOr[scala.Boolean]) => setClosable(t0).runNow()))
    __obj.asInstanceOf[ITab]
  }
}

