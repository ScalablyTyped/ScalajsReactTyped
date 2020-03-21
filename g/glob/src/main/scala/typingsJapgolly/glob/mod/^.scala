package typingsJapgolly.glob.mod

import typingsJapgolly.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("glob", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  var Glob: IGlobStatic = js.native
  var GlobSync: IGlobSyncStatic = js.native
  def apply(pattern: String, cb: js.Function2[/* err */ Error | Null, /* matches */ js.Array[String], Unit]): Unit = js.native
  def apply(
    pattern: String,
    options: IOptions,
    cb: js.Function2[/* err */ js.Error | Null, /* matches */ js.Array[String], Unit]
  ): Unit = js.native
}

