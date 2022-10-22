package typingsJapgolly.auth0Js.mod

import typingsJapgolly.auth0Js.auth0JsStrings.consent_required
import typingsJapgolly.auth0Js.auth0JsStrings.interaction_required
import typingsJapgolly.auth0Js.auth0JsStrings.login_required
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


type Auth0Callback[T, E] = js.Function2[/* error */ Null | E, /* result */ T, Unit]

type ConsentRequiredErrorCode = consent_required

type DoneCallback = js.Function1[/* err */ js.UndefOr[Auth0Error], Unit]

type InteractionRequiredErrorCode = interaction_required

type LoginRequiredErrorCode = login_required

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
type SpecErrorCodes = _SpecErrorCodes | LoginRequiredErrorCode | InteractionRequiredErrorCode | ConsentRequiredErrorCode
