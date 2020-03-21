package typingsJapgolly.mongooseAutoIncrement

import typingsJapgolly.mongoose.mod.Connection_
import typingsJapgolly.mongoose.mod.Schema
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("mongoose-auto-increment", JSImport.Namespace)
@js.native
object mod extends js.Object {
  /**
    * Initialize plugin by creating counter collection in database.
    */
  def initialize(connection: Connection_): Unit = js.native
  /**
    * The function to use when invoking the plugin on a custom schema.
    */
  def plugin(schema: Schema[_], options: js.Object): Unit = js.native
}

