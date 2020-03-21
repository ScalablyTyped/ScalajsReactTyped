package typingsJapgolly.reactNativeJoi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type ExtensionBoundSchema = typingsJapgolly.reactNativeJoi.mod.Schema with typingsJapgolly.reactNativeJoi.AnonCreateError
  type LanguageOptions = java.lang.String | scala.Boolean | scala.Null | (org.scalablytyped.runtime.StringDictionary[
    /* import warning: SimplifyRecursiveTypeAlias.enterTsTypeRef rewrittenOpt applyOrElse Simplified recursive type alias react-native-joi.react-native-joi.LanguageOptions */ js.Object
  ])
  type LazySchema = typingsJapgolly.reactNativeJoi.mod.AnySchema
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.reactNativeJoi.mod.AnySchema
    - typingsJapgolly.reactNativeJoi.mod.ArraySchema
    - typingsJapgolly.reactNativeJoi.mod.AlternativesSchema
    - typingsJapgolly.reactNativeJoi.mod.BinarySchema
    - typingsJapgolly.reactNativeJoi.mod.BooleanSchema
    - typingsJapgolly.reactNativeJoi.mod.DateSchema
    - typingsJapgolly.reactNativeJoi.mod.FunctionSchema
    - typingsJapgolly.reactNativeJoi.mod.NumberSchema
    - typingsJapgolly.reactNativeJoi.mod.ObjectSchema
    - typingsJapgolly.reactNativeJoi.mod.StringSchema
    - typingsJapgolly.reactNativeJoi.mod.LazySchema
  */
  type Schema = typingsJapgolly.reactNativeJoi.mod._Schema | typingsJapgolly.reactNativeJoi.mod.LazySchema
  /* Rewritten from type alias, can be one of: 
    - java.lang.String
    - scala.Double
    - scala.Boolean
    - js.Object
    - scala.Null
    - typingsJapgolly.reactNativeJoi.mod.Schema
    - typingsJapgolly.reactNativeJoi.mod.SchemaMap
  */
  type SchemaLike = typingsJapgolly.reactNativeJoi.mod._SchemaLike | java.lang.String | scala.Double | scala.Boolean | js.Object | scala.Null | typingsJapgolly.reactNativeJoi.mod.LazySchema
  type ValidationErrorFunction = js.Function1[
    /* errors */ js.Array[typingsJapgolly.reactNativeJoi.mod.ValidationErrorItem], 
    java.lang.String | typingsJapgolly.reactNativeJoi.mod.ValidationErrorItem | js.Array[typingsJapgolly.reactNativeJoi.mod.ValidationErrorItem] | js.Error
  ]
}
