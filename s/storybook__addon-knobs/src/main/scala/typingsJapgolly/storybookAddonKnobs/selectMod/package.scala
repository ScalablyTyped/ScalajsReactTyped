package typingsJapgolly.storybookAddonKnobs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object selectMod {
  type SelectTypeKnobValue = js.UndefOr[
    java.lang.String | scala.Double | scala.Null | js.Array[typingsJapgolly.std.PropertyKey]
  ]
  type SelectTypeOptionsProp[T /* <: typingsJapgolly.storybookAddonKnobs.selectMod.SelectTypeKnobValue */] = (typingsJapgolly.std.Record[
    (typingsJapgolly.std.Extract[T, typingsJapgolly.std.PropertyKey]) | typingsJapgolly.std.PropertyKey, 
    (/* import warning: importer.ImportType#apply Failed type conversion: T[keyof T] */ js.Any) | T
  ]) | (js.Array[typingsJapgolly.std.Extract[T, typingsJapgolly.std.PropertyKey]])
}
