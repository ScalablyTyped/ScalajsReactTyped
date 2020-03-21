package typingsJapgolly.migrateMongo

import typingsJapgolly.mongodb.mod.MongoCallback
import typingsJapgolly.mongodb.mod.MongoClient
import typingsJapgolly.mongodb.mod.MongoClientOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FnCallUriOptionsCallback extends js.Object {
  def apply(uri: String): js.Promise[MongoClient] = js.native
  def apply(uri: String, callback: MongoCallback[MongoClient]): Unit = js.native
  def apply(uri: String, options: MongoClientOptions): js.Promise[MongoClient] = js.native
  def apply(uri: String, options: MongoClientOptions, callback: MongoCallback[MongoClient]): Unit = js.native
}

