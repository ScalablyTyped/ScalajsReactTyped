package typingsJapgolly.mongorito.mod

import typingsJapgolly.mongodb.mod.Db
import typingsJapgolly.mongodb.mod.MongoClientOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("mongorito", "Database")
@js.native
class Database () extends js.Object {
  def this(urls: String) = this()
  def this(urls: js.Array[String]) = this()
  def this(urls: String, options: MongoClientOptions) = this()
  def this(urls: js.Array[String], options: MongoClientOptions) = this()
  var models: js.Array[ModelClass] = js.native
  var options: MongoClientOptions = js.native
  var plugins: js.Array[Plugin] = js.native
  var state: DatabaseState = js.native
  def connect(): js.Promise[Db] = js.native
  def connection(): js.Promise[Db] = js.native
  def disconnect(): js.Promise[Unit] = js.native
  def register(models: js.Array[ModelClass]): Unit = js.native
  def register(models: ModelClass): Unit = js.native
  /**
    * @see Model#use()
    */
  def use(): Unit = js.native
  def use(plugins: js.Array[Plugin]): Unit = js.native
  def use(plugins: Plugin): Unit = js.native
}

