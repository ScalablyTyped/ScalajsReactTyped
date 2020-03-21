package typingsJapgolly.cassanknex

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type AlterColumnFamilyQueryBuilder[T] = typingsJapgolly.cassanknex.mod.QueryBuilder with typingsJapgolly.cassanknex.mod.AlterableQueryBuilder[T] with typingsJapgolly.cassanknex.mod.FieldValueQueryBuilder[T]
  type CreateColumnFamilyQueryBuilder[T] = typingsJapgolly.cassanknex.mod.QueryBuilder with typingsJapgolly.cassanknex.mod.FieldValueQueryBuilder[T] with typingsJapgolly.cassanknex.mod.CreateableColumnFamilyBuilder[T]
  type CreateTypeQueryBuilder[T] = typingsJapgolly.cassanknex.mod.QueryBuilder with typingsJapgolly.cassanknex.mod.FieldValueQueryBuilder[T]
  type DeleteQueryBuilder[T] = typingsJapgolly.cassanknex.mod.QueryBuilder with typingsJapgolly.cassanknex.mod.WhereableQueryBuilder[T] with typingsJapgolly.cassanknex.mod.FromableQueryBuilder
  type InsertQueryBuilder = typingsJapgolly.cassanknex.mod.QueryBuilder with typingsJapgolly.cassanknex.mod.InsertableQueryBuilder with typingsJapgolly.cassanknex.mod.TtlableQueryBuilder
  type KeyspaceQueryBuilder = typingsJapgolly.cassanknex.mod.QueryBuilder with typingsJapgolly.cassanknex.mod.KeyspaceableQueryBuilder
  type MappedDict[B] = org.scalablytyped.runtime.StringDictionary[B]
  type SelectAsClause[T] = /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ P in keyof T ]: string}
    */ typingsJapgolly.cassanknex.cassanknexStrings.SelectAsClause with js.Any
  type SelectQueryBuilder[T] = typingsJapgolly.cassanknex.mod.QueryBuilder with typingsJapgolly.cassanknex.mod.WhereableQueryBuilder[T] with typingsJapgolly.cassanknex.mod.LimitableQueryBuilder with typingsJapgolly.cassanknex.mod.FromableQueryBuilder
  /**
    * Will return the `never` type if `T[K]` is not a member of `Type`, for all `T[K]`.
    */
  type TypeMatchedValue[T, K /* <: java.lang.String */, Type, This] = This
  type UpdateQueryBuilder[T] = typingsJapgolly.cassanknex.mod.QueryBuilder with typingsJapgolly.cassanknex.mod.WhereableQueryBuilder[T] with typingsJapgolly.cassanknex.mod.UpdateableQueryBuilder[T] with typingsJapgolly.cassanknex.mod.IfableQueryBuilder[T] with typingsJapgolly.cassanknex.mod.TtlableQueryBuilder
}
