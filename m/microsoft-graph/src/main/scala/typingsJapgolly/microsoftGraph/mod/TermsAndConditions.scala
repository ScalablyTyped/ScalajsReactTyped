package typingsJapgolly.microsoftGraph.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TermsAndConditions extends Entity {
  /**
    * Administrator-supplied explanation of the terms and conditions, typically describing what it means to accept the terms
    * and conditions set out in the T&amp;C policy. This is shown to the user on prompts to accept the T&amp;C policy.
    */
  var acceptanceStatement: js.UndefOr[String] = js.undefined
  // The list of acceptance statuses for this T&amp;C policy.
  var acceptanceStatuses: js.UndefOr[js.Array[TermsAndConditionsAcceptanceStatus]] = js.undefined
  // The list of assignments for this T&amp;C policy.
  var assignments: js.UndefOr[js.Array[TermsAndConditionsAssignment]] = js.undefined
  /**
    * Administrator-supplied body text of the terms and conditions, typically the terms themselves. This is shown to the user
    * on prompts to accept the T&amp;C policy.
    */
  var bodyText: js.UndefOr[String] = js.undefined
  // DateTime the object was created.
  var createdDateTime: js.UndefOr[String] = js.undefined
  // Administrator-supplied description of the T&amp;C policy.
  var description: js.UndefOr[String] = js.undefined
  // Administrator-supplied name for the T&amp;C policy.
  var displayName: js.UndefOr[String] = js.undefined
  // DateTime the object was last modified.
  var lastModifiedDateTime: js.UndefOr[String] = js.undefined
  /**
    * Administrator-supplied title of the terms and conditions. This is shown to the user on prompts to accept the T&amp;C
    * policy.
    */
  var title: js.UndefOr[String] = js.undefined
  /**
    * Integer indicating the current version of the terms. Incremented when an administrator makes a change to the terms and
    * wishes to require users to re-accept the modified T&amp;C policy.
    */
  var version: js.UndefOr[Double] = js.undefined
}

object TermsAndConditions {
  @scala.inline
  def apply(
    acceptanceStatement: String = null,
    acceptanceStatuses: js.Array[TermsAndConditionsAcceptanceStatus] = null,
    assignments: js.Array[TermsAndConditionsAssignment] = null,
    bodyText: String = null,
    createdDateTime: String = null,
    description: String = null,
    displayName: String = null,
    id: String = null,
    lastModifiedDateTime: String = null,
    title: String = null,
    version: Int | Double = null
  ): TermsAndConditions = {
    val __obj = js.Dynamic.literal()
    if (acceptanceStatement != null) __obj.updateDynamic("acceptanceStatement")(acceptanceStatement.asInstanceOf[js.Any])
    if (acceptanceStatuses != null) __obj.updateDynamic("acceptanceStatuses")(acceptanceStatuses.asInstanceOf[js.Any])
    if (assignments != null) __obj.updateDynamic("assignments")(assignments.asInstanceOf[js.Any])
    if (bodyText != null) __obj.updateDynamic("bodyText")(bodyText.asInstanceOf[js.Any])
    if (createdDateTime != null) __obj.updateDynamic("createdDateTime")(createdDateTime.asInstanceOf[js.Any])
    if (description != null) __obj.updateDynamic("description")(description.asInstanceOf[js.Any])
    if (displayName != null) __obj.updateDynamic("displayName")(displayName.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (lastModifiedDateTime != null) __obj.updateDynamic("lastModifiedDateTime")(lastModifiedDateTime.asInstanceOf[js.Any])
    if (title != null) __obj.updateDynamic("title")(title.asInstanceOf[js.Any])
    if (version != null) __obj.updateDynamic("version")(version.asInstanceOf[js.Any])
    __obj.asInstanceOf[TermsAndConditions]
  }
}

