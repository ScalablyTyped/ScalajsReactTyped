package typingsJapgolly.firebaseFirestore.modelFieldValueMod

import typingsJapgolly.firebaseFirestore.geoPointMod.GeoPoint
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@firebase/firestore/dist/lib/src/model/field_value", "GeoPointValue")
@js.native
class GeoPointValue protected () extends FieldValue {
  def this(internalValue: GeoPoint) = this()
  val internalValue: GeoPoint = js.native
}

