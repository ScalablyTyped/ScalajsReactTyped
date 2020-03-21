package typingsJapgolly.sequelize.mod

import typingsJapgolly.sequelize.AnonLogging
import typingsJapgolly.sequelize.AnonSchema
import typingsJapgolly.sequelize.AnonSchemaTableName
import typingsJapgolly.sequelize.AnonTableName
import typingsJapgolly.sequelize.DefineIndexOptionsfieldsA
import typingsJapgolly.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The interface that Sequelize uses to talk to all databases.
  *
  * This interface is available through sequelize.QueryInterface. It should not be commonly used, but it's
  * referenced anyway, so it can be used.
  */
@js.native
trait QueryInterface extends js.Object {
  /**
    * Returns the dialect-specific sql generator.
    *
    * We don't have a definition for the QueryGenerator, because I doubt it is commonly in use separately.
    */
  var QueryGenerator: js.Any = js.native
  /**
    * Returns the current sequelize instance.
    */
  var sequelize: Sequelize = js.native
  def addColumn(tableName: String, key: String, attribute: DataTypeAbstract): typingsJapgolly.bluebird.mod.^[Unit] = js.native
  def addColumn(tableName: String, key: String, attribute: DataTypeAbstract, options: QueryInterfaceOptions): typingsJapgolly.bluebird.mod.^[Unit] = js.native
  /**
    * Adds a new column to a table
    */
  def addColumn(tableName: String, key: String, attribute: DefineAttributeColumnOptions): typingsJapgolly.bluebird.mod.^[Unit] = js.native
  def addColumn(
    tableName: String,
    key: String,
    attribute: DefineAttributeColumnOptions,
    options: QueryInterfaceOptions
  ): typingsJapgolly.bluebird.mod.^[Unit] = js.native
  def addColumn(tableName: AnonTableName, key: String, attribute: DataTypeAbstract): typingsJapgolly.bluebird.mod.^[Unit] = js.native
  def addColumn(tableName: AnonTableName, key: String, attribute: DataTypeAbstract, options: QueryInterfaceOptions): typingsJapgolly.bluebird.mod.^[Unit] = js.native
  def addColumn(tableName: AnonTableName, key: String, attribute: DefineAttributeColumnOptions): typingsJapgolly.bluebird.mod.^[Unit] = js.native
  def addColumn(
    tableName: AnonTableName,
    key: String,
    attribute: DefineAttributeColumnOptions,
    options: QueryInterfaceOptions
  ): typingsJapgolly.bluebird.mod.^[Unit] = js.native
  /**
    * Adds constraints to a table
    */
  def addConstraint(tableName: String, attributes: js.Array[String]): typingsJapgolly.bluebird.mod.^[Unit] = js.native
  def addConstraint(tableName: String, attributes: js.Array[String], options: AddConstraintOptions): typingsJapgolly.bluebird.mod.^[Unit] = js.native
  def addConstraint(tableName: String, attributes: js.Array[String], options: QueryInterfaceOptions): typingsJapgolly.bluebird.mod.^[Unit] = js.native
  def addIndex(tableName: String, attributes: js.Array[String]): typingsJapgolly.bluebird.mod.^[Unit] = js.native
  def addIndex(tableName: String, attributes: js.Array[String], options: DefineIndexOptions): typingsJapgolly.bluebird.mod.^[Unit] = js.native
  def addIndex(tableName: String, attributes: js.Array[String], options: DefineIndexOptions, rawTablename: String): typingsJapgolly.bluebird.mod.^[Unit] = js.native
  /**
    * Adds a new index to a table
    */
  def addIndex(tableName: String, options: DefineIndexOptionsfieldsA): typingsJapgolly.bluebird.mod.^[Unit] = js.native
  def addIndex(tableName: String, options: DefineIndexOptionsfieldsA, rawTablename: String): typingsJapgolly.bluebird.mod.^[Unit] = js.native
  def addIndex(tableName: js.Object, attributes: js.Array[String]): typingsJapgolly.bluebird.mod.^[Unit] = js.native
  def addIndex(tableName: js.Object, attributes: js.Array[String], options: DefineIndexOptions): typingsJapgolly.bluebird.mod.^[Unit] = js.native
  def addIndex(
    tableName: js.Object,
    attributes: js.Array[String],
    options: DefineIndexOptions,
    rawTablename: String
  ): typingsJapgolly.bluebird.mod.^[Unit] = js.native
  def addIndex(tableName: js.Object, options: DefineIndexOptionsfieldsA): typingsJapgolly.bluebird.mod.^[Unit] = js.native
  def addIndex(tableName: js.Object, options: DefineIndexOptionsfieldsA, rawTablename: String): typingsJapgolly.bluebird.mod.^[Unit] = js.native
  /**
    * Deletes multiple rows at once
    */
  def bulkDelete(tableName: String, identifier: js.Object): typingsJapgolly.bluebird.mod.^[js.Object] = js.native
  def bulkDelete(tableName: String, identifier: js.Object, options: QueryOptions): typingsJapgolly.bluebird.mod.^[js.Object] = js.native
  def bulkDelete(tableName: String, identifier: js.Object, options: QueryOptions, model: Model[_, _, _]): typingsJapgolly.bluebird.mod.^[js.Object] = js.native
  /**
    * Inserts multiple records at once
    */
  def bulkInsert(tableName: String, records: js.Array[js.Object]): typingsJapgolly.bluebird.mod.^[js.Object] = js.native
  def bulkInsert(tableName: String, records: js.Array[js.Object], options: QueryOptions): typingsJapgolly.bluebird.mod.^[js.Object] = js.native
  def bulkInsert(tableName: String, records: js.Array[js.Object], options: QueryOptions, attributes: String): typingsJapgolly.bluebird.mod.^[js.Object] = js.native
  def bulkInsert(
    tableName: String,
    records: js.Array[js.Object],
    options: QueryOptions,
    attributes: js.Array[String]
  ): typingsJapgolly.bluebird.mod.^[js.Object] = js.native
  def bulkInsert(tableName: AnonSchemaTableName, records: js.Array[js.Object]): typingsJapgolly.bluebird.mod.^[js.Object] = js.native
  def bulkInsert(tableName: AnonSchemaTableName, records: js.Array[js.Object], options: QueryOptions): typingsJapgolly.bluebird.mod.^[js.Object] = js.native
  def bulkInsert(
    tableName: AnonSchemaTableName,
    records: js.Array[js.Object],
    options: QueryOptions,
    attributes: String
  ): typingsJapgolly.bluebird.mod.^[js.Object] = js.native
  def bulkInsert(
    tableName: AnonSchemaTableName,
    records: js.Array[js.Object],
    options: QueryOptions,
    attributes: js.Array[String]
  ): typingsJapgolly.bluebird.mod.^[js.Object] = js.native
  /**
    * Updates multiple rows at once
    */
  def bulkUpdate(tableName: String, values: js.Object, identifier: js.Object): typingsJapgolly.bluebird.mod.^[js.Object] = js.native
  def bulkUpdate(tableName: String, values: js.Object, identifier: js.Object, options: QueryOptions): typingsJapgolly.bluebird.mod.^[js.Object] = js.native
  def bulkUpdate(
    tableName: String,
    values: js.Object,
    identifier: js.Object,
    options: QueryOptions,
    attributes: String
  ): typingsJapgolly.bluebird.mod.^[js.Object] = js.native
  def bulkUpdate(
    tableName: String,
    values: js.Object,
    identifier: js.Object,
    options: QueryOptions,
    attributes: js.Array[String]
  ): typingsJapgolly.bluebird.mod.^[js.Object] = js.native
  /**
    * Changes a column
    */
  def changeColumn(tableName: String, attributeName: String): typingsJapgolly.bluebird.mod.^[Unit] = js.native
  def changeColumn(tableName: String, attributeName: String, dataTypeOrOptions: String): typingsJapgolly.bluebird.mod.^[Unit] = js.native
  def changeColumn(
    tableName: String,
    attributeName: String,
    dataTypeOrOptions: String,
    options: QueryInterfaceOptions
  ): typingsJapgolly.bluebird.mod.^[Unit] = js.native
  def changeColumn(tableName: String, attributeName: String, dataTypeOrOptions: DataTypeAbstract): typingsJapgolly.bluebird.mod.^[Unit] = js.native
  def changeColumn(
    tableName: String,
    attributeName: String,
    dataTypeOrOptions: DataTypeAbstract,
    options: QueryInterfaceOptions
  ): typingsJapgolly.bluebird.mod.^[Unit] = js.native
  def changeColumn(tableName: String, attributeName: String, dataTypeOrOptions: DefineAttributeColumnOptions): typingsJapgolly.bluebird.mod.^[Unit] = js.native
  def changeColumn(
    tableName: String,
    attributeName: String,
    dataTypeOrOptions: DefineAttributeColumnOptions,
    options: QueryInterfaceOptions
  ): typingsJapgolly.bluebird.mod.^[Unit] = js.native
  def changeColumn(tableName: AnonSchema, attributeName: String): typingsJapgolly.bluebird.mod.^[Unit] = js.native
  def changeColumn(tableName: AnonSchema, attributeName: String, dataTypeOrOptions: String): typingsJapgolly.bluebird.mod.^[Unit] = js.native
  def changeColumn(
    tableName: AnonSchema,
    attributeName: String,
    dataTypeOrOptions: String,
    options: QueryInterfaceOptions
  ): typingsJapgolly.bluebird.mod.^[Unit] = js.native
  def changeColumn(tableName: AnonSchema, attributeName: String, dataTypeOrOptions: DataTypeAbstract): typingsJapgolly.bluebird.mod.^[Unit] = js.native
  def changeColumn(
    tableName: AnonSchema,
    attributeName: String,
    dataTypeOrOptions: DataTypeAbstract,
    options: QueryInterfaceOptions
  ): typingsJapgolly.bluebird.mod.^[Unit] = js.native
  def changeColumn(tableName: AnonSchema, attributeName: String, dataTypeOrOptions: DefineAttributeColumnOptions): typingsJapgolly.bluebird.mod.^[Unit] = js.native
  def changeColumn(
    tableName: AnonSchema,
    attributeName: String,
    dataTypeOrOptions: DefineAttributeColumnOptions,
    options: QueryInterfaceOptions
  ): typingsJapgolly.bluebird.mod.^[Unit] = js.native
  /**
    * Commit an already started transaction
    */
  def commitTransaction(transaction: Transaction): typingsJapgolly.bluebird.mod.^[Unit] = js.native
  def commitTransaction(transaction: Transaction, options: QueryOptions): typingsJapgolly.bluebird.mod.^[Unit] = js.native
  /**
    * Postgres only. Create a function
    */
  def createFunction(functionName: String, params: js.Array[_], returnType: String, language: String, body: String): typingsJapgolly.bluebird.mod.^[Unit] = js.native
  def createFunction(
    functionName: String,
    params: js.Array[_],
    returnType: String,
    language: String,
    body: String,
    options: QueryOptions
  ): typingsJapgolly.bluebird.mod.^[Unit] = js.native
  /**
    * Queries the schema (table list).
    *
    * @param schema The schema to query. Applies only to Postgres.
    */
  def createSchema(): typingsJapgolly.bluebird.mod.^[Unit] = js.native
  def createSchema(schema: String): typingsJapgolly.bluebird.mod.^[Unit] = js.native
  def createSchema(schema: String, options: QueryInterfaceOptions): typingsJapgolly.bluebird.mod.^[Unit] = js.native
  /**
    * Creates a table with specified attributes.
    *
    * @param tableName     Name of table to create
    * @param attributes    Hash of attributes, key is attribute name, value is data type
    * @param options       Query options.
    */
  def createTable(tableName: String, attributes: DefineAttributes): typingsJapgolly.bluebird.mod.^[Unit] = js.native
  def createTable(tableName: String, attributes: DefineAttributes, options: QueryOptions): typingsJapgolly.bluebird.mod.^[Unit] = js.native
  def createTable(tableName: AnonSchema, attributes: DefineAttributes): typingsJapgolly.bluebird.mod.^[Unit] = js.native
  def createTable(tableName: AnonSchema, attributes: DefineAttributes, options: QueryOptions): typingsJapgolly.bluebird.mod.^[Unit] = js.native
  /**
    * Postgres only. Creates a trigger on specified table to call the specified function with supplied
    * parameters.
    */
  def createTrigger(
    tableName: String,
    triggerName: String,
    timingType: String,
    fireOnArray: js.Array[_],
    functionName: String,
    functionParams: js.Array[_],
    optionsArray: js.Array[String]
  ): typingsJapgolly.bluebird.mod.^[Unit] = js.native
  def createTrigger(
    tableName: String,
    triggerName: String,
    timingType: String,
    fireOnArray: js.Array[_],
    functionName: String,
    functionParams: js.Array[_],
    optionsArray: js.Array[String],
    options: QueryInterfaceOptions
  ): typingsJapgolly.bluebird.mod.^[Unit] = js.native
  /**
    * Return database version
    */
  def databaseVersion(): typingsJapgolly.bluebird.mod.^[String] = js.native
  def databaseVersion(options: QueryInterfaceOptions): typingsJapgolly.bluebird.mod.^[String] = js.native
  /**
    * Defer constraints
    */
  def deferConstraints(transaction: Transaction): typingsJapgolly.bluebird.mod.^[Unit] = js.native
  def deferConstraints(transaction: Transaction, options: QueryOptions): typingsJapgolly.bluebird.mod.^[Unit] = js.native
  /**
    * Deletes a row
    */
  def delete(instance: Instance[_], tableName: String, identifier: js.Object): typingsJapgolly.bluebird.mod.^[js.Object] = js.native
  def delete(instance: Instance[_], tableName: String, identifier: js.Object, options: QueryOptions): typingsJapgolly.bluebird.mod.^[js.Object] = js.native
  /**
    * Describe a table
    */
  def describeTable(tableName: String): typingsJapgolly.bluebird.mod.^[js.Object] = js.native
  def describeTable(tableName: String, options: String): typingsJapgolly.bluebird.mod.^[js.Object] = js.native
  def describeTable(tableName: String, options: AnonLogging): typingsJapgolly.bluebird.mod.^[js.Object] = js.native
  def describeTable(tableName: AnonSchema): typingsJapgolly.bluebird.mod.^[js.Object] = js.native
  def describeTable(tableName: AnonSchema, options: String): typingsJapgolly.bluebird.mod.^[js.Object] = js.native
  def describeTable(tableName: AnonSchema, options: AnonLogging): typingsJapgolly.bluebird.mod.^[js.Object] = js.native
  /**
    * Drops all defined enums
    *
    * @param options
    */
  def dropAllEnums(): typingsJapgolly.bluebird.mod.^[Unit] = js.native
  def dropAllEnums(options: QueryOptions): typingsJapgolly.bluebird.mod.^[Unit] = js.native
  /**
    * Drops all tables.
    */
  def dropAllSchemas(): typingsJapgolly.bluebird.mod.^[Unit] = js.native
  def dropAllSchemas(options: QueryInterfaceOptions): typingsJapgolly.bluebird.mod.^[Unit] = js.native
  /**
    * Drops all tables.
    *
    * @param options
    */
  def dropAllTables(): typingsJapgolly.bluebird.mod.^[Unit] = js.native
  def dropAllTables(options: QueryOptions): typingsJapgolly.bluebird.mod.^[Unit] = js.native
  /**
    * Postgres only. Drops a function
    */
  def dropFunction(functionName: String, params: js.Array[_]): typingsJapgolly.bluebird.mod.^[Unit] = js.native
  def dropFunction(functionName: String, params: js.Array[_], options: QueryInterfaceOptions): typingsJapgolly.bluebird.mod.^[Unit] = js.native
  /**
    * Drops the specified schema (table).
    *
    * @param schema The schema to query. Applies only to Postgres.
    */
  def dropSchema(): typingsJapgolly.bluebird.mod.^[Unit] = js.native
  def dropSchema(schema: String): typingsJapgolly.bluebird.mod.^[Unit] = js.native
  def dropSchema(schema: String, options: QueryInterfaceOptions): typingsJapgolly.bluebird.mod.^[Unit] = js.native
  /**
    * Drops the specified table.
    *
    * @param tableName Table name.
    * @param options   Query options, particularly "force".
    */
  def dropTable(tableName: String): typingsJapgolly.bluebird.mod.^[Unit] = js.native
  def dropTable(tableName: String, options: QueryOptions): typingsJapgolly.bluebird.mod.^[Unit] = js.native
  /**
    * Postgres only. Drops the specified trigger.
    */
  def dropTrigger(tableName: String, triggerName: String): typingsJapgolly.bluebird.mod.^[Unit] = js.native
  def dropTrigger(tableName: String, triggerName: String, options: QueryInterfaceOptions): typingsJapgolly.bluebird.mod.^[Unit] = js.native
  /**
    * Escape a value (e.g. a string, number or date)
    */
  def escape(): String = js.native
  def escape(value: String): String = js.native
  def escape(value: Double): String = js.native
  def escape(value: Date): String = js.native
  /**
    * Returns all foreign key constraints of each table in list
    */
  def getForeignKeysForTables(tableNames: js.Array[String]): typingsJapgolly.bluebird.mod.^[js.Object] = js.native
  def getForeignKeysForTables(tableNames: js.Array[String], options: QueryInterfaceOptions): typingsJapgolly.bluebird.mod.^[js.Object] = js.native
  /**
    * Increments a row value
    */
  def increment(instance: Instance[_], tableName: String, values: js.Object, identifier: js.Object): typingsJapgolly.bluebird.mod.^[js.Object] = js.native
  def increment(
    instance: Instance[_],
    tableName: String,
    values: js.Object,
    identifier: js.Object,
    options: QueryOptions
  ): typingsJapgolly.bluebird.mod.^[js.Object] = js.native
  /**
    * Inserts a new record
    */
  def insert(instance: Instance[_], tableName: String, values: js.Object): typingsJapgolly.bluebird.mod.^[js.Object] = js.native
  def insert(instance: Instance[_], tableName: String, values: js.Object, options: QueryOptions): typingsJapgolly.bluebird.mod.^[js.Object] = js.native
  /**
    * Put a name to an index
    */
  def nameIndexes(indexes: js.Array[String], rawTablename: String): typingsJapgolly.bluebird.mod.^[Unit] = js.native
  /**
    * Escape an identifier (e.g. a table or attribute name). If force is true, the identifier will be quoted
    * even if the `quoteIdentifiers` option is false.
    */
  def quoteIdentifier(identifier: String, force: Boolean): String = js.native
  /**
    * Split an identifier into .-separated tokens and quote each part. If force is true, the identifier will be
    * quoted even if the `quoteIdentifiers` option is false.
    */
  def quoteIdentifiers(identifiers: String, force: Boolean): String = js.native
  /**
    * Escape a table name
    */
  def quoteTable(identifier: String): String = js.native
  /**
    * Selects raw without parsing the string into an object
    */
  def rawSelect(tableName: String, options: QueryOptions, attributeSelector: String): typingsJapgolly.bluebird.mod.^[js.Array[String]] = js.native
  def rawSelect(tableName: String, options: QueryOptions, attributeSelector: String, model: Model[_, _, _]): typingsJapgolly.bluebird.mod.^[js.Array[String]] = js.native
  def rawSelect(tableName: String, options: QueryOptions, attributeSelector: js.Array[String]): typingsJapgolly.bluebird.mod.^[js.Array[String]] = js.native
  def rawSelect(
    tableName: String,
    options: QueryOptions,
    attributeSelector: js.Array[String],
    model: Model[_, _, _]
  ): typingsJapgolly.bluebird.mod.^[js.Array[String]] = js.native
  /**
    * Removes a column from a table
    */
  def removeColumn(tableName: String, attribute: String): typingsJapgolly.bluebird.mod.^[Unit] = js.native
  def removeColumn(tableName: String, attribute: String, options: QueryInterfaceOptions): typingsJapgolly.bluebird.mod.^[Unit] = js.native
  def removeColumn(tableName: AnonTableName, attribute: String): typingsJapgolly.bluebird.mod.^[Unit] = js.native
  def removeColumn(tableName: AnonTableName, attribute: String, options: QueryInterfaceOptions): typingsJapgolly.bluebird.mod.^[Unit] = js.native
  /**
    * Removes constraints from a table
    */
  def removeConstraint(tableName: String, constraintName: String): typingsJapgolly.bluebird.mod.^[Unit] = js.native
  def removeConstraint(tableName: String, constraintName: String, options: QueryInterfaceOptions): typingsJapgolly.bluebird.mod.^[Unit] = js.native
  def removeIndex(tableName: String, indexNameOrAttributes: String): typingsJapgolly.bluebird.mod.^[Unit] = js.native
  def removeIndex(tableName: String, indexNameOrAttributes: String, options: QueryInterfaceOptions): typingsJapgolly.bluebird.mod.^[Unit] = js.native
  /**
    * Removes an index of a table
    */
  def removeIndex(tableName: String, indexNameOrAttributes: js.Array[String]): typingsJapgolly.bluebird.mod.^[Unit] = js.native
  def removeIndex(tableName: String, indexNameOrAttributes: js.Array[String], options: QueryInterfaceOptions): typingsJapgolly.bluebird.mod.^[Unit] = js.native
  /**
    * Renames a column
    */
  def renameColumn(tableName: String, attrNameBefore: String, attrNameAfter: String): typingsJapgolly.bluebird.mod.^[Unit] = js.native
  def renameColumn(tableName: String, attrNameBefore: String, attrNameAfter: String, options: QueryInterfaceOptions): typingsJapgolly.bluebird.mod.^[Unit] = js.native
  def renameColumn(tableName: AnonSchema, attrNameBefore: String, attrNameAfter: String): typingsJapgolly.bluebird.mod.^[Unit] = js.native
  def renameColumn(
    tableName: AnonSchema,
    attrNameBefore: String,
    attrNameAfter: String,
    options: QueryInterfaceOptions
  ): typingsJapgolly.bluebird.mod.^[Unit] = js.native
  /**
    * Postgres only. Rename a function
    */
  def renameFunction(oldFunctionName: String, params: js.Array[_], newFunctionName: String): typingsJapgolly.bluebird.mod.^[Unit] = js.native
  def renameFunction(
    oldFunctionName: String,
    params: js.Array[_],
    newFunctionName: String,
    options: QueryInterfaceOptions
  ): typingsJapgolly.bluebird.mod.^[Unit] = js.native
  /**
    * Renames a table
    */
  def renameTable(before: String, after: String): typingsJapgolly.bluebird.mod.^[Unit] = js.native
  def renameTable(before: String, after: String, options: QueryInterfaceOptions): typingsJapgolly.bluebird.mod.^[Unit] = js.native
  /**
    * Postgres only. Renames a trigger
    */
  def renameTrigger(tableName: String, oldTriggerName: String, newTriggerName: String): typingsJapgolly.bluebird.mod.^[Unit] = js.native
  def renameTrigger(tableName: String, oldTriggerName: String, newTriggerName: String, options: QueryInterfaceOptions): typingsJapgolly.bluebird.mod.^[Unit] = js.native
  /**
    * Rollback ( revert ) a transaction that has'nt been commited
    */
  def rollbackTransaction(transaction: Transaction): typingsJapgolly.bluebird.mod.^[Unit] = js.native
  def rollbackTransaction(transaction: Transaction, options: QueryOptions): typingsJapgolly.bluebird.mod.^[Unit] = js.native
  /**
    * Returns selected rows
    */
  def select(model: Model[_, _, _], tableName: String): typingsJapgolly.bluebird.mod.^[js.Array[js.Object]] = js.native
  def select(model: Model[_, _, _], tableName: String, options: QueryOptions): typingsJapgolly.bluebird.mod.^[js.Array[js.Object]] = js.native
  /**
    * Set option for autocommit of a transaction
    */
  def setAutocommit(transaction: Transaction, value: Boolean): typingsJapgolly.bluebird.mod.^[Unit] = js.native
  def setAutocommit(transaction: Transaction, value: Boolean, options: QueryOptions): typingsJapgolly.bluebird.mod.^[Unit] = js.native
  /**
    * Set the isolation level of a transaction
    */
  def setIsolationLevel(transaction: Transaction, value: String): typingsJapgolly.bluebird.mod.^[Unit] = js.native
  def setIsolationLevel(transaction: Transaction, value: String, options: QueryOptions): typingsJapgolly.bluebird.mod.^[Unit] = js.native
  /**
    * Queries all table names in the database.
    *
    * @param options
    */
  def showAllSchemas(): typingsJapgolly.bluebird.mod.^[js.Object] = js.native
  def showAllSchemas(options: QueryOptions): typingsJapgolly.bluebird.mod.^[js.Object] = js.native
  /**
    * Returns all tables
    */
  def showAllTables(): typingsJapgolly.bluebird.mod.^[js.Array[String]] = js.native
  def showAllTables(options: QueryOptions): typingsJapgolly.bluebird.mod.^[js.Array[String]] = js.native
  /**
    * Shows the index of a table
    */
  def showIndex(tableName: String): typingsJapgolly.bluebird.mod.^[js.Object] = js.native
  def showIndex(tableName: String, options: QueryOptions): typingsJapgolly.bluebird.mod.^[js.Object] = js.native
  def showIndex(tableName: js.Object): typingsJapgolly.bluebird.mod.^[js.Object] = js.native
  def showIndex(tableName: js.Object, options: QueryOptions): typingsJapgolly.bluebird.mod.^[js.Object] = js.native
  /**
    * Begin a new transaction
    */
  def startTransaction(transaction: Transaction): typingsJapgolly.bluebird.mod.^[Unit] = js.native
  def startTransaction(transaction: Transaction, options: QueryOptions): typingsJapgolly.bluebird.mod.^[Unit] = js.native
  /**
    * Updates a row
    */
  def update(instance: Instance[_], tableName: String, values: js.Object, identifier: js.Object): typingsJapgolly.bluebird.mod.^[js.Object] = js.native
  def update(
    instance: Instance[_],
    tableName: String,
    values: js.Object,
    identifier: js.Object,
    options: QueryOptions
  ): typingsJapgolly.bluebird.mod.^[js.Object] = js.native
  /**
    * Inserts or Updates a record in the database
    */
  def upsert(tableName: String, values: js.Object, updateValues: js.Object, model: Model[_, _, _]): typingsJapgolly.bluebird.mod.^[js.Object] = js.native
  def upsert(
    tableName: String,
    values: js.Object,
    updateValues: js.Object,
    model: Model[_, _, _],
    options: QueryOptions
  ): typingsJapgolly.bluebird.mod.^[js.Object] = js.native
}

