package typingsJapgolly.conventionalChangelogWriter.mod.GeneratedContext

import typingsJapgolly.conventionalChangelogWriter.mod.CommitGroup
import typingsJapgolly.conventionalChangelogWriter.mod.NoteGroup
import typingsJapgolly.conventionalCommitsParser.mod.Commit
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ExtraContext[T /* <: Commit[String | Double | js.Symbol] */] extends js.Object {
  /**
    * @default
    * []
    */
  var commitGroups: js.Array[CommitGroup[T]]
  /**
    * @default
    * []
    */
  var noteGroups: js.Array[NoteGroup]
}

object ExtraContext {
  @scala.inline
  def apply[T /* <: Commit[String | Double | js.Symbol] */](commitGroups: js.Array[CommitGroup[T]], noteGroups: js.Array[NoteGroup]): ExtraContext[T] = {
    val __obj = js.Dynamic.literal(commitGroups = commitGroups.asInstanceOf[js.Any], noteGroups = noteGroups.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[ExtraContext[T]]
  }
}

