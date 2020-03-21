package typingsJapgolly.hapiJoi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type CoerceFunction = js.Function2[
    /* value */ js.Any, 
    /* helpers */ typingsJapgolly.hapiJoi.mod.CustomHelpers[js.Any], 
    typingsJapgolly.hapiJoi.mod.CoerceResult
  ]
  type ComparatorFunction = js.Function2[/* a */ js.Any, /* b */ js.Any, scala.Boolean]
  type CustomValidator[V] = js.Function2[/* value */ V, /* helpers */ typingsJapgolly.hapiJoi.mod.CustomHelpers[js.Any], V]
  type ExtensionBoundSchema = typingsJapgolly.hapiJoi.mod.Schema with typingsJapgolly.hapiJoi.mod.SchemaInternals
  type ExtensionFactory = js.Function1[/* joi */ typingsJapgolly.hapiJoi.mod.Root, typingsJapgolly.hapiJoi.mod.Extension]
  type ExternalValidationFunction = js.Function1[/* value */ js.Any, js.Any]
  type LanguageMessages = typingsJapgolly.std.Record[java.lang.String, java.lang.String]
  type RuleMethod = js.Function1[/* repeated */ js.Any, js.Any]
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.hapiJoi.mod.AnySchema
    - typingsJapgolly.hapiJoi.mod.ArraySchema
    - typingsJapgolly.hapiJoi.mod.AlternativesSchema
    - typingsJapgolly.hapiJoi.mod.BinarySchema
    - typingsJapgolly.hapiJoi.mod.BooleanSchema
    - typingsJapgolly.hapiJoi.mod.DateSchema
    - typingsJapgolly.hapiJoi.mod.FunctionSchema
    - typingsJapgolly.hapiJoi.mod.NumberSchema
    - typingsJapgolly.hapiJoi.mod.ObjectSchema[js.Any]
    - typingsJapgolly.hapiJoi.mod.StringSchema
    - typingsJapgolly.hapiJoi.mod.LinkSchema
    - typingsJapgolly.hapiJoi.mod.SymbolSchema
  */
  type Schema = typingsJapgolly.hapiJoi.mod._Schema | typingsJapgolly.hapiJoi.mod.ObjectSchema[js.Any]
  type SchemaFunction = js.Function1[
    /* schema */ typingsJapgolly.hapiJoi.mod.Schema, 
    typingsJapgolly.hapiJoi.mod.Schema
  ]
  type SchemaLike = java.lang.String | scala.Double | scala.Boolean | js.Object | scala.Null | typingsJapgolly.hapiJoi.mod.Schema | typingsJapgolly.hapiJoi.mod.SchemaMap[js.Any]
  type SchemaMap[TSchema] = /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ key in keyof TSchema ]:? @hapi/joi.@hapi/joi.SchemaLike | std.Array<@hapi/joi.@hapi/joi.SchemaLike>}
    */ typingsJapgolly.hapiJoi.hapiJoiStrings.SchemaMap with js.Any
  type ValidationErrorFunction = js.Function1[
    /* errors */ js.Array[typingsJapgolly.hapiJoi.mod.ErrorReport], 
    java.lang.String | typingsJapgolly.hapiJoi.mod.ValidationErrorItem | js.Error
  ]
}
