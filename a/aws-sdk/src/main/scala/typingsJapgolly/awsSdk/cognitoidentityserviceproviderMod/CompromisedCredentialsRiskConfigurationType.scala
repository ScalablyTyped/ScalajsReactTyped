package typingsJapgolly.awsSdk.cognitoidentityserviceproviderMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CompromisedCredentialsRiskConfigurationType extends js.Object {
  /**
    * The compromised credentials risk configuration actions.
    */
  var Actions: CompromisedCredentialsActionsType = js.native
  /**
    * Perform the action for these events. The default is to perform all events if no event filter is specified.
    */
  var EventFilter: js.UndefOr[EventFiltersType] = js.native
}

object CompromisedCredentialsRiskConfigurationType {
  @scala.inline
  def apply(Actions: CompromisedCredentialsActionsType, EventFilter: EventFiltersType = null): CompromisedCredentialsRiskConfigurationType = {
    val __obj = js.Dynamic.literal(Actions = Actions.asInstanceOf[js.Any])
    if (EventFilter != null) __obj.updateDynamic("EventFilter")(EventFilter.asInstanceOf[js.Any])
    __obj.asInstanceOf[CompromisedCredentialsRiskConfigurationType]
  }
}

