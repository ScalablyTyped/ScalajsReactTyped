package typingsJapgolly.mongodb.mod

import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.mongodb.Anon0
import typingsJapgolly.mongodb.AnonBatchSizeReadPreference
import typingsJapgolly.mongodb.AnonDropTargetSession
import typingsJapgolly.mongodb.AnonFullSession
import typingsJapgolly.mongodb.AnonMaxTimeMSReadPreference
import typingsJapgolly.mongodb.AnonMaxTimeMSSession
import typingsJapgolly.mongodb.AnonScaleSession
import typingsJapgolly.mongodb.AnonSession
import typingsJapgolly.mongodb.AnonSessionClientSession
import typingsJapgolly.mongodb.ChangeStreamOptionssessio
import typingsJapgolly.mongodb.CommonOptionsbypassDocume
import typingsJapgolly.mongodb.CommonOptionsmaxTimeMSnum
import typingsJapgolly.mongodb.CommonOptionssingleboolea
import typingsJapgolly.mongodb.UpdateOneOptionsmultibool
import typingsJapgolly.std.Partial
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Collection[TSchema /* <: StringDictionary[js.Any] */] extends js.Object {
  /**
    * Get the collection name.
    */
  var collectionName: String = js.native
  /**
    * Get current index hint for collection.
    */
  var hint: js.Any = js.native
  /**
    * Get the full collection namespace.
    */
  var namespace: String = js.native
  /**
    * The current read concern values.
    */
  var readConcern: ReadConcern = js.native
  /**
    * The current write concern values.
    */
  var writeConcern: WriteConcern = js.native
  def aggregate[T](): AggregationCursor[T] = js.native
  /** http://mongodb.github.io/node-mongodb-native/3.0/api/Collection.html#aggregate */
  def aggregate[T](callback: MongoCallback[AggregationCursor[T]]): AggregationCursor[T] = js.native
  def aggregate[T](pipeline: js.Array[js.Object]): AggregationCursor[T] = js.native
  def aggregate[T](pipeline: js.Array[js.Object], callback: MongoCallback[AggregationCursor[T]]): AggregationCursor[T] = js.native
  def aggregate[T](pipeline: js.Array[js.Object], options: CollectionAggregationOptions): AggregationCursor[T] = js.native
  def aggregate[T](
    pipeline: js.Array[js.Object],
    options: CollectionAggregationOptions,
    callback: MongoCallback[AggregationCursor[T]]
  ): AggregationCursor[T] = js.native
  def bulkWrite(operations: js.Array[js.Object]): js.Promise[BulkWriteOpResultObject] = js.native
  /** http://mongodb.github.io/node-mongodb-native/3.0/api/Collection.html#bulkWrite */
  def bulkWrite(operations: js.Array[js.Object], callback: MongoCallback[BulkWriteOpResultObject]): Unit = js.native
  def bulkWrite(operations: js.Array[js.Object], options: CollectionBulkWriteOptions): js.Promise[BulkWriteOpResultObject] = js.native
  def bulkWrite(
    operations: js.Array[js.Object],
    options: CollectionBulkWriteOptions,
    callback: MongoCallback[BulkWriteOpResultObject]
  ): Unit = js.native
  def count(): js.Promise[scala.Double] = js.native
  /**
    * http://mongodb.github.io/node-mongodb-native/3.1/api/Collection.html#count
    * @deprecated Use countDocuments or estimatedDocumentCount
    */
  def count(callback: MongoCallback[scala.Double]): Unit = js.native
  def count(query: FilterQuery[TSchema]): js.Promise[scala.Double] = js.native
  def count(query: FilterQuery[TSchema], callback: MongoCallback[scala.Double]): Unit = js.native
  def count(query: FilterQuery[TSchema], options: MongoCountPreferences): js.Promise[scala.Double] = js.native
  def count(query: FilterQuery[TSchema], options: MongoCountPreferences, callback: MongoCallback[scala.Double]): Unit = js.native
  def countDocuments(): js.Promise[scala.Double] = js.native
  /** http://mongodb.github.io/node-mongodb-native/3.1/api/Collection.html#countDocuments */
  def countDocuments(callback: MongoCallback[scala.Double]): Unit = js.native
  def countDocuments(query: FilterQuery[TSchema]): js.Promise[scala.Double] = js.native
  def countDocuments(query: FilterQuery[TSchema], callback: MongoCallback[scala.Double]): Unit = js.native
  def countDocuments(query: FilterQuery[TSchema], options: MongoCountPreferences): js.Promise[scala.Double] = js.native
  def countDocuments(query: FilterQuery[TSchema], options: MongoCountPreferences, callback: MongoCallback[scala.Double]): Unit = js.native
  def createIndex(fieldOrSpec: String): js.Promise[String] = js.native
  /** http://mongodb.github.io/node-mongodb-native/3.1/api/Collection.html#createIndex */
  def createIndex(fieldOrSpec: String, callback: MongoCallback[String]): Unit = js.native
  def createIndex(fieldOrSpec: String, options: IndexOptions): js.Promise[String] = js.native
  def createIndex(fieldOrSpec: String, options: IndexOptions, callback: MongoCallback[String]): Unit = js.native
  def createIndex(fieldOrSpec: js.Any): js.Promise[String] = js.native
  def createIndex(fieldOrSpec: js.Any, callback: MongoCallback[String]): Unit = js.native
  def createIndex(fieldOrSpec: js.Any, options: IndexOptions): js.Promise[String] = js.native
  def createIndex(fieldOrSpec: js.Any, options: IndexOptions, callback: MongoCallback[String]): Unit = js.native
  def createIndexes(indexSpecs: js.Array[IndexSpecification]): js.Promise[_] = js.native
  /** http://mongodb.github.io/node-mongodb-native/3.1/api/Collection.html#createIndexes and  http://docs.mongodb.org/manual/reference/command/createIndexes/ */
  def createIndexes(indexSpecs: js.Array[IndexSpecification], callback: MongoCallback[_]): Unit = js.native
  def createIndexes(indexSpecs: js.Array[IndexSpecification], options: AnonSessionClientSession): js.Promise[_] = js.native
  def createIndexes(
    indexSpecs: js.Array[IndexSpecification],
    options: AnonSessionClientSession,
    callback: MongoCallback[_]
  ): Unit = js.native
  def deleteMany(filter: FilterQuery[TSchema]): js.Promise[DeleteWriteOpResultObject] = js.native
  /** http://mongodb.github.io/node-mongodb-native/3.1/api/Collection.html#deleteMany */
  def deleteMany(filter: FilterQuery[TSchema], callback: MongoCallback[DeleteWriteOpResultObject]): Unit = js.native
  def deleteMany(filter: FilterQuery[TSchema], options: CommonOptions): js.Promise[DeleteWriteOpResultObject] = js.native
  def deleteMany(
    filter: FilterQuery[TSchema],
    options: CommonOptions,
    callback: MongoCallback[DeleteWriteOpResultObject]
  ): Unit = js.native
  def deleteOne(filter: FilterQuery[TSchema]): js.Promise[DeleteWriteOpResultObject] = js.native
  /** http://mongodb.github.io/node-mongodb-native/3.1/api/Collection.html#deleteOne */
  def deleteOne(filter: FilterQuery[TSchema], callback: MongoCallback[DeleteWriteOpResultObject]): Unit = js.native
  def deleteOne(filter: FilterQuery[TSchema], options: CommonOptionsbypassDocume): js.Promise[DeleteWriteOpResultObject] = js.native
  def deleteOne(
    filter: FilterQuery[TSchema],
    options: CommonOptionsbypassDocume,
    callback: MongoCallback[DeleteWriteOpResultObject]
  ): Unit = js.native
  def distinct(key: String): js.Promise[_] = js.native
  /** http://mongodb.github.io/node-mongodb-native/3.1/api/Collection.html#distinct */
  def distinct(key: String, callback: MongoCallback[_]): Unit = js.native
  def distinct(key: String, query: FilterQuery[TSchema]): js.Promise[_] = js.native
  def distinct(key: String, query: FilterQuery[TSchema], callback: MongoCallback[_]): Unit = js.native
  def distinct(key: String, query: FilterQuery[TSchema], options: AnonMaxTimeMSReadPreference): js.Promise[_] = js.native
  def distinct(
    key: String,
    query: FilterQuery[TSchema],
    options: AnonMaxTimeMSReadPreference,
    callback: MongoCallback[_]
  ): Unit = js.native
  /** http://mongodb.github.io/node-mongodb-native/3.1/api/Collection.html#drop */
  def drop(): js.Promise[_] = js.native
  def drop(callback: MongoCallback[_]): Unit = js.native
  def drop(options: Anon0): js.Promise[_] = js.native
  def drop(options: Anon0, callback: MongoCallback[_]): Unit = js.native
  def dropIndex(indexName: String): js.Promise[_] = js.native
  /** http://mongodb.github.io/node-mongodb-native/3.1/api/Collection.html#dropIndex */
  def dropIndex(indexName: String, callback: MongoCallback[_]): Unit = js.native
  def dropIndex(indexName: String, options: CommonOptionsmaxTimeMSnum): js.Promise[_] = js.native
  def dropIndex(indexName: String, options: CommonOptionsmaxTimeMSnum, callback: MongoCallback[_]): Unit = js.native
  def dropIndexes(): Unit = js.native
  def dropIndexes(callback: MongoCallback[_]): Unit = js.native
  def dropIndexes(options: AnonMaxTimeMSSession): js.Promise[_] = js.native
  def dropIndexes(options: AnonMaxTimeMSSession, callback: MongoCallback[_]): Unit = js.native
  /** http://mongodb.github.io/node-mongodb-native/3.1/api/Collection.html#dropIndexes */
  @JSName("dropIndexes")
  def dropIndexes_Promise(): js.Promise[_] = js.native
  def estimatedDocumentCount(): js.Promise[scala.Double] = js.native
  /** http://mongodb.github.io/node-mongodb-native/3.1/api/Collection.html#estimatedDocumentCount */
  def estimatedDocumentCount(callback: MongoCallback[scala.Double]): Unit = js.native
  def estimatedDocumentCount(query: FilterQuery[TSchema]): js.Promise[scala.Double] = js.native
  def estimatedDocumentCount(query: FilterQuery[TSchema], callback: MongoCallback[scala.Double]): Unit = js.native
  def estimatedDocumentCount(query: FilterQuery[TSchema], options: MongoCountPreferences): js.Promise[scala.Double] = js.native
  def estimatedDocumentCount(query: FilterQuery[TSchema], options: MongoCountPreferences, callback: MongoCallback[scala.Double]): Unit = js.native
  /** http://mongodb.github.io/node-mongodb-native/3.1/api/Collection.html#find */
  def find[T](): Cursor[T] = js.native
  def find[T](query: FilterQuery[TSchema]): Cursor[T] = js.native
  def find[T](query: FilterQuery[TSchema], options: FindOneOptions): Cursor[T] = js.native
  def findOne[T](filter: FilterQuery[TSchema]): js.Promise[T | Null] = js.native
  /** http://mongodb.github.io/node-mongodb-native/3.1/api/Collection.html#findOne */
  def findOne[T](filter: FilterQuery[TSchema], callback: MongoCallback[T | Null]): Unit = js.native
  def findOne[T](filter: FilterQuery[TSchema], options: FindOneOptions): js.Promise[T | Null] = js.native
  def findOne[T](filter: FilterQuery[TSchema], options: FindOneOptions, callback: MongoCallback[T | Null]): Unit = js.native
  def findOneAndDelete(filter: FilterQuery[TSchema]): js.Promise[FindAndModifyWriteOpResultObject[TSchema]] = js.native
  /** http://mongodb.github.io/node-mongodb-native/3.1/api/Collection.html#findOneAndDelete */
  def findOneAndDelete(filter: FilterQuery[TSchema], callback: MongoCallback[FindAndModifyWriteOpResultObject[TSchema]]): Unit = js.native
  def findOneAndDelete(filter: FilterQuery[TSchema], options: FindOneAndDeleteOption): js.Promise[FindAndModifyWriteOpResultObject[TSchema]] = js.native
  def findOneAndDelete(
    filter: FilterQuery[TSchema],
    options: FindOneAndDeleteOption,
    callback: MongoCallback[FindAndModifyWriteOpResultObject[TSchema]]
  ): Unit = js.native
  def findOneAndReplace(filter: FilterQuery[TSchema], replacement: js.Object): js.Promise[FindAndModifyWriteOpResultObject[TSchema]] = js.native
  /** http://mongodb.github.io/node-mongodb-native/3.1/api/Collection.html#findOneAndReplace */
  def findOneAndReplace(
    filter: FilterQuery[TSchema],
    replacement: js.Object,
    callback: MongoCallback[FindAndModifyWriteOpResultObject[TSchema]]
  ): Unit = js.native
  def findOneAndReplace(filter: FilterQuery[TSchema], replacement: js.Object, options: FindOneAndReplaceOption): js.Promise[FindAndModifyWriteOpResultObject[TSchema]] = js.native
  def findOneAndReplace(
    filter: FilterQuery[TSchema],
    replacement: js.Object,
    options: FindOneAndReplaceOption,
    callback: MongoCallback[FindAndModifyWriteOpResultObject[TSchema]]
  ): Unit = js.native
  def findOneAndUpdate(filter: FilterQuery[TSchema], update: TSchema): js.Promise[FindAndModifyWriteOpResultObject[TSchema]] = js.native
  def findOneAndUpdate(
    filter: FilterQuery[TSchema],
    update: TSchema,
    callback: MongoCallback[FindAndModifyWriteOpResultObject[TSchema]]
  ): Unit = js.native
  def findOneAndUpdate(filter: FilterQuery[TSchema], update: TSchema, options: FindOneAndUpdateOption): js.Promise[FindAndModifyWriteOpResultObject[TSchema]] = js.native
  def findOneAndUpdate(
    filter: FilterQuery[TSchema],
    update: TSchema,
    options: FindOneAndUpdateOption,
    callback: MongoCallback[FindAndModifyWriteOpResultObject[TSchema]]
  ): Unit = js.native
  def findOneAndUpdate(filter: FilterQuery[TSchema], update: UpdateQuery[TSchema]): js.Promise[FindAndModifyWriteOpResultObject[TSchema]] = js.native
  /** http://mongodb.github.io/node-mongodb-native/3.1/api/Collection.html#findOneAndUpdate */
  def findOneAndUpdate(
    filter: FilterQuery[TSchema],
    update: UpdateQuery[TSchema],
    callback: MongoCallback[FindAndModifyWriteOpResultObject[TSchema]]
  ): Unit = js.native
  def findOneAndUpdate(filter: FilterQuery[TSchema], update: UpdateQuery[TSchema], options: FindOneAndUpdateOption): js.Promise[FindAndModifyWriteOpResultObject[TSchema]] = js.native
  def findOneAndUpdate(
    filter: FilterQuery[TSchema],
    update: UpdateQuery[TSchema],
    options: FindOneAndUpdateOption,
    callback: MongoCallback[FindAndModifyWriteOpResultObject[TSchema]]
  ): Unit = js.native
  def geoHaystackSearch(x: scala.Double, y: scala.Double): js.Promise[_] = js.native
  /** http://mongodb.github.io/node-mongodb-native/3.1/api/Collection.html#geoHaystackSearch */
  def geoHaystackSearch(x: scala.Double, y: scala.Double, callback: MongoCallback[_]): Unit = js.native
  def geoHaystackSearch(x: scala.Double, y: scala.Double, options: GeoHaystackSearchOptions): js.Promise[_] = js.native
  def geoHaystackSearch(x: scala.Double, y: scala.Double, options: GeoHaystackSearchOptions, callback: MongoCallback[_]): Unit = js.native
  def group(
    keys: js.Array[_],
    condition: js.Object,
    initial: js.Object,
    reduce: js.Function,
    finalize: js.Function,
    command: Boolean
  ): js.Promise[_] = js.native
  def group(
    keys: js.Array[_],
    condition: js.Object,
    initial: js.Object,
    reduce: js.Function,
    finalize: js.Function,
    command: Boolean,
    callback: MongoCallback[_]
  ): Unit = js.native
  def group(
    keys: js.Array[_],
    condition: js.Object,
    initial: js.Object,
    reduce: js.Function,
    finalize: js.Function,
    command: Boolean,
    options: AnonSession
  ): js.Promise[_] = js.native
  def group(
    keys: js.Array[_],
    condition: js.Object,
    initial: js.Object,
    reduce: js.Function,
    finalize: js.Function,
    command: Boolean,
    options: AnonSession,
    callback: MongoCallback[_]
  ): Unit = js.native
  def group(
    keys: js.Array[_],
    condition: js.Object,
    initial: js.Object,
    reduce: js.Function,
    finalize: Code,
    command: Boolean
  ): js.Promise[_] = js.native
  def group(
    keys: js.Array[_],
    condition: js.Object,
    initial: js.Object,
    reduce: js.Function,
    finalize: Code,
    command: Boolean,
    callback: MongoCallback[_]
  ): Unit = js.native
  def group(
    keys: js.Array[_],
    condition: js.Object,
    initial: js.Object,
    reduce: js.Function,
    finalize: Code,
    command: Boolean,
    options: AnonSession
  ): js.Promise[_] = js.native
  def group(
    keys: js.Array[_],
    condition: js.Object,
    initial: js.Object,
    reduce: js.Function,
    finalize: Code,
    command: Boolean,
    options: AnonSession,
    callback: MongoCallback[_]
  ): Unit = js.native
  def group(
    keys: js.Array[_],
    condition: js.Object,
    initial: js.Object,
    reduce: Code,
    finalize: js.Function,
    command: Boolean
  ): js.Promise[_] = js.native
  def group(
    keys: js.Array[_],
    condition: js.Object,
    initial: js.Object,
    reduce: Code,
    finalize: js.Function,
    command: Boolean,
    callback: MongoCallback[_]
  ): Unit = js.native
  def group(
    keys: js.Array[_],
    condition: js.Object,
    initial: js.Object,
    reduce: Code,
    finalize: js.Function,
    command: Boolean,
    options: AnonSession
  ): js.Promise[_] = js.native
  def group(
    keys: js.Array[_],
    condition: js.Object,
    initial: js.Object,
    reduce: Code,
    finalize: js.Function,
    command: Boolean,
    options: AnonSession,
    callback: MongoCallback[_]
  ): Unit = js.native
  def group(
    keys: js.Array[_],
    condition: js.Object,
    initial: js.Object,
    reduce: Code,
    finalize: Code,
    command: Boolean
  ): js.Promise[_] = js.native
  def group(
    keys: js.Array[_],
    condition: js.Object,
    initial: js.Object,
    reduce: Code,
    finalize: Code,
    command: Boolean,
    callback: MongoCallback[_]
  ): Unit = js.native
  def group(
    keys: js.Array[_],
    condition: js.Object,
    initial: js.Object,
    reduce: Code,
    finalize: Code,
    command: Boolean,
    options: AnonSession
  ): js.Promise[_] = js.native
  def group(
    keys: js.Array[_],
    condition: js.Object,
    initial: js.Object,
    reduce: Code,
    finalize: Code,
    command: Boolean,
    options: AnonSession,
    callback: MongoCallback[_]
  ): Unit = js.native
  def group(
    keys: js.Function,
    condition: js.Object,
    initial: js.Object,
    reduce: js.Function,
    finalize: js.Function,
    command: Boolean
  ): js.Promise[_] = js.native
  def group(
    keys: js.Function,
    condition: js.Object,
    initial: js.Object,
    reduce: js.Function,
    finalize: js.Function,
    command: Boolean,
    callback: MongoCallback[_]
  ): Unit = js.native
  def group(
    keys: js.Function,
    condition: js.Object,
    initial: js.Object,
    reduce: js.Function,
    finalize: js.Function,
    command: Boolean,
    options: AnonSession
  ): js.Promise[_] = js.native
  def group(
    keys: js.Function,
    condition: js.Object,
    initial: js.Object,
    reduce: js.Function,
    finalize: js.Function,
    command: Boolean,
    options: AnonSession,
    callback: MongoCallback[_]
  ): Unit = js.native
  def group(
    keys: js.Function,
    condition: js.Object,
    initial: js.Object,
    reduce: js.Function,
    finalize: Code,
    command: Boolean
  ): js.Promise[_] = js.native
  def group(
    keys: js.Function,
    condition: js.Object,
    initial: js.Object,
    reduce: js.Function,
    finalize: Code,
    command: Boolean,
    callback: MongoCallback[_]
  ): Unit = js.native
  def group(
    keys: js.Function,
    condition: js.Object,
    initial: js.Object,
    reduce: js.Function,
    finalize: Code,
    command: Boolean,
    options: AnonSession
  ): js.Promise[_] = js.native
  def group(
    keys: js.Function,
    condition: js.Object,
    initial: js.Object,
    reduce: js.Function,
    finalize: Code,
    command: Boolean,
    options: AnonSession,
    callback: MongoCallback[_]
  ): Unit = js.native
  def group(
    keys: js.Function,
    condition: js.Object,
    initial: js.Object,
    reduce: Code,
    finalize: js.Function,
    command: Boolean
  ): js.Promise[_] = js.native
  def group(
    keys: js.Function,
    condition: js.Object,
    initial: js.Object,
    reduce: Code,
    finalize: js.Function,
    command: Boolean,
    callback: MongoCallback[_]
  ): Unit = js.native
  def group(
    keys: js.Function,
    condition: js.Object,
    initial: js.Object,
    reduce: Code,
    finalize: js.Function,
    command: Boolean,
    options: AnonSession
  ): js.Promise[_] = js.native
  def group(
    keys: js.Function,
    condition: js.Object,
    initial: js.Object,
    reduce: Code,
    finalize: js.Function,
    command: Boolean,
    options: AnonSession,
    callback: MongoCallback[_]
  ): Unit = js.native
  def group(
    keys: js.Function,
    condition: js.Object,
    initial: js.Object,
    reduce: Code,
    finalize: Code,
    command: Boolean
  ): js.Promise[_] = js.native
  def group(
    keys: js.Function,
    condition: js.Object,
    initial: js.Object,
    reduce: Code,
    finalize: Code,
    command: Boolean,
    callback: MongoCallback[_]
  ): Unit = js.native
  def group(
    keys: js.Function,
    condition: js.Object,
    initial: js.Object,
    reduce: Code,
    finalize: Code,
    command: Boolean,
    options: AnonSession
  ): js.Promise[_] = js.native
  def group(
    keys: js.Function,
    condition: js.Object,
    initial: js.Object,
    reduce: Code,
    finalize: Code,
    command: Boolean,
    options: AnonSession,
    callback: MongoCallback[_]
  ): Unit = js.native
  /** @deprecated MongoDB 3.6 or higher no longer supports the group command. We recommend rewriting using the aggregation framework. */
  def group(
    keys: js.Object,
    condition: js.Object,
    initial: js.Object,
    reduce: js.Function,
    finalize: js.Function,
    command: Boolean
  ): js.Promise[_] = js.native
  /** http://mongodb.github.io/node-mongodb-native/3.1/api/Collection.html#group */
  /** @deprecated MongoDB 3.6 or higher no longer supports the group command. We recommend rewriting using the aggregation framework. */
  def group(
    keys: js.Object,
    condition: js.Object,
    initial: js.Object,
    reduce: js.Function,
    finalize: js.Function,
    command: Boolean,
    callback: MongoCallback[_]
  ): Unit = js.native
  def group(
    keys: js.Object,
    condition: js.Object,
    initial: js.Object,
    reduce: js.Function,
    finalize: js.Function,
    command: Boolean,
    options: AnonSession
  ): js.Promise[_] = js.native
  /** @deprecated MongoDB 3.6 or higher no longer supports the group command. We recommend rewriting using the aggregation framework. */
  def group(
    keys: js.Object,
    condition: js.Object,
    initial: js.Object,
    reduce: js.Function,
    finalize: js.Function,
    command: Boolean,
    options: AnonSession,
    callback: MongoCallback[_]
  ): Unit = js.native
  def group(
    keys: js.Object,
    condition: js.Object,
    initial: js.Object,
    reduce: js.Function,
    finalize: Code,
    command: Boolean
  ): js.Promise[_] = js.native
  def group(
    keys: js.Object,
    condition: js.Object,
    initial: js.Object,
    reduce: js.Function,
    finalize: Code,
    command: Boolean,
    callback: MongoCallback[_]
  ): Unit = js.native
  def group(
    keys: js.Object,
    condition: js.Object,
    initial: js.Object,
    reduce: js.Function,
    finalize: Code,
    command: Boolean,
    options: AnonSession
  ): js.Promise[_] = js.native
  def group(
    keys: js.Object,
    condition: js.Object,
    initial: js.Object,
    reduce: js.Function,
    finalize: Code,
    command: Boolean,
    options: AnonSession,
    callback: MongoCallback[_]
  ): Unit = js.native
  def group(
    keys: js.Object,
    condition: js.Object,
    initial: js.Object,
    reduce: Code,
    finalize: js.Function,
    command: Boolean
  ): js.Promise[_] = js.native
  def group(
    keys: js.Object,
    condition: js.Object,
    initial: js.Object,
    reduce: Code,
    finalize: js.Function,
    command: Boolean,
    callback: MongoCallback[_]
  ): Unit = js.native
  def group(
    keys: js.Object,
    condition: js.Object,
    initial: js.Object,
    reduce: Code,
    finalize: js.Function,
    command: Boolean,
    options: AnonSession
  ): js.Promise[_] = js.native
  def group(
    keys: js.Object,
    condition: js.Object,
    initial: js.Object,
    reduce: Code,
    finalize: js.Function,
    command: Boolean,
    options: AnonSession,
    callback: MongoCallback[_]
  ): Unit = js.native
  def group(
    keys: js.Object,
    condition: js.Object,
    initial: js.Object,
    reduce: Code,
    finalize: Code,
    command: Boolean
  ): js.Promise[_] = js.native
  def group(
    keys: js.Object,
    condition: js.Object,
    initial: js.Object,
    reduce: Code,
    finalize: Code,
    command: Boolean,
    callback: MongoCallback[_]
  ): Unit = js.native
  def group(
    keys: js.Object,
    condition: js.Object,
    initial: js.Object,
    reduce: Code,
    finalize: Code,
    command: Boolean,
    options: AnonSession
  ): js.Promise[_] = js.native
  def group(
    keys: js.Object,
    condition: js.Object,
    initial: js.Object,
    reduce: Code,
    finalize: Code,
    command: Boolean,
    options: AnonSession,
    callback: MongoCallback[_]
  ): Unit = js.native
  def group(
    keys: Code,
    condition: js.Object,
    initial: js.Object,
    reduce: js.Function,
    finalize: js.Function,
    command: Boolean
  ): js.Promise[_] = js.native
  def group(
    keys: Code,
    condition: js.Object,
    initial: js.Object,
    reduce: js.Function,
    finalize: js.Function,
    command: Boolean,
    callback: MongoCallback[_]
  ): Unit = js.native
  def group(
    keys: Code,
    condition: js.Object,
    initial: js.Object,
    reduce: js.Function,
    finalize: js.Function,
    command: Boolean,
    options: AnonSession
  ): js.Promise[_] = js.native
  def group(
    keys: Code,
    condition: js.Object,
    initial: js.Object,
    reduce: js.Function,
    finalize: js.Function,
    command: Boolean,
    options: AnonSession,
    callback: MongoCallback[_]
  ): Unit = js.native
  def group(
    keys: Code,
    condition: js.Object,
    initial: js.Object,
    reduce: js.Function,
    finalize: Code,
    command: Boolean
  ): js.Promise[_] = js.native
  def group(
    keys: Code,
    condition: js.Object,
    initial: js.Object,
    reduce: js.Function,
    finalize: Code,
    command: Boolean,
    callback: MongoCallback[_]
  ): Unit = js.native
  def group(
    keys: Code,
    condition: js.Object,
    initial: js.Object,
    reduce: js.Function,
    finalize: Code,
    command: Boolean,
    options: AnonSession
  ): js.Promise[_] = js.native
  def group(
    keys: Code,
    condition: js.Object,
    initial: js.Object,
    reduce: js.Function,
    finalize: Code,
    command: Boolean,
    options: AnonSession,
    callback: MongoCallback[_]
  ): Unit = js.native
  def group(
    keys: Code,
    condition: js.Object,
    initial: js.Object,
    reduce: Code,
    finalize: js.Function,
    command: Boolean
  ): js.Promise[_] = js.native
  def group(
    keys: Code,
    condition: js.Object,
    initial: js.Object,
    reduce: Code,
    finalize: js.Function,
    command: Boolean,
    callback: MongoCallback[_]
  ): Unit = js.native
  def group(
    keys: Code,
    condition: js.Object,
    initial: js.Object,
    reduce: Code,
    finalize: js.Function,
    command: Boolean,
    options: AnonSession
  ): js.Promise[_] = js.native
  def group(
    keys: Code,
    condition: js.Object,
    initial: js.Object,
    reduce: Code,
    finalize: js.Function,
    command: Boolean,
    options: AnonSession,
    callback: MongoCallback[_]
  ): Unit = js.native
  def group(
    keys: Code,
    condition: js.Object,
    initial: js.Object,
    reduce: Code,
    finalize: Code,
    command: Boolean
  ): js.Promise[_] = js.native
  def group(
    keys: Code,
    condition: js.Object,
    initial: js.Object,
    reduce: Code,
    finalize: Code,
    command: Boolean,
    callback: MongoCallback[_]
  ): Unit = js.native
  def group(
    keys: Code,
    condition: js.Object,
    initial: js.Object,
    reduce: Code,
    finalize: Code,
    command: Boolean,
    options: AnonSession
  ): js.Promise[_] = js.native
  def group(
    keys: Code,
    condition: js.Object,
    initial: js.Object,
    reduce: Code,
    finalize: Code,
    command: Boolean,
    options: AnonSession,
    callback: MongoCallback[_]
  ): Unit = js.native
  def indexExists(indexes: String): js.Promise[Boolean] = js.native
  /** http://mongodb.github.io/node-mongodb-native/3.1/api/Collection.html#indexExists */
  def indexExists(indexes: String, callback: MongoCallback[Boolean]): Unit = js.native
  def indexExists(indexes: String, options: Anon0): js.Promise[Boolean] = js.native
  def indexExists(indexes: String, options: Anon0, callback: MongoCallback[Boolean]): Unit = js.native
  def indexExists(indexes: js.Array[String]): js.Promise[Boolean] = js.native
  def indexExists(indexes: js.Array[String], callback: MongoCallback[Boolean]): Unit = js.native
  def indexExists(indexes: js.Array[String], options: Anon0): js.Promise[Boolean] = js.native
  def indexExists(indexes: js.Array[String], options: Anon0, callback: MongoCallback[Boolean]): Unit = js.native
  def indexInformation(): js.Promise[_] = js.native
  /** http://mongodb.github.io/node-mongodb-native/3.1/api/Collection.html#indexInformation */
  def indexInformation(callback: MongoCallback[_]): Unit = js.native
  def indexInformation(options: AnonFullSession): js.Promise[_] = js.native
  def indexInformation(options: AnonFullSession, callback: MongoCallback[_]): Unit = js.native
  /** http://mongodb.github.io/node-mongodb-native/3.1/api/Collection.html#indexes */
  def indexes(): js.Promise[_] = js.native
  def indexes(callback: MongoCallback[_]): Unit = js.native
  def indexes(options: Anon0): js.Promise[_] = js.native
  def indexes(options: AnonSessionClientSession, callback: MongoCallback[_]): Unit = js.native
  /** http://mongodb.github.io/node-mongodb-native/3.1/api/Collection.html#initializeOrderedBulkOp */
  def initializeOrderedBulkOp(): OrderedBulkOperation = js.native
  def initializeOrderedBulkOp(options: CommonOptions): OrderedBulkOperation = js.native
  /** http://mongodb.github.io/node-mongodb-native/3.1/api/Collection.html#initializeUnorderedBulkOp */
  def initializeUnorderedBulkOp(): UnorderedBulkOperation = js.native
  def initializeUnorderedBulkOp(options: CommonOptions): UnorderedBulkOperation = js.native
  /** @deprecated Use insertOne, insertMany or bulkWrite */
  def insert(docs: OptionalId[TSchema]): js.Promise[InsertWriteOpResult[WithId[TSchema]]] = js.native
  /** http://mongodb.github.io/node-mongodb-native/3.1/api/Collection.html#insertOne */
  /** @deprecated Use insertOne, insertMany or bulkWrite */
  def insert(docs: OptionalId[TSchema], callback: MongoCallback[InsertWriteOpResult[WithId[TSchema]]]): Unit = js.native
  def insert(docs: OptionalId[TSchema], options: CollectionInsertOneOptions): js.Promise[InsertWriteOpResult[WithId[TSchema]]] = js.native
  /** @deprecated Use insertOne, insertMany or bulkWrite */
  def insert(
    docs: OptionalId[TSchema],
    options: CollectionInsertOneOptions,
    callback: MongoCallback[InsertWriteOpResult[WithId[TSchema]]]
  ): Unit = js.native
  def insertMany(docs: js.Array[OptionalId[TSchema]]): js.Promise[InsertWriteOpResult[WithId[TSchema]]] = js.native
  /** http://mongodb.github.io/node-mongodb-native/3.1/api/Collection.html#insertMany */
  def insertMany(docs: js.Array[OptionalId[TSchema]], callback: MongoCallback[InsertWriteOpResult[WithId[TSchema]]]): Unit = js.native
  def insertMany(docs: js.Array[OptionalId[TSchema]], options: CollectionInsertManyOptions): js.Promise[InsertWriteOpResult[WithId[TSchema]]] = js.native
  def insertMany(
    docs: js.Array[OptionalId[TSchema]],
    options: CollectionInsertManyOptions,
    callback: MongoCallback[InsertWriteOpResult[WithId[TSchema]]]
  ): Unit = js.native
  def insertOne(docs: OptionalId[TSchema]): js.Promise[InsertOneWriteOpResult[WithId[TSchema]]] = js.native
  /** http://mongodb.github.io/node-mongodb-native/3.1/api/Collection.html#insertOne */
  def insertOne(docs: OptionalId[TSchema], callback: MongoCallback[InsertOneWriteOpResult[WithId[TSchema]]]): Unit = js.native
  def insertOne(docs: OptionalId[TSchema], options: CollectionInsertOneOptions): js.Promise[InsertOneWriteOpResult[WithId[TSchema]]] = js.native
  def insertOne(
    docs: OptionalId[TSchema],
    options: CollectionInsertOneOptions,
    callback: MongoCallback[InsertOneWriteOpResult[WithId[TSchema]]]
  ): Unit = js.native
  /** http://mongodb.github.io/node-mongodb-native/3.1/api/Collection.html#isCapped */
  def isCapped(): js.Promise[_] = js.native
  def isCapped(callback: MongoCallback[_]): Unit = js.native
  def isCapped(options: Anon0): js.Promise[_] = js.native
  def isCapped(options: Anon0, callback: MongoCallback[_]): Unit = js.native
  /** http://mongodb.github.io/node-mongodb-native/3.1/api/Collection.html#listIndexes */
  def listIndexes(): CommandCursor = js.native
  def listIndexes(options: AnonBatchSizeReadPreference): CommandCursor = js.native
  def mapReduce[TKey, TValue](map: String, reduce: String): js.Promise[_] = js.native
  def mapReduce[TKey, TValue](map: String, reduce: String, callback: MongoCallback[_]): Unit = js.native
  def mapReduce[TKey, TValue](map: String, reduce: String, options: MapReduceOptions): js.Promise[_] = js.native
  def mapReduce[TKey, TValue](map: String, reduce: String, options: MapReduceOptions, callback: MongoCallback[_]): Unit = js.native
  def mapReduce[TKey, TValue](map: String, reduce: CollectionReduceFunction[TKey, TValue]): js.Promise[_] = js.native
  def mapReduce[TKey, TValue](map: String, reduce: CollectionReduceFunction[TKey, TValue], callback: MongoCallback[_]): Unit = js.native
  def mapReduce[TKey, TValue](map: String, reduce: CollectionReduceFunction[TKey, TValue], options: MapReduceOptions): js.Promise[_] = js.native
  def mapReduce[TKey, TValue](
    map: String,
    reduce: CollectionReduceFunction[TKey, TValue],
    options: MapReduceOptions,
    callback: MongoCallback[_]
  ): Unit = js.native
  def mapReduce[TKey, TValue](map: CollectionMapFunction[TSchema], reduce: String): js.Promise[_] = js.native
  def mapReduce[TKey, TValue](map: CollectionMapFunction[TSchema], reduce: String, callback: MongoCallback[_]): Unit = js.native
  def mapReduce[TKey, TValue](map: CollectionMapFunction[TSchema], reduce: String, options: MapReduceOptions): js.Promise[_] = js.native
  def mapReduce[TKey, TValue](
    map: CollectionMapFunction[TSchema],
    reduce: String,
    options: MapReduceOptions,
    callback: MongoCallback[_]
  ): Unit = js.native
  def mapReduce[TKey, TValue](map: CollectionMapFunction[TSchema], reduce: CollectionReduceFunction[TKey, TValue]): js.Promise[_] = js.native
  /** http://mongodb.github.io/node-mongodb-native/3.1/api/Collection.html#mapReduce */
  def mapReduce[TKey, TValue](
    map: CollectionMapFunction[TSchema],
    reduce: CollectionReduceFunction[TKey, TValue],
    callback: MongoCallback[_]
  ): Unit = js.native
  def mapReduce[TKey, TValue](
    map: CollectionMapFunction[TSchema],
    reduce: CollectionReduceFunction[TKey, TValue],
    options: MapReduceOptions
  ): js.Promise[_] = js.native
  def mapReduce[TKey, TValue](
    map: CollectionMapFunction[TSchema],
    reduce: CollectionReduceFunction[TKey, TValue],
    options: MapReduceOptions,
    callback: MongoCallback[_]
  ): Unit = js.native
  /** http://mongodb.github.io/node-mongodb-native/3.1/api/Collection.html#options */
  def options(): js.Promise[_] = js.native
  def options(callback: MongoCallback[_]): Unit = js.native
  def options(options: Anon0): js.Promise[_] = js.native
  def options(options: Anon0, callback: MongoCallback[_]): Unit = js.native
  def parallelCollectionScan(): js.Promise[js.Array[Cursor[_]]] = js.native
  /** http://mongodb.github.io/node-mongodb-native/3.1/api/Collection.html#parallelCollectionScan */
  def parallelCollectionScan(callback: MongoCallback[js.Array[Cursor[_]]]): Unit = js.native
  def parallelCollectionScan(options: ParallelCollectionScanOptions): js.Promise[js.Array[Cursor[_]]] = js.native
  def parallelCollectionScan(options: ParallelCollectionScanOptions, callback: MongoCallback[js.Array[Cursor[_]]]): Unit = js.native
  /** http://mongodb.github.io/node-mongodb-native/3.1/api/Collection.html#reIndex */
  def reIndex(): js.Promise[_] = js.native
  def reIndex(callback: MongoCallback[_]): Unit = js.native
  def reIndex(options: Anon0): js.Promise[_] = js.native
  def reIndex(options: Anon0, callback: MongoCallback[_]): Unit = js.native
  /** @deprecated Use use deleteOne, deleteMany or bulkWrite */
  def remove(selector: js.Object): Unit = js.native
  /** http://mongodb.github.io/node-mongodb-native/3.1/api/Collection.html#remove */
  /** @deprecated Use use deleteOne, deleteMany or bulkWrite */
  def remove(selector: js.Object, callback: MongoCallback[WriteOpResult]): Unit = js.native
  def remove(selector: js.Object, options: CommonOptionssingleboolea): Unit = js.native
  def remove(selector: js.Object, options: CommonOptionssingleboolea, callback: MongoCallback[WriteOpResult]): Unit = js.native
  /** @deprecated Use use deleteOne, deleteMany or bulkWrite */
  @JSName("remove")
  def remove_Promise(selector: js.Object): js.Promise[WriteOpResult] = js.native
  @JSName("remove")
  def remove_Promise(selector: js.Object, options: CommonOptionssingleboolea): js.Promise[WriteOpResult] = js.native
  def rename(newName: String): js.Promise[Collection[TSchema]] = js.native
  /** http://mongodb.github.io/node-mongodb-native/3.1/api/Collection.html#rename */
  def rename(newName: String, callback: MongoCallback[Collection[TSchema]]): Unit = js.native
  def rename(newName: String, options: AnonDropTargetSession): js.Promise[Collection[TSchema]] = js.native
  def rename(newName: String, options: AnonDropTargetSession, callback: MongoCallback[Collection[TSchema]]): Unit = js.native
  def replaceOne(filter: FilterQuery[TSchema], doc: TSchema): js.Promise[ReplaceWriteOpResult] = js.native
  /** http://mongodb.github.io/node-mongodb-native/3.1/api/Collection.html#replaceOne */
  def replaceOne(filter: FilterQuery[TSchema], doc: TSchema, callback: MongoCallback[ReplaceWriteOpResult]): Unit = js.native
  def replaceOne(filter: FilterQuery[TSchema], doc: TSchema, options: ReplaceOneOptions): js.Promise[ReplaceWriteOpResult] = js.native
  def replaceOne(
    filter: FilterQuery[TSchema],
    doc: TSchema,
    options: ReplaceOneOptions,
    callback: MongoCallback[ReplaceWriteOpResult]
  ): Unit = js.native
  /** @deprecated Use insertOne, insertMany, updateOne or updateMany */
  def save(doc: TSchema): js.Promise[WriteOpResult] = js.native
  /** http://mongodb.github.io/node-mongodb-native/3.1/api/Collection.html#save */
  /** @deprecated Use insertOne, insertMany, updateOne or updateMany */
  def save(doc: TSchema, callback: MongoCallback[WriteOpResult]): Unit = js.native
  def save(doc: TSchema, options: CommonOptions): js.Promise[WriteOpResult] = js.native
  /** @deprecated Use insertOne, insertMany, updateOne or updateMany */
  def save(doc: TSchema, options: CommonOptions, callback: MongoCallback[WriteOpResult]): Unit = js.native
  def stats(): js.Promise[CollStats] = js.native
  /** http://mongodb.github.io/node-mongodb-native/3.1/api/Collection.html#stats */
  def stats(callback: MongoCallback[CollStats]): Unit = js.native
  def stats(options: AnonScaleSession): js.Promise[CollStats] = js.native
  def stats(options: AnonScaleSession, callback: MongoCallback[CollStats]): Unit = js.native
  /** @deprecated use updateOne, updateMany or bulkWrite */
  def update(filter: FilterQuery[TSchema], update: UpdateQuery[TSchema]): js.Promise[WriteOpResult] = js.native
  /** http://mongodb.github.io/node-mongodb-native/3.1/api/Collection.html#update */
  /** @deprecated use updateOne, updateMany or bulkWrite */
  def update(filter: FilterQuery[TSchema], update: UpdateQuery[TSchema], callback: MongoCallback[WriteOpResult]): Unit = js.native
  def update(filter: FilterQuery[TSchema], update: UpdateQuery[TSchema], options: UpdateOneOptionsmultibool): js.Promise[WriteOpResult] = js.native
  /** @deprecated use updateOne, updateMany or bulkWrite */
  def update(
    filter: FilterQuery[TSchema],
    update: UpdateQuery[TSchema],
    options: UpdateOneOptionsmultibool,
    callback: MongoCallback[WriteOpResult]
  ): Unit = js.native
  def update(filter: FilterQuery[TSchema], update: Partial[TSchema]): js.Promise[WriteOpResult] = js.native
  def update(filter: FilterQuery[TSchema], update: Partial[TSchema], callback: MongoCallback[WriteOpResult]): Unit = js.native
  def update(filter: FilterQuery[TSchema], update: Partial[TSchema], options: UpdateOneOptionsmultibool): js.Promise[WriteOpResult] = js.native
  def update(
    filter: FilterQuery[TSchema],
    update: Partial[TSchema],
    options: UpdateOneOptionsmultibool,
    callback: MongoCallback[WriteOpResult]
  ): Unit = js.native
  def updateMany(filter: FilterQuery[TSchema], update: UpdateQuery[TSchema]): js.Promise[UpdateWriteOpResult] = js.native
  /** http://mongodb.github.io/node-mongodb-native/3.1/api/Collection.html#updateMany */
  def updateMany(
    filter: FilterQuery[TSchema],
    update: UpdateQuery[TSchema],
    callback: MongoCallback[UpdateWriteOpResult]
  ): Unit = js.native
  def updateMany(filter: FilterQuery[TSchema], update: UpdateQuery[TSchema], options: UpdateManyOptions): js.Promise[UpdateWriteOpResult] = js.native
  def updateMany(
    filter: FilterQuery[TSchema],
    update: UpdateQuery[TSchema],
    options: UpdateManyOptions,
    callback: MongoCallback[UpdateWriteOpResult]
  ): Unit = js.native
  def updateMany(filter: FilterQuery[TSchema], update: Partial[TSchema]): js.Promise[UpdateWriteOpResult] = js.native
  def updateMany(
    filter: FilterQuery[TSchema],
    update: Partial[TSchema],
    callback: MongoCallback[UpdateWriteOpResult]
  ): Unit = js.native
  def updateMany(filter: FilterQuery[TSchema], update: Partial[TSchema], options: UpdateManyOptions): js.Promise[UpdateWriteOpResult] = js.native
  def updateMany(
    filter: FilterQuery[TSchema],
    update: Partial[TSchema],
    options: UpdateManyOptions,
    callback: MongoCallback[UpdateWriteOpResult]
  ): Unit = js.native
  def updateOne(filter: FilterQuery[TSchema], update: UpdateQuery[TSchema]): js.Promise[UpdateWriteOpResult] = js.native
  /** http://mongodb.github.io/node-mongodb-native/3.1/api/Collection.html#updateOne */
  def updateOne(
    filter: FilterQuery[TSchema],
    update: UpdateQuery[TSchema],
    callback: MongoCallback[UpdateWriteOpResult]
  ): Unit = js.native
  def updateOne(filter: FilterQuery[TSchema], update: UpdateQuery[TSchema], options: UpdateOneOptions): js.Promise[UpdateWriteOpResult] = js.native
  def updateOne(
    filter: FilterQuery[TSchema],
    update: UpdateQuery[TSchema],
    options: UpdateOneOptions,
    callback: MongoCallback[UpdateWriteOpResult]
  ): Unit = js.native
  def updateOne(filter: FilterQuery[TSchema], update: Partial[TSchema]): js.Promise[UpdateWriteOpResult] = js.native
  def updateOne(
    filter: FilterQuery[TSchema],
    update: Partial[TSchema],
    callback: MongoCallback[UpdateWriteOpResult]
  ): Unit = js.native
  def updateOne(filter: FilterQuery[TSchema], update: Partial[TSchema], options: UpdateOneOptions): js.Promise[UpdateWriteOpResult] = js.native
  def updateOne(
    filter: FilterQuery[TSchema],
    update: Partial[TSchema],
    options: UpdateOneOptions,
    callback: MongoCallback[UpdateWriteOpResult]
  ): Unit = js.native
  /** http://mongodb.github.io/node-mongodb-native/3.3/api/Collection.html#watch */
  def watch(): ChangeStream = js.native
  def watch(pipeline: js.Array[js.Object]): ChangeStream = js.native
  def watch(pipeline: js.Array[js.Object], options: ChangeStreamOptionssessio): ChangeStream = js.native
}

