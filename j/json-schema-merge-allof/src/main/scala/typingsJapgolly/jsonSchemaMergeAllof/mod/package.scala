package typingsJapgolly.jsonSchemaMergeAllof

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type JSONSchema = typingsJapgolly.jsonSchema.mod.JSONSchema4 | typingsJapgolly.jsonSchema.mod.JSONSchema6 | typingsJapgolly.jsonSchema.mod.JSONSchema7
  type JSONSchema46 = typingsJapgolly.jsonSchema.mod.JSONSchema4 | typingsJapgolly.jsonSchema.mod.JSONSchema6
  type MergeChildSchemas = js.Function2[
    /* schemas */ js.Array[typingsJapgolly.jsonSchemaMergeAllof.mod.JSONSchema], 
    /* childSchemaName */ java.lang.String, 
    typingsJapgolly.jsonSchemaMergeAllof.mod.JSONSchema
  ]
  type MergeSchemas = js.Function1[
    /* schemas */ js.Array[typingsJapgolly.jsonSchemaMergeAllof.mod.JSONSchema], 
    typingsJapgolly.jsonSchemaMergeAllof.mod.JSONSchema
  ]
}
