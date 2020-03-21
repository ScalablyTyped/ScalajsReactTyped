package typingsJapgolly.umzug.mod

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.mongodb.mod.Collection
import typingsJapgolly.mongodb.mod.Db
import typingsJapgolly.mongodb.mod.DefaultSchema
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MongoDBStorageOptions extends Storage {
  /**
    * The to be used Mongo collection cursor.
    * Defaults to collection created from collectionName attribute.
    */
  var collection: js.UndefOr[Collection[DefaultSchema]] = js.undefined
  /**
    * The name of the collection used by the connection.
    * Defaults to 'migrations'
    */
  var collectionName: js.UndefOr[String] = js.undefined
  /**
    * The MongoDB database connection instance.
    */
  var connection: js.UndefOr[Db] = js.undefined
}

object MongoDBStorageOptions {
  @scala.inline
  def apply(
    executed: CallbackTo[js.Promise[js.Array[String]]],
    logMigration: String => CallbackTo[js.Promise[Unit]],
    unlogMigration: String => CallbackTo[js.Promise[Unit]],
    collection: Collection[DefaultSchema] = null,
    collectionName: String = null,
    connection: Db = null
  ): MongoDBStorageOptions = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("executed")(executed.toJsFn)
    __obj.updateDynamic("logMigration")(js.Any.fromFunction1((t0: java.lang.String) => logMigration(t0).runNow()))
    __obj.updateDynamic("unlogMigration")(js.Any.fromFunction1((t0: java.lang.String) => unlogMigration(t0).runNow()))
    if (collection != null) __obj.updateDynamic("collection")(collection.asInstanceOf[js.Any])
    if (collectionName != null) __obj.updateDynamic("collectionName")(collectionName.asInstanceOf[js.Any])
    if (connection != null) __obj.updateDynamic("connection")(connection.asInstanceOf[js.Any])
    __obj.asInstanceOf[MongoDBStorageOptions]
  }
}

