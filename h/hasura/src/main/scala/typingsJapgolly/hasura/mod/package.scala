package typingsJapgolly.hasura.mod

import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.hasura.anon.Type
import typingsJapgolly.hasura.anon.`0`
import typingsJapgolly.hasura.mod.^
import typingsJapgolly.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


inline def HASURA_ROLE_ADMIN: /* "admin" */ String = ^.asInstanceOf[js.Dynamic].selectDynamic("HASURA_ROLE_ADMIN").asInstanceOf[/* "admin" */ String]

inline def XHasuraAdminSecret: /* "x-hasura-admin-secret" */ String = ^.asInstanceOf[js.Dynamic].selectDynamic("XHasuraAdminSecret").asInstanceOf[/* "x-hasura-admin-secret" */ String]

inline def XHasuraClientName: /* "hasura-client-name" */ String = ^.asInstanceOf[js.Dynamic].selectDynamic("XHasuraClientName").asInstanceOf[/* "hasura-client-name" */ String]

inline def XHasuraRole: /* "x-hasura-role" */ String = ^.asInstanceOf[js.Dynamic].selectDynamic("XHasuraRole").asInstanceOf[/* "x-hasura-role" */ String]

inline def XHasuraUserID: /* "x-hasura-user-id" */ String = ^.asInstanceOf[js.Dynamic].selectDynamic("XHasuraUserID").asInstanceOf[/* "x-hasura-user-id" */ String]

type Aggregate[T] = T & typingsJapgolly.hasura.anon.Aggregate

type HasuraDataItem[T /* <: Record[String, Any] */] = T & StringDictionary[Any]

type HasuraDataResult[T /* <: Record[String, Any] */] = js.Array[HasuraDataItem[T]]

type HasuraInsertInput[T /* <: Record[String, Any] */, OKey /* <: String */, ConflictKey /* <: String */] = (/* import warning: importer.ImportType#apply Failed type conversion: {[ ok in OKey ]: std.Array<hasura.hasura.HasuraInsertInputObject<T>>} */ js.Any) & (HasuraInsertOnConflict[T, ConflictKey])

type HasuraInsertInputSingle[T /* <: Record[String, Any] */, OKey /* <: String */, OC /* <: String */] = (/* import warning: importer.ImportType#apply Failed type conversion: {[ ok in OKey ]: hasura.hasura.HasuraInsertInputObject<T>} */ js.Any) & (HasuraInsertOnConflict[T, OC])

type JSONColumnBoolExp = ColumnBoolExp[String]

type MinMaxAggregateKeys[T] = /* import warning: importer.ImportType#apply Failed type conversion: {[ key in keyof T ]: hasura.hasura.Equals<T[key], hasura.hasura.ScalarUUID> extends true? never : T[key] extends number | string | boolean? key : never}[keyof T] */ js.Any

type NumberScalarKeys[T] = /* import warning: importer.ImportType#apply Failed type conversion: {[ key in keyof T ]: T[key] extends number? key : never}[keyof T] */ js.Any

type ObjectType = Record[
String, 
ScalarType | (Record[String, ScalarType]) | (js.Array[Record[String, ScalarType]])]

type OrderByAggregate[T /* <: Record[String, Any] */] = (/* import warning: importer.ImportType#apply Failed type conversion: hasura.hasura.NumberScalarKeys<T> extends never ? hasura.hasura.BaseOrderByAggregate<T> : hasura.hasura.BaseOrderByAggregate<T> & hasura.hasura.NumberOrderByAggregate<T, hasura.hasura.NumberScalarKeys<T>> */ js.Any) & OrderBy[T]

type ScalaKeys[T] = /* import warning: importer.ImportType#apply Failed type conversion: {[ key in keyof T ]: hasura.hasura.Equals<T[key], hasura.hasura.ScalarJSON<T[key]>> extends true? key : hasura.hasura.Equals<T[key], hasura.hasura.ScalarJSONB<T[key]>> extends true? key : T[key] extends number | string | boolean? key : never}[keyof T] */ js.Any

type ScalarJSON[T] = T & Type

type ScalarJSONB[T] = T & `0`

type ScalarType = String | Double | Boolean | ScalarJSON[Any] | ScalarJSONB[Any]
