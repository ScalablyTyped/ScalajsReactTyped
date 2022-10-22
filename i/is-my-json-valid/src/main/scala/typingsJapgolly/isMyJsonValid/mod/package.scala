package typingsJapgolly.isMyJsonValid.mod

import typingsJapgolly.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


type AnyAllOptionalObjectSchema = AllOptionalObjectSchema[Record[String, AnySchema]]

type AnyArraySchema = ArraySchema[AnySchema]

type AnyEnumSchema = EnumSchema[Any]

type AnyNullableAllOptionalObjectSchema = NullableAllOptionalObjectSchema[Record[String, AnySchema]]

type AnyNullableArraySchema = NullableArraySchema[AnySchema]

type AnyNullableObjectSchema = NullableObjectSchema[Record[String, AnySchema], String]

type AnyObjectSchema = ObjectSchema[Record[String, AnySchema], String]

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.isMyJsonValid.mod.NullSchema
  - typingsJapgolly.isMyJsonValid.mod.BooleanSchema
  - typingsJapgolly.isMyJsonValid.mod.NullableBooleanSchema
  - typingsJapgolly.isMyJsonValid.mod.NumberSchema
  - typingsJapgolly.isMyJsonValid.mod.NullableNumberSchema
  - typingsJapgolly.isMyJsonValid.mod.StringSchema
  - typingsJapgolly.isMyJsonValid.mod.NullableStringSchema
  - typingsJapgolly.isMyJsonValid.mod.AnyEnumSchema
  - scala.Any
  - typingsJapgolly.isMyJsonValid.mod.AnyOneOfSchema
*/
type AnySchema = _AnySchema | AnyEnumSchema | Any

type ArrayFromSchema[ItemSchema /* <: AnySchema */] = js.Array[TypeFromSchema[ItemSchema]]

type Filter[Schema /* <: AnySchema */, Output] = js.Function2[/* input */ Output, /* options */ js.UndefOr[Any], Output]

type StringKeys[T] = /* keyof T */ String
