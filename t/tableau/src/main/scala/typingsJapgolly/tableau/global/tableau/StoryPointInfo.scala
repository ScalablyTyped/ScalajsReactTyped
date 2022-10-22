package typingsJapgolly.tableau.global.tableau

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("tableau.StoryPointInfo")
@js.native
open class StoryPointInfo ()
  extends StObject
     with typingsJapgolly.tableau.tableau.StoryPointInfo {
  
  /** Gets the content of the textual description for this story point. */
  /* CompleteClass */
  override def getCaption(): String = js.native
  
  /** Gets the zero-based index of this story point within the parent Story sheet. */
  /* CompleteClass */
  override def getIndex(): Double = js.native
  
  /** Gets a value indicating whether the story point is the currently active point in the story. */
  /* CompleteClass */
  override def getIsActive(): Boolean = js.native
  
  /** Gets a value indicating whether the story point is updated, meaning that there are no changes from the last time the story point was “captured”. */
  /* CompleteClass */
  override def getIsUpdated(): Boolean = js.native
  
  /** Gets the Story object that contains the story point. */
  /* CompleteClass */
  override def getParentStory(): typingsJapgolly.tableau.tableau.Story = js.native
}
