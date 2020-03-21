package typingsJapgolly.keycloakConnect.mod

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Token extends js.Object {
  var clientId: String
  var content: TokenContent
  var header: js.UndefOr[js.Any] = js.undefined
  var signature: js.UndefOr[Buffer] = js.undefined
  var signed: js.UndefOr[String] = js.undefined
  var token: String
  def hasApplicationRole(appName: String, roleName: String): Boolean
  def hasPermission(resource: String, scope: String): Boolean
  def hasRealmRole(roleName: String): Boolean
  def hasRole(roleName: String): Boolean
  def isExpired(): Boolean
}

object Token {
  @scala.inline
  def apply(
    clientId: String,
    content: TokenContent,
    hasApplicationRole: (String, String) => CallbackTo[Boolean],
    hasPermission: (String, String) => CallbackTo[Boolean],
    hasRealmRole: String => CallbackTo[Boolean],
    hasRole: String => CallbackTo[Boolean],
    isExpired: CallbackTo[Boolean],
    token: String,
    header: js.Any = null,
    signature: Buffer = null,
    signed: String = null
  ): Token = {
    val __obj = js.Dynamic.literal(clientId = clientId.asInstanceOf[js.Any], content = content.asInstanceOf[js.Any], token = token.asInstanceOf[js.Any])
    __obj.updateDynamic("hasApplicationRole")(js.Any.fromFunction2((t0: java.lang.String, t1: java.lang.String) => hasApplicationRole(t0, t1).runNow()))
    __obj.updateDynamic("hasPermission")(js.Any.fromFunction2((t0: java.lang.String, t1: java.lang.String) => hasPermission(t0, t1).runNow()))
    __obj.updateDynamic("hasRealmRole")(js.Any.fromFunction1((t0: java.lang.String) => hasRealmRole(t0).runNow()))
    __obj.updateDynamic("hasRole")(js.Any.fromFunction1((t0: java.lang.String) => hasRole(t0).runNow()))
    __obj.updateDynamic("isExpired")(isExpired.toJsFn)
    if (header != null) __obj.updateDynamic("header")(header.asInstanceOf[js.Any])
    if (signature != null) __obj.updateDynamic("signature")(signature.asInstanceOf[js.Any])
    if (signed != null) __obj.updateDynamic("signed")(signed.asInstanceOf[js.Any])
    __obj.asInstanceOf[Token]
  }
}

