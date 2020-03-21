package typingsJapgolly.joi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type DefaultsFunction = js.Function1[/* root */ typingsJapgolly.joi.mod.Schema, typingsJapgolly.joi.mod.Schema]
  type ExtensionBoundSchema = typingsJapgolly.joi.mod.Schema with typingsJapgolly.joi.AnonCreateError
  type LanguageOptions = java.lang.String | scala.Boolean | scala.Null | (org.scalablytyped.runtime.StringDictionary[
    /* import warning: SimplifyRecursiveTypeAlias.enterTsTypeRef rewrittenOpt applyOrElse Simplified recursive type alias joi.joi.LanguageOptions */ js.Object
  ])
  type LazySchema = typingsJapgolly.joi.mod.AnySchema
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.joi.mod.AnySchema
    - typingsJapgolly.joi.mod.ArraySchema
    - typingsJapgolly.joi.mod.AlternativesSchema
    - typingsJapgolly.joi.mod.BinarySchema
    - typingsJapgolly.joi.mod.BooleanSchema
    - typingsJapgolly.joi.mod.DateSchema
    - typingsJapgolly.joi.mod.FunctionSchema
    - typingsJapgolly.joi.mod.NumberSchema
    - typingsJapgolly.joi.mod.ObjectSchema
    - typingsJapgolly.joi.mod.StringSchema
    - typingsJapgolly.joi.mod.LazySchema
  */
  type Schema = typingsJapgolly.joi.mod._Schema | typingsJapgolly.joi.mod.LazySchema
  /* Rewritten from type alias, can be one of: 
    - java.lang.String
    - scala.Double
    - scala.Boolean
    - js.Object
    - scala.Null
    - typingsJapgolly.joi.mod.Schema
    - typingsJapgolly.joi.mod.SchemaMap
  */
  type SchemaLike = typingsJapgolly.joi.mod._SchemaLike | java.lang.String | scala.Double | scala.Boolean | js.Object | scala.Null | typingsJapgolly.joi.mod.LazySchema
  type ValidationErrorFunction = js.Function1[
    /* errors */ js.Array[typingsJapgolly.joi.mod.ValidationErrorItem], 
    java.lang.String | typingsJapgolly.joi.mod.ValidationErrorItem | js.Array[typingsJapgolly.joi.mod.ValidationErrorItem] | js.Error
  ]
}
