package typingsJapgolly.grammarkdown.coreMod

import typingsJapgolly.std.Map
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("grammarkdown/dist/core", "mapFromObject")
@js.native
object mapFromObject extends js.Object {
  def apply[T](`object`: DictionaryLike[T]): Map[String, T] = js.native
}

