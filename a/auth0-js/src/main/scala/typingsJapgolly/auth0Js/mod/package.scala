package typingsJapgolly.auth0Js

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type Auth0Callback[T, E] = js.Function2[/* error */ scala.Null | E, /* result */ T, scala.Unit]
  type ConsentRequiredErrorCode = typingsJapgolly.auth0Js.auth0JsStrings.consent_required
  type InteractionRequiredErrorCode = typingsJapgolly.auth0Js.auth0JsStrings.interaction_required
  type LoginRequiredErrorCode = typingsJapgolly.auth0Js.auth0JsStrings.login_required
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.auth0Js.mod.LoginRequiredErrorCode
    - typingsJapgolly.auth0Js.mod.InteractionRequiredErrorCode
    - typingsJapgolly.auth0Js.mod.ConsentRequiredErrorCode
    - typingsJapgolly.auth0Js.auth0JsStrings.account_selection_required
    - typingsJapgolly.auth0Js.auth0JsStrings.invalid_request_uri
    - typingsJapgolly.auth0Js.auth0JsStrings.invalid_request_object
    - typingsJapgolly.auth0Js.auth0JsStrings.request_not_supported
    - typingsJapgolly.auth0Js.auth0JsStrings.request_uri_not_supported
    - typingsJapgolly.auth0Js.auth0JsStrings.registration_not_supported
  */
  type SpecErrorCodes = typingsJapgolly.auth0Js.mod._SpecErrorCodes | typingsJapgolly.auth0Js.mod.LoginRequiredErrorCode | typingsJapgolly.auth0Js.mod.InteractionRequiredErrorCode | typingsJapgolly.auth0Js.mod.ConsentRequiredErrorCode
}
