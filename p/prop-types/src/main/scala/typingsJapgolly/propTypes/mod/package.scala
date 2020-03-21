package typingsJapgolly.propTypes

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type InferProps[V] = (typingsJapgolly.propTypes.mod.InferPropsInner[typingsJapgolly.std.Pick[V, typingsJapgolly.propTypes.mod.RequiredKeys[V]]]) with (typingsJapgolly.std.Partial[
    typingsJapgolly.propTypes.mod.InferPropsInner[typingsJapgolly.std.Pick[V, typingsJapgolly.propTypes.mod.OptionalKeys[V]]]
  ])
  type InferPropsInner[V] = /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ K in keyof V ]: -? prop-types.prop-types.InferType<V[K]>}
    */ typingsJapgolly.propTypes.propTypesStrings.InferPropsInner with V
  type InferType[V] = js.Any
  type OptionalKeys[V] = typingsJapgolly.std.Exclude[java.lang.String, typingsJapgolly.propTypes.mod.RequiredKeys[V]]
  type ReactComponentLike = java.lang.String | (js.Function2[/* props */ js.Any, /* context */ js.UndefOr[js.Any], js.Any]) | (org.scalablytyped.runtime.Instantiable2[/* props */ js.Any, js.UndefOr[/* context */ js.Any], js.Any])
  /* Rewritten from type alias, can be one of: 
    - js.Object
    - typingsJapgolly.propTypes.mod.ReactElementLike
    - typingsJapgolly.propTypes.mod.ReactNodeArray
    - java.lang.String
    - scala.Double
    - scala.Boolean
    - scala.Null
    - `js.undefined`
  */
  type ReactNodeLike = js.UndefOr[
    typingsJapgolly.propTypes.mod._ReactNodeLike | js.Object | java.lang.String | scala.Double | scala.Boolean | scala.Null
  ]
  type RequiredKeys[V] = /* import warning: importer.ImportType#apply Failed type conversion: {[ K in keyof V ]: -? std.Exclude<V[K], undefined> extends prop-types.prop-types.Validator<infer T>? prop-types.prop-types.IsOptional<any> extends true? never : K : never}[keyof V] */ js.Any
  type ValidationMap[T] = /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ K in keyof T ]:? prop-types.prop-types.Validator<T[K]>}
    */ typingsJapgolly.propTypes.propTypesStrings.ValidationMap with T
}
