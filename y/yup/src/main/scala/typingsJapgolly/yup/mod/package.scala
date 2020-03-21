package typingsJapgolly.yup

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type Id[T] = /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ K in keyof T ]: T[K]}
    */ typingsJapgolly.yup.yupStrings.Id with T
  type InferType[T] = typingsJapgolly.yup.mod.InnerInferType[js.Any]
  type InferredArrayType[T] = T
  type InnerInferType[T] = (typingsJapgolly.yup.mod.Id[
    typingsJapgolly.yup.mod.NotRequiredProps[_] with typingsJapgolly.yup.mod.RequiredProps[_]
  ]) | js.Array[js.Any]
  type KeyOfUndefined[T] = /* import warning: importer.ImportType#apply Failed type conversion: {[ P in keyof T ]: -? undefined extends T[P]? P : never}[keyof T] */ js.Any
  type Lazy_ = typingsJapgolly.yup.mod.Schema[js.Any]
  type LocaleValue = java.lang.String | (js.Function1[/* params */ typingsJapgolly.yup.mod.FormatErrorParams, java.lang.String])
  type NotRequiredProps[T] = typingsJapgolly.std.Partial[typingsJapgolly.std.Pick[T, typingsJapgolly.yup.mod.KeyOfUndefined[T]]]
  type ObjectSchemaDefinition[T /* <: js.UndefOr[js.Object | scala.Null] */] = /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ field in keyof T ]: yup.yup.Schema<T[field]> | yup.yup.Ref}
    */ typingsJapgolly.yup.yupStrings.ObjectSchemaDefinition with T
  type RequiredProps[T] = typingsJapgolly.std.Pick[
    T, 
    typingsJapgolly.std.Exclude[java.lang.String, typingsJapgolly.yup.mod.KeyOfUndefined[T]]
  ]
  type Shape[T /* <: js.UndefOr[js.Object | scala.Null] */, U /* <: js.Object */] = typingsJapgolly.yup.yupStrings.Shape with js.Any with U
  type TestOptionsMessage[Extra /* <: typingsJapgolly.std.Record[java.lang.String, _] */, R] = java.lang.String | (js.Function1[/* params */ Extra with typingsJapgolly.yup.PartialTestMessageParams, R])
  type TransformFunction[T] = js.ThisFunction2[/* this */ T, /* value */ js.Any, /* originalValue */ js.Any, js.Any]
  type WhenOptions[T] = typingsJapgolly.yup.mod.WhenOptionsBuilderFunction[T] | typingsJapgolly.yup.mod.WhenOptionsBuilderObject
  type WhenOptionsBuilderObject = typingsJapgolly.yup.AnonIs | js.Object
  type WhenOptionsBuilderObjectIs = (js.Function1[/* repeated */ js.Any, scala.Boolean]) | scala.Boolean | scala.Double | scala.Null | js.Object | java.lang.String
}
