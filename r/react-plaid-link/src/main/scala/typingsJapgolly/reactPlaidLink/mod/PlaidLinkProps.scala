package typingsJapgolly.reactPlaidLink.mod

import japgolly.scalajs.react.Callback
import typingsJapgolly.react.mod.CSSProperties
import typingsJapgolly.reactPlaidLink.AnonAccounts
import typingsJapgolly.reactPlaidLink.AnonDisplaymessage
import typingsJapgolly.reactPlaidLink.AnonEmailAddress
import typingsJapgolly.reactPlaidLink.AnonErrorcode
import typingsJapgolly.reactPlaidLink.AnonInstitution
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

trait PlaidLinkProps extends js.Object {
  // ApiVersion flag to use new version of Plaid API
  var apiVersion: js.UndefOr[String] = js.undefined
  // Button Class names as a String
  var className: js.UndefOr[String] = js.undefined
  // Displayed once a user has successfully linked their account
  var clientName: String
  // The Plaid API environment on which to create user accounts.
  // For development and testing, use tartan. For production, use production
  var env: tartan | sandbox | development | production
  // Open link to a specific institution, for a more custom solution
  var institution: js.UndefOr[String] = js.undefined
  // A function that is called during a user's flow in Link.
  // See
  var onEvent: js.UndefOr[
    js.Function2[
      /* eventName */ ERROR | EXIT | HANDOFF | OPEN | OPEN_MY_PLAID | SEARCH_INSTITUTION | SELECT_INSTITUTION | SUBMIT_CREDENTIALS | SUBMIT_MFA | TRANSITION_VIEW, 
      /* metadata */ AnonErrorcode, 
      Unit
    ]
  ] = js.undefined
  // A function that is called when a user has specifically exited Link flow
  var onExit: js.UndefOr[
    js.Function2[/* error */ AnonDisplaymessage | Null, /* metadata */ AnonInstitution, Unit]
  ] = js.undefined
  // A function that is called when the Link module has finished loading.
  // Calls to plaidLinkHandler.open() prior to the onLoad callback will be
  // delayed until the module is fully loaded.
  var onLoad: js.UndefOr[js.Function0[Unit]] = js.undefined
  // The Plaid products you wish to use, an array containing some of connect,
  // auth, identity, income, transactions, assets, liabilities
  var product: js.Array[
    connect | info | auth | identity | income | transactions | assets | liabilities | investments | payment_initiation
  ]
  // The public_key associated with your account; available from
  // the Plaid dashboard (https://dashboard.plaid.com)
  var publicKey: String
  // Set to true to launch Link with the 'Select Account' pane enabled.
  // Allows users to select an individual account once they've authenticated
  var selectAccount: js.UndefOr[Boolean] = js.undefined
  // Button Styles as an Object
  var style: js.UndefOr[CSSProperties] = js.undefined
  // Specify an existing user's public token to launch Link in update mode.
  // This will cause Link to open directly to the authentication step for
  // that user's institution.
  var token: js.UndefOr[String] = js.undefined
  // Specify a user object to enable all Auth features. Reach out to your
  // account manager or integrations@plaid.com to get enabled. See the Auth
  // [https://plaid.com/docs#auth] docs for integration details.
  var user: js.UndefOr[AnonEmailAddress] = js.undefined
  // Specify a webhook to associate with a user.
  var webhook: js.UndefOr[String] = js.undefined
  // A function that is called when a user has successfully onboarded their
  // account. The function should expect two arguments, the public_key and a
  // metadata object
  def onSuccess(publicToken: String, metadata: AnonAccounts): Unit
}

object PlaidLinkProps {
  @scala.inline
  def apply(
    clientName: String,
    env: tartan | sandbox | development | production,
    onSuccess: (String, AnonAccounts) => Callback,
    product: js.Array[
      connect | info | auth | identity | income | transactions | assets | liabilities | investments | payment_initiation
    ],
    publicKey: String,
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
    webhook: String = null
  ): PlaidLinkProps = {
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
    __obj.asInstanceOf[PlaidLinkProps]
  }
}

