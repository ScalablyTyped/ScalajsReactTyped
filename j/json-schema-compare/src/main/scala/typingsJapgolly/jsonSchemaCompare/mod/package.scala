package typingsJapgolly.jsonSchemaCompare

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type JSONSchemaComparee = js.UndefOr[
    typingsJapgolly.jsonSchema.mod.JSONSchema4 | typingsJapgolly.jsonSchema.mod.JSONSchema6Definition | typingsJapgolly.jsonSchema.mod.JSONSchema7Definition
  ]
  /**
    * The `string & {''?: never}` is a workaround for
    * [Microsoft/TypeScript#29729](https://github.com/Microsoft/TypeScript/issues/29729).
    * It will be removed as soon as it's not needed anymore.
    */
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.jsonSchemaCompare.mod.KnownKeys[typingsJapgolly.jsonSchema.mod.JSONSchema4]
    - typingsJapgolly.jsonSchemaCompare.jsonSchemaCompareStrings.$id
    - typingsJapgolly.jsonSchemaCompare.jsonSchemaCompareStrings.$ref
    - typingsJapgolly.jsonSchemaCompare.jsonSchemaCompareStrings.$schema
    - typingsJapgolly.jsonSchemaCompare.jsonSchemaCompareStrings.multipleOf
    - typingsJapgolly.jsonSchemaCompare.jsonSchemaCompareStrings.maximum
    - typingsJapgolly.jsonSchemaCompare.jsonSchemaCompareStrings.exclusiveMaximum
    - typingsJapgolly.jsonSchemaCompare.jsonSchemaCompareStrings.minimum
    - typingsJapgolly.jsonSchemaCompare.jsonSchemaCompareStrings.exclusiveMinimum
    - typingsJapgolly.jsonSchemaCompare.jsonSchemaCompareStrings.maxLength
    - typingsJapgolly.jsonSchemaCompare.jsonSchemaCompareStrings.minLength
    - typingsJapgolly.jsonSchemaCompare.jsonSchemaCompareStrings.pattern
    - typingsJapgolly.jsonSchemaCompare.jsonSchemaCompareStrings.items
    - typingsJapgolly.jsonSchemaCompare.jsonSchemaCompareStrings.additionalItems
    - typingsJapgolly.jsonSchemaCompare.jsonSchemaCompareStrings.maxItems
    - typingsJapgolly.jsonSchemaCompare.jsonSchemaCompareStrings.minItems
    - typingsJapgolly.jsonSchemaCompare.jsonSchemaCompareStrings.uniqueItems
    - typingsJapgolly.jsonSchemaCompare.jsonSchemaCompareStrings.contains
    - typingsJapgolly.jsonSchemaCompare.jsonSchemaCompareStrings.maxProperties
    - typingsJapgolly.jsonSchemaCompare.jsonSchemaCompareStrings.minProperties
    - typingsJapgolly.jsonSchemaCompare.jsonSchemaCompareStrings.required
    - typingsJapgolly.jsonSchemaCompare.jsonSchemaCompareStrings.properties
    - typingsJapgolly.jsonSchemaCompare.jsonSchemaCompareStrings.patternProperties
    - typingsJapgolly.jsonSchemaCompare.jsonSchemaCompareStrings.additionalProperties
    - typingsJapgolly.jsonSchemaCompare.jsonSchemaCompareStrings.dependencies
    - typingsJapgolly.jsonSchemaCompare.jsonSchemaCompareStrings.propertyNames
    - typingsJapgolly.jsonSchemaCompare.jsonSchemaCompareStrings.enum
    - typingsJapgolly.jsonSchemaCompare.jsonSchemaCompareStrings.const
    - typingsJapgolly.jsonSchemaCompare.jsonSchemaCompareStrings.`type`
    - typingsJapgolly.jsonSchemaCompare.jsonSchemaCompareStrings.allOf
    - typingsJapgolly.jsonSchemaCompare.jsonSchemaCompareStrings.anyOf
    - typingsJapgolly.jsonSchemaCompare.jsonSchemaCompareStrings.oneOf
    - typingsJapgolly.jsonSchemaCompare.jsonSchemaCompareStrings.not
    - typingsJapgolly.jsonSchemaCompare.jsonSchemaCompareStrings.definitions
    - typingsJapgolly.jsonSchemaCompare.jsonSchemaCompareStrings.title
    - typingsJapgolly.jsonSchemaCompare.jsonSchemaCompareStrings.description
    - typingsJapgolly.jsonSchemaCompare.jsonSchemaCompareStrings.default
    - typingsJapgolly.jsonSchemaCompare.jsonSchemaCompareStrings.examples
    - typingsJapgolly.jsonSchemaCompare.jsonSchemaCompareStrings.format
    - typingsJapgolly.jsonSchemaCompare.jsonSchemaCompareStrings.$comment
    - typingsJapgolly.jsonSchemaCompare.jsonSchemaCompareStrings.`if`
    - typingsJapgolly.jsonSchemaCompare.jsonSchemaCompareStrings.`then`
    - typingsJapgolly.jsonSchemaCompare.jsonSchemaCompareStrings.`else`
    - typingsJapgolly.jsonSchemaCompare.jsonSchemaCompareStrings.contentMediaType
    - typingsJapgolly.jsonSchemaCompare.jsonSchemaCompareStrings.contentEncoding
    - typingsJapgolly.jsonSchemaCompare.jsonSchemaCompareStrings.readOnly
    - typingsJapgolly.jsonSchemaCompare.jsonSchemaCompareStrings.writeOnly
    - java.lang.String with js.Object
  */
  type JSONSchemaKeys = typingsJapgolly.jsonSchemaCompare.mod._JSONSchemaKeys | typingsJapgolly.jsonSchemaCompare.mod.KnownKeys[typingsJapgolly.jsonSchema.mod.JSONSchema4] | (java.lang.String with js.Object)
  type KnownKeys[T] = js.Any
}
