package typingsJapgolly.antd.alertMod

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.ReactMouseEventFrom
import japgolly.scalajs.react.raw.React.Node
import japgolly.scalajs.react.vdom.VdomNode
import org.scalajs.dom.raw.HTMLButtonElement
import typingsJapgolly.antd.antdStrings.error
import typingsJapgolly.antd.antdStrings.info
import typingsJapgolly.antd.antdStrings.success
import typingsJapgolly.antd.antdStrings.warning
import typingsJapgolly.react.mod.CSSProperties
import typingsJapgolly.react.mod.MouseEventHandler
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AlertProps extends js.Object {
  /** Trigger when animation ending of Alert */
  var afterClose: js.UndefOr[js.Function0[Unit]] = js.undefined
  var banner: js.UndefOr[Boolean] = js.undefined
  var className: js.UndefOr[String] = js.undefined
  /** Whether Alert can be closed */
  var closable: js.UndefOr[Boolean] = js.undefined
  /** Close text to show */
  var closeText: js.UndefOr[Node] = js.undefined
  /** Additional content of Alert */
  var description: js.UndefOr[Node] = js.undefined
  var icon: js.UndefOr[Node] = js.undefined
  /** Content of Alert */
  var message: Node
  /** Callback when close Alert */
  var onClose: js.UndefOr[MouseEventHandler[HTMLButtonElement]] = js.undefined
  var prefixCls: js.UndefOr[String] = js.undefined
  /** Whether to show icon */
  var showIcon: js.UndefOr[Boolean] = js.undefined
  var style: js.UndefOr[CSSProperties] = js.undefined
  /**
    * Type of Alert styles, options:`success`, `info`, `warning`, `error`
    */
  var `type`: js.UndefOr[success | info | warning | error] = js.undefined
}

object AlertProps {
  @scala.inline
  def apply(
    afterClose: js.UndefOr[Callback] = js.undefined,
    banner: js.UndefOr[Boolean] = js.undefined,
    className: String = null,
    closable: js.UndefOr[Boolean] = js.undefined,
    closeText: VdomNode = null,
    description: VdomNode = null,
    icon: VdomNode = null,
    message: VdomNode = null,
    onClose: ReactMouseEventFrom[HTMLButtonElement] => Callback = null,
    prefixCls: String = null,
    showIcon: js.UndefOr[Boolean] = js.undefined,
    style: CSSProperties = null,
    `type`: success | info | warning | error = null
  ): AlertProps = {
    val __obj = js.Dynamic.literal()
    afterClose.foreach(p => __obj.updateDynamic("afterClose")(p.toJsFn))
    if (!js.isUndefined(banner)) __obj.updateDynamic("banner")(banner.asInstanceOf[js.Any])
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (!js.isUndefined(closable)) __obj.updateDynamic("closable")(closable.asInstanceOf[js.Any])
    if (closeText != null) __obj.updateDynamic("closeText")(closeText.rawNode.asInstanceOf[js.Any])
    if (description != null) __obj.updateDynamic("description")(description.rawNode.asInstanceOf[js.Any])
    if (icon != null) __obj.updateDynamic("icon")(icon.rawNode.asInstanceOf[js.Any])
    if (message != null) __obj.updateDynamic("message")(message.rawNode.asInstanceOf[js.Any])
    if (onClose != null) __obj.updateDynamic("onClose")(js.Any.fromFunction1((t0: japgolly.scalajs.react.ReactMouseEventFrom[org.scalajs.dom.raw.HTMLButtonElement]) => onClose(t0).runNow()))
    if (prefixCls != null) __obj.updateDynamic("prefixCls")(prefixCls.asInstanceOf[js.Any])
    if (!js.isUndefined(showIcon)) __obj.updateDynamic("showIcon")(showIcon.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[AlertProps]
  }
}

