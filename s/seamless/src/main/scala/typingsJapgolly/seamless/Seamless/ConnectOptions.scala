package typingsJapgolly.seamless.Seamless

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ConnectOptions extends js.Object {
  /**
    * Allow appended styles to be injected.
    * @default false
    */
  var allowAppendedStyleInjection: js.UndefOr[Boolean] = js.undefined
  /**
    *  If this page should allow injected styles.
    *  @default false
    */
  var allowStyleInjection: js.UndefOr[Boolean] = js.undefined
  /**
    * The container for the main content on the page which determines the height of the page.
    * @default 'body'
    */
  var container: js.UndefOr[String] = js.undefined
  /**
    * The text to place after the link when the cookie test fails.
    * @default ' to open in a separate window.'
    */
  var cookieFallbackAfterMsg: js.UndefOr[String] = js.undefined
  /**
    * The text to place inside the link to have them open a new window if the cookie test fails.
    * @default 'Click Here'
    */
  var cookieFallbackLinkMsg: js.UndefOr[String] = js.undefined
  /**
    * The message to show if the cookie test fails.
    * @default 'Your browser requires this page to be opened in a separate window.'
    */
  var cookieFallbackMsg: js.UndefOr[String] = js.undefined
  /**
    *  Called when the parent connects to this iframe.
    *  @default null
    */
  var onConnect: js.UndefOr[js.Function1[/* data */ js.Any, Unit]] = js.undefined
  /**
    *  Callback that is called when an update is triggered to the parent.
    *  @default null
    */
  var onUpdate: js.UndefOr[js.Function1[/* data */ js.Any, Unit]] = js.undefined
  /**
    * If the child page requires cookies (See Child iFrame Cookie Problem section)
    * @default false
    */
  var requireCookies: js.UndefOr[Boolean] = js.undefined
  /**
    * The milliseconds that an update is created from the child to the parent.
    * @default 200
    */
  var update: js.UndefOr[Double] = js.undefined
  /**
    * The url of the parent page to connect to.
    * @default ''
    */
  var url: js.UndefOr[String] = js.undefined
}

object ConnectOptions {
  @scala.inline
  def apply(
    allowAppendedStyleInjection: js.UndefOr[Boolean] = js.undefined,
    allowStyleInjection: js.UndefOr[Boolean] = js.undefined,
    container: String = null,
    cookieFallbackAfterMsg: String = null,
    cookieFallbackLinkMsg: String = null,
    cookieFallbackMsg: String = null,
    onConnect: /* data */ js.Any => japgolly.scalajs.react.Callback = null,
    onUpdate: /* data */ js.Any => japgolly.scalajs.react.Callback = null,
    requireCookies: js.UndefOr[Boolean] = js.undefined,
    update: Int | Double = null,
    url: String = null
  ): ConnectOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(allowAppendedStyleInjection)) __obj.updateDynamic("allowAppendedStyleInjection")(allowAppendedStyleInjection.asInstanceOf[js.Any])
    if (!js.isUndefined(allowStyleInjection)) __obj.updateDynamic("allowStyleInjection")(allowStyleInjection.asInstanceOf[js.Any])
    if (container != null) __obj.updateDynamic("container")(container.asInstanceOf[js.Any])
    if (cookieFallbackAfterMsg != null) __obj.updateDynamic("cookieFallbackAfterMsg")(cookieFallbackAfterMsg.asInstanceOf[js.Any])
    if (cookieFallbackLinkMsg != null) __obj.updateDynamic("cookieFallbackLinkMsg")(cookieFallbackLinkMsg.asInstanceOf[js.Any])
    if (cookieFallbackMsg != null) __obj.updateDynamic("cookieFallbackMsg")(cookieFallbackMsg.asInstanceOf[js.Any])
    if (onConnect != null) __obj.updateDynamic("onConnect")(js.Any.fromFunction1((t0: /* data */ js.Any) => onConnect(t0).runNow()))
    if (onUpdate != null) __obj.updateDynamic("onUpdate")(js.Any.fromFunction1((t0: /* data */ js.Any) => onUpdate(t0).runNow()))
    if (!js.isUndefined(requireCookies)) __obj.updateDynamic("requireCookies")(requireCookies.asInstanceOf[js.Any])
    if (update != null) __obj.updateDynamic("update")(update.asInstanceOf[js.Any])
    if (url != null) __obj.updateDynamic("url")(url.asInstanceOf[js.Any])
    __obj.asInstanceOf[ConnectOptions]
  }
}

