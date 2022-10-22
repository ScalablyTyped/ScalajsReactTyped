package typingsJapgolly.tableau.global.tableau

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("tableau.StoryPointSwitchEvent")
@js.native
open class StoryPointSwitchEvent ()
  extends StObject
     with typingsJapgolly.tableau.tableau.StoryPointSwitchEvent {
  
  /** Gets the name of the event, which is a string, but is also one of the items in the TableauEventName enum. */
  /* CompleteClass */
  override def getEventName(): typingsJapgolly.tableau.tableau.TableauEventName = js.native
  
  /** Gets the StoryPoint that is currently active. */
  /* CompleteClass */
  override def getNewStoryPoint(): typingsJapgolly.tableau.tableau.StoryPoint = js.native
  
  /**
    * Gets the StoryPointInfo that was active before the story point switch event occurred.
    * The returned object reflects the state of the story point before the switch occurred.
    * The returned object reflects the state of the story point after the switch occured.
    */
  /* CompleteClass */
  override def getOldStoryPointInfo(): typingsJapgolly.tableau.tableau.StoryPointInfo = js.native
  
  /** Gets the Viz object associated with the event. */
  /* CompleteClass */
  override def getViz(): typingsJapgolly.tableau.tableau.Viz = js.native
}
