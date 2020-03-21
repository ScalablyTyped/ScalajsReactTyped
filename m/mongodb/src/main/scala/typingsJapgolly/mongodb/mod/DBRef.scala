package typingsJapgolly.mongodb.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("mongodb", "DBRef")
@js.native
class DBRef protected ()
  extends typingsJapgolly.bson.mod.DBRef {
  /**
    * @param namespace The collection name.
    * @param oid The reference ObjectId.
    * @param db Optional db name, if omitted the reference is local to the current db
    */
  def this(namespace: String, oid: typingsJapgolly.bson.mod.ObjectId) = this()
  def this(namespace: String, oid: typingsJapgolly.bson.mod.ObjectId, db: String) = this()
}

