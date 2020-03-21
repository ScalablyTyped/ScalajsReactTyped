package typingsJapgolly.reactNativeFirebase.mod.RNFirebase.firestore.Types

import typingsJapgolly.reactNativeFirebase.reactNativeFirebaseStrings.`null`
import typingsJapgolly.reactNativeFirebase.reactNativeFirebaseStrings.`object`
import typingsJapgolly.reactNativeFirebase.reactNativeFirebaseStrings.array
import typingsJapgolly.reactNativeFirebase.reactNativeFirebaseStrings.boolean
import typingsJapgolly.reactNativeFirebase.reactNativeFirebaseStrings.date
import typingsJapgolly.reactNativeFirebase.reactNativeFirebaseStrings.documentid
import typingsJapgolly.reactNativeFirebase.reactNativeFirebaseStrings.fieldvalue
import typingsJapgolly.reactNativeFirebase.reactNativeFirebaseStrings.geopoint
import typingsJapgolly.reactNativeFirebase.reactNativeFirebaseStrings.number
import typingsJapgolly.reactNativeFirebase.reactNativeFirebaseStrings.reference
import typingsJapgolly.reactNativeFirebase.reactNativeFirebaseStrings.string
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TypeMap extends js.Object {
  var `type`: array | boolean | date | documentid | fieldvalue | geopoint | `null` | number | `object` | reference | string
  var value: js.Any
}

object TypeMap {
  @scala.inline
  def apply(
    `type`: array | boolean | date | documentid | fieldvalue | geopoint | `null` | number | `object` | reference | string,
    value: js.Any
  ): TypeMap = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[TypeMap]
  }
}

