package typingsJapgolly.firebaseDatabaseTypes.mod.firebaseComponentAugmentingMod

import typingsJapgolly.firebaseDatabaseTypes.mod.FirebaseDatabase
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NameServiceMapping extends js.Object {
  var database: FirebaseDatabase
}

object NameServiceMapping {
  @scala.inline
  def apply(database: FirebaseDatabase): NameServiceMapping = {
    val __obj = js.Dynamic.literal(database = database.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[NameServiceMapping]
  }
}

