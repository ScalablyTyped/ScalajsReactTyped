package typingsJapgolly.hapiJoi.mod

import typingsJapgolly.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


type BasicType = Boolean | Double | String | js.Array[Any] | js.Object | Null

type CoerceFunction = js.Function2[/* value */ Any, /* helpers */ CustomHelpers[Any], CoerceResult]

type ComparatorFunction = js.Function2[/* a */ Any, /* b */ Any, Boolean]

type CustomValidator[V] = js.Function2[/* value */ V, /* helpers */ CustomHelpers[Any], V]

type ExtensionBoundSchema = Schema & SchemaInternals

type ExtensionFactory = js.Function1[/* joi */ Root, Extension]

type ExternalValidationFunction = js.Function1[/* value */ Any, Any]

type LanguageMessages = Record[String, String]

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.hapiJoi.mod.AnySchema
  - typingsJapgolly.hapiJoi.mod.ArraySchema
  - typingsJapgolly.hapiJoi.mod.AlternativesSchema
  - typingsJapgolly.hapiJoi.mod.BinarySchema
  - typingsJapgolly.hapiJoi.mod.BooleanSchema
  - typingsJapgolly.hapiJoi.mod.DateSchema
  - typingsJapgolly.hapiJoi.mod.FunctionSchema
  - typingsJapgolly.hapiJoi.mod.NumberSchema
  - typingsJapgolly.hapiJoi.mod.ObjectSchema[scala.Any]
  - typingsJapgolly.hapiJoi.mod.StringSchema
  - typingsJapgolly.hapiJoi.mod.LinkSchema
  - typingsJapgolly.hapiJoi.mod.SymbolSchema
*/
type Schema = _Schema | ObjectSchema[Any]

type SchemaFunction = js.Function1[/* schema */ Schema, Schema]

type SchemaLike = String | Double | Boolean | js.Object | Null | Schema | SchemaMap[Any]

type ValidationErrorFunction = js.Function1[/* errors */ js.Array[ErrorReport], String | ValidationErrorItem | js.Error]
