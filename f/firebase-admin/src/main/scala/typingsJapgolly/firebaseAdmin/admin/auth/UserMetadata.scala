package typingsJapgolly.firebaseAdmin.admin.auth

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Interface representing a user's metadata.
  */
trait UserMetadata extends js.Object {
  /**
    * The date the user was created, formatted as a UTC string.
    *
    */
  var creationTime: String
  /**
    * The date the user last signed in, formatted as a UTC string.
    */
  var lastSignInTime: String
  /**
    * @return A JSON-serializable representation of this object.
    */
  def toJSON(): js.Object
}

object UserMetadata {
  @scala.inline
  def apply(creationTime: String, lastSignInTime: String, toJSON: CallbackTo[js.Object]): UserMetadata = {
    val __obj = js.Dynamic.literal(creationTime = creationTime.asInstanceOf[js.Any], lastSignInTime = lastSignInTime.asInstanceOf[js.Any])
    __obj.updateDynamic("toJSON")(toJSON.toJsFn)
    __obj.asInstanceOf[UserMetadata]
  }
}

