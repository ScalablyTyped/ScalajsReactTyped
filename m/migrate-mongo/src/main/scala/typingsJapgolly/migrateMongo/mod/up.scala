package typingsJapgolly.migrateMongo.mod

import typingsJapgolly.mongodb.mod.Db
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("migrate-mongo", "up")
@js.native
object up extends js.Object {
  def apply(db: Db): js.Promise[js.Array[String]] = js.native
}

