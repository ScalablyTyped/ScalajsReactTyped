package typingsJapgolly.tableau.global.tableau

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("tableau.ToolbarStateEvent")
@js.native
open class ToolbarStateEvent ()
  extends StObject
     with typingsJapgolly.tableau.tableau.ToolbarStateEvent {
  
  /** Gets the name of the event, which is a string, but is also one of the items in the TableauEventName enum. */
  /* CompleteClass */
  override def getEventName(): typingsJapgolly.tableau.tableau.TableauEventName = js.native
  
  /** Returns the new ToolbarState. */
  /* CompleteClass */
  override def getToolbarState(): typingsJapgolly.tableau.tableau.ToolbarState = js.native
  
  /** Gets the Viz object associated with the event. */
  /* CompleteClass */
  override def getViz(): typingsJapgolly.tableau.tableau.Viz = js.native
}
