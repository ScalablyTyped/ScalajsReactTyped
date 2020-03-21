package typingsJapgolly.keycloakJs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type CompatPromise[TPromiseType /* <: typingsJapgolly.keycloakJs.mod.PromiseType */, TSuccess, TError] = (typingsJapgolly.keycloakJs.mod.KeycloakPromise[TSuccess, TError]) | js.Promise[TSuccess]
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.keycloakJs.keycloakJsStrings.cordova
    - typingsJapgolly.keycloakJs.keycloakJsStrings.`cordova-native`
    - typingsJapgolly.keycloakJs.keycloakJsStrings.default
    - js.Any
  */
  type KeycloakAdapterName = typingsJapgolly.keycloakJs.mod._KeycloakAdapterName | js.Any
  type KeycloakPkceMethod = typingsJapgolly.keycloakJs.keycloakJsStrings.S256
  type KeycloakPromiseCallback[T] = js.Function1[/* result */ T, scala.Unit]
  type KeycloakPromiseType = typingsJapgolly.keycloakJs.keycloakJsStrings.native
  type KeycloakResourceAccess = org.scalablytyped.runtime.StringDictionary[typingsJapgolly.keycloakJs.mod.KeycloakRoles]
  // export interface KeycloakUserInfo {}
  /**
  	 * Conditional CompatPromise type in order to support
  	 * both legacy promises and native promises as return types.
  	 */
  type PromiseType = js.UndefOr[typingsJapgolly.keycloakJs.mod.KeycloakPromiseType]
}
