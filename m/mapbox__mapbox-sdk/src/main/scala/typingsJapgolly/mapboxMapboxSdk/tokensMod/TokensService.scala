package typingsJapgolly.mapboxMapboxSdk.tokensMod

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.mapboxMapboxSdk.mapiRequestMod.MapiRequest
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TokensService extends js.Object {
  /**
    * Create a new temporary access token.
    * @param request
    */
  def createTemporaryToken(request: TemporaryTokenRequest): MapiRequest
  /**
    * Create a new access token.
    * @param request
    */
  def createToken(request: CreateTokenRequest): MapiRequest
  /**
    * Delete an access token.
    * @param request
    */
  def deleteToken(request: UpdateDeleteTokenRequest): MapiRequest
  /**
    * Get data about the client's access token.
    */
  def getToken(): MapiRequest
  /**
    * List your available scopes. Each item is a metadata object about the scope, not just the string scope.
    */
  def listScopes(): MapiRequest
  /**
    * List your access tokens.
    */
  def listTokens(): MapiRequest
  /**
    * Update an access token.
    * @param request
    */
  def updateToken(request: UpdateDeleteTokenRequest): MapiRequest
}

object TokensService {
  @scala.inline
  def apply(
    createTemporaryToken: TemporaryTokenRequest => CallbackTo[MapiRequest],
    createToken: CreateTokenRequest => CallbackTo[MapiRequest],
    deleteToken: UpdateDeleteTokenRequest => CallbackTo[MapiRequest],
    getToken: CallbackTo[MapiRequest],
    listScopes: CallbackTo[MapiRequest],
    listTokens: CallbackTo[MapiRequest],
    updateToken: UpdateDeleteTokenRequest => CallbackTo[MapiRequest]
  ): TokensService = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("createTemporaryToken")(js.Any.fromFunction1((t0: typingsJapgolly.mapboxMapboxSdk.tokensMod.TemporaryTokenRequest) => createTemporaryToken(t0).runNow()))
    __obj.updateDynamic("createToken")(js.Any.fromFunction1((t0: typingsJapgolly.mapboxMapboxSdk.tokensMod.CreateTokenRequest) => createToken(t0).runNow()))
    __obj.updateDynamic("deleteToken")(js.Any.fromFunction1((t0: typingsJapgolly.mapboxMapboxSdk.tokensMod.UpdateDeleteTokenRequest) => deleteToken(t0).runNow()))
    __obj.updateDynamic("getToken")(getToken.toJsFn)
    __obj.updateDynamic("listScopes")(listScopes.toJsFn)
    __obj.updateDynamic("listTokens")(listTokens.toJsFn)
    __obj.updateDynamic("updateToken")(js.Any.fromFunction1((t0: typingsJapgolly.mapboxMapboxSdk.tokensMod.UpdateDeleteTokenRequest) => updateToken(t0).runNow()))
    __obj.asInstanceOf[TokensService]
  }
}

