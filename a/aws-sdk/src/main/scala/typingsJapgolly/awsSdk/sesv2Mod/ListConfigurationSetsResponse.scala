package typingsJapgolly.awsSdk.sesv2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListConfigurationSetsResponse extends js.Object {
  /**
    * An array that contains all of the configuration sets in your Amazon SES account in the current AWS Region.
    */
  var ConfigurationSets: js.UndefOr[ConfigurationSetNameList] = js.native
  /**
    * A token that indicates that there are additional configuration sets to list. To view additional configuration sets, issue another request to ListConfigurationSets, and pass this token in the NextToken parameter.
    */
  var NextToken: js.UndefOr[typingsJapgolly.awsSdk.sesv2Mod.NextToken] = js.native
}

object ListConfigurationSetsResponse {
  @scala.inline
  def apply(ConfigurationSets: ConfigurationSetNameList = null, NextToken: NextToken = null): ListConfigurationSetsResponse = {
    val __obj = js.Dynamic.literal()
    if (ConfigurationSets != null) __obj.updateDynamic("ConfigurationSets")(ConfigurationSets.asInstanceOf[js.Any])
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListConfigurationSetsResponse]
  }
}

