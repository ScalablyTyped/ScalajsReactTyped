package typingsJapgolly.slonik

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type ClientConfigurationInputType = typingsJapgolly.slonik.mod.ClientConfigurationType
  type ConnectionRoutineType[T] = js.Function1[
    /* connection */ typingsJapgolly.slonik.mod.DatabasePoolConnectionType, 
    js.Promise[T]
  ]
  type DatabaseConfigurationType = java.lang.String | typingsJapgolly.slonik.AnonDatabase
  type IdentifierNormalizerType = js.Function1[/* identifierName */ java.lang.String, java.lang.String]
  type LoggerType = js.Function1[/* repeated */ java.lang.String, scala.Nothing]
  type MaybePromiseType[T] = T | js.Promise[T]
  type NamedAssignmentType = typingsJapgolly.std.Record[java.lang.String, typingsJapgolly.slonik.mod.ValueExpressionType]
  type NamedParameterValuesType = typingsJapgolly.std.Record[java.lang.String, typingsJapgolly.slonik.mod.ValueExpressionType]
  type PrimitiveValueExpressionType = java.lang.String | scala.Double | scala.Boolean | scala.Null | typingsJapgolly.slonik.mod.PrimitiveValueExpressionTypeArray
  type QueryAnyFirstFunctionType = js.Function1[
    /* args */ typingsJapgolly.slonik.mod.QueryMethodParams[js.Any], 
    js.Promise[
      js.Array[
        /* import warning: importer.ImportType#apply Failed type conversion: any[keyof any] */ js.Any
      ]
    ]
  ]
  type QueryAnyFunctionType = js.Function1[
    /* args */ typingsJapgolly.slonik.mod.QueryMethodParams[js.Any], 
    js.Promise[js.Array[js.Any]]
  ]
  type QueryFunctionType = js.Function1[
    /* args */ typingsJapgolly.slonik.mod.QueryMethodParams[js.Any], 
    js.Promise[typingsJapgolly.slonik.mod.QueryResultType[js.Any]]
  ]
  type QueryIdType = java.lang.String
  type QueryManyFirstFunctionType = typingsJapgolly.slonik.mod.QueryAnyFirstFunctionType
  type QueryManyFunctionType = typingsJapgolly.slonik.mod.QueryAnyFunctionType
  type QueryMaybeOneFirstFunctionType = js.Function1[
    /* args */ typingsJapgolly.slonik.mod.QueryMethodParams[js.Any], 
    js.Promise[
      (/* import warning: importer.ImportType#apply Failed type conversion: any[keyof any] */ js.Any) | scala.Null
    ]
  ]
  type QueryMaybeOneFunctionType = js.Function1[
    /* args */ typingsJapgolly.slonik.mod.QueryMethodParams[js.Any], 
    js.Promise[js.Any | scala.Null]
  ]
  type QueryMethodParams[T] = typingsJapgolly.std.Parameters[typingsJapgolly.slonik.mod.QueryMethodType[T, scala.Nothing]]
  type QueryMethodType[RowType, Result] = js.Function2[
    /* sql */ typingsJapgolly.slonik.mod.TaggedTemplateLiteralInvocationType[RowType], 
    /* values */ js.UndefOr[js.Array[typingsJapgolly.slonik.mod.PrimitiveValueExpressionType]], 
    js.Promise[Result]
  ]
  type QueryOneFirstFunctionType = js.Function1[
    /* args */ typingsJapgolly.slonik.mod.QueryMethodParams[js.Any], 
    js.Promise[
      /* import warning: importer.ImportType#apply Failed type conversion: any[keyof any] */ js.Any
    ]
  ]
  type QueryOneFunctionType = js.Function1[
    /* args */ typingsJapgolly.slonik.mod.QueryMethodParams[js.Any], 
    js.Promise[js.Any]
  ]
  type QueryResultRowColumnType = java.lang.String | scala.Double
  type QueryResultRowType[ColumnName /* <: java.lang.String */] = /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ name in ColumnName ]: slonik.slonik.QueryResultRowColumnType}
    */ typingsJapgolly.slonik.slonikStrings.QueryResultRowType with js.Any
  /* Rewritten from type alias, can be one of: 
    - java.lang.String
    - scala.Double
    - scala.Boolean
    - scala.Null
    - js.Object
    - typingsJapgolly.slonik.mod.SerializableValueObject
    - typingsJapgolly.slonik.mod.SerializableValueArray
  */
  type SerializableValueType = typingsJapgolly.slonik.mod._SerializableValueType | java.lang.String | scala.Double | scala.Boolean | scala.Null | js.Object
  type SqlSqlTokenType[T] = typingsJapgolly.slonik.mod.TaggedTemplateLiteralInvocationType[T]
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.slonik.mod.ArraySqlTokenType
    - typingsJapgolly.slonik.mod.BinarySqlTokenType
    - typingsJapgolly.slonik.mod.IdentifierSqlTokenType
    - typingsJapgolly.slonik.mod.JsonSqlTokenType
    - typingsJapgolly.slonik.mod.ListSqlTokenType
    - typingsJapgolly.slonik.mod.SqlSqlTokenType[js.Any]
    - typingsJapgolly.slonik.mod.UnnestSqlTokenType
  */
  type SqlTokenType = typingsJapgolly.slonik.mod._SqlTokenType | typingsJapgolly.slonik.mod.SqlSqlTokenType[js.Any]
  type StreamHandlerType = js.Function1[/* stream */ typingsJapgolly.node.streamMod.Readable, scala.Unit]
  type TransactionFunctionType[T] = js.Function1[
    /* connection */ typingsJapgolly.slonik.mod.DatabaseTransactionConnectionType, 
    js.Promise[T]
  ]
  type ValueExpressionType = typingsJapgolly.slonik.mod.SqlTokenType | typingsJapgolly.slonik.mod.PrimitiveValueExpressionType
}
