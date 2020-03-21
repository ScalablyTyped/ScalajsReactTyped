package typingsJapgolly.vsoNodeApi.testInterfacesMod

import typingsJapgolly.vsoNodeApi.vssinterfacesMod.IdentityRef
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TestConfiguration extends js.Object {
  /**
    * Area of the configuration
    */
  var area: ShallowReference
  /**
    * Description of the configuration
    */
  var description: String
  /**
    * Id of the configuration
    */
  var id: Double
  /**
    * Is the configuration a default for the test plans
    */
  var isDefault: Boolean
  /**
    * Last Updated By  Reference
    */
  var lastUpdatedBy: IdentityRef
  /**
    * Last Updated Data
    */
  var lastUpdatedDate: js.Date
  /**
    * Name of the configuration
    */
  var name: String
  /**
    * Project to which the configuration belongs
    */
  var project: ShallowReference
  /**
    * Revision of the the configuration
    */
  var revision: Double
  /**
    * State of the configuration
    */
  var state: TestConfigurationState
  /**
    * Url of Configuration Resource
    */
  var url: String
  /**
    * Dictionary of Test Variable, Selected Value
    */
  var values: js.Array[NameValuePair]
}

object TestConfiguration {
  @scala.inline
  def apply(
    area: ShallowReference,
    description: String,
    id: Double,
    isDefault: Boolean,
    lastUpdatedBy: IdentityRef,
    lastUpdatedDate: js.Date,
    name: String,
    project: ShallowReference,
    revision: Double,
    state: TestConfigurationState,
    url: String,
    values: js.Array[NameValuePair]
  ): TestConfiguration = {
    val __obj = js.Dynamic.literal(area = area.asInstanceOf[js.Any], description = description.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], isDefault = isDefault.asInstanceOf[js.Any], lastUpdatedBy = lastUpdatedBy.asInstanceOf[js.Any], lastUpdatedDate = lastUpdatedDate.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], project = project.asInstanceOf[js.Any], revision = revision.asInstanceOf[js.Any], state = state.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any], values = values.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[TestConfiguration]
  }
}

