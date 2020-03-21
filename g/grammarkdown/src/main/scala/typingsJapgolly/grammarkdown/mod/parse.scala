package typingsJapgolly.grammarkdown.mod

import typingsJapgolly.grammarkdown.optionsMod.KnownOptions
import typingsJapgolly.grammarkdown.optionsMod.ParsedArguments
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("grammarkdown", "parse")
@js.native
object parse extends js.Object {
  def apply[T /* <: ParsedArguments */](options: KnownOptions): js.UndefOr[T] = js.native
  def apply[T /* <: ParsedArguments */](options: KnownOptions, args: js.Array[String]): js.UndefOr[T] = js.native
}

