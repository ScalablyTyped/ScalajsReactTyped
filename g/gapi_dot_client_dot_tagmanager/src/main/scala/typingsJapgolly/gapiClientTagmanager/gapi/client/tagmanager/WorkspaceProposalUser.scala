package typingsJapgolly.gapiClientTagmanager.gapi.client.tagmanager

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WorkspaceProposalUser extends js.Object {
  /** Gaia id associated with a user, absent for the Google Tag Manager system. */
  var gaiaId: js.UndefOr[String] = js.undefined
  /** User type distinguishes between a user and the Google Tag Manager system. */
  var `type`: js.UndefOr[String] = js.undefined
}

object WorkspaceProposalUser {
  @scala.inline
  def apply(gaiaId: String = null, `type`: String = null): WorkspaceProposalUser = {
    val __obj = js.Dynamic.literal()
    if (gaiaId != null) __obj.updateDynamic("gaiaId")(gaiaId.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[WorkspaceProposalUser]
  }
}

