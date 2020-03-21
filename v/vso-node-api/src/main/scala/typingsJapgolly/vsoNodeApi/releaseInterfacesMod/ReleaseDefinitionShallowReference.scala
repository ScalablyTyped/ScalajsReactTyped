package typingsJapgolly.vsoNodeApi.releaseInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReleaseDefinitionShallowReference extends js.Object {
  /**
    * Gets the links to related resources, APIs, and views for the release definition.
    */
  var _links: js.Any
  /**
    * Gets the unique identifier of release definition.
    */
  var id: Double
  /**
    * Gets or sets the name of the release definition.
    */
  var name: String
  /**
    * Gets the REST API url to access the release definition.
    */
  var url: String
}

object ReleaseDefinitionShallowReference {
  @scala.inline
  def apply(_links: js.Any, id: Double, name: String, url: String): ReleaseDefinitionShallowReference = {
    val __obj = js.Dynamic.literal(_links = _links.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[ReleaseDefinitionShallowReference]
  }
}

