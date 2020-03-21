package typingsJapgolly.antd.configProviderMod

import japgolly.scalajs.react.CallbackTo
import japgolly.scalajs.react.raw.React.Node
import japgolly.scalajs.react.vdom.VdomNode
import org.scalajs.dom.raw.HTMLElement
import typingsJapgolly.antd.AnonGhost
import typingsJapgolly.antd.AnonValidateMessages
import typingsJapgolly.antd.antdStrings.ltr
import typingsJapgolly.antd.antdStrings.rtl
import typingsJapgolly.antd.contextMod.CSPConfig
import typingsJapgolly.antd.localeProviderMod.Locale
import typingsJapgolly.antd.renderEmptyMod.RenderEmptyHandler
import typingsJapgolly.antd.sizeContextMod.SizeType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ConfigProviderProps extends js.Object {
  var autoInsertSpaceInButton: js.UndefOr[Boolean] = js.undefined
  var children: js.UndefOr[Node] = js.undefined
  var componentSize: js.UndefOr[SizeType] = js.undefined
  var csp: js.UndefOr[CSPConfig] = js.undefined
  var direction: js.UndefOr[ltr | rtl] = js.undefined
  var form: js.UndefOr[AnonValidateMessages] = js.undefined
  var getPopupContainer: js.UndefOr[js.Function1[/* triggerNode */ HTMLElement, HTMLElement]] = js.undefined
  var locale: js.UndefOr[Locale] = js.undefined
  var pageHeader: js.UndefOr[AnonGhost] = js.undefined
  var prefixCls: js.UndefOr[String] = js.undefined
  var renderEmpty: js.UndefOr[RenderEmptyHandler] = js.undefined
}

object ConfigProviderProps {
  @scala.inline
  def apply(
    autoInsertSpaceInButton: js.UndefOr[Boolean] = js.undefined,
    children: VdomNode = null,
    componentSize: SizeType = null,
    csp: CSPConfig = null,
    direction: ltr | rtl = null,
    form: AnonValidateMessages = null,
    getPopupContainer: /* triggerNode */ HTMLElement => CallbackTo[HTMLElement] = null,
    locale: Locale = null,
    pageHeader: AnonGhost = null,
    prefixCls: String = null,
    renderEmpty: /* componentName */ js.UndefOr[String] => CallbackTo[Node] = null
  ): ConfigProviderProps = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(autoInsertSpaceInButton)) __obj.updateDynamic("autoInsertSpaceInButton")(autoInsertSpaceInButton.asInstanceOf[js.Any])
    if (children != null) __obj.updateDynamic("children")(children.rawNode.asInstanceOf[js.Any])
    if (componentSize != null) __obj.updateDynamic("componentSize")(componentSize.asInstanceOf[js.Any])
    if (csp != null) __obj.updateDynamic("csp")(csp.asInstanceOf[js.Any])
    if (direction != null) __obj.updateDynamic("direction")(direction.asInstanceOf[js.Any])
    if (form != null) __obj.updateDynamic("form")(form.asInstanceOf[js.Any])
    if (getPopupContainer != null) __obj.updateDynamic("getPopupContainer")(js.Any.fromFunction1((t0: /* triggerNode */ org.scalajs.dom.raw.HTMLElement) => getPopupContainer(t0).runNow()))
    if (locale != null) __obj.updateDynamic("locale")(locale.asInstanceOf[js.Any])
    if (pageHeader != null) __obj.updateDynamic("pageHeader")(pageHeader.asInstanceOf[js.Any])
    if (prefixCls != null) __obj.updateDynamic("prefixCls")(prefixCls.asInstanceOf[js.Any])
    if (renderEmpty != null) __obj.updateDynamic("renderEmpty")(js.Any.fromFunction1((t0: /* componentName */ js.UndefOr[java.lang.String]) => renderEmpty(t0).runNow()))
    __obj.asInstanceOf[ConfigProviderProps]
  }
}

