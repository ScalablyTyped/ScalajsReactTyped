package typingsJapgolly.reactPlaidLink.components

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CtorType.ChildArg
import japgolly.scalajs.react.Key
import japgolly.scalajs.react.component.JsForwardRef.UnmountedWithRoot
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.react.mod.CSSProperties
import typingsJapgolly.reactPlaidLink.AnonAccounts
import typingsJapgolly.reactPlaidLink.AnonDisplaymessage
import typingsJapgolly.reactPlaidLink.AnonEmailAddress
import typingsJapgolly.reactPlaidLink.AnonErrorcode
import typingsJapgolly.reactPlaidLink.AnonInstitution
import typingsJapgolly.reactPlaidLink.mod.PlaidLinkProps
import typingsJapgolly.reactPlaidLink.mod.default
import typingsJapgolly.reactPlaidLink.reactPlaidLinkStrings.ERROR
import typingsJapgolly.reactPlaidLink.reactPlaidLinkStrings.EXIT
import typingsJapgolly.reactPlaidLink.reactPlaidLinkStrings.HANDOFF
import typingsJapgolly.reactPlaidLink.reactPlaidLinkStrings.OPEN
import typingsJapgolly.reactPlaidLink.reactPlaidLinkStrings.OPEN_MY_PLAID
import typingsJapgolly.reactPlaidLink.reactPlaidLinkStrings.SEARCH_INSTITUTION
import typingsJapgolly.reactPlaidLink.reactPlaidLinkStrings.SELECT_INSTITUTION
import typingsJapgolly.reactPlaidLink.reactPlaidLinkStrings.SUBMIT_CREDENTIALS
import typingsJapgolly.reactPlaidLink.reactPlaidLinkStrings.SUBMIT_MFA
import typingsJapgolly.reactPlaidLink.reactPlaidLinkStrings.TRANSITION_VIEW
import typingsJapgolly.reactPlaidLink.reactPlaidLinkStrings.assets
import typingsJapgolly.reactPlaidLink.reactPlaidLinkStrings.auth
import typingsJapgolly.reactPlaidLink.reactPlaidLinkStrings.connect
import typingsJapgolly.reactPlaidLink.reactPlaidLinkStrings.development
import typingsJapgolly.reactPlaidLink.reactPlaidLinkStrings.identity
import typingsJapgolly.reactPlaidLink.reactPlaidLinkStrings.income
import typingsJapgolly.reactPlaidLink.reactPlaidLinkStrings.info
import typingsJapgolly.reactPlaidLink.reactPlaidLinkStrings.investments
import typingsJapgolly.reactPlaidLink.reactPlaidLinkStrings.liabilities
import typingsJapgolly.reactPlaidLink.reactPlaidLinkStrings.payment_initiation
import typingsJapgolly.reactPlaidLink.reactPlaidLinkStrings.production
import typingsJapgolly.reactPlaidLink.reactPlaidLinkStrings.sandbox
import typingsJapgolly.reactPlaidLink.reactPlaidLinkStrings.tartan
import typingsJapgolly.reactPlaidLink.reactPlaidLinkStrings.transactions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object ReactPlaidLink {
  def apply(
    clientName: String,
    env: tartan | sandbox | development | production,
    product: js.Array[
      connect | info | auth | identity | income | transactions | assets | liabilities | investments | payment_initiation
    ],
    publicKey: String,
    onSuccess: (String, AnonAccounts) => Callback,
    apiVersion: String = null,
    className: String = null,
    institution: String = null,
    onEvent: (/* eventName */ ERROR | EXIT | HANDOFF | OPEN | OPEN_MY_PLAID | SEARCH_INSTITUTION | SELECT_INSTITUTION | SUBMIT_CREDENTIALS | SUBMIT_MFA | TRANSITION_VIEW, /* metadata */ AnonErrorcode) => Callback = null,
    onExit: (/* error */ AnonDisplaymessage | Null, /* metadata */ AnonInstitution) => Callback = null,
    onLoad: js.UndefOr[Callback] = js.undefined,
    selectAccount: js.UndefOr[Boolean] = js.undefined,
    style: CSSProperties = null,
    token: String = null,
    user: AnonEmailAddress = null,
    webhook: String = null,
    key: js.UndefOr[Key] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  )(
    children: ChildArg*
  ): UnmountedWithRoot[PlaidLinkProps, default, Unit, PlaidLinkProps] = {
    val __obj = js.Dynamic.literal(clientName = clientName.asInstanceOf[js.Any], env = env.asInstanceOf[js.Any], product = product.asInstanceOf[js.Any], publicKey = publicKey.asInstanceOf[js.Any])
  
      __obj.updateDynamic("onSuccess")(js.Any.fromFunction2((t0: java.lang.String, t1: typingsJapgolly.reactPlaidLink.AnonAccounts) => onSuccess(t0, t1).runNow()))
    if (apiVersion != null) __obj.updateDynamic("apiVersion")(apiVersion.asInstanceOf[js.Any])
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (institution != null) __obj.updateDynamic("institution")(institution.asInstanceOf[js.Any])
    if (onEvent != null) __obj.updateDynamic("onEvent")(js.Any.fromFunction2((t0: /* eventName */ typingsJapgolly.reactPlaidLink.reactPlaidLinkStrings.ERROR | typingsJapgolly.reactPlaidLink.reactPlaidLinkStrings.EXIT | typingsJapgolly.reactPlaidLink.reactPlaidLinkStrings.HANDOFF | typingsJapgolly.reactPlaidLink.reactPlaidLinkStrings.OPEN | typingsJapgolly.reactPlaidLink.reactPlaidLinkStrings.OPEN_MY_PLAID | typingsJapgolly.reactPlaidLink.reactPlaidLinkStrings.SEARCH_INSTITUTION | typingsJapgolly.reactPlaidLink.reactPlaidLinkStrings.SELECT_INSTITUTION | typingsJapgolly.reactPlaidLink.reactPlaidLinkStrings.SUBMIT_CREDENTIALS | typingsJapgolly.reactPlaidLink.reactPlaidLinkStrings.SUBMIT_MFA | typingsJapgolly.reactPlaidLink.reactPlaidLinkStrings.TRANSITION_VIEW, t1: /* metadata */ typingsJapgolly.reactPlaidLink.AnonErrorcode) => onEvent(t0, t1).runNow()))
    if (onExit != null) __obj.updateDynamic("onExit")(js.Any.fromFunction2((t0: /* error */ typingsJapgolly.reactPlaidLink.AnonDisplaymessage | scala.Null, t1: /* metadata */ typingsJapgolly.reactPlaidLink.AnonInstitution) => onExit(t0, t1).runNow()))
    onLoad.foreach(p => __obj.updateDynamic("onLoad")(p.toJsFn))
    if (!js.isUndefined(selectAccount)) __obj.updateDynamic("selectAccount")(selectAccount.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    if (token != null) __obj.updateDynamic("token")(token.asInstanceOf[js.Any])
    if (user != null) __obj.updateDynamic("user")(user.asInstanceOf[js.Any])
    if (webhook != null) __obj.updateDynamic("webhook")(webhook.asInstanceOf[js.Any])
    key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
  
    val f = japgolly.scalajs.react.JsForwardRefComponent.force[
  typingsJapgolly.reactPlaidLink.mod.PlaidLinkProps, 
  japgolly.scalajs.react.Children.Varargs, 
  typingsJapgolly.reactPlaidLink.mod.default](this.componentImport)
    f(__obj.asInstanceOf[typingsJapgolly.reactPlaidLink.mod.PlaidLinkProps])(children: _*)
  }
  @JSImport("react-plaid-link", JSImport.Default)
  @js.native
  object componentImport extends js.Object
  
}

