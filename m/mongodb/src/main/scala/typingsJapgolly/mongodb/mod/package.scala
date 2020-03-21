package typingsJapgolly.mongodb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type AcceptedFields[TSchema, FieldType, AssignableType] = /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {readonly [ key in mongodb.mongodb.KeysOfAType<TSchema, FieldType> ]:? AssignableType}
    */ typingsJapgolly.mongodb.mongodbStrings.AcceptedFields with js.Any
  type AggregationCursorResult = js.Object | scala.Null
  /** https://docs.mongodb.com/manual/reference/operator/query-bitwise */
  type BitwiseQuery = scala.Double | typingsJapgolly.bson.mod.Binary | js.Array[scala.Double]
  type CollectionMapFunction[TSchema] = js.ThisFunction0[/* this */ TSchema, scala.Unit]
  type CollectionReduceFunction[TKey, TValue] = js.Function2[/* key */ TKey, /* values */ js.Array[TValue], TValue]
  type CommandCursorResult = js.Object | scala.Null
  type Condition[T] = typingsJapgolly.mongodb.mod.MongoAltQuery[T] | typingsJapgolly.mongodb.mod.QuerySelector[typingsJapgolly.mongodb.mod.MongoAltQuery[T]]
  type CursorResult = js.Object | scala.Null | scala.Boolean
  type Default = js.Any
  type DefaultSchema = js.Any
  type DotAndArrayNotation[AssignableType] = org.scalablytyped.runtime.StringDictionary[AssignableType]
  type EndCallback = js.Function1[/* error */ typingsJapgolly.mongodb.mod.MongoError, scala.Unit]
  // TypeScript Omit (Exclude to be specific) does not work for objects with an "any" indexed type
  type EnhancedOmit[T, K] = (// T has indexed type e.g. { _id: string; [k: string]: any; } or it is "any"
  typingsJapgolly.mongodb.mod.Omit[T, K]) | T
  type ExtractIdType[TSchema] = typingsJapgolly.bson.mod.ObjectId | (typingsJapgolly.std.Exclude[js.Any, js.Object])
  type FilterQuery[T] = typingsJapgolly.mongodb.mongodbStrings.FilterQuery with T with typingsJapgolly.mongodb.mod.RootQuerySelector[T]
  type GridFSBucketErrorCallback = js.Function1[/* err */ js.UndefOr[typingsJapgolly.mongodb.mod.MongoError], scala.Unit]
  type GridFSBucketWriteStreamId = java.lang.String | scala.Double | js.Object | typingsJapgolly.bson.mod.ObjectId
  type IteratorCallback[T] = js.Function1[/* doc */ T, scala.Unit]
  /** Update Query */
  type KeysOfAType[TSchema, Type] = /* import warning: importer.ImportType#apply Failed type conversion: {[ key in keyof TSchema ]: TSchema[key] extends Type? key : never}[keyof TSchema] */ js.Any
  type KeysOfOtherType[TSchema, Type] = /* import warning: importer.ImportType#apply Failed type conversion: {[ key in keyof TSchema ]: TSchema[key] extends Type? never : key}[keyof TSchema] */ js.Any
  type MatchKeysAndValues[TSchema] = typingsJapgolly.mongodb.mod.ReadonlyPartial[TSchema] with typingsJapgolly.mongodb.mod.DotAndArrayNotation[_]
  type MongoAltQuery[T] = (typingsJapgolly.mongodb.mod.RegExpForString[js.Any | T]) | T
  type MongoCallback[T] = js.Function2[/* error */ typingsJapgolly.mongodb.mod.MongoError, /* result */ T, scala.Unit]
  /** It avoid uses fields of non Type */
  type NotAcceptedFields[TSchema, FieldType] = /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {readonly [ key in mongodb.mongodb.KeysOfOtherType<TSchema, FieldType> ]:? never}
    */ typingsJapgolly.mongodb.mongodbStrings.NotAcceptedFields with js.Any
  type ObjectQuerySelector[T] = typingsJapgolly.mongodb.mod.QuerySelector[T] | (/* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ key in keyof T ]:? mongodb.mongodb.QuerySelector<T[key]>}
    */ typingsJapgolly.mongodb.mongodbStrings.ObjectQuerySelector with T)
  // We can use TypeScript Omit once minimum required TypeScript Version is above 3.5
  type Omit[T, K] = typingsJapgolly.std.Pick[T, typingsJapgolly.std.Exclude[java.lang.String, K]]
  type OnlyFieldsOfType[TSchema, FieldType, AssignableType] = (typingsJapgolly.mongodb.mod.AcceptedFields[TSchema, FieldType, AssignableType]) with (typingsJapgolly.mongodb.mod.NotAcceptedFields[TSchema, FieldType]) with typingsJapgolly.mongodb.mod.DotAndArrayNotation[AssignableType]
  // this makes _id optional
  type OptionalId[TSchema /* <: typingsJapgolly.mongodb.AnonIdAny */] = typingsJapgolly.mongodb.mod.WithId[TSchema] | ((typingsJapgolly.mongodb.mod.EnhancedOmit[TSchema, typingsJapgolly.mongodb.mongodbStrings._id]) with typingsJapgolly.mongodb.AnonIdExtractIdType[TSchema])
  type PullAllOperator[TSchema] = typingsJapgolly.mongodb.mongodbStrings.PullAllOperator with TSchema with (typingsJapgolly.mongodb.mod.NotAcceptedFields[TSchema, js.Array[_]]) with org.scalablytyped.runtime.StringDictionary[js.Array[_]]
  type PullOperator[TSchema] = typingsJapgolly.mongodb.mongodbStrings.PullOperator with js.Any with (typingsJapgolly.mongodb.mod.NotAcceptedFields[TSchema, js.Array[_]]) with (org.scalablytyped.runtime.StringDictionary[typingsJapgolly.mongodb.mod.QuerySelector[_] | js.Any])
  type PushOperator[TSchema] = typingsJapgolly.mongodb.mongodbStrings.PushOperator with js.Any with (typingsJapgolly.mongodb.mod.NotAcceptedFields[TSchema, js.Array[_]]) with (org.scalablytyped.runtime.StringDictionary[typingsJapgolly.mongodb.mod.ArrayOperator[_] | js.Any])
  type ReadonlyPartial[TSchema] = /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {readonly [ key in keyof TSchema ]:? TSchema[key]}
    */ typingsJapgolly.mongodb.mongodbStrings.ReadonlyPartial with TSchema
  // we can search using alternative types in mongodb e.g.
  // string types can be searched using a regex in mongo
  // array types can be searched using their element type
  type RegExpForString[T] = T | js.RegExp
  type SetFields[TSchema] = typingsJapgolly.mongodb.mongodbStrings.SetFields with js.Any with (typingsJapgolly.mongodb.mod.NotAcceptedFields[TSchema, js.UndefOr[js.Array[_]]]) with (org.scalablytyped.runtime.StringDictionary[typingsJapgolly.mongodb.mod.AddToSetOperators[_] | js.Any])
  type Unpacked[Type] = Type
  // this adds _id as a required property
  type WithId[TSchema] = (typingsJapgolly.mongodb.mod.EnhancedOmit[TSchema, typingsJapgolly.mongodb.mongodbStrings._id]) with typingsJapgolly.mongodb.Anon2[TSchema]
  type WithTransactionCallback[T] = js.Function1[/* session */ typingsJapgolly.mongodb.mod.ClientSession, js.Promise[T]]
  type log = js.Function2[
    /* message */ js.UndefOr[java.lang.String], 
    /* state */ js.UndefOr[typingsJapgolly.mongodb.mod.LoggerState], 
    scala.Unit
  ]
}
