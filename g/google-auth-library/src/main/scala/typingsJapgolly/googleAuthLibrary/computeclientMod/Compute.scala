package typingsJapgolly.googleAuthLibrary.computeclientMod

import typingsJapgolly.gaxios.mod.GaxiosError
import typingsJapgolly.googleAuthLibrary.oauth2clientMod.OAuth2Client
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("google-auth-library/build/src/auth/computeclient", "Compute")
@js.native
/**
  * Google Compute Engine service account credentials.
  *
  * Retrieve access token from the metadata server.
  * See: https://developers.google.com/compute/docs/authentication
  */
class Compute () extends OAuth2Client {
  def this(options: ComputeOptions) = this()
  var scopes: js.Array[String] = js.native
  var serviceAccountEmail: js.Any = js.native
  /**
    * Indicates whether the credential requires scopes to be created by calling
    * createdScoped before use.
    * @deprecated
    * @return Boolean indicating if scope is required.
    */
  def createScopedRequired(): Boolean = js.native
  /* protected */ def wrapError(e: GaxiosError[_]): Unit = js.native
}

