package typingsJapgolly.mongooseDelete.mod

import typingsJapgolly.mongodb.mod.FindAndModifyWriteOpResultObject
import typingsJapgolly.mongoose.mod.Document
import typingsJapgolly.mongoose.mod.ModelUpdateOptions
import typingsJapgolly.mongoose.mod.Model_
import typingsJapgolly.mongoose.mod.Query
import typingsJapgolly.mongoose.mod.QueryFindOneAndUpdateOptions
import typingsJapgolly.mongoose.mod.Types.ObjectId
import typingsJapgolly.mongoose.rawResulttrueQueryFindOneContext
import typingsJapgolly.mongoose.rawResulttrueupserttruene
import typingsJapgolly.mongoose.upserttruenewtrueQueryFin
import typingsJapgolly.mongooseDelete.DocumentQueryArrayanyanyAll
import typingsJapgolly.mongooseDelete.DocumentQueryanyanyAll
import typingsJapgolly.mongooseDelete.DocumentQueryanynullanyAll
import typingsJapgolly.mongooseDelete.Fn0
import typingsJapgolly.mongooseDelete.FnCall
import typingsJapgolly.mongooseDelete.FnCallConditionsDocOptionsCallback
import typingsJapgolly.mongooseDelete.FnCallConditionsProjectionOptionsCallback
import typingsJapgolly.mongooseDelete.FnCallConditionsUpdateOptionsCallback
import typingsJapgolly.mongooseDelete.QueryFindAndModifyWriteOpAnd
import typingsJapgolly.mongooseDelete.QueryFindAndModifyWriteOpBatchSize
import typingsJapgolly.mongooseDelete.Queryany
import typingsJapgolly.mongooseDelete.QuerynumberAll
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SoftDeleteModel[T /* <: Document */, QueryHelpers] extends Model_[T, QueryHelpers] {
  /** Count only deleted documents */
  @JSName("countDeleted")
  var countDeleted_Original: FnCall = js.native
  /** Count all documents including deleted */
  @JSName("countWithDeleted")
  var countWithDeleted_Original: FnCall = js.native
  /** Find only deleted documents */
  @JSName("findDeleted")
  var findDeleted_Original: FnCallConditionsProjectionOptionsCallback = js.native
  /** Find One And Update only deleted documents */
  @JSName("findOneAndUpdateDeleted")
  var findOneAndUpdateDeleted_Original: FnCallConditionsUpdateOptionsCallback = js.native
  /** Find One And Update all documents including deleted */
  @JSName("findOneAndUpdateWithDeleted")
  var findOneAndUpdateWithDeleted_Original: FnCallConditionsUpdateOptionsCallback = js.native
  /** Find One only deleted documents */
  @JSName("findOneDeleted")
  var findOneDeleted_Original: Fn0 = js.native
  /** Find One all documents including deleted */
  @JSName("findOneWithDeleted")
  var findOneWithDeleted_Original: Fn0 = js.native
  /** Find all documents including deleted */
  @JSName("findWithDeleted")
  var findWithDeleted_Original: FnCallConditionsProjectionOptionsCallback = js.native
  /** Update only deleted documents */
  @JSName("updateDeleted")
  var updateDeleted_Original: FnCallConditionsDocOptionsCallback = js.native
  /** Update all documents including deleted */
  @JSName("updateWithDeleted")
  var updateWithDeleted_Original: FnCallConditionsDocOptionsCallback = js.native
  /** Count only deleted documents */
  def countDeleted(conditions: js.Any): QuerynumberAll = js.native
  /** Count only deleted documents */
  def countDeleted(conditions: js.Any, callback: js.Function2[/* err */ js.Any, /* count */ Double, Unit]): QuerynumberAll = js.native
  /** Count all documents including deleted */
  def countWithDeleted(conditions: js.Any): QuerynumberAll = js.native
  /** Count all documents including deleted */
  def countWithDeleted(conditions: js.Any, callback: js.Function2[/* err */ js.Any, /* count */ Double, Unit]): QuerynumberAll = js.native
  /**
    * Delete documents by conditions
    */
  def delete(): Query[T] with QueryHelpers = js.native
  def delete(conditions: js.Any): Query[T] with QueryHelpers = js.native
  def delete(conditions: js.Any, deleteBy: js.Any): Query[T] with QueryHelpers = js.native
  def delete(conditions: js.Any, deleteBy: js.Any, fn: Callback[T, this.type]): Query[T] with QueryHelpers = js.native
  /**
    * Delete a document by ID
    */
  def deleteById(): Query[T] with QueryHelpers = js.native
  def deleteById(id: String): Query[T] with QueryHelpers = js.native
  def deleteById(id: String, deleteBy: String): Query[T] with QueryHelpers = js.native
  def deleteById(id: String, deleteBy: String, fn: Callback[T, this.type]): Query[T] with QueryHelpers = js.native
  def deleteById(id: String, deleteBy: Document): Query[T] with QueryHelpers = js.native
  def deleteById(id: String, deleteBy: Document, fn: Callback[T, this.type]): Query[T] with QueryHelpers = js.native
  def deleteById(id: String, deleteBy: ObjectId): Query[T] with QueryHelpers = js.native
  def deleteById(id: String, deleteBy: ObjectId, fn: Callback[T, this.type]): Query[T] with QueryHelpers = js.native
  def deleteById(id: String, deleteBy: Callback[T, this.type]): Query[T] with QueryHelpers = js.native
  def deleteById(id: String, deleteBy: Callback[T, this.type], fn: Callback[T, this.type]): Query[T] with QueryHelpers = js.native
  def deleteById(id: ObjectId): Query[T] with QueryHelpers = js.native
  def deleteById(id: ObjectId, deleteBy: String): Query[T] with QueryHelpers = js.native
  def deleteById(id: ObjectId, deleteBy: String, fn: Callback[T, this.type]): Query[T] with QueryHelpers = js.native
  def deleteById(id: ObjectId, deleteBy: Document): Query[T] with QueryHelpers = js.native
  def deleteById(id: ObjectId, deleteBy: Document, fn: Callback[T, this.type]): Query[T] with QueryHelpers = js.native
  def deleteById(id: ObjectId, deleteBy: ObjectId): Query[T] with QueryHelpers = js.native
  def deleteById(id: ObjectId, deleteBy: ObjectId, fn: Callback[T, this.type]): Query[T] with QueryHelpers = js.native
  def deleteById(id: ObjectId, deleteBy: Callback[T, this.type]): Query[T] with QueryHelpers = js.native
  def deleteById(id: ObjectId, deleteBy: Callback[T, this.type], fn: Callback[T, this.type]): Query[T] with QueryHelpers = js.native
  def deleteById(id: Callback[T, this.type]): Query[T] with QueryHelpers = js.native
  def deleteById(id: Callback[T, this.type], deleteBy: String): Query[T] with QueryHelpers = js.native
  def deleteById(id: Callback[T, this.type], deleteBy: String, fn: Callback[T, this.type]): Query[T] with QueryHelpers = js.native
  def deleteById(id: Callback[T, this.type], deleteBy: Document): Query[T] with QueryHelpers = js.native
  def deleteById(id: Callback[T, this.type], deleteBy: Document, fn: Callback[T, this.type]): Query[T] with QueryHelpers = js.native
  def deleteById(id: Callback[T, this.type], deleteBy: ObjectId): Query[T] with QueryHelpers = js.native
  def deleteById(id: Callback[T, this.type], deleteBy: ObjectId, fn: Callback[T, this.type]): Query[T] with QueryHelpers = js.native
  def deleteById(id: Callback[T, this.type], deleteBy: Callback[T, this.type]): Query[T] with QueryHelpers = js.native
  def deleteById(id: Callback[T, this.type], deleteBy: Callback[T, this.type], fn: Callback[T, this.type]): Query[T] with QueryHelpers = js.native
  /** Find only deleted documents */
  def findDeleted(): DocumentQueryArrayanyanyAll = js.native
  /** Find only deleted documents */
  def findDeleted(callback: js.Function2[/* err */ js.Any, /* res */ js.Array[_], Unit]): DocumentQueryArrayanyanyAll = js.native
  /** Find only deleted documents */
  def findDeleted(conditions: js.Any): DocumentQueryArrayanyanyAll = js.native
  /** Find only deleted documents */
  def findDeleted(conditions: js.Any, callback: js.Function2[/* err */ js.Any, /* res */ js.Array[_], Unit]): DocumentQueryArrayanyanyAll = js.native
  /** Find only deleted documents */
  def findDeleted(conditions: js.Any, projection: js.Any): DocumentQueryArrayanyanyAll = js.native
  /** Find only deleted documents */
  def findDeleted(
    conditions: js.Any,
    projection: js.Any,
    callback: js.Function2[/* err */ js.Any, /* res */ js.Array[_], Unit]
  ): DocumentQueryArrayanyanyAll = js.native
  /** Find only deleted documents */
  def findDeleted(conditions: js.Any, projection: js.Any, options: js.Any): DocumentQueryArrayanyanyAll = js.native
  /** Find only deleted documents */
  def findDeleted(
    conditions: js.Any,
    projection: js.Any,
    options: js.Any,
    callback: js.Function2[/* err */ js.Any, /* res */ js.Array[_], Unit]
  ): DocumentQueryArrayanyanyAll = js.native
  /** Find only deleted documents */
  def findDeleted(
    conditions: js.Any,
    projection: js.Any,
    options: Null,
    callback: js.Function2[/* err */ js.Any, /* res */ js.Array[_], Unit]
  ): DocumentQueryArrayanyanyAll = js.native
  /** Find only deleted documents */
  def findDeleted(
    conditions: js.Any,
    projection: Null,
    callback: js.Function2[/* err */ js.Any, /* res */ js.Array[_], Unit]
  ): DocumentQueryArrayanyanyAll = js.native
  /** Find only deleted documents */
  def findDeleted(conditions: js.Any, projection: Null, options: js.Any): DocumentQueryArrayanyanyAll = js.native
  /** Find only deleted documents */
  def findDeleted(
    conditions: js.Any,
    projection: Null,
    options: js.Any,
    callback: js.Function2[/* err */ js.Any, /* res */ js.Array[_], Unit]
  ): DocumentQueryArrayanyanyAll = js.native
  /** Find only deleted documents */
  def findDeleted(
    conditions: js.Any,
    projection: Null,
    options: Null,
    callback: js.Function2[/* err */ js.Any, /* res */ js.Array[_], Unit]
  ): DocumentQueryArrayanyanyAll = js.native
  /** Find One And Update only deleted documents */
  def findOneAndUpdateDeleted(): DocumentQueryanynullanyAll = js.native
  /** Find One And Update only deleted documents */
  def findOneAndUpdateDeleted(conditions: js.Any, update: js.Any): DocumentQueryanynullanyAll = js.native
  /** Find One And Update only deleted documents */
  def findOneAndUpdateDeleted(
    conditions: js.Any,
    update: js.Any,
    callback: js.Function3[/* err */ js.Any, /* doc */ js.Any | Null, /* res */ js.Any, Unit]
  ): DocumentQueryanynullanyAll = js.native
  /** Find One And Update only deleted documents */
  def findOneAndUpdateDeleted(conditions: js.Any, update: js.Any, options: QueryFindOneAndUpdateOptions): DocumentQueryanynullanyAll = js.native
  /** Find One And Update only deleted documents */
  def findOneAndUpdateDeleted(
    conditions: js.Any,
    update: js.Any,
    options: QueryFindOneAndUpdateOptions,
    callback: js.Function3[/* err */ js.Any, /* doc */ js.Any | Null, /* res */ js.Any, Unit]
  ): DocumentQueryanynullanyAll = js.native
  /** Find One And Update only deleted documents */
  def findOneAndUpdateDeleted(conditions: js.Any, update: js.Any, options: rawResulttrueQueryFindOneContext): QueryFindAndModifyWriteOpBatchSize = js.native
  /** Find One And Update only deleted documents */
  def findOneAndUpdateDeleted(
    conditions: js.Any,
    update: js.Any,
    options: rawResulttrueQueryFindOneContext,
    callback: js.Function3[
      /* err */ js.Any, 
      /* doc */ FindAndModifyWriteOpResultObject[_ | Null], 
      /* res */ js.Any, 
      Unit
    ]
  ): QueryFindAndModifyWriteOpBatchSize = js.native
  /** Find One And Update only deleted documents */
  def findOneAndUpdateDeleted(conditions: js.Any, update: js.Any, options: rawResulttrueupserttruene): QueryFindAndModifyWriteOpAnd = js.native
  /** Find One And Update only deleted documents */
  def findOneAndUpdateDeleted(
    conditions: js.Any,
    update: js.Any,
    options: rawResulttrueupserttruene,
    callback: js.Function3[
      /* err */ js.Any, 
      /* doc */ FindAndModifyWriteOpResultObject[_], 
      /* res */ js.Any, 
      Unit
    ]
  ): QueryFindAndModifyWriteOpAnd = js.native
  /** Find One And Update only deleted documents */
  def findOneAndUpdateDeleted(conditions: js.Any, update: js.Any, options: upserttruenewtrueQueryFin): DocumentQueryanyanyAll = js.native
  /** Find One And Update only deleted documents */
  def findOneAndUpdateDeleted(
    conditions: js.Any,
    update: js.Any,
    options: upserttruenewtrueQueryFin,
    callback: js.Function3[/* err */ js.Any, /* doc */ js.Any, /* res */ js.Any, Unit]
  ): DocumentQueryanyanyAll = js.native
  /** Find One And Update all documents including deleted */
  def findOneAndUpdateWithDeleted(): DocumentQueryanynullanyAll = js.native
  /** Find One And Update all documents including deleted */
  def findOneAndUpdateWithDeleted(conditions: js.Any, update: js.Any): DocumentQueryanynullanyAll = js.native
  /** Find One And Update all documents including deleted */
  def findOneAndUpdateWithDeleted(
    conditions: js.Any,
    update: js.Any,
    callback: js.Function3[/* err */ js.Any, /* doc */ js.Any | Null, /* res */ js.Any, Unit]
  ): DocumentQueryanynullanyAll = js.native
  /** Find One And Update all documents including deleted */
  def findOneAndUpdateWithDeleted(conditions: js.Any, update: js.Any, options: QueryFindOneAndUpdateOptions): DocumentQueryanynullanyAll = js.native
  /** Find One And Update all documents including deleted */
  def findOneAndUpdateWithDeleted(
    conditions: js.Any,
    update: js.Any,
    options: QueryFindOneAndUpdateOptions,
    callback: js.Function3[/* err */ js.Any, /* doc */ js.Any | Null, /* res */ js.Any, Unit]
  ): DocumentQueryanynullanyAll = js.native
  /** Find One And Update all documents including deleted */
  def findOneAndUpdateWithDeleted(conditions: js.Any, update: js.Any, options: rawResulttrueQueryFindOneContext): QueryFindAndModifyWriteOpBatchSize = js.native
  /** Find One And Update all documents including deleted */
  def findOneAndUpdateWithDeleted(
    conditions: js.Any,
    update: js.Any,
    options: rawResulttrueQueryFindOneContext,
    callback: js.Function3[
      /* err */ js.Any, 
      /* doc */ FindAndModifyWriteOpResultObject[_ | Null], 
      /* res */ js.Any, 
      Unit
    ]
  ): QueryFindAndModifyWriteOpBatchSize = js.native
  /** Find One And Update all documents including deleted */
  def findOneAndUpdateWithDeleted(conditions: js.Any, update: js.Any, options: rawResulttrueupserttruene): QueryFindAndModifyWriteOpAnd = js.native
  /** Find One And Update all documents including deleted */
  def findOneAndUpdateWithDeleted(
    conditions: js.Any,
    update: js.Any,
    options: rawResulttrueupserttruene,
    callback: js.Function3[
      /* err */ js.Any, 
      /* doc */ FindAndModifyWriteOpResultObject[_], 
      /* res */ js.Any, 
      Unit
    ]
  ): QueryFindAndModifyWriteOpAnd = js.native
  /** Find One And Update all documents including deleted */
  def findOneAndUpdateWithDeleted(conditions: js.Any, update: js.Any, options: upserttruenewtrueQueryFin): DocumentQueryanyanyAll = js.native
  /** Find One And Update all documents including deleted */
  def findOneAndUpdateWithDeleted(
    conditions: js.Any,
    update: js.Any,
    options: upserttruenewtrueQueryFin,
    callback: js.Function3[/* err */ js.Any, /* doc */ js.Any, /* res */ js.Any, Unit]
  ): DocumentQueryanyanyAll = js.native
  /** Find One only deleted documents */
  def findOneDeleted(): DocumentQueryanynullanyAll = js.native
  /** Find One only deleted documents */
  def findOneDeleted(conditions: js.Any): DocumentQueryanynullanyAll = js.native
  /** Find One only deleted documents */
  def findOneDeleted(conditions: js.Any, callback: js.Function2[/* err */ js.Any, /* res */ js.Any | Null, Unit]): DocumentQueryanynullanyAll = js.native
  /** Find One only deleted documents */
  def findOneDeleted(conditions: js.Any, projection: js.Any): DocumentQueryanynullanyAll = js.native
  /** Find One only deleted documents */
  def findOneDeleted(
    conditions: js.Any,
    projection: js.Any,
    callback: js.Function2[/* err */ js.Any, /* res */ js.Any | Null, Unit]
  ): DocumentQueryanynullanyAll = js.native
  /** Find One only deleted documents */
  def findOneDeleted(conditions: js.Any, projection: js.Any, options: js.Any): DocumentQueryanynullanyAll = js.native
  /** Find One only deleted documents */
  def findOneDeleted(
    conditions: js.Any,
    projection: js.Any,
    options: js.Any,
    callback: js.Function2[/* err */ js.Any, /* res */ js.Any | Null, Unit]
  ): DocumentQueryanynullanyAll = js.native
  /** Find One all documents including deleted */
  def findOneWithDeleted(): DocumentQueryanynullanyAll = js.native
  /** Find One all documents including deleted */
  def findOneWithDeleted(conditions: js.Any): DocumentQueryanynullanyAll = js.native
  /** Find One all documents including deleted */
  def findOneWithDeleted(conditions: js.Any, callback: js.Function2[/* err */ js.Any, /* res */ js.Any | Null, Unit]): DocumentQueryanynullanyAll = js.native
  /** Find One all documents including deleted */
  def findOneWithDeleted(conditions: js.Any, projection: js.Any): DocumentQueryanynullanyAll = js.native
  /** Find One all documents including deleted */
  def findOneWithDeleted(
    conditions: js.Any,
    projection: js.Any,
    callback: js.Function2[/* err */ js.Any, /* res */ js.Any | Null, Unit]
  ): DocumentQueryanynullanyAll = js.native
  /** Find One all documents including deleted */
  def findOneWithDeleted(conditions: js.Any, projection: js.Any, options: js.Any): DocumentQueryanynullanyAll = js.native
  /** Find One all documents including deleted */
  def findOneWithDeleted(
    conditions: js.Any,
    projection: js.Any,
    options: js.Any,
    callback: js.Function2[/* err */ js.Any, /* res */ js.Any | Null, Unit]
  ): DocumentQueryanynullanyAll = js.native
  /** Find all documents including deleted */
  def findWithDeleted(): DocumentQueryArrayanyanyAll = js.native
  /** Find all documents including deleted */
  def findWithDeleted(callback: js.Function2[/* err */ js.Any, /* res */ js.Array[_], Unit]): DocumentQueryArrayanyanyAll = js.native
  /** Find all documents including deleted */
  def findWithDeleted(conditions: js.Any): DocumentQueryArrayanyanyAll = js.native
  /** Find all documents including deleted */
  def findWithDeleted(conditions: js.Any, callback: js.Function2[/* err */ js.Any, /* res */ js.Array[_], Unit]): DocumentQueryArrayanyanyAll = js.native
  /** Find all documents including deleted */
  def findWithDeleted(conditions: js.Any, projection: js.Any): DocumentQueryArrayanyanyAll = js.native
  /** Find all documents including deleted */
  def findWithDeleted(
    conditions: js.Any,
    projection: js.Any,
    callback: js.Function2[/* err */ js.Any, /* res */ js.Array[_], Unit]
  ): DocumentQueryArrayanyanyAll = js.native
  /** Find all documents including deleted */
  def findWithDeleted(conditions: js.Any, projection: js.Any, options: js.Any): DocumentQueryArrayanyanyAll = js.native
  /** Find all documents including deleted */
  def findWithDeleted(
    conditions: js.Any,
    projection: js.Any,
    options: js.Any,
    callback: js.Function2[/* err */ js.Any, /* res */ js.Array[_], Unit]
  ): DocumentQueryArrayanyanyAll = js.native
  /** Find all documents including deleted */
  def findWithDeleted(
    conditions: js.Any,
    projection: js.Any,
    options: Null,
    callback: js.Function2[/* err */ js.Any, /* res */ js.Array[_], Unit]
  ): DocumentQueryArrayanyanyAll = js.native
  /** Find all documents including deleted */
  def findWithDeleted(
    conditions: js.Any,
    projection: Null,
    callback: js.Function2[/* err */ js.Any, /* res */ js.Array[_], Unit]
  ): DocumentQueryArrayanyanyAll = js.native
  /** Find all documents including deleted */
  def findWithDeleted(conditions: js.Any, projection: Null, options: js.Any): DocumentQueryArrayanyanyAll = js.native
  /** Find all documents including deleted */
  def findWithDeleted(
    conditions: js.Any,
    projection: Null,
    options: js.Any,
    callback: js.Function2[/* err */ js.Any, /* res */ js.Array[_], Unit]
  ): DocumentQueryArrayanyanyAll = js.native
  /** Find all documents including deleted */
  def findWithDeleted(
    conditions: js.Any,
    projection: Null,
    options: Null,
    callback: js.Function2[/* err */ js.Any, /* res */ js.Array[_], Unit]
  ): DocumentQueryArrayanyanyAll = js.native
  /**
    * Restore documents by conditions
    */
  def restore(): Query[T] with QueryHelpers = js.native
  def restore(conditions: js.Any): Query[T] with QueryHelpers = js.native
  def restore(conditions: js.Any, fn: Callback[T, this.type]): Query[T] with QueryHelpers = js.native
  /** Update only deleted documents */
  def updateDeleted(conditions: js.Any, doc: js.Any): Queryany = js.native
  /** Update only deleted documents */
  def updateDeleted(conditions: js.Any, doc: js.Any, callback: js.Function2[/* err */ js.Any, /* raw */ js.Any, Unit]): Queryany = js.native
  /** Update only deleted documents */
  def updateDeleted(conditions: js.Any, doc: js.Any, options: ModelUpdateOptions): Queryany = js.native
  /** Update only deleted documents */
  def updateDeleted(
    conditions: js.Any,
    doc: js.Any,
    options: ModelUpdateOptions,
    callback: js.Function2[/* err */ js.Any, /* raw */ js.Any, Unit]
  ): Queryany = js.native
  /** Update all documents including deleted */
  def updateWithDeleted(conditions: js.Any, doc: js.Any): Queryany = js.native
  /** Update all documents including deleted */
  def updateWithDeleted(conditions: js.Any, doc: js.Any, callback: js.Function2[/* err */ js.Any, /* raw */ js.Any, Unit]): Queryany = js.native
  /** Update all documents including deleted */
  def updateWithDeleted(conditions: js.Any, doc: js.Any, options: ModelUpdateOptions): Queryany = js.native
  /** Update all documents including deleted */
  def updateWithDeleted(
    conditions: js.Any,
    doc: js.Any,
    options: ModelUpdateOptions,
    callback: js.Function2[/* err */ js.Any, /* raw */ js.Any, Unit]
  ): Queryany = js.native
}

