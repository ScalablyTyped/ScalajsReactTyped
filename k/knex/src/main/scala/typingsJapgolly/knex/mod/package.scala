package typingsJapgolly.knex

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type AggregationQueryResult[TResult, TIntersectProps2] = typingsJapgolly.knex.mod.ArrayIfAlready[
    TResult, 
    TIntersectProps2 | (typingsJapgolly.knex.mod.DeferredKeySelection[
      js.Any | js.Object, 
      js.Any | scala.Nothing, 
      typingsJapgolly.knex.knexBooleans.`true` | js.Any, 
      js.Any | js.Object, 
      typingsJapgolly.knex.knexBooleans.`false` | js.Any, 
      (js.Any with TIntersectProps2) | TIntersectProps2, 
      js.Any | scala.Nothing
    ])
  ]
  type AliasDict = typingsJapgolly.knex.mod.Dict[java.lang.String]
  type AlterColumnBuilder = typingsJapgolly.knex.mod.ColumnBuilder
  type AlterTableBuilder = typingsJapgolly.knex.mod.TableBuilder
  type AnyToUnknown[T] = T | js.Any
  type ArrayIfAlready[T1, T2] = T2 | js.Array[T2]
  // If T is an array, get the type of member, else fall back to never
  type ArrayMember[T] = js.Any
  // Intersection conditionally applied only when TParams is non-empty
  // This is primarily to keep the signatures more intuitive.
  type AugmentParams[TTarget, TParams] = TTarget | (js.Object with TTarget with TParams)
  // # Type-aliases for common type combinations
  type Callback = js.Function
  type Client = js.Function
  type ColumnDescriptor[TRecord, TResult] = java.lang.String | typingsJapgolly.knex.mod.Raw[js.Any] | (typingsJapgolly.knex.mod.QueryBuilder[TRecord, TResult]) | typingsJapgolly.knex.mod.Dict[java.lang.String]
  type CreateTableBuilder = typingsJapgolly.knex.mod.TableBuilder
  // Convenience alias and associated companion namespace for working
  // with DeferredSelection having TSingle=true.
  //
  // When TSingle=true in DeferredSelection, then we are effectively
  // deferring an index access operation (TBase[TKey]) over a potentially
  // unknown initial type of TBase and potentially never initial type of TKey
  type DeferredIndex[TBase, TKey /* <: java.lang.String */] = typingsJapgolly.knex.mod.DeferredKeySelection[
    TBase, 
    TKey, 
    typingsJapgolly.knex.knexBooleans.`false`, 
    js.Object, 
    typingsJapgolly.knex.knexBooleans.`true`, 
    js.Object, 
    scala.Nothing
  ]
  type Dict[T] = org.scalablytyped.runtime.StringDictionary[T]
  type Distinct[TRecord /* <: js.Object */, TResult] = typingsJapgolly.knex.mod.ColumnNameQueryBuilder[TRecord, TResult]
  // If T can't be assigned to TBase fallback to an alternate type TAlt
  type IncompatibleToAlt[T, TBase, TAlt] = TAlt | T
  type InferrableColumnDescriptor[TRecord /* <: js.Object */] = java.lang.String | (typingsJapgolly.knex.mod.Ref[js.Any, js.Any]) | typingsJapgolly.knex.mod.Dict[java.lang.String]
  type IntersectAliases[AliasUT] = typingsJapgolly.knex.mod.UnionToIntersection[
    typingsJapgolly.knex.mod.IncompatibleToAlt[js.Any, typingsJapgolly.knex.mod.Dict[js.Any], js.Object]
  ]
  type JoinCallback = js.ThisFunction1[
    /* this */ typingsJapgolly.knex.mod.JoinClause, 
    /* join */ typingsJapgolly.knex.mod.JoinClause, 
    scala.Unit
  ]
  type JoinRaw[TRecord, TResult] = js.Function2[
    /* tableName */ java.lang.String, 
    /* binding */ js.UndefOr[typingsJapgolly.knex.mod.Value | typingsJapgolly.knex.mod.ValueDict], 
    typingsJapgolly.knex.mod.QueryBuilder[TRecord, TResult]
  ]
  type LogFn = js.Function1[/* message */ java.lang.String, scala.Unit]
  type Lookup[TRegistry /* <: js.Object */, TKey /* <: java.lang.String */, TDefault] = TDefault | (/* import warning: importer.ImportType#apply Failed type conversion: TRegistry[TKey] */ js.Any)
  // Retain the association of original keys with aliased keys at type level
  // to facilitates type-safe aliasing for object syntax
  type MappedAliasType[TBase, TAliasMapping] = js.Object with typingsJapgolly.knex.knexStrings.MappedAliasType with js.Any
  type MaybeArray[T] = T | js.Array[T]
  type MySqlAlterTableBuilder = typingsJapgolly.knex.mod.AlterTableBuilder
  // Boxing is necessary to prevent distribution of conditional types:
  // https://lorefnon.tech/2019/05/02/using-boxing-to-prevent-distribution-of-conditional-types/
  type PartialOrAny[TBase, TKeys] = (typingsJapgolly.knex.mod.SafePick[TBase, TKeys with java.lang.String]) | js.Object
  type PostgreSqlAlterTableBuilder = typingsJapgolly.knex.mod.AlterTableBuilder
  //
  // QueryBuilder
  //
  type QueryCallback[TRecord, TResult] = js.ThisFunction1[
    /* this */ typingsJapgolly.knex.mod.QueryBuilder[TRecord, TResult], 
    /* builder */ typingsJapgolly.knex.mod.QueryBuilder[TRecord, TResult], 
    scala.Unit
  ]
  type QueryCallbackWithArgs[TRecord, TResult] = js.ThisFunction2[
    /* this */ typingsJapgolly.knex.mod.QueryBuilder[TRecord, TResult], 
    /* builder */ typingsJapgolly.knex.mod.QueryBuilder[TRecord, TResult], 
    /* repeated */ js.Any, 
    scala.Unit
  ]
  type RawBinding = typingsJapgolly.knex.mod.Value | (typingsJapgolly.knex.mod.QueryBuilder[js.Any, js.Any])
  type RefBuilder = js.Function1[
    /* src */ java.lang.String, 
    typingsJapgolly.knex.mod.Ref[
      java.lang.String, 
      /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ K in string ]: string}
    */ typingsJapgolly.knex.knexStrings.RefBuilder with js.Any
    ]
  ]
  // If we have more categories of deferred selection in future,
  // this will combine all of them
  type ResolveResult[S] = typingsJapgolly.knex.mod.DeferredKeySelection.Resolve[S]
  // # Generic type-level utilities
  // If T is object then make it a partial otherwise fallback to any
  //
  // This is primarily to prevent type incompatibilities where target can be unknown.
  // While unknown can be assigned to any, Partial<unknown> can't be.
  type SafePartial[T] = typingsJapgolly.std.Partial[T]
  type SafePick[T, K /* <: java.lang.String */] = typingsJapgolly.std.Pick[T, K]
  type StrKey[T] = java.lang.String
  type TableDescriptor = java.lang.String | typingsJapgolly.knex.mod.Raw[js.Any] | (typingsJapgolly.knex.mod.QueryBuilder[js.Any, js.Array[typingsJapgolly.knex.mod.SafePartial[js.Any]]])
  type Union[TRecord, TResult] = typingsJapgolly.knex.mod.Intersect[TRecord, TResult]
  // https://stackoverflow.com/a/50375286/476712
  type UnionToIntersection[U] = js.Any
  // If T is unknown then convert to any, else retain original
  type UnknownToAny[T] = T
  // If T is an array, get the type of member, else retain original
  type UnwrapArrayMember[T] = T
  //
  // Utility Types
  //
  type Value = java.lang.String | scala.Double | scala.Boolean | js.Date | (js.Array[scala.Boolean | js.Date | scala.Double | java.lang.String]) | typingsJapgolly.node.Buffer | typingsJapgolly.knex.mod.Raw[js.Any]
  type ValueDict = typingsJapgolly.knex.mod.Dict[
    typingsJapgolly.knex.mod.Value | (typingsJapgolly.knex.mod.QueryBuilder[js.Any, js.Array[typingsJapgolly.knex.mod.SafePartial[js.Any]]])
  ]
  type WhereWrapped[TRecord, TResult] = js.Function1[
    /* callback */ typingsJapgolly.knex.mod.QueryCallback[js.Any, js.Array[js.Any]], 
    typingsJapgolly.knex.mod.QueryBuilder[TRecord, TResult]
  ]
  type WithSchema[TRecord, TResult] = js.Function1[
    /* schema */ java.lang.String, 
    typingsJapgolly.knex.mod.QueryBuilder[TRecord, TResult]
  ]
}
