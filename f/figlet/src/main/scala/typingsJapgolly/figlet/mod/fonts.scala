package typingsJapgolly.figlet.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("figlet", "fonts")
@js.native
object fonts extends js.Object {
  /**
    * @warn
    * This method exists in node environment only.
    * In browser environment, this method does not exist.
    */
  def apply(cb: js.Function2[/* error */ js.Error | Null, /* fontList */ js.UndefOr[js.Array[Fonts_]], Unit]): Unit = js.native
}

