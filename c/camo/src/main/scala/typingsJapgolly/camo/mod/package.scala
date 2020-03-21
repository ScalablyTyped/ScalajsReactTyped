package typingsJapgolly.camo

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type SchemaType = typingsJapgolly.camo.mod.TypeOrArrayOfType[java.lang.String | scala.Double | scala.Boolean | js.Date | js.Object]
  type SchemaTypeConstructor = typingsJapgolly.camo.mod.TypeOrArrayOfType[
    typingsJapgolly.std.ArrayBufferConstructor | typingsJapgolly.std.ArrayConstructor | typingsJapgolly.std.BooleanConstructor | typingsJapgolly.std.DateConstructor | typingsJapgolly.std.NumberConstructor | typingsJapgolly.std.ObjectConstructor | typingsJapgolly.std.StringConstructor
  ]
  type SchemaTypeExtended = typingsJapgolly.camo.mod.SchemaTypeConstructor | typingsJapgolly.camo.mod.SchemaTypeOptions[typingsJapgolly.camo.mod.SchemaType]
  type TypeOrArrayOfType[Type] = Type | js.Array[Type]
}
