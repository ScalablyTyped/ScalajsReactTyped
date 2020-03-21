package typingsJapgolly.firebaseDatabase

import org.scalablytyped.runtime.Instantiable0
import typingsJapgolly.firebaseDatabase.mod.firebaseAppTypesAugmentingMod.FirebaseApp
import typingsJapgolly.firebaseDatabaseTypes.mod.FirebaseDatabase
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonCall extends js.Object {
  var Database: Instantiable0[FirebaseDatabase] = js.native
  var ServerValue: typingsJapgolly.firebaseDatabaseTypes.mod.ServerValue = js.native
  @JSName("enableLogging")
  var enableLogging_Original: FnCall = js.native
  def apply(): FirebaseDatabase = js.native
  def apply(app: FirebaseApp): FirebaseDatabase = js.native
  def enableLogging(): js.Any = js.native
  def enableLogging(logger: js.Function1[/* a */ String, _]): js.Any = js.native
  def enableLogging(logger: js.Function1[/* a */ String, _], persistent: Boolean): js.Any = js.native
  def enableLogging(logger: Boolean): js.Any = js.native
  def enableLogging(logger: Boolean, persistent: Boolean): js.Any = js.native
}

