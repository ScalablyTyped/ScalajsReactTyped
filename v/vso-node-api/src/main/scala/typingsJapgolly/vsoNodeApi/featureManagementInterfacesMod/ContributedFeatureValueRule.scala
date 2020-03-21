package typingsJapgolly.vsoNodeApi.featureManagementInterfacesMod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ContributedFeatureValueRule extends js.Object {
  /**
    * Name of the IContributedFeatureValuePlugin to run
    */
  var name: String
  /**
    * Properties to feed to the IContributedFeatureValuePlugin
    */
  var properties: StringDictionary[js.Any]
}

object ContributedFeatureValueRule {
  @scala.inline
  def apply(name: String, properties: StringDictionary[js.Any]): ContributedFeatureValueRule = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], properties = properties.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[ContributedFeatureValueRule]
  }
}

