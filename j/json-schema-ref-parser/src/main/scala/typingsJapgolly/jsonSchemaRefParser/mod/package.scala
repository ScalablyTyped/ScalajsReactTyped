package typingsJapgolly.jsonSchemaRefParser

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type JSONSchema = typingsJapgolly.jsonSchema.mod.JSONSchema4 | typingsJapgolly.jsonSchema.mod.JSONSchema6
  type RefsCallback = js.Function2[
    /* err */ js.Error | scala.Null, 
    /* $refs */ js.UndefOr[typingsJapgolly.jsonSchemaRefParser.mod.Refs], 
    js.Any
  ]
  type SchemaCallback = js.Function2[
    /* err */ js.Error | scala.Null, 
    /* schema */ js.UndefOr[typingsJapgolly.jsonSchemaRefParser.mod.JSONSchema], 
    js.Any
  ]
}
