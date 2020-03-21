package typingsJapgolly.microsoftGraph.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TeamsApp extends Entity {
  // The details for each version of the app.
  var appDefinitions: js.UndefOr[js.Array[TeamsAppDefinition]] = js.undefined
  // The name of the catalog app provided by the app developer in the Microsoft Teams zip app package.
  var displayName: js.UndefOr[String] = js.undefined
  // The method of distribution for the app.
  var distributionMethod: js.UndefOr[TeamsAppDistributionMethod] = js.undefined
  // The ID of the catalog provided by the app developer in the Microsoft Teams zip app package.
  var externalId: js.UndefOr[String] = js.undefined
}

object TeamsApp {
  @scala.inline
  def apply(
    appDefinitions: js.Array[TeamsAppDefinition] = null,
    displayName: String = null,
    distributionMethod: TeamsAppDistributionMethod = null,
    externalId: String = null,
    id: String = null
  ): TeamsApp = {
    val __obj = js.Dynamic.literal()
    if (appDefinitions != null) __obj.updateDynamic("appDefinitions")(appDefinitions.asInstanceOf[js.Any])
    if (displayName != null) __obj.updateDynamic("displayName")(displayName.asInstanceOf[js.Any])
    if (distributionMethod != null) __obj.updateDynamic("distributionMethod")(distributionMethod.asInstanceOf[js.Any])
    if (externalId != null) __obj.updateDynamic("externalId")(externalId.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    __obj.asInstanceOf[TeamsApp]
  }
}

