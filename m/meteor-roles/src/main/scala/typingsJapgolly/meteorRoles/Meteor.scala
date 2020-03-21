package typingsJapgolly.meteorRoles

import typingsJapgolly.meteor.Mongo.Collection
import typingsJapgolly.meteorRoles.Roles.Role
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// module
@JSGlobal("Meteor")
@js.native
object Meteor extends js.Object {
  var roles: Collection[Role] = js.native
}

