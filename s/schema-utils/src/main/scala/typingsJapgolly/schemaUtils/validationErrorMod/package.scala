package typingsJapgolly.schemaUtils

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object validationErrorMod {
  type JSONSchema6 = typingsJapgolly.jsonSchema.mod.JSONSchema6
  type JSONSchema7 = typingsJapgolly.jsonSchema.mod.JSONSchema7
  type PostFormatter = js.Function2[
    /* formattedError */ java.lang.String, 
    /* error */ typingsJapgolly.schemaUtils.ErrorObjectchildrenArrayE, 
    java.lang.String
  ]
  type SPECIFICITY = scala.Double
  type Schema = typingsJapgolly.jsonSchema.mod.JSONSchema4 | typingsJapgolly.jsonSchema.mod.JSONSchema6 | typingsJapgolly.jsonSchema.mod.JSONSchema7
}
