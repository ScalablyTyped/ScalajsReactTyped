package typingsJapgolly.antd.contextMod

import org.scalajs.dom.raw.HTMLElement
import typingsJapgolly.antd.AnonGhost
import typingsJapgolly.antd.antdStrings.ltr
import typingsJapgolly.antd.antdStrings.rtl
import typingsJapgolly.antd.localeProviderMod.Locale
import typingsJapgolly.antd.renderEmptyMod.RenderEmptyHandler
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ConfigConsumerProps extends js.Object {
  var autoInsertSpaceInButton: js.UndefOr[Boolean] = js.native
  var csp: js.UndefOr[CSPConfig] = js.native
  var direction: js.UndefOr[ltr | rtl] = js.native
  var getPopupContainer: js.UndefOr[js.Function1[/* triggerNode */ HTMLElement, HTMLElement]] = js.native
  var locale: js.UndefOr[Locale] = js.native
  var pageHeader: js.UndefOr[AnonGhost] = js.native
  var renderEmpty: RenderEmptyHandler = js.native
  var rootPrefixCls: js.UndefOr[String] = js.native
  def getPrefixCls(suffixCls: String): String = js.native
  def getPrefixCls(suffixCls: String, customizePrefixCls: String): String = js.native
}

