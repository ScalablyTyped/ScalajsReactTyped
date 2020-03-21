package typingsJapgolly.burns

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  /**
    * Type Alias for event handlers
    */
  type EventHandler = typingsJapgolly.burns.mod.Handlers | (typingsJapgolly.std.Record[java.lang.String, typingsJapgolly.burns.mod.Handlers])
  /**
    * Function type for handling events
    */
  type HandlerFn = js.Function1[/* payload */ js.UndefOr[js.Any], js.Any]
  /**
    * This Type is an alias to the multiple
    * parameter types the `registerEvent` method accepts
    */
  type Handlers = java.lang.String | typingsJapgolly.burns.mod.HandlerFn | js.Array[typingsJapgolly.burns.mod.HandlerFn]
}
