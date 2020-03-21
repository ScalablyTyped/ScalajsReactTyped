package typingsJapgolly.fastGlob.tasksMod

import typingsJapgolly.fastGlob.entriesMod.EntryItem
import typingsJapgolly.fastGlob.optionsMod.IOptions
import typingsJapgolly.fastGlob.patternsMod.Pattern
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("fast-glob/out/managers/tasks", "generate")
@js.native
object generate extends js.Object {
  def apply(patterns: js.Array[Pattern], options: IOptions[EntryItem]): js.Array[ITask] = js.native
}

