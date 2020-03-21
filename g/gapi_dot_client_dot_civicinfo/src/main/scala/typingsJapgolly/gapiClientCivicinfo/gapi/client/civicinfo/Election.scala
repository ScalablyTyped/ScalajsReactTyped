package typingsJapgolly.gapiClientCivicinfo.gapi.client.civicinfo

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Election extends js.Object {
  /** Day of the election in YYYY-MM-DD format. */
  var electionDay: js.UndefOr[String] = js.undefined
  /** The unique ID of this election. */
  var id: js.UndefOr[String] = js.undefined
  /** A displayable name for the election. */
  var name: js.UndefOr[String] = js.undefined
  /**
    * The political division of the election. Represented as an OCD Division ID. Voters within these political jurisdictions are covered by this election.
    * This is typically a state such as ocd-division/country:us/state:ca or for the midterms or general election the entire US (i.e.
    * ocd-division/country:us).
    */
  var ocdDivisionId: js.UndefOr[String] = js.undefined
}

object Election {
  @scala.inline
  def apply(electionDay: String = null, id: String = null, name: String = null, ocdDivisionId: String = null): Election = {
    val __obj = js.Dynamic.literal()
    if (electionDay != null) __obj.updateDynamic("electionDay")(electionDay.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (ocdDivisionId != null) __obj.updateDynamic("ocdDivisionId")(ocdDivisionId.asInstanceOf[js.Any])
    __obj.asInstanceOf[Election]
  }
}

