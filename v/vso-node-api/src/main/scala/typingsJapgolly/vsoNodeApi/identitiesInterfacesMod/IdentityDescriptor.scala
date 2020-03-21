package typingsJapgolly.vsoNodeApi.identitiesInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IdentityDescriptor extends js.Object {
  /**
    * The unique identifier for this identity, not exceeding 256 chars, which will be persisted.
    */
  var identifier: String
  /**
    * Type of descriptor (for example, Windows, Passport, etc.).
    */
  var identityType: String
}

object IdentityDescriptor {
  @scala.inline
  def apply(identifier: String, identityType: String): IdentityDescriptor = {
    val __obj = js.Dynamic.literal(identifier = identifier.asInstanceOf[js.Any], identityType = identityType.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[IdentityDescriptor]
  }
}

