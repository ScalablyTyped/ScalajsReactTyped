package typingsJapgolly.gapiClientFirebaseremoteconfig.gapi.client.firebaseremoteconfig

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.gapiClient.gapi.client.Request_
import typingsJapgolly.gapiClientFirebaseremoteconfig.AnonAccesstoken
import typingsJapgolly.gapiClientFirebaseremoteconfig.AnonAlt
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ProjectsResource extends js.Object {
  /**
    * Get the latest version Remote Configuration for a project.
    * Returns the RemoteConfig as the payload, and also the eTag as a
    * response header.
    */
  def getRemoteConfig(request: AnonAccesstoken): Request_[RemoteConfig]
  /**
    * Update a RemoteConfig. We treat this as an always-existing
    * resource (when it is not found in our data store, we treat it as version
    * 0, a template with zero conditions and zero parameters). Hence there are
    * no Create or Delete operations. Returns the updated template when
    * successful (and the updated eTag as a response header), or an error if
    * things go wrong.
    * Possible error messages:
    * &#42; VALIDATION_ERROR (HTTP status 400) with additional details if the
    * template being passed in can not be validated.
    * &#42; AUTHENTICATION_ERROR (HTTP status 401) if the request can not be
    * authenticate (e.g. no access token, or invalid access token).
    * &#42; AUTHORIZATION_ERROR (HTTP status 403) if the request can not be
    * authorized (e.g. the user has no access to the specified project id).
    * &#42; VERSION_MISMATCH (HTTP status 412) when trying to update when the
    * expected eTag (passed in via the "If-match" header) is not specified, or
    * is specified but does does not match the current eTag.
    * &#42; Internal error (HTTP status 500) for Database problems or other internal
    * errors.
    */
  def updateRemoteConfig(request: AnonAlt): Request_[RemoteConfig]
}

object ProjectsResource {
  @scala.inline
  def apply(
    getRemoteConfig: AnonAccesstoken => CallbackTo[Request_[RemoteConfig]],
    updateRemoteConfig: AnonAlt => CallbackTo[Request_[RemoteConfig]]
  ): ProjectsResource = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("getRemoteConfig")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientFirebaseremoteconfig.AnonAccesstoken) => getRemoteConfig(t0).runNow()))
    __obj.updateDynamic("updateRemoteConfig")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientFirebaseremoteconfig.AnonAlt) => updateRemoteConfig(t0).runNow()))
    __obj.asInstanceOf[ProjectsResource]
  }
}

