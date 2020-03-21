package typingsJapgolly.awsSdk.appconfigMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Application extends js.Object {
  /**
    * The description of the application.
    */
  var Description: js.UndefOr[typingsJapgolly.awsSdk.appconfigMod.Description] = js.native
  /**
    * The application ID.
    */
  var Id: js.UndefOr[typingsJapgolly.awsSdk.appconfigMod.Id] = js.native
  /**
    * The application name.
    */
  var Name: js.UndefOr[typingsJapgolly.awsSdk.appconfigMod.Name] = js.native
}

object Application {
  @scala.inline
  def apply(Description: Description = null, Id: Id = null, Name: Name = null): Application = {
    val __obj = js.Dynamic.literal()
    if (Description != null) __obj.updateDynamic("Description")(Description.asInstanceOf[js.Any])
    if (Id != null) __obj.updateDynamic("Id")(Id.asInstanceOf[js.Any])
    if (Name != null) __obj.updateDynamic("Name")(Name.asInstanceOf[js.Any])
    __obj.asInstanceOf[Application]
  }
}

