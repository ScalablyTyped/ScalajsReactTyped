package typingsJapgolly.awsSdk.greengrassMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateResourceDefinitionRequest extends js.Object {
  /**
    * A client token used to correlate requests and responses.
    */
  var AmznClientToken: js.UndefOr[string] = js.native
  /**
    * Information about the initial version of the resource definition.
    */
  var InitialVersion: js.UndefOr[ResourceDefinitionVersion] = js.native
  /**
    * The name of the resource definition.
    */
  var Name: js.UndefOr[string] = js.native
  /**
    * Tag(s) to add to the new resource.
    */
  var tags: js.UndefOr[Tags] = js.native
}

object CreateResourceDefinitionRequest {
  @scala.inline
  def apply(
    AmznClientToken: string = null,
    InitialVersion: ResourceDefinitionVersion = null,
    Name: string = null,
    tags: Tags = null
  ): CreateResourceDefinitionRequest = {
    val __obj = js.Dynamic.literal()
    if (AmznClientToken != null) __obj.updateDynamic("AmznClientToken")(AmznClientToken.asInstanceOf[js.Any])
    if (InitialVersion != null) __obj.updateDynamic("InitialVersion")(InitialVersion.asInstanceOf[js.Any])
    if (Name != null) __obj.updateDynamic("Name")(Name.asInstanceOf[js.Any])
    if (tags != null) __obj.updateDynamic("tags")(tags.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateResourceDefinitionRequest]
  }
}

