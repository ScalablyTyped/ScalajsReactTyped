package typingsJapgolly.googleapis.polyV1Mod.polyV1

import typingsJapgolly.googleAuthLibrary.mod.Compute
import typingsJapgolly.googleAuthLibrary.mod.JWT
import typingsJapgolly.googleAuthLibrary.mod.OAuth2Client
import typingsJapgolly.googleAuthLibrary.mod.UserRefreshClient
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ParamsResourceUsersLikedassetsList extends StandardParameters {
  /**
    * Auth client or API Key for the request
    */
  var auth: js.UndefOr[String | OAuth2Client | JWT | Compute | UserRefreshClient] = js.native
  /**
    * Return only assets with the matching format. Acceptable values are:
    * `BLOCKS`, `FBX`, `GLTF`, `GLTF2`, `OBJ`, `TILT`.
    */
  var format: js.UndefOr[String] = js.native
  /**
    * A valid user id. Currently, only the special value 'me', representing the
    * currently-authenticated user is supported. To use 'me', you must pass an
    * OAuth token with the request.
    */
  var name: js.UndefOr[String] = js.native
  /**
    * Specifies an ordering for assets. Acceptable values are: `BEST`,
    * `NEWEST`, `OLDEST`, 'LIKED_TIME'. Defaults to `LIKED_TIME`, which ranks
    * assets based on how recently they were liked.
    */
  var orderBy: js.UndefOr[String] = js.native
  /**
    * The maximum number of assets to be returned. This value must be between
    * `1` and `100`. Defaults to `20`.
    */
  var pageSize: js.UndefOr[Double] = js.native
  /**
    * Specifies a continuation token from a previous search whose results were
    * split into multiple pages. To get the next page, submit the same request
    * specifying the value from next_page_token.
    */
  var pageToken: js.UndefOr[String] = js.native
}

