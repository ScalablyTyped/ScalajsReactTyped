package typingsJapgolly.getFolderSize

import typingsJapgolly.std.Error
import typingsJapgolly.std.RegExp
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("get-folder-size", JSImport.Namespace)
@js.native
object mod extends js.Object {
  def apply(folder: String, callback: js.Function2[/* err */ Error | Null, /* size */ Double, Unit]): Unit = js.native
  def apply(
    folder: String,
    regexIgnorePattern: RegExp,
    callback: js.Function2[/* err */ js.Error | Null, /* size */ Double, Unit]
  ): Unit = js.native
}

