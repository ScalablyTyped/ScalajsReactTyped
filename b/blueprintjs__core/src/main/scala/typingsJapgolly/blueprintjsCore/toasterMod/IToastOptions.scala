package typingsJapgolly.blueprintjsCore.toasterMod

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.raw.React.Node
import japgolly.scalajs.react.vdom.VdomNode
import typingsJapgolly.blueprintjsCore.intentMod.Intent
import typingsJapgolly.blueprintjsCore.propsMod.IActionProps
import typingsJapgolly.blueprintjsCore.propsMod.ILinkProps
import typingsJapgolly.blueprintjsCore.propsMod.MaybeElement
import typingsJapgolly.blueprintjsIcons.iconNameMod.IconName
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined @blueprintjs/core.@blueprintjs/core/lib/esm/components/toast/toast.IToastProps & {  key ? :string} */
trait IToastOptions extends js.Object {
  /**
    * Action rendered as a minimal `AnchorButton`. The toast is dismissed automatically when the
    * user clicks the action button. Note that the `intent` prop is ignored (the action button
    * cannot have its own intent color that might conflict with the toast's intent). Omit this
    * prop to omit the action button.
    */
  var action: js.UndefOr[IActionProps with ILinkProps] = js.undefined
  /** A space-delimited list of class names to pass along to a child element. */
  var className: js.UndefOr[String] = js.undefined
  /** Name of a Blueprint UI icon (or an icon element) to render before the message. */
  var icon: js.UndefOr[IconName | MaybeElement] = js.undefined
  /** Visual intent color to apply to element. */
  var intent: js.UndefOr[Intent] = js.undefined
  var key: js.UndefOr[String] = js.undefined
  /** Message to display in the body of the toast. */
  var message: Node
  /**
    * Callback invoked when the toast is dismissed, either by the user or by the timeout.
    * The value of the argument indicates whether the toast was closed because the timeout expired.
    */
  var onDismiss: js.UndefOr[js.Function1[/* didTimeoutExpire */ Boolean, Unit]] = js.undefined
  /**
    * Milliseconds to wait before automatically dismissing toast.
    * Providing a value less than or equal to 0 will disable the timeout (this is discouraged).
    * @default 5000
    */
  var timeout: js.UndefOr[Double] = js.undefined
}

object IToastOptions {
  @scala.inline
  def apply(
    action: IActionProps with ILinkProps = null,
    className: String = null,
    icon: IconName | MaybeElement = null,
    intent: Intent = null,
    key: String = null,
    message: VdomNode = null,
    onDismiss: /* didTimeoutExpire */ Boolean => Callback = null,
    timeout: Int | Double = null
  ): IToastOptions = {
    val __obj = js.Dynamic.literal()
    if (action != null) __obj.updateDynamic("action")(action.asInstanceOf[js.Any])
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (icon != null) __obj.updateDynamic("icon")(icon.asInstanceOf[js.Any])
    if (intent != null) __obj.updateDynamic("intent")(intent.asInstanceOf[js.Any])
    if (key != null) __obj.updateDynamic("key")(key.asInstanceOf[js.Any])
    if (message != null) __obj.updateDynamic("message")(message.rawNode.asInstanceOf[js.Any])
    if (onDismiss != null) __obj.updateDynamic("onDismiss")(js.Any.fromFunction1((t0: /* didTimeoutExpire */ scala.Boolean) => onDismiss(t0).runNow()))
    if (timeout != null) __obj.updateDynamic("timeout")(timeout.asInstanceOf[js.Any])
    __obj.asInstanceOf[IToastOptions]
  }
}

