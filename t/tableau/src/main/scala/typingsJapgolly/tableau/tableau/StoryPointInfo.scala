package typingsJapgolly.tableau.tableau

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("tableau.StoryPointInfo")
@js.native
class StoryPointInfo () extends js.Object {
  /** Gets the content of the textual description for this story point. */
  def getCaption(): String = js.native
  /** Gets the zero-based index of this story point within the parent Story sheet. */
  def getIndex(): Double = js.native
  /** Gets a value indicating whether the story point is the currently active point in the story. */
  def getIsActive(): Boolean = js.native
  /** Gets a value indicating whether the story point is updated, meaning that there are no changes from the last time the story point was “captured”. */
  def getIsUpdated(): Boolean = js.native
  /** Gets the Story object that contains the story point. */
  def getParentStory(): Story = js.native
}

