package typingsJapgolly.prettier

import typingsJapgolly.prettier.mod.CursorOptions
import typingsJapgolly.prettier.mod.CursorResult
import typingsJapgolly.prettier.mod.Options
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("prettier/standalone", JSImport.Namespace)
@js.native
object standaloneMod extends js.Object {
  def check(source: String): Boolean = js.native
  def check(source: String, options: Options): Boolean = js.native
  def format(source: String): String = js.native
  def format(source: String, options: Options): String = js.native
  def formatWithCursor(source: String, options: CursorOptions): CursorResult = js.native
}

