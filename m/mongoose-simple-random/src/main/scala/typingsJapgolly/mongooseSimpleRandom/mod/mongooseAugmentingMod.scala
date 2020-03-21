package typingsJapgolly.mongooseSimpleRandom.mod

import typingsJapgolly.mongoose.mod.ModelProperties
import typingsJapgolly.node.NodeJS.EventEmitter
import typingsJapgolly.std.Document_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* augmented module */
@JSImport("mongoose", JSImport.Namespace)
@js.native
object mongooseAugmentingMod extends js.Object {
  @js.native
  trait Model[T /* <: Document_ */]
    extends EventEmitter
       with ModelProperties {
    def findRandom(conditions: js.Object): Unit = js.native
    def findRandom(conditions: js.Object, projection: js.Object): Unit = js.native
    def findRandom(conditions: js.Object, projection: js.Object, options: js.Object): Unit = js.native
    def findRandom(
      conditions: js.Object,
      projection: js.Object,
      options: js.Object,
      callback: js.Function2[/* err */ js.Any, /* res */ js.UndefOr[js.Array[T]], Unit]
    ): Unit = js.native
    def findRandom(
      conditions: js.Object,
      projection: js.Object,
      options: Null,
      callback: js.Function2[/* err */ js.Any, /* res */ js.UndefOr[js.Array[T]], Unit]
    ): Unit = js.native
    def findRandom(conditions: js.Object, projection: Null, options: js.Object): Unit = js.native
    def findRandom(
      conditions: js.Object,
      projection: Null,
      options: js.Object,
      callback: js.Function2[/* err */ js.Any, /* res */ js.UndefOr[js.Array[T]], Unit]
    ): Unit = js.native
    def findRandom(
      conditions: js.Object,
      projection: Null,
      options: Null,
      callback: js.Function2[/* err */ js.Any, /* res */ js.UndefOr[js.Array[T]], Unit]
    ): Unit = js.native
  }
  
}

