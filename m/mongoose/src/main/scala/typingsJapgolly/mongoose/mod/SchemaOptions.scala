package typingsJapgolly.mongoose.mod

import typingsJapgolly.mongoose.AnonAutoIndexId
import typingsJapgolly.mongoose.AnonJ
import typingsJapgolly.mongoose.mongooseStrings.`throw`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SchemaOptions extends js.Object {
  /** defaults to true */
  var _id: js.UndefOr[Boolean] = js.undefined
  /** defaults to false (which means use the connection's autoIndex option) */
  var autoIndex: js.UndefOr[Boolean] = js.undefined
  /** defaults to true */
  var bufferCommands: js.UndefOr[Boolean] = js.undefined
  /** defaults to false */
  var capped: js.UndefOr[Boolean | Double | AnonAutoIndexId] = js.undefined
  /** Sets a default collation for every query and aggregation. */
  var collation: js.UndefOr[CollationOptions] = js.undefined
  /** no default */
  var collection: js.UndefOr[String] = js.undefined
  /** defaults to "__t" */
  var discriminatorKey: js.UndefOr[String] = js.undefined
  /** defaults to false. */
  var emitIndexErrors: js.UndefOr[Boolean] = js.undefined
  var excludeIndexes: js.UndefOr[js.Any] = js.undefined
  /** defaults to true */
  var id: js.UndefOr[Boolean] = js.undefined
  /** controls document#toObject behavior when called manually - defaults to true */
  var minimize: js.UndefOr[Boolean] = js.undefined
  var read: js.UndefOr[String] = js.undefined
  /** defaults to true. */
  var safe: js.UndefOr[Boolean | AnonJ] = js.undefined
  /**
    * By default, Mongoose will automatically
    * select() any populated paths.
    * To opt out, set selectPopulatedPaths to false.
    */
  var selectPopulatedPaths: js.UndefOr[Boolean] = js.undefined
  /** defaults to null */
  var shardKey: js.UndefOr[js.Object] = js.undefined
  /**
    * skipVersioning allows excluding paths from
    * versioning (the internal revision will not be
    * incremented even if these paths are updated).
    */
  var skipVersioning: js.UndefOr[js.Any] = js.undefined
  /**
    * Validation errors in a single nested schema are reported
    * both on the child and on the parent schema.
    * Set storeSubdocValidationError to false on the child schema
    * to make Mongoose only report the parent error.
    */
  var storeSubdocValidationError: js.UndefOr[Boolean] = js.undefined
  /** defaults to true */
  var strict: js.UndefOr[Boolean | `throw`] = js.undefined
  /**
    * If set timestamps, mongoose assigns createdAt
    * and updatedAt fields to your schema, the type
    * assigned is Date.
    */
  var timestamps: js.UndefOr[Boolean | SchemaTimestampsConfig] = js.undefined
  /** no default */
  var toJSON: js.UndefOr[DocumentToObjectOptions] = js.undefined
  /** no default */
  var toObject: js.UndefOr[DocumentToObjectOptions] = js.undefined
  /** defaults to 'type' */
  var typeKey: js.UndefOr[String] = js.undefined
  /**
    * Determines whether a type set to a POJO becomes
    * a Mixed path or a Subdocument (defaults to true).
    */
  var typePojoToMixed: js.UndefOr[Boolean] = js.undefined
  /** defaults to false */
  var useNestedStrict: js.UndefOr[Boolean] = js.undefined
  /** defaults to false */
  var usePushEach: js.UndefOr[Boolean] = js.undefined
  /** defaults to true */
  var validateBeforeSave: js.UndefOr[Boolean] = js.undefined
  /** defaults to "__v" */
  var versionKey: js.UndefOr[String | Boolean] = js.undefined
  var writeConcern: js.UndefOr[WriteConcern] = js.undefined
}

object SchemaOptions {
  @scala.inline
  def apply(
    _id: js.UndefOr[Boolean] = js.undefined,
    autoIndex: js.UndefOr[Boolean] = js.undefined,
    bufferCommands: js.UndefOr[Boolean] = js.undefined,
    capped: Boolean | Double | AnonAutoIndexId = null,
    collation: CollationOptions = null,
    collection: String = null,
    discriminatorKey: String = null,
    emitIndexErrors: js.UndefOr[Boolean] = js.undefined,
    excludeIndexes: js.Any = null,
    id: js.UndefOr[Boolean] = js.undefined,
    minimize: js.UndefOr[Boolean] = js.undefined,
    read: String = null,
    safe: Boolean | AnonJ = null,
    selectPopulatedPaths: js.UndefOr[Boolean] = js.undefined,
    shardKey: js.Object = null,
    skipVersioning: js.Any = null,
    storeSubdocValidationError: js.UndefOr[Boolean] = js.undefined,
    strict: Boolean | `throw` = null,
    timestamps: Boolean | SchemaTimestampsConfig = null,
    toJSON: DocumentToObjectOptions = null,
    toObject: DocumentToObjectOptions = null,
    typeKey: String = null,
    typePojoToMixed: js.UndefOr[Boolean] = js.undefined,
    useNestedStrict: js.UndefOr[Boolean] = js.undefined,
    usePushEach: js.UndefOr[Boolean] = js.undefined,
    validateBeforeSave: js.UndefOr[Boolean] = js.undefined,
    versionKey: String | Boolean = null,
    writeConcern: WriteConcern = null
  ): SchemaOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(_id)) __obj.updateDynamic("_id")(_id.asInstanceOf[js.Any])
    if (!js.isUndefined(autoIndex)) __obj.updateDynamic("autoIndex")(autoIndex.asInstanceOf[js.Any])
    if (!js.isUndefined(bufferCommands)) __obj.updateDynamic("bufferCommands")(bufferCommands.asInstanceOf[js.Any])
    if (capped != null) __obj.updateDynamic("capped")(capped.asInstanceOf[js.Any])
    if (collation != null) __obj.updateDynamic("collation")(collation.asInstanceOf[js.Any])
    if (collection != null) __obj.updateDynamic("collection")(collection.asInstanceOf[js.Any])
    if (discriminatorKey != null) __obj.updateDynamic("discriminatorKey")(discriminatorKey.asInstanceOf[js.Any])
    if (!js.isUndefined(emitIndexErrors)) __obj.updateDynamic("emitIndexErrors")(emitIndexErrors.asInstanceOf[js.Any])
    if (excludeIndexes != null) __obj.updateDynamic("excludeIndexes")(excludeIndexes.asInstanceOf[js.Any])
    if (!js.isUndefined(id)) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (!js.isUndefined(minimize)) __obj.updateDynamic("minimize")(minimize.asInstanceOf[js.Any])
    if (read != null) __obj.updateDynamic("read")(read.asInstanceOf[js.Any])
    if (safe != null) __obj.updateDynamic("safe")(safe.asInstanceOf[js.Any])
    if (!js.isUndefined(selectPopulatedPaths)) __obj.updateDynamic("selectPopulatedPaths")(selectPopulatedPaths.asInstanceOf[js.Any])
    if (shardKey != null) __obj.updateDynamic("shardKey")(shardKey.asInstanceOf[js.Any])
    if (skipVersioning != null) __obj.updateDynamic("skipVersioning")(skipVersioning.asInstanceOf[js.Any])
    if (!js.isUndefined(storeSubdocValidationError)) __obj.updateDynamic("storeSubdocValidationError")(storeSubdocValidationError.asInstanceOf[js.Any])
    if (strict != null) __obj.updateDynamic("strict")(strict.asInstanceOf[js.Any])
    if (timestamps != null) __obj.updateDynamic("timestamps")(timestamps.asInstanceOf[js.Any])
    if (toJSON != null) __obj.updateDynamic("toJSON")(toJSON.asInstanceOf[js.Any])
    if (toObject != null) __obj.updateDynamic("toObject")(toObject.asInstanceOf[js.Any])
    if (typeKey != null) __obj.updateDynamic("typeKey")(typeKey.asInstanceOf[js.Any])
    if (!js.isUndefined(typePojoToMixed)) __obj.updateDynamic("typePojoToMixed")(typePojoToMixed.asInstanceOf[js.Any])
    if (!js.isUndefined(useNestedStrict)) __obj.updateDynamic("useNestedStrict")(useNestedStrict.asInstanceOf[js.Any])
    if (!js.isUndefined(usePushEach)) __obj.updateDynamic("usePushEach")(usePushEach.asInstanceOf[js.Any])
    if (!js.isUndefined(validateBeforeSave)) __obj.updateDynamic("validateBeforeSave")(validateBeforeSave.asInstanceOf[js.Any])
    if (versionKey != null) __obj.updateDynamic("versionKey")(versionKey.asInstanceOf[js.Any])
    if (writeConcern != null) __obj.updateDynamic("writeConcern")(writeConcern.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaOptions]
  }
}

