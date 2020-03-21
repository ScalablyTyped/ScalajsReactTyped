package typingsJapgolly.mongoose

import org.scalablytyped.runtime.Instantiable2
import typingsJapgolly.mongodb.mod.ReadPreference
import typingsJapgolly.mongodb.mod.ReadPreferenceMode
import typingsJapgolly.mongoose.mongooseStrings.nearest
import typingsJapgolly.mongoose.mongooseStrings.primary
import typingsJapgolly.mongoose.mongooseStrings.primaryPreferred
import typingsJapgolly.mongoose.mongooseStrings.secondary
import typingsJapgolly.mongoose.mongooseStrings.secondaryPreferred
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TypeofReadPreference
  extends Instantiable2[/* mode */ ReadPreferenceMode, /* tags */ js.Object, ReadPreference] {
  var NEAREST: nearest = js.native
  var PRIMARY: primary = js.native
  var PRIMARY_PREFERRED: primaryPreferred = js.native
  var SECONDARY: secondary = js.native
  var SECONDARY_PREFERRED: secondaryPreferred = js.native
  def isValid(mode: String): Boolean = js.native
}

