package typingsJapgolly.cliColor

import typingsJapgolly.cliColor.columnsMod.ColumnsOptions
import typingsJapgolly.cliColor.columnsMod.Data
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FnCall extends js.Object {
  def apply(data: js.Array[js.Array[_]]): String = js.native
  def apply(data: js.Array[js.Array[_]], options: ColumnsOptions): String = js.native
  def apply(data: Data): String = js.native
  def apply(data: Data, options: ColumnsOptions): String = js.native
}

