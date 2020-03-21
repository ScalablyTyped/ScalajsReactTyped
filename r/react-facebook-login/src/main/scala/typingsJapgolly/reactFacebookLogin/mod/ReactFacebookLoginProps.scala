package typingsJapgolly.reactFacebookLogin.mod

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.ReactMouseEventFrom
import japgolly.scalajs.react.raw.React.Component
import japgolly.scalajs.react.raw.React.Node
import japgolly.scalajs.react.vdom.VdomNode
import org.scalajs.dom.raw.HTMLDivElement
import typingsJapgolly.react.mod.CSSProperties
import typingsJapgolly.reactFacebookLogin.reactFacebookLoginStrings.medium
import typingsJapgolly.reactFacebookLogin.reactFacebookLoginStrings.metro
import typingsJapgolly.reactFacebookLogin.reactFacebookLoginStrings.small
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReactFacebookLoginProps extends js.Object {
  var appId: String
  var authType: js.UndefOr[String] = js.undefined
  var autoLoad: js.UndefOr[Boolean] = js.undefined
  var buttonStyle: js.UndefOr[CSSProperties] = js.undefined
  var containerStyle: js.UndefOr[CSSProperties] = js.undefined
  var cookie: js.UndefOr[Boolean] = js.undefined
  var cssClass: js.UndefOr[String] = js.undefined
  var disableMobileRedirect: js.UndefOr[Boolean] = js.undefined
  var fields: js.UndefOr[String] = js.undefined
  var icon: js.UndefOr[Node] = js.undefined
  var isDisabled: js.UndefOr[Boolean] = js.undefined
  var isMobile: js.UndefOr[Boolean] = js.undefined
  var language: js.UndefOr[String] = js.undefined
  var onClick: js.UndefOr[js.Function1[/* event */ ReactMouseEventFrom[HTMLDivElement], Unit]] = js.undefined
  var onFailure: js.UndefOr[js.Function1[/* response */ ReactFacebookFailureResponse, Unit]] = js.undefined
  var reAuthenticate: js.UndefOr[Boolean] = js.undefined
  var redirectUri: js.UndefOr[String] = js.undefined
  var responseType: js.UndefOr[String] = js.undefined
  var returnScopes: js.UndefOr[Boolean] = js.undefined
  var scope: js.UndefOr[String] = js.undefined
  var size: js.UndefOr[small | medium | metro] = js.undefined
  var state: js.UndefOr[String] = js.undefined
  var tag: js.UndefOr[org.scalajs.dom.raw.Node | (Component[js.Object, js.Object])] = js.undefined
  var textButton: js.UndefOr[String] = js.undefined
  var typeButton: js.UndefOr[String] = js.undefined
  var version: js.UndefOr[String] = js.undefined
  var xfbml: js.UndefOr[Boolean] = js.undefined
  def callback(userInfo: ReactFacebookLoginInfo): Unit
}

object ReactFacebookLoginProps {
  @scala.inline
  def apply(
    appId: String,
    callback: ReactFacebookLoginInfo => Callback,
    authType: String = null,
    autoLoad: js.UndefOr[Boolean] = js.undefined,
    buttonStyle: CSSProperties = null,
    containerStyle: CSSProperties = null,
    cookie: js.UndefOr[Boolean] = js.undefined,
    cssClass: String = null,
    disableMobileRedirect: js.UndefOr[Boolean] = js.undefined,
    fields: String = null,
    icon: VdomNode = null,
    isDisabled: js.UndefOr[Boolean] = js.undefined,
    isMobile: js.UndefOr[Boolean] = js.undefined,
    language: String = null,
    onClick: /* event */ ReactMouseEventFrom[HTMLDivElement] => Callback = null,
    onFailure: /* response */ ReactFacebookFailureResponse => Callback = null,
    reAuthenticate: js.UndefOr[Boolean] = js.undefined,
    redirectUri: String = null,
    responseType: String = null,
    returnScopes: js.UndefOr[Boolean] = js.undefined,
    scope: String = null,
    size: small | medium | metro = null,
    state: String = null,
    tag: org.scalajs.dom.raw.Node | (Component[js.Object, js.Object]) = null,
    textButton: String = null,
    typeButton: String = null,
    version: String = null,
    xfbml: js.UndefOr[Boolean] = js.undefined
  ): ReactFacebookLoginProps = {
    val __obj = js.Dynamic.literal(appId = appId.asInstanceOf[js.Any])
    __obj.updateDynamic("callback")(js.Any.fromFunction1((t0: typingsJapgolly.reactFacebookLogin.mod.ReactFacebookLoginInfo) => callback(t0).runNow()))
    if (authType != null) __obj.updateDynamic("authType")(authType.asInstanceOf[js.Any])
    if (!js.isUndefined(autoLoad)) __obj.updateDynamic("autoLoad")(autoLoad.asInstanceOf[js.Any])
    if (buttonStyle != null) __obj.updateDynamic("buttonStyle")(buttonStyle.asInstanceOf[js.Any])
    if (containerStyle != null) __obj.updateDynamic("containerStyle")(containerStyle.asInstanceOf[js.Any])
    if (!js.isUndefined(cookie)) __obj.updateDynamic("cookie")(cookie.asInstanceOf[js.Any])
    if (cssClass != null) __obj.updateDynamic("cssClass")(cssClass.asInstanceOf[js.Any])
    if (!js.isUndefined(disableMobileRedirect)) __obj.updateDynamic("disableMobileRedirect")(disableMobileRedirect.asInstanceOf[js.Any])
    if (fields != null) __obj.updateDynamic("fields")(fields.asInstanceOf[js.Any])
    if (icon != null) __obj.updateDynamic("icon")(icon.rawNode.asInstanceOf[js.Any])
    if (!js.isUndefined(isDisabled)) __obj.updateDynamic("isDisabled")(isDisabled.asInstanceOf[js.Any])
    if (!js.isUndefined(isMobile)) __obj.updateDynamic("isMobile")(isMobile.asInstanceOf[js.Any])
    if (language != null) __obj.updateDynamic("language")(language.asInstanceOf[js.Any])
    if (onClick != null) __obj.updateDynamic("onClick")(js.Any.fromFunction1((t0: /* event */ japgolly.scalajs.react.ReactMouseEventFrom[org.scalajs.dom.raw.HTMLDivElement]) => onClick(t0).runNow()))
    if (onFailure != null) __obj.updateDynamic("onFailure")(js.Any.fromFunction1((t0: /* response */ typingsJapgolly.reactFacebookLogin.mod.ReactFacebookFailureResponse) => onFailure(t0).runNow()))
    if (!js.isUndefined(reAuthenticate)) __obj.updateDynamic("reAuthenticate")(reAuthenticate.asInstanceOf[js.Any])
    if (redirectUri != null) __obj.updateDynamic("redirectUri")(redirectUri.asInstanceOf[js.Any])
    if (responseType != null) __obj.updateDynamic("responseType")(responseType.asInstanceOf[js.Any])
    if (!js.isUndefined(returnScopes)) __obj.updateDynamic("returnScopes")(returnScopes.asInstanceOf[js.Any])
    if (scope != null) __obj.updateDynamic("scope")(scope.asInstanceOf[js.Any])
    if (size != null) __obj.updateDynamic("size")(size.asInstanceOf[js.Any])
    if (state != null) __obj.updateDynamic("state")(state.asInstanceOf[js.Any])
    if (tag != null) __obj.updateDynamic("tag")(tag.asInstanceOf[js.Any])
    if (textButton != null) __obj.updateDynamic("textButton")(textButton.asInstanceOf[js.Any])
    if (typeButton != null) __obj.updateDynamic("typeButton")(typeButton.asInstanceOf[js.Any])
    if (version != null) __obj.updateDynamic("version")(version.asInstanceOf[js.Any])
    if (!js.isUndefined(xfbml)) __obj.updateDynamic("xfbml")(xfbml.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReactFacebookLoginProps]
  }
}

