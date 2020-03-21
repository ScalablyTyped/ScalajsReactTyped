package typingsJapgolly.typeFest

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type Class[T] = org.scalablytyped.runtime.Instantiable1[/* arguments_ (repeated) */ js.Any, T]
  /* Rewritten from type alias, can be one of: 
    - java.lang.String
    - scala.Double
    - scala.Boolean
    - scala.Null
    - typingsJapgolly.typeFest.mod.JsonObject
    - typingsJapgolly.typeFest.mod.JsonArray
  */
  type JsonValue = typingsJapgolly.typeFest.mod._JsonValue | java.lang.String | scala.Double | scala.Boolean | scala.Null
  type LiteralUnion[LiteralType /* <: BaseType */, BaseType /* <: typingsJapgolly.typeFest.mod.Primitive */] = LiteralType | (BaseType with js.Object)
  type Merge[FirstType, SecondType] = (typingsJapgolly.typeFest.mod.Omit[FirstType, typingsJapgolly.std.Extract[java.lang.String, java.lang.String]]) with SecondType
  type MergeExclusive[FirstType, SecondType] = FirstType | SecondType | ((typingsJapgolly.typeFest.mod.Without[FirstType, SecondType]) with SecondType) | ((typingsJapgolly.typeFest.mod.Without[SecondType, FirstType]) with FirstType)
  type Omit[ObjectType, KeysType /* <: java.lang.String */] = typingsJapgolly.std.Pick[ObjectType, typingsJapgolly.std.Exclude[java.lang.String, KeysType]]
  type Primitive = js.UndefOr[scala.Null | java.lang.String | scala.Double | scala.Boolean | js.Symbol]
  type RequireAtLeastOne[ObjectType, KeysType /* <: java.lang.String */] = (/* import warning: importer.ImportType#apply Failed type conversion: {[ Key in KeysType ]: // …by picking that Key's type and making it required
  std.Required<std.Pick<ObjectType, Key>>}[KeysType] */ js.Any) with (typingsJapgolly.typeFest.mod.Omit[ObjectType, KeysType])
  type TypedArray = scala.scalajs.js.typedarray.Int8Array | scala.scalajs.js.typedarray.Uint8Array | scala.scalajs.js.typedarray.Uint8ClampedArray | scala.scalajs.js.typedarray.Int16Array | scala.scalajs.js.typedarray.Uint16Array | scala.scalajs.js.typedarray.Int32Array | scala.scalajs.js.typedarray.Uint32Array | scala.scalajs.js.typedarray.Float32Array | scala.scalajs.js.typedarray.Float64Array
  // Helper type. Not useful on its own.
  type Without[FirstType, SecondType] = /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ KeyType in std.Exclude<keyof FirstType, keyof SecondType> ]:? never}
    */ typingsJapgolly.typeFest.typeFestStrings.Without with js.Any
}
