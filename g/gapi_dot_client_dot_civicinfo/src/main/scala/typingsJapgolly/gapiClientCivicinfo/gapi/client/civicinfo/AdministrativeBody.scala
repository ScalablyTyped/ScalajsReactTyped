package typingsJapgolly.gapiClientCivicinfo.gapi.client.civicinfo

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AdministrativeBody extends js.Object {
  /** A URL provided by this administrative body for information on absentee voting. */
  var absenteeVotingInfoUrl: js.UndefOr[String] = js.undefined
  var addressLines: js.UndefOr[js.Array[String]] = js.undefined
  /** A URL provided by this administrative body to give contest information to the voter. */
  var ballotInfoUrl: js.UndefOr[String] = js.undefined
  /** The mailing address of this administrative body. */
  var correspondenceAddress: js.UndefOr[SimpleAddressType] = js.undefined
  /** A URL provided by this administrative body for looking up general election information. */
  var electionInfoUrl: js.UndefOr[String] = js.undefined
  /** The election officials for this election administrative body. */
  var electionOfficials: js.UndefOr[js.Array[ElectionOfficial]] = js.undefined
  /** A URL provided by this administrative body for confirming that the voter is registered to vote. */
  var electionRegistrationConfirmationUrl: js.UndefOr[String] = js.undefined
  /** A URL provided by this administrative body for looking up how to register to vote. */
  var electionRegistrationUrl: js.UndefOr[String] = js.undefined
  /** A URL provided by this administrative body describing election rules to the voter. */
  var electionRulesUrl: js.UndefOr[String] = js.undefined
  /** A description of the hours of operation for this administrative body. */
  var hoursOfOperation: js.UndefOr[String] = js.undefined
  /** The name of this election administrative body. */
  var name: js.UndefOr[String] = js.undefined
  /** The physical address of this administrative body. */
  var physicalAddress: js.UndefOr[SimpleAddressType] = js.undefined
  /** A description of the services this administrative body may provide. */
  var voter_services: js.UndefOr[js.Array[String]] = js.undefined
  /** A URL provided by this administrative body for looking up where to vote. */
  var votingLocationFinderUrl: js.UndefOr[String] = js.undefined
}

object AdministrativeBody {
  @scala.inline
  def apply(
    absenteeVotingInfoUrl: String = null,
    addressLines: js.Array[String] = null,
    ballotInfoUrl: String = null,
    correspondenceAddress: SimpleAddressType = null,
    electionInfoUrl: String = null,
    electionOfficials: js.Array[ElectionOfficial] = null,
    electionRegistrationConfirmationUrl: String = null,
    electionRegistrationUrl: String = null,
    electionRulesUrl: String = null,
    hoursOfOperation: String = null,
    name: String = null,
    physicalAddress: SimpleAddressType = null,
    voter_services: js.Array[String] = null,
    votingLocationFinderUrl: String = null
  ): AdministrativeBody = {
    val __obj = js.Dynamic.literal()
    if (absenteeVotingInfoUrl != null) __obj.updateDynamic("absenteeVotingInfoUrl")(absenteeVotingInfoUrl.asInstanceOf[js.Any])
    if (addressLines != null) __obj.updateDynamic("addressLines")(addressLines.asInstanceOf[js.Any])
    if (ballotInfoUrl != null) __obj.updateDynamic("ballotInfoUrl")(ballotInfoUrl.asInstanceOf[js.Any])
    if (correspondenceAddress != null) __obj.updateDynamic("correspondenceAddress")(correspondenceAddress.asInstanceOf[js.Any])
    if (electionInfoUrl != null) __obj.updateDynamic("electionInfoUrl")(electionInfoUrl.asInstanceOf[js.Any])
    if (electionOfficials != null) __obj.updateDynamic("electionOfficials")(electionOfficials.asInstanceOf[js.Any])
    if (electionRegistrationConfirmationUrl != null) __obj.updateDynamic("electionRegistrationConfirmationUrl")(electionRegistrationConfirmationUrl.asInstanceOf[js.Any])
    if (electionRegistrationUrl != null) __obj.updateDynamic("electionRegistrationUrl")(electionRegistrationUrl.asInstanceOf[js.Any])
    if (electionRulesUrl != null) __obj.updateDynamic("electionRulesUrl")(electionRulesUrl.asInstanceOf[js.Any])
    if (hoursOfOperation != null) __obj.updateDynamic("hoursOfOperation")(hoursOfOperation.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (physicalAddress != null) __obj.updateDynamic("physicalAddress")(physicalAddress.asInstanceOf[js.Any])
    if (voter_services != null) __obj.updateDynamic("voter_services")(voter_services.asInstanceOf[js.Any])
    if (votingLocationFinderUrl != null) __obj.updateDynamic("votingLocationFinderUrl")(votingLocationFinderUrl.asInstanceOf[js.Any])
    __obj.asInstanceOf[AdministrativeBody]
  }
}

